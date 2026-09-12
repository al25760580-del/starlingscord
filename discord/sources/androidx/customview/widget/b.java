package androidx.customview.widget;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f1813d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f1814e = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1815i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FocusStrategy$BoundsAdapter f1816v;

    public b(boolean z5, FocusStrategy$BoundsAdapter focusStrategy$BoundsAdapter) {
        this.f1815i = z5;
        this.f1816v = focusStrategy$BoundsAdapter;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        FocusStrategy$BoundsAdapter focusStrategy$BoundsAdapter = this.f1816v;
        Rect rect = this.f1813d;
        focusStrategy$BoundsAdapter.i(obj, rect);
        Rect rect2 = this.f1814e;
        focusStrategy$BoundsAdapter.i(obj2, rect2);
        int i7 = rect.top;
        int i10 = rect2.top;
        if (i7 < i10) {
            return -1;
        }
        if (i7 > i10) {
            return 1;
        }
        int i11 = rect.left;
        int i12 = rect2.left;
        boolean z5 = this.f1815i;
        if (i11 < i12) {
            return z5 ? 1 : -1;
        }
        if (i11 > i12) {
            return z5 ? -1 : 1;
        }
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if (i15 < i16) {
            return z5 ? 1 : -1;
        }
        if (i15 > i16) {
            return z5 ? -1 : 1;
        }
        return 0;
    }
}
