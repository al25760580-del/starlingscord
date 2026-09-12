package kh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f14513c;

    public p(r rVar) {
        this.f14513c = rVar;
    }

    @Override // kh.u
    public final void a(Matrix matrix, jh.a aVar, int i7, Canvas canvas) {
        r rVar = this.f14513c;
        float f2 = rVar.f14522f;
        float f7 = rVar.f14523g;
        RectF rectF = new RectF(rVar.f14518b, rVar.f14519c, rVar.f14520d, rVar.f14521e);
        Paint paint = aVar.f13873b;
        boolean z5 = f7 < 0.0f;
        Path path = aVar.f13878g;
        int[] iArr = jh.a.k;
        if (z5) {
            iArr[0] = 0;
            iArr[1] = aVar.f13877f;
            iArr[2] = aVar.f13876e;
            iArr[3] = aVar.f13875d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f7);
            path.close();
            float f10 = -i7;
            rectF.inset(f10, f10);
            iArr[0] = 0;
            iArr[1] = aVar.f13875d;
            iArr[2] = aVar.f13876e;
            iArr[3] = aVar.f13877f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0) {
            return;
        }
        float f11 = 1.0f - (i7 / fWidth);
        float[] fArr = jh.a.f13871l;
        fArr[1] = f11;
        fArr[2] = ((1.0f - f11) / 2.0f) + f11;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z5) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f13879h);
        }
        canvas.drawArc(rectF, f2, f7, true, paint);
        canvas.restore();
    }
}
