package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProducerContext f5016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f5017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f1 f1Var, Consumer consumer, ProducerContext producerContext) {
        super(consumer);
        this.f5017d = f1Var;
        this.f5016c = producerContext;
    }

    @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.c
    public final void g(Throwable th2) {
        ((j1) this.f5017d.f4985c).b(this.f5061b, this.f5016c);
    }

    @Override // com.facebook.imagepipeline.producers.c
    public final void h(int i7, Object obj) {
        EncodedImage encodedImage = (EncodedImage) obj;
        ProducerContext producerContext = this.f5016c;
        ImageRequest imageRequestG = producerContext.g();
        boolean zD = c.d(i7);
        boolean zU = sa.a.u(encodedImage, imageRequestG.getResizeOptions());
        Consumer consumer = this.f5061b;
        if (encodedImage != null && (zU || imageRequestG.getLocalThumbnailPreviewsEnabled())) {
            if (zD && zU) {
                consumer.b(i7, encodedImage);
            } else {
                consumer.b(i7 & (-2), encodedImage);
            }
        }
        if (!zD || zU || imageRequestG.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
            return;
        }
        EncodedImage.closeSafely(encodedImage);
        ((j1) this.f5017d.f4985c).b(consumer, producerContext);
    }
}
