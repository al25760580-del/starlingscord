package on;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Canvas f17465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f17466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SurfaceView f17467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap f17468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Paint f17469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f17470f;

    public b(e eVar, Canvas canvas, View view, SurfaceView surfaceView, Bitmap bitmap, Paint paint, CountDownLatch countDownLatch) {
        this.f17465a = canvas;
        this.f17466b = view;
        this.f17467c = surfaceView;
        this.f17468d = bitmap;
        this.f17469e = paint;
        this.f17470f = countDownLatch;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i7) {
        Canvas canvas = this.f17465a;
        int iSave = canvas.save();
        e.d(canvas, this.f17466b, this.f17467c);
        Paint paint = this.f17469e;
        Bitmap bitmap = this.f17468d;
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restoreToCount(iSave);
        e.h(bitmap);
        this.f17470f.countDown();
    }
}
