package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ta.b f4948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProducerContext f4949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f4951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c1 f4952h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, Consumer consumer, ProducerContext producerContext, boolean z5, ta.b bVar) {
        super(consumer);
        this.f4952h = c1Var;
        this.f4950f = false;
        this.f4949e = producerContext;
        Boolean resizingAllowedOverride = producerContext.g().getResizingAllowedOverride();
        this.f4947c = resizingAllowedOverride != null ? resizingAllowedOverride.booleanValue() : z5;
        this.f4948d = bVar;
        this.f4951g = new h0(c1Var.f4957a, new fj.c(7, this));
        producerContext.i(new r0(1, this, consumer));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    @Override // com.facebook.imagepipeline.producers.c
    public final void h(int i7, Object obj) throws Throwable {
        char c8;
        boolean z5;
        boolean zContains;
        EncodedImage encodedImageCloneOrNull = (EncodedImage) obj;
        if (this.f4950f) {
            return;
        }
        boolean zD = c.d(i7);
        Consumer consumer = this.f5061b;
        if (encodedImageCloneOrNull == null) {
            if (zD) {
                consumer.b(1, null);
                return;
            }
            return;
        }
        z9.c imageFormat = encodedImageCloneOrNull.getImageFormat();
        ProducerContext producerContext = this.f4949e;
        ImageRequest imageRequestG = producerContext.g();
        ta.a aVarCreateImageTranscoder = this.f4948d.createImageTranscoder(imageFormat, this.f4947c);
        aVarCreateImageTranscoder.getClass();
        if (encodedImageCloneOrNull.getImageFormat() == z9.c.f23631c) {
            c8 = 3;
        } else {
            c8 = 2;
            if (aVarCreateImageTranscoder.b(encodedImageCloneOrNull.getImageFormat())) {
                RotationOptions rotationOptions = imageRequestG.getRotationOptions();
                if (rotationOptions.f4823b) {
                    z5 = false;
                } else {
                    if (ta.c.b(rotationOptions, encodedImageCloneOrNull) == 0) {
                        if (rotationOptions.f4822a == -2 || rotationOptions.f4823b) {
                            encodedImageCloneOrNull.setExifOrientation(0);
                            zContains = false;
                        } else {
                            zContains = ta.c.f20668a.contains(Integer.valueOf(encodedImageCloneOrNull.getExifOrientation()));
                        }
                        if (!zContains) {
                            z5 = false;
                        }
                    }
                    z5 = true;
                }
                if (z5 || aVarCreateImageTranscoder.c(encodedImageCloneOrNull, imageRequestG.getRotationOptions(), imageRequestG.getResizeOptions())) {
                    c8 = 1;
                }
            }
        }
        if (zD || c8 != 3) {
            if (c8 == 1) {
                h0 h0Var = this.f4951g;
                if (h0Var.e(encodedImageCloneOrNull, i7)) {
                    if (zD || producerContext.P()) {
                        h0Var.c();
                        return;
                    }
                    return;
                }
                return;
            }
            if (imageFormat != z9.b.f23618a && imageFormat != z9.b.k) {
                RotationOptions rotationOptions2 = producerContext.g().getRotationOptions();
                boolean zA = rotationOptions2.a();
                int i10 = rotationOptions2.f4822a;
                if (!zA) {
                    if (i10 != -2) {
                        if (rotationOptions2.a()) {
                            throw new IllegalStateException("Rotation is set to use EXIF");
                        }
                        encodedImageCloneOrNull = EncodedImage.cloneOrNull(encodedImageCloneOrNull);
                        if (encodedImageCloneOrNull != null) {
                            encodedImageCloneOrNull.setRotationAngle(i10);
                        }
                    }
                }
            } else if (!producerContext.g().getRotationOptions().f4823b && encodedImageCloneOrNull.getRotationAngle() != 0 && encodedImageCloneOrNull.getRotationAngle() != -1 && (encodedImageCloneOrNull = EncodedImage.cloneOrNull(encodedImageCloneOrNull)) != null) {
                encodedImageCloneOrNull.setRotationAngle(0);
            }
            consumer.b(i7, encodedImageCloneOrNull);
        }
    }

    public final n8.e l(EncodedImage encodedImage, ResizeOptions resizeOptions, o9.d dVar, String str) {
        String str2;
        long j;
        ProducerContext producerContext = this.f4949e;
        if (!producerContext.O().f(producerContext, "ResizeAndRotateProducer")) {
            return null;
        }
        String str3 = encodedImage.getWidth() + "x" + encodedImage.getHeight();
        if (resizeOptions != null) {
            str2 = resizeOptions.f4817a + "x" + resizeOptions.f4818b;
        } else {
            str2 = "Unspecified";
        }
        HashMap map = new HashMap();
        map.put("Image format", String.valueOf(encodedImage.getImageFormat()));
        map.put("Original size", str3);
        map.put("Requested size", str2);
        h0 h0Var = this.f4951g;
        synchronized (h0Var) {
            j = h0Var.f4997i - h0Var.f4996h;
        }
        map.put("queueTime", String.valueOf(j));
        map.put("Transcoder id", str);
        map.put("Transcoding result", String.valueOf(dVar));
        return new n8.e(map);
    }
}
