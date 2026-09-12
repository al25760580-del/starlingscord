package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f5059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f5060c;

    public /* synthetic */ q0(Executor executor, ContentResolver contentResolver, int i7) {
        this.f5058a = i7;
        this.f5059b = executor;
        this.f5060c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        switch (this.f5058a) {
            case 0:
                a1 a1VarO = producerContext.O();
                ImageRequest imageRequestG = producerContext.g();
                producerContext.n("local", "thumbnail_bitmap");
                p0 p0Var = new p0(this, consumer, a1VarO, producerContext, a1VarO, producerContext, imageRequestG, new CancellationSignal());
                producerContext.i(new o(4, p0Var));
                this.f5059b.execute(p0Var);
                break;
            default:
                a1 a1VarO2 = producerContext.O();
                ImageRequest imageRequestG2 = producerContext.g();
                producerContext.n("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                n0 n0Var = new n0(this, consumer, a1VarO2, producerContext, a1VarO2, producerContext, imageRequestG2);
                producerContext.i(new o(5, n0Var));
                this.f5059b.execute(n0Var);
                break;
        }
    }
}
