package com.facebook.imagepipeline.producers;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements NetworkFetcher.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FetchState f5089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f5090b;

    public v0(w0 w0Var, FetchState fetchState) {
        this.f5090b = w0Var;
        this.f5089a = fetchState;
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
    public final void a() {
        FetchState fetchState = this.f5089a;
        fetchState.f4935b.O().e(fetchState.f4935b, "NetworkFetchProducer");
        fetchState.f4934a.a();
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
    public final void b(InputStream inputStream, int i7) {
        pa.r rVar;
        sa.a.w();
        w0 w0Var = this.f5090b;
        e4.e eVar = w0Var.f5094a;
        pa.n nVar = w0Var.f5095b;
        if (i7 > 0) {
            eVar.getClass();
            rVar = new pa.r((pa.p) eVar.f7971e, i7);
        } else {
            eVar.getClass();
            pa.p pVar = (pa.p) eVar.f7971e;
            rVar = new pa.r(pVar, pVar.G[0]);
        }
        byte[] bArr = (byte[]) nVar.get(16384);
        while (true) {
            try {
                int i10 = inputStream.read(bArr);
                FetchState fetchState = this.f5089a;
                if (i10 < 0) {
                    w0Var.f5096c.onFetchCompletion(fetchState, rVar.f17828i);
                    w0Var.c(rVar, fetchState);
                    nVar.release(bArr);
                    rVar.close();
                    sa.a.w();
                    return;
                }
                if (i10 > 0) {
                    rVar.write(bArr, 0, i10);
                    w0Var.d(rVar, fetchState);
                    int i11 = rVar.f17828i;
                    fetchState.f4934a.c(i7 > 0 ? i11 / i7 : 1.0f - ((float) Math.exp(((double) (-i11)) / 50000.0d)));
                }
            } catch (Throwable th2) {
                nVar.release(bArr);
                rVar.close();
                throw th2;
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
    public final void onFailure(Exception exc) {
        FetchState fetchState = this.f5089a;
        a1 a1VarO = fetchState.f4935b.O();
        ProducerContext producerContext = fetchState.f4935b;
        a1VarO.k(producerContext, "NetworkFetchProducer", exc, null);
        producerContext.O().b(producerContext, "NetworkFetchProducer", false);
        producerContext.z("network");
        fetchState.f4934a.onFailure(exc);
    }
}
