package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements BlurController {
    public boolean I;
    public Drawable J;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlurAlgorithm f8400e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f8401i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Bitmap f8402v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final BlurView f8403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8404x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ViewGroup f8405y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8399d = 16.0f;
    public final int[] E = new int[2];
    public final int[] F = new int[2];
    public final b G = new b(0, this);
    public boolean H = true;

    public c(BlurView blurView, ViewGroup viewGroup, int i7, BlurAlgorithm blurAlgorithm) {
        this.f8405y = viewGroup;
        this.f8403w = blurView;
        this.f8404x = i7;
        this.f8400e = blurAlgorithm;
        if (blurAlgorithm instanceof e) {
            ((e) blurAlgorithm).f8412f = blurView.getContext();
        }
        a(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    public final void a(int i7, int i10) {
        d(true);
        BlurAlgorithm blurAlgorithm = this.f8400e;
        blurAlgorithm.getClass();
        float f2 = i10;
        int iCeil = (int) Math.ceil(f2 / 6.0f);
        BlurView blurView = this.f8403w;
        if (iCeil != 0) {
            float f7 = i7;
            double d6 = f7 / 6.0f;
            if (((int) Math.ceil(d6)) != 0) {
                blurView.setWillNotDraw(false);
                int iCeil2 = (int) Math.ceil(d6);
                int i11 = iCeil2 % 64;
                if (i11 != 0) {
                    iCeil2 = (iCeil2 - i11) + 64;
                }
                int iCeil3 = (int) Math.ceil(f2 / (f7 / iCeil2));
                blurAlgorithm.a();
                this.f8402v = Bitmap.createBitmap(iCeil2, iCeil3, Bitmap.Config.ARGB_8888);
                this.f8401i = new a(this.f8402v);
                this.I = true;
                b();
                return;
            }
        }
        blurView.setWillNotDraw(true);
    }

    public final void b() {
        if (this.H && this.I) {
            Drawable drawable = this.J;
            if (drawable == null) {
                this.f8402v.eraseColor(0);
            } else {
                drawable.draw(this.f8401i);
            }
            this.f8401i.save();
            ViewGroup viewGroup = this.f8405y;
            int[] iArr = this.E;
            viewGroup.getLocationOnScreen(iArr);
            BlurView blurView = this.f8403w;
            int[] iArr2 = this.F;
            blurView.getLocationOnScreen(iArr2);
            int i7 = iArr2[0] - iArr[0];
            int i10 = iArr2[1] - iArr[1];
            float height = blurView.getHeight() / this.f8402v.getHeight();
            float width = blurView.getWidth() / this.f8402v.getWidth();
            this.f8401i.translate((-i7) / width, (-i10) / height);
            this.f8401i.scale(1.0f / width, 1.0f / height);
            viewGroup.draw(this.f8401i);
            this.f8401i.restore();
            this.f8402v = this.f8400e.c(this.f8402v, this.f8399d);
        }
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public final BlurViewFacade d(boolean z5) {
        ViewGroup viewGroup = this.f8405y;
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        b bVar = this.G;
        viewTreeObserver.removeOnPreDrawListener(bVar);
        if (z5) {
            viewGroup.getViewTreeObserver().addOnPreDrawListener(bVar);
        }
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurController
    public final void destroy() {
        d(false);
        this.f8400e.destroy();
        this.I = false;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public final BlurViewFacade k(int i7) {
        if (this.f8404x != i7) {
            this.f8404x = i7;
            this.f8403w.invalidate();
        }
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public final BlurViewFacade l(Drawable drawable) {
        this.J = drawable;
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurController
    public final void m() {
        BlurView blurView = this.f8403w;
        a(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    @Override // eightbitlab.com.blurview.BlurController
    public final boolean n(Canvas canvas) {
        if (this.H && this.I) {
            if (canvas instanceof a) {
                return false;
            }
            BlurView blurView = this.f8403w;
            float height = blurView.getHeight() / this.f8402v.getHeight();
            float width = blurView.getWidth() / this.f8402v.getWidth();
            canvas.save();
            canvas.scale(width, height);
            this.f8400e.b(canvas, this.f8402v);
            canvas.restore();
            int i7 = this.f8404x;
            if (i7 != 0) {
                canvas.drawColor(i7);
            }
        }
        return true;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public final BlurViewFacade o(boolean z5) {
        this.H = z5;
        d(z5);
        this.f8403w.invalidate();
        return this;
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public final BlurViewFacade p(float f2) {
        this.f8399d = f2;
        return this;
    }
}
