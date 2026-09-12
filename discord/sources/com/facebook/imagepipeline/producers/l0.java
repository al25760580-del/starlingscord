package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.JfifUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends e1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ImageRequest f5028x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m0 f5029y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, Consumer consumer, a1 a1Var, ProducerContext producerContext, ImageRequest imageRequest) {
        super(consumer, a1Var, producerContext, "LocalExifThumbnailProducer");
        this.f5029y = m0Var;
        this.f5028x = imageRequest;
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public final void b(Object obj) {
        EncodedImage.closeSafely((EncodedImage) obj);
    }

    @Override // com.facebook.imagepipeline.producers.e1
    public final Map c(Object obj) {
        return n8.e.a("createdThumbnail", Boolean.toString(((EncodedImage) obj) != null));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    @Override // com.facebook.imagepipeline.producers.e1
    public final Object d() {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        ExifInterface exifInterface;
        Uri sourceUri = this.f5028x.getSourceUri();
        m0 m0Var = this.f5029y;
        ContentResolver contentResolver = m0Var.f5032c;
        String strA = v8.a.a(contentResolver, sourceUri);
        if (strA == null) {
            exifInterface = null;
        } else {
            try {
                File file = new File(strA);
                if (file.exists() && file.canRead()) {
                    exifInterface = new ExifInterface(strA);
                } else {
                    if ("content".equals(v8.a.b(sourceUri))) {
                        try {
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(sourceUri, "r");
                        } catch (FileNotFoundException unused) {
                            assetFileDescriptorOpenAssetFileDescriptor = null;
                        }
                    } else {
                        assetFileDescriptorOpenAssetFileDescriptor = null;
                    }
                    if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                        ExifInterface exifInterface2 = new ExifInterface(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                        exifInterface = exifInterface2;
                    } else {
                        exifInterface = null;
                    }
                }
            } catch (IOException unused2) {
            } catch (StackOverflowError unused3) {
                o8.a.d(m0.class, "StackOverflowError in ExifInterface constructor");
            }
        }
        if (exifInterface == null || !exifInterface.hasThumbnail()) {
            return null;
        }
        byte[] bytes = exifInterface.getThumbnail();
        bytes.getClass();
        e4.e eVar = m0Var.f5031b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        pa.r rVar = new pa.r((pa.p) eVar.f7971e, bytes.length);
        try {
            try {
                rVar.write(bytes, 0, bytes.length);
                pa.q qVarF = rVar.f();
                rVar.close();
                Pair<Integer, Integer> pairDecodeDimensions = BitmapUtil.decodeDimensions(new q8.f(qVarF));
                String attribute = exifInterface.getAttribute("Orientation");
                attribute.getClass();
                int autoRotateAngleFromOrientation = JfifUtil.getAutoRotateAngleFromOrientation(Integer.parseInt(attribute));
                int iIntValue = pairDecodeDimensions != null ? ((Integer) pairDecodeDimensions.first).intValue() : -1;
                int iIntValue2 = pairDecodeDimensions != null ? ((Integer) pairDecodeDimensions.second).intValue() : -1;
                r8.b bVarB = CloseableReference.B(qVarF);
                try {
                    EncodedImage encodedImage = new EncodedImage(bVarB);
                    CloseableReference.l(bVarB);
                    encodedImage.setImageFormat(z9.b.f23618a);
                    encodedImage.setRotationAngle(autoRotateAngleFromOrientation);
                    encodedImage.setWidth(iIntValue);
                    encodedImage.setHeight(iIntValue2);
                    return encodedImage;
                } catch (Throwable th2) {
                    CloseableReference.l(bVarB);
                    throw th2;
                }
            } catch (Throwable th3) {
                rVar.close();
                throw th3;
            }
        } catch (IOException e10) {
            n8.i.h(e10);
            throw null;
        }
    }
}
