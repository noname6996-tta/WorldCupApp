package g3.module.medialoader.callback;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

import androidx.loader.content.Loader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


import g3.module.medialoader.bean.PhotoFolder;
import g3.module.medialoader.bean.PhotoItem;
import g3.module.medialoader.bean.PhotoResult;
import g3.module.medialoader.filter.PhotoFilter;

import static android.provider.BaseColumns._ID;
import static android.provider.MediaStore.Images.ImageColumns.BUCKET_DISPLAY_NAME;
import static android.provider.MediaStore.Images.ImageColumns.BUCKET_ID;
import static android.provider.MediaStore.MediaColumns.DATA;
import static android.provider.MediaStore.MediaColumns.DATE_MODIFIED;
import static android.provider.MediaStore.MediaColumns.DISPLAY_NAME;
import static android.provider.MediaStore.MediaColumns.SIZE;

/**
 * Created by Taurus on 2017/5/23.
 */

public abstract class OnPhotoLoaderCallBack extends BaseLoaderCallBack<PhotoResult> {

    @Override
    public void onLoadFinish(Loader<Cursor> loader, Cursor data) {
        List<PhotoFolder> folders = new ArrayList<>();
        List<PhotoItem> allPhotos = new ArrayList<>();

        PhotoFilter photoFilter = new PhotoFilter();

        if (data == null) {
            onResult(new PhotoResult(folders, allPhotos));
            return;
        }
        PhotoFolder folder;
        PhotoItem item;
        while (data.moveToNext()) {
            String folderId = data.getString(data.getColumnIndexOrThrow(BUCKET_ID));
            String folderName = data.getString(data.getColumnIndexOrThrow(BUCKET_DISPLAY_NAME));
            int imageId = data.getInt(data.getColumnIndexOrThrow(_ID));
            String name = data.getString(data.getColumnIndexOrThrow(DISPLAY_NAME));
            long size = data.getLong(data.getColumnIndexOrThrow(SIZE));
            String path = data.getString(data.getColumnIndexOrThrow(DATA));
            long modified = data.getLong(data.getColumnIndexOrThrow(DATE_MODIFIED));

            if (folderName != null) {
                if (!path.contains("/.")) {
                    item = new PhotoItem(imageId, name, path, size, modified);
                    if (photoFilter.accept(new File(item.getPath()))) {
                        folder = new PhotoFolder();
                        folder.setId(folderId);
                        folder.setName(folderName);

                        if (folders.contains(folder)) {
                            folders.get(folders.indexOf(folder)).addItem(item);
                        } else {
                            folder.setCover(path);
                            folder.addItem(item);
                            folders.add(folder);
                        }
                        allPhotos.add(item);
                    }
                }
            }
        }
        onResult(new PhotoResult(folders, allPhotos));
    }

    @Override
    public String[] getSelectProjection() {
        String[] PROJECTION = {
                MediaStore.Images.Media._ID,
                MediaStore.Images.Media.DATA,
                MediaStore.Images.Media.BUCKET_ID,
                MediaStore.Images.Media.BUCKET_DISPLAY_NAME,
                MediaStore.Images.Media.DISPLAY_NAME,
                MediaStore.Images.Media.SIZE,
                MediaStore.Images.Media.DATE_MODIFIED
        };
        return PROJECTION;
    }

    @Override
    public Uri getQueryUri() {
        return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }
}
