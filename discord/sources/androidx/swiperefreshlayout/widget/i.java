package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.l0;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.s;
import androidx.core.view.u0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ViewGroup implements s, r, q {
    private static final int ALPHA_ANIMATION_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 200;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
    static final int CIRCLE_DIAMETER = 40;
    static final int CIRCLE_DIAMETER_LARGE = 56;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    public static final int DEFAULT = 1;
    private static final int DEFAULT_CIRCLE_TARGET = 64;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    private static final float DRAG_RATE = 0.5f;
    private static final int INVALID_POINTER = -1;
    public static final int LARGE = 0;
    private static final int[] LAYOUT_ATTRS = {R.attr.enabled};
    private static final String LOG_TAG = "i";
    private static final int MAX_ALPHA = 255;
    private static final float MAX_PROGRESS_ANGLE = 0.8f;
    private static final int SCALE_DOWN_DURATION = 150;
    private static final int STARTING_PROGRESS_ALPHA = 76;
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback;
    private int mCircleDiameter;
    CircleImageView mCircleView;
    private int mCircleViewIndex;
    int mCurrentTargetOffsetTop;
    int mCustomSlingshotDistance;
    private final DecelerateInterpolator mDecelerateInterpolator;
    private boolean mEnableLegacyRequestDisallowInterceptTouch;
    protected int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    SwipeRefreshLayout$OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private boolean mNestedScrollInProgress;
    private final NestedScrollingChildHelper mNestedScrollingChildHelper;
    private final NestedScrollingParentHelper mNestedScrollingParentHelper;
    private final int[] mNestedScrollingV2ConsumedCompat;
    boolean mNotify;
    protected int mOriginalOffsetTop;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    CircularProgressDrawable mProgress;
    private Animation.AnimationListener mRefreshListener;
    boolean mRefreshing;
    private boolean mReturningToStart;
    boolean mScale;
    private Animation mScaleAnimation;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    int mSpinnerOffsetEnd;
    float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private float mTotalUnconsumed;
    private int mTouchSlop;
    boolean mUsingCustomStart;

    public i(ReactContext reactContext) {
        super(reactContext, null);
        int i7 = 0;
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        ReactSwipeRefreshLayout reactSwipeRefreshLayout = (ReactSwipeRefreshLayout) this;
        this.mRefreshListener = new d(reactSwipeRefreshLayout, i7);
        this.mAnimateToCorrectPosition = new f(reactSwipeRefreshLayout, i7);
        this.mAnimateToStartPosition = new f(reactSwipeRefreshLayout, 1);
        this.mTouchSlop = ViewConfiguration.get(reactContext).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(DECELERATE_INTERPOLATION_FACTOR);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
        CircleImageView circleImageView = new CircleImageView(getContext());
        float f2 = circleImageView.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = circleImageView.getContext().obtainStyledAttributes(k3.a.f14276a);
        circleImageView.f2740e = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = u0.f1729a;
        l0.k(circleImageView, f2 * 4.0f);
        shapeDrawable.getPaint().setColor(circleImageView.f2740e);
        circleImageView.setBackground(shapeDrawable);
        this.mCircleView = circleImageView;
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.mProgress = circularProgressDrawable;
        circularProgressDrawable.c(1);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.mSpinnerOffsetEnd = i10;
        this.mTotalDragDistance = i10;
        this.mNestedScrollingParentHelper = new NestedScrollingParentHelper();
        this.mNestedScrollingChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.mCircleDiameter;
        this.mCurrentTargetOffsetTop = i11;
        this.mOriginalOffsetTop = i11;
        moveToStart(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = reactContext.obtainStyledAttributes((AttributeSet) null, LAYOUT_ATTRS);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i7) {
        this.mCircleView.getBackground().setAlpha(i7);
        this.mProgress.setAlpha(i7);
    }

    public final void a() {
        if (this.mTarget == null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    public final void b(float f2) {
        if (f2 > this.mTotalDragDistance) {
            d(true, true);
            return;
        }
        this.mRefreshing = false;
        CircularProgressDrawable circularProgressDrawable = this.mProgress;
        c cVar = circularProgressDrawable.f2742d;
        cVar.f2756e = 0.0f;
        cVar.f2757f = 0.0f;
        circularProgressDrawable.invalidateSelf();
        boolean z5 = this.mScale;
        d dVar = !z5 ? new d(this, 1) : null;
        int i7 = this.mCurrentTargetOffsetTop;
        if (z5) {
            this.mFrom = i7;
            this.mStartingScale = this.mCircleView.getScaleX();
            g gVar = new g(this, 0);
            this.mScaleDownToStartAnimation = gVar;
            gVar.setDuration(150L);
            if (dVar != null) {
                this.mCircleView.f2739d = dVar;
            }
            this.mCircleView.clearAnimation();
            this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
        } else {
            this.mFrom = i7;
            this.mAnimateToStartPosition.reset();
            this.mAnimateToStartPosition.setDuration(200L);
            this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
            if (dVar != null) {
                this.mCircleView.f2739d = dVar;
            }
            this.mCircleView.clearAnimation();
            this.mCircleView.startAnimation(this.mAnimateToStartPosition);
        }
        CircularProgressDrawable circularProgressDrawable2 = this.mProgress;
        c cVar2 = circularProgressDrawable2.f2742d;
        if (cVar2.f2763n) {
            cVar2.f2763n = false;
        }
        circularProgressDrawable2.invalidateSelf();
    }

    public final void c(float f2) {
        Animation animation;
        Animation animation2;
        CircularProgressDrawable circularProgressDrawable = this.mProgress;
        c cVar = circularProgressDrawable.f2742d;
        if (!cVar.f2763n) {
            cVar.f2763n = true;
        }
        circularProgressDrawable.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f2 / this.mTotalDragDistance));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f2) - this.mTotalDragDistance;
        int i7 = this.mCustomSlingshotDistance;
        if (i7 <= 0) {
            i7 = this.mUsingCustomStart ? this.mSpinnerOffsetEnd - this.mOriginalOffsetTop : this.mSpinnerOffsetEnd;
        }
        float f7 = i7;
        double dMax = Math.max(0.0f, Math.min(fAbs, f7 * DECELERATE_INTERPOLATION_FACTOR) / f7) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * DECELERATE_INTERPOLATION_FACTOR;
        int i10 = this.mOriginalOffsetTop + ((int) ((f7 * fMin) + (f7 * fPow * DECELERATE_INTERPOLATION_FACTOR)));
        if (this.mCircleView.getVisibility() != 0) {
            this.mCircleView.setVisibility(0);
        }
        if (!this.mScale) {
            this.mCircleView.setScaleX(1.0f);
            this.mCircleView.setScaleY(1.0f);
        }
        if (this.mScale) {
            setAnimationProgress(Math.min(1.0f, f2 / this.mTotalDragDistance));
        }
        if (f2 < this.mTotalDragDistance) {
            if (this.mProgress.f2742d.f2769t > STARTING_PROGRESS_ALPHA && ((animation2 = this.mAlphaStartAnimation) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                e eVar = new e(this, this.mProgress.f2742d.f2769t, STARTING_PROGRESS_ALPHA);
                eVar.setDuration(300L);
                CircleImageView circleImageView = this.mCircleView;
                circleImageView.f2739d = null;
                circleImageView.clearAnimation();
                this.mCircleView.startAnimation(eVar);
                this.mAlphaStartAnimation = eVar;
            }
        } else if (this.mProgress.f2742d.f2769t < 255 && ((animation = this.mAlphaMaxAnimation) == null || !animation.hasStarted() || animation.hasEnded())) {
            e eVar2 = new e(this, this.mProgress.f2742d.f2769t, 255);
            eVar2.setDuration(300L);
            CircleImageView circleImageView2 = this.mCircleView;
            circleImageView2.f2739d = null;
            circleImageView2.clearAnimation();
            this.mCircleView.startAnimation(eVar2);
            this.mAlphaMaxAnimation = eVar2;
        }
        float f10 = fMax * MAX_PROGRESS_ANGLE;
        CircularProgressDrawable circularProgressDrawable2 = this.mProgress;
        float fMin2 = Math.min(MAX_PROGRESS_ANGLE, f10);
        c cVar2 = circularProgressDrawable2.f2742d;
        cVar2.f2756e = 0.0f;
        cVar2.f2757f = fMin2;
        circularProgressDrawable2.invalidateSelf();
        CircularProgressDrawable circularProgressDrawable3 = this.mProgress;
        float fMin3 = Math.min(1.0f, fMax);
        c cVar3 = circularProgressDrawable3.f2742d;
        if (fMin3 != cVar3.f2765p) {
            cVar3.f2765p = fMin3;
        }
        circularProgressDrawable3.invalidateSelf();
        float f11 = ((fPow * DECELERATE_INTERPOLATION_FACTOR) + ((fMax * 0.4f) - 0.25f)) * DRAG_RATE;
        CircularProgressDrawable circularProgressDrawable4 = this.mProgress;
        circularProgressDrawable4.f2742d.f2758g = f11;
        circularProgressDrawable4.invalidateSelf();
        setTargetOffsetTopAndBottom(i10 - this.mCurrentTargetOffsetTop);
    }

    public boolean canChildScrollUp() {
        SwipeRefreshLayout$OnChildScrollUpCallback swipeRefreshLayout$OnChildScrollUpCallback = this.mChildScrollUpCallback;
        if (swipeRefreshLayout$OnChildScrollUpCallback != null) {
            return swipeRefreshLayout$OnChildScrollUpCallback.a();
        }
        View view = this.mTarget;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void d(boolean z5, boolean z6) {
        if (this.mRefreshing != z5) {
            this.mNotify = z6;
            a();
            this.mRefreshing = z5;
            if (!z5) {
                startScaleDownAnimation(this.mRefreshListener);
                return;
            }
            int i7 = this.mCurrentTargetOffsetTop;
            Animation.AnimationListener animationListener = this.mRefreshListener;
            this.mFrom = i7;
            this.mAnimateToCorrectPosition.reset();
            this.mAnimateToCorrectPosition.setDuration(200L);
            this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
            if (animationListener != null) {
                this.mCircleView.f2739d = animationListener;
            }
            this.mCircleView.clearAnimation();
            this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f7, boolean z5) {
        return this.mNestedScrollingChildHelper.a(f2, f7, z5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f7) {
        return this.mNestedScrollingChildHelper.b(f2, f7);
    }

    public boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2, int i11) {
        return i11 == 0 && dispatchNestedPreScroll(i7, i10, iArr, iArr2);
    }

    public void dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr, int i13, @NonNull int[] iArr2) {
        if (i13 == 0) {
            this.mNestedScrollingChildHelper.d(i7, i10, i11, i12, iArr, i13, iArr2);
        }
    }

    public final void e(float f2) {
        float f7 = this.mInitialDownY;
        float f10 = f2 - f7;
        int i7 = this.mTouchSlop;
        if (f10 <= i7 || this.mIsBeingDragged) {
            return;
        }
        this.mInitialMotionY = f7 + i7;
        this.mIsBeingDragged = true;
        this.mProgress.setAlpha(STARTING_PROGRESS_ALPHA);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i10) {
        int i11 = this.mCircleViewIndex;
        if (i11 < 0) {
            return i10;
        }
        if (i10 == i7 - 1) {
            return i11;
        }
        return i10 >= i11 ? i10 + 1 : i10;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.mNestedScrollingParentHelper;
        return nestedScrollingParentHelper.f1602b | nestedScrollingParentHelper.f1601a;
    }

    public int getProgressCircleDiameter() {
        return this.mCircleDiameter;
    }

    public int getProgressViewEndOffset() {
        return this.mSpinnerOffsetEnd;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    public boolean hasNestedScrollingParent(int i7) {
        return i7 == 0 && hasNestedScrollingParent();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.f1599d;
    }

    public boolean isRefreshing() {
        return this.mRefreshing;
    }

    public void moveToStart(float f2) {
        int i7 = this.mFrom;
        setTargetOffsetTopAndBottom((i7 + ((int) ((this.mOriginalOffsetTop - i7) * f2))) - this.mCircleView.getTop());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a();
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (isEnabled() && !this.mReturningToStart && !canChildScrollUp() && !this.mRefreshing && !this.mNestedScrollInProgress) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.mIsBeingDragged = false;
                    this.mActivePointerId = -1;
                } else if (actionMasked == 2) {
                    int i7 = this.mActivePointerId;
                    if (i7 == -1) {
                        Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i7);
                    if (iFindPointerIndex >= 0) {
                        e(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.mIsBeingDragged = false;
                    this.mActivePointerId = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
                        this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.mIsBeingDragged;
            }
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.mActivePointerId = pointerId;
            this.mIsBeingDragged = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.mInitialDownY = motionEvent.getY(iFindPointerIndex2);
                return this.mIsBeingDragged;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.mTarget == null) {
            a();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.mCircleView.getMeasuredWidth();
        int measuredHeight2 = this.mCircleView.getMeasuredHeight();
        int i13 = measuredWidth / 2;
        int i14 = measuredWidth2 / 2;
        int i15 = this.mCurrentTargetOffsetTop;
        this.mCircleView.layout(i13 - i14, i15, i13 + i14, measuredHeight2 + i15);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.mTarget == null) {
            a();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
        this.mCircleViewIndex = -1;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == this.mCircleView) {
                this.mCircleViewIndex = i11;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f7, boolean z5) {
        return dispatchNestedFling(f2, f7, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f7) {
        return dispatchNestedPreFling(f2, f7);
    }

    @Override // androidx.core.view.r
    public void onNestedPreScroll(View view, int i7, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            onNestedPreScroll(view, i7, i10, iArr);
        }
    }

    @Override // androidx.core.view.s
    public void onNestedScroll(@NonNull View view, int i7, int i10, int i11, int i12, int i13, @NonNull int[] iArr) {
        if (i13 != 0) {
            return;
        }
        int i14 = iArr[1];
        dispatchNestedScroll(i7, i10, i11, i12, this.mParentOffsetInWindow, i13, iArr);
        int i15 = i12 - (iArr[1] - i14);
        int i16 = i15 == 0 ? i12 + this.mParentOffsetInWindow[1] : i15;
        if (i16 >= 0 || canChildScrollUp()) {
            return;
        }
        float fAbs = this.mTotalUnconsumed + Math.abs(i16);
        this.mTotalUnconsumed = fAbs;
        c(fAbs);
        iArr[1] = iArr[1] + i15;
    }

    @Override // androidx.core.view.r
    public void onNestedScrollAccepted(View view, View view2, int i7, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        setRefreshing(hVar.f2780d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new h(super.onSaveInstanceState(), this.mRefreshing);
    }

    @Override // androidx.core.view.r
    public boolean onStartNestedScroll(View view, View view2, int i7, int i10) {
        if (i10 == 0) {
            return onStartNestedScroll(view, view2, i7);
        }
        return false;
    }

    @Override // androidx.core.view.r
    public void onStopNestedScroll(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (isEnabled() && !this.mReturningToStart && !canChildScrollUp() && !this.mRefreshing && !this.mNestedScrollInProgress) {
            if (actionMasked == 0) {
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsBeingDragged = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex < 0) {
                    Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.mIsBeingDragged) {
                    float y5 = (motionEvent.getY(iFindPointerIndex) - this.mInitialMotionY) * DRAG_RATE;
                    this.mIsBeingDragged = false;
                    b(y5);
                }
                this.mActivePointerId = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex2 < 0) {
                    Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y8 = motionEvent.getY(iFindPointerIndex2);
                e(y8);
                if (this.mIsBeingDragged) {
                    float f2 = (y8 - this.mInitialMotionY) * DRAG_RATE;
                    if (f2 > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        c(f2);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.mActivePointerId = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    public void reset() {
        this.mCircleView.clearAnimation();
        this.mProgress.stop();
        this.mCircleView.setVisibility(8);
        setColorViewAlpha(255);
        if (this.mScale) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
        }
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public void setAnimationProgress(float f2) {
        this.mCircleView.setScaleX(f2);
        this.mCircleView.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        a();
        CircularProgressDrawable circularProgressDrawable = this.mProgress;
        c cVar = circularProgressDrawable.f2742d;
        cVar.f2760i = iArr;
        cVar.a(0);
        cVar.a(0);
        circularProgressDrawable.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr2[i7] = context.getColor(iArr[i7]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i7) {
        this.mTotalDragDistance = i7;
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        if (z5) {
            return;
        }
        reset();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z5) {
        this.mEnableLegacyRequestDisallowInterceptTouch = z5;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        NestedScrollingChildHelper nestedScrollingChildHelper = this.mNestedScrollingChildHelper;
        if (nestedScrollingChildHelper.f1599d) {
            ViewGroup viewGroup = nestedScrollingChildHelper.f1598c;
            WeakHashMap weakHashMap = u0.f1729a;
            l0.o(viewGroup);
        }
        nestedScrollingChildHelper.f1599d = z5;
    }

    public void setOnChildScrollUpCallback(SwipeRefreshLayout$OnChildScrollUpCallback swipeRefreshLayout$OnChildScrollUpCallback) {
        this.mChildScrollUpCallback = swipeRefreshLayout$OnChildScrollUpCallback;
    }

    public void setOnRefreshListener(SwipeRefreshLayout$OnRefreshListener swipeRefreshLayout$OnRefreshListener) {
        this.mListener = swipeRefreshLayout$OnRefreshListener;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i7) {
        setProgressBackgroundColorSchemeResource(i7);
    }

    public void setProgressBackgroundColorSchemeColor(int i7) {
        this.mCircleView.setBackgroundColor(i7);
    }

    public void setProgressBackgroundColorSchemeResource(int i7) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i7));
    }

    public void setProgressViewEndTarget(boolean z5, int i7) {
        this.mSpinnerOffsetEnd = i7;
        this.mScale = z5;
        this.mCircleView.invalidate();
    }

    public void setProgressViewOffset(boolean z5, int i7, int i10) {
        this.mScale = z5;
        this.mOriginalOffsetTop = i7;
        this.mSpinnerOffsetEnd = i10;
        this.mUsingCustomStart = true;
        reset();
        this.mRefreshing = false;
    }

    public void setRefreshing(boolean z5) {
        if (!z5 || this.mRefreshing == z5) {
            d(z5, false);
            return;
        }
        this.mRefreshing = z5;
        setTargetOffsetTopAndBottom((!this.mUsingCustomStart ? this.mSpinnerOffsetEnd + this.mOriginalOffsetTop : this.mSpinnerOffsetEnd) - this.mCurrentTargetOffsetTop);
        this.mNotify = false;
        Animation.AnimationListener animationListener = this.mRefreshListener;
        this.mCircleView.setVisibility(0);
        this.mProgress.setAlpha(255);
        g gVar = new g(this, 1);
        this.mScaleAnimation = gVar;
        gVar.setDuration(this.mMediumAnimationDuration);
        if (animationListener != null) {
            this.mCircleView.f2739d = animationListener;
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleAnimation);
    }

    public void setSize(int i7) {
        if (i7 == 0 || i7 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i7 == 0) {
                this.mCircleDiameter = (int) (displayMetrics.density * 56.0f);
            } else {
                this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
            }
            this.mCircleView.setImageDrawable(null);
            this.mProgress.c(i7);
            this.mCircleView.setImageDrawable(this.mProgress);
        }
    }

    public void setSlingshotDistance(int i7) {
        this.mCustomSlingshotDistance = i7;
    }

    public void setTargetOffsetTopAndBottom(int i7) {
        this.mCircleView.bringToFront();
        CircleImageView circleImageView = this.mCircleView;
        WeakHashMap weakHashMap = u0.f1729a;
        circleImageView.offsetTopAndBottom(i7);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public boolean startNestedScroll(int i7, int i10) {
        return i10 == 0 && startNestedScroll(i7);
    }

    public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        g gVar = new g(this, 2);
        this.mScaleDownAnimation = gVar;
        gVar.setDuration(150L);
        CircleImageView circleImageView = this.mCircleView;
        circleImageView.f2739d = animationListener;
        circleImageView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    public void stopNestedScroll(int i7) {
        if (i7 == 0) {
            stopNestedScroll();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.c(i7, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.f(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        if (i10 > 0) {
            float f2 = this.mTotalUnconsumed;
            if (f2 > 0.0f) {
                float f7 = i10;
                if (f7 > f2) {
                    iArr[1] = (int) f2;
                    this.mTotalUnconsumed = 0.0f;
                } else {
                    this.mTotalUnconsumed = f2 - f7;
                    iArr[1] = i10;
                }
                c(this.mTotalUnconsumed);
            }
        }
        if (this.mUsingCustomStart && i10 > 0 && this.mTotalUnconsumed == 0.0f && Math.abs(i10 - iArr[1]) > 0) {
            this.mCircleView.setVisibility(8);
        }
        int[] iArr2 = this.mParentScrollConsumed;
        if (dispatchNestedPreScroll(i7 - iArr[0], i10 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.mNestedScrollingParentHelper.f1601a = i7;
        startNestedScroll(i7 & 2);
        this.mTotalUnconsumed = 0.0f;
        this.mNestedScrollInProgress = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return (!isEnabled() || this.mReturningToStart || this.mRefreshing || (i7 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.f1601a = 0;
        this.mNestedScrollInProgress = false;
        float f2 = this.mTotalUnconsumed;
        if (f2 > 0.0f) {
            b(f2);
            this.mTotalUnconsumed = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return this.mNestedScrollingChildHelper.g(i7, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.h(0);
    }

    public boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr, int i13) {
        return i13 == 0 && this.mNestedScrollingChildHelper.d(i7, i10, i11, i12, iArr, i13, null);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr) {
        return this.mNestedScrollingChildHelper.d(i7, i10, i11, i12, iArr, 0, null);
    }

    @Override // androidx.core.view.r
    public void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i7, i10, i11, i12, i13, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        onNestedScroll(view, i7, i10, i11, i12, 0, this.mNestedScrollingV2ConsumedCompat);
    }
}
