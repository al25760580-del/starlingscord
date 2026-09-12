package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pa.n f5049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f5050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final la.b f5051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u4.c f5052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DownsampleMode f5053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0 f5055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u4.c f5057i;

    public q(pa.n byteArrayPool, Executor executor, la.b imageDecoder, u4.c progressiveJpegConfig, DownsampleMode downsampleMode, boolean z5, z0 inputProducer, int i7, u4.c closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(byteArrayPool, "byteArrayPool");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(imageDecoder, "imageDecoder");
        Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        n8.h recoverFromDecoderOOM = n8.i.f16515b;
        Intrinsics.checkNotNullParameter(recoverFromDecoderOOM, "recoverFromDecoderOOM");
        this.f5049a = byteArrayPool;
        this.f5050b = executor;
        this.f5051c = imageDecoder;
        this.f5052d = progressiveJpegConfig;
        this.f5053e = downsampleMode;
        this.f5054f = z5;
        this.f5055g = inputProducer;
        this.f5056h = i7;
        this.f5057i = closeableReferenceFactory;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        q qVar;
        ProducerContext producerContext2;
        Consumer nVar;
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerContext, "context");
        sa.a.w();
        ImageRequest imageRequestG = producerContext.g();
        if (v8.a.c(imageRequestG.getSourceUri()) || ImageRequestBuilder.c(imageRequestG.getSourceUri())) {
            qVar = this;
            producerContext2 = producerContext;
            nVar = new n(qVar, consumer, producerContext2, new la.c(this.f5049a), this.f5052d, this.f5056h);
        } else {
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            nVar = new m(this, consumer, producerContext, this.f5056h);
            qVar = this;
            producerContext2 = producerContext;
        }
        qVar.f5055g.b(nVar, producerContext2);
    }
}
