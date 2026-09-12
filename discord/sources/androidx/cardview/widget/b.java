package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements CardViewImpl {
    @Override // androidx.cardview.widget.CardViewImpl
    public final void a(CardViewDelegate cardViewDelegate, float f2) {
        c cVar = (c) cardViewDelegate.c();
        if (f2 == cVar.f1203a) {
            return;
        }
        cVar.f1203a = f2;
        cVar.b(null);
        cVar.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float b(CardViewDelegate cardViewDelegate) {
        return cardViewDelegate.d().getElevation();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float c(CardViewDelegate cardViewDelegate) {
        return ((c) cardViewDelegate.c()).f1203a;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void d(CardViewDelegate cardViewDelegate) {
        n(cardViewDelegate, f(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void e(CardViewDelegate cardViewDelegate, float f2) {
        cardViewDelegate.d().setElevation(f2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float f(CardViewDelegate cardViewDelegate) {
        return ((c) cardViewDelegate.c()).f1207e;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final ColorStateList g(CardViewDelegate cardViewDelegate) {
        return ((c) cardViewDelegate.c()).f1210h;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void h(CardViewDelegate cardViewDelegate) {
        if (!cardViewDelegate.b()) {
            cardViewDelegate.e(0, 0, 0, 0);
            return;
        }
        float f2 = ((c) cardViewDelegate.c()).f1207e;
        float f7 = ((c) cardViewDelegate.c()).f1203a;
        int iCeil = (int) Math.ceil(d.a(f2, f7, cardViewDelegate.a()));
        int iCeil2 = (int) Math.ceil(d.b(f2, f7, cardViewDelegate.a()));
        cardViewDelegate.e(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float i(CardViewDelegate cardViewDelegate) {
        return c(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float j(CardViewDelegate cardViewDelegate) {
        return c(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void k(a aVar, Context context, ColorStateList colorStateList, float f2, float f7, float f10) {
        c cVar = new c(colorStateList, f2);
        aVar.f1201a = cVar;
        aVar.f1202b.setBackgroundDrawable(cVar);
        CardView cardView = aVar.f1202b;
        cardView.setClipToOutline(true);
        cardView.setElevation(f7);
        n(aVar, f10);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void l(CardViewDelegate cardViewDelegate) {
        n(cardViewDelegate, f(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void m(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        c cVar = (c) cardViewDelegate.c();
        if (colorStateList == null) {
            cVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        cVar.f1210h = colorStateList;
        cVar.f1204b.setColor(colorStateList.getColorForState(cVar.getState(), cVar.f1210h.getDefaultColor()));
        cVar.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void n(CardViewDelegate cardViewDelegate, float f2) {
        c cVar = (c) cardViewDelegate.c();
        boolean zB = cardViewDelegate.b();
        boolean zA = cardViewDelegate.a();
        if (f2 != cVar.f1207e || cVar.f1208f != zB || cVar.f1209g != zA) {
            cVar.f1207e = f2;
            cVar.f1208f = zB;
            cVar.f1209g = zA;
            cVar.b(null);
            cVar.invalidateSelf();
        }
        h(cardViewDelegate);
    }
}
