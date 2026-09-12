package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends p {
    public final la.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u4.c f5033l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, Consumer consumer, ProducerContext producerContext, la.c progressiveJpegParser, u4.c progressiveJpegConfig, int i7) {
        super(qVar, consumer, producerContext, i7);
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(progressiveJpegParser, "progressiveJpegParser");
        Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
        this.k = progressiveJpegParser;
        this.f5033l = progressiveJpegConfig;
        this.f5046i = 0;
    }

    @Override // com.facebook.imagepipeline.producers.p
    public final int m(EncodedImage encodedImage) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        return this.k.f14995f;
    }

    @Override // com.facebook.imagepipeline.producers.p
    public final na.j n() {
        int i7 = this.k.f14994e;
        Object obj = this.f5033l.f20946d;
        boolean z5 = i7 >= 0;
        na.j jVar = new na.j();
        jVar.f16537a = i7;
        jVar.f16538b = z5;
        jVar.f16539c = false;
        Intrinsics.checkNotNullExpressionValue(jVar, "getQualityInfo(...)");
        return jVar;
    }

    @Override // com.facebook.imagepipeline.producers.p
    public final synchronized boolean q(EncodedImage encodedImage, int i7) {
        int iIntValue;
        if (encodedImage == null) {
            return false;
        }
        try {
            boolean zE = this.f5045h.e(encodedImage, i7);
            if (c.e(i7) || c.k(i7, 8)) {
                if (!c.k(i7, 4) && EncodedImage.isValid(encodedImage) && encodedImage.getImageFormat() == z9.b.f23618a) {
                    if (!this.k.b(encodedImage)) {
                        return false;
                    }
                    int i10 = this.k.f14994e;
                    int i11 = this.f5046i;
                    if (i10 <= i11) {
                        return false;
                    }
                    Object obj = this.f5033l.f20946d;
                    List list = Collections.EMPTY_LIST;
                    if (list != null && !list.isEmpty()) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= list.size()) {
                                iIntValue = Integer.MAX_VALUE;
                                break;
                            }
                            if (((Integer) list.get(i12)).intValue() > i11) {
                                iIntValue = ((Integer) list.get(i12)).intValue();
                                break;
                            }
                            i12++;
                        }
                    } else {
                        iIntValue = i11 + 1;
                    }
                    if (i10 < iIntValue && !this.k.f14996g) {
                        return false;
                    }
                    this.f5046i = i10;
                }
            }
            return zE;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
