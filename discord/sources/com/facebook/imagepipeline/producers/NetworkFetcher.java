package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface NetworkFetcher {

    public interface Callback {
        void a();

        void b(InputStream inputStream, int i7);

        void onFailure(Exception exc);
    }

    FetchState createFetchState(Consumer consumer, ProducerContext producerContext);

    void fetch(FetchState fetchState, Callback callback);

    Map getExtraMap(FetchState fetchState, int i7);

    void onFetchCompletion(FetchState fetchState, int i7);

    boolean shouldPropagate(FetchState fetchState);
}
