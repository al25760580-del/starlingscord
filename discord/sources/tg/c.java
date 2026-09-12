package tg;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.discord.R;
import com.facebook.react.views.image.ReactImageView;
import com.google.android.material.card.MaterialCardView;
import kh.e;
import kh.i;
import kh.k;
import kh.l;
import kh.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final double f20741y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f20742z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f20743a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f20745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f20746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f20751i;
    public Drawable j;
    public ColorStateList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f20752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m f20753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f20754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RippleDrawable f20755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayerDrawable f20756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f20757q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ValueAnimator f20760t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f20761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f20762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f20763w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f20744b = new Rect();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20758r = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f20764x = 0.0f;

    static {
        f20742z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f20743a = materialCardView;
        i iVar = new i(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f20745c = iVar;
        iVar.m(materialCardView.getContext());
        iVar.s();
        l lVarG = iVar.f14483e.f14463a.g();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, r.a.f19123a, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            lVarG.b(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f20746d = new i();
        h(lVarG.a());
        this.f20761u = io.sentry.config.a.T(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, lg.a.f15071a);
        this.f20762v = io.sentry.config.a.S(materialCardView.getContext(), R.attr.motionDurationShort2, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
        this.f20763w = io.sentry.config.a.S(materialCardView.getContext(), R.attr.motionDurationShort1, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(com.facebook.imagepipeline.nativecode.b bVar, float f2) {
        if (bVar instanceof k) {
            return (float) ((1.0d - f20741y) * ((double) f2));
        }
        if (bVar instanceof e) {
            return f2 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        com.facebook.imagepipeline.nativecode.b bVar = this.f20753m.f14500a;
        i iVar = this.f20745c;
        float fB = b(bVar, iVar.k());
        com.facebook.imagepipeline.nativecode.b bVar2 = this.f20753m.f14501b;
        float[] fArr = iVar.Z;
        float fMax = Math.max(fB, b(bVar2, fArr != null ? fArr[0] : iVar.f14483e.f14463a.f14505f.a(iVar.h())));
        com.facebook.imagepipeline.nativecode.b bVar3 = this.f20753m.f14502c;
        float[] fArr2 = iVar.Z;
        float fB2 = b(bVar3, fArr2 != null ? fArr2[1] : iVar.f14483e.f14463a.f14506g.a(iVar.h()));
        com.facebook.imagepipeline.nativecode.b bVar4 = this.f20753m.f14503d;
        float[] fArr3 = iVar.Z;
        return Math.max(fMax, Math.max(fB2, b(bVar4, fArr3 != null ? fArr3[2] : iVar.f14483e.f14463a.f14507h.a(iVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f20755o == null) {
            this.f20757q = new i(this.f20753m);
            this.f20755o = new RippleDrawable(this.k, null, this.f20757q);
        }
        if (this.f20756p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f20755o, this.f20746d, this.j});
            this.f20756p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f20756p;
    }

    public final b d(Drawable drawable) {
        int iCeil;
        int i7;
        MaterialCardView materialCardView = this.f20743a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f));
            i7 = iCeil2;
        } else {
            iCeil = 0;
            i7 = 0;
        }
        return new b(drawable, iCeil, i7, iCeil, i7);
    }

    public final void e(int i7, int i10) {
        int iCeil;
        int iCeil2;
        int i11;
        int i12;
        if (this.f20756p != null) {
            MaterialCardView materialCardView = this.f20743a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i13 = this.f20749g;
            int i14 = (i13 & 8388613) == 8388613 ? ((i7 - this.f20747e) - this.f20748f) - iCeil2 : this.f20747e;
            int i15 = (i13 & 80) == 80 ? this.f20747e : ((i10 - this.f20747e) - this.f20748f) - iCeil;
            int i16 = (i13 & 8388613) == 8388613 ? this.f20747e : ((i7 - this.f20747e) - this.f20748f) - iCeil2;
            int i17 = (i13 & 80) == 80 ? ((i10 - this.f20747e) - this.f20748f) - iCeil : this.f20747e;
            if (materialCardView.getLayoutDirection() == 1) {
                i12 = i16;
                i11 = i14;
            } else {
                i11 = i16;
                i12 = i14;
            }
            this.f20756p.setLayerInset(2, i12, i17, i11, i15);
        }
    }

    public final void f(boolean z5, boolean z6) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z6) {
                drawable.setAlpha(z5 ? 255 : 0);
                this.f20764x = z5 ? 1.0f : 0.0f;
                return;
            }
            float f2 = z5 ? 1.0f : 0.0f;
            float f7 = z5 ? 1.0f - this.f20764x : this.f20764x;
            ValueAnimator valueAnimator = this.f20760t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f20760t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f20764x, f2);
            this.f20760t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new com.discord.chat.presentation.list.c(9, this));
            this.f20760t.setInterpolator(this.f20761u);
            this.f20760t.setDuration((long) ((z5 ? this.f20762v : this.f20763w) * f7));
            this.f20760t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            drawableMutate.setTintList(this.f20752l);
            f(this.f20743a.f6315i, false);
        } else {
            this.j = f20742z;
        }
        LayerDrawable layerDrawable = this.f20756p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(m mVar) {
        this.f20753m = mVar;
        i iVar = this.f20745c;
        iVar.setShapeAppearanceModel(mVar);
        iVar.U = !iVar.n();
        i iVar2 = this.f20746d;
        if (iVar2 != null) {
            iVar2.setShapeAppearanceModel(mVar);
        }
        i iVar3 = this.f20757q;
        if (iVar3 != null) {
            iVar3.setShapeAppearanceModel(mVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f20743a;
        return materialCardView.getPreventCornerOverlap() && this.f20745c.n() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f20743a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.f20751i;
        Drawable drawableC = j() ? c() : this.f20746d;
        this.f20751i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f20743a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f20743a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.f20745c.n()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f20741y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i7 = (int) (fA - cardViewRadius);
        Rect rect = this.f20744b;
        materialCardView.b(rect.left + i7, rect.top + i7, rect.right + i7, rect.bottom + i7);
    }

    public final void m() {
        boolean z5 = this.f20758r;
        MaterialCardView materialCardView = this.f20743a;
        if (!z5) {
            materialCardView.setBackgroundInternal(d(this.f20745c));
        }
        materialCardView.setForeground(d(this.f20751i));
    }
}
