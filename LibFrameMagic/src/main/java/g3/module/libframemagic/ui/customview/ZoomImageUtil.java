package g3.module.libframemagic.ui.customview;

import android.graphics.PointF;
import android.util.Log;
import android.view.MotionEvent;


public class ZoomImageUtil {
    //----------------------------------------------------------------------------------------------

    /**
     * Determine the space between the first two fingers
     */
    public static float spacing(MotionEvent event) {
        double x = event.getX(0) - event.getX(1);
        double y = event.getY(0) - event.getY(1);

        Log.d("spacing","x="+x +"y="+y);
        double tmp = x * x + y * y;
        return (float) Math.sqrt(tmp);
    }
    //----------------------------------------------------------------------------------------------
    /**
     * Calculate the mid point of the first two fingers
     */
    public static void midPoint(PointF point, MotionEvent event) {
        float x = event.getX(0) + event.getX(1);
        float y = event.getY(0) + event.getY(1);
        point.set(x / 2, y / 2);
    }
    //----------------------------------------------------------------------------------------------
    /**
     * Calculate the degree to be rotated by.
     *
     * @param event
     * @return Degrees
     */
    public static float rotation(MotionEvent event) {
        double delta_x = (event.getX(0) - event.getX(1));
        double delta_y = (event.getY(0) - event.getY(1));
        double radians = Math.atan2(delta_y, delta_x);
        return (float) Math.toDegrees(radians);
    }
}
