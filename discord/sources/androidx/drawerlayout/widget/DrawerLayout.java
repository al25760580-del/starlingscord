package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.l0;
import androidx.core.view.u0;
import androidx.customview.widget.ViewDragHelper;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import xr.m;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.drawerlayout.widget.DrawerLayout";
    private static final boolean ALLOW_EDGE_LOCK = false;
    static final boolean CAN_HIDE_DESCENDANTS;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "DrawerLayout";
    private static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    private static boolean sEdgeSizeUsingSystemGestureInsets;
    private final AccessibilityViewCommand mActionDismiss;
    private final ChildAccessibilityDelegate mChildAccessibilityDelegate;
    private Rect mChildHitRect;
    private Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final ViewDragCallback mLeftCallback;
    private final ViewDragHelper mLeftDragger;
    private DrawerListener mListener;
    private List<DrawerListener> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final ArrayList<View> mNonDrawerViews;
    private final ViewDragCallback mRightCallback;
    private final ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;
    private static final int[] THEME_ATTRS = {R.attr.colorPrimaryDark};
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};

    public static final class ChildAccessibilityDelegate extends androidx.core.view.b {
        @Override // androidx.core.view.b
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (DrawerLayout.includeChildForAccessibility(view)) {
                return;
            }
            accessibilityNodeInfoCompat.f1613a.setParent(null);
        }
    }

    public interface DrawerListener {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f2);

        void onDrawerStateChanged(int i7);
    }

    public class ViewDragCallback extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewDragHelper f1975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f1976c = new f(this);

        public ViewDragCallback(int i7) {
            this.f1974a = i7;
        }

        @Override // xr.m
        public final void G(int i7, int i10) {
            int i11 = i7 & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewFindDrawerWithGravity = i11 == 1 ? drawerLayout.findDrawerWithGravity(3) : drawerLayout.findDrawerWithGravity(5);
            if (viewFindDrawerWithGravity == null || drawerLayout.getDrawerLockMode(viewFindDrawerWithGravity) != 0) {
                return;
            }
            this.f1975b.b(i10, viewFindDrawerWithGravity);
        }

        @Override // xr.m
        public final void H() {
            DrawerLayout.this.postDelayed(this.f1976c, 160L);
        }

        @Override // xr.m
        public final void I(int i7, View view) {
            ((d) view.getLayoutParams()).f1983c = false;
            int i10 = this.f1974a == 3 ? 5 : 3;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewFindDrawerWithGravity = drawerLayout.findDrawerWithGravity(i10);
            if (viewFindDrawerWithGravity != null) {
                drawerLayout.closeDrawer(viewFindDrawerWithGravity);
            }
        }

        @Override // xr.m
        public final void J(int i7) {
            DrawerLayout.this.updateDrawerState(i7, this.f1975b.f1809t);
        }

        @Override // xr.m
        public final void K(View view, int i7, int i10) {
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            float width2 = (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3) ? i7 + width : drawerLayout.getWidth() - i7) / width;
            drawerLayout.setDrawerViewOffset(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            drawerLayout.invalidate();
        }

        @Override // xr.m
        public final void L(float f2, float f7, View view) {
            int i7;
            DrawerLayout drawerLayout = DrawerLayout.this;
            float drawerViewOffset = drawerLayout.getDrawerViewOffset(view);
            int width = view.getWidth();
            if (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3)) {
                i7 = (f2 > 0.0f || (f2 == 0.0f && drawerViewOffset > 0.5f)) ? 0 : -width;
            } else {
                int width2 = drawerLayout.getWidth();
                if (f2 < 0.0f || (f2 == 0.0f && drawerViewOffset > 0.5f)) {
                    width2 -= width;
                }
                i7 = width2;
            }
            this.f1975b.q(i7, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // xr.m
        public final boolean W(int i7, View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            return drawerLayout.isDrawerView(view) && drawerLayout.checkDrawerViewAbsoluteGravity(view, this.f1974a) && drawerLayout.getDrawerLockMode(view) == 0;
        }

        @Override // xr.m
        public final int d(int i7, View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i7, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i7, width));
        }

        @Override // xr.m
        public final int e(int i7, View view) {
            return view.getTop();
        }

        @Override // xr.m
        public final int w(View view) {
            if (DrawerLayout.this.isDrawerView(view)) {
                return view.getWidth();
            }
            return 0;
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        CAN_HIDE_DESCENDANTS = true;
        SET_DRAWER_SHADOW_FROM_ELEVATION = true;
        sEdgeSizeUsingSystemGestureInsets = i7 >= 29;
    }

    public DrawerLayout(ReactContext reactContext) {
        super(reactContext, null, com.discord.R.attr.drawerLayoutStyle);
        this.mChildAccessibilityDelegate = new ChildAccessibilityDelegate();
        this.mScrimColor = DEFAULT_SCRIM_COLOR;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        this.mActionDismiss = new a(this);
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f2) + 0.5f);
        float f7 = f2 * 400.0f;
        ViewDragCallback viewDragCallback = new ViewDragCallback(3);
        this.mLeftCallback = viewDragCallback;
        ViewDragCallback viewDragCallback2 = new ViewDragCallback(5);
        this.mRightCallback = viewDragCallback2;
        ViewDragHelper viewDragHelper = new ViewDragHelper(getContext(), this, viewDragCallback);
        viewDragHelper.f1793b = (int) (viewDragHelper.f1793b * 1.0f);
        this.mLeftDragger = viewDragHelper;
        viewDragHelper.f1806q = 1;
        viewDragHelper.f1803n = f7;
        viewDragCallback.f1975b = viewDragHelper;
        ViewDragHelper viewDragHelper2 = new ViewDragHelper(getContext(), this, viewDragCallback2);
        viewDragHelper2.f1793b = (int) (1.0f * viewDragHelper2.f1793b);
        this.mRightDragger = viewDragHelper2;
        viewDragHelper2.f1806q = 2;
        viewDragHelper2.f1803n = f7;
        viewDragCallback2.f1975b = viewDragHelper2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = u0.f1729a;
        setImportantForAccessibility(1);
        u0.p(this, new c(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = reactContext.obtainStyledAttributes(THEME_ATTRS);
            try {
                this.mStatusBarBackground = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = reactContext.obtainStyledAttributes(null, i2.a.f11382a, com.discord.R.attr.drawerLayoutStyle, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.mDrawerElevation = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.mDrawerElevation = getResources().getDimension(com.discord.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.mNonDrawerViews = new ArrayList<>();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th3;
        }
    }

    public static String gravityToString(int i7) {
        if ((i7 & 3) == 3) {
            return "LEFT";
        }
        return (i7 & 5) == 5 ? "RIGHT" : Integer.toHexString(i7);
    }

    public static boolean includeChildForAccessibility(View view) {
        WeakHashMap weakHashMap = u0.f1729a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    public final void a() {
        Drawable drawable;
        Drawable drawable2;
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        WeakHashMap weakHashMap = u0.f1729a;
        int layoutDirection = getLayoutDirection();
        if (layoutDirection == 0) {
            Drawable drawable3 = this.mShadowStart;
            if (drawable3 != null) {
                if (drawable3.isAutoMirrored()) {
                    drawable3.setLayoutDirection(layoutDirection);
                }
                drawable = this.mShadowStart;
            } else {
                drawable = this.mShadowLeft;
            }
        } else {
            Drawable drawable4 = this.mShadowEnd;
            if (drawable4 != null) {
                if (drawable4.isAutoMirrored()) {
                    drawable4.setLayoutDirection(layoutDirection);
                }
                drawable = this.mShadowEnd;
            } else {
                drawable = this.mShadowLeft;
            }
        }
        this.mShadowLeftResolved = drawable;
        int layoutDirection2 = getLayoutDirection();
        if (layoutDirection2 == 0) {
            Drawable drawable5 = this.mShadowEnd;
            if (drawable5 != null) {
                if (drawable5.isAutoMirrored()) {
                    drawable5.setLayoutDirection(layoutDirection2);
                }
                drawable2 = this.mShadowEnd;
            } else {
                drawable2 = this.mShadowRight;
            }
        } else {
            Drawable drawable6 = this.mShadowStart;
            if (drawable6 != null) {
                if (drawable6.isAutoMirrored()) {
                    drawable6.setLayoutDirection(layoutDirection2);
                }
                drawable2 = this.mShadowStart;
            } else {
                drawable2 = this.mShadowRight;
            }
        }
        this.mShadowRightResolved = drawable2;
    }

    public void addDrawerListener(@NonNull DrawerListener drawerListener) {
        if (drawerListener == null) {
            return;
        }
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i7, int i10) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (!isDrawerView(childAt)) {
                this.mNonDrawerViews.add(childAt);
            } else if (isDrawerOpen(childAt)) {
                childAt.addFocusables(arrayList, i7, i10);
                z5 = true;
            }
        }
        if (!z5) {
            int size = this.mNonDrawerViews.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = this.mNonDrawerViews.get(i12);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i7, i10);
                }
            }
        }
        this.mNonDrawerViews.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            WeakHashMap weakHashMap = u0.f1729a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = u0.f1729a;
            view.setImportantForAccessibility(1);
        }
        if (CAN_HIDE_DESCENDANTS) {
            return;
        }
        u0.p(view, this.mChildAccessibilityDelegate);
    }

    public final void b(View view) {
        androidx.core.view.accessibility.a aVar = androidx.core.view.accessibility.a.f1622m;
        u0.m(aVar.a(), view);
        u0.j(0, view);
        if (!isDrawerOpen(view) || getDrawerLockMode(view) == 2) {
            return;
        }
        u0.n(view, aVar, null, this.mActionDismiss);
    }

    public final void c(View view, boolean z5) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((z5 || isDrawerView(childAt)) && !(z5 && childAt == view)) {
                WeakHashMap weakHashMap = u0.f1729a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = u0.f1729a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public void cancelChildViewTouch() {
        if (this.mChildrenCanceledTouch) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.mChildrenCanceledTouch = true;
    }

    public boolean checkDrawerViewAbsoluteGravity(View view, int i7) {
        return (getDrawerViewAbsoluteGravity(view) & i7) == i7;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    public void close() {
        closeDrawer(8388611);
    }

    public void closeDrawer(@NonNull View view) {
        closeDrawer(view, true);
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            fMax = Math.max(fMax, ((d) getChildAt(i7).getLayoutParams()).f1982b);
        }
        this.mScrimOpacity = fMax;
        boolean zG = this.mLeftDragger.g();
        boolean zG2 = this.mRightDragger.g();
        if (zG || zG2) {
            WeakHashMap weakHashMap = u0.f1729a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.mScrimOpacity <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt = getChildAt(i7);
            if (this.mChildHitRect == null) {
                this.mChildHitRect = new Rect();
            }
            childAt.getHitRect(this.mChildHitRect);
            if (this.mChildHitRect.contains((int) x5, (int) y5) && !isContentView(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.mChildInvertedMatrix == null) {
                            this.mChildInvertedMatrix = new Matrix();
                        }
                        matrix.invert(this.mChildInvertedMatrix);
                        motionEventObtain.transform(this.mChildInvertedMatrix);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    public void dispatchOnDrawerClosed(View view) {
        View rootView;
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f1984d & 1) == 1) {
            dVar.f1984d = 0;
            List<DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerClosed(view);
                }
            }
            c(view, false);
            b(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void dispatchOnDrawerOpened(View view) {
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f1984d & 1) == 0) {
            dVar.f1984d = 1;
            List<DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerOpened(view);
                }
            }
            c(view, true);
            b(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void dispatchOnDrawerSlide(View view, float f2) {
        List<DrawerListener> list = this.mListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mListeners.get(size).onDrawerSlide(view, f2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zIsContentView = isContentView(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i7 = 0;
        if (zIsContentView) {
            int childCount = getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i10) {
                            i10 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i10, 0, width, getHeight());
            i7 = i10;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f2 = this.mScrimOpacity;
        if (f2 > 0.0f && zIsContentView) {
            int i12 = this.mScrimColor;
            this.mScrimPaint.setColor((i12 & 16777215) | (((int) ((((-16777216) & i12) >>> 24) * f2)) << 24));
            canvas.drawRect(i7, 0.0f, width, getHeight(), this.mScrimPaint);
            return zDrawChild;
        }
        if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.mLeftDragger.f1804o, 1.0f));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (fMax * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
            return zDrawChild;
        }
        if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.mRightDragger.f1804o, 1.0f));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (fMax2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return zDrawChild;
    }

    public View findDrawerWithGravity(int i7) {
        WeakHashMap weakHashMap = u0.f1729a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((((d) childAt.getLayoutParams()).f1984d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -1);
        dVar.f1981a = 0;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            d dVar2 = new d(dVar);
            dVar2.f1981a = 0;
            dVar2.f1981a = dVar.f1981a;
            return dVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            d dVar3 = new d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar3.f1981a = 0;
            return dVar3;
        }
        d dVar4 = new d(layoutParams);
        dVar4.f1981a = 0;
        return dVar4;
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    public int getDrawerLockMode(int i7) {
        WeakHashMap weakHashMap = u0.f1729a;
        int layoutDirection = getLayoutDirection();
        if (i7 == 3) {
            int i10 = this.mLockModeLeft;
            if (i10 != 3) {
                return i10;
            }
            int i11 = layoutDirection == 0 ? this.mLockModeStart : this.mLockModeEnd;
            if (i11 != 3) {
                return i11;
            }
            return 0;
        }
        if (i7 == 5) {
            int i12 = this.mLockModeRight;
            if (i12 != 3) {
                return i12;
            }
            int i13 = layoutDirection == 0 ? this.mLockModeEnd : this.mLockModeStart;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        }
        if (i7 == 8388611) {
            int i14 = this.mLockModeStart;
            if (i14 != 3) {
                return i14;
            }
            int i15 = layoutDirection == 0 ? this.mLockModeLeft : this.mLockModeRight;
            if (i15 != 3) {
                return i15;
            }
            return 0;
        }
        if (i7 != 8388613) {
            return 0;
        }
        int i16 = this.mLockModeEnd;
        if (i16 != 3) {
            return i16;
        }
        int i17 = layoutDirection == 0 ? this.mLockModeRight : this.mLockModeLeft;
        if (i17 != 3) {
            return i17;
        }
        return 0;
    }

    public CharSequence getDrawerTitle(int i7) {
        WeakHashMap weakHashMap = u0.f1729a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        if (absoluteGravity == 3) {
            return this.mTitleLeft;
        }
        if (absoluteGravity == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    public int getDrawerViewAbsoluteGravity(View view) {
        int i7 = ((d) view.getLayoutParams()).f1981a;
        WeakHashMap weakHashMap = u0.f1729a;
        return Gravity.getAbsoluteGravity(i7, getLayoutDirection());
    }

    public float getDrawerViewOffset(View view) {
        return ((d) view.getLayoutParams()).f1982b;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    public boolean isContentView(View view) {
        return ((d) view.getLayoutParams()).f1981a == 0;
    }

    public boolean isDrawerOpen(@NonNull View view) {
        if (isDrawerView(view)) {
            return (((d) view.getLayoutParams()).f1984d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerView(View view) {
        int i7 = ((d) view.getLayoutParams()).f1981a;
        WeakHashMap weakHashMap = u0.f1729a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public boolean isDrawerVisible(@NonNull View view) {
        if (isDrawerView(view)) {
            return ((d) view.getLayoutParams()).f1982b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isOpen() {
        return isDrawerOpen(8388611);
    }

    public void moveDrawerToOffset(View view, float f2) {
        float drawerViewOffset = getDrawerViewOffset(view);
        float width = view.getWidth();
        int i7 = ((int) (width * f2)) - ((int) (drawerViewOffset * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            i7 = -i7;
        }
        view.offsetLeftAndRight(i7);
        setDrawerViewOffset(view, f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        Object obj = this.mLastInsets;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        boolean zR = this.mLeftDragger.r(motionEvent) | this.mRightDragger.r(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                closeDrawers(true);
                this.mChildrenCanceledTouch = false;
            } else if (actionMasked == 2) {
                ViewDragHelper viewDragHelper = this.mLeftDragger;
                int length = viewDragHelper.f1795d.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if ((viewDragHelper.k & (1 << i7)) != 0) {
                        float f2 = viewDragHelper.f1797f[i7] - viewDragHelper.f1795d[i7];
                        float f7 = viewDragHelper.f1798g[i7] - viewDragHelper.f1796e[i7];
                        float f10 = (f7 * f7) + (f2 * f2);
                        int i10 = viewDragHelper.f1793b;
                        if (f10 > i10 * i10) {
                            ViewDragCallback viewDragCallback = this.mLeftCallback;
                            DrawerLayout.this.removeCallbacks(viewDragCallback.f1976c);
                            ViewDragCallback viewDragCallback2 = this.mRightCallback;
                            DrawerLayout.this.removeCallbacks(viewDragCallback2.f1976c);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                closeDrawers(true);
                this.mChildrenCanceledTouch = false;
            }
            z5 = false;
        } else {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            this.mInitialMotionX = x5;
            this.mInitialMotionY = y5;
            z5 = this.mScrimOpacity > 0.0f && (viewH = this.mLeftDragger.h((int) x5, (int) y5)) != null && isContentView(viewH);
            this.mChildrenCanceledTouch = false;
        }
        if (!zR && !z5) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (!((d) getChildAt(i11).getLayoutParams()).f1983c) {
                }
            }
            if (!this.mChildrenCanceledTouch) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 4 || findVisibleDrawer() == null) {
            return super.onKeyDown(i7, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 != 4) {
            return super.onKeyUp(i7, keyEvent);
        }
        View viewFindVisibleDrawer = findVisibleDrawer();
        if (viewFindVisibleDrawer != null && getDrawerLockMode(viewFindVisibleDrawer) == 0) {
            closeDrawers();
        }
        return viewFindVisibleDrawer != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        WindowInsets rootWindowInsets;
        float f2;
        int i13;
        boolean z6 = true;
        this.mInLayout = true;
        int i14 = i11 - i7;
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    int i16 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    childAt.layout(i16, ((ViewGroup.MarginLayoutParams) dVar).topMargin, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f7 = measuredWidth;
                        i13 = (-measuredWidth) + ((int) (dVar.f1982b * f7));
                        f2 = (measuredWidth + i13) / f7;
                    } else {
                        float f10 = measuredWidth;
                        int i17 = i14 - ((int) (dVar.f1982b * f10));
                        f2 = (i14 - i17) / f10;
                        i13 = i17;
                    }
                    boolean z7 = f2 != dVar.f1982b ? z6 : false;
                    int i18 = dVar.f1981a & 112;
                    if (i18 == 16) {
                        int i19 = i12 - i10;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                            if (i22 > i19 - i23) {
                                i20 = (i19 - i23) - measuredHeight;
                            }
                        }
                        childAt.layout(i13, i20, measuredWidth + i13, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        childAt.layout(i13, i24, measuredWidth + i13, measuredHeight + i24);
                    } else {
                        int i25 = i12 - i10;
                        childAt.layout(i13, (i25 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i13, i25 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    }
                    if (z7) {
                        setDrawerViewOffset(childAt, f2);
                    }
                    int i26 = dVar.f1982b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
            i15++;
            z6 = true;
        }
        if (sEdgeSizeUsingSystemGestureInsets && (rootWindowInsets = getRootWindowInsets()) != null) {
            Insets insetsJ = WindowInsetsCompat.g(null, rootWindowInsets).f1605a.j();
            ViewDragHelper viewDragHelper = this.mLeftDragger;
            viewDragHelper.f1804o = Math.max(viewDragHelper.f1805p, insetsJ.f1556a);
            ViewDragHelper viewDragHelper2 = this.mRightDragger;
            viewDragHelper2.f1804o = Math.max(viewDragHelper2.f1805p, insetsJ.f1558c);
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i7, int i10) {
        boolean z5;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.mLastInsets != null) {
            WeakHashMap weakHashMap = u0.f1729a;
            if (getFitsSystemWindows()) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        WeakHashMap weakHashMap2 = u0.f1729a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z6 = false;
        boolean z7 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (z5) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(dVar.f1981a, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.mLastInsets;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.mLastInsets;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) dVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (isContentView(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) dVar).leftMargin) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) dVar).topMargin) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, 1073741824));
                } else {
                    if (!isDrawerView(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i11 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
                        float fE = l0.e(childAt);
                        float f2 = this.mDrawerElevation;
                        if (fE != f2) {
                            l0.k(childAt, f2);
                        }
                    }
                    int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(childAt) & 7;
                    boolean z10 = drawerViewAbsoluteGravity == 3;
                    if ((z10 && z6) || (!z10 && z7)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + gravityToString(drawerViewAbsoluteGravity) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z10) {
                        z6 = true;
                    } else {
                        z7 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i7, this.mMinDrawerMargin + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin, ((ViewGroup.MarginLayoutParams) dVar).width), ViewGroup.getChildMeasureSpec(i10, ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, ((ViewGroup.MarginLayoutParams) dVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewFindDrawerWithGravity;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.f7578d);
        int i7 = eVar.f1985i;
        if (i7 != 0 && (viewFindDrawerWithGravity = findDrawerWithGravity(i7)) != null) {
            openDrawer(viewFindDrawerWithGravity);
        }
        int i10 = eVar.f1986v;
        if (i10 != 3) {
            setDrawerLockMode(i10, 3);
        }
        int i11 = eVar.f1987w;
        if (i11 != 3) {
            setDrawerLockMode(i11, 5);
        }
        int i12 = eVar.f1988x;
        if (i12 != 3) {
            setDrawerLockMode(i12, 8388611);
        }
        int i13 = eVar.f1989y;
        if (i13 != 3) {
            setDrawerLockMode(i13, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        a();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f1985i = 0;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            d dVar = (d) getChildAt(i7).getLayoutParams();
            int i10 = dVar.f1984d;
            boolean z5 = i10 == 1;
            boolean z6 = i10 == 2;
            if (z5 || z6) {
                eVar.f1985i = dVar.f1981a;
                break;
            }
        }
        eVar.f1986v = this.mLockModeLeft;
        eVar.f1987w = this.mLockModeRight;
        eVar.f1988x = this.mLockModeStart;
        eVar.f1989y = this.mLockModeEnd;
        return eVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        View viewFindOpenDrawer;
        this.mLeftDragger.k(motionEvent);
        this.mRightDragger.k(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            this.mInitialMotionX = x5;
            this.mInitialMotionY = y5;
            this.mChildrenCanceledTouch = false;
        } else if (action == 1) {
            float x6 = motionEvent.getX();
            float y8 = motionEvent.getY();
            View viewH = this.mLeftDragger.h((int) x6, (int) y8);
            if (viewH != null && isContentView(viewH)) {
                float f2 = x6 - this.mInitialMotionX;
                float f7 = y8 - this.mInitialMotionY;
                int i7 = this.mLeftDragger.f1793b;
                z5 = (f7 * f7) + (f2 * f2) >= ((float) (i7 * i7)) || (viewFindOpenDrawer = findOpenDrawer()) == null || getDrawerLockMode(viewFindOpenDrawer) == 2;
            }
            closeDrawers(z5);
        } else if (action == 3) {
            closeDrawers(true);
            this.mChildrenCanceledTouch = false;
        }
        return true;
    }

    public void open() {
        openDrawer(8388611);
    }

    public void openDrawer(@NonNull View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(@NonNull DrawerListener drawerListener) {
        List<DrawerListener> list;
        if (drawerListener == null || (list = this.mListeners) == null) {
            return;
        }
        list.remove(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (z5) {
            closeDrawers(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setChildInsets(Object obj, boolean z5) {
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z5;
        setWillNotDraw(!z5 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f2) {
        this.mDrawerElevation = f2;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (isDrawerView(childAt)) {
                float f7 = this.mDrawerElevation;
                WeakHashMap weakHashMap = u0.f1729a;
                l0.k(childAt, f7);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        DrawerListener drawerListener2 = this.mListener;
        if (drawerListener2 != null) {
            removeDrawerListener(drawerListener2);
        }
        if (drawerListener != null) {
            addDrawerListener(drawerListener);
        }
        this.mListener = drawerListener;
    }

    public void setDrawerLockMode(int i7) {
        setDrawerLockMode(i7, 3);
        setDrawerLockMode(i7, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i7) {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        if ((i7 & 8388611) == 8388611) {
            this.mShadowStart = drawable;
        } else if ((i7 & 8388613) == 8388613) {
            this.mShadowEnd = drawable;
        } else if ((i7 & 3) == 3) {
            this.mShadowLeft = drawable;
        } else if ((i7 & 5) != 5) {
            return;
        } else {
            this.mShadowRight = drawable;
        }
        a();
        invalidate();
    }

    public void setDrawerTitle(int i7, CharSequence charSequence) {
        WeakHashMap weakHashMap = u0.f1729a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        if (absoluteGravity == 3) {
            this.mTitleLeft = charSequence;
        } else if (absoluteGravity == 5) {
            this.mTitleRight = charSequence;
        }
    }

    public void setDrawerViewOffset(View view, float f2) {
        d dVar = (d) view.getLayoutParams();
        if (f2 == dVar.f1982b) {
            return;
        }
        dVar.f1982b = f2;
        dispatchOnDrawerSlide(view, f2);
    }

    public void setScrimColor(int i7) {
        this.mScrimColor = i7;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i7) {
        this.mStatusBarBackground = new ColorDrawable(i7);
        invalidate();
    }

    public void updateDrawerState(int i7, View view) {
        int i10;
        int i11 = this.mLeftDragger.f1792a;
        int i12 = this.mRightDragger.f1792a;
        if (i11 == 1 || i12 == 1) {
            i10 = 1;
        } else {
            i10 = 2;
            if (i11 != 2 && i12 != 2) {
                i10 = 0;
            }
        }
        if (view != null && i7 == 0) {
            float f2 = ((d) view.getLayoutParams()).f1982b;
            if (f2 == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (f2 == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i10 != this.mDrawerState) {
            this.mDrawerState = i10;
            List<DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerStateChanged(i10);
                }
            }
        }
    }

    public void closeDrawer(@NonNull View view, boolean z5) {
        if (!isDrawerView(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.mFirstLayout) {
            dVar.f1982b = 0.0f;
            dVar.f1984d = 0;
        } else if (z5) {
            dVar.f1984d |= 4;
            if (checkDrawerViewAbsoluteGravity(view, 3)) {
                this.mLeftDragger.s(view, -view.getWidth(), view.getTop());
            } else {
                this.mRightDragger.s(view, getWidth(), view.getTop());
            }
        } else {
            moveDrawerToOffset(view, 0.0f);
            updateDrawerState(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void closeDrawers(boolean z5) {
        int childCount = getChildCount();
        boolean zS = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            d dVar = (d) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z5 || dVar.f1983c)) {
                zS |= checkDrawerViewAbsoluteGravity(childAt, 3) ? this.mLeftDragger.s(childAt, -childAt.getWidth(), childAt.getTop()) : this.mRightDragger.s(childAt, getWidth(), childAt.getTop());
                dVar.f1983c = false;
            }
        }
        ViewDragCallback viewDragCallback = this.mLeftCallback;
        DrawerLayout.this.removeCallbacks(viewDragCallback.f1976c);
        ViewDragCallback viewDragCallback2 = this.mRightCallback;
        DrawerLayout.this.removeCallbacks(viewDragCallback2.f1976c);
        if (zS) {
            invalidate();
        }
    }

    public void openDrawer(@NonNull View view, boolean z5) {
        if (!isDrawerView(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.mFirstLayout) {
            dVar.f1982b = 1.0f;
            dVar.f1984d = 1;
            c(view, true);
            b(view);
        } else if (z5) {
            dVar.f1984d |= 2;
            if (checkDrawerViewAbsoluteGravity(view, 3)) {
                this.mLeftDragger.s(view, 0, view.getTop());
            } else {
                this.mRightDragger.s(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            moveDrawerToOffset(view, 1.0f);
            updateDrawerState(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void setDrawerLockMode(int i7, int i10) {
        View viewFindDrawerWithGravity;
        WeakHashMap weakHashMap = u0.f1729a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        if (i10 == 3) {
            this.mLockModeLeft = i7;
        } else if (i10 == 5) {
            this.mLockModeRight = i7;
        } else if (i10 == 8388611) {
            this.mLockModeStart = i7;
        } else if (i10 == 8388613) {
            this.mLockModeEnd = i7;
        }
        if (i7 != 0) {
            (absoluteGravity == 3 ? this.mLeftDragger : this.mRightDragger).a();
        }
        if (i7 != 1) {
            if (i7 == 2 && (viewFindDrawerWithGravity = findDrawerWithGravity(absoluteGravity)) != null) {
                openDrawer(viewFindDrawerWithGravity);
                return;
            }
            return;
        }
        View viewFindDrawerWithGravity2 = findDrawerWithGravity(absoluteGravity);
        if (viewFindDrawerWithGravity2 != null) {
            closeDrawer(viewFindDrawerWithGravity2);
        }
    }

    public void setStatusBarBackground(int i7) {
        this.mStatusBarBackground = i7 != 0 ? getContext().getDrawable(i7) : null;
        invalidate();
    }

    public boolean isDrawerVisible(int i7) {
        View viewFindDrawerWithGravity = findDrawerWithGravity(i7);
        if (viewFindDrawerWithGravity != null) {
            return isDrawerVisible(viewFindDrawerWithGravity);
        }
        return false;
    }

    public boolean isDrawerOpen(int i7) {
        View viewFindDrawerWithGravity = findDrawerWithGravity(i7);
        if (viewFindDrawerWithGravity != null) {
            return isDrawerOpen(viewFindDrawerWithGravity);
        }
        return false;
    }

    public void setDrawerShadow(int i7, int i10) {
        setDrawerShadow(getContext().getDrawable(i7), i10);
    }

    public int getDrawerLockMode(@NonNull View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((d) view.getLayoutParams()).f1981a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f1981a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        dVar.f1981a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return dVar;
    }

    public void setDrawerLockMode(int i7, @NonNull View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i7, ((d) view.getLayoutParams()).f1981a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void closeDrawer(int i7) {
        closeDrawer(i7, true);
    }

    public void closeDrawer(int i7, boolean z5) {
        View viewFindDrawerWithGravity = findDrawerWithGravity(i7);
        if (viewFindDrawerWithGravity != null) {
            closeDrawer(viewFindDrawerWithGravity, z5);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i7));
        }
    }

    public void openDrawer(int i7) {
        openDrawer(i7, true);
    }

    public void openDrawer(int i7, boolean z5) {
        View viewFindDrawerWithGravity = findDrawerWithGravity(i7);
        if (viewFindDrawerWithGravity != null) {
            openDrawer(viewFindDrawerWithGravity, z5);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i7));
        }
    }
}
