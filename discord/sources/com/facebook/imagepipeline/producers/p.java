package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProducerContext f5040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1 f5042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageDecodeOptions f5043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f5045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5046i;
    public final /* synthetic */ q j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Consumer consumer, ProducerContext producerContext, int i7) {
        super(consumer);
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        this.j = qVar;
        this.f5040c = producerContext;
        this.f5041d = "ProgressiveDecoder";
        this.f5042e = producerContext.O();
        ImageDecodeOptions imageDecodeOptions = producerContext.g().getImageDecodeOptions();
        Intrinsics.checkNotNullExpressionValue(imageDecodeOptions, "getImageDecodeOptions(...)");
        this.f5043f = imageDecodeOptions;
        bc.f fVar = new bc.f(this, qVar, i7, 1);
        Executor executor = qVar.f5050b;
        imageDecodeOptions.getClass();
        this.f5045h = new h0(executor, fVar);
        producerContext.i(new o(0, this));
    }

    @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.c
    public final void f() {
        o(true);
        this.f5061b.a();
    }

    @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.c
    public final void g(Throwable t5) {
        Intrinsics.checkNotNullParameter(t5, "t");
        o(true);
        this.f5061b.onFailure(t5);
    }

    @Override // com.facebook.imagepipeline.producers.c
    public final void h(int i7, Object obj) {
        EncodedImage encodedImage = (EncodedImage) obj;
        sa.a.w();
        boolean zD = c.d(i7);
        ProducerContext producerContext = this.f5040c;
        if (zD) {
            Consumer consumer = this.f5061b;
            if (encodedImage == null) {
                Intrinsics.areEqual(producerContext.y("cached_value_found"), Boolean.TRUE);
                ((ImagePipelineConfig) producerContext.l()).f4860u.getClass();
                ag.b bVar = new ag.b("Encoded image is null.", 7);
                o(true);
                consumer.onFailure(bVar);
                return;
            }
            if (!encodedImage.isValid()) {
                ag.b bVar2 = new ag.b("Encoded image is not valid.", 7);
                o(true);
                consumer.onFailure(bVar2);
                return;
            }
        }
        if (q(encodedImage, i7)) {
            boolean zK = c.k(i7, 4);
            if (zD || zK || producerContext.P()) {
                this.f5045h.c();
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.c
    public final void i(float f2) {
        super.i(f2 * 0.99f);
    }

    public final n8.e l(na.c cVar, long j, na.k kVar, boolean z5, String str, String str2, String str3, String str4) {
        HashMap map;
        Object obj;
        String string = null;
        if (!this.f5042e.f(this.f5040c, "DecodeProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(j);
        String strValueOf2 = String.valueOf(((na.j) kVar).f16538b);
        String strValueOf3 = String.valueOf(z5);
        if (cVar != null && (map = ((na.a) cVar).f16523d) != null && (obj = map.get("non_fatal_decode_error")) != null) {
            string = obj.toString();
        }
        if (!(cVar instanceof na.d)) {
            String str5 = string;
            HashMap map2 = new HashMap(7);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            if (str5 != null) {
                map2.put("non_fatal_decode_error", str5);
            }
            return new n8.e(map2);
        }
        String str6 = string;
        Bitmap bitmap = ((na.g) ((na.d) cVar)).f16528w;
        Intrinsics.checkNotNullExpressionValue(bitmap, "getUnderlyingBitmap(...)");
        String str7 = bitmap.getWidth() + "x" + bitmap.getHeight();
        HashMap map3 = new HashMap(8);
        map3.put("bitmapSize", str7);
        map3.put("queueTime", strValueOf);
        map3.put("hasGoodQuality", strValueOf2);
        map3.put("isFinal", strValueOf3);
        map3.put("encodedImageSize", str2);
        map3.put("imageFormat", str);
        map3.put("requestedImageSize", str3);
        map3.put("sampleSize", str4);
        int byteCount = bitmap.getByteCount();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(byteCount);
        map3.put("byteCount", sb2.toString());
        if (str6 != null) {
            map3.put("non_fatal_decode_error", str6);
        }
        return new n8.e(map3);
    }

    public abstract int m(EncodedImage encodedImage);

    public abstract na.j n();

    public final void o(boolean z5) {
        EncodedImage encodedImage;
        synchronized (this) {
            if (z5) {
                if (!this.f5044g) {
                    this.f5061b.c(1.0f);
                    this.f5044g = true;
                    Unit unit = Unit.f14616a;
                    h0 h0Var = this.f5045h;
                    synchronized (h0Var) {
                        encodedImage = h0Var.f4993e;
                        h0Var.f4993e = null;
                        h0Var.f4994f = 0;
                    }
                    EncodedImage.closeSafely(encodedImage);
                }
            }
        }
    }

    public final void p(EncodedImage encodedImage, na.c cVar, int i7) {
        this.f5040c.B(Integer.valueOf(encodedImage.getWidth()), "encoded_width");
        this.f5040c.B(Integer.valueOf(encodedImage.getHeight()), "encoded_height");
        this.f5040c.B(Integer.valueOf(encodedImage.getSize()), "encoded_size");
        this.f5040c.B(encodedImage.getColorSpace(), "image_color_space");
        if (cVar instanceof na.d) {
            this.f5040c.B(String.valueOf(((na.g) ((na.d) cVar)).f16528w.getConfig()), "bitmap_config");
        }
        if (cVar != null) {
            ((na.a) cVar).q(this.f5040c.getExtras());
        }
        this.f5040c.B(Integer.valueOf(i7), "last_scan_num");
    }

    public abstract boolean q(EncodedImage encodedImage, int i7);
}
