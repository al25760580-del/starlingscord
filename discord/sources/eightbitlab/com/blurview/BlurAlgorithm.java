package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* JADX INFO: loaded from: classes3.dex */
public interface BlurAlgorithm {
    void a();

    void b(Canvas canvas, Bitmap bitmap);

    Bitmap c(Bitmap bitmap, float f2);

    void destroy();
}
