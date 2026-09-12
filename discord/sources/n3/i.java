package n3;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class i extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a1.d f16308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a1.d f16310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f16313i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f16314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f16315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f16316n;

    @Override // n3.k
    public final boolean a() {
        return this.f16310f.j() || this.f16308d.j();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // n3.k
    public final boolean b(int[] iArr) {
        boolean z5;
        a1.d dVar = this.f16310f;
        boolean z6 = true;
        if (dVar.j()) {
            ColorStateList colorStateList = (ColorStateList) dVar.f19v;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar.f17e) {
                dVar.f17e = colorForState;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        a1.d dVar2 = this.f16308d;
        if (dVar2.j()) {
            ColorStateList colorStateList2 = (ColorStateList) dVar2.f19v;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != dVar2.f17e) {
                dVar2.f17e = colorForState2;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        return z5 | z6;
    }

    public float getFillAlpha() {
        return this.f16312h;
    }

    public int getFillColor() {
        return this.f16310f.f17e;
    }

    public float getStrokeAlpha() {
        return this.f16311g;
    }

    public int getStrokeColor() {
        return this.f16308d.f17e;
    }

    public float getStrokeWidth() {
        return this.f16309e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.f16313i;
    }

    public void setFillAlpha(float f2) {
        this.f16312h = f2;
    }

    public void setFillColor(int i7) {
        this.f16310f.f17e = i7;
    }

    public void setStrokeAlpha(float f2) {
        this.f16311g = f2;
    }

    public void setStrokeColor(int i7) {
        this.f16308d.f17e = i7;
    }

    public void setStrokeWidth(float f2) {
        this.f16309e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.f16313i = f2;
    }
}
