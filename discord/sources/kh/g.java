package kh;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class g extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f14463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f14464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ah.a f14465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f14466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f14467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f14468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f14469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f14470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f14471i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f14473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint.Style f14477q;

    public g(m mVar) {
        this.f14466d = null;
        this.f14467e = null;
        this.f14468f = null;
        this.f14469g = PorterDuff.Mode.SRC_IN;
        this.f14470h = null;
        this.f14471i = 1.0f;
        this.j = 1.0f;
        this.f14472l = 255;
        this.f14473m = 0.0f;
        this.f14474n = 0.0f;
        this.f14475o = 0;
        this.f14476p = 0;
        this.f14477q = Paint.Style.FILL_AND_STROKE;
        this.f14463a = mVar;
        this.f14465c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.f14487x = true;
        iVar.f14488y = true;
        return iVar;
    }

    public g(g gVar) {
        this.f14466d = null;
        this.f14467e = null;
        this.f14468f = null;
        this.f14469g = PorterDuff.Mode.SRC_IN;
        this.f14470h = null;
        this.f14471i = 1.0f;
        this.j = 1.0f;
        this.f14472l = 255;
        this.f14473m = 0.0f;
        this.f14474n = 0.0f;
        this.f14475o = 0;
        this.f14476p = 0;
        this.f14477q = Paint.Style.FILL_AND_STROKE;
        this.f14463a = gVar.f14463a;
        this.f14464b = gVar.f14464b;
        this.f14465c = gVar.f14465c;
        this.k = gVar.k;
        this.f14466d = gVar.f14466d;
        this.f14467e = gVar.f14467e;
        this.f14469g = gVar.f14469g;
        this.f14468f = gVar.f14468f;
        this.f14472l = gVar.f14472l;
        this.f14471i = gVar.f14471i;
        this.f14476p = gVar.f14476p;
        this.j = gVar.j;
        this.f14473m = gVar.f14473m;
        this.f14474n = gVar.f14474n;
        this.f14475o = gVar.f14475o;
        this.f14477q = gVar.f14477q;
        if (gVar.f14470h != null) {
            this.f14470h = new Rect(gVar.f14470h);
        }
    }
}
