package g3.module.pickimage.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import g3.module.pickimage.R
import g3.module.pickimage.entities.MyImageModel



class ImageSaveAdapter(private var list: ArrayList<MyImageModel>, private val removeItemSave: (position: Int, item: MyImageModel) -> Unit) :
    RecyclerView.Adapter<ImageSaveAdapter.SaveHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SaveHolder {
        return SaveHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_item_save_image, parent, false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: SaveHolder, position: Int) {
        val item = list[position]
        holder.containerImage(item, position)
    }

    inner class SaveHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageDelete = itemView.findViewById<ImageView>(R.id.pImIvDelete)!!


        fun containerImage(item: MyImageModel, position: Int) {
            Glide.with(itemView.context).load(item.pathImage).into(itemView.findViewById(R.id.pImImageIvload))
            imageDelete.setOnClickListener {
                removeItemSave(position, item)
            }
        }
    }
}

