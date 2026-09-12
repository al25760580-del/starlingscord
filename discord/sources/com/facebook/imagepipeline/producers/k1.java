package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProducerContext f5023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ResizeOptions f5025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f5026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(b bVar, Consumer consumer, ProducerContext producerContext, int i7) {
        super(consumer);
        this.f5026f = bVar;
        this.f5023c = producerContext;
        this.f5024d = i7;
        this.f5025e = producerContext.g().getResizeOptions();
    }

    @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.c
    public final void g(Throwable th2) {
        int i7 = this.f5024d + 1;
        ProducerContext producerContext = this.f5023c;
        b bVar = this.f5026f;
        Consumer consumer = this.f5061b;
        if (bVar.c(i7, consumer, producerContext)) {
            return;
        }
        consumer.onFailure(th2);
    }

    @Override // com.facebook.imagepipeline.producers.c
    public final void h(int i7, Object obj) {
        EncodedImage encodedImage = (EncodedImage) obj;
        Consumer consumer = this.f5061b;
        if (encodedImage != null && (c.e(i7) || sa.a.u(encodedImage, this.f5025e))) {
            consumer.b(i7, encodedImage);
            return;
        }
        if (c.d(i7)) {
            EncodedImage.closeSafely(encodedImage);
            if (this.f5026f.c(this.f5024d + 1, consumer, this.f5023c)) {
                return;
            }
            consumer.b(1, null);
        }
    }
}
