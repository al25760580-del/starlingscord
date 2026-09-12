package pa;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends b implements e {
    public h(q8.c cVar, v vVar, s sVar) {
        super(cVar, vVar, sVar);
        cVar.getClass();
        sVar.getClass();
    }

    @Override // pa.b
    public final Object a(int i7) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i7) / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // pa.b
    public final void c(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    @Override // pa.b
    public final int f(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return bitmap.getAllocationByteCount();
    }

    @Override // pa.b
    public final Object h(f fVar) {
        Bitmap bitmap = (Bitmap) super.h(fVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // pa.b
    public final boolean j(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // pa.b
    public final int e(int i7) {
        return i7;
    }

    @Override // pa.b
    public final int g(int i7) {
        return i7;
    }
}
