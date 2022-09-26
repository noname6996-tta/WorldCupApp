package g3.module.libframemagic.adapter

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView
import g3.module.libframemagic.R
import g3.module.libframemagic.apputils.FrameAppUtils
import g3.module.libframemagic.entities.ItemFrameModel
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.mg_frame_item_frame.*
import java.util.*

class ItemFrameAdapter(private val mListItem: ArrayList<ItemFrameModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var mPositionCheck = -1
    var mPositionCheckOld = -1
    private var onListenerItemFrame: ItemFrameAdapterListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.mg_frame_item_frame, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = mListItem[position]
        (holder as ItemHolder).containerColor(item, position)
    }

    override fun getItemCount() = mListItem.size


    override fun onViewDetachedFromWindow(holder: RecyclerView.ViewHolder) {
        super.onViewDetachedFromWindow(holder)
        if (holder is ItemHolder) {
            val view = holder.itemView.findViewById<ImageView>(R.id.mgFrameItemIvFrame)
            Glide.with(holder.itemView.context).clear(view)
        }
    }

    override fun onViewAttachedToWindow(holder: RecyclerView.ViewHolder) {
        super.onViewAttachedToWindow(holder)
        if (holder is ItemHolder) {
            val view = holder.itemView.findViewById<ImageView>(R.id.mgFrameItemIvFrame)
            FrameAppUtils().setImage(view, holder.itemFrame?.urlImage)
        }
    }


    /**
     *
     */
    inner class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView), LayoutContainer {
        var itemFrame: ItemFrameModel? = null
        override val containerView: View?
            get() = itemView

        fun containerColor(item: ItemFrameModel, position: Int) {

            itemFrame = item
            if (position == mPositionCheck) {
                mpFrameItemLayoutAction.visibility = View.VISIBLE
            } else {
                mpFrameItemLayoutAction.visibility = View.GONE
            }
            listener(itemView, item.posParent, item.urlImage, position)
        }

    }

    /**
     *
     */

    interface ItemFrameAdapterListener {
        fun onClickItem(position: Int, url: String)
        fun scrollRcv(position: Int)
    }

    /**
     *
     */
    private fun listener(itemView: View, positionParent: Int, url: String, position: Int) {
        onListenerItemFrame?.scrollRcv(positionParent)
        itemView.setOnClickListener {
            onListenerItemFrame?.onClickItem(positionParent, url)
            mPositionCheckOld = mPositionCheck
            mPositionCheck = position
            notifyItemChanged(mPositionCheckOld)
            notifyItemChanged(mPositionCheck)

        }
    }

    /**
     *
     */
    fun setOnItemClick(callback: ItemFrameAdapterListener) {
        onListenerItemFrame = callback
    }
    /**
     *
     */
    fun resetView(){
        mPositionCheckOld = -1
        mPositionCheck = -1
       notifyDataSetChanged()

    }

}