package bc;

import a5.l0;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.producers.a1;
import com.facebook.imagepipeline.producers.g0;
import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.p;
import com.facebook.imagepipeline.producers.q;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.BitmapUtil;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import e4.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements dc.b, g0, je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3104e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3105i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3106v;

    public /* synthetic */ f(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i7) {
        this.f3103d = 2;
        this.f3104e = i7;
        this.f3105i = positionInfo;
        this.f3106v = positionInfo2;
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void a(EncodedImage encodedImage, int i7) throws Throwable {
        String str;
        long j;
        long j5;
        a1 a1Var;
        na.c cVar;
        na.c cVarG;
        r8.b bVar;
        p this$0 = (p) this.f3105i;
        q this$1 = (q) this.f3106v;
        int i10 = this.f3104e;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        if (encodedImage == null) {
            return;
        }
        ProducerContext producerContext = this$0.f5040c;
        ImageRequest imageRequestG = producerContext.g();
        producerContext.B(encodedImage.getImageFormat().f23632a, "image_format");
        Uri sourceUri = imageRequestG.getSourceUri();
        encodedImage.setSource(sourceUri != null ? sourceUri.toString() : null);
        DownsampleMode downsampleOverride = imageRequestG.getDownsampleOverride();
        if (downsampleOverride == null) {
            downsampleOverride = this$1.f5053e;
        }
        boolean zK = com.facebook.imagepipeline.producers.c.k(i7, 16);
        if ((downsampleOverride == DownsampleMode.f4828d || (downsampleOverride == DownsampleMode.f4829e && !zK)) && (this$1.f5054f || !v8.a.c(imageRequestG.getSourceUri()))) {
            RotationOptions rotationOptions = imageRequestG.getRotationOptions();
            Intrinsics.checkNotNullExpressionValue(rotationOptions, "getRotationOptions(...)");
            encodedImage.setSampleSize(l0.q(rotationOptions, imageRequestG.getResizeOptions(), encodedImage, i10));
        }
        ((ImagePipelineConfig) producerContext.l()).f4860u.getClass();
        int i11 = this$0.f5046i;
        String str2 = "unknown";
        ImageDecodeOptions imageDecodeOptions = this$0.f5043f;
        String str3 = "DecodeProducer";
        a1 a1Var2 = this$0.f5042e;
        if ((encodedImage.getImageFormat() != z9.b.f23618a && com.facebook.imagepipeline.producers.c.e(i7)) || this$0.f5044g || !EncodedImage.isValid(encodedImage)) {
            return;
        }
        if (Intrinsics.areEqual(encodedImage.getImageFormat(), z9.b.f23620c)) {
            if (((long) encodedImage.getWidth()) * ((long) encodedImage.getHeight()) * ((long) BitmapUtil.getPixelSizeForBitmapConfig(imageDecodeOptions.f4810a)) > 104857600) {
                int width = encodedImage.getWidth();
                int height = encodedImage.getHeight();
                Bitmap.Config config = imageDecodeOptions.f4810a;
                StringBuilder sbR = a3.e.r(width, "Image is too big to attempt decoding: w = ", height, ", h = ", ", pixel config = ");
                sbR.append(config);
                sbR.append(", max bitmap size = 104857600");
                IllegalStateException illegalStateException = new IllegalStateException(sbR.toString());
                a1Var2.k(producerContext, "DecodeProducer", illegalStateException, null);
                this$0.o(true);
                this$0.f5061b.onFailure(illegalStateException);
                return;
            }
        }
        z9.c imageFormat = encodedImage.getImageFormat();
        Intrinsics.checkNotNullExpressionValue(imageFormat, "getImageFormat(...)");
        String str4 = imageFormat.f23632a;
        String str5 = encodedImage.getWidth() + "x" + encodedImage.getHeight();
        String strValueOf = String.valueOf(encodedImage.getSampleSize());
        boolean zD = com.facebook.imagepipeline.producers.c.d(i7);
        boolean z5 = zD && !com.facebook.imagepipeline.producers.c.k(i7, 8);
        boolean zK2 = com.facebook.imagepipeline.producers.c.k(i7, 4);
        ResizeOptions resizeOptions = producerContext.g().getResizeOptions();
        if (resizeOptions != null) {
            str2 = resizeOptions.f4817a + "x" + resizeOptions.f4818b;
        }
        try {
            h0 h0Var = this$0.f5045h;
            synchronized (h0Var) {
                str = str2;
                j = h0Var.f4997i - h0Var.f4996h;
            }
            String string = producerContext.g().getSourceUri().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            int size = (z5 || zK2) ? encodedImage.getSize() : this$0.m(encodedImage);
            na.j jVarN = (z5 || zK2) ? na.j.f16536d : this$0.n();
            a1Var2.c(producerContext, "DecodeProducer");
            try {
                try {
                    Intrinsics.checkNotNull(jVarN);
                    try {
                        j5 = j;
                        try {
                            try {
                                try {
                                    cVarG = this$0.j.f5051c.g(encodedImage, size, jVarN, this$0.f5043f);
                                    try {
                                        int i12 = encodedImage.getSampleSize() != 1 ? i7 | 16 : i7;
                                        a1Var2.i(producerContext, "DecodeProducer", this$0.l(cVarG, j5, jVarN, zD, str4, str5, str, strValueOf));
                                        this$0.p(encodedImage, cVarG, i11);
                                        u4.b bVar2 = (u4.b) this$0.j.f5057i.f20946d;
                                        if (cVarG == null) {
                                            bVar = null;
                                        } else {
                                            ga.k kVar = CloseableReference.f4622w;
                                            bVar2.E();
                                            bVar = new r8.b(cVarG, kVar, bVar2, null, true);
                                        }
                                        try {
                                            this$0.o(com.facebook.imagepipeline.producers.c.d(i12));
                                            this$0.f5061b.b(i12, bVar);
                                            CloseableReference.l(bVar);
                                            EncodedImage.closeSafely(encodedImage);
                                        } catch (Throwable th2) {
                                            CloseableReference.l(bVar);
                                            throw th2;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        str3 = "DecodeProducer";
                                        jVarN = jVarN;
                                        str = str;
                                        zD = zD;
                                        a1Var = a1Var2;
                                        Intrinsics.checkNotNull(jVarN);
                                        a1Var.k(producerContext, str3, e, this$0.l(cVarG, j5, jVarN, zD, str4, str5, str, strValueOf));
                                        this$0.o(true);
                                        this$0.f5061b.onFailure(e);
                                        EncodedImage.closeSafely(encodedImage);
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    a1Var = a1Var2;
                                    cVar = null;
                                    cVarG = cVar;
                                    Intrinsics.checkNotNull(jVarN);
                                    a1Var.k(producerContext, str3, e, this$0.l(cVarG, j5, jVarN, zD, str4, str5, str, strValueOf));
                                    this$0.o(true);
                                    this$0.f5061b.onFailure(e);
                                    EncodedImage.closeSafely(encodedImage);
                                }
                            } catch (Exception e12) {
                                e = e12;
                                a1Var = a1Var2;
                            }
                        } catch (la.a e13) {
                            e = e13;
                            str3 = "DecodeProducer";
                            a1Var = a1Var2;
                            cVar = null;
                            try {
                                EncodedImage encodedImage2 = e.f14989d;
                                la.a aVar = e;
                                o8.a.x(this$0.f5041d, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", aVar.getMessage(), string, encodedImage2.getFirstBytesAsHexString(10), Integer.valueOf(encodedImage2.getSize()));
                                throw aVar;
                            } catch (Exception e14) {
                                e = e14;
                                cVarG = cVar;
                                Intrinsics.checkNotNull(jVarN);
                                a1Var.k(producerContext, str3, e, this$0.l(cVarG, j5, jVarN, zD, str4, str5, str, strValueOf));
                                this$0.o(true);
                                this$0.f5061b.onFailure(e);
                                EncodedImage.closeSafely(encodedImage);
                            }
                        }
                    } catch (Exception e15) {
                        e = e15;
                        j5 = j;
                        a1Var = a1Var2;
                    }
                } catch (la.a e16) {
                    e = e16;
                    j5 = j;
                }
            } catch (Exception e17) {
                e = e17;
                j5 = j;
                a1Var = a1Var2;
            }
        } catch (Throwable th3) {
            EncodedImage.closeSafely(encodedImage);
            throw th3;
        }
    }

    @Override // dc.b
    public Object execute() {
        k kVar = (k) this.f3105i;
        ((m) kVar.f3125w).J((vb.i) this.f3106v, this.f3104e + 1, false);
        return null;
    }

    @Override // je.j
    public void invoke(Object obj) {
        switch (this.f3103d) {
            case 2:
                Player.PositionInfo positionInfo = (Player.PositionInfo) this.f3105i;
                Player.PositionInfo positionInfo2 = (Player.PositionInfo) this.f3106v;
                com.google.android.exoplayer2.e eVar = (com.google.android.exoplayer2.e) obj;
                int i7 = this.f3104e;
                eVar.onPositionDiscontinuity(i7);
                eVar.onPositionDiscontinuity(positionInfo, positionInfo2, i7);
                break;
            default:
                ((hc.b) obj).onMediaItemTransition((AnalyticsListener$EventTime) this.f3105i, (MediaItem) this.f3106v, this.f3104e);
                break;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, int i7, int i10) {
        this.f3103d = i10;
        this.f3105i = obj;
        this.f3106v = obj2;
        this.f3104e = i7;
    }
}
