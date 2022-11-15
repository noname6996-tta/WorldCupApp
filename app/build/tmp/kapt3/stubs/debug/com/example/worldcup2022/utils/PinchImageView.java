package com.example.worldcup2022.utils;

import android.graphics.RectF;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import kotlin.jvm.JvmOverloads;
import java.util.*;

/**
 * 手势图片控件
 *
 * @author clifford
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001e\u0018\u0000 e2\u00020\u0001:\tefghijklmB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010!J\u0018\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020&H\u0004J\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\tH\u0016J\u0010\u00107\u001a\u00020\f2\u0006\u00106\u001a\u00020\tH\u0016J\b\u00108\u001a\u000200H\u0002J\b\u00109\u001a\u000200H\u0002J\u0018\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020&H\u0002J\u0018\u0010=\u001a\u0002002\u0006\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020&H\u0002J\u000e\u0010@\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020\u001eJ\u0010\u0010B\u001a\u00020\u00162\b\u0010C\u001a\u0004\u0018\u00010\u0016J\u0010\u0010D\u001a\u00020\u001e2\b\u0010A\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010E\u001a\u00020\u001e2\b\u0010A\u001a\u0004\u0018\u00010\u001eJ\b\u0010F\u001a\u000200H\u0002J\u0010\u0010G\u001a\u0002002\u0006\u0010H\u001a\u00020IH\u0014J\u0010\u0010J\u001a\u00020\f2\u0006\u0010K\u001a\u00020LH\u0016J\u0018\u0010M\u001a\u0002002\b\u0010N\u001a\u0004\u0018\u00010\u001e2\u0006\u0010O\u001a\u00020PJ\u0010\u0010Q\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010!J\u0006\u0010R\u001a\u000200J(\u0010S\u001a\u0002002\u0006\u0010T\u001a\u00020&2\u0006\u0010U\u001a\u00020&2\u0006\u0010V\u001a\u00020&2\u0006\u0010W\u001a\u00020&H\u0002J(\u0010X\u001a\u0002002\u0006\u0010Y\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020&2\u0006\u0010[\u001a\u00020&2\u0006\u0010\\\u001a\u00020\u0014H\u0002J\b\u0010]\u001a\u000200H\u0002J\u0018\u0010^\u001a\u00020\f2\u0006\u0010_\u001a\u00020&2\u0006\u0010`\u001a\u00020&H\u0002J\u0012\u0010a\u001a\u0002002\b\u0010b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010c\u001a\u0002002\b\u0010b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010d\u001a\u0002002\b\u0010(\u001a\u0004\u0018\u00010\u00162\u0006\u0010O\u001a\u00020PR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0018\u00010\u0018R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0018\u00010$R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010(\u001a\u0004\u0018\u00010\u00168F\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R\u001e\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u00a8\u0006n"}, d2 = {"Lcom/example/worldcup2022/utils/PinchImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isReady", "", "()Z", "mDispatchOuterMatrixChangedLock", "mFlingAnimator", "Lcom/example/worldcup2022/utils/PinchImageView$FlingAnimator;", "mGestureDetector", "Landroid/view/GestureDetector;", "mLastMovePoint", "Landroid/graphics/PointF;", "mMask", "Landroid/graphics/RectF;", "mMaskAnimator", "Lcom/example/worldcup2022/utils/PinchImageView$MaskAnimator;", "mOnClickListener", "Landroid/view/View$OnClickListener;", "mOnLongClickListener", "Landroid/view/View$OnLongClickListener;", "mOuterMatrix", "Landroid/graphics/Matrix;", "mOuterMatrixChangedListeners", "", "Lcom/example/worldcup2022/utils/PinchImageView$OuterMatrixChangedListener;", "mOuterMatrixChangedListenersCopy", "mScaleAnimator", "Lcom/example/worldcup2022/utils/PinchImageView$ScaleAnimator;", "mScaleBase", "", "mScaleCenter", "mask", "getMask", "()Landroid/graphics/RectF;", "<set-?>", "pinchMode", "getPinchMode", "()I", "addOuterMatrixChangedListener", "", "listener", "calculateNextScale", "innerScale", "outerScale", "canScrollHorizontally", "direction", "canScrollVertically", "cancelAllAnimator", "dispatchOuterMatrixChanged", "doubleTap", "x", "y", "fling", "vx", "vy", "getCurrentImageMatrix", "matrix", "getImageBound", "rectF", "getInnerMatrix", "getOuterMatrix", "initView", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "outerMatrixTo", "endMatrix", "duration", "", "removeOuterMatrixChangedListener", "reset", "saveScaleContext", "x1", "y1", "x2", "y2", "scale", "scaleCenter", "scaleBase", "distance", "lineCenter", "scaleEnd", "scrollBy", "xDiff", "yDiff", "setOnClickListener", "l", "setOnLongClickListener", "zoomMaskTo", "Companion", "FlingAnimator", "MaskAnimator", "MathUtils", "MatrixPool", "ObjectsPool", "OuterMatrixChangedListener", "RectFPool", "ScaleAnimator", "app_debug"})
public final class PinchImageView extends androidx.appcompat.widget.AppCompatImageView {
    
    /**
     * 外界点击事件
     *
     * @see .setOnClickListener
     */
    private android.view.View.OnClickListener mOnClickListener;
    
    /**
     * 外界长按事件
     *
     * @see .setOnLongClickListener
     */
    private android.view.View.OnLongClickListener mOnLongClickListener;
    
    /**
     * 外层变换矩阵，如果是单位矩阵，那么图片是fit center状态
     *
     * @see .getOuterMatrix
     * @see .outerMatrixTo
     */
    private final android.graphics.Matrix mOuterMatrix = null;
    
    /**
     * 矩形遮罩
     *
     * @see .getMask
     * @see .zoomMaskTo
     */
    private android.graphics.RectF mMask;
    
    /**
     * 当前手势状态
     *
     * @see .getPinchMode
     * @see .PINCH_MODE_FREE
     *
     * @see .PINCH_MODE_SCROLL
     *
     * @see .PINCH_MODE_SCALE
     */
    private int pinchMode = 0;
    
    /**
     * 所有OuterMatrixChangedListener监听列表
     *
     * @see .addOuterMatrixChangedListener
     * @see .removeOuterMatrixChangedListener
     */
    private java.util.List<com.example.worldcup2022.utils.PinchImageView.OuterMatrixChangedListener> mOuterMatrixChangedListeners;
    
    /**
     * 当mOuterMatrixChangedListeners被锁定不允许修改时,临时将修改写到这个副本中
     *
     * @see .mOuterMatrixChangedListeners
     */
    private java.util.List<com.example.worldcup2022.utils.PinchImageView.OuterMatrixChangedListener> mOuterMatrixChangedListenersCopy;
    
    /**
     * mOuterMatrixChangedListeners的修改锁定
     *
     * 当进入dispatchOuterMatrixChanged方法时,被加1,退出前被减1
     *
     * @see .dispatchOuterMatrixChanged
     * @see .addOuterMatrixChangedListener
     * @see .removeOuterMatrixChangedListener
     */
    private int mDispatchOuterMatrixChangedLock = 0;
    
    /**
     * mask修改的动画
     *
     * 和图片的动画相互独立.
     *
     * @see .zoomMaskTo
     */
    private com.example.worldcup2022.utils.PinchImageView.MaskAnimator mMaskAnimator;
    
    /**
     * 在单指模式下:
     * 记录上一次手指的位置,用于计算新的位置和上一次位置的差值.
     *
     * 双指模式下:
     * 记录两个手指的中点,作为和mScaleCenter绑定的点.
     * 这个绑定可以保证mScaleCenter无论如何都会跟随这个中点.
     *
     * @see .mScaleCenter
     *
     * @see .scale
     * @see .scaleEnd
     */
    private final android.graphics.PointF mLastMovePoint = null;
    
    /**
     * 缩放模式下图片的缩放中点.
     *
     * 为其指代的点经过innerMatrix变换之后的值.
     * 其指代的点在手势过程中始终跟随mLastMovePoint.
     * 通过双指缩放时,其为缩放中心点.
     *
     * @see .saveScaleContext
     * @see .mLastMovePoint
     *
     * @see .scale
     */
    private final android.graphics.PointF mScaleCenter = null;
    
    /**
     * 缩放模式下的基础缩放比例
     *
     * 为外层缩放值除以开始缩放时两指距离.
     * 其值乘上最新的两指之间距离为最新的图片缩放比例.
     *
     * @see .saveScaleContext
     * @see .scale
     */
    private float mScaleBase = 0.0F;
    
    /**
     * 图片缩放动画
     *
     * 缩放模式把图片的位置大小超出限制之后触发.
     * 双击图片放大或缩小时触发.
     * 手动调用outerMatrixTo触发.
     *
     * @see .scaleEnd
     * @see .doubleTap
     * @see .outerMatrixTo
     */
    private com.example.worldcup2022.utils.PinchImageView.ScaleAnimator mScaleAnimator;
    
    /**
     * 滑动产生的惯性动画
     *
     * @see .fling
     */
    private com.example.worldcup2022.utils.PinchImageView.FlingAnimator mFlingAnimator;
    
    /**
     * 常用手势处理
     *
     * 在onTouchEvent末尾被执行.
     */
    private final android.view.GestureDetector mGestureDetector = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.utils.PinchImageView.Companion Companion = null;
    
    /**
     * 图片缩放动画时间
     */
    public static final int SCALE_ANIMATOR_DURATION = 200;
    
    /**
     * 惯性动画衰减参数
     */
    public static final float FLING_DAMPING_FACTOR = 0.9F;
    
    /**
     * 图片最大放大比例
     */
    public static final float MAX_SCALE = 4.0F;
    
    /**
     * 手势状态：自由状态
     *
     * @see .getPinchMode
     */
    public static final int PINCH_MODE_FREE = 0;
    
    /**
     * 手势状态：单指滚动状态
     *
     * @see .getPinchMode
     */
    public static final int PINCH_MODE_SCROLL = 1;
    
    /**
     * 手势状态：双指缩放状态
     *
     * @see .getPinchMode
     */
    public static final int PINCH_MODE_SCALE = 2;
    
    @java.lang.Override()
    public void setOnClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener l) {
    }
    
    @java.lang.Override()
    public void setOnLongClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnLongClickListener l) {
    }
    
    public final int getPinchMode() {
        return 0;
    }
    
    /**
     * 获取外部变换矩阵.
     *
     * 外部变换矩阵记录了图片手势操作的最终结果,是相对于图片fit center状态的变换.
     * 默认值为单位矩阵,此时图片为fit center状态.
     *
     * @param matrix 用于填充结果的对象
     * @return 如果传了matrix参数则将matrix填充后返回,否则new一个填充返回
     */
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Matrix getOuterMatrix(@org.jetbrains.annotations.Nullable()
    android.graphics.Matrix matrix) {
        return null;
    }
    
    /**
     * 获取内部变换矩阵.
     *
     * 内部变换矩阵是原图到fit center状态的变换,当原图尺寸变化或者控件大小变化都会发生改变
     * 当尚未布局或者原图不存在时,其值无意义.所以在调用前需要确保前置条件有效,否则将影响计算结果.
     *
     * @param matrix 用于填充结果的对象
     * @return 如果传了matrix参数则将matrix填充后返回,否则new一个填充返回
     */
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Matrix getInnerMatrix(@org.jetbrains.annotations.Nullable()
    android.graphics.Matrix matrix) {
        return null;
    }
    
    /**
     * 获取图片总变换矩阵.
     *
     * 总变换矩阵为内部变换矩阵x外部变换矩阵,决定了原图到所见最终状态的变换
     * 当尚未布局或者原图不存在时,其值无意义.所以在调用前需要确保前置条件有效,否则将影响计算结果.
     *
     * @param matrix 用于填充结果的对象
     * @return 如果传了matrix参数则将matrix填充后返回,否则new一个填充返回
     *
     * @see .getOuterMatrix
     * @see .getInnerMatrix
     */
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Matrix getCurrentImageMatrix(@org.jetbrains.annotations.NotNull()
    android.graphics.Matrix matrix) {
        return null;
    }
    
    /**
     * 获取当前变换后的图片位置和尺寸
     *
     * 当尚未布局或者原图不存在时,其值无意义.所以在调用前需要确保前置条件有效,否则将影响计算结果.
     *
     * @param rectF 用于填充结果的对象
     * @return 如果传了rectF参数则将rectF填充后返回,否则new一个填充返回
     *
     * @see .getCurrentImageMatrix
     */
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.RectF getImageBound(@org.jetbrains.annotations.Nullable()
    android.graphics.RectF rectF) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.RectF getMask() {
        return null;
    }
    
    /**
     * 与ViewPager结合的时候使用
     * @param direction
     * @return
     */
    @java.lang.Override()
    public boolean canScrollHorizontally(int direction) {
        return false;
    }
    
    /**
     * 与ViewPager结合的时候使用
     * @param direction
     * @return
     */
    @java.lang.Override()
    public boolean canScrollVertically(int direction) {
        return false;
    }
    
    /**
     * 执行当前outerMatrix到指定outerMatrix渐变的动画
     *
     * 调用此方法会停止正在进行中的手势以及手势动画.
     * 当duration为0时,outerMatrix值会被立即设置而不会启动动画.
     *
     * @param endMatrix 动画目标矩阵
     * @param duration 动画持续时间
     *
     * @see .getOuterMatrix
     */
    public final void outerMatrixTo(@org.jetbrains.annotations.Nullable()
    android.graphics.Matrix endMatrix, long duration) {
    }
    
    /**
     * 执行当前mask到指定mask的变化动画
     *
     * 调用此方法不会停止手势以及手势相关动画,但会停止正在进行的mask动画.
     * 当前mask为null时,则不执行动画立即设置为目标mask.
     * 当duration为0时,立即将当前mask设置为目标mask,不会执行动画.
     *
     * @param mask 动画目标mask
     * @param duration 动画持续时间
     *
     * @see .getMask
     */
    public final void zoomMaskTo(@org.jetbrains.annotations.Nullable()
    android.graphics.RectF mask, long duration) {
    }
    
    /**
     * 重置所有状态
     *
     * 重置位置到fit center状态,清空mask,停止所有手势,停止所有动画.
     * 但不清空drawable,以及事件绑定相关数据.
     */
    public final void reset() {
    }
    
    /**
     * 添加外部矩阵变化监听
     *
     * @param listener
     */
    public final void addOuterMatrixChangedListener(@org.jetbrains.annotations.Nullable()
    com.example.worldcup2022.utils.PinchImageView.OuterMatrixChangedListener listener) {
    }
    
    /**
     * 删除外部矩阵变化监听
     *
     * @param listener
     */
    public final void removeOuterMatrixChangedListener(@org.jetbrains.annotations.Nullable()
    com.example.worldcup2022.utils.PinchImageView.OuterMatrixChangedListener listener) {
    }
    
    /**
     * 触发外部矩阵修改事件
     *
     * 需要在每次给外部矩阵设置值时都调用此方法.
     *
     * @see .mOuterMatrix
     */
    private final void dispatchOuterMatrixChanged() {
    }
    
    /**
     * 计算双击之后图片接下来应该被缩放的比例
     *
     * 如果值大于getMaxScale或者小于fit center尺寸，则实际使用取边界值.
     * 通过覆盖此方法可以定制不同的图片被双击时使用不同的放大策略.
     *
     * @param innerScale 当前内部矩阵的缩放值
     * @param outerScale 当前外部矩阵的缩放值
     * @return 接下来的缩放比例
     *
     * @see .doubleTap
     * @see .getMaxScale
     */
    protected final float calculateNextScale(float innerScale, float outerScale) {
        return 0.0F;
    }
    
    public PinchImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PinchImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PinchImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final boolean isReady() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    /**
     * 让图片移动一段距离
     *
     * 不能移动超过可移动范围,超过了就到可移动范围边界为止.
     *
     * @param xDiff 移动距离
     * @param yDiff 移动距离
     * @return 是否改变了位置
     */
    private final boolean scrollBy(float xDiff, float yDiff) {
        return false;
    }
    
    /**
     * 记录缩放前的一些信息
     *
     * 保存基础缩放值.
     * 保存图片缩放中点.
     *
     * @param x1 缩放第一个手指
     * @param y1 缩放第一个手指
     * @param x2 缩放第二个手指
     * @param y2 缩放第二个手指
     */
    private final void saveScaleContext(float x1, float y1, float x2, float y2) {
    }
    
    /**
     * 对图片按照一些手势信息进行缩放
     *
     * @param scaleCenter mScaleCenter
     * @param scaleBase mScaleBase
     * @param distance 手指两点之间距离
     * @param lineCenter 手指两点之间中点
     *
     * @see .mScaleCenter
     *
     * @see .mScaleBase
     */
    private final void scale(android.graphics.PointF scaleCenter, float scaleBase, float distance, android.graphics.PointF lineCenter) {
    }
    
    /**
     * 双击后放大或者缩小
     *
     * 将图片缩放比例缩放到nextScale指定的值.
     * 但nextScale值不能大于最大缩放值不能小于fit center情况下的缩放值.
     * 将双击的点尽量移动到控件中心.
     *
     * @param x 双击的点
     * @param y 双击的点
     *
     * @see .calculateNextScale
     * @see .getMaxScale
     */
    private final void doubleTap(float x, float y) {
    }
    
    /**
     * 当缩放操作结束动画
     *
     * 如果图片超过边界,找到最近的位置动画恢复.
     * 如果图片缩放尺寸超过最大值或者最小值,找到最近的值动画恢复.
     */
    private final void scaleEnd() {
    }
    
    /**
     * 执行惯性动画
     *
     * 动画在遇到不能移动就停止.
     * 动画速度衰减到很小就停止.
     *
     * 其中参数速度单位为 像素/秒
     *
     * @param vx x方向速度
     * @param vy y方向速度
     */
    private final void fling(float vx, float vy) {
    }
    
    /**
     * 停止所有手势动画
     */
    private final void cancelAllAnimator() {
    }
    
    /**
     * 外部矩阵变化事件通知监听器
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/worldcup2022/utils/PinchImageView$OuterMatrixChangedListener;", "", "onOuterMatrixChanged", "", "pinchImageView", "Lcom/example/worldcup2022/utils/PinchImageView;", "app_debug"})
    public static abstract interface OuterMatrixChangedListener {
        
        /**
         * 外部矩阵变化回调
         *
         * 外部矩阵的任何变化后都收到此回调.
         * 外部矩阵变化后,总变化矩阵,图片的展示位置都将发生变化.
         *
         * @param pinchImageView
         *
         * @see .getOuterMatrix
         * @see .getCurrentImageMatrix
         * @see .getImageBound
         */
        public abstract void onOuterMatrixChanged(@org.jetbrains.annotations.NotNull()
        com.example.worldcup2022.utils.PinchImageView pinchImageView);
    }
    
    /**
     * mask变换动画
     *
     * 将mask从一个rect动画到另外一个rect
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/worldcup2022/utils/PinchImageView$MaskAnimator;", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "start", "Landroid/graphics/RectF;", "end", "duration", "", "(Lcom/example/worldcup2022/utils/PinchImageView;Landroid/graphics/RectF;Landroid/graphics/RectF;J)V", "mEnd", "", "mResult", "mStart", "onAnimationUpdate", "", "animation", "app_debug"})
    final class MaskAnimator extends android.animation.ValueAnimator implements android.animation.ValueAnimator.AnimatorUpdateListener {
        
        /**
         * 开始mask
         */
        private final float[] mStart = null;
        
        /**
         * 结束mask
         */
        private final float[] mEnd = null;
        
        /**
         * 中间结果mask
         */
        private final float[] mResult = null;
        
        public MaskAnimator(@org.jetbrains.annotations.NotNull()
        android.graphics.RectF start, @org.jetbrains.annotations.NotNull()
        android.graphics.RectF end, long duration) {
            super();
        }
        
        @java.lang.Override()
        public void onAnimationUpdate(@org.jetbrains.annotations.NotNull()
        android.animation.ValueAnimator animation) {
        }
    }
    
    /**
     * 惯性动画
     *
     * 速度逐渐衰减,每帧速度衰减为原来的FLING_DAMPING_FACTOR,当速度衰减到小于1时停止.
     * 当图片不能移动时,动画停止.
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/worldcup2022/utils/PinchImageView$FlingAnimator;", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "vectorX", "", "vectorY", "(Lcom/example/worldcup2022/utils/PinchImageView;FF)V", "mVector", "", "onAnimationUpdate", "", "animation", "app_debug"})
    final class FlingAnimator extends android.animation.ValueAnimator implements android.animation.ValueAnimator.AnimatorUpdateListener {
        
        /**
         * 速度向量
         */
        private final float[] mVector = null;
        
        public FlingAnimator(float vectorX, float vectorY) {
            super();
        }
        
        @java.lang.Override()
        public void onAnimationUpdate(@org.jetbrains.annotations.NotNull()
        android.animation.ValueAnimator animation) {
        }
    }
    
    /**
     * 缩放动画
     *
     * 在给定时间内从一个矩阵的变化逐渐动画到另一个矩阵的变化
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/worldcup2022/utils/PinchImageView$ScaleAnimator;", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "start", "Landroid/graphics/Matrix;", "end", "duration", "", "(Lcom/example/worldcup2022/utils/PinchImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;J)V", "mEnd", "", "mResult", "mStart", "onAnimationUpdate", "", "animation", "app_debug"})
    final class ScaleAnimator extends android.animation.ValueAnimator implements android.animation.ValueAnimator.AnimatorUpdateListener {
        
        /**
         * 开始矩阵
         */
        private final float[] mStart = null;
        
        /**
         * 结束矩阵
         */
        private final float[] mEnd = null;
        
        /**
         * 中间结果矩阵
         */
        private final float[] mResult = null;
        
        @kotlin.jvm.JvmOverloads()
        public ScaleAnimator(@org.jetbrains.annotations.NotNull()
        android.graphics.Matrix start, @org.jetbrains.annotations.NotNull()
        android.graphics.Matrix end) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public ScaleAnimator(@org.jetbrains.annotations.NotNull()
        android.graphics.Matrix start, @org.jetbrains.annotations.NotNull()
        android.graphics.Matrix end, long duration) {
            super();
        }
        
        @java.lang.Override()
        public void onAnimationUpdate(@org.jetbrains.annotations.NotNull()
        android.animation.ValueAnimator animation) {
        }
    }
    
    /**
     * 对象池
     *
     * 防止频繁new对象产生内存抖动.
     * 由于对象池最大长度限制,如果吞度量超过对象池容量,仍然会发生抖动.
     * 此时需要增大对象池容量,但是会占用更多内存.
     *
     * @param <T> 对象池容纳的对象类型
     *   </T>
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\"\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u000bJ\r\u0010\f\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u0010\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/worldcup2022/utils/PinchImageView$ObjectsPool;", "T", "", "mSize", "", "(I)V", "mQueue", "Ljava/util/Queue;", "given", "", "obj", "(Ljava/lang/Object;)V", "newInstance", "()Ljava/lang/Object;", "resetInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", "take", "app_debug"})
    static abstract class ObjectsPool<T extends java.lang.Object> {
        
        /**
         * 对象池的最大容量
         */
        private final int mSize = 0;
        
        /**
         * 对象池队列
         */
        private final java.util.Queue<T> mQueue = null;
        
        public ObjectsPool(int mSize) {
            super();
        }
        
        /**
         * 获取一个空闲的对象
         *
         * 如果对象池为空,则对象池自己会new一个返回.
         * 如果对象池内有对象,则取一个已存在的返回.
         * take出来的对象用完要记得调用given归还.
         * 如果不归还,让然会发生内存抖动,但不会引起泄漏.
         *
         * @return 可用的对象
         *
         * @see .given
         */
        public final T take() {
            return null;
        }
        
        /**
         * 归还对象池内申请的对象
         *
         * 如果归还的对象数量超过对象池容量,那么归还的对象就会被丢弃.
         *
         * @param obj 归还的对象
         *
         * @see .take
         */
        public final void given(@org.jetbrains.annotations.Nullable()
        T obj) {
        }
        
        /**
         * 实例化对象
         *
         * @return 创建的对象
         */
        protected abstract T newInstance();
        
        /**
         * 重置对象
         *
         * 把对象数据清空到就像刚创建的一样.
         *
         * @param obj 需要被重置的对象
         * @return 被重置之后的对象
         */
        protected abstract T resetInstance(T obj);
    }
    
    /**
     * 矩阵对象池
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0014\u00a8\u0006\t"}, d2 = {"Lcom/example/worldcup2022/utils/PinchImageView$MatrixPool;", "Lcom/example/worldcup2022/utils/PinchImageView$ObjectsPool;", "Landroid/graphics/Matrix;", "size", "", "(I)V", "newInstance", "resetInstance", "obj", "app_debug"})
    static final class MatrixPool extends com.example.worldcup2022.utils.PinchImageView.ObjectsPool<android.graphics.Matrix> {
        
        public MatrixPool(int size) {
            super(0);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected android.graphics.Matrix newInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected android.graphics.Matrix resetInstance(@org.jetbrains.annotations.NotNull()
        android.graphics.Matrix obj) {
            return null;
        }
    }
    
    /**
     * 矩形对象池
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0014\u00a8\u0006\t"}, d2 = {"Lcom/example/worldcup2022/utils/PinchImageView$RectFPool;", "Lcom/example/worldcup2022/utils/PinchImageView$ObjectsPool;", "Landroid/graphics/RectF;", "size", "", "(I)V", "newInstance", "resetInstance", "obj", "app_debug"})
    static final class RectFPool extends com.example.worldcup2022.utils.PinchImageView.ObjectsPool<android.graphics.RectF> {
        
        public RectFPool(int size) {
            super(0);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected android.graphics.RectF newInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected android.graphics.RectF resetInstance(@org.jetbrains.annotations.NotNull()
        android.graphics.RectF obj) {
            return null;
        }
    }
    
    /**
     * 数学计算工具类
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0013\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\rJ4\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\f\u001a\u0004\u0018\u00010\nJ&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011J&\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011J\u0010\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\rJ\u000e\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\rJ\u0006\u0010!\u001a\u00020\rJ\u0010\u0010!\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\rJ\u000e\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\nJ\u0010\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\nJ&\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/example/worldcup2022/utils/PinchImageView$MathUtils;", "", "()V", "mMatrixPool", "Lcom/example/worldcup2022/utils/PinchImageView$MatrixPool;", "mRectFPool", "Lcom/example/worldcup2022/utils/PinchImageView$RectFPool;", "calculateRectTranslateMatrix", "", "from", "Landroid/graphics/RectF;", "to", "result", "Landroid/graphics/Matrix;", "calculateScaledRectInContainer", "container", "srcWidth", "", "srcHeight", "scaleType", "Landroid/widget/ImageView$ScaleType;", "getCenterPoint", "", "x1", "y1", "x2", "y2", "getDistance", "getMatrixScale", "matrix", "inverseMatrixPoint", "point", "matrixGiven", "matrixTake", "rectFGiven", "rectF", "rectFTake", "left", "top", "right", "bottom", "app_debug"})
    public static final class MathUtils {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.worldcup2022.utils.PinchImageView.MathUtils INSTANCE = null;
        
        /**
         * 矩阵对象池
         */
        private static final com.example.worldcup2022.utils.PinchImageView.MatrixPool mMatrixPool = null;
        
        /**
         * 矩形对象池
         */
        private static final com.example.worldcup2022.utils.PinchImageView.RectFPool mRectFPool = null;
        
        private MathUtils() {
            super();
        }
        
        /**
         * 获取矩阵对象
         */
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Matrix matrixTake() {
            return null;
        }
        
        /**
         * 获取某个矩阵的copy
         */
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Matrix matrixTake(@org.jetbrains.annotations.Nullable()
        android.graphics.Matrix matrix) {
            return null;
        }
        
        /**
         * 归还矩阵对象
         */
        public final void matrixGiven(@org.jetbrains.annotations.NotNull()
        android.graphics.Matrix matrix) {
        }
        
        /**
         * 获取矩形对象
         */
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.RectF rectFTake() {
            return null;
        }
        
        /**
         * 按照指定值获取矩形对象
         */
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.RectF rectFTake(float left, float top, float right, float bottom) {
            return null;
        }
        
        /**
         * 获取某个矩形的副本
         */
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.RectF rectFTake(@org.jetbrains.annotations.Nullable()
        android.graphics.RectF rectF) {
            return null;
        }
        
        /**
         * 归还矩形对象
         */
        public final void rectFGiven(@org.jetbrains.annotations.NotNull()
        android.graphics.RectF rectF) {
        }
        
        /**
         * 获取两点之间距离
         *
         * @param x1 点1
         * @param y1 点1
         * @param x2 点2
         * @param y2 点2
         * @return 距离
         */
        public final float getDistance(float x1, float y1, float x2, float y2) {
            return 0.0F;
        }
        
        /**
         * 获取两点的中点
         *
         * @param x1 点1
         * @param y1 点1
         * @param x2 点2
         * @param y2 点2
         * @return float[]{x, y}
         */
        @org.jetbrains.annotations.NotNull()
        public final float[] getCenterPoint(float x1, float y1, float x2, float y2) {
            return null;
        }
        
        /**
         * 获取矩阵的缩放值
         *
         * @param matrix 要计算的矩阵
         * @return float[]{scaleX, scaleY}
         */
        @org.jetbrains.annotations.NotNull()
        public final float[] getMatrixScale(@org.jetbrains.annotations.Nullable()
        android.graphics.Matrix matrix) {
            return null;
        }
        
        /**
         * 计算点除以矩阵的值
         *
         * matrix.mapPoints(unknownPoint) -> point
         * 已知point和matrix,求unknownPoint的值.
         *
         * @param point
         * @param matrix
         * @return unknownPoint
         */
        @org.jetbrains.annotations.NotNull()
        public final float[] inverseMatrixPoint(@org.jetbrains.annotations.Nullable()
        float[] point, @org.jetbrains.annotations.Nullable()
        android.graphics.Matrix matrix) {
            return null;
        }
        
        /**
         * 计算两个矩形之间的变换矩阵
         *
         * unknownMatrix.mapRect(to, from)
         * 已知from矩形和to矩形,求unknownMatrix
         *
         * @param from
         * @param to
         * @param result unknownMatrix
         */
        public final void calculateRectTranslateMatrix(@org.jetbrains.annotations.Nullable()
        android.graphics.RectF from, @org.jetbrains.annotations.Nullable()
        android.graphics.RectF to, @org.jetbrains.annotations.Nullable()
        android.graphics.Matrix result) {
        }
        
        /**
         * 计算图片在某个ImageView中的显示矩形
         *
         * @param container ImageView的Rect
         * @param srcWidth 图片的宽度
         * @param srcHeight 图片的高度
         * @param scaleType 图片在ImageView中的ScaleType
         * @param result 图片应该在ImageView中展示的矩形
         */
        public final void calculateScaledRectInContainer(@org.jetbrains.annotations.Nullable()
        android.graphics.RectF container, float srcWidth, float srcHeight, @org.jetbrains.annotations.Nullable()
        android.widget.ImageView.ScaleType scaleType, @org.jetbrains.annotations.Nullable()
        android.graphics.RectF result) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/worldcup2022/utils/PinchImageView$Companion;", "", "()V", "FLING_DAMPING_FACTOR", "", "MAX_SCALE", "PINCH_MODE_FREE", "", "PINCH_MODE_SCALE", "PINCH_MODE_SCROLL", "SCALE_ANIMATOR_DURATION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}