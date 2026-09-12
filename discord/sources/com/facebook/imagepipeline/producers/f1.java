package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.core.ImagePipelineConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4983a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f4984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4985c;

    public f1(z0 inputProducer, g1 threadHandoffProducerQueue) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        this.f4984b = inputProducer;
        this.f4985c = threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext context) {
        switch (this.f4983a) {
            case 0:
                Intrinsics.checkNotNullParameter(consumer, "consumer");
                Intrinsics.checkNotNullParameter(context, "context");
                sa.a.w();
                a1 a1VarO = context.O();
                ((ImagePipelineConfig) context.l()).f4860u.getClass();
                n0 runnable = new n0(consumer, a1VarO, context, this);
                context.i(new r0(runnable, this));
                g1 g1Var = (g1) this.f4985c;
                synchronized (g1Var) {
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    g1Var.f4986a.execute(runnable);
                }
                return;
            default:
                ((c1) this.f4984b).b(new k(this, consumer, context), context);
                return;
        }
    }

    public f1(c1 c1Var, j1 j1Var) {
        this.f4984b = c1Var;
        this.f4985c = j1Var;
    }
}
