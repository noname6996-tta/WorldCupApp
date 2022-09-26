package g3.module.pickimage.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import g3.module.pickimage.R

import g3.module.pickimage.entities.MyImageModel
import g3.module.pickimage.utils.ImageUtil
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.layout_item_load_image.*

class ImageAdapter(
    private var mListData: ArrayList<MyImageModel>,
    private val onSelectImage: (item: MyImageModel, postion: Int) -> Unit
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ImageHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_item_load_image, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = mListData[position]

        if (holder is ImageHolder) {
            holder.containerImage(item, position)
        }
    }

    override fun getItemCount() = mListData.size

    inner class ImageHolder(itemView: View) : RecyclerView.ViewHolder(itemView), LayoutContainer {
        override val containerView: View?
            get() = itemView

        fun containerImage(item: MyImageModel, position: Int) {
         ImageUtil.resizeViewByPixel(mgImageItemListImageImage, ImageUtil.getDisplayMetrics().widthPixels/3, ImageUtil.getDisplayMetrics().widthPixels/3)
            Glide.with(itemView.context).load(item.pathImage)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .skipMemoryCache(true)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(mgImageItemListImageImage)
            listener(item, position)

        }
        private fun listener(item: MyImageModel, position: Int) {
            itemView.setOnClickListener {
                onSelectImage(item, position)
            }

        }
    }

}