package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f5030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.e f5031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f5032c;

    public m0(Executor executor, e4.e eVar, ContentResolver contentResolver) {
        this.f5030a = executor;
        this.f5031b = eVar;
        this.f5032c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.l1
    public final boolean a(ResizeOptions resizeOptions) {
        return sa.a.t(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, resizeOptions);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        a1 a1VarO = producerContext.O();
        ImageRequest imageRequestG = producerContext.g();
        producerContext.n("local", "exif");
        l0 l0Var = new l0(this, consumer, a1VarO, producerContext, imageRequestG);
        producerContext.i(new o(2, l0Var));
        this.f5030a.execute(l0Var);
    }
}
