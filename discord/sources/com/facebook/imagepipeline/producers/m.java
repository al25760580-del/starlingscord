package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends p {
    @Override // com.facebook.imagepipeline.producers.p
    public final int m(EncodedImage encodedImage) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        return encodedImage.getSize();
    }

    @Override // com.facebook.imagepipeline.producers.p
    public final na.j n() {
        na.j jVar = new na.j();
        jVar.f16537a = 0;
        jVar.f16538b = false;
        jVar.f16539c = false;
        Intrinsics.checkNotNullExpressionValue(jVar, "of(...)");
        return jVar;
    }

    @Override // com.facebook.imagepipeline.producers.p
    public final synchronized boolean q(EncodedImage encodedImage, int i7) {
        return c.e(i7) ? false : this.f5045h.e(encodedImage, i7);
    }
}
