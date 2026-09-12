package x4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hs.c f22636a = new hs.c(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hs.c f22637b = new hs.c(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hs.c f22638c = new hs.c(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hs.c f22639d = new hs.c(9);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f22640e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f2, float f7, float f10) {
        PathMeasure pathMeasure = (PathMeasure) f22636a.get();
        Path path2 = (Path) f22637b.get();
        Path path3 = (Path) f22638c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f2 == 1.0f && f7 == 0.0f) && length >= 1.0f && Math.abs((f7 - f2) - 1.0f) >= 0.01d) {
            float f11 = f2 * length;
            float f12 = f7 * length;
            float f13 = f10 * length;
            float fMin = Math.min(f11, f12) + f13;
            float fMax = Math.max(f11, f12) + f13;
            if (fMin >= length && fMax >= length) {
                fMin = g.c(fMin, length);
                fMax = g.c(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = g.c(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = g.c(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(int i7, int i10, Bitmap bitmap) {
        if (bitmap.getWidth() == i7 && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i7, i10, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
