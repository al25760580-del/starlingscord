package com.facebook.imagepipeline.producers;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f4976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Consumer f4977e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1 f4978i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ProducerContext f4979v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f4980w;

    public e1(Consumer consumer, a1 producerListener, ProducerContext producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerListener, "producerListener");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        this.f4976d = new AtomicInteger(0);
        this.f4977e = consumer;
        this.f4978i = producerListener;
        this.f4979v = producerContext;
        this.f4980w = producerName;
        producerListener.c(producerContext, producerName);
    }

    public final void a() {
        if (this.f4976d.compareAndSet(0, 2)) {
            e();
        }
    }

    public abstract void b(Object obj);

    public Map c(Object obj) {
        return null;
    }

    public abstract Object d();

    public void e() {
        a1 a1Var = this.f4978i;
        ProducerContext producerContext = this.f4979v;
        String str = this.f4980w;
        a1Var.f(producerContext, str);
        a1Var.e(producerContext, str);
        this.f4977e.a();
    }

    public void f(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        a1 a1Var = this.f4978i;
        ProducerContext producerContext = this.f4979v;
        String str = this.f4980w;
        a1Var.f(producerContext, str);
        a1Var.k(producerContext, str, e10, null);
        this.f4977e.onFailure(e10);
    }

    public void g(Object obj) {
        a1 a1Var = this.f4978i;
        ProducerContext producerContext = this.f4979v;
        String str = this.f4980w;
        a1Var.i(producerContext, str, a1Var.f(producerContext, str) ? c(obj) : null);
        this.f4977e.b(1, obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.f4976d;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object objD = d();
                atomicInteger.set(3);
                try {
                    g(objD);
                } finally {
                    b(objD);
                }
            } catch (Exception e10) {
                atomicInteger.set(4);
                f(e10);
            }
        }
    }
}
