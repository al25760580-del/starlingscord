package com.google.android.material.progressindicator;

import a1.n;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.discord.R;
import fh.d;
import fh.e;
import fh.h;
import fh.j;
import fh.k;
import fh.m;
import fh.s;
import fh.t;
import n3.p;

/* JADX INFO: loaded from: classes3.dex */
public class CircularProgressIndicator extends d {
    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k kVar = this.f9170d;
        e eVar = new e(kVar);
        Context context2 = getContext();
        s jVar = kVar.f9226o == 1 ? new j(context2, kVar) : new h(kVar);
        t tVar = new t(context2, kVar);
        tVar.K = eVar;
        tVar.L = jVar;
        jVar.f9256a = tVar;
        Resources resources = context2.getResources();
        p pVar = new p();
        ThreadLocal threadLocal = n.f42a;
        pVar.f16307d = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        tVar.M = pVar;
        setIndeterminateDrawable(tVar);
        setProgressDrawable(new m(getContext(), kVar, eVar));
        this.F = true;
    }

    public int getIndeterminateAnimationType() {
        return this.f9170d.f9226o;
    }

    public int getIndicatorDirection() {
        return this.f9170d.f9229r;
    }

    public int getIndicatorInset() {
        return this.f9170d.f9228q;
    }

    public int getIndicatorSize() {
        return this.f9170d.f9227p;
    }

    public void setIndeterminateAnimationType(int i7) {
        k kVar = this.f9170d;
        if (kVar.f9226o == i7) {
            return;
        }
        if (b() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        kVar.f9226o = i7;
        kVar.b();
        s jVar = i7 == 1 ? new j(getContext(), kVar) : new h(kVar);
        t indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.L = jVar;
        jVar.f9256a = indeterminateDrawable;
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().L.l(this.I);
        }
        invalidate();
    }

    public void setIndicatorDirection(int i7) {
        this.f9170d.f9229r = i7;
        invalidate();
    }

    public void setIndicatorInset(int i7) {
        k kVar = this.f9170d;
        if (kVar.f9228q != i7) {
            kVar.f9228q = i7;
            invalidate();
        }
    }

    public void setIndicatorSize(int i7) {
        int iMax = Math.max(i7, getTrackThickness() * 2);
        k kVar = this.f9170d;
        if (kVar.f9227p != iMax) {
            kVar.f9227p = iMax;
            kVar.b();
            requestLayout();
            invalidate();
        }
    }

    @Override // fh.d
    public void setTrackThickness(int i7) {
        super.setTrackThickness(i7);
        this.f9170d.b();
    }
}
