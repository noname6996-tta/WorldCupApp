package g3.module.pickimage.utils

import android.annotation.SuppressLint
import android.content.ContentUris
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.graphics.Movie
import android.media.MediaMetadataRetriever
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.DocumentsContract
import android.provider.MediaStore
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.View
import android.widget.Toast
import com.github.florent37.viewanimator.ViewAnimator
import g3.module.medialoader.utils.UriGetPath.*
import java.io.File
import java.io.FileInputStream

class ImageUtil {

    @SuppressLint("NewApi")
    fun getPath(context: Context, uri: Uri): String? {
        val isKitKatorAbove = Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT

        // DocumentProvider
        if (isKitKatorAbove && DocumentsContract.isDocumentUri(context, uri)) {
            // ExternalStorageProvider
            if (isExternalStorageDocument(uri)) {
                val docId = DocumentsContract.getDocumentId(uri)
                val split = docId.split(":".toRegex()).toTypedArray()
                val type = split[0]
                if ("primary".equals(type, ignoreCase = true)) {
                    return Environment.getExternalStorageDirectory().toString() + "/" + split[1]
                }

            } else if (isDownloadsDocument(uri)) {
                val id = DocumentsContract.getDocumentId(uri)
                val contentUri = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), java.lang.Long.valueOf(id))
                return getDataColumn(context, contentUri, null, null)
            } else if (isMediaDocument(uri)) {
                val docId = DocumentsContract.getDocumentId(uri)
                val split = docId.split(":".toRegex()).toTypedArray()
                val type = split[0]
                var contentUri: Uri? = null
                if ("image" == type) {
                    contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                } else if ("video" == type) {
                    contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                } else if ("audio" == type) {
                    contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
                }
                val selection = "_id=?"
                val selectionArgs = arrayOf(split[1])
                return getDataColumn(context, contentUri, selection, selectionArgs)
            }
        } else if ("content".equals(uri.scheme, ignoreCase = true)) {
            return getDataColumn(context, uri, null, null)
        } else if ("file".equals(uri.scheme, ignoreCase = true)) {
            return uri.path
        }
        return null
    }

    companion object {
        /**
         *
         */
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }

        /**
         *
         */
        private fun String?.asUri(): Uri? {
            try {
                return Uri.parse(this)
            } catch (e: Exception) {
            }
            return null
        }

        /**
         *
         */
        fun getMediaDuration(context: Context, fileMedia: File): Long {
            if (!fileMedia.exists()) return 0
            val retriever = MediaMetadataRetriever()
            retriever.setDataSource(context, fileMedia.absolutePath.asUri())
            val duration = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)
            retriever.release()
            return duration!!.toLongOrNull() ?: 0
        }

        /**
         *
         */
        fun getGifDuration(fileGif: File): Int {
            val fileInputStream = FileInputStream(fileGif)
            val movie = Movie.decodeStream(fileInputStream)
            return movie.duration()
        }

        /**
         *
         */
        fun getMusicDuration(path: String): Long {
            val time = 0L
            return try {
                val mediaMetadataRetriever = MediaMetadataRetriever()
                mediaMetadataRetriever.setDataSource(path)
                val durationStr =
                    mediaMetadataRetriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)
                durationStr!!.toLong()
            } catch (e: Exception) {
                time
            }
        }

        /**
         *
         */
        fun convertLongDurationToText(duration: Long): String? {
            return if (duration < 1000) {
                "00:01"
            } else {
                formateMilliSeccond(duration)
            }
        }

        /**
         * Function to convert milliseconds time to
         * Timer Format
         * Hours:Minutes:Seconds
         */
        fun formateMilliSeccond(milliseconds: Long): String? {
            var finalTimerString = ""
            var hourString = ""
            var minuteString = ""
            var secondString = ""

            // Convert total duration into time
            val hours = (milliseconds / (1000 * 60 * 60)).toInt()
            val minutes = (milliseconds % (1000 * 60 * 60)).toInt() / (1000 * 60)
            val seconds = (milliseconds % (1000 * 60 * 60) % (1000 * 60) / 1000).toInt()

            // hours
            if (hours > 0) {
                hourString = if (hours < 10) {
                    "0$hours:"
                } else {
                    "$hours:"
                }
            }

            // minute
            minuteString = if (minutes < 10) {
                "0$minutes"
            } else {
                "" + minutes
            }

            // second
            secondString = if (seconds < 10) {
                "0$seconds"
            } else {
                "" + seconds
            }

            finalTimerString = "$hourString$minuteString:$secondString"

            return finalTimerString
        }

        /**
         * scale 1f -> 0.9f -> 1f
         */
        fun scaleWhenClick(view: View) {
            ViewAnimator.animate(view).scale(1f, 0.9f, 1f).accelerate().duration(100).start()
        }

        /**
         *
         */
        fun getDisplayMetrics(): DisplayMetrics {
            return Resources.getSystem().displayMetrics
        }

        /**
         *
         */
        fun resizeViewByPixel(view: View, width: Int, height: Int) {
            val params = view.layoutParams
            params.width = width
            params.height = height
        }

        /**
         *
         */
        fun resizeViewWidthByPixel(view: View, width: Int) {
            val params = view.layoutParams
            params.width = width
        }

        /**
         *
         */
        fun resizeViewHeightByPixel(view: View, height: Int) {
            val params = view.layoutParams
            params.height = height
        }

        /**
         *
         */
        fun dpToPx(dp: Float, context: Context): Float {
            return TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dp,
                context.resources.displayMetrics
            )
        }

        /**
         *
         */
        fun removeFile(path: String): Boolean {
            val file = File(path)
            return file.delete()
        }

    }

    fun scanMedia(context: Context, path: String) {
        val file = File(path)
        val uri = Uri.fromFile(file)
        val scanFileIntent = Intent(
            Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, uri
        )
        context.sendBroadcast(scanFileIntent)
    }
}