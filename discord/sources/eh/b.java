package eh;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends FrameLayout implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8190e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8191i;

    @Override // n.w
    public final void a(n.l lVar) {
        b();
    }

    public final void b() {
        setVisibility((!this.f8191i || (!this.f8189d && this.f8190e)) ? 8 : 0);
    }

    @Override // n.w
    public n.l getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    public void setDividersEnabled(boolean z5) {
        this.f8191i = z5;
        b();
    }

    @Override // eh.h
    public void setExpanded(boolean z5) {
        this.f8189d = z5;
        b();
    }

    @Override // eh.h
    public void setOnlyShowWhenExpanded(boolean z5) {
        this.f8190e = z5;
        b();
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
