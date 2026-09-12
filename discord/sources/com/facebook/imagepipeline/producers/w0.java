package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4.e f5094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pa.n f5095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NetworkFetcher f5096c;

    public w0(e4.e eVar, pa.n nVar, NetworkFetcher networkFetcher) {
        this.f5094a = eVar;
        this.f5095b = nVar;
        this.f5096c = networkFetcher;
    }

    public static void e(pa.r rVar, int i7, BytesRange bytesRange, Consumer consumer) throws Throwable {
        r8.b bVarB = CloseableReference.B(rVar.f());
        EncodedImage encodedImage = null;
        try {
            EncodedImage encodedImage2 = new EncodedImage(bVarB);
            try {
                encodedImage2.setBytesRange(bytesRange);
                encodedImage2.parseMetaData();
                consumer.b(i7, encodedImage2);
                EncodedImage.closeSafely(encodedImage2);
                CloseableReference.l(bVarB);
            } catch (Throwable th2) {
                th = th2;
                encodedImage = encodedImage2;
                EncodedImage.closeSafely(encodedImage);
                CloseableReference.l(bVarB);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        producerContext.O().c(producerContext, "NetworkFetchProducer");
        NetworkFetcher networkFetcher = this.f5096c;
        FetchState fetchStateCreateFetchState = networkFetcher.createFetchState(consumer, producerContext);
        networkFetcher.fetch(fetchStateCreateFetchState, new v0(this, fetchStateCreateFetchState));
    }

    public final void c(pa.r rVar, FetchState fetchState) throws Throwable {
        int i7 = rVar.f17828i;
        a1 a1VarO = fetchState.f4935b.O();
        ProducerContext producerContext = fetchState.f4935b;
        Map extraMap = !a1VarO.f(producerContext, "NetworkFetchProducer") ? null : this.f5096c.getExtraMap(fetchState, i7);
        a1 a1VarO2 = producerContext.O();
        a1VarO2.i(producerContext, "NetworkFetchProducer", extraMap);
        a1VarO2.b(producerContext, "NetworkFetchProducer", true);
        producerContext.z("network");
        e(rVar, 1 | fetchState.f4937d, fetchState.f4938e, fetchState.f4934a);
    }

    public final void d(pa.r rVar, FetchState fetchState) throws Throwable {
        ProducerContext producerContext = fetchState.f4935b;
        boolean zShouldPropagate = false;
        if (((ImagePipelineConfig) producerContext.l()).f4854o != null && producerContext.P()) {
            zShouldPropagate = this.f5096c.shouldPropagate(fetchState);
        }
        if (zShouldPropagate) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - fetchState.f4936c >= 100) {
                fetchState.f4936c = jUptimeMillis;
                producerContext.O().a(producerContext);
                e(rVar, fetchState.f4937d, fetchState.f4938e, fetchState.f4934a);
            }
        }
    }
}
