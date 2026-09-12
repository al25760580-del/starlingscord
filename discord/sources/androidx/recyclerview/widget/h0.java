package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import com.discord.R;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {
    private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
    public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
    public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
    private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
    static final int RELATIVE_DIR_FLAGS = 3158064;
    private static final Interpolator sDragScrollInterpolator = new g0(0);
    private static final Interpolator sDragViewScrollCapInterpolator = new g0(1);
    private int mCachedMaxScrollSpeed = -1;

    public static int convertToRelativeDirection(int i7, int i10) {
        int i11;
        int i12 = i7 & ABS_HORIZONTAL_DIR_FLAGS;
        if (i12 == 0) {
            return i7;
        }
        int i13 = i7 & (~i12);
        if (i10 == 0) {
            i11 = i12 << 2;
        } else {
            int i14 = i12 << 1;
            i13 |= (-789517) & i14;
            i11 = (i14 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
        }
        return i13 | i11;
    }

    @NonNull
    public static ItemTouchUIUtil getDefaultUIUtil() {
        return j0.f2621a;
    }

    public static int makeFlag(int i7, int i10) {
        return i10 << (i7 * 8);
    }

    public static int makeMovementFlags(int i7, int i10) {
        return makeFlag(2, i7) | makeFlag(1, i10) | makeFlag(0, i10 | i7);
    }

    public boolean canDropOver(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public RecyclerView.ViewHolder chooseDropTarget(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<RecyclerView.ViewHolder> list, int i7, int i10) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int width = viewHolder.itemView.getWidth() + i7;
        int height = viewHolder.itemView.getHeight() + i10;
        int left2 = i7 - viewHolder.itemView.getLeft();
        int top2 = i10 - viewHolder.itemView.getTop();
        int size = list.size();
        RecyclerView.ViewHolder viewHolder2 = null;
        int i11 = -1;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.ViewHolder viewHolder3 = list.get(i12);
            if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (iAbs4 = Math.abs(right)) > i11) {
                viewHolder2 = viewHolder3;
                i11 = iAbs4;
            }
            if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i7) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i11) {
                viewHolder2 = viewHolder3;
                i11 = iAbs3;
            }
            if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i10) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (iAbs2 = Math.abs(top)) > i11) {
                viewHolder2 = viewHolder3;
                i11 = iAbs2;
            }
            if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i11) {
                viewHolder2 = viewHolder3;
                i11 = iAbs;
            }
        }
        return viewHolder2;
    }

    public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            androidx.core.view.l0.k(view, fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int convertToAbsoluteDirection(int i7, int i10) {
        int i11;
        int i12 = i7 & RELATIVE_DIR_FLAGS;
        if (i12 == 0) {
            return i7;
        }
        int i13 = i7 & (~i12);
        if (i10 == 0) {
            i11 = i12 >> 2;
        } else {
            int i14 = i12 >> 1;
            i13 |= (-3158065) & i14;
            i11 = (i14 & RELATIVE_DIR_FLAGS) >> 2;
        }
        return i13 | i11;
    }

    public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i7, float f2, float f7) {
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null) {
            return i7 == 8 ? 200L : 250L;
        }
        return i7 == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
    }

    public int getBoundingBoxMargin() {
        return 0;
    }

    public float getMoveThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
        return 0.5f;
    }

    public abstract int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder);

    public float getSwipeEscapeVelocity(float f2) {
        return f2;
    }

    public float getSwipeThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
        return 0.5f;
    }

    public float getSwipeVelocityThreshold(float f2) {
        return f2;
    }

    public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return (convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), recyclerView.getLayoutDirection()) & 65280) != 0;
    }

    public int interpolateOutOfBoundsScroll(@NonNull RecyclerView recyclerView, int i7, int i10, int i11, long j) {
        if (this.mCachedMaxScrollSpeed == -1) {
            this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (sDragScrollInterpolator.getInterpolation(j <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS ? j / 2000.0f : 1.0f) * ((int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i10) * 1.0f) / i7)) * ((int) Math.signum(i10)) * this.mCachedMaxScrollSpeed)));
        if (interpolation == 0) {
            return i10 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public boolean isLongPressDragEnabled() {
        return true;
    }

    public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f2, float f7, int i7, boolean z5) {
        View view = viewHolder.itemView;
        if (z5 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            Float fValueOf = Float.valueOf(androidx.core.view.l0.e(view));
            int childCount = recyclerView.getChildCount();
            float f10 = 0.0f;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = androidx.core.view.u0.f1729a;
                    float fE = androidx.core.view.l0.e(childAt);
                    if (fE > f10) {
                        f10 = fE;
                    }
                }
            }
            androidx.core.view.l0.k(view, f10 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f2);
        view.setTranslationY(f7);
    }

    public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.ViewHolder viewHolder, float f2, float f7, int i7, boolean z5) {
        View view = viewHolder.itemView;
    }

    public abstract boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2);

    /* JADX WARN: Multi-variable type inference failed */
    public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, int i7, @NonNull RecyclerView.ViewHolder viewHolder2, int i10, int i11, int i12) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof i0) {
            ((i0) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i11, i12);
            return;
        }
        if (layoutManager.canScrollHorizontally()) {
            if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                recyclerView.scrollToPosition(i10);
            }
            if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.scrollToPosition(i10);
            }
        }
        if (layoutManager.canScrollVertically()) {
            if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                recyclerView.scrollToPosition(i10);
            }
            if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.scrollToPosition(i10);
            }
        }
    }

    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i7) {
    }

    public abstract void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i7);
}
