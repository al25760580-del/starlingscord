package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f5038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.e f5039b;

    public o0(Executor executor, e4.e eVar) {
        this.f5038a = executor;
        this.f5039b = eVar;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        a1 a1VarO = producerContext.O();
        ImageRequest imageRequestG = producerContext.g();
        producerContext.n("local", "fetch");
        n0 n0Var = new n0(this, consumer, a1VarO, producerContext, e(), imageRequestG, a1VarO, producerContext);
        producerContext.i(new o(3, n0Var));
        this.f5038a.execute(n0Var);
    }

    public final EncodedImage c(InputStream inputStream, int i7) {
        r8.b bVarB;
        e4.e eVar = this.f5039b;
        try {
            if (i7 <= 0) {
                eVar.getClass();
                Intrinsics.checkNotNullParameter(inputStream, "inputStream");
                pa.p pVar = (pa.p) eVar.f7971e;
                pa.r outputStream = new pa.r(pVar, pVar.G[0]);
                try {
                    Intrinsics.checkNotNullParameter(inputStream, "inputStream");
                    Intrinsics.checkNotNullParameter(outputStream, "outputStream");
                    ((a5.b0) eVar.f7972i).p(inputStream, outputStream);
                    pa.q qVarF = outputStream.f();
                    outputStream.close();
                    bVarB = CloseableReference.B(qVarF);
                } catch (Throwable th2) {
                    outputStream.close();
                    throw th2;
                }
            } else {
                eVar.getClass();
                Intrinsics.checkNotNullParameter(inputStream, "inputStream");
                pa.r outputStream2 = new pa.r((pa.p) eVar.f7971e, i7);
                try {
                    Intrinsics.checkNotNullParameter(inputStream, "inputStream");
                    Intrinsics.checkNotNullParameter(outputStream2, "outputStream");
                    ((a5.b0) eVar.f7972i).p(inputStream, outputStream2);
                    pa.q qVarF2 = outputStream2.f();
                    outputStream2.close();
                    bVarB = CloseableReference.B(qVarF2);
                } catch (Throwable th3) {
                    outputStream2.close();
                    throw th3;
                }
            }
            r8.b bVar = bVarB;
            EncodedImage encodedImage = new EncodedImage(bVar);
            n8.a.b(inputStream);
            CloseableReference.l(bVar);
            return encodedImage;
        } catch (Throwable th4) {
            n8.a.b(inputStream);
            CloseableReference.l(null);
            throw th4;
        }
    }

    public abstract EncodedImage d(ImageRequest imageRequest);

    public abstract String e();
}
