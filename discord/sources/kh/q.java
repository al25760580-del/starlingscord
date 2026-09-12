package kh;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f14514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14516e;

    public q(s sVar, float f2, float f7) {
        this.f14514c = sVar;
        this.f14515d = f2;
        this.f14516e = f7;
    }

    @Override // kh.u
    public final void a(Matrix matrix, jh.a aVar, int i7, Canvas canvas) {
        s sVar = this.f14514c;
        float f2 = sVar.f14525c;
        float f7 = this.f14516e;
        float f10 = sVar.f14524b;
        float f11 = this.f14515d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f7, f10 - f11), 0.0f);
        Matrix matrix2 = this.f14528a;
        matrix2.set(matrix);
        matrix2.preTranslate(f11, f7);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i7;
        rectF.offset(0.0f, -i7);
        int i10 = aVar.f13877f;
        int[] iArr = jh.a.f13870i;
        iArr[0] = i10;
        iArr[1] = aVar.f13876e;
        iArr[2] = aVar.f13875d;
        Paint paint = aVar.f13874c;
        float f12 = rectF.left;
        paint.setShader(new LinearGradient(f12, rectF.top, f12, rectF.bottom, iArr, jh.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        s sVar = this.f14514c;
        return (float) Math.toDegrees(Math.atan((sVar.f14525c - this.f14516e) / (sVar.f14524b - this.f14515d)));
    }
}
