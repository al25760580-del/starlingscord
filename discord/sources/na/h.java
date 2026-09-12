package na;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends f implements e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f16531v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16532w;

    @Override // na.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16531v = null;
        this.f16532w = true;
    }

    @Override // na.c, com.facebook.imagepipeline.image.ImageInfo
    public final int getHeight() {
        Drawable drawable = this.f16531v;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicHeight());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // na.c, com.facebook.imagepipeline.image.ImageInfo
    public final int getWidth() {
        Drawable drawable = this.f16531v;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // na.c
    public final boolean isClosed() {
        return this.f16532w;
    }

    @Override // na.c
    public final int j() {
        return getHeight() * getWidth() * 4;
    }
}
