package g3.module.medialoader.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import g3.module.medialoader.MediaLoader;
import g3.module.medialoader.R;
import g3.module.medialoader.bean.PhotoFolder;
import g3.module.medialoader.bean.PhotoResult;
import g3.module.medialoader.callback.OnPhotoLoaderCallBack;


public class MediaLoaderActivity extends AppCompatActivity {

    private long startLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mg_media_loader_demo);

        loadPhotos();
    }


    private void loadPhotos() {
        startLoad = System.currentTimeMillis();
        MediaLoader.getLoader().loadPhotos(this, new OnPhotoLoaderCallBack() {
            @Override
            public void onResult(PhotoResult result) {
                List<PhotoFolder> folders = result.getFolders();
                for (int i = 0; i < folders.size(); i++) {
                    Log.e("TAG", " folders name = " + folders.get(i).getCover());
                }

                Log.e("TAG", " time load = " + (System.currentTimeMillis() - startLoad));
            }
        });
    }
}
