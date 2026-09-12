package sg;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.discord.R;
import com.google.android.material.button.MaterialButton;
import j2.i;
import kh.g;
import kh.m;
import kh.w;
import kh.y;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f19952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f19953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f19954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f19955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mi.a f19956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19960i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f19961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f19962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f19963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f19964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public kh.i f19965p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19969t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RippleDrawable f19971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f19972w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f19966q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19967r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f19968s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19970u = true;

    public d(MaterialButton materialButton, m mVar) {
        this.f19952a = materialButton;
        this.f19953b = mVar;
    }

    public final kh.i a(boolean z5) {
        RippleDrawable rippleDrawable = this.f19971v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (kh.i) ((LayerDrawable) ((InsetDrawable) this.f19971v.getDrawable(0)).getDrawable()).getDrawable(!z5 ? 1 : 0);
    }

    public final void b(int i7, int i10) {
        MaterialButton materialButton = this.f19952a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f19959h;
        int i12 = this.f19960i;
        this.f19960i = i10;
        this.f19959h = i7;
        if (!this.f19967r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i7) - i11, paddingEnd, (paddingBottom + i10) - i12);
    }

    public final void c() {
        kh.i iVar = new kh.i(this.f19953b);
        y yVar = this.f19954c;
        if (yVar != null) {
            iVar.t(yVar);
        }
        i iVar2 = this.f19955d;
        if (iVar2 != null) {
            iVar.o(iVar2);
        }
        mi.a aVar = this.f19956e;
        if (aVar != null) {
            iVar.f14481b0 = aVar;
        }
        MaterialButton materialButton = this.f19952a;
        iVar.m(materialButton.getContext());
        iVar.setTintList(this.f19962m);
        PorterDuff.Mode mode = this.f19961l;
        if (mode != null) {
            iVar.setTintMode(mode);
        }
        float f2 = this.k;
        ColorStateList colorStateList = this.f19963n;
        iVar.f14483e.k = f2;
        iVar.invalidateSelf();
        g gVar = iVar.f14483e;
        if (gVar.f14467e != colorStateList) {
            gVar.f14467e = colorStateList;
            iVar.onStateChange(iVar.getState());
        }
        kh.i iVar3 = new kh.i(this.f19953b);
        y yVar2 = this.f19954c;
        if (yVar2 != null) {
            iVar3.t(yVar2);
        }
        i iVar4 = this.f19955d;
        if (iVar4 != null) {
            iVar3.o(iVar4);
        }
        iVar3.setTint(0);
        float f7 = this.k;
        int iW = this.f19966q ? io.sentry.config.a.w(R.attr.colorSurface, materialButton) : 0;
        iVar3.f14483e.k = f7;
        iVar3.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iW);
        g gVar2 = iVar3.f14483e;
        if (gVar2.f14467e != colorStateListValueOf) {
            gVar2.f14467e = colorStateListValueOf;
            iVar3.onStateChange(iVar3.getState());
        }
        kh.i iVar5 = new kh.i(this.f19953b);
        this.f19965p = iVar5;
        y yVar3 = this.f19954c;
        if (yVar3 != null) {
            iVar5.t(yVar3);
        }
        i iVar6 = this.f19955d;
        if (iVar6 != null) {
            this.f19965p.o(iVar6);
        }
        this.f19965p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(ih.a.b(this.f19964o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{iVar3, iVar}), this.f19957f, this.f19959h, this.f19958g, this.f19960i), this.f19965p);
        this.f19971v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        kh.i iVarA = a(false);
        if (iVarA != null) {
            iVarA.p(this.f19972w);
            iVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        w wVar;
        kh.i iVarA = a(false);
        if (iVarA != null) {
            y yVar = this.f19954c;
            if (yVar != null) {
                iVarA.t(yVar);
            } else {
                iVarA.setShapeAppearanceModel(this.f19953b);
            }
            i iVar = this.f19955d;
            if (iVar != null) {
                iVarA.o(iVar);
            }
        }
        kh.i iVarA2 = a(true);
        if (iVarA2 != null) {
            y yVar2 = this.f19954c;
            if (yVar2 != null) {
                iVarA2.t(yVar2);
            } else {
                iVarA2.setShapeAppearanceModel(this.f19953b);
            }
            i iVar2 = this.f19955d;
            if (iVar2 != null) {
                iVarA2.o(iVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f19971v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            wVar = null;
        } else {
            wVar = this.f19971v.getNumberOfLayers() > 2 ? (w) this.f19971v.getDrawable(2) : (w) this.f19971v.getDrawable(1);
        }
        if (wVar != null) {
            wVar.setShapeAppearanceModel(this.f19953b);
            if (wVar instanceof kh.i) {
                kh.i iVar3 = (kh.i) wVar;
                y yVar3 = this.f19954c;
                if (yVar3 != null) {
                    iVar3.t(yVar3);
                }
                i iVar4 = this.f19955d;
                if (iVar4 != null) {
                    iVar3.o(iVar4);
                }
            }
        }
    }

    public final void e() {
        kh.i iVarA = a(false);
        kh.i iVarA2 = a(true);
        if (iVarA != null) {
            float f2 = this.k;
            ColorStateList colorStateList = this.f19963n;
            iVarA.f14483e.k = f2;
            iVarA.invalidateSelf();
            g gVar = iVarA.f14483e;
            if (gVar.f14467e != colorStateList) {
                gVar.f14467e = colorStateList;
                iVarA.onStateChange(iVarA.getState());
            }
            if (iVarA2 != null) {
                float f7 = this.k;
                int iW = this.f19966q ? io.sentry.config.a.w(R.attr.colorSurface, this.f19952a) : 0;
                iVarA2.f14483e.k = f7;
                iVarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iW);
                g gVar2 = iVarA2.f14483e;
                if (gVar2.f14467e != colorStateListValueOf) {
                    gVar2.f14467e = colorStateListValueOf;
                    iVarA2.onStateChange(iVarA2.getState());
                }
            }
        }
    }
}
