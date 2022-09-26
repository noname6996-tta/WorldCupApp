package g3.module.pickimage.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import g3.module.pickimage.R
import g3.module.pickimage.entities.MyPhotoFolderModel
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.layout_item_list_folder.*

class FolderAdapter(private var mListFolder:ArrayList<MyPhotoFolderModel>, private val onSelectItemAllFolder: (pos: Int) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemAllFileHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_item_list_folder, parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return if (mListFolder.isNullOrEmpty()){
            0
        }else{
            mListFolder.size
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = mListFolder[position]
        if (holder is ItemAllFileHolder) {
            holder.containerImage(item, position)
        }
    }

    inner class ItemAllFileHolder(itemView: View) : RecyclerView.ViewHolder(itemView), LayoutContainer {
        override val containerView: View
            get() = itemView

        fun containerImage(item: MyPhotoFolderModel, position: Int) {
            itemView.setOnClickListener {
                onSelectItemAllFolder(position)
            }

            Glide.with(itemView.context).load(item.items[0].path).into(mgImageIvAllFile)
            if (item.name != null) {
                mgImageTxNameAllFolder.text = item.name.toString()
            } else {
                mgImageTxNameAllFolder.text = ""
            }
            mgImageTxListSizeFolder.text = item.items.size.toString()
        }




    }
}