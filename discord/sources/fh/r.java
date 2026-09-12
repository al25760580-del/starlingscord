package fh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f9251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f9252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f9253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PathMeasure f9254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f9255e;

    public r(k kVar) {
        Path path = new Path();
        this.f9252b = path;
        this.f9253c = new Path();
        this.f9254d = new PathMeasure(path, false);
        this.f9251a = kVar;
        this.f9255e = new Matrix();
    }

    public abstract void a();

    public final void b(Canvas canvas, Rect rect, float f2, boolean z5, boolean z6) {
        this.f9251a.b();
        e eVar = (e) this;
        float fWidth = rect.width() / eVar.g();
        float fHeight = rect.height() / eVar.g();
        k kVar = eVar.f9251a;
        float f7 = (kVar.f9227p / 2.0f) + kVar.f9228q;
        canvas.translate((f7 * fWidth) + rect.left, (f7 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (kVar.f9229r != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f10 = -f7;
        canvas.clipRect(f10, f10, f7, f7);
        int i7 = kVar.f9214a;
        float f11 = i7;
        eVar.f9177f = f11 * f2;
        eVar.f9178g = Math.min(i7 / 2, kVar.f9217d ? (int) (f11 * kVar.f9216c) : kVar.f9215b) * f2;
        eVar.f9179h = kVar.f9223l * f2;
        int i10 = kVar.f9227p;
        int i11 = kVar.f9214a;
        float f12 = (i10 - i11) / 2.0f;
        eVar.f9180i = f12;
        if (z5 || z6) {
            float f13 = ((1.0f - f2) * i11) / 2.0f;
            if ((z5 && kVar.f9220g == 2) || (z6 && kVar.f9221h == 1)) {
                eVar.f9180i = f12 + f13;
            } else if ((z5 && kVar.f9220g == 1) || (z6 && kVar.f9221h == 2)) {
                eVar.f9180i = f12 - f13;
            }
        }
        if (z6 && kVar.f9221h == 3) {
            eVar.f9184o = f2;
        } else {
            eVar.f9184o = 1.0f;
        }
    }
}
