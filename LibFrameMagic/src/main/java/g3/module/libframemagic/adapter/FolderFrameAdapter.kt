package g3.module.libframemagic.adapter

import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import g3.module.libframemagic.R
import g3.module.libframemagic.entities.FolderFrameModel
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.mg_frame_layout_folder_frame.*
import java.util.*

class FolderFrameAdapter(private val mListFolder: ArrayList<FolderFrameModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var checkColorPosition = 0
    private var onListenerFolderFrame: FolderFrameAdapterListener? = null

    companion object {
        const val LANGUAGE_VI = "vi"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FolderHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.mg_frame_layout_folder_frame, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = mListFolder[position]
        (holder as FolderHolder).containerColor(item, position)
    }

    override fun getItemCount() = mListFolder.size

    /**
     *
     */
    inner class FolderHolder(itemView: View) : RecyclerView.ViewHolder(itemView), LayoutContainer {
        override val containerView: View?
            get() = itemView

        fun containerColor(item: FolderFrameModel, position: Int) {
            val la = Locale.getDefault().language
            if (la == LANGUAGE_VI) {
                mgFrameItemFolderTvName.text = item.name_vi
            } else {
                mgFrameItemFolderTvName.text = item.name
            }
            if (position == checkColorPosition) {
                mgFrameItemFolderTvName.setTextColor(Color.parseColor("#8167FD"))
                mgFrameItemFolderTvName.setTypeface(null, Typeface.BOLD)
            } else {
                mgFrameItemFolderTvName.setTextColor(Color.parseColor("#8893CB"))
                mgFrameItemFolderTvName.setTypeface(null, Typeface.NORMAL)
            }

            listener(itemView, position, item.folder)
        }
    }

    /**
     *
     */

    interface FolderFrameAdapterListener {
        fun onClickFolder(position: Int, item: String)
    }

    /**
     *
     */
    private fun listener(itemView: View, position: Int, item: String) {
        itemView.setOnClickListener {
            onListenerFolderFrame?.onClickFolder(position, item)
        }
    }

    /**
     *
     */
    fun setOnFolderClick(callback: FolderFrameAdapterListener) {
        onListenerFolderFrame = callback
    }

    /**
     *
     */
    fun setPositionSellected(pos: Int) {
        this.checkColorPosition = pos
        notifyDataSetChanged()
    }

}