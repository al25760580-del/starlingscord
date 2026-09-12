package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends e1 {
    public final /* synthetic */ ImageRequest E;
    public final /* synthetic */ CancellationSignal F;
    public final /* synthetic */ q0 G;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f5047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ProducerContext f5048y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, Consumer consumer, a1 a1Var, ProducerContext producerContext, a1 a1Var2, ProducerContext producerContext2, ImageRequest imageRequest, CancellationSignal cancellationSignal) {
        super(consumer, a1Var, producerContext, "LocalThumbnailBitmapSdk29Producer");
        this.G = q0Var;
        this.f5047x = a1Var2;
        this.f5048y = producerContext2;
        this.E = imageRequest;
        this.F = cancellationSignal;
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public final void b(Object obj) {
        CloseableReference.l((CloseableReference) obj);
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public final Map c(Object obj) {
        return n8.e.a("createdThumbnail", String.valueOf(((CloseableReference) obj) != null));
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public final Object d() throws IOException {
        String strA;
        Bitmap bitmapLoadThumbnail;
        ContentResolver contentResolver = this.G.f5060c;
        ImageRequest imageRequest = this.E;
        Size size = new Size(imageRequest.getPreferredWidth(), imageRequest.getPreferredHeight());
        try {
            strA = v8.a.a(contentResolver, imageRequest.getSourceUri());
        } catch (IllegalArgumentException unused) {
            strA = null;
        }
        CancellationSignal cancellationSignal = this.F;
        if (strA != null) {
            String strA2 = p8.a.a(strA);
            bitmapLoadThumbnail = strA2 != null ? kotlin.text.x.o(strA2, "video/", false) : false ? ThumbnailUtils.createVideoThumbnail(new File(strA), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(strA), size, cancellationSignal);
        } else {
            bitmapLoadThumbnail = null;
        }
        if (bitmapLoadThumbnail == null) {
            bitmapLoadThumbnail = contentResolver.loadThumbnail(imageRequest.getSourceUri(), size, cancellationSignal);
        }
        if (bitmapLoadThumbnail == null) {
            return null;
        }
        io.sentry.hints.j jVarC = io.sentry.hints.j.C();
        na.j jVar = na.j.f16536d;
        int i7 = na.g.F;
        na.g gVar = new na.g(bitmapLoadThumbnail, jVarC, jVar);
        ProducerContext producerContext = this.f5048y;
        producerContext.B("thumbnail", "image_format");
        gVar.q(producerContext.getExtras());
        return CloseableReference.B(gVar);
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public final void e() {
        super.e();
        this.F.cancel();
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public final void f(Exception exc) {
        super.f(exc);
        a1 a1Var = this.f5047x;
        ProducerContext producerContext = this.f5048y;
        a1Var.b(producerContext, "LocalThumbnailBitmapSdk29Producer", false);
        producerContext.n("local", "thumbnail_bitmap");
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public final void g(Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        super.g(closeableReference);
        boolean z5 = closeableReference != null;
        a1 a1Var = this.f5047x;
        ProducerContext producerContext = this.f5048y;
        a1Var.b(producerContext, "LocalThumbnailBitmapSdk29Producer", z5);
        producerContext.n("local", "thumbnail_bitmap");
    }
}
