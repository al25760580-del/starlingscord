package io.sentry.android.replay.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.android.replay.viewhierarchy.ComposeViewHierarchyNode;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import io.sentry.w5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u00020\t*\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0015*\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0012*\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001c\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001e\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001d\u0010 \u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010!\u001a\u0013\u0010#\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b#\u0010$\"\u0018\u0010(\u001a\u00020\u0012*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroid/view/View;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "parentNode", "Lio/sentry/w5;", "options", "", "traverse", "(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/w5;)V", "Lkotlin/Pair;", "", "Landroid/graphics/Rect;", "isVisibleToUser", "(Landroid/view/View;)Lkotlin/Pair;", "Landroid/graphics/drawable/Drawable;", "isMaskable", "(Landroid/graphics/drawable/Drawable;)Z", "Lio/sentry/android/replay/util/TextLayout;", "globalRect", "", ViewProps.PADDING_LEFT, ViewProps.PADDING_TOP, "", "getVisibleRects", "(Lio/sentry/android/replay/util/TextLayout;Landroid/graphics/Rect;II)Ljava/util/List;", "toOpaque", "(I)I", "Landroid/view/ViewTreeObserver$OnDrawListener;", "listener", "addOnDrawListenerSafe", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;)V", "removeOnDrawListenerSafe", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "addOnPreDrawListenerSafe", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "removeOnPreDrawListenerSafe", "hasSize", "(Landroid/view/View;)Z", "Landroid/widget/TextView;", "getTotalPaddingTopSafe", "(Landroid/widget/TextView;)I", "totalPaddingTopSafe", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewsKt {
    public static final void addOnDrawListenerSafe(View view, @NotNull ViewTreeObserver.OnDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void addOnPreDrawListenerSafe(View view, @NotNull ViewTreeObserver.OnPreDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int getTotalPaddingTopSafe(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        try {
            return textView.getTotalPaddingTop();
        } catch (NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    @NotNull
    public static final List<Rect> getVisibleRects(TextLayout textLayout, @NotNull Rect globalRect, int i7, int i10) {
        Intrinsics.checkNotNullParameter(globalRect, "globalRect");
        if (textLayout == null) {
            return c0.c(globalRect);
        }
        ArrayList arrayList = new ArrayList();
        int lineCount = textLayout.getLineCount();
        for (int i11 = 0; i11 < lineCount; i11++) {
            int primaryHorizontal = (int) textLayout.getPrimaryHorizontal(i11, textLayout.getLineStart(i11));
            int ellipsisCount = textLayout.getEllipsisCount(i11);
            int lineVisibleEnd = textLayout.getLineVisibleEnd(i11);
            int primaryHorizontal2 = (int) textLayout.getPrimaryHorizontal(i11, (lineVisibleEnd - ellipsisCount) + (ellipsisCount > 0 ? 1 : 0));
            if (primaryHorizontal2 == 0 && lineVisibleEnd > 0) {
                primaryHorizontal2 = ((int) textLayout.getPrimaryHorizontal(i11, lineVisibleEnd - 1)) + 1;
            }
            int lineTop = textLayout.getLineTop(i11);
            int lineBottom = textLayout.getLineBottom(i11);
            Rect rect = new Rect();
            int i12 = globalRect.left + i7 + primaryHorizontal;
            rect.left = i12;
            rect.right = (primaryHorizontal2 - primaryHorizontal) + i12;
            int i13 = globalRect.top + i10 + lineTop;
            rect.top = i13;
            rect.bottom = (lineBottom - lineTop) + i13;
            arrayList.add(rect);
        }
        return arrayList;
    }

    public static final boolean hasSize(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    @TargetApi(21)
    public static final boolean isMaskable(Drawable drawable) {
        if (drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    @NotNull
    public static final Pair<Boolean, Rect> isVisibleToUser(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!view.isAttachedToWindow()) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Object parent = view;
        while (parent instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
            View view2 = (View) parent;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return new Pair<>(Boolean.FALSE, null);
            }
            parent = view2.getParent();
        }
        Rect rect = new Rect();
        return new Pair<>(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    public static final void removeOnDrawListenerSafe(View view, @NotNull ViewTreeObserver.OnDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void removeOnPreDrawListenerSafe(View view, @NotNull ViewTreeObserver.OnPreDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int toOpaque(int i7) {
        return i7 | (-16777216);
    }

    public static final void traverse(@NotNull View view, @NotNull ViewHierarchyNode parentNode, @NotNull w5 options) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(options, "options");
        if ((view instanceof ViewGroup) && !ComposeViewHierarchyNode.INSTANCE.fromView(view, parentNode, options)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt != null) {
                    ViewHierarchyNode viewHierarchyNodeFromView = ViewHierarchyNode.INSTANCE.fromView(childAt, parentNode, viewGroup.indexOfChild(childAt), options);
                    arrayList.add(viewHierarchyNodeFromView);
                    traverse(childAt, viewHierarchyNodeFromView, options);
                }
            }
            parentNode.setChildren(arrayList);
        }
    }
}
