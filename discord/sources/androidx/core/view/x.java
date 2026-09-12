package androidx.core.view;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class x implements y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScrollFeedbackProvider f1740d;

    public x(NestedScrollView nestedScrollView) {
        this.f1740d = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // androidx.core.view.y
    public final void onScrollLimit(int i7, int i10, int i11, boolean z5) {
        this.f1740d.onScrollLimit(i7, i10, i11, z5);
    }

    @Override // androidx.core.view.y
    public final void onScrollProgress(int i7, int i10, int i11, int i12) {
        this.f1740d.onScrollProgress(i7, i10, i11, i12);
    }
}
