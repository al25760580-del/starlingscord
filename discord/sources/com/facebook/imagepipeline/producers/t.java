package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements j4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f5067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerContext f5068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Consumer f5069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f5070d;

    public t(u uVar, a1 a1Var, ProducerContext producerContext, Consumer consumer) {
        this.f5070d = uVar;
        this.f5067a = a1Var;
        this.f5068b = producerContext;
        this.f5069c = consumer;
    }

    @Override // j4.c
    public final void a(j4.e eVar) {
        boolean z5;
        Object obj;
        u uVar = this.f5070d;
        Consumer consumer = this.f5069c;
        a1 a1Var = this.f5067a;
        ProducerContext producerContext = this.f5068b;
        synchronized (eVar.f13658a) {
            z5 = eVar.f13660c;
        }
        if (z5 || (eVar.d() && (eVar.c() instanceof CancellationException))) {
            a1Var.e(producerContext, "DiskCacheProducer");
            consumer.a();
            return;
        }
        if (eVar.d()) {
            a1Var.k(producerContext, "DiskCacheProducer", eVar.c(), null);
            uVar.f5081c.b(consumer, producerContext);
            return;
        }
        synchronized (eVar.f13658a) {
            obj = eVar.f13661d;
        }
        EncodedImage encodedImage = (EncodedImage) obj;
        if (encodedImage == null) {
            a1Var.i(producerContext, "DiskCacheProducer", u.c(a1Var, producerContext, false, 0));
            uVar.f5081c.b(consumer, producerContext);
            return;
        }
        a1Var.i(producerContext, "DiskCacheProducer", u.c(a1Var, producerContext, true, encodedImage.getSize()));
        a1Var.b(producerContext, "DiskCacheProducer", true);
        producerContext.z("disk");
        consumer.c(1.0f);
        consumer.b(1, encodedImage);
        encodedImage.close();
    }
}
