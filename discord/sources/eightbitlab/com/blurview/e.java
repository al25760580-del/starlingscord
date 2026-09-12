package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import androidx.core.view.s1;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements BlurAlgorithm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8409c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f8411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f8412f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f8407a = s1.g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8410d = 1.0f;

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public final void a() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public final void b(Canvas canvas, Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f8407a);
            return;
        }
        if (this.f8411e == null) {
            this.f8411e = new f(this.f8412f);
        }
        this.f8411e.c(bitmap, this.f8410d);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f8411e.f8413a);
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public final Bitmap c(Bitmap bitmap, float f2) {
        this.f8410d = f2;
        if (bitmap.getHeight() != this.f8408b || bitmap.getWidth() != this.f8409c) {
            this.f8408b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f8409c = width;
            this.f8407a.setPosition(0, 0, width, this.f8408b);
        }
        this.f8407a.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f8407a.endRecording();
        this.f8407a.setRenderEffect(RenderEffect.createBlurEffect(f2, f2, Shader.TileMode.MIRROR));
        return bitmap;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public final void destroy() {
        this.f8407a.discardDisplayList();
        f fVar = this.f8411e;
        if (fVar != null) {
            fVar.destroy();
        }
    }
}
