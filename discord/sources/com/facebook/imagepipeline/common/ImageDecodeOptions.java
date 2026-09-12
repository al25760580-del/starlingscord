package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import com.discord.chat.presentation.list.a;
import e4.e;
import n8.f;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageDecodeOptions {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImageDecodeOptions f4809c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f4810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f4811b;

    static {
        e eVar = new e((char) 0, 8);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        eVar.f7971e = config;
        eVar.f7972i = config;
        f4809c = new ImageDecodeOptions(eVar);
    }

    public ImageDecodeOptions(e eVar) {
        this.f4810a = (Bitmap.Config) eVar.f7971e;
        this.f4811b = (Bitmap.Config) eVar.f7972i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ImageDecodeOptions.class != obj.getClass()) {
            return false;
        }
        ImageDecodeOptions imageDecodeOptions = (ImageDecodeOptions) obj;
        return this.f4810a == imageDecodeOptions.f4810a && this.f4811b == imageDecodeOptions.f4811b;
    }

    public final int hashCode() {
        int iOrdinal = (this.f4810a.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.f4811b;
        return (iOrdinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageDecodeOptions{");
        f fVarJ = i.j(this);
        fVarJ.F(100, "minDecodeIntervalMs");
        fVarJ.F(Integer.MAX_VALUE, "maxDimensionPx");
        fVarJ.G("decodePreviewFrame", false);
        fVarJ.G("useLastFrameForPreview", false);
        fVarJ.G("useEncodedImageForPreview", false);
        fVarJ.G("decodeAllFrames", false);
        fVarJ.G("forceStaticImage", false);
        fVarJ.H(this.f4810a.name(), "bitmapConfigName");
        fVarJ.H(this.f4811b.name(), "animatedBitmapConfigName");
        fVarJ.H(null, "customImageDecoder");
        fVarJ.H(null, "bitmapTransformation");
        fVarJ.H(null, "colorSpace");
        return a.k(sb2, fVarJ.toString(), "}");
    }
}
