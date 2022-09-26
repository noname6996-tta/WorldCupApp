package g3.module.pickimage.appinterface
import g3.module.pickimage.entities.MyImageModel
import java.util.ArrayList

interface PickImageClickInterface {
    fun onClickSelect(imageModel: MyImageModel)
    fun onClickSelectMultiple(lisPath:ArrayList<MyImageModel>)
    fun onClickSelectCollage()
}