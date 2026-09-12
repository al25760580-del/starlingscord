package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.BytesRange;

/* JADX INFO: loaded from: classes3.dex */
public class FetchState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f4934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProducerContext f4935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4936c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BytesRange f4938e;

    public FetchState(Consumer consumer, ProducerContext producerContext) {
        this.f4934a = consumer;
        this.f4935b = producerContext;
    }
}
