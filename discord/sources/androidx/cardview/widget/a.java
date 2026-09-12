package androidx.cardview.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements CardViewDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f1201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardView f1202b;

    public a(CardView cardView) {
        this.f1202b = cardView;
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final boolean a() {
        return this.f1202b.getPreventCornerOverlap();
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final boolean b() {
        return this.f1202b.getUseCompatPadding();
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final Drawable c() {
        return this.f1201a;
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final CardView d() {
        return this.f1202b;
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final void e(int i7, int i10, int i11, int i12) {
        CardView cardView = this.f1202b;
        cardView.mShadowBounds.set(i7, i10, i11, i12);
        Rect rect = cardView.mContentPadding;
        super/*android.view.View*/.setPadding(i7 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }
}
