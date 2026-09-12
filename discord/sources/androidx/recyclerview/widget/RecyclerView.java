package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, androidx.core.view.q {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final String LOW_RES_ROTARY_ENCODER_FEATURE = "android.hardware.rotaryencoder.lowres";
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final StretchEdgeEffectFactory sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    DifferentialMotionFlingController mDifferentialMotionFlingController;
    private final DifferentialMotionFlingTarget mDifferentialMotionFlingTarget;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<ItemDecoration> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    boolean mLowResRotaryEncoderFeature;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List<OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList<OnItemTouchListener> mOnItemTouchListeners;
    final List<ViewHolder> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Recycler mRecycler;
    RecyclerListener mRecyclerListener;
    final List<RecyclerListener> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    float mScaledHorizontalScrollFactor;
    float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final ViewFlinger mViewFlinger;
    private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final ViewInfoStore mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;

    public static class AdapterDataObservable extends Observable {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i7, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).d(i7, i10);
            }
        }

        public final void d(int i7, int i10, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).b(i7, i10, obj);
            }
        }

        public final void e(int i7, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).c(i7, i10);
            }
        }

        public final void f(int i7, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).e(i7, i10);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).f();
            }
        }
    }

    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i7, int i10);
    }

    public static class EdgeEffectFactory {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private ItemAnimatorListener mListener = null;
        private ArrayList<ItemAnimatorFinishedListener> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        public interface ItemAnimatorFinishedListener {
            void a();
        }

        public interface ItemAnimatorListener {
            void a(ViewHolder viewHolder);
        }

        public static class ItemHolderInfo {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2494b;
        }

        public static int buildAdapterChangeFlagsForAnimations(ViewHolder viewHolder) {
            int i7 = viewHolder.mFlags;
            int i10 = i7 & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i7 & 4) == 0) {
                int oldPosition = viewHolder.getOldPosition();
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i10 | FLAG_MOVED;
                }
            }
            return i10;
        }

        public abstract boolean animateAppearance(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateChange(ViewHolder viewHolder, ViewHolder viewHolder2, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateDisappearance(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean animatePersistence(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
            return true;
        }

        public final void dispatchAnimationFinished(@NonNull ViewHolder viewHolder) {
            onAnimationFinished(viewHolder);
            ItemAnimatorListener itemAnimatorListener = this.mListener;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.a(viewHolder);
            }
        }

        public final void dispatchAnimationStarted(@NonNull ViewHolder viewHolder) {
            onAnimationStarted(viewHolder);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.mFinishedListeners.get(i7).a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(ViewHolder viewHolder);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
            boolean zIsRunning = isRunning();
            if (itemAnimatorFinishedListener != null) {
                if (!zIsRunning) {
                    itemAnimatorFinishedListener.a();
                    return zIsRunning;
                }
                this.mFinishedListeners.add(itemAnimatorFinishedListener);
            }
            return zIsRunning;
        }

        @NonNull
        public ItemHolderInfo obtainHolderInfo() {
            return new ItemHolderInfo();
        }

        public void onAnimationFinished(ViewHolder viewHolder) {
        }

        public void onAnimationStarted(@NonNull ViewHolder viewHolder) {
        }

        @NonNull
        public ItemHolderInfo recordPostLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder) {
            ItemHolderInfo itemHolderInfoObtainHolderInfo = obtainHolderInfo();
            itemHolderInfoObtainHolderInfo.getClass();
            View view = viewHolder.itemView;
            itemHolderInfoObtainHolderInfo.f2493a = view.getLeft();
            itemHolderInfoObtainHolderInfo.f2494b = view.getTop();
            view.getRight();
            view.getBottom();
            return itemHolderInfoObtainHolderInfo;
        }

        @NonNull
        public ItemHolderInfo recordPreLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder, int i7, @NonNull List<Object> list) {
            ItemHolderInfo itemHolderInfoObtainHolderInfo = obtainHolderInfo();
            itemHolderInfoObtainHolderInfo.getClass();
            View view = viewHolder.itemView;
            itemHolderInfoObtainHolderInfo.f2493a = view.getLeft();
            itemHolderInfoObtainHolderInfo.f2494b = view.getTop();
            view.getRight();
            view.getBottom();
            return itemHolderInfoObtainHolderInfo;
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        public void setListener(ItemAnimatorListener itemAnimatorListener) {
            this.mListener = itemAnimatorListener;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }

        public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder, List list) {
            return canReuseUpdatedViewHolder(viewHolder);
        }
    }

    public static abstract class ItemDecoration {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i7, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull State state) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).f2499d.getLayoutPosition(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        ViewBoundsCheck mHorizontalBoundCheck;
        private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        SmoothScroller mSmoothScroller;
        ViewBoundsCheck mVerticalBoundCheck;
        private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public interface LayoutPrefetchRegistry {
            void a(int i7, int i10);
        }

        public static class Properties {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2495a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2496b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f2497c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f2498d;
        }

        public LayoutManager() {
            d1 d1Var = new d1(this);
            this.mHorizontalBoundCheckCallback = d1Var;
            e1 e1Var = new e1(this);
            this.mVerticalBoundCheckCallback = e1Var;
            this.mHorizontalBoundCheck = new ViewBoundsCheck(d1Var);
            this.mVerticalBoundCheck = new ViewBoundsCheck(e1Var);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public static boolean b(int i7, int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (i11 > 0 && i7 != i11) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i7;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i7;
            }
            return true;
        }

        public static int chooseSize(int i7, int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i10, i11) : size;
            }
            return Math.min(size, Math.max(i10, i11));
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000c A[PHI: r3
          0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:6:0x000e  */
        @Deprecated
        public static int getChildMeasureSpec(int i7, int i10, int i11, boolean z5) {
            int i12 = i7 - i10;
            int i13 = 0;
            int iMax = Math.max(0, i12);
            if (z5) {
                if (i11 >= 0) {
                    i13 = 1073741824;
                } else {
                    i11 = 0;
                }
            } else if (i11 >= 0) {
                i13 = 1073741824;
            } else if (i11 == -1) {
                i11 = iMax;
                i13 = 1073741824;
            } else if (i11 == -2) {
                i13 = Integer.MIN_VALUE;
                i11 = iMax;
            } else {
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i11, i13);
        }

        public static Properties getProperties(@NonNull Context context, AttributeSet attributeSet, int i7, int i10) {
            Properties properties = new Properties();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2.a.f23587a, i7, i10);
            properties.f2495a = typedArrayObtainStyledAttributes.getInt(0, 1);
            properties.f2496b = typedArrayObtainStyledAttributes.getInt(10, 1);
            properties.f2497c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            properties.f2498d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return properties;
        }

        public final void a(View view, int i7, boolean z5) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z5 || childViewHolderInt.isRemoved()) {
                SimpleArrayMap simpleArrayMap = this.mRecyclerView.mViewInfoStore.f2551a;
                u1 u1VarA = (u1) simpleArrayMap.get(childViewHolderInt);
                if (u1VarA == null) {
                    u1VarA = u1.a();
                    simpleArrayMap.put(childViewHolderInt, u1VarA);
                }
                u1VarA.f2709a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.b(view, i7, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iJ = this.mChildHelper.j(view);
                if (i7 == -1) {
                    i7 = this.mChildHelper.e();
                }
                if (iJ == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(a3.e.i(this.mRecyclerView, sb2));
                }
                if (iJ != i7) {
                    this.mRecyclerView.mLayout.moveView(iJ, i7);
                }
            } else {
                this.mChildHelper.a(view, i7, false);
                layoutParams.f2501i = true;
                SmoothScroller smoothScroller = this.mSmoothScroller;
                if (smoothScroller != null && smoothScroller.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.f2502v) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "consuming pending invalidate on child " + layoutParams.f2499d);
                }
                childViewHolderInt.itemView.invalidate();
                layoutParams.f2502v = false;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@NonNull View view, int i7, LayoutParams layoutParams) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                SimpleArrayMap simpleArrayMap = this.mRecyclerView.mViewInfoStore.f2551a;
                u1 u1VarA = (u1) simpleArrayMap.get(childViewHolderInt);
                if (u1VarA == null) {
                    u1VarA = u1.a();
                    simpleArrayMap.put(childViewHolderInt, u1VarA);
                }
                u1VarA.f2709a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            this.mChildHelper.b(view, i7, layoutParams, childViewHolderInt.isRemoved());
        }

        public final void c(Recycler recycler, int i7, View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "ignoring view " + childViewHolderInt);
                    return;
                }
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i7);
                recycler.k(childViewHolderInt);
            } else {
                detachViewAt(i7);
                recycler.l(view);
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i7, int i10, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i7, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public int computeHorizontalScrollExtent(@NonNull State state) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull State state) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull State state) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                c(recycler, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@NonNull View view, @NonNull Recycler recycler) {
            c(recycler, this.mChildHelper.j(view), view);
        }

        public void detachAndScrapViewAt(int i7, @NonNull Recycler recycler) {
            c(recycler, i7, getChildAt(i7));
        }

        public void detachView(@NonNull View view) {
            int iJ = this.mChildHelper.j(view);
            if (iJ >= 0) {
                this.mChildHelper.c(iJ);
            }
        }

        public void detachViewAt(int i7) {
            getChildAt(i7);
            this.mChildHelper.c(i7);
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, recycler);
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(@NonNull View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f2447c.contains(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public View findViewByPosition(int i7) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i7 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f2527g || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f2500e.bottom;
        }

        public View getChildAt(int i7) {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.d(i7);
            }
            return null;
        }

        public int getChildCount() {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getDecoratedBottom(@NonNull View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f2500e;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f2500e;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f2447c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return this.mRecyclerView.getLayoutDirection();
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f2500e.left;
        }

        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            return recyclerView.getMinimumHeight();
        }

        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            return recyclerView.getMinimumWidth();
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            return recyclerView.getPaddingEnd();
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            return recyclerView.getPaddingStart();
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f2499d.getLayoutPosition();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f2500e.right;
        }

        public int getRowCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getSelectionModeForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f2500e.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z5, @NonNull Rect rect) {
            Matrix matrix;
            if (z5) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f2500e;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i7).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(a3.e.i(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
            }
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@NonNull Recycler recycler, @NonNull State state) {
            return false;
        }

        public boolean isLayoutReversed() {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            SmoothScroller smoothScroller = this.mSmoothScroller;
            return smoothScroller != null && smoothScroller.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z5, boolean z6) {
            boolean z7 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
            return z5 ? z7 : !z7;
        }

        public void layoutDecorated(@NonNull View view, int i7, int i10, int i11, int i12) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f2500e;
            view.layout(i7 + rect.left, i10 + rect.top, i11 - rect.right, i12 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i7, int i10, int i11, int i12) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f2500e;
            view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void measureChild(@NonNull View view, int i7, int i10) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i7;
            int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i10;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i11, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i12, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i7, int i10) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i7;
            int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i10;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i11, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i7, int i10) {
            View childAt = getChildAt(i7);
            if (childAt != null) {
                detachViewAt(i7);
                attachView(childAt, i10);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i7 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i7) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i7);
            }
        }

        public void offsetChildrenVertical(int i7) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i7);
            }
        }

        public void onAdapterChanged(Adapter adapter, Adapter adapter2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i7, int i10) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(@NonNull View view, int i7, @NonNull Recycler recycler, @NonNull State state) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, accessibilityNodeInfoCompat);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
                return;
            }
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper.f2447c.contains(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, accessibilityNodeInfoCompat);
        }

        public View onInterceptFocusSearch(@NonNull View view, int i7) {
            return null;
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i7, int i10) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i7, int i10, int i11) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i7, int i10) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i7, int i10) {
        }

        public void onLayoutChildren(Recycler recycler, State state) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(State state) {
        }

        public void onMeasure(@NonNull Recycler recycler, @NonNull State state, int i7, int i10) {
            this.mRecyclerView.defaultOnMeasure(i7, i10);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i7) {
        }

        public void onSmoothScrollerStopped(SmoothScroller smoothScroller) {
            if (this.mSmoothScroller == smoothScroller) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i7, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i7, bundle);
        }

        public boolean performAccessibilityActionForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, int i7, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.k(childCount);
            }
        }

        public void removeAndRecycleAllViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, recycler);
                }
            }
        }

        public void removeAndRecycleScrapInt(Recycler recycler) {
            ArrayList arrayList = recycler.f2503a;
            int size = arrayList.size();
            for (int i7 = size - 1; i7 >= 0; i7--) {
                View view = ((ViewHolder) arrayList.get(i7)).itemView;
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
                    if (itemAnimator != null) {
                        itemAnimator.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    recycler.k(childViewHolderInt2);
                }
            }
            arrayList.clear();
            ArrayList arrayList2 = recycler.f2504b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull Recycler recycler) {
            removeView(view);
            recycler.j(view);
        }

        public void removeAndRecycleViewAt(int i7, @NonNull Recycler recycler) {
            View childAt = getChildAt(i7);
            removeViewAt(i7);
            recycler.j(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            ChildHelper childHelper = this.mChildHelper;
            z0 z0Var = childHelper.f2445a;
            int i7 = childHelper.f2448d;
            if (i7 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i7 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                childHelper.f2448d = 1;
                childHelper.f2449e = view;
                int iIndexOfChild = z0Var.f2730a.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (childHelper.f2446b.K(iIndexOfChild)) {
                        childHelper.l(view);
                    }
                    z0Var.a(iIndexOfChild);
                }
            } finally {
                childHelper.f2448d = 0;
                childHelper.f2449e = null;
            }
        }

        public void removeViewAt(int i7) {
            if (getChildAt(i7) != null) {
                this.mChildHelper.k(i7);
            }
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:33:0x00be  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z5, boolean z6) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i7 = left - paddingLeft;
            int iMin = Math.min(0, i7);
            int i10 = top - paddingTop;
            int iMin2 = Math.min(0, i10);
            int i11 = iWidth - width;
            int iMax = Math.max(0, i11);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i7, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i11);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i10, iMax2);
            }
            int[] iArr = {iMax, iMin2};
            int i12 = iArr[0];
            int i13 = iArr[1];
            if (z6) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int paddingLeft2 = getPaddingLeft();
                    int paddingTop2 = getPaddingTop();
                    int width2 = getWidth() - getPaddingRight();
                    int height2 = getHeight() - getPaddingBottom();
                    Rect rect2 = this.mRecyclerView.mTempRect;
                    getDecoratedBoundsWithMargins(focusedChild, rect2);
                    if (rect2.left - i12 < width2 && rect2.right - i12 > paddingLeft2 && rect2.top - i13 < height2 && rect2.bottom - i13 > paddingTop2) {
                        if (i12 == 0) {
                        }
                        if (z5) {
                            recyclerView.scrollBy(i12, i13);
                        } else {
                            recyclerView.smoothScrollBy(i12, i13);
                        }
                        return true;
                    }
                }
            } else if (i12 == 0 || i13 != 0) {
                if (z5) {
                    recyclerView.scrollBy(i12, i13);
                } else {
                    recyclerView.smoothScrollBy(i12, i13);
                }
                return true;
            }
            return false;
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i7, Recycler recycler, State state) {
            return 0;
        }

        public void scrollToPosition(int i7) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.e(RecyclerView.TAG, "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i7, Recycler recycler, State state) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z5) {
            this.mAutoMeasure = z5;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z5) {
            if (z5 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z5;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.o();
                }
            }
        }

        public void setMeasureSpecs(int i7, int i10) {
            this.mWidth = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i7, int i10) {
            setMeasuredDimension(chooseSize(i7, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i10, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i7, int i10) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i7, i10);
                return;
            }
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i16 = rect.left;
                if (i16 < i14) {
                    i14 = i16;
                }
                int i17 = rect.right;
                if (i17 > i11) {
                    i11 = i17;
                }
                int i18 = rect.top;
                if (i18 < i12) {
                    i12 = i18;
                }
                int i19 = rect.bottom;
                if (i19 > i13) {
                    i13 = i19;
                }
            }
            this.mRecyclerView.mTempRect.set(i14, i12, i11, i13);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i7, i10);
        }

        public void setMeasurementCacheEnabled(boolean z5) {
            this.mMeasurementCacheEnabled = z5;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i7, int i10, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && b(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) layoutParams).width) && b(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i7, int i10, LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && b(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) layoutParams).width) && b(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i7) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.mSmoothScroller;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = smoothScroller;
            smoothScroller.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@NonNull View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            SmoothScroller smoothScroller = this.mSmoothScroller;
            if (smoothScroller != null) {
                smoothScroller.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i7) {
            a(view, i7, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i7) {
            a(view, i7, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z5 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z5 = false;
            }
            accessibilityEvent.setScrollable(z5);
            Adapter adapter = this.mRecyclerView.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.a(8192);
                accessibilityNodeInfoCompat.y(true);
                accessibilityNodeInfoCompat.l(67108864, true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.a(ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                accessibilityNodeInfoCompat.y(true);
                accessibilityNodeInfoCompat.l(67108864, true);
            }
            accessibilityNodeInfoCompat.f1613a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)));
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i7, int i10, Object obj) {
            onItemsUpdated(recyclerView, i7, i10);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull State state, @NonNull View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0065 A[PHI: r11
          0x0065: PHI (r11v8 int) = (r11v5 int), (r11v18 int) binds: [B:27:0x0081, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(@NonNull Recycler recycler, @NonNull State state, int i7, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            float f2;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i7 == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                } else {
                    paddingLeft = 0;
                }
            } else if (i7 != 8192) {
                paddingTop = 0;
                paddingLeft = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                } else {
                    paddingLeft = 0;
                }
            }
            if (paddingTop == 0 && paddingLeft == 0) {
                return false;
            }
            if (bundle != null) {
                f2 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f2 < 0.0f) {
                    if (!RecyclerView.sDebugAssertionsEnabled) {
                        return false;
                    }
                    throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f2 + ")");
                }
            } else {
                f2 = 1.0f;
            }
            if (Float.compare(f2, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f2) != 0 && Float.compare(0.0f, f2) != 0) {
                    paddingLeft = (int) (paddingLeft * f2);
                    paddingTop = (int) (paddingTop * f2);
                }
                this.mRecyclerView.smoothScrollBy(paddingLeft, paddingTop, null, Integer.MIN_VALUE, true);
                return true;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView.mAdapter;
            if (adapter == null) {
                return false;
            }
            if (i7 == 4096) {
                recyclerView.smoothScrollToPosition(adapter.getItemCount() - 1);
            } else if (i7 == 8192) {
                recyclerView.smoothScrollToPosition(0);
            }
            return true;
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i7, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i7, bundle);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int getChildMeasureSpec(int i7, int i10, int i11, int i12, boolean z5) {
            int iMax = Math.max(0, i7 - i11);
            if (z5) {
                if (i12 >= 0) {
                    i10 = 1073741824;
                } else if (i12 != -1 || (i10 != Integer.MIN_VALUE && (i10 == 0 || i10 != 1073741824))) {
                    i10 = 0;
                    i12 = 0;
                } else {
                    i12 = iMax;
                }
            } else if (i12 >= 0) {
                i10 = 1073741824;
            } else if (i12 == -1) {
                i12 = iMax;
            } else if (i12 != -2) {
                i10 = 0;
                i12 = 0;
            } else if (i10 == Integer.MIN_VALUE || i10 == 1073741824) {
                i12 = iMax;
                i10 = Integer.MIN_VALUE;
            } else {
                i12 = iMax;
                i10 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i12, i10);
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.r(g.a.a(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false));
        }

        public void setMeasuredDimension(int i7, int i10) {
            this.mRecyclerView.setMeasuredDimension(i7, i10);
        }

        public void attachView(@NonNull View view, int i7) {
            attachView(view, i7, (LayoutParams) view.getLayoutParams());
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z5) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z5, false);
        }
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(View view);

        void onChildViewDetachedFromWindow(View view);
    }

    public static abstract class OnFlingListener {
        public abstract boolean onFling(int i7, int i10);
    }

    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z5);

        void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class OnScrollListener {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i7) {
        }

        public void onScrolled(RecyclerView recyclerView, int i7, int i10) {
        }
    }

    public static class RecycledViewPool {
        private static final int DEFAULT_MAX_SCRAP = 5;
        SparseArray<f1> mScrap = new SparseArray<>();
        int mAttachCountForClearing = 0;
        Set<Adapter> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());

        public final f1 a(int i7) {
            f1 f1Var = this.mScrap.get(i7);
            if (f1Var != null) {
                return f1Var;
            }
            f1 f1Var2 = new f1();
            this.mScrap.put(i7, f1Var2);
            return f1Var2;
        }

        public void attach() {
            this.mAttachCountForClearing++;
        }

        public void attachForPoolingContainer(@NonNull Adapter adapter) {
            this.mAttachedAdaptersForPoolingContainer.add(adapter);
        }

        public void clear() {
            for (int i7 = 0; i7 < this.mScrap.size(); i7++) {
                f1 f1VarValueAt = this.mScrap.valueAt(i7);
                Iterator it = f1VarValueAt.f2603a.iterator();
                while (it.hasNext()) {
                    zs.a.i(((ViewHolder) it.next()).itemView);
                }
                f1VarValueAt.f2603a.clear();
            }
        }

        public void detach() {
            this.mAttachCountForClearing--;
        }

        public void detachForPoolingContainer(@NonNull Adapter adapter, boolean z5) {
            this.mAttachedAdaptersForPoolingContainer.remove(adapter);
            if (this.mAttachedAdaptersForPoolingContainer.size() != 0 || z5) {
                return;
            }
            for (int i7 = 0; i7 < this.mScrap.size(); i7++) {
                SparseArray<f1> sparseArray = this.mScrap;
                ArrayList arrayList = sparseArray.get(sparseArray.keyAt(i7)).f2603a;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    zs.a.i(((ViewHolder) arrayList.get(i10)).itemView);
                }
            }
        }

        public void factorInBindTime(int i7, long j) {
            f1 f1VarA = a(i7);
            f1VarA.f2606d = runningAverage(f1VarA.f2606d, j);
        }

        public void factorInCreateTime(int i7, long j) {
            f1 f1VarA = a(i7);
            f1VarA.f2605c = runningAverage(f1VarA.f2605c, j);
        }

        public ViewHolder getRecycledView(int i7) {
            f1 f1Var = this.mScrap.get(i7);
            if (f1Var == null) {
                return null;
            }
            ArrayList arrayList = f1Var.f2603a;
            if (arrayList.isEmpty()) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((ViewHolder) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (ViewHolder) arrayList.remove(size);
                }
            }
            return null;
        }

        public int getRecycledViewCount(int i7) {
            return a(i7).f2603a.size();
        }

        public void onAdapterChanged(Adapter adapter, Adapter adapter2, boolean z5) {
            if (adapter != null) {
                detach();
            }
            if (!z5 && this.mAttachCountForClearing == 0) {
                clear();
            }
            if (adapter2 != null) {
                attach();
            }
        }

        public void putRecycledView(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList arrayList = a(itemViewType).f2603a;
            if (this.mScrap.get(itemViewType).f2604b <= arrayList.size()) {
                zs.a.i(viewHolder.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(viewHolder)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        public long runningAverage(long j, long j5) {
            if (j == 0) {
                return j5;
            }
            return (j5 / 4) + ((j / 4) * 3);
        }

        public void setMaxRecycledViews(int i7, int i10) {
            f1 f1VarA = a(i7);
            f1VarA.f2604b = i10;
            ArrayList arrayList = f1VarA.f2603a;
            while (arrayList.size() > i10) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public int size() {
            int size = 0;
            for (int i7 = 0; i7 < this.mScrap.size(); i7++) {
                ArrayList arrayList = this.mScrap.valueAt(i7).f2603a;
                if (arrayList != null) {
                    size = arrayList.size() + size;
                }
            }
            return size;
        }

        public boolean willBindInTime(int i7, long j, long j5) {
            long j7 = a(i7).f2606d;
            return j7 == 0 || j + j7 < j5;
        }

        public boolean willCreateInTime(int i7, long j, long j5) {
            long j7 = a(i7).f2605c;
            return j7 == 0 || j + j7 < j5;
        }
    }

    public final class Recycler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f2503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f2504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f2505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f2506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RecycledViewPool f2509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ViewCacheExtension f2510h;

        public Recycler() {
            ArrayList arrayList = new ArrayList();
            this.f2503a = arrayList;
            this.f2504b = null;
            this.f2505c = new ArrayList();
            this.f2506d = Collections.unmodifiableList(arrayList);
            this.f2507e = 2;
            this.f2508f = 2;
        }

        public static void f(ViewGroup viewGroup, boolean z5) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    f((ViewGroup) childAt, true);
                }
            }
            if (z5) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void a(ViewHolder viewHolder, boolean z5) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            View view = viewHolder.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
            if (recyclerViewAccessibilityDelegate != null) {
                j1 j1Var = recyclerViewAccessibilityDelegate.f2541b;
                androidx.core.view.u0.p(view, j1Var != null ? (androidx.core.view.b) j1Var.f2623b.remove(view) : null);
            }
            if (z5) {
                RecyclerListener recyclerListener = recyclerView.mRecyclerListener;
                if (recyclerListener != null) {
                    recyclerListener.a();
                }
                int size = recyclerView.mRecyclerListeners.size();
                for (int i7 = 0; i7 < size; i7++) {
                    recyclerView.mRecyclerListeners.get(i7).a();
                }
                Adapter adapter = recyclerView.mAdapter;
                if (adapter != null) {
                    adapter.onViewRecycled(viewHolder);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(viewHolder);
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "dispatchViewRecycled: " + viewHolder);
                }
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            d().putRecycledView(viewHolder);
        }

        public final void b() {
            this.f2503a.clear();
            h();
        }

        public final int c(int i7) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i7 >= 0 && i7 < recyclerView.mState.b()) {
                return !recyclerView.mState.f2527g ? i7 : recyclerView.mAdapterHelper.f(i7, 0);
            }
            StringBuilder sbS = a3.e.s(i7, "invalid position ", ". State item count is ");
            sbS.append(recyclerView.mState.b());
            sbS.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbS.toString());
        }

        public final RecycledViewPool d() {
            if (this.f2509g == null) {
                this.f2509g = new RecycledViewPool();
                g();
            }
            return this.f2509g;
        }

        public final View e(int i7) {
            return m(i7, Long.MAX_VALUE).itemView;
        }

        public final void g() {
            if (this.f2509g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f2509g.attachForPoolingContainer(recyclerView.mAdapter);
            }
        }

        public final void h() {
            ArrayList arrayList = this.f2505c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                i(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = layoutPrefetchRegistryImpl.f2464c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                layoutPrefetchRegistryImpl.f2465d = 0;
            }
        }

        public final void i(int i7) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                kk.b.q(i7, "Recycling cached view at index ", RecyclerView.TAG);
            }
            ArrayList arrayList = this.f2505c;
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i7);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "CachedViewHolder to be recycled: " + viewHolder);
            }
            a(viewHolder, true);
            arrayList.remove(i7);
        }

        public final void j(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            k(childViewHolderInt);
            if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView.mItemAnimator.endAnimation(childViewHolderInt);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:58:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:61:0x00d8 A[LOOP:2: B:57:0x00cd->B:61:0x00d8, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:87:0x00db A[EDGE_INSN: B:87:0x00db->B:62:0x00db BREAK  A[LOOP:1: B:53:0x00b8->B:60:0x00d5], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x00db A[EDGE_INSN: B:88:0x00db->B:62:0x00db BREAK  A[LOOP:1: B:53:0x00b8->B:60:0x00d5, LOOP_LABEL: LOOP:1: B:53:0x00b8->B:60:0x00d5], SYNTHETIC] */
        public final void k(ViewHolder viewHolder) {
            boolean z5;
            int i7;
            int i10;
            GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl;
            int i11;
            int i12;
            boolean zIsScrap = viewHolder.isScrap();
            boolean z6 = false;
            boolean z7 = true;
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsScrap || viewHolder.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(viewHolder.isScrap());
                sb2.append(" isAttached:");
                sb2.append(viewHolder.itemView.getParent() != null);
                sb2.append(recyclerView.exceptionLabel());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (viewHolder.isTmpDetached()) {
                StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb3.append(viewHolder);
                throw new IllegalArgumentException(a3.e.i(recyclerView, sb3));
            }
            if (viewHolder.shouldIgnore()) {
                throw new IllegalArgumentException(a3.e.i(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            boolean zDoesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
            Adapter adapter = recyclerView.mAdapter;
            boolean z10 = adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder);
            boolean z11 = RecyclerView.sDebugAssertionsEnabled;
            ArrayList arrayList = this.f2505c;
            if (z11 && arrayList.contains(viewHolder)) {
                StringBuilder sb4 = new StringBuilder("cached view received recycle internal? ");
                sb4.append(viewHolder);
                throw new IllegalArgumentException(a3.e.i(recyclerView, sb4));
            }
            if (z10 || viewHolder.isRecyclable()) {
                if (this.f2508f <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                    z5 = false;
                } else {
                    int size = arrayList.size();
                    if (size >= this.f2508f && size > 0) {
                        i(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                        GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl2 = recyclerView.mPrefetchRegistry;
                        int i13 = viewHolder.mPosition;
                        if (layoutPrefetchRegistryImpl2.f2464c != null) {
                            int i14 = layoutPrefetchRegistryImpl2.f2465d * 2;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= i14) {
                                    i7 = size - 1;
                                    loop1: while (i7 >= 0) {
                                        i10 = ((ViewHolder) arrayList.get(i7)).mPosition;
                                        layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
                                        if (layoutPrefetchRegistryImpl.f2464c != null) {
                                            break;
                                        }
                                        i11 = layoutPrefetchRegistryImpl.f2465d * 2;
                                        i12 = 0;
                                        while (true) {
                                            if (i12 < i11) {
                                                break loop1;
                                            } else if (layoutPrefetchRegistryImpl.f2464c[i12] == i10) {
                                                break;
                                            } else {
                                                i12 += 2;
                                            }
                                        }
                                        i7--;
                                    }
                                    size = i7 + 1;
                                } else if (layoutPrefetchRegistryImpl2.f2464c[i15] != i13) {
                                    i15 += 2;
                                }
                            }
                        } else {
                            i7 = size - 1;
                            loop1: while (i7 >= 0) {
                                i10 = ((ViewHolder) arrayList.get(i7)).mPosition;
                                layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
                                if (layoutPrefetchRegistryImpl.f2464c != null) {
                                    break;
                                    break;
                                }
                                i11 = layoutPrefetchRegistryImpl.f2465d * 2;
                                i12 = 0;
                                while (true) {
                                    if (i12 < i11) {
                                        break loop1;
                                        break loop1;
                                    } else if (layoutPrefetchRegistryImpl.f2464c[i12] == i10) {
                                        break;
                                    } else {
                                        i12 += 2;
                                    }
                                }
                                i7--;
                            }
                            size = i7 + 1;
                        }
                    }
                    arrayList.add(size, viewHolder);
                    z5 = true;
                }
                if (z5) {
                    z7 = false;
                } else {
                    a(viewHolder, true);
                }
                z6 = z5;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.exceptionLabel());
                }
                z7 = false;
            }
            recyclerView.mViewInfoStore.d(viewHolder);
            if (z6 || z7 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            zs.a.i(viewHolder.itemView);
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
        }

        public final void l(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f2504b == null) {
                    this.f2504b = new ArrayList();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f2504b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(a3.e.i(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f2503a.add(childViewHolderInt);
        }

        /* JADX WARN: Code duplicated, block: B:106:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:121:0x021b  */
        /* JADX WARN: Code duplicated, block: B:123:0x0225  */
        /* JADX WARN: Code duplicated, block: B:124:0x022e  */
        /* JADX WARN: Code duplicated, block: B:126:0x0234  */
        /* JADX WARN: Code duplicated, block: B:128:0x023c  */
        /* JADX WARN: Code duplicated, block: B:131:0x0253  */
        /* JADX WARN: Code duplicated, block: B:133:0x0257  */
        /* JADX WARN: Code duplicated, block: B:214:0x03fe  */
        /* JADX WARN: Code duplicated, block: B:222:0x041c  */
        /* JADX WARN: Code duplicated, block: B:228:0x0440  */
        /* JADX WARN: Code duplicated, block: B:230:0x0446  */
        /* JADX WARN: Code duplicated, block: B:236:0x0458  */
        /* JADX WARN: Code duplicated, block: B:238:0x045c  */
        /* JADX WARN: Code duplicated, block: B:245:0x048d  */
        /* JADX WARN: Code duplicated, block: B:250:0x04a0  */
        /* JADX WARN: Code duplicated, block: B:251:0x04b2  */
        /* JADX WARN: Code duplicated, block: B:254:0x04ba  */
        /* JADX WARN: Code duplicated, block: B:257:0x04d4  */
        /* JADX WARN: Code duplicated, block: B:259:0x04dc  */
        /* JADX WARN: Code duplicated, block: B:260:0x04e2  */
        /* JADX WARN: Code duplicated, block: B:264:0x04e9  */
        /* JADX WARN: Code duplicated, block: B:266:0x04ed  */
        /* JADX WARN: Code duplicated, block: B:271:0x04fe  */
        /* JADX WARN: Code duplicated, block: B:274:0x0506  */
        /* JADX WARN: Code duplicated, block: B:278:0x0511  */
        /* JADX WARN: Code duplicated, block: B:279:0x051d  */
        /* JADX WARN: Code duplicated, block: B:281:0x0523  */
        /* JADX WARN: Code duplicated, block: B:282:0x052f  */
        /* JADX WARN: Code duplicated, block: B:285:0x0536 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:287:0x053a  */
        /* JADX WARN: Code duplicated, block: B:298:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:311:0x00f4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:316:0x01b2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0082 A[EDGE_INSN: B:35:0x0082->B:36:0x0083 BREAK  A[LOOP:0: B:14:0x0026->B:20:0x0040]] */
        /* JADX WARN: Code duplicated, block: B:42:0x0091  */
        /* JADX WARN: Code duplicated, block: B:44:0x0098  */
        /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:70:0x010b  */
        /* JADX WARN: Code duplicated, block: B:72:0x0111  */
        /* JADX WARN: Code duplicated, block: B:74:0x0120 A[EDGE_INSN: B:74:0x0120->B:95:0x01b3 BREAK  A[LOOP:1: B:43:0x0096->B:55:0x00c4]] */
        /* JADX WARN: Code duplicated, block: B:75:0x0130  */
        /* JADX WARN: Code duplicated, block: B:77:0x0144  */
        /* JADX WARN: Code duplicated, block: B:79:0x0159  */
        /* JADX WARN: Code duplicated, block: B:81:0x016e  */
        /* JADX WARN: Code duplicated, block: B:83:0x0175  */
        /* JADX WARN: Code duplicated, block: B:96:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:98:0x01bb  */
        /* JADX WARN: Instruction removed from duplicated block: B:77:0x0144, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:79:0x0159, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v36 */
        /* JADX WARN: Type inference failed for: r6v39 */
        /* JADX WARN: Type inference failed for: r6v42 */
        /* JADX WARN: Type inference failed for: r6v52 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
        /* JADX WARN: Type inference failed for: r6v9 */
        public final ViewHolder m(int i7, long j) {
            ViewHolder viewHolderCreateViewHolder;
            int i10;
            ArrayList arrayList;
            ArrayList arrayList2;
            int i11;
            long j5;
            long nanoTime;
            int i12;
            int i13;
            int i14;
            View view;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate;
            j1 j1Var;
            androidx.core.view.b bVarE;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            ?? r6;
            int iF;
            int i15;
            RecyclerView recyclerViewFindNestedRecyclerView;
            ViewCacheExtension viewCacheExtension;
            View viewA;
            int size;
            int i16;
            ArrayList arrayList3;
            int size2;
            int i17;
            View view2;
            int size3;
            int i18;
            ViewHolder viewHolder;
            ViewHolder childViewHolderInt;
            ChildHelper childHelper;
            h hVar;
            int iIndexOfChild;
            int iJ;
            ViewHolder childViewHolderInt2;
            int i19;
            ?? r7;
            ViewHolder viewHolder2;
            int size4;
            int iF2;
            RecyclerView recyclerView = RecyclerView.this;
            if (i7 < 0 || i7 >= recyclerView.mState.b()) {
                StringBuilder sbR = a3.e.r(i7, "Invalid item position ", i7, "(", "). Item count:");
                sbR.append(recyclerView.mState.b());
                sbR.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbR.toString());
            }
            if (recyclerView.mState.f2527g) {
                ArrayList arrayList4 = this.f2504b;
                if (arrayList4 != null && (size4 = arrayList4.size()) != 0) {
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size4) {
                            if (recyclerView.mAdapter.hasStableIds() && (iF2 = recyclerView.mAdapterHelper.f(i7, 0)) > 0 && iF2 < recyclerView.mAdapter.getItemCount()) {
                                long itemId = recyclerView.mAdapter.getItemId(iF2);
                                int i21 = 0;
                                while (true) {
                                    if (i21 >= size4) {
                                        viewHolderCreateViewHolder = null;
                                        break;
                                    }
                                    ViewHolder viewHolder3 = (ViewHolder) this.f2504b.get(i21);
                                    if (!viewHolder3.wasReturnedFromScrap() && viewHolder3.getItemId() == itemId) {
                                        viewHolder3.addFlags(32);
                                        viewHolderCreateViewHolder = viewHolder3;
                                        break;
                                    }
                                    i21++;
                                }
                            } else {
                                viewHolderCreateViewHolder = null;
                                break;
                            }
                        } else {
                            viewHolderCreateViewHolder = (ViewHolder) this.f2504b.get(i20);
                            if (!viewHolderCreateViewHolder.wasReturnedFromScrap() && viewHolderCreateViewHolder.getLayoutPosition() == i7) {
                                viewHolderCreateViewHolder.addFlags(32);
                                break;
                            }
                            i20++;
                        }
                    }
                } else {
                    viewHolderCreateViewHolder = null;
                    break;
                }
                if (viewHolderCreateViewHolder != null) {
                    i10 = 1;
                }
                arrayList = this.f2503a;
                arrayList2 = this.f2505c;
                if (viewHolderCreateViewHolder == null) {
                    size = arrayList.size();
                    i16 = 0;
                    while (true) {
                        if (i16 < size) {
                            arrayList3 = recyclerView.mChildHelper.f2447c;
                            size2 = arrayList3.size();
                            i17 = 0;
                            while (true) {
                                if (i17 < size2) {
                                    i11 = 1;
                                    view2 = null;
                                    break;
                                }
                                view2 = (View) arrayList3.get(i17);
                                childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                                i11 = 1;
                                if (childViewHolderInt2.getLayoutPosition() != i7 && !childViewHolderInt2.isInvalid() && !childViewHolderInt2.isRemoved()) {
                                    break;
                                }
                                i17++;
                            }
                            if (view2 != null) {
                                size3 = arrayList2.size();
                                i18 = 0;
                                while (true) {
                                    if (i18 < size3) {
                                        viewHolderCreateViewHolder = null;
                                        break;
                                    }
                                    viewHolder = (ViewHolder) arrayList2.get(i18);
                                    if (viewHolder.isInvalid() && viewHolder.getLayoutPosition() == i7 && !viewHolder.isAttachedToTransitionOverlay()) {
                                        arrayList2.remove(i18);
                                        if (RecyclerView.sVerboseLoggingEnabled) {
                                            Log.d(RecyclerView.TAG, "getScrapOrHiddenOrCachedHolderForPosition(" + i7 + ") found match in cache: " + viewHolder);
                                        }
                                        viewHolderCreateViewHolder = viewHolder;
                                        break;
                                    }
                                    i18++;
                                }
                            } else {
                                childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                                childHelper = recyclerView.mChildHelper;
                                hVar = childHelper.f2446b;
                                iIndexOfChild = childHelper.f2445a.f2730a.indexOfChild(view2);
                                if (iIndexOfChild >= 0) {
                                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                                }
                                if (hVar.H(iIndexOfChild)) {
                                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                                }
                                hVar.E(iIndexOfChild);
                                childHelper.l(view2);
                                iJ = recyclerView.mChildHelper.j(view2);
                                if (iJ != -1) {
                                    StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                    sb2.append(childViewHolderInt);
                                    throw new IllegalStateException(a3.e.i(recyclerView, sb2));
                                }
                                recyclerView.mChildHelper.c(iJ);
                                l(view2);
                                childViewHolderInt.addFlags(8224);
                                viewHolderCreateViewHolder = childViewHolderInt;
                                break;
                            }
                        } else {
                            viewHolder2 = (ViewHolder) arrayList.get(i16);
                            if (viewHolder2.wasReturnedFromScrap() && viewHolder2.getLayoutPosition() == i7 && !viewHolder2.isInvalid() && (recyclerView.mState.f2527g || !viewHolder2.isRemoved())) {
                                viewHolder2.addFlags(32);
                                viewHolderCreateViewHolder = viewHolder2;
                                i11 = 1;
                                break;
                            }
                            i16++;
                        }
                    }
                    if (viewHolderCreateViewHolder != null) {
                        if (viewHolderCreateViewHolder.isRemoved()) {
                            i19 = viewHolderCreateViewHolder.mPosition;
                            if (i19 >= 0 || i19 >= recyclerView.mAdapter.getItemCount()) {
                                StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                sb3.append(viewHolderCreateViewHolder);
                                throw new IndexOutOfBoundsException(a3.e.i(recyclerView, sb3));
                            }
                            r7 = ((recyclerView.mState.f2527g || recyclerView.mAdapter.getItemViewType(viewHolderCreateViewHolder.mPosition) == viewHolderCreateViewHolder.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || viewHolderCreateViewHolder.getItemId() == recyclerView.mAdapter.getItemId(viewHolderCreateViewHolder.mPosition))) ? i11 : 0;
                        } else {
                            if (!RecyclerView.sDebugAssertionsEnabled && !recyclerView.mState.f2527g) {
                                throw new IllegalStateException(a3.e.i(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                            }
                            r7 = recyclerView.mState.f2527g;
                        }
                        if (r7 == 0) {
                            viewHolderCreateViewHolder.addFlags(4);
                            if (viewHolderCreateViewHolder.isScrap()) {
                                recyclerView.removeDetachedView(viewHolderCreateViewHolder.itemView, false);
                                viewHolderCreateViewHolder.unScrap();
                            } else if (viewHolderCreateViewHolder.wasReturnedFromScrap()) {
                                viewHolderCreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            k(viewHolderCreateViewHolder);
                            viewHolderCreateViewHolder = null;
                        } else {
                            i10 = i11;
                        }
                    }
                } else {
                    i11 = 1;
                }
                if (viewHolderCreateViewHolder == null) {
                    iF = recyclerView.mAdapterHelper.f(i7, 0);
                    if (iF >= 0 || iF >= recyclerView.mAdapter.getItemCount()) {
                        StringBuilder sbR2 = a3.e.r(i7, "Inconsistency detected. Invalid item position ", iF, "(offset:", ").state:");
                        sbR2.append(recyclerView.mState.b());
                        sbR2.append(recyclerView.exceptionLabel());
                        throw new IndexOutOfBoundsException(sbR2.toString());
                    }
                    int itemViewType = recyclerView.mAdapter.getItemViewType(iF);
                    if (recyclerView.mAdapter.hasStableIds()) {
                        long itemId2 = recyclerView.mAdapter.getItemId(iF);
                        int size5 = arrayList.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                j5 = Long.MAX_VALUE;
                                int size6 = arrayList2.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        ViewHolder viewHolder4 = (ViewHolder) arrayList2.get(size6);
                                        if (viewHolder4.getItemId() != itemId2 || viewHolder4.isAttachedToTransitionOverlay()) {
                                            size6--;
                                        } else {
                                            if (itemViewType == viewHolder4.getItemViewType()) {
                                                arrayList2.remove(size6);
                                                viewHolderCreateViewHolder = viewHolder4;
                                                break;
                                            }
                                            i(size6);
                                        }
                                    }
                                    viewHolderCreateViewHolder = null;
                                    break;
                                }
                            }
                            ViewHolder viewHolder5 = (ViewHolder) arrayList.get(size5);
                            if (viewHolder5.getItemId() == itemId2 && !viewHolder5.wasReturnedFromScrap()) {
                                j5 = Long.MAX_VALUE;
                                if (itemViewType == viewHolder5.getItemViewType()) {
                                    viewHolder5.addFlags(32);
                                    if (viewHolder5.isRemoved() && !recyclerView.mState.f2527g) {
                                        viewHolder5.setFlags(2, 14);
                                    }
                                    viewHolderCreateViewHolder = viewHolder5;
                                    break;
                                }
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(viewHolder5.itemView, false);
                                ViewHolder childViewHolderInt3 = RecyclerView.getChildViewHolderInt(viewHolder5.itemView);
                                childViewHolderInt3.mScrapContainer = null;
                                childViewHolderInt3.mInChangeScrap = false;
                                childViewHolderInt3.clearReturnedFromScrapFlag();
                                k(childViewHolderInt3);
                            }
                            size5--;
                        }
                        if (viewHolderCreateViewHolder != null) {
                            viewHolderCreateViewHolder.mPosition = iF;
                            i10 = i11;
                        }
                    } else {
                        j5 = Long.MAX_VALUE;
                    }
                    if (viewHolderCreateViewHolder == null && (viewCacheExtension = this.f2510h) != null && (viewA = viewCacheExtension.a()) != null) {
                        viewHolderCreateViewHolder = recyclerView.getChildViewHolder(viewA);
                        if (viewHolderCreateViewHolder == null) {
                            throw new IllegalArgumentException(a3.e.i(recyclerView, new StringBuilder("getViewForPositionAndType returned a view which does not have a ViewHolder")));
                        }
                        if (viewHolderCreateViewHolder.shouldIgnore()) {
                            throw new IllegalArgumentException(a3.e.i(recyclerView, new StringBuilder("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.")));
                        }
                    }
                    if (viewHolderCreateViewHolder == null) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d(RecyclerView.TAG, "tryGetViewHolderForPositionByDeadline(" + i7 + ") fetching from shared pool");
                        }
                        ViewHolder recycledView = d().getRecycledView(itemViewType);
                        if (recycledView != null) {
                            recycledView.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                View view3 = recycledView.itemView;
                                if (view3 instanceof ViewGroup) {
                                    f((ViewGroup) view3, false);
                                }
                            }
                        }
                        viewHolderCreateViewHolder = recycledView;
                    }
                    if (viewHolderCreateViewHolder == null) {
                        long nanoTime2 = recyclerView.getNanoTime();
                        if (j != j5) {
                            i15 = itemViewType;
                            if (!this.f2509g.willCreateInTime(itemViewType, nanoTime2, j)) {
                                return null;
                            }
                        } else {
                            i15 = itemViewType;
                        }
                        viewHolderCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, i15);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(viewHolderCreateViewHolder.itemView)) != null) {
                            viewHolderCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        this.f2509g.factorInCreateTime(i15, recyclerView.getNanoTime() - nanoTime2);
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d(RecyclerView.TAG, "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                } else {
                    j5 = Long.MAX_VALUE;
                }
                if (i10 != 0 && !recyclerView.mState.f2527g && viewHolderCreateViewHolder.hasAnyOfTheFlags(8192)) {
                    viewHolderCreateViewHolder.setFlags(0, 8192);
                    if (recyclerView.mState.j) {
                        recyclerView.recordAnimationInfoIfBouncedHiddenView(viewHolderCreateViewHolder, recyclerView.mItemAnimator.recordPreLayoutInformation(recyclerView.mState, viewHolderCreateViewHolder, ItemAnimator.buildAdapterChangeFlagsForAnimations(viewHolderCreateViewHolder) | ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, viewHolderCreateViewHolder.getUnmodifiedPayloads()));
                    }
                }
                if (recyclerView.mState.f2527g || !viewHolderCreateViewHolder.isBound()) {
                    if (viewHolderCreateViewHolder.isBound() || viewHolderCreateViewHolder.needsUpdate() || viewHolderCreateViewHolder.isInvalid()) {
                        if (!RecyclerView.sDebugAssertionsEnabled && viewHolderCreateViewHolder.isRemoved()) {
                            StringBuilder sb4 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                            sb4.append(viewHolderCreateViewHolder);
                            throw new IllegalStateException(a3.e.i(recyclerView, sb4));
                        }
                        int iF3 = recyclerView.mAdapterHelper.f(i7, 0);
                        viewHolderCreateViewHolder.mBindingAdapter = null;
                        viewHolderCreateViewHolder.mOwnerRecyclerView = recyclerView;
                        int itemViewType2 = viewHolderCreateViewHolder.getItemViewType();
                        nanoTime = recyclerView.getNanoTime();
                        if (j != j5 || this.f2509g.willBindInTime(itemViewType2, nanoTime, j)) {
                            if (viewHolderCreateViewHolder.isTmpDetached()) {
                                recyclerView.attachViewToParent(viewHolderCreateViewHolder.itemView, recyclerView.getChildCount(), viewHolderCreateViewHolder.itemView.getLayoutParams());
                                i12 = i11;
                            } else {
                                i12 = 0;
                            }
                            recyclerView.mAdapter.bindViewHolder(viewHolderCreateViewHolder, iF3);
                            if (i12 != 0) {
                                recyclerView.detachViewFromParent(viewHolderCreateViewHolder.itemView);
                            }
                            this.f2509g.factorInBindTime(viewHolderCreateViewHolder.getItemViewType(), recyclerView.getNanoTime() - nanoTime);
                            if (recyclerView.isAccessibilityEnabled()) {
                                view = viewHolderCreateViewHolder.itemView;
                                if (view.getImportantForAccessibility() == 0) {
                                    i13 = i11;
                                    view.setImportantForAccessibility(i13);
                                } else {
                                    i13 = i11;
                                }
                                recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                                if (recyclerViewAccessibilityDelegate != null) {
                                    j1Var = recyclerViewAccessibilityDelegate.f2541b;
                                    if (j1Var != null && (bVarE = androidx.core.view.u0.e(view)) != null && bVarE != j1Var) {
                                        j1Var.f2623b.put(view, bVarE);
                                    }
                                    androidx.core.view.u0.p(view, j1Var);
                                }
                            } else {
                                i13 = i11;
                            }
                            if (recyclerView.mState.f2527g) {
                                viewHolderCreateViewHolder.mPreLayoutPosition = i7;
                            }
                            i14 = i13;
                        }
                    }
                    layoutParams = viewHolderCreateViewHolder.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                        viewHolderCreateViewHolder.itemView.setLayoutParams(layoutParams2);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        layoutParams2 = (LayoutParams) layoutParams;
                    } else {
                        layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                        viewHolderCreateViewHolder.itemView.setLayoutParams(layoutParams2);
                    }
                    layoutParams2.f2499d = viewHolderCreateViewHolder;
                    if (i10 != 0 || i14 == 0) {
                        r6 = 0;
                    } else {
                        r6 = i13;
                    }
                    layoutParams2.f2502v = r6;
                    return viewHolderCreateViewHolder;
                }
                viewHolderCreateViewHolder.mPreLayoutPosition = i7;
                i14 = 0;
                i13 = i11;
                layoutParams = viewHolderCreateViewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                    viewHolderCreateViewHolder.itemView.setLayoutParams(layoutParams2);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                    viewHolderCreateViewHolder.itemView.setLayoutParams(layoutParams2);
                } else {
                    layoutParams2 = (LayoutParams) layoutParams;
                }
                layoutParams2.f2499d = viewHolderCreateViewHolder;
                if (i10 != 0) {
                    r6 = 0;
                } else {
                    r6 = 0;
                }
                layoutParams2.f2502v = r6;
                return viewHolderCreateViewHolder;
            }
            viewHolderCreateViewHolder = null;
            i10 = 0;
            arrayList = this.f2503a;
            arrayList2 = this.f2505c;
            if (viewHolderCreateViewHolder == null) {
                size = arrayList.size();
                i16 = 0;
                while (true) {
                    if (i16 < size) {
                        arrayList3 = recyclerView.mChildHelper.f2447c;
                        size2 = arrayList3.size();
                        i17 = 0;
                        while (true) {
                            if (i17 < size2) {
                                i11 = 1;
                                view2 = null;
                                break;
                            }
                            view2 = (View) arrayList3.get(i17);
                            childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                            i11 = 1;
                            if (childViewHolderInt2.getLayoutPosition() != i7) {
                            }
                            i17++;
                        }
                        if (view2 != null) {
                            size3 = arrayList2.size();
                            i18 = 0;
                            while (true) {
                                if (i18 < size3) {
                                    viewHolderCreateViewHolder = null;
                                    break;
                                }
                                viewHolder = (ViewHolder) arrayList2.get(i18);
                                if (viewHolder.isInvalid()) {
                                }
                                i18++;
                            }
                        } else {
                            childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                            childHelper = recyclerView.mChildHelper;
                            hVar = childHelper.f2446b;
                            iIndexOfChild = childHelper.f2445a.f2730a.indexOfChild(view2);
                            if (iIndexOfChild >= 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                            }
                            if (hVar.H(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                            }
                            hVar.E(iIndexOfChild);
                            childHelper.l(view2);
                            iJ = recyclerView.mChildHelper.j(view2);
                            if (iJ != -1) {
                                StringBuilder sb5 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb5.append(childViewHolderInt);
                                throw new IllegalStateException(a3.e.i(recyclerView, sb5));
                            }
                            recyclerView.mChildHelper.c(iJ);
                            l(view2);
                            childViewHolderInt.addFlags(8224);
                            viewHolderCreateViewHolder = childViewHolderInt;
                            break;
                        }
                    } else {
                        viewHolder2 = (ViewHolder) arrayList.get(i16);
                        if (viewHolder2.wasReturnedFromScrap()) {
                        }
                        i16++;
                    }
                }
                if (viewHolderCreateViewHolder != null) {
                    if (viewHolderCreateViewHolder.isRemoved()) {
                        i19 = viewHolderCreateViewHolder.mPosition;
                        if (i19 >= 0) {
                        }
                        StringBuilder sb6 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb6.append(viewHolderCreateViewHolder);
                        throw new IndexOutOfBoundsException(a3.e.i(recyclerView, sb6));
                    }
                    if (!RecyclerView.sDebugAssertionsEnabled) {
                    }
                    r7 = recyclerView.mState.f2527g;
                    if (r7 == 0) {
                        viewHolderCreateViewHolder.addFlags(4);
                        if (viewHolderCreateViewHolder.isScrap()) {
                            recyclerView.removeDetachedView(viewHolderCreateViewHolder.itemView, false);
                            viewHolderCreateViewHolder.unScrap();
                        } else if (viewHolderCreateViewHolder.wasReturnedFromScrap()) {
                            viewHolderCreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        k(viewHolderCreateViewHolder);
                        viewHolderCreateViewHolder = null;
                    } else {
                        i10 = i11;
                    }
                }
            } else {
                i11 = 1;
            }
            if (viewHolderCreateViewHolder == null) {
                iF = recyclerView.mAdapterHelper.f(i7, 0);
                if (iF >= 0) {
                }
                StringBuilder sbR3 = a3.e.r(i7, "Inconsistency detected. Invalid item position ", iF, "(offset:", ").state:");
                sbR3.append(recyclerView.mState.b());
                sbR3.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbR3.toString());
            }
            j5 = Long.MAX_VALUE;
            if (i10 != 0) {
                viewHolderCreateViewHolder.setFlags(0, 8192);
                if (recyclerView.mState.j) {
                    recyclerView.recordAnimationInfoIfBouncedHiddenView(viewHolderCreateViewHolder, recyclerView.mItemAnimator.recordPreLayoutInformation(recyclerView.mState, viewHolderCreateViewHolder, ItemAnimator.buildAdapterChangeFlagsForAnimations(viewHolderCreateViewHolder) | ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, viewHolderCreateViewHolder.getUnmodifiedPayloads()));
                }
            }
            if (recyclerView.mState.f2527g) {
                if (viewHolderCreateViewHolder.isBound()) {
                    if (!RecyclerView.sDebugAssertionsEnabled) {
                    }
                    int iF4 = recyclerView.mAdapterHelper.f(i7, 0);
                    viewHolderCreateViewHolder.mBindingAdapter = null;
                    viewHolderCreateViewHolder.mOwnerRecyclerView = recyclerView;
                    int itemViewType3 = viewHolderCreateViewHolder.getItemViewType();
                    nanoTime = recyclerView.getNanoTime();
                    if (j != j5) {
                    }
                    if (viewHolderCreateViewHolder.isTmpDetached()) {
                        recyclerView.attachViewToParent(viewHolderCreateViewHolder.itemView, recyclerView.getChildCount(), viewHolderCreateViewHolder.itemView.getLayoutParams());
                        i12 = i11;
                    } else {
                        i12 = 0;
                    }
                    recyclerView.mAdapter.bindViewHolder(viewHolderCreateViewHolder, iF4);
                    if (i12 != 0) {
                        recyclerView.detachViewFromParent(viewHolderCreateViewHolder.itemView);
                    }
                    this.f2509g.factorInBindTime(viewHolderCreateViewHolder.getItemViewType(), recyclerView.getNanoTime() - nanoTime);
                    if (recyclerView.isAccessibilityEnabled()) {
                        view = viewHolderCreateViewHolder.itemView;
                        if (view.getImportantForAccessibility() == 0) {
                            i13 = i11;
                            view.setImportantForAccessibility(i13);
                        } else {
                            i13 = i11;
                        }
                        recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                        if (recyclerViewAccessibilityDelegate != null) {
                            j1Var = recyclerViewAccessibilityDelegate.f2541b;
                            if (j1Var != null) {
                                j1Var.f2623b.put(view, bVarE);
                            }
                            androidx.core.view.u0.p(view, j1Var);
                        }
                    } else {
                        i13 = i11;
                    }
                    if (recyclerView.mState.f2527g) {
                        viewHolderCreateViewHolder.mPreLayoutPosition = i7;
                    }
                    i14 = i13;
                } else {
                    if (!RecyclerView.sDebugAssertionsEnabled) {
                    }
                    int iF5 = recyclerView.mAdapterHelper.f(i7, 0);
                    viewHolderCreateViewHolder.mBindingAdapter = null;
                    viewHolderCreateViewHolder.mOwnerRecyclerView = recyclerView;
                    int itemViewType4 = viewHolderCreateViewHolder.getItemViewType();
                    nanoTime = recyclerView.getNanoTime();
                    if (j != j5) {
                    }
                    if (viewHolderCreateViewHolder.isTmpDetached()) {
                        recyclerView.attachViewToParent(viewHolderCreateViewHolder.itemView, recyclerView.getChildCount(), viewHolderCreateViewHolder.itemView.getLayoutParams());
                        i12 = i11;
                    } else {
                        i12 = 0;
                    }
                    recyclerView.mAdapter.bindViewHolder(viewHolderCreateViewHolder, iF5);
                    if (i12 != 0) {
                        recyclerView.detachViewFromParent(viewHolderCreateViewHolder.itemView);
                    }
                    this.f2509g.factorInBindTime(viewHolderCreateViewHolder.getItemViewType(), recyclerView.getNanoTime() - nanoTime);
                    if (recyclerView.isAccessibilityEnabled()) {
                        view = viewHolderCreateViewHolder.itemView;
                        if (view.getImportantForAccessibility() == 0) {
                            i13 = i11;
                            view.setImportantForAccessibility(i13);
                        } else {
                            i13 = i11;
                        }
                        recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                        if (recyclerViewAccessibilityDelegate != null) {
                            j1Var = recyclerViewAccessibilityDelegate.f2541b;
                            if (j1Var != null) {
                                j1Var.f2623b.put(view, bVarE);
                            }
                            androidx.core.view.u0.p(view, j1Var);
                        }
                    } else {
                        i13 = i11;
                    }
                    if (recyclerView.mState.f2527g) {
                        viewHolderCreateViewHolder.mPreLayoutPosition = i7;
                    }
                    i14 = i13;
                }
            } else if (viewHolderCreateViewHolder.isBound()) {
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                int iF6 = recyclerView.mAdapterHelper.f(i7, 0);
                viewHolderCreateViewHolder.mBindingAdapter = null;
                viewHolderCreateViewHolder.mOwnerRecyclerView = recyclerView;
                int itemViewType5 = viewHolderCreateViewHolder.getItemViewType();
                nanoTime = recyclerView.getNanoTime();
                if (j != j5) {
                }
                if (viewHolderCreateViewHolder.isTmpDetached()) {
                    recyclerView.attachViewToParent(viewHolderCreateViewHolder.itemView, recyclerView.getChildCount(), viewHolderCreateViewHolder.itemView.getLayoutParams());
                    i12 = i11;
                } else {
                    i12 = 0;
                }
                recyclerView.mAdapter.bindViewHolder(viewHolderCreateViewHolder, iF6);
                if (i12 != 0) {
                    recyclerView.detachViewFromParent(viewHolderCreateViewHolder.itemView);
                }
                this.f2509g.factorInBindTime(viewHolderCreateViewHolder.getItemViewType(), recyclerView.getNanoTime() - nanoTime);
                if (recyclerView.isAccessibilityEnabled()) {
                    view = viewHolderCreateViewHolder.itemView;
                    if (view.getImportantForAccessibility() == 0) {
                        i13 = i11;
                        view.setImportantForAccessibility(i13);
                    } else {
                        i13 = i11;
                    }
                    recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                    if (recyclerViewAccessibilityDelegate != null) {
                        j1Var = recyclerViewAccessibilityDelegate.f2541b;
                        if (j1Var != null) {
                            j1Var.f2623b.put(view, bVarE);
                        }
                        androidx.core.view.u0.p(view, j1Var);
                    }
                } else {
                    i13 = i11;
                }
                if (recyclerView.mState.f2527g) {
                    viewHolderCreateViewHolder.mPreLayoutPosition = i7;
                }
                i14 = i13;
            } else {
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                int iF7 = recyclerView.mAdapterHelper.f(i7, 0);
                viewHolderCreateViewHolder.mBindingAdapter = null;
                viewHolderCreateViewHolder.mOwnerRecyclerView = recyclerView;
                int itemViewType6 = viewHolderCreateViewHolder.getItemViewType();
                nanoTime = recyclerView.getNanoTime();
                if (j != j5) {
                }
                if (viewHolderCreateViewHolder.isTmpDetached()) {
                    recyclerView.attachViewToParent(viewHolderCreateViewHolder.itemView, recyclerView.getChildCount(), viewHolderCreateViewHolder.itemView.getLayoutParams());
                    i12 = i11;
                } else {
                    i12 = 0;
                }
                recyclerView.mAdapter.bindViewHolder(viewHolderCreateViewHolder, iF7);
                if (i12 != 0) {
                    recyclerView.detachViewFromParent(viewHolderCreateViewHolder.itemView);
                }
                this.f2509g.factorInBindTime(viewHolderCreateViewHolder.getItemViewType(), recyclerView.getNanoTime() - nanoTime);
                if (recyclerView.isAccessibilityEnabled()) {
                    view = viewHolderCreateViewHolder.itemView;
                    if (view.getImportantForAccessibility() == 0) {
                        i13 = i11;
                        view.setImportantForAccessibility(i13);
                    } else {
                        i13 = i11;
                    }
                    recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                    if (recyclerViewAccessibilityDelegate != null) {
                        j1Var = recyclerViewAccessibilityDelegate.f2541b;
                        if (j1Var != null) {
                            j1Var.f2623b.put(view, bVarE);
                        }
                        androidx.core.view.u0.p(view, j1Var);
                    }
                } else {
                    i13 = i11;
                }
                if (recyclerView.mState.f2527g) {
                    viewHolderCreateViewHolder.mPreLayoutPosition = i7;
                }
                i14 = i13;
            }
            layoutParams = viewHolderCreateViewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                viewHolderCreateViewHolder.itemView.setLayoutParams(layoutParams2);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                viewHolderCreateViewHolder.itemView.setLayoutParams(layoutParams2);
            } else {
                layoutParams2 = (LayoutParams) layoutParams;
            }
            layoutParams2.f2499d = viewHolderCreateViewHolder;
            if (i10 != 0) {
                r6 = 0;
            } else {
                r6 = 0;
            }
            layoutParams2.f2502v = r6;
            return viewHolderCreateViewHolder;
        }

        public final void n(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.f2504b.remove(viewHolder);
            } else {
                this.f2503a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        public final void o() {
            LayoutManager layoutManager = RecyclerView.this.mLayout;
            this.f2508f = this.f2507e + (layoutManager != null ? layoutManager.mPrefetchMaxCountObserved : 0);
            ArrayList arrayList = this.f2505c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2508f; size--) {
                i(size);
            }
        }
    }

    public interface RecyclerListener {
        void a();
    }

    public class RecyclerViewDataObserver extends AdapterDataObserver {
        public RecyclerViewDataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f2526f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (recyclerView.mAdapterHelper.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void b(int i7, int i10, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            ArrayList arrayList = adapterHelper.f2432b;
            if (i10 < 1) {
                return;
            }
            arrayList.add(adapterHelper.h(obj, 4, i7, i10));
            adapterHelper.f2436f |= 4;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void c(int i7, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            ArrayList arrayList = adapterHelper.f2432b;
            if (i10 < 1) {
                return;
            }
            arrayList.add(adapterHelper.h(null, 1, i7, i10));
            adapterHelper.f2436f |= 1;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void d(int i7, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            ArrayList arrayList = adapterHelper.f2432b;
            if (i7 == i10) {
                return;
            }
            arrayList.add(adapterHelper.h(null, 8, i7, i10));
            adapterHelper.f2436f |= 8;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void e(int i7, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            ArrayList arrayList = adapterHelper.f2432b;
            if (i10 < 1) {
                return;
            }
            arrayList.add(adapterHelper.h(null, 2, i7, i10));
            adapterHelper.f2436f |= 2;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void f() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (adapter = recyclerView.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }

        public final void g() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                recyclerView.postOnAnimation(runnable);
            }
        }
    }

    public static class SavedState extends d2.b {
        public static final Parcelable.Creator<SavedState> CREATOR = new g1();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Parcelable f2513i;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2513i = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        @Override // d2.b, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeParcelable(this.f2513i, 0);
        }
    }

    public static abstract class SmoothScroller {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final Action mRecyclingAction;
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition = -1;
        private View mTargetView;

        public static class Action {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2514a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2515b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f2516c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2517d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Interpolator f2518e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f2519f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f2520g;

            public final void a(RecyclerView recyclerView) {
                int i7 = this.f2517d;
                if (i7 >= 0) {
                    this.f2517d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i7);
                    this.f2519f = false;
                    return;
                }
                if (!this.f2519f) {
                    this.f2520g = 0;
                    return;
                }
                Interpolator interpolator = this.f2518e;
                if (interpolator != null && this.f2516c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i10 = this.f2516c;
                if (i10 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.c(this.f2514a, this.f2515b, interpolator, i10);
                int i11 = this.f2520g + 1;
                this.f2520g = i11;
                if (i11 > 10) {
                    Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f2519f = false;
            }
        }

        public SmoothScroller() {
            Action action = new Action();
            action.f2517d = -1;
            action.f2519f = false;
            action.f2520g = 0;
            action.f2514a = 0;
            action.f2515b = 0;
            action.f2516c = Integer.MIN_VALUE;
            action.f2518e = null;
            this.mRecyclingAction = action;
        }

        public PointF computeScrollVectorForPosition(int i7) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof i1) {
                return ((i1) layoutManager).computeScrollVectorForPosition(i7);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + i1.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i7) {
            return this.mRecyclerView.mLayout.findViewByPosition(i7);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i7) {
            this.mRecyclerView.scrollToPosition(i7);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@NonNull PointF pointF) {
            float f2 = pointF.x;
            float f7 = pointF.y;
            float fSqrt = (float) Math.sqrt((f7 * f7) + (f2 * f2));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i7, int i10) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f2 = pointFComputeScrollVectorForPosition.x;
                if (f2 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f2), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.a(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i7, i10, recyclerView.mState, this.mRecyclingAction);
                Action action = this.mRecyclingAction;
                boolean z5 = action.f2517d >= 0;
                action.a(recyclerView);
                if (z5 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.b();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "smooth scroll target view has been attached");
                }
            }
        }

        public abstract void onSeekTargetStep(int i7, int i10, State state, Action action);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view, State state, Action action);

        public void setTargetPosition(int i7) {
            this.mTargetPosition = i7;
        }

        public void start(RecyclerView recyclerView, LayoutManager layoutManager) {
            ViewFlinger viewFlinger = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(viewFlinger);
            viewFlinger.f2535i.abortAnimation();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            int i7 = this.mTargetPosition;
            if (i7 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f2521a = i7;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.b();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f2521a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    public static class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2527g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f2528h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f2529i;
        public boolean j;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f2530l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f2531m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2532n;

        public final void a(int i7) {
            if ((this.f2524d & i7) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.f2524d));
        }

        public final int b() {
            return this.f2527g ? this.f2522b - this.f2523c : this.f2525e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f2521a + ", mData=null, mItemCount=" + this.f2525e + ", mIsMeasuring=" + this.f2529i + ", mPreviousLayoutItemCount=" + this.f2522b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2523c + ", mStructureChanged=" + this.f2526f + ", mInPreLayout=" + this.f2527g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.k + '}';
        }
    }

    public static class StretchEdgeEffectFactory extends EdgeEffectFactory {
        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        public final EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class ViewCacheExtension {
        public abstract View a();
    }

    public class ViewFlinger implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2534e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public OverScroller f2535i;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Interpolator f2536v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f2537w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f2538x;

        public ViewFlinger() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f2536v = interpolator;
            this.f2537w = false;
            this.f2538x = false;
            this.f2535i = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void a(int i7, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f2534e = 0;
            this.f2533d = 0;
            Interpolator interpolator = this.f2536v;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f2536v = interpolator2;
                this.f2535i = new OverScroller(recyclerView.getContext(), interpolator2);
            }
            this.f2535i.fling(0, 0, i7, i10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.f2537w) {
                this.f2538x = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i7, int i10, Interpolator interpolator, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i11 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i7);
                int iAbs2 = Math.abs(i10);
                boolean z5 = iAbs > iAbs2;
                int width = z5 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z5) {
                    iAbs = iAbs2;
                }
                i11 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), RecyclerView.MAX_SCROLL_DURATION);
            }
            int i12 = i11;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f2536v != interpolator) {
                this.f2536v = interpolator;
                this.f2535i = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f2534e = 0;
            this.f2533d = 0;
            recyclerView.setScrollState(2);
            this.f2535i.startScroll(0, 0, i7, i10, i12);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i7;
            int i10;
            int i11;
            int i12;
            int i13;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.f2535i.abortAnimation();
                return;
            }
            this.f2538x = false;
            this.f2537w = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f2535i;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i14 = currX - this.f2533d;
                int i15 = currY - this.f2534e;
                this.f2533d = currX;
                this.f2534e = currY;
                int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i14);
                int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i15);
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i16 = iArr4[0];
                    int i17 = iArr4[1];
                    int i18 = iConsumeFlingInHorizontalStretch - i16;
                    int i19 = iConsumeFlingInVerticalStretch - i17;
                    SmoothScroller smoothScroller = recyclerView.mLayout.mSmoothScroller;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int iB = recyclerView.mState.b();
                        if (iB == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= iB) {
                            smoothScroller.setTargetPosition(iB - 1);
                            smoothScroller.onAnimation(i16, i17);
                        } else {
                            smoothScroller.onAnimation(i16, i17);
                        }
                    }
                    i7 = i18;
                    i11 = i16;
                    i10 = i19;
                    i12 = i17;
                } else {
                    i7 = iConsumeFlingInHorizontalStretch;
                    i10 = iConsumeFlingInVerticalStretch;
                    i11 = 0;
                    i12 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i11, i12, i7, i10, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i20 = i7 - iArr6[0];
                int i21 = i10 - iArr6[1];
                if (i11 != 0 || i12 != 0) {
                    recyclerView.dispatchOnScrolled(i11, i12);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z5 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i20 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i21 != 0));
                SmoothScroller smoothScroller2 = recyclerView.mLayout.mSmoothScroller;
                if ((smoothScroller2 == null || !smoothScroller2.isPendingInitialRun()) && z5) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i20 < 0) {
                            i13 = -currVelocity;
                        } else {
                            i13 = i20 > 0 ? currVelocity : 0;
                        }
                        if (i21 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i21 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i13, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = layoutPrefetchRegistryImpl.f2464c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        layoutPrefetchRegistryImpl.f2465d = 0;
                    }
                } else {
                    b();
                    GapWorker gapWorker = recyclerView.mGapWorker;
                    if (gapWorker != null) {
                        gapWorker.a(recyclerView, i11, i12);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    b1.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            SmoothScroller smoothScroller3 = recyclerView.mLayout.mSmoothScroller;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.f2537w = false;
            if (!this.f2538x) {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        Adapter mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public ViewHolder(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
                return;
            }
            if ((1024 & this.mFlags) == 0) {
                if (this.mPayloads == null) {
                    ArrayList arrayList = new ArrayList();
                    this.mPayloads = arrayList;
                    this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
                }
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i7) {
            this.mFlags = i7 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            return view.hasTransientState();
        }

        public void flagRemovedAndOffsetPosition(int i7, int i10, boolean z5) {
            addFlags(8);
            offsetPosition(i10, z5);
            this.mPosition = i7;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i7 = this.mPreLayoutPosition;
            return i7 == -1 ? this.mPosition : i7;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i7 = this.mPreLayoutPosition;
            return i7 == -1 ? this.mPosition : i7;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i7) {
            return (i7 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            return !view.hasTransientState();
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i7, boolean z5) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z5) {
                this.mPreLayoutPosition += i7;
            }
            this.mPosition += i7;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f2501i = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i7 = this.mPendingAccessibilityState;
            if (i7 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i7;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i7, int i10) {
            this.mFlags = (i7 & i10) | (this.mFlags & (~i10));
        }

        public final void setIsRecyclable(boolean z5) {
            int i7 = this.mIsRecyclableCount;
            int i10 = z5 ? i7 - 1 : i7 + 1;
            this.mIsRecyclableCount = i10;
            if (i10 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z5 && i10 == 1) {
                this.mFlags |= 16;
            } else if (z5 && i10 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "setIsRecyclable val:" + z5 + ":" + this);
            }
        }

        public void setScrapContainer(Recycler recycler, boolean z5) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z5;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbO = kk.b.o(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbO.append(Integer.toHexString(hashCode()));
            sbO.append(" position=");
            sbO.append(this.mPosition);
            sbO.append(" id=");
            sbO.append(this.mItemId);
            sbO.append(", oldPos=");
            sbO.append(this.mOldPosition);
            sbO.append(", pLpos:");
            sbO.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sbO.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.n(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new g0(2);
        sDefaultEdgeEffectFactory = new StretchEdgeEffectFactory();
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.discord.R.attr.recyclerViewStyle);
    }

    public static int c(int i7, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i7 > 0 && edgeEffect != null && sa.a.n(edgeEffect) != 0.0f) {
            int iRound = Math.round(sa.a.z(edgeEffect, ((-i7) * 4.0f) / i10, 0.5f) * ((-i10) / 4.0f));
            if (iRound != i7) {
                edgeEffect.finish();
            }
            return i7 - iRound;
        }
        if (i7 >= 0 || edgeEffect2 == null || sa.a.n(edgeEffect2) == 0.0f) {
            return i7;
        }
        float f2 = i10;
        int iRound2 = Math.round(sa.a.z(edgeEffect2, (i7 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (iRound2 != i7) {
            edgeEffect2.finish();
        }
        return i7 - iRound2;
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i7));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    public static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2499d;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f2500e;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }

    public static void setDebugAssertionsEnabled(boolean z5) {
        sDebugAssertionsEnabled = z5;
    }

    public static void setVerboseLoggingEnabled(boolean z5) {
        sVerboseLoggingEnabled = z5;
    }

    public final void a(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z5 = view.getParent() == this;
        this.mRecycler.n(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z5) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        ChildHelper childHelper = this.mChildHelper;
        int iIndexOfChild = childHelper.f2445a.f2730a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            childHelper.f2446b.M(iIndexOfChild);
            childHelper.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void absorbGlows(int i7, int i10) {
        if (i7 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i7);
            }
        } else if (i7 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i7);
            }
        }
        if (i10 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i10);
            }
        }
        if (i7 == 0 && i10 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i7, int i10) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i7, i10)) {
            super.addFocusables(arrayList, i7, i10);
        }
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration, int i7) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i7 < 0) {
            this.mItemDecorations.add(itemDecoration);
        } else {
            this.mItemDecorations.add(i7, itemDecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(onChildAttachStateChangeListener);
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void addRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        yk.a.a("'listener' arg cannot be null.", recyclerListener != null);
        this.mRecyclerListeners.add(recyclerListener);
    }

    public void animateAppearance(@NonNull ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        a(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(a3.e.i(this, kk.b.n(str)));
        }
        throw new IllegalStateException(a3.e.i(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(a3.e.i(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(a3.e.i(this, new StringBuilder(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator == null || itemAnimator.canReuseUpdatedViewHolder(viewHolder, viewHolder.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    public void clearOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i7 = 0; i7 < iH; i7++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i7));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.f2503a;
        ArrayList arrayList2 = recycler.f2505c;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ViewHolder) arrayList2.get(i10)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((ViewHolder) arrayList.get(i11)).clearOldPosition();
        }
        ArrayList arrayList3 = recycler.f2504b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((ViewHolder) recycler.f2504b.get(i12)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i7, int i10) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i7) {
        return c(i7, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i7) {
        return c(i7, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            AdapterHelper adapterHelper = this.mAdapterHelper;
            int i7 = adapterHelper.f2436f;
            if ((i7 & 4) == 0 || (i7 & 11) != 0) {
                if (adapterHelper.g()) {
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.j();
            if (!this.mLayoutWasDefered) {
                int iE = this.mChildHelper.e();
                for (int i10 = 0; i10 < iE; i10++) {
                    ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
                    if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                        dispatchLayout();
                    }
                }
                this.mAdapterHelper.b();
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public final void d() {
        u1 u1Var;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f2529i = false;
        startInterceptRequestLayout();
        ViewInfoStore viewInfoStore = this.mViewInfoStore;
        viewInfoStore.f2551a.clear();
        viewInfoStore.f2552b.a();
        onEnterLayoutOrScroll();
        k();
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        ViewHolder viewHolderFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (viewHolderFindContainingViewHolder == null) {
            State state = this.mState;
            state.f2531m = -1L;
            state.f2530l = -1;
            state.f2532n = -1;
        } else {
            this.mState.f2531m = this.mAdapter.hasStableIds() ? viewHolderFindContainingViewHolder.getItemId() : -1L;
            State state2 = this.mState;
            state2.f2530l = this.mDataSetHasChangedAfterLayout ? -1 : viewHolderFindContainingViewHolder.isRemoved() ? viewHolderFindContainingViewHolder.mOldPosition : viewHolderFindContainingViewHolder.getAbsoluteAdapterPosition();
            State state3 = this.mState;
            View focusedChild2 = viewHolderFindContainingViewHolder.itemView;
            int id2 = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id2 = focusedChild2.getId();
                }
            }
            state3.f2532n = id2;
        }
        State state4 = this.mState;
        state4.f2528h = state4.j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        state4.f2527g = state4.k;
        state4.f2525e = this.mAdapter.getItemCount();
        g(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int iE = this.mChildHelper.e();
            for (int i7 = 0; i7 < iE; i7++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i7));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    ItemAnimator.ItemHolderInfo itemHolderInfoRecordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads());
                    SimpleArrayMap simpleArrayMap = this.mViewInfoStore.f2551a;
                    u1 u1VarA = (u1) simpleArrayMap.get(childViewHolderInt);
                    if (u1VarA == null) {
                        u1VarA = u1.a();
                        simpleArrayMap.put(childViewHolderInt, u1VarA);
                    }
                    u1VarA.f2710b = itemHolderInfoRecordPreLayoutInformation;
                    u1VarA.f2709a |= 4;
                    if (this.mState.f2528h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f2552b.e(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.k) {
            saveOldPositions();
            State state5 = this.mState;
            boolean z5 = state5.f2526f;
            state5.f2526f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, state5);
            this.mState.f2526f = z5;
            for (int i10 = 0; i10 < this.mChildHelper.e(); i10++) {
                ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i10));
                if (!childViewHolderInt2.shouldIgnore() && ((u1Var = (u1) this.mViewInfoStore.f2551a.get(childViewHolderInt2)) == null || (u1Var.f2709a & 4) == 0)) {
                    int iBuildAdapterChangeFlagsForAnimations = ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iBuildAdapterChangeFlagsForAnimations |= ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                    }
                    ItemAnimator.ItemHolderInfo itemHolderInfoRecordPreLayoutInformation2 = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, iBuildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, itemHolderInfoRecordPreLayoutInformation2);
                    } else {
                        SimpleArrayMap simpleArrayMap2 = this.mViewInfoStore.f2551a;
                        u1 u1VarA2 = (u1) simpleArrayMap2.get(childViewHolderInt2);
                        if (u1VarA2 == null) {
                            u1VarA2 = u1.a();
                            simpleArrayMap2.put(childViewHolderInt2, u1VarA2);
                        }
                        u1VarA2.f2709a |= 2;
                        u1VarA2.f2710b = itemHolderInfoRecordPreLayoutInformation2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f2524d = 2;
    }

    public void defaultOnMeasure(int i7, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
        setMeasuredDimension(LayoutManager.chooseSize(i7, paddingRight, getMinimumWidth()), LayoutManager.chooseSize(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        LayoutManager layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.canScrollVertically()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    smoothScrollBy(0, measuredHeight, null, Integer.MIN_VALUE);
                } else {
                    smoothScrollBy(0, -measuredHeight, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zIsLayoutReversed = layoutManager.isLayoutReversed();
                if (keyCode == 122) {
                    if (zIsLayoutReversed) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zIsLayoutReversed) {
                    itemCount = getAdapter().getItemCount();
                }
                smoothScrollToPosition(itemCount);
                return true;
            }
        } else if (layoutManager.canScrollHorizontally()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    smoothScrollBy(measuredWidth, 0, null, Integer.MIN_VALUE);
                } else {
                    smoothScrollBy(-measuredWidth, 0, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zIsLayoutReversed2 = layoutManager.isLayoutReversed();
                if (keyCode2 == 122) {
                    if (zIsLayoutReversed2) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zIsLayoutReversed2) {
                    itemCount = getAdapter().getItemCount();
                }
                smoothScrollToPosition(itemCount);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:149:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:151:0x0300  */
    /* JADX WARN: Code duplicated, block: B:157:0x0318  */
    /* JADX WARN: Code duplicated, block: B:159:0x0320  */
    /* JADX WARN: Code duplicated, block: B:161:0x0326  */
    /* JADX WARN: Code duplicated, block: B:164:0x032e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0335  */
    /* JADX WARN: Code duplicated, block: B:170:0x0340 A[LOOP:3: B:163:0x032c->B:170:0x0340, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x034a  */
    /* JADX WARN: Code duplicated, block: B:176:0x0351  */
    /* JADX WARN: Code duplicated, block: B:179:0x035c A[LOOP:4: B:172:0x0348->B:179:0x035c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x0361  */
    /* JADX WARN: Code duplicated, block: B:211:0x0343 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0343 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x033d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x035f A[EDGE_INSN: B:216:0x035f->B:180:0x035f BREAK  A[LOOP:4: B:172:0x0348->B:179:0x035c], SYNTHETIC] */
    public void dispatchLayout() {
        ViewHolder viewHolderFindViewHolderForItemId;
        int i7;
        int iB;
        int i10;
        int iMin;
        ViewHolder viewHolderFindViewHolderForAdapterPosition;
        ViewHolder viewHolderFindViewHolderForAdapterPosition2;
        int i11;
        View viewFindViewById;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f2529i = false;
        boolean z5 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f2524d == 1) {
            d();
            this.mLayout.setExactMeasureSpecsFrom(this);
            e();
        } else {
            AdapterHelper adapterHelper = this.mAdapterHelper;
            if ((adapterHelper.f2433c.isEmpty() || adapterHelper.f2432b.isEmpty()) && !z5 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                e();
            }
        }
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        State state = this.mState;
        state.f2524d = 1;
        View view = null;
        if (state.j) {
            for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(iE));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    ItemAnimator.ItemHolderInfo itemHolderInfoRecordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    ViewHolder viewHolder = (ViewHolder) this.mViewInfoStore.f2552b.b(changedHolderKey);
                    if (viewHolder == null || viewHolder.shouldIgnore()) {
                        this.mViewInfoStore.a(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                    } else {
                        u1 u1Var = (u1) this.mViewInfoStore.f2551a.get(viewHolder);
                        boolean z6 = (u1Var == null || (u1Var.f2709a & 1) == 0) ? false : true;
                        u1 u1Var2 = (u1) this.mViewInfoStore.f2551a.get(childViewHolderInt);
                        boolean z7 = (u1Var2 == null || (u1Var2.f2709a & 1) == 0) ? false : true;
                        if (z6 && viewHolder == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                        } else {
                            ItemAnimator.ItemHolderInfo itemHolderInfoB = this.mViewInfoStore.b(viewHolder, 4);
                            this.mViewInfoStore.a(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                            ItemAnimator.ItemHolderInfo itemHolderInfoB2 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (itemHolderInfoB == null) {
                                int iE2 = this.mChildHelper.e();
                                for (int i12 = 0; i12 < iE2; i12++) {
                                    ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i12));
                                    if (childViewHolderInt2 != childViewHolderInt && getChangedHolderKey(childViewHolderInt2) == changedHolderKey) {
                                        Adapter adapter = this.mAdapter;
                                        if (adapter == null || !adapter.hasStableIds()) {
                                            StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb2.append(childViewHolderInt2);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(childViewHolderInt);
                                            throw new IllegalStateException(a3.e.i(this, sb2));
                                        }
                                        StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb3.append(childViewHolderInt2);
                                        sb3.append(" \n View Holder 2:");
                                        sb3.append(childViewHolderInt);
                                        throw new IllegalStateException(a3.e.i(this, sb3));
                                    }
                                }
                                Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + viewHolder + " cannot be found but it is necessary for " + childViewHolderInt + exceptionLabel());
                            } else {
                                viewHolder.setIsRecyclable(false);
                                if (z6) {
                                    a(viewHolder);
                                }
                                if (viewHolder != childViewHolderInt) {
                                    if (z7) {
                                        a(childViewHolderInt);
                                    }
                                    viewHolder.mShadowedHolder = childViewHolderInt;
                                    a(viewHolder);
                                    this.mRecycler.n(viewHolder);
                                    childViewHolderInt.setIsRecyclable(false);
                                    childViewHolderInt.mShadowingHolder = viewHolder;
                                }
                                if (this.mItemAnimator.animateChange(viewHolder, childViewHolderInt, itemHolderInfoB, itemHolderInfoB2)) {
                                    postAnimationRunner();
                                }
                            }
                        }
                    }
                }
            }
            ViewInfoStore viewInfoStore = this.mViewInfoStore;
            ViewInfoStore.ProcessCallback processCallback = this.mViewInfoProcessCallback;
            SimpleArrayMap simpleArrayMap = viewInfoStore.f2551a;
            for (int i13 = simpleArrayMap.f1222i - 1; i13 >= 0; i13--) {
                ViewHolder viewHolder2 = (ViewHolder) simpleArrayMap.f(i13);
                u1 u1Var3 = (u1) simpleArrayMap.g(i13);
                int i14 = u1Var3.f2709a;
                if ((i14 & 3) == 3) {
                    processCallback.a(viewHolder2);
                } else if ((i14 & 1) != 0) {
                    ItemAnimator.ItemHolderInfo itemHolderInfo = u1Var3.f2710b;
                    if (itemHolderInfo == null) {
                        processCallback.a(viewHolder2);
                    } else {
                        processCallback.c(viewHolder2, itemHolderInfo, u1Var3.f2711c);
                    }
                } else if ((i14 & 14) == 14) {
                    processCallback.b(viewHolder2, u1Var3.f2710b, u1Var3.f2711c);
                } else if ((i14 & 12) == 12) {
                    processCallback.d(viewHolder2, u1Var3.f2710b, u1Var3.f2711c);
                } else if ((i14 & 4) != 0) {
                    processCallback.c(viewHolder2, u1Var3.f2710b, null);
                } else if ((i14 & 8) != 0) {
                    processCallback.b(viewHolder2, u1Var3.f2710b, u1Var3.f2711c);
                }
                u1Var3.f2709a = 0;
                u1Var3.f2710b = null;
                u1Var3.f2711c = null;
                u1.f2708d.release(u1Var3);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        State state2 = this.mState;
        state2.f2522b = state2.f2525e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        state2.j = false;
        state2.k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f2504b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager.mPrefetchMaxObservedInInitialPrefetch) {
            layoutManager.mPrefetchMaxCountObserved = 0;
            layoutManager.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.o();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        ViewInfoStore viewInfoStore2 = this.mViewInfoStore;
        viewInfoStore2.f2551a.clear();
        viewInfoStore2.f2552b.a();
        int[] iArr = this.mMinMaxLayoutPositions;
        int i15 = iArr[0];
        int i16 = iArr[1];
        g(iArr);
        int[] iArr2 = this.mMinMaxLayoutPositions;
        if (iArr2[0] != i15 || iArr2[1] != i16) {
            dispatchOnScrolled(0, 0);
        }
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                if (this.mState.f2531m == -1) {
                    viewHolderFindViewHolderForItemId = null;
                } else {
                    viewHolderFindViewHolderForItemId = null;
                }
                if (viewHolderFindViewHolderForItemId != null) {
                    if (this.mChildHelper.e() > 0) {
                        State state3 = this.mState;
                        int i17 = state3.f2530l;
                        if (i17 != -1) {
                        }
                        iB = state3.b();
                        i10 = i7;
                        while (true) {
                            if (i10 < iB) {
                                viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i10);
                                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                    if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                            for (iMin = Math.min(iB, i7) - 1; iMin >= 0; iMin--) {
                                viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (viewHolderFindViewHolderForAdapterPosition == null) {
                                    break;
                                    break;
                                } else {
                                    if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (this.mChildHelper.f2447c.contains(viewHolderFindViewHolderForItemId.itemView)) {
                    if (this.mChildHelper.e() > 0) {
                        State state4 = this.mState;
                        int i18 = state4.f2530l;
                        if (i18 != -1) {
                        }
                        iB = state4.b();
                        i10 = i7;
                        while (true) {
                            if (i10 < iB) {
                                viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i10);
                                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                    if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (viewHolderFindViewHolderForAdapterPosition == null) {
                                    break;
                                    break;
                                } else {
                                    if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (this.mChildHelper.e() > 0) {
                    State state5 = this.mState;
                    int i19 = state5.f2530l;
                    if (i19 != -1) {
                    }
                    iB = state5.b();
                    i10 = i7;
                    while (true) {
                        if (i10 < iB) {
                            viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i10);
                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                    view = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                            if (viewHolderFindViewHolderForAdapterPosition == null) {
                                break;
                                break;
                            } else {
                                if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                    view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (view != null) {
                    i11 = this.mState.f2532n;
                    if (i11 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (this.mChildHelper.f2447c.contains(getFocusedChild())) {
                if (this.mState.f2531m == -1 && this.mAdapter.hasStableIds()) {
                    viewHolderFindViewHolderForItemId = findViewHolderForItemId(this.mState.f2531m);
                } else {
                    viewHolderFindViewHolderForItemId = null;
                }
                if (viewHolderFindViewHolderForItemId != null) {
                    if (this.mChildHelper.e() > 0) {
                        State state6 = this.mState;
                        int i110 = state6.f2530l;
                        if (i110 != -1) {
                        }
                        iB = state6.b();
                        i10 = i7;
                        while (true) {
                            if (i10 < iB) {
                                viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i10);
                                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                    if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (viewHolderFindViewHolderForAdapterPosition == null) {
                                    break;
                                    break;
                                } else {
                                    if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (this.mChildHelper.f2447c.contains(viewHolderFindViewHolderForItemId.itemView) && viewHolderFindViewHolderForItemId.itemView.hasFocusable()) {
                    view = viewHolderFindViewHolderForItemId.itemView;
                } else if (this.mChildHelper.e() > 0) {
                    State state7 = this.mState;
                    int i111 = state7.f2530l;
                    i7 = i111 != -1 ? i111 : 0;
                    iB = state7.b();
                    i10 = i7;
                    while (true) {
                        if (i10 < iB) {
                            viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i10);
                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                    view = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                            if (viewHolderFindViewHolderForAdapterPosition == null) {
                                break;
                            }
                            if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i11 = this.mState.f2532n;
                    if (i11 != -1 && (viewFindViewById = view.findViewById(i11)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        State state8 = this.mState;
        state8.f2531m = -1L;
        state8.f2530l = -1;
        state8.f2532n = -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f7, boolean z5) {
        return getScrollingChildHelper().a(f2, f7, z5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f7) {
        return getScrollingChildHelper().b(f2, f7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i7, i10, i11, i12, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i7) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onScrollStateChanged(i7);
        }
        onScrollStateChanged(i7);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i7);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i7);
            }
        }
    }

    public void dispatchOnScrolled(int i7, int i10) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i10);
        onScrolled(i7, i10);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i7, i10);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i7, i10);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i7;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = this.mPendingAccessibilityImportanceChange.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i7 = viewHolder.mPendingAccessibilityState) != -1) {
                viewHolder.itemView.setImportantForAccessibility(i7);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        boolean z5;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            this.mItemDecorations.get(i7).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z5 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z5 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z5 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z5 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z5 |= z6;
            canvas.restoreToCount(iSave4);
        }
        if ((z5 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) ? z5 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NonNull Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f2525e = this.mAdapter.getItemCount();
        this.mState.f2523c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f2513i;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        State state = this.mState;
        state.f2527g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, state);
        State state2 = this.mState;
        state2.f2526f = false;
        state2.j = state2.j && this.mItemAnimator != null;
        state2.f2524d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mBottomGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mLeftGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mRightGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mTopGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i7 = 0; i7 < size; i7++) {
            OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i7);
            if (onItemTouchListener.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    public final void fillRemainingScrollValues(State state) {
        if (getScrollState() != 2) {
            state.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f2535i;
        overScroller.getFinalX();
        overScroller.getCurrX();
        state.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f2, float f7) {
        for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
            View viewD = this.mChildHelper.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f2 >= viewD.getLeft() + translationX && f2 <= viewD.getRight() + translationX && f7 >= viewD.getTop() + translationY && f7 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public ViewHolder findContainingViewHolder(@NonNull View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public ViewHolder findViewHolderForAdapterPosition(int i7) {
        ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i7) {
                ChildHelper childHelper = this.mChildHelper;
                if (!childHelper.f2447c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                viewHolder = childViewHolderInt;
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForItemId(long j) {
        Adapter adapter = this.mAdapter;
        ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int iH = this.mChildHelper.h();
            for (int i7 = 0; i7 < iH; i7++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i7));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    ChildHelper childHelper = this.mChildHelper;
                    if (!childHelper.f2447c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForLayoutPosition(int i7) {
        return findViewHolderForPosition(i7, false);
    }

    @Deprecated
    public ViewHolder findViewHolderForPosition(int i7) {
        return findViewHolderForPosition(i7, false);
    }

    public boolean fling(int i7, int i10) {
        return h(i7, i10, this.mMinFlingVelocity, this.mMaxFlingVelocity);
    }

    public boolean flingNoThresholdCheck(int i7, int i10) {
        return h(i7, i10, 0, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0173  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i7) {
        View viewOnFocusSearchFailed;
        int i10;
        byte b10;
        boolean z5;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i7);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z6 = true;
        boolean z7 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z7 && (i7 == 2 || i7 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                if (focusFinder.findNextFocus(this, view, i7 == 2 ? 130 : 33) == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                z5 = false;
            }
            if (!z5 && this.mLayout.canScrollHorizontally()) {
                z5 = focusFinder.findNextFocus(this, view, (this.mLayout.getLayoutDirection() == 1) ^ (i7 == 2) ? 66 : 17) == null;
            }
            if (z5) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i7, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i7);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i7);
            if (viewFindNextFocus == null && z7) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i7, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed != null && !viewOnFocusSearchFailed.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i7);
            }
            o(viewOnFocusSearchFailed, null);
            return view;
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed == this || viewOnFocusSearchFailed == view) {
            z6 = false;
        } else if (findContainingItemView(viewOnFocusSearchFailed) == null) {
            z6 = false;
        } else if (view != null && findContainingItemView(view) != null) {
            this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
            this.mTempRect2.set(0, 0, viewOnFocusSearchFailed.getWidth(), viewOnFocusSearchFailed.getHeight());
            offsetDescendantRectToMyCoords(view, this.mTempRect);
            offsetDescendantRectToMyCoords(viewOnFocusSearchFailed, this.mTempRect2);
            int i11 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
            Rect rect = this.mTempRect;
            int i12 = rect.left;
            Rect rect2 = this.mTempRect2;
            int i13 = rect2.left;
            if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
                i10 = 1;
            } else {
                int i14 = rect.right;
                int i15 = rect2.right;
                i10 = ((i14 > i15 || i12 >= i15) && i12 > i13) ? -1 : 0;
            }
            int i16 = rect.top;
            int i17 = rect2.top;
            if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
                b10 = 1;
            } else {
                int i18 = rect.bottom;
                int i19 = rect2.bottom;
                b10 = ((i18 > i19 || i16 >= i19) && i16 > i17) ? (byte) -1 : (byte) 0;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 17) {
                        if (i7 != 33) {
                            if (i7 != 66) {
                                if (i7 != 130) {
                                    StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                    sb2.append(i7);
                                    throw new IllegalArgumentException(a3.e.i(this, sb2));
                                }
                                if (b10 <= 0) {
                                    z6 = false;
                                }
                            } else if (i10 <= 0) {
                                z6 = false;
                            }
                        } else if (b10 >= 0) {
                            z6 = false;
                        }
                    } else if (i10 >= 0) {
                        z6 = false;
                    }
                } else if (b10 <= 0 && (b10 != 0 || i10 * i11 <= 0)) {
                    z6 = false;
                }
            } else if (b10 >= 0 && (b10 != 0 || i10 * i11 >= 0)) {
                z6 = false;
            }
        }
        return z6 ? viewOnFocusSearchFailed : super.focusSearch(view, i7);
    }

    public final void g(int[] iArr) {
        int iE = this.mChildHelper.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i7 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < iE; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i7) {
                    i7 = layoutPosition;
                }
                if (layoutPosition > i10) {
                    i10 = layoutPosition;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i10;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(a3.e.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(a3.e.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        AdapterHelper adapterHelper = this.mAdapterHelper;
        int i7 = viewHolder.mPosition;
        ArrayList arrayList = adapterHelper.f2432b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f2553a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = aVar.f2554b;
                    if (i12 <= i7) {
                        int i13 = aVar.f2556d;
                        if (i12 + i13 > i7) {
                            return -1;
                        }
                        i7 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = aVar.f2554b;
                    if (i14 == i7) {
                        i7 = aVar.f2556d;
                    } else {
                        if (i14 < i7) {
                            i7--;
                        }
                        if (aVar.f2556d <= i7) {
                            i7++;
                        }
                    }
                }
            } else if (aVar.f2554b <= i7) {
                i7 += aVar.f2556d;
            }
        }
        return i7;
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.mLayout;
        return layoutManager != null ? layoutManager.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(ViewHolder viewHolder) {
        return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i10) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.mChildDrawingOrderCallback;
        return childDrawingOrderCallback == null ? super.getChildDrawingOrder(i7, i10) : childDrawingOrderCallback.onGetChildDrawingOrder(i7, i10);
    }

    public long getChildItemId(@NonNull View view) {
        ViewHolder childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z5 = layoutParams.f2501i;
        Rect rect = layoutParams.f2500e;
        if (!z5 || (this.mState.f2527g && (layoutParams.f2499d.isUpdated() || layoutParams.f2499d.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i7).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i10 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f2501i = false;
        return rect;
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int i7) {
        int itemDecorationCount = getItemDecorationCount();
        if (i7 >= 0 && i7 < itemDecorationCount) {
            return this.mItemDecorations.get(i7);
        }
        throw new IndexOutOfBoundsException(i7 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    public final boolean h(int i7, int i10, int i11, int i12) {
        int iMax;
        int i13;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.mLayoutSuppressed) {
            boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
            boolean zCanScrollVertically = this.mLayout.canScrollVertically();
            if (!zCanScrollHorizontally || Math.abs(i7) < i11) {
                i7 = 0;
            }
            if (!zCanScrollVertically || Math.abs(i10) < i11) {
                i10 = 0;
            }
            if (i7 != 0 || i10 != 0) {
                if (i7 == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || sa.a.n(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.mRightGlow;
                        if (edgeEffect2 == null || sa.a.n(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (q(this.mRightGlow, i7, getWidth())) {
                            this.mRightGlow.onAbsorb(i7);
                            i7 = 0;
                        }
                    } else {
                        int i14 = -i7;
                        if (q(this.mLeftGlow, i14, getWidth())) {
                            this.mLeftGlow.onAbsorb(i14);
                            i7 = 0;
                        }
                    }
                    iMax = i7;
                    i7 = 0;
                }
                if (i10 == 0) {
                    i13 = i10;
                    i10 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    if (edgeEffect3 == null || sa.a.n(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.mBottomGlow;
                        if (edgeEffect4 == null || sa.a.n(edgeEffect4) == 0.0f) {
                            i13 = i10;
                            i10 = 0;
                        } else if (q(this.mBottomGlow, i10, getHeight())) {
                            this.mBottomGlow.onAbsorb(i10);
                            i10 = 0;
                        }
                    } else {
                        int i15 = -i10;
                        if (q(this.mTopGlow, i15, getHeight())) {
                            this.mTopGlow.onAbsorb(i15);
                            i10 = 0;
                        }
                    }
                    i13 = 0;
                }
                if (iMax != 0 || i10 != 0) {
                    int i16 = -i12;
                    iMax = Math.max(i16, Math.min(iMax, i12));
                    i10 = Math.max(i16, Math.min(i10, i12));
                    r(1);
                    this.mViewFlinger.a(iMax, i10);
                }
                if (i7 != 0 || i13 != 0) {
                    float f2 = i7;
                    float f7 = i13;
                    if (!dispatchNestedPreFling(f2, f7)) {
                        boolean z5 = zCanScrollHorizontally || zCanScrollVertically;
                        dispatchNestedFling(f2, f7, z5);
                        OnFlingListener onFlingListener = this.mOnFlingListener;
                        if (onFlingListener == null || !onFlingListener.onFling(i7, i13)) {
                            if (z5) {
                                r(1);
                                int i17 = -i12;
                                this.mViewFlinger.a(Math.max(i17, Math.min(i7, i12)), Math.max(i17, Math.min(i13, i12)));
                                return true;
                            }
                        }
                        return true;
                    }
                } else if (iMax != 0 || i10 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public final void i(int i7, MotionEvent motionEvent, int i10) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i11 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iM = i7 - m(height, i7);
        int iN = i10 - n(width, i10);
        startNestedScroll(i11, 1);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM : 0, zCanScrollVertically ? iN : 0, this.mReusableIntPair, this.mScrollOffset, 1)) {
            int[] iArr2 = this.mReusableIntPair;
            iM -= iArr2[0];
            iN -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iM : 0, zCanScrollVertically ? iN : 0, motionEvent, 1);
        GapWorker gapWorker = this.mGapWorker;
        if (gapWorker != null && (iM != 0 || iN != 0)) {
            gapWorker.a(this, iM, iN);
        }
        stopNestedScroll(1);
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new a1(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(a3.e.i(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new c0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.discord.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.discord.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.discord.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f1599d;
    }

    public final void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i7);
            int x5 = (int) (motionEvent.getX(i7) + 0.5f);
            this.mLastTouchX = x5;
            this.mInitialTouchX = x5;
            int y5 = (int) (motionEvent.getY(i7) + 0.5f);
            this.mLastTouchY = y5;
            this.mInitialTouchY = y5;
        }
    }

    public void jumpToPositionForSmoothScroller(int i7) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i7);
        awakenScrollBars();
    }

    public final void k() {
        boolean z5;
        boolean z6 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            AdapterHelper adapterHelper = this.mAdapterHelper;
            adapterHelper.k(adapterHelper.f2432b);
            adapterHelper.k(adapterHelper.f2433c);
            adapterHelper.f2436f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (this.mItemAnimator == null || !this.mLayout.supportsPredictiveItemAnimations()) {
            this.mAdapterHelper.c();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z7 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z5 = this.mDataSetHasChangedAfterLayout) || z7 || this.mLayout.mRequestedSimpleAnimations) && (!z5 || this.mAdapter.hasStableIds());
        State state = this.mState;
        if (state.j && z7 && !this.mDataSetHasChangedAfterLayout && this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations()) {
            z6 = true;
        }
        state.k = z6;
    }

    public final void l() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final int m(float f2, int i7) {
        float height = f2 / getHeight();
        float width = i7 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f7 = 0.0f;
        if (edgeEffect == null || sa.a.n(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && sa.a.n(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fZ = sa.a.z(this.mRightGlow, width, height);
                    if (sa.a.n(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f7 = fZ;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f10 = -sa.a.z(this.mLeftGlow, -width, 1.0f - height);
                if (sa.a.n(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f7 = f10;
            }
            invalidate();
        }
        return Math.round(f7 * getWidth());
    }

    public void markItemDecorInsetsDirty() {
        int iH = this.mChildHelper.h();
        for (int i7 = 0; i7 < iH; i7++) {
            ((LayoutParams) this.mChildHelper.g(i7).getLayoutParams()).f2501i = true;
        }
        ArrayList arrayList = this.mRecycler.f2505c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutParams layoutParams = (LayoutParams) ((ViewHolder) arrayList.get(i10)).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f2501i = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iH = this.mChildHelper.h();
        for (int i7 = 0; i7 < iH; i7++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i7));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.f2505c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i10);
            if (viewHolder != null) {
                viewHolder.addFlags(6);
                viewHolder.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.mAdapter;
        if (adapter == null || !adapter.hasStableIds()) {
            recycler.h();
        }
    }

    public final int n(float f2, int i7) {
        float width = f2 / getWidth();
        float height = i7 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f7 = 0.0f;
        if (edgeEffect == null || sa.a.n(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && sa.a.n(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fZ = sa.a.z(this.mBottomGlow, height, 1.0f - width);
                    if (sa.a.n(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f7 = fZ;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f10 = -sa.a.z(this.mTopGlow, -height, width);
                if (sa.a.n(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f7 = f10;
            }
            invalidate();
        }
        return Math.round(f7 * getHeight());
    }

    public void nestedScrollBy(int i7, int i10) {
        i(i7, null, i10);
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f2501i) {
                Rect rect = layoutParams2.f2500e;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    public void offsetChildrenHorizontal(int i7) {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            this.mChildHelper.d(i10).offsetLeftAndRight(i7);
        }
    }

    public void offsetChildrenVertical(int i7) {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            this.mChildHelper.d(i10).offsetTopAndBottom(i7);
        }
    }

    public void offsetPositionRecordsForInsert(int i7, int i10) {
        int iH = this.mChildHelper.h();
        for (int i11 = 0; i11 < iH; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i7) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i11 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i10));
                }
                childViewHolderInt.offsetPosition(i10, false);
                this.mState.f2526f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f2505c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i12);
            if (viewHolder != null && viewHolder.mPosition >= i7) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert cached " + i12 + " holder " + viewHolder + " now at position " + (viewHolder.mPosition + i10));
                }
                viewHolder.offsetPosition(i10, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iH = this.mChildHelper.h();
        int i18 = -1;
        if (i7 < i10) {
            i12 = i7;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i7;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < iH; i19++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i19));
            if (childViewHolderInt != null && (i17 = childViewHolderInt.mPosition) >= i12 && i17 <= i11) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i19 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i7) {
                    childViewHolderInt.offsetPosition(i10 - i7, false);
                } else {
                    childViewHolderInt.offsetPosition(i13, false);
                }
                this.mState.f2526f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f2505c;
        if (i7 < i10) {
            i15 = i7;
            i14 = i10;
        } else {
            i14 = i7;
            i18 = 1;
            i15 = i10;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i20);
            if (viewHolder != null && (i16 = viewHolder.mPosition) >= i15 && i16 <= i14) {
                if (i16 == i7) {
                    viewHolder.offsetPosition(i10 - i7, false);
                } else {
                    viewHolder.offsetPosition(i18, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove cached child " + i20 + " holder " + viewHolder);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i7, int i10, boolean z5) {
        int i11 = i7 + i10;
        int iH = this.mChildHelper.h();
        for (int i12 = 0; i12 < iH; i12++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i13 = childViewHolderInt.mPosition;
                if (i13 >= i11) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i12 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i10));
                    }
                    childViewHolderInt.offsetPosition(-i10, z5);
                    this.mState.f2526f = true;
                } else if (i13 >= i7) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i12 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i7 - 1, -i10, z5);
                    this.mState.f2526f = true;
                }
            }
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.f2505c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
            if (viewHolder != null) {
                int i14 = viewHolder.mPosition;
                if (i14 >= i11) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + viewHolder + " now at position " + (viewHolder.mPosition - i10));
                    }
                    viewHolder.offsetPosition(-i10, z5);
                } else if (i14 >= i7) {
                    viewHolder.addFlags(8);
                    recycler.i(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.g();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = GapWorker.f2456w;
            GapWorker gapWorker = (GapWorker) threadLocal.get();
            this.mGapWorker = gapWorker;
            if (gapWorker == null) {
                this.mGapWorker = new GapWorker();
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                GapWorker gapWorker2 = this.mGapWorker;
                gapWorker2.f2460i = (long) (1.0E9f / refreshRate);
                threadLocal.set(gapWorker2);
            }
            ArrayList arrayList = this.mGapWorker.f2458d;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        GapWorker gapWorker;
        ArrayList arrayList;
        int iF;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (u1.f2708d.acquire() != null) {
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList2 = recycler.f2505c;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            zs.a.i(((ViewHolder) arrayList2.get(i7)).itemView);
        }
        Adapter adapter = RecyclerView.this.mAdapter;
        RecycledViewPool recycledViewPool = recycler.f2509g;
        if (recycledViewPool != null) {
            recycledViewPool.detachForPoolingContainer(adapter, false);
        }
        Intrinsics.checkNotNullParameter(this, "<this>");
        Iterator it = new androidx.core.view.x0(this).iterator();
        do {
            androidx.core.view.y0 y0Var = (androidx.core.view.y0) it;
            if (!y0Var.hasNext()) {
                if (!ALLOW_THREAD_GAP_WORK || (gapWorker = this.mGapWorker) == null) {
                    return;
                }
                boolean zRemove = gapWorker.f2458d.remove(this);
                if (sDebugAssertionsEnabled && !zRemove) {
                    throw new IllegalStateException("RecyclerView removal failed!");
                }
                this.mGapWorker = null;
                return;
            }
            View view = (View) y0Var.next();
            c2.a aVar = (c2.a) view.getTag(com.discord.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new c2.a();
                view.setTag(com.discord.R.id.pooling_container_listener_holder_tag, aVar);
            }
            arrayList = aVar.f3421a;
            iF = kotlin.collections.d0.f(arrayList);
        } while (-1 >= iF);
        arrayList.get(iF).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.mItemDecorations.get(i7).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i7;
        boolean z5;
        float axisValue;
        RecyclerView recyclerView;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            float f2 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f7 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                z5 = false;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
                f2 = f7;
                i7 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i7 = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    float f10 = -axisValue;
                    axisValue = 0.0f;
                    f2 = f10;
                } else if (!this.mLayout.canScrollHorizontally()) {
                    axisValue = 0.0f;
                }
                z5 = this.mLowResRotaryEncoderFeature;
            } else {
                i7 = 0;
                z5 = false;
                axisValue = 0.0f;
            }
            int i10 = (int) (f2 * this.mScaledVerticalScrollFactor);
            int i11 = (int) (axisValue * this.mScaledHorizontalScrollFactor);
            if (z5) {
                OverScroller overScroller = this.mViewFlinger.f2535i;
                recyclerView = this;
                recyclerView.smoothScrollBy((overScroller.getFinalX() - overScroller.getCurrX()) + i11, (overScroller.getFinalY() - overScroller.getCurrY()) + i10, null, Integer.MIN_VALUE, true);
            } else {
                recyclerView = this;
                i(i11, motionEvent, i10);
            }
            if (i7 != 0 && !z5) {
                recyclerView.mDifferentialMotionFlingController.a(motionEvent, i7);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        if (!this.mLayoutSuppressed) {
            this.mInterceptingOnItemTouchListener = null;
            if (f(motionEvent)) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                stopNestedScroll(0);
                l();
                setScrollState(0);
                return true;
            }
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
                boolean zCanScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x5 = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x5;
                    this.mInitialTouchX = x5;
                    int y5 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y5;
                    this.mInitialTouchY = y5;
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || sa.a.n(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z5 = false;
                    } else {
                        sa.a.z(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z5 = true;
                    }
                    EdgeEffect edgeEffect2 = this.mRightGlow;
                    if (edgeEffect2 != null && sa.a.n(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        sa.a.z(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
                        z5 = true;
                    }
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    if (edgeEffect3 != null && sa.a.n(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        sa.a.z(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
                        z5 = true;
                    }
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    if (edgeEffect4 != null && sa.a.n(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        sa.a.z(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z5 = true;
                    }
                    if (z5 || this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        stopNestedScroll(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    r(0);
                } else if (actionMasked == 1) {
                    this.mVelocityTracker.clear();
                    stopNestedScroll(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (iFindPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x6 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y8 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i7 = x6 - this.mInitialTouchX;
                        int i10 = y8 - this.mInitialTouchY;
                        if (!zCanScrollHorizontally || Math.abs(i7) <= this.mTouchSlop) {
                            z6 = false;
                        } else {
                            this.mLastTouchX = x6;
                            z6 = true;
                        }
                        if (zCanScrollVertically && Math.abs(i10) > this.mTouchSlop) {
                            this.mLastTouchY = y8;
                            z6 = true;
                        }
                        if (z6) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.mVelocityTracker;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    stopNestedScroll(0);
                    l();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x10;
                    this.mInitialTouchX = x10;
                    int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y10;
                    this.mInitialTouchY = y10;
                } else if (actionMasked == 6) {
                    j(motionEvent);
                }
                if (this.mScrollState == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i7, i10);
            return;
        }
        boolean z5 = false;
        if (layoutManager.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i7, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z5 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z5;
            if (z5 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f2524d == 1) {
                d();
            }
            this.mLayout.setMeasureSpecs(i7, i10);
            this.mState.f2529i = true;
            e();
            this.mLayout.setMeasuredDimensionFromChildren(i7, i10);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f2529i = true;
                e();
                this.mLayout.setMeasuredDimensionFromChildren(i7, i10);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i7, i10);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            k();
            onExitLayoutOrScroll();
            State state = this.mState;
            if (state.k) {
                state.f2527g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f2527g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            this.mState.f2525e = adapter.getItemCount();
        } else {
            this.mState.f2525e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i7, i10);
        stopInterceptRequestLayout(false);
        this.mState.f2527g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.f7578d);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f2513i = savedState2.f2513i;
            return savedState;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            savedState.f2513i = layoutManager.onSaveInstanceState();
            return savedState;
        }
        savedState.f2513i = null;
        return savedState;
    }

    public void onScrollStateChanged(int i7) {
    }

    public void onScrolled(int i7, int i10) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 == i11 && i10 == i12) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0113 A[PHI: r1
      0x0113: PHI (r1v51 int) = (r1v31 int), (r1v55 int) binds: [B:56:0x00fc, B:60:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zF;
        boolean z5;
        if (!this.mLayoutSuppressed && !this.mIgnoreMotionEventTillDown) {
            OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
            if (onItemTouchListener == null) {
                zF = motionEvent.getAction() == 0 ? false : f(motionEvent);
            } else {
                onItemTouchListener.onTouchEvent(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.mInterceptingOnItemTouchListener = null;
                }
                zF = true;
            }
            if (zF) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                stopNestedScroll(0);
                l();
                setScrollState(0);
                return true;
            }
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
                boolean zCanScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                int[] iArr2 = this.mNestedOffsets;
                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.mVelocityTracker.addMovement(motionEventObtain);
                        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                        float f2 = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                        float f7 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                        if ((f2 == 0.0f && f7 == 0.0f) || !fling((int) f2, (int) f7)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker2 = this.mVelocityTracker;
                        if (velocityTracker2 != null) {
                            velocityTracker2.clear();
                        }
                        stopNestedScroll(0);
                        l();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                        if (iFindPointerIndex < 0) {
                            Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x5 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y5 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.mLastTouchX - x5;
                        int iMax2 = this.mLastTouchY - y5;
                        if (this.mScrollState != 1) {
                            if (zCanScrollHorizontally) {
                                iMax = iMax > 0 ? Math.max(0, iMax - this.mTouchSlop) : Math.min(0, iMax + this.mTouchSlop);
                                if (iMax != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                            } else {
                                z5 = false;
                            }
                            if (zCanScrollVertically) {
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.mTouchSlop) : Math.min(0, iMax2 + this.mTouchSlop);
                                if (iMax2 != 0) {
                                    z5 = true;
                                }
                            }
                            if (z5) {
                                setScrollState(1);
                            }
                        }
                        if (this.mScrollState == 1) {
                            int[] iArr3 = this.mReusableIntPair;
                            iArr3[0] = 0;
                            iArr3[1] = 0;
                            int iM = iMax - m(motionEvent.getY(), iMax);
                            int iN = iMax2 - n(motionEvent.getX(), iMax2);
                            if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM : 0, zCanScrollVertically ? iN : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                                int[] iArr4 = this.mReusableIntPair;
                                iM -= iArr4[0];
                                iN -= iArr4[1];
                                int[] iArr5 = this.mNestedOffsets;
                                int i7 = iArr5[0];
                                int[] iArr6 = this.mScrollOffset;
                                iArr5[0] = i7 + iArr6[0];
                                iArr5[1] = iArr5[1] + iArr6[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int[] iArr7 = this.mScrollOffset;
                            this.mLastTouchX = x5 - iArr7[0];
                            this.mLastTouchY = y5 - iArr7[1];
                            if (scrollByInternal(zCanScrollHorizontally ? iM : 0, zCanScrollVertically ? iN : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            GapWorker gapWorker = this.mGapWorker;
                            if (gapWorker != null && (iM != 0 || iN != 0)) {
                                gapWorker.a(this, iM, iN);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker3 = this.mVelocityTracker;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        stopNestedScroll(0);
                        l();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                        int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.mLastTouchX = x6;
                        this.mInitialTouchX = x6;
                        int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.mLastTouchY = y8;
                        this.mInitialTouchY = y8;
                    } else if (actionMasked == 6) {
                        j(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.mScrollPointerId = motionEvent.getPointerId(0);
                int x10 = (int) (motionEvent.getX() + 0.5f);
                this.mLastTouchX = x10;
                this.mInitialTouchX = x10;
                int y10 = (int) (motionEvent.getY() + 0.5f);
                this.mLastTouchY = y10;
                this.mInitialTouchY = y10;
                r(0);
                this.mVelocityTracker.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p(Adapter adapter, boolean z5, boolean z6) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z5 || z6) {
            removeAndRecycleViews();
        }
        AdapterHelper adapterHelper = this.mAdapterHelper;
        adapterHelper.k(adapterHelper.f2432b);
        adapterHelper.k(adapterHelper.f2433c);
        adapterHelper.f2436f = 0;
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(adapter3, this.mAdapter);
        }
        Recycler recycler = this.mRecycler;
        Adapter adapter4 = this.mAdapter;
        recycler.b();
        RecycledViewPool recycledViewPool = recycler.f2509g;
        if (recycledViewPool != null) {
            recycledViewPool.detachForPoolingContainer(adapter3, true);
        }
        recycler.d().onAdapterChanged(adapter3, adapter4, z5);
        recycler.g();
        this.mState.f2526f = true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z5) {
        this.mDispatchItemsChangedEvent = z5 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public final boolean q(EdgeEffect edgeEffect, int i7, int i10) {
        if (i7 > 0) {
            return true;
        }
        float fN = sa.a.n(edgeEffect) * i10;
        double dLog = Math.log((Math.abs(-i7) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        double d6 = DECELERATION_RATE;
        return ((float) (Math.exp((d6 / (d6 - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)))) < fN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(int i7) {
        boolean zCanScrollHorizontally = this.mLayout.canScrollHorizontally();
        int i10 = zCanScrollHorizontally;
        if (this.mLayout.canScrollVertically()) {
            i10 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        startNestedScroll(i10, i7);
    }

    public void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, 8192);
        if (this.mState.f2528h && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.mViewInfoStore.f2552b.e(getChangedHolderKey(viewHolder), viewHolder);
        }
        SimpleArrayMap simpleArrayMap = this.mViewInfoStore.f2551a;
        u1 u1VarA = (u1) simpleArrayMap.get(viewHolder);
        if (u1VarA == null) {
            u1VarA = u1.a();
            simpleArrayMap.put(viewHolder, u1VarA);
        }
        u1VarA.f2710b = itemHolderInfo;
        u1VarA.f2709a |= 4;
    }

    public void removeAndRecycleViews() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.b();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        ChildHelper childHelper = this.mChildHelper;
        h hVar = childHelper.f2446b;
        z0 z0Var = childHelper.f2445a;
        int i7 = childHelper.f2448d;
        boolean z5 = false;
        if (i7 == 1) {
            if (childHelper.f2449e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
        } else {
            if (i7 == 2) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
            }
            try {
                childHelper.f2448d = 2;
                int iIndexOfChild = z0Var.f2730a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    childHelper.l(view);
                } else if (hVar.H(iIndexOfChild)) {
                    hVar.K(iIndexOfChild);
                    childHelper.l(view);
                    z0Var.a(iIndexOfChild);
                } else {
                    childHelper.f2448d = 0;
                }
                childHelper.f2448d = 0;
                z5 = true;
            } catch (Throwable th2) {
                childHelper.f2448d = 0;
                throw th2;
            }
        }
        if (z5) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.n(childViewHolderInt);
            this.mRecycler.k(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Log.d(TAG, "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!z5);
        return z5;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z5) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(a3.e.i(this, sb2));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(a3.e.i(this, sb3));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z5);
    }

    public void removeItemDecoration(@NonNull ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(itemDecoration);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i7) {
        int itemDecorationCount = getItemDecorationCount();
        if (i7 >= 0 && i7 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i7));
            return;
        }
        throw new IndexOutOfBoundsException(i7 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(onChildAttachStateChangeListener);
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        this.mRecyclerListeners.remove(recyclerListener);
    }

    public void repositionShadowingViews() {
        ViewHolder viewHolder;
        int iE = this.mChildHelper.e();
        for (int i7 = 0; i7 < iE; i7++) {
            View viewD = this.mChildHelper.d(i7);
            ViewHolder childViewHolder = getChildViewHolder(viewD);
            if (childViewHolder != null && (viewHolder = childViewHolder.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        int size = this.mOnItemTouchListeners.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.mOnItemTouchListeners.get(i7).onRequestDisallowInterceptTouchEvent(z5);
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i7 = 0; i7 < iH; i7++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i7));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(a3.e.i(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i7, int i10) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i7 = 0;
            }
            if (!zCanScrollVertically) {
                i10 = 0;
            }
            scrollByInternal(i7, i10, null, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109 A[DONT_INVERT, PHI: r7
      0x0109: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00f0, B:31:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x010b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0113  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    public boolean scrollByInternal(int i7, int i10, MotionEvent motionEvent, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z5;
        boolean z6;
        boolean z7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i7, i10, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i14 = i7 - i16;
            i15 = i10 - i17;
            i13 = i17;
            i12 = i16;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i12, i13, i14, i15, this.mScrollOffset, i11, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i18 = iArr4[0];
        int i19 = i14 - i18;
        int i20 = iArr4[1];
        int i21 = i15 - i20;
        boolean z10 = (i18 == 0 && i20 == 0) ? false : true;
        int i22 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i23 = iArr5[0];
        this.mLastTouchX = i22 - i23;
        int i24 = this.mLastTouchY;
        int i25 = iArr5[1];
        this.mLastTouchY = i24 - i25;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i23;
        iArr6[1] = iArr6[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || m3.m.E(motionEvent, 8194)) {
                z5 = true;
                z6 = false;
            } else {
                float x5 = motionEvent.getX();
                float f2 = i19;
                float y5 = motionEvent.getY();
                float f7 = i21;
                if (f2 < 0.0f) {
                    ensureLeftGlow();
                    z5 = true;
                    z6 = false;
                    sa.a.z(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (y5 / getHeight()));
                } else {
                    z5 = true;
                    z6 = false;
                    if (f2 > 0.0f) {
                        ensureRightGlow();
                        sa.a.z(this.mRightGlow, f2 / getWidth(), y5 / getHeight());
                    } else {
                        z7 = false;
                    }
                    if (f7 < 0.0f) {
                        ensureTopGlow();
                        sa.a.z(this.mTopGlow, (-f7) / getHeight(), x5 / getWidth());
                    } else if (f7 > 0.0f) {
                        ensureBottomGlow();
                        sa.a.z(this.mBottomGlow, f7 / getHeight(), 1.0f - (x5 / getWidth()));
                    } else {
                        if (z7 || f2 != 0.0f || f7 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && m3.m.E(motionEvent, 4194304)) {
                            l();
                        }
                    }
                    z7 = z5;
                    if (z7) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        l();
                    }
                }
                z7 = z5;
                if (f7 < 0.0f) {
                    ensureTopGlow();
                    sa.a.z(this.mTopGlow, (-f7) / getHeight(), x5 / getWidth());
                } else if (f7 > 0.0f) {
                    ensureBottomGlow();
                    sa.a.z(this.mBottomGlow, f7 / getHeight(), 1.0f - (x5 / getWidth()));
                } else {
                    if (z7) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        l();
                    }
                }
                z7 = z5;
                if (z7) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    l();
                }
            }
            considerReleasingGlowsOnScroll(i7, i10);
        } else {
            z5 = true;
            z6 = false;
        }
        if (i12 != 0 || i13 != 0) {
            dispatchOnScrolled(i12, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i12 == 0 && i13 == 0) ? z6 : z5;
    }

    public void scrollStep(int i7, int i10, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i7 != 0 ? this.mLayout.scrollHorizontallyBy(i7, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i10 != 0 ? this.mLayout.scrollVerticallyBy(i10, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i10) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i7) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.scrollToPosition(i7);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        androidx.core.view.u0.p(this, recyclerViewAccessibilityDelegate);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        p(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = childDrawingOrderCallback;
        setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
    }

    public boolean setChildImportantForAccessibilityInternal(ViewHolder viewHolder, int i7) {
        if (!isComputingLayout()) {
            viewHolder.itemView.setImportantForAccessibility(i7);
            return true;
        }
        viewHolder.mPendingAccessibilityState = i7;
        this.mPendingAccessibilityImportanceChange.add(viewHolder);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z5) {
        if (z5 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z5;
        super.setClipToPadding(z5);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        edgeEffectFactory.getClass();
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z5) {
        this.mHasFixedSize = z5;
    }

    public void setItemAnimator(ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i7) {
        Recycler recycler = this.mRecycler;
        recycler.f2507e = i7;
        recycler.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z5) {
        suppressLayout(z5);
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            ItemAnimator itemAnimator = this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.b();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.b();
        }
        ChildHelper childHelper = this.mChildHelper;
        RecyclerView recyclerView = childHelper.f2445a.f2730a;
        childHelper.f2446b.L();
        ArrayList arrayList = childHelper.f2447c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ViewHolder childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(layoutManager);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(a3.e.i(layoutManager.mRecyclerView, sb2));
            }
            layoutManager.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        NestedScrollingChildHelper scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f1599d) {
            ViewGroup viewGroup = scrollingChildHelper.f1598c;
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            androidx.core.view.l0.o(viewGroup);
        }
        scrollingChildHelper.f1599d = z5;
    }

    public void setOnFlingListener(OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z5) {
        this.mPreserveFocusAfterLayout = z5;
    }

    public void setRecycledViewPool(RecycledViewPool recycledViewPool) {
        Recycler recycler = this.mRecycler;
        RecyclerView recyclerView = RecyclerView.this;
        Adapter adapter = recyclerView.mAdapter;
        RecycledViewPool recycledViewPool2 = recycler.f2509g;
        if (recycledViewPool2 != null) {
            recycledViewPool2.detachForPoolingContainer(adapter, false);
        }
        RecycledViewPool recycledViewPool3 = recycler.f2509g;
        if (recycledViewPool3 != null) {
            recycledViewPool3.detach();
        }
        recycler.f2509g = recycledViewPool;
        if (recycledViewPool != null && recyclerView.getAdapter() != null) {
            recycler.f2509g.attach();
        }
        recycler.g();
    }

    @Deprecated
    public void setRecyclerListener(RecyclerListener recyclerListener) {
        this.mRecyclerListener = recyclerListener;
    }

    public void setScrollState(int i7) {
        if (i7 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder sbS = a3.e.s(i7, "setting scroll state to ", " from ");
            sbS.append(this.mScrollState);
            Log.d(TAG, sbS.toString(), new Exception());
        }
        this.mScrollState = i7;
        if (i7 != 2) {
            ViewFlinger viewFlinger = this.mViewFlinger;
            RecyclerView.this.removeCallbacks(viewFlinger);
            viewFlinger.f2535i.abortAnimation();
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                layoutManager.stopSmoothScroller();
            }
        }
        dispatchOnScrollStateChanged(i7);
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(ViewCacheExtension viewCacheExtension) {
        this.mRecycler.f2510h = viewCacheExtension;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i7, int i10) {
        smoothScrollBy(i7, i10, null);
    }

    public void smoothScrollToPosition(int i7) {
        if (this.mLayoutSuppressed) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.smoothScrollToPosition(this, this.mState, i7);
        }
    }

    public void startInterceptRequestLayout() {
        int i7 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i7;
        if (i7 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().g(i7, 0);
    }

    public void stopInterceptRequestLayout(boolean z5) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException(a3.e.i(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z5 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z5 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public void stopScroll() {
        setScrollState(0);
        ViewFlinger viewFlinger = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(viewFlinger);
        viewFlinger.f2535i.abortAnimation();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z5) {
        if (z5 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z5) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(Adapter adapter, boolean z5) {
        setLayoutFrozen(false);
        p(adapter, true, z5);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i7, int i10, Object obj) {
        int i11;
        int i12;
        int iH = this.mChildHelper.h();
        int i13 = i10 + i7;
        for (int i14 = 0; i14 < iH; i14++) {
            View viewG = this.mChildHelper.g(i14);
            ViewHolder childViewHolderInt = getChildViewHolderInt(viewG);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i7 && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) viewG.getLayoutParams()).f2501i = true;
            }
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.f2505c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
            if (viewHolder != null && (i11 = viewHolder.mPosition) >= i7 && i11 < i13) {
                viewHolder.addFlags(2);
                recycler.i(size);
            }
        }
    }

    public static abstract class Adapter {
        private final AdapterDataObservable mObservable = new AdapterDataObservable();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.f2491d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class StateRestorationPolicy {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final StateRestorationPolicy f2491d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ StateRestorationPolicy[] f2492e;

            static {
                StateRestorationPolicy stateRestorationPolicy = new StateRestorationPolicy("ALLOW", 0);
                f2491d = stateRestorationPolicy;
                f2492e = new StateRestorationPolicy[]{stateRestorationPolicy, new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1), new StateRestorationPolicy("PREVENT", 2)};
            }

            public static StateRestorationPolicy valueOf(String str) {
                return (StateRestorationPolicy) Enum.valueOf(StateRestorationPolicy.class, str);
            }

            public static StateRestorationPolicy[] values() {
                return (StateRestorationPolicy[]) f2492e.clone();
            }
        }

        public final void bindViewHolder(@NonNull ViewHolder viewHolder, int i7) {
            boolean z5 = viewHolder.mBindingAdapter == null;
            if (z5) {
                viewHolder.mPosition = i7;
                if (hasStableIds()) {
                    viewHolder.mItemId = getItemId(i7);
                }
                viewHolder.setFlags(1, 519);
                if (f1.e.a()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(viewHolder.mItemViewType)));
                }
            }
            viewHolder.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (viewHolder.itemView.getParent() == null && viewHolder.itemView.isAttachedToWindow() != viewHolder.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + viewHolder.isTmpDetached() + ", attached to window: " + viewHolder.itemView.isAttachedToWindow() + ", holder: " + viewHolder);
                }
                if (viewHolder.itemView.getParent() == null && viewHolder.itemView.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + viewHolder);
                }
            }
            onBindViewHolder(viewHolder, i7, viewHolder.getUnmodifiedPayloads());
            if (z5) {
                viewHolder.clearPayload();
                ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f2501i = true;
                }
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2;
            }
            return getItemCount() > 0;
        }

        @NonNull
        public final ViewHolder createViewHolder(@NonNull ViewGroup viewGroup, int i7) {
            try {
                if (f1.e.a()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i7)));
                }
                ViewHolder viewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i7);
                if (viewHolderOnCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                viewHolderOnCreateViewHolder.mItemViewType = i7;
                Trace.endSection();
                return viewHolderOnCreateViewHolder;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter adapter, @NonNull ViewHolder viewHolder, int i7) {
            if (adapter == this) {
                return i7;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i7) {
            return -1L;
        }

        public int getItemViewType(int i7) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i7) {
            this.mObservable.d(i7, 1, null);
        }

        public final void notifyItemInserted(int i7) {
            this.mObservable.e(i7, 1);
        }

        public final void notifyItemMoved(int i7, int i10) {
            this.mObservable.c(i7, i10);
        }

        public final void notifyItemRangeChanged(int i7, int i10) {
            this.mObservable.d(i7, i10, null);
        }

        public final void notifyItemRangeInserted(int i7, int i10) {
            this.mObservable.e(i7, i10);
        }

        public final void notifyItemRangeRemoved(int i7, int i10) {
            this.mObservable.f(i7, i10);
        }

        public final void notifyItemRemoved(int i7) {
            this.mObservable.f(i7, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(ViewHolder viewHolder, int i7);

        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i7, @NonNull List<Object> list) {
            onBindViewHolder(viewHolder, i7);
        }

        @NonNull
        public abstract ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i7);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull ViewHolder viewHolder) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull ViewHolder viewHolder) {
        }

        public void onViewDetachedFromWindow(@NonNull ViewHolder viewHolder) {
        }

        public void onViewRecycled(@NonNull ViewHolder viewHolder) {
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setHasStableIds(boolean z5) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z5;
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyItemChanged(int i7, Object obj) {
            this.mObservable.d(i7, 1, obj);
        }

        public final void notifyItemRangeChanged(int i7, int i10, Object obj) {
            this.mObservable.d(i7, i10, obj);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i7) {
        float fA;
        Constructor constructor;
        super(context, attributeSet, i7);
        this.mObserver = new RecyclerViewDataObserver();
        this.mRecycler = new Recycler();
        this.mViewInfoStore = new ViewInfoStore();
        this.mUpdateChildViewsRunnable = new v0(0, this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new r();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new ViewFlinger();
        Object[] objArr = null;
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new GapWorker.LayoutPrefetchRegistryImpl() : null;
        State state = new State();
        state.f2521a = -1;
        state.f2522b = 0;
        state.f2523c = 0;
        state.f2524d = 1;
        state.f2525e = 0;
        state.f2526f = false;
        state.f2527g = false;
        state.f2528h = false;
        state.f2529i = false;
        state.j = false;
        state.k = false;
        this.mState = state;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new c1(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new w0(this);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new x0(this);
        y0 y0Var = new y0(this);
        this.mDifferentialMotionFlingTarget = y0Var;
        this.mDifferentialMotionFlingController = new DifferentialMotionFlingController(getContext(), y0Var);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Method method = androidx.core.view.v0.f1735a;
            fA = hf.a.f(viewConfiguration);
        } else {
            fA = androidx.core.view.v0.a(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = fA;
        this.mScaledVerticalScrollFactor = i10 >= 26 ? hf.a.g(viewConfiguration) : androidx.core.view.v0.a(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        this.mChildHelper = new ChildHelper(new z0(this));
        WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
        if ((i10 >= 26 ? androidx.core.view.n0.a(this) : 0) == 0 && i10 >= 26) {
            androidx.core.view.n0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = z2.a.f23587a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        androidx.core.view.u0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z5;
        if (z5) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.mLowResRotaryEncoderFeature = context.getPackageManager().hasSystemFeature(LOW_RES_ROTARY_ENCODER_FEATURE);
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LayoutManager.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i7), 0};
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e16);
                }
            }
        }
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        androidx.core.view.u0.o(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i7, 0);
        boolean z6 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z6);
        Intrinsics.checkNotNullParameter(this, "<this>");
        setTag(com.discord.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    public ViewHolder findViewHolderForPosition(int i7, boolean z5) {
        ChildHelper childHelper;
        int iH = this.mChildHelper.h();
        ViewHolder viewHolder = null;
        for (int i10 = 0; i10 < iH; i10++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z5) {
                    if (childViewHolderInt.mPosition != i7) {
                        continue;
                    } else {
                        childHelper = this.mChildHelper;
                        if (childHelper.f2447c.contains(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        viewHolder = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i7) {
                    continue;
                } else {
                    childHelper = this.mChildHelper;
                    if (childHelper.f2447c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    public void onExitLayoutOrScroll(boolean z5) {
        int i7 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i7;
        if (i7 < 1) {
            if (sDebugAssertionsEnabled && i7 < 0) {
                throw new IllegalStateException(a3.e.i(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z5) {
                int i10 = this.mEatenAccessibilityChangeFlags;
                this.mEatenAccessibilityChangeFlags = 0;
                if (i10 != 0 && isAccessibilityEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(ItemAnimator.FLAG_MOVED);
                    accessibilityEventObtain.setContentChangeTypes(i10);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i7, int i10, Interpolator interpolator) {
        smoothScrollBy(i7, i10, interpolator, Integer.MIN_VALUE);
    }

    public boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2, int i11) {
        return getScrollingChildHelper().c(i7, i10, iArr, iArr2, i11);
    }

    public boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr, int i13) {
        return getScrollingChildHelper().d(i7, i10, i11, i12, iArr, i13, null);
    }

    public boolean hasNestedScrollingParent(int i7) {
        return getScrollingChildHelper().f(i7);
    }

    public void smoothScrollBy(int i7, int i10, Interpolator interpolator, int i11) {
        smoothScrollBy(i7, i10, interpolator, i11, false);
    }

    public boolean startNestedScroll(int i7, int i10) {
        return getScrollingChildHelper().g(i7, i10);
    }

    public void stopNestedScroll(int i7) {
        getScrollingChildHelper().h(i7);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ViewHolder f2499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Rect f2500e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f2501i;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f2502v;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2500e = new Rect();
            this.f2501i = true;
            this.f2502v = false;
        }

        public LayoutParams(int i7, int i10) {
            super(i7, i10);
            this.f2500e = new Rect();
            this.f2501i = true;
            this.f2502v = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2500e = new Rect();
            this.f2501i = true;
            this.f2502v = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2500e = new Rect();
            this.f2501i = true;
            this.f2502v = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f2500e = new Rect();
            this.f2501i = true;
            this.f2502v = false;
        }
    }

    public void smoothScrollBy(int i7, int i10, Interpolator interpolator, int i11, boolean z5) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i7 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i10 = 0;
        }
        if (i7 == 0 && i10 == 0) {
            return;
        }
        if (i11 != Integer.MIN_VALUE && i11 <= 0) {
            scrollBy(i7, i10);
            return;
        }
        if (z5) {
            int i12 = i7 != 0 ? 1 : 0;
            if (i10 != 0) {
                i12 |= 2;
            }
            startNestedScroll(i12, 1);
        }
        this.mViewFlinger.c(i7, i10, interpolator, i11);
    }

    public final void dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr, int i13, @NonNull int[] iArr2) {
        getScrollingChildHelper().d(i7, i10, i11, i12, iArr, i13, iArr2);
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(a3.e.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public static abstract class AdapterDataObserver {
        public void a() {
        }

        public void b(int i7, int i10, Object obj) {
        }

        public void c(int i7, int i10) {
        }

        public void e(int i7, int i10) {
        }

        public void f() {
        }

        public void d(int i7, int i10) {
        }
    }
}
