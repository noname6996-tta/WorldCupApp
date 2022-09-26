package g3.module.permissionutils.utils

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.Settings
import g3.module.permissionutils.R
import g3.module.permissionutils.dialog.PermissionDialog

class PermissionAppUtils {
    companion object {
        /**
         *
         */
        fun showDialogAllow(context: Activity, clickOk: () -> Unit, clickCancel: () -> Unit) {
            val mDialogPermission = PermissionDialog(context,
                R.string.permission_txt_allow_permission, {
                    clickOk()
                }, {
                    clickCancel()
                })
            mDialogPermission?.show()
        }

        /**
         *
         */
        fun showDialogDenied(context: Activity, clickOk: () -> Unit, clickCancel: () -> Unit) {
            val mDialogPermission = PermissionDialog(context,
                R.string.permission_txt_denied_permission, {
                    clickOk()
                }, {
                    clickCancel()
                })
            mDialogPermission?.show()
        }

        fun checkEnableExternalStorageManager(mAct: Activity, resultCode: Int, onAllowed: () -> Unit,onTask:()->Unit) {
           if(Build.VERSION.SDK_INT>Build.VERSION_CODES.Q){
               if (Environment.isExternalStorageManager()) {
                   onAllowed()
               } else {
                   val intent = Intent()
                   intent.action = Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION
                   val uri: Uri = Uri.fromParts("package", mAct.packageName, null)
                   intent.data = uri
                   mAct.startActivityForResult(intent, resultCode)
               }
           }else{
               onTask()
           }

        }

        fun enableExternalStorageManager():Boolean {
            return Environment.isExternalStorageManager()
        }
    }
}