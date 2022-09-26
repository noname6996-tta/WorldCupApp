package g3.module.permissionutils.utils

import android.Manifest


object PermissionConstants {

    const val REQUEST_CODE_PERMISSION_STORAGE = 2001
    const val REQUEST_CODE_PERMISSION_CAMERA = 2003
    const val REQUEST_CODE_SETTING = 2002
    const val REQUEST_CODE_MANAGER_STORAGE = 2004

    val listPermissionsStorage = arrayOf(
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE
    )

    val listPermissionsCamera = arrayOf(
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.CAMERA
    )
}