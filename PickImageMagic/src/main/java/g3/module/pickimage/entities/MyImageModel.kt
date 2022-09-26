package g3.module.pickimage.entities

import android.os.Parcel
import android.os.Parcelable

data class MyImageModel(
    val idFolder: Int,
    var nameFolder: String?,
    var pathImage: String?,
    var isSelect: Boolean = false
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(idFolder)
        parcel.writeString(nameFolder)
        parcel.writeString(pathImage)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyImageModel> {
        override fun createFromParcel(parcel: Parcel): MyImageModel {
            return MyImageModel(parcel)
        }

        override fun newArray(size: Int): Array<MyImageModel?> {
            return arrayOfNulls(size)
        }
    }
}