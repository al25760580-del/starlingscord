package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements BlurAlgorithm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RenderScript f8414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScriptIntrinsicBlur f8415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Allocation f8416d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f8413a = new Paint(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8417e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8418f = -1;

    public f(Context context) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        this.f8414b = renderScriptCreate;
        this.f8415c = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public final void a() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public final void b(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f8413a);
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public final Bitmap c(Bitmap bitmap, float f2) {
        RenderScript renderScript = this.f8414b;
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
        if (bitmap.getHeight() != this.f8418f || bitmap.getWidth() != this.f8417e) {
            Allocation allocation = this.f8416d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f8416d = Allocation.createTyped(renderScript, allocationCreateFromBitmap.getType());
            this.f8417e = bitmap.getWidth();
            this.f8418f = bitmap.getHeight();
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f8415c;
        scriptIntrinsicBlur.setRadius(f2);
        scriptIntrinsicBlur.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlur.forEach(this.f8416d);
        this.f8416d.copyTo(bitmap);
        allocationCreateFromBitmap.destroy();
        return bitmap;
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public final void destroy() {
        this.f8415c.destroy();
        this.f8414b.destroy();
        Allocation allocation = this.f8416d;
        if (allocation != null) {
            allocation.destroy();
        }
    }
}
