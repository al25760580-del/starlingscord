package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.listener.RequestListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements oa.d, a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestListener f4972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.b f4973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RequestListener f4974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oa.d f4975d;

    public e0(oa.c cVar, oa.b bVar) {
        this.f4972a = cVar;
        this.f4973b = bVar;
        this.f4974c = cVar;
        this.f4975d = bVar;
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void a(ProducerContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f4972a;
        if (requestListener != null) {
            requestListener.onProducerEvent(context.getId(), "NetworkFetchProducer", "intermediate_result");
        }
        oa.b bVar = this.f4973b;
        if (bVar != null) {
            bVar.a(context);
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void b(ProducerContext context, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f4972a;
        if (requestListener != null) {
            requestListener.onUltimateProducerReached(context.getId(), str, z5);
        }
        oa.b bVar = this.f4973b;
        if (bVar != null) {
            bVar.b(context, str, z5);
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void c(ProducerContext context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f4972a;
        if (requestListener != null) {
            requestListener.onProducerStart(context.getId(), str);
        }
        oa.b bVar = this.f4973b;
        if (bVar != null) {
            bVar.c(context, str);
        }
    }

    @Override // oa.d
    public final void d(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        RequestListener requestListener = this.f4974c;
        if (requestListener != null) {
            requestListener.onRequestSuccess(producerContext.g(), producerContext.getId(), producerContext.u());
        }
        oa.d dVar = this.f4975d;
        if (dVar != null) {
            dVar.d(producerContext);
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void e(ProducerContext context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f4972a;
        if (requestListener != null) {
            requestListener.onProducerFinishWithCancellation(context.getId(), str, null);
        }
        oa.b bVar = this.f4973b;
        if (bVar != null) {
            bVar.e(context, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final boolean f(ProducerContext context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f4972a;
        Boolean boolValueOf = requestListener != null ? Boolean.valueOf(requestListener.requiresExtraMap(context.getId())) : null;
        if (!Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            oa.b bVar = this.f4973b;
            boolValueOf = bVar != null ? Boolean.valueOf(bVar.f(context, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // oa.d
    public final void g(ProducerContext producerContext, Throwable th2) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        RequestListener requestListener = this.f4974c;
        if (requestListener != null) {
            requestListener.onRequestFailure(producerContext.g(), producerContext.getId(), th2, producerContext.u());
        }
        oa.d dVar = this.f4975d;
        if (dVar != null) {
            dVar.g(producerContext, th2);
        }
    }

    @Override // oa.d
    public final void h(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        RequestListener requestListener = this.f4974c;
        if (requestListener != null) {
            requestListener.onRequestCancellation(producerContext.getId());
        }
        oa.d dVar = this.f4975d;
        if (dVar != null) {
            dVar.h(producerContext);
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void i(ProducerContext context, String str, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f4972a;
        if (requestListener != null) {
            requestListener.onProducerFinishWithSuccess(context.getId(), str, map);
        }
        oa.b bVar = this.f4973b;
        if (bVar != null) {
            bVar.i(context, str, map);
        }
    }

    @Override // oa.d
    public final void j(d1 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        RequestListener requestListener = this.f4974c;
        if (requestListener != null) {
            requestListener.onRequestStart(producerContext.f4965d, producerContext.f4968v, producerContext.f4966e, producerContext.u());
        }
        oa.d dVar = this.f4975d;
        if (dVar != null) {
            dVar.j(producerContext);
        }
    }

    @Override // com.facebook.imagepipeline.producers.a1
    public final void k(ProducerContext context, String str, Throwable th2, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        RequestListener requestListener = this.f4972a;
        if (requestListener != null) {
            requestListener.onProducerFinishWithFailure(context.getId(), str, th2, map);
        }
        oa.b bVar = this.f4973b;
        if (bVar != null) {
            bVar.k(context, str, th2, map);
        }
    }
}
