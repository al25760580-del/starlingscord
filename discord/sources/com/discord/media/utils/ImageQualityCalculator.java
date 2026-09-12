package com.discord.media.utils;

import a3.e;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ar.b0;
import ar.k0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lo.j;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;
import zn.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u00014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0017J \u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001bJ(\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0002J(\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0002J \u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0002J(\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0002JH\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010 \u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0002J\u0012\u0010/\u001a\u0004\u0018\u00010\u00192\u0006\u00100\u001a\u00020\u0015H\u0002J \u00101\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0002J\u0010\u00103\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/discord/media/utils/ImageQualityCalculator;", "", "<init>", "()V", "SSIM_C1", "", "SSIM_C2", "SSIM_WINDOW_SIZE", "", "SSIM_WINDOW_STRIDE", "RGB_TO_GRAYSCALE_RED_WEIGHT", "RGB_TO_GRAYSCALE_GREEN_WEIGHT", "RGB_TO_GRAYSCALE_BLUE_WEIGHT", "MAX_PROCESSING_DIMENSION", "MAX_PIXEL_VALUE_8BIT", "", "PSNR_DECIBEL_COEFFICIENT", "RGB_CHANNEL_COUNT", "calculateQualityMetrics", "Lcom/discord/media/utils/ImageQualityCalculator$ImageQualityMetrics;", "originalData", "", "compressedData", "([B[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "originalBitmap", "Landroid/graphics/Bitmap;", "compressedBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculatePSNR", "originalPixels", "", "compressedPixels", "width", "height", "calculateSSIM", "convertToGrayscale", "", "pixels", "calculateSSIMFromGrayscale", "original", "compressed", "calculateWindowSSIM", "startX", "startY", "windowSize", "c1", "c2", "decodeByteArraySafely", "data", "calculateInSampleSize", "maxDimension", "unpremultiplyPixels", "ImageQualityMetrics", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageQualityCalculator {

    @NotNull
    public static final ImageQualityCalculator INSTANCE = new ImageQualityCalculator();
    private static final double MAX_PIXEL_VALUE_8BIT = 255.0d;
    private static final int MAX_PROCESSING_DIMENSION = 4096;
    private static final double PSNR_DECIBEL_COEFFICIENT = 20.0d;
    private static final int RGB_CHANNEL_COUNT = 3;
    private static final float RGB_TO_GRAYSCALE_BLUE_WEIGHT = 0.114f;
    private static final float RGB_TO_GRAYSCALE_GREEN_WEIGHT = 0.587f;
    private static final float RGB_TO_GRAYSCALE_RED_WEIGHT = 0.299f;
    private static final float SSIM_C1 = 6.5025f;
    private static final float SSIM_C2 = 58.5225f;
    private static final int SSIM_WINDOW_SIZE = 8;
    private static final int SSIM_WINDOW_STRIDE = 4;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/discord/media/utils/ImageQualityCalculator$ImageQualityMetrics;", "", "psnr", "", "ssim", "psnrCalculationTimeMs", "", "ssimCalculationTimeMs", "<init>", "(DDJJ)V", "getPsnr", "()D", "getSsim", "getPsnrCalculationTimeMs", "()J", "getSsimCalculationTimeMs", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImageQualityMetrics {
        private final double psnr;
        private final long psnrCalculationTimeMs;
        private final double ssim;
        private final long ssimCalculationTimeMs;

        public ImageQualityMetrics(double d6, double d7, long j, long j5) {
            this.psnr = d6;
            this.ssim = d7;
            this.psnrCalculationTimeMs = j;
            this.ssimCalculationTimeMs = j5;
        }

        public static /* synthetic */ ImageQualityMetrics copy$default(ImageQualityMetrics imageQualityMetrics, double d6, double d7, long j, long j5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                d6 = imageQualityMetrics.psnr;
            }
            double d8 = d6;
            if ((i7 & 2) != 0) {
                d7 = imageQualityMetrics.ssim;
            }
            double d9 = d7;
            if ((i7 & 4) != 0) {
                j = imageQualityMetrics.psnrCalculationTimeMs;
            }
            return imageQualityMetrics.copy(d8, d9, j, (i7 & 8) != 0 ? imageQualityMetrics.ssimCalculationTimeMs : j5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getPsnr() {
            return this.psnr;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getSsim() {
            return this.ssim;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getPsnrCalculationTimeMs() {
            return this.psnrCalculationTimeMs;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getSsimCalculationTimeMs() {
            return this.ssimCalculationTimeMs;
        }

        @NotNull
        public final ImageQualityMetrics copy(double psnr, double ssim, long psnrCalculationTimeMs, long ssimCalculationTimeMs) {
            return new ImageQualityMetrics(psnr, ssim, psnrCalculationTimeMs, ssimCalculationTimeMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageQualityMetrics)) {
                return false;
            }
            ImageQualityMetrics imageQualityMetrics = (ImageQualityMetrics) other;
            return Double.compare(this.psnr, imageQualityMetrics.psnr) == 0 && Double.compare(this.ssim, imageQualityMetrics.ssim) == 0 && this.psnrCalculationTimeMs == imageQualityMetrics.psnrCalculationTimeMs && this.ssimCalculationTimeMs == imageQualityMetrics.ssimCalculationTimeMs;
        }

        public final double getPsnr() {
            return this.psnr;
        }

        public final long getPsnrCalculationTimeMs() {
            return this.psnrCalculationTimeMs;
        }

        public final double getSsim() {
            return this.ssim;
        }

        public final long getSsimCalculationTimeMs() {
            return this.ssimCalculationTimeMs;
        }

        public int hashCode() {
            return Long.hashCode(this.ssimCalculationTimeMs) + com.discord.chat.presentation.list.a.h(this.psnrCalculationTimeMs, com.discord.chat.presentation.list.a.d(Double.hashCode(this.psnr) * 31, this.ssim, 31), 31);
        }

        @NotNull
        public String toString() {
            double d6 = this.psnr;
            double d7 = this.ssim;
            long j = this.psnrCalculationTimeMs;
            long j5 = this.ssimCalculationTimeMs;
            StringBuilder sb2 = new StringBuilder("ImageQualityMetrics(psnr=");
            sb2.append(d6);
            sb2.append(", ssim=");
            sb2.append(d7);
            sb2.append(", psnrCalculationTimeMs=");
            sb2.append(j);
            sb2.append(", ssimCalculationTimeMs=");
            return e.n(sb2, j5, ")");
        }
    }

    /* JADX INFO: renamed from: com.discord.media.utils.ImageQualityCalculator$calculateQualityMetrics$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/discord/media/utils/ImageQualityCalculator$ImageQualityMetrics;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.utils.ImageQualityCalculator$calculateQualityMetrics$2", f = "ImageQualityCalculator.kt", l = {135}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ byte[] $compressedData;
        final /* synthetic */ byte[] $originalData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(byte[] bArr, byte[] bArr2, Continuation continuation) {
            super(2, continuation);
            this.$originalData = bArr;
            this.$compressedData = bArr2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$originalData, this.$compressedData, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            try {
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return obj;
                }
                ib.a.L(obj);
                ImageQualityCalculator imageQualityCalculator = ImageQualityCalculator.INSTANCE;
                Bitmap bitmapDecodeByteArraySafely = imageQualityCalculator.decodeByteArraySafely(this.$originalData);
                Bitmap bitmapDecodeByteArraySafely2 = imageQualityCalculator.decodeByteArraySafely(this.$compressedData);
                if (bitmapDecodeByteArraySafely != null && bitmapDecodeByteArraySafely2 != null) {
                    this.label = 1;
                    Object objCalculateQualityMetrics = imageQualityCalculator.calculateQualityMetrics(bitmapDecodeByteArraySafely, bitmapDecodeByteArraySafely2, this);
                    return objCalculateQualityMetrics == aVar ? aVar : objCalculateQualityMetrics;
                }
                return null;
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media.utils.ImageQualityCalculator$calculateQualityMetrics$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/discord/media/utils/ImageQualityCalculator$ImageQualityMetrics;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.media.utils.ImageQualityCalculator$calculateQualityMetrics$4", f = "ImageQualityCalculator.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Bitmap $compressedBitmap;
        final /* synthetic */ Bitmap $originalBitmap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Bitmap bitmap, Bitmap bitmap2, Continuation continuation) {
            super(2, continuation);
            this.$originalBitmap = bitmap;
            this.$compressedBitmap = bitmap2;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass4(this.$originalBitmap, this.$compressedBitmap, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            try {
                if (this.$originalBitmap.getWidth() == this.$compressedBitmap.getWidth() && this.$originalBitmap.getHeight() == this.$compressedBitmap.getHeight()) {
                    int width = this.$originalBitmap.getWidth();
                    int height = this.$originalBitmap.getHeight();
                    int i7 = width * height;
                    int[] iArr = new int[i7];
                    int[] iArr2 = new int[i7];
                    this.$originalBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    this.$compressedBitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
                    int[] iArrUnpremultiplyPixels = this.$originalBitmap.isPremultiplied() ? ImageQualityCalculator.INSTANCE.unpremultiplyPixels(iArr) : iArr;
                    int[] iArrUnpremultiplyPixels2 = this.$compressedBitmap.isPremultiplied() ? ImageQualityCalculator.INSTANCE.unpremultiplyPixels(iArr2) : iArr2;
                    long jNanoTime = System.nanoTime();
                    ImageQualityCalculator imageQualityCalculator = ImageQualityCalculator.INSTANCE;
                    return new ImageQualityMetrics(imageQualityCalculator.calculatePSNR(iArrUnpremultiplyPixels, iArrUnpremultiplyPixels2, width, height), imageQualityCalculator.calculateSSIM(iArrUnpremultiplyPixels, iArrUnpremultiplyPixels2, width, height), (System.nanoTime() - jNanoTime) / 1000000, (System.nanoTime() - System.nanoTime()) / 1000000);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    private ImageQualityCalculator() {
    }

    private final int calculateInSampleSize(int width, int height, int maxDimension) {
        int i7 = 1;
        if (height <= maxDimension && width <= maxDimension) {
            return 1;
        }
        int i10 = height / 2;
        int i11 = width / 2;
        while (i10 / i7 >= maxDimension && i11 / i7 >= maxDimension) {
            i7 *= 2;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double calculatePSNR(int[] originalPixels, int[] compressedPixels, int width, int height) {
        int i7 = width * height;
        double d6 = 0.0d;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = originalPixels[i10];
            int i12 = compressedPixels[i10];
            double d7 = ((i11 >> 16) & 255) - ((i12 >> 16) & 255);
            double d8 = ((i11 >> 8) & 255) - ((i12 >> 8) & 255);
            double d9 = (i11 & 255) - (i12 & 255);
            d6 += (d9 * d9) + (d8 * d8) + (d7 * d7);
        }
        double d10 = d6 / (((double) i7) * 3.0d);
        if (d10 == 0.0d) {
            return Double.POSITIVE_INFINITY;
        }
        return Math.log10(MAX_PIXEL_VALUE_8BIT / Math.sqrt(d10)) * PSNR_DECIBEL_COEFFICIENT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double calculateSSIM(int[] originalPixels, int[] compressedPixels, int width, int height) {
        return calculateSSIMFromGrayscale(convertToGrayscale(originalPixels, width, height), convertToGrayscale(compressedPixels, width, height), width, height);
    }

    private final double calculateSSIMFromGrayscale(float[] original, float[] compressed, int width, int height) {
        double d6;
        int i7;
        int i10 = 0;
        int iA = c.a(0, height - 8, 4);
        if (iA >= 0) {
            int i11 = 0;
            int i12 = 0;
            d6 = 0.0d;
            while (true) {
                int iA2 = c.a(i10, width - 8, 4);
                if (iA2 >= 0) {
                    int i13 = i10;
                    while (true) {
                        int i14 = iA2;
                        double dCalculateWindowSSIM = calculateWindowSSIM(original, compressed, width, i13, i12, 8, SSIM_C1, SSIM_C2);
                        if (Math.abs(dCalculateWindowSSIM) <= Double.MAX_VALUE) {
                            d6 += dCalculateWindowSSIM;
                            i11++;
                        }
                        if (i13 == i14) {
                            break;
                        }
                        i13 += 4;
                        iA2 = i14;
                    }
                }
                if (i12 == iA) {
                    break;
                }
                i12 += 4;
                i10 = 0;
            }
            i7 = i11;
        } else {
            d6 = 0.0d;
            i7 = 0;
        }
        if (i7 > 0) {
            return d6 / ((double) i7);
        }
        return 0.0d;
    }

    private final double calculateWindowSSIM(float[] original, float[] compressed, int width, int startX, int startY, int windowSize, float c8, float c10) {
        int i7 = windowSize * windowSize;
        int i10 = 0;
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        double d9 = 0.0d;
        double d10 = 0.0d;
        while (i10 < windowSize) {
            int i11 = 0;
            while (i11 < windowSize) {
                int i12 = startX + i11 + ((startY + i10) * width);
                double d11 = original[i12];
                float f2 = compressed[i12];
                int i13 = i11;
                double d12 = f2;
                d6 += d11;
                d7 += d12;
                d8 = (d11 * d11) + d8;
                d9 = (d12 * d12) + d9;
                d10 += d11 * d12;
                i11 = i13 + 1;
                i10 = i10;
            }
            i10++;
        }
        double d13 = i7;
        double d14 = d6 / d13;
        double d15 = d7 / d13;
        double d16 = (d8 - (d6 * d14)) / d13;
        double d17 = (d9 - (d7 * d15)) / d13;
        double d18 = (d10 - (d6 * d15)) / d13;
        double d19 = c8;
        double d20 = c10;
        double d21 = ((d18 * 2.0d) + d20) * ((d14 * 2.0d * d15) + d19);
        double d22 = (d16 + d17 + d20) * ((d15 * d15) + (d14 * d14) + d19);
        if (d22 > 0.0d) {
            return d21 / d22;
        }
        return 0.0d;
    }

    private final float[] convertToGrayscale(int[] pixels, int width, int height) {
        int i7 = width * height;
        float[] fArr = new float[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = pixels[i10];
            fArr[i10] = ((i11 & 255) * RGB_TO_GRAYSCALE_BLUE_WEIGHT) + (((i11 >> 8) & 255) * RGB_TO_GRAYSCALE_GREEN_WEIGHT) + (((i11 >> 16) & 255) * RGB_TO_GRAYSCALE_RED_WEIGHT);
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap decodeByteArraySafely(byte[] data) {
        int i7;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(data, 0, data.length, options);
            int i10 = options.outWidth;
            if (i10 > 0 && (i7 = options.outHeight) > 0) {
                int iCalculateInSampleSize = calculateInSampleSize(i10, i7, 4096);
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = iCalculateInSampleSize;
                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options2.inPremultiplied = false;
                options2.inScaled = false;
                return BitmapFactory.decodeByteArray(data, 0, data.length, options2);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] unpremultiplyPixels(int[] pixels) {
        int[] iArr = new int[pixels.length];
        int length = pixels.length;
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = pixels[i7];
            int i11 = (i10 >> 24) & 255;
            if (i11 == 0) {
                iArr[i7] = 0;
            } else if (i11 != 255) {
                iArr[i7] = j.d(((i10 & 255) * 255) / i11, 0, 255) | (i11 << 24) | (j.d((((i10 >> 16) & 255) * 255) / i11, 0, 255) << 16) | (j.d((((i10 >> 8) & 255) * 255) / i11, 0, 255) << 8);
            } else {
                iArr[i7] = i10;
            }
        }
        return iArr;
    }

    public final Object calculateQualityMetrics(@NotNull Bitmap bitmap, @NotNull Bitmap bitmap2, @NotNull Continuation continuation) {
        return b0.A(k0.f2938a, new AnonymousClass4(bitmap, bitmap2, null), continuation);
    }

    public final Object calculateQualityMetrics(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull Continuation continuation) {
        return b0.A(k0.f2938a, new AnonymousClass2(bArr, bArr2, null), continuation);
    }
}
