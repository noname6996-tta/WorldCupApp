package g3.module.medialoader.callback;

import android.database.Cursor;

import androidx.loader.content.Loader;

import g3.module.medialoader.inter.ILoader;


/**
 * Created by Taurus on 2017/5/23.
 */

public abstract class OnLoaderCallBack implements ILoader {

    public abstract void onLoadFinish(Loader<Cursor> loader, Cursor data);

    public void onLoaderReset(){
    }

}
