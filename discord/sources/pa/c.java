package pa;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ue.i f17807e;

    public c(int i7, int i10) {
        if (!(i7 > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i10 > 0)) {
            throw new IllegalArgumentException();
        }
        this.f17805c = i7;
        this.f17806d = i10;
        this.f17807e = new ue.i(this);
    }

    public final synchronized void a(Bitmap bitmap) {
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        n8.i.b("No bitmaps registered.", this.f17803a > 0);
        long j = sizeInBytes;
        n8.i.c(j <= this.f17804b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(sizeInBytes), Long.valueOf(this.f17804b));
        this.f17804b -= j;
        this.f17803a--;
    }

    public final synchronized int b() {
        return this.f17806d;
    }
}
