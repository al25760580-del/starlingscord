package androidx.core.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface r {
    void onNestedPreScroll(View view, int i7, int i10, int[] iArr, int i11);

    void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13);

    void onNestedScrollAccepted(View view, View view2, int i7, int i10);

    boolean onStartNestedScroll(View view, View view2, int i7, int i10);

    void onStopNestedScroll(View view, int i7);
}
