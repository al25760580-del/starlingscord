package fh;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends o {
    public e K;
    public s L;
    public n3.p M;

    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        n3.p pVar;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.I)) {
            a aVar = this.f9236i;
            k kVar = this.f9235e;
            int i10 = 0;
            if (aVar != null && Settings.Global.getFloat(this.f9234d.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (pVar = this.M) != null) {
                pVar.setBounds(getBounds());
                this.M.setTint(kVar.f9218e[0]);
                this.M.draw(canvas);
                return;
            }
            canvas.save();
            e eVar = this.K;
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f9237v;
            boolean z5 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f9238w;
            eVar.b(canvas, bounds, fB, z5, objectAnimator2 != null && objectAnimator2.isRunning());
            int i11 = kVar.f9222i;
            int i12 = this.H;
            boolean z6 = (kVar instanceof k) && kVar.f9230s;
            boolean z7 = z6 && i11 == 0 && !kVar.a(false);
            Paint paint = this.G;
            if (!z7) {
                canvas2 = canvas;
                if (z6) {
                    p pVar2 = (p) ((ArrayList) this.L.f9257b).get(0);
                    p pVar3 = (p) kk.b.e(1, (ArrayList) this.L.f9257b);
                    canvas.save();
                    canvas.rotate(pVar3.f9246f);
                    i7 = i11;
                    this.K.f(canvas2, paint, pVar3.f9242b, pVar2.f9241a + 1.0f, kVar.f9219f, i12, i7);
                    canvas.restore();
                }
                while (i10 < ((ArrayList) this.L.f9257b).size()) {
                    p pVar4 = (p) ((ArrayList) this.L.f9257b).get(i10);
                    pVar4.f9245e = c();
                    this.K.e(canvas, paint, pVar4, this.H);
                    if (i10 <= 0 && !z7 && z6) {
                        this.K.f(canvas2, paint, ((p) ((ArrayList) this.L.f9257b).get(i10 - 1)).f9242b, pVar4.f9241a, kVar.f9219f, i12, i7);
                    }
                    i10++;
                    canvas2 = canvas;
                }
                canvas.restore();
            }
            canvas2 = canvas;
            this.K.f(canvas2, paint, 0.0f, 1.0f, kVar.f9219f, i12, 0);
            i7 = i11;
            while (i10 < ((ArrayList) this.L.f9257b).size()) {
                p pVar5 = (p) ((ArrayList) this.L.f9257b).get(i10);
                pVar5.f9245e = c();
                this.K.e(canvas, paint, pVar5, this.H);
                if (i10 <= 0) {
                }
                i10++;
                canvas2 = canvas;
            }
            canvas.restore();
        }
    }

    @Override // fh.o
    public final boolean e(boolean z5, boolean z6, boolean z7) {
        n3.p pVar;
        boolean zE = super.e(z5, z6, z7);
        if (this.f9236i != null && Settings.Global.getFloat(this.f9234d.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (pVar = this.M) != null) {
            return pVar.setVisible(z5, z6);
        }
        if (!isRunning()) {
            this.L.c();
        }
        if (z5 && z7) {
            this.L.o();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.K.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.K.g();
    }
}
