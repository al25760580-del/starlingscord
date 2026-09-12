package com.facebook.imagepipeline.image;

import android.graphics.ColorSpace;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.imageutils.ImageMetaData;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.WebpUtil;
import gn.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import n8.i;
import pa.q;
import q8.f;
import z9.b;
import z9.c;
import z9.d;

/* JADX INFO: loaded from: classes3.dex */
public class EncodedImage implements Closeable {
    public static final int DEFAULT_SAMPLE_SIZE = 1;
    public static final int UNKNOWN_HEIGHT = -1;
    public static final int UNKNOWN_ROTATION_ANGLE = -1;
    public static final int UNKNOWN_STREAM_SIZE = -1;
    public static final int UNKNOWN_WIDTH = -1;
    private static boolean sUseCachedMetadata;
    private BytesRange mBytesRange;
    private ColorSpace mColorSpace;
    private int mExifOrientation;
    private boolean mHasParsedMetadata;
    private int mHeight;
    private c mImageFormat;
    private final Supplier mInputStreamSupplier;
    private final CloseableReference mPooledByteBufferRef;
    private int mRotationAngle;
    private int mSampleSize;
    private String mSource;
    private int mStreamSize;
    private int mWidth;

    public EncodedImage(CloseableReference closeableReference) {
        this.mImageFormat = c.f23631c;
        this.mRotationAngle = -1;
        this.mExifOrientation = 0;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mSampleSize = 1;
        this.mStreamSize = -1;
        if (!CloseableReference.z(closeableReference)) {
            throw new IllegalArgumentException();
        }
        this.mPooledByteBufferRef = closeableReference.clone();
        this.mInputStreamSupplier = null;
    }

    public static EncodedImage cloneOrNull(EncodedImage encodedImage) {
        if (encodedImage != null) {
            return encodedImage.cloneOrNull();
        }
        return null;
    }

    public static void closeSafely(EncodedImage encodedImage) {
        if (encodedImage != null) {
            encodedImage.close();
        }
    }

    private void internalParseMetaData() throws Throwable {
        InputStream is2 = getInputStream();
        Object obj = d.f23634d;
        Intrinsics.checkNotNullParameter(is2, "is");
        try {
            c imageFormat = h.A(is2);
            this.mImageFormat = imageFormat;
            c cVar = b.f23618a;
            Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
            Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
            Pair<Integer, Integer> webPImageSize = ((imageFormat == b.f23623f || imageFormat == b.f23624g || imageFormat == b.f23625h || imageFormat == b.f23626i) || imageFormat == b.j) ? readWebPImageSize() : readImageMetaData().getDimensions();
            if (imageFormat == b.f23618a && this.mRotationAngle == -1) {
                if (webPImageSize != null) {
                    int orientation = JfifUtil.getOrientation(getInputStream());
                    this.mExifOrientation = orientation;
                    this.mRotationAngle = JfifUtil.getAutoRotateAngleFromOrientation(orientation);
                    return;
                }
                return;
            }
            if (imageFormat == b.k && this.mRotationAngle == -1) {
                int orientation2 = HeifExifUtil.getOrientation(getInputStream());
                this.mExifOrientation = orientation2;
                this.mRotationAngle = JfifUtil.getAutoRotateAngleFromOrientation(orientation2);
            } else if (this.mRotationAngle == -1) {
                this.mRotationAngle = 0;
            }
        } catch (IOException e10) {
            i.h(e10);
            throw null;
        }
    }

    public static boolean isMetaDataAvailable(EncodedImage encodedImage) {
        return encodedImage.mRotationAngle >= 0 && encodedImage.mWidth >= 0 && encodedImage.mHeight >= 0;
    }

    private void parseMetadataIfNeeded() throws Throwable {
        if (this.mWidth < 0 || this.mHeight < 0) {
            parseMetaData();
        }
    }

    private ImageMetaData readImageMetaData() throws Throwable {
        InputStream inputStream;
        try {
            inputStream = getInputStream();
            try {
                ImageMetaData imageMetaDataDecodeDimensionsAndColorSpace = BitmapUtil.decodeDimensionsAndColorSpace(inputStream);
                this.mColorSpace = imageMetaDataDecodeDimensionsAndColorSpace.getColorSpace();
                Pair<Integer, Integer> dimensions = imageMetaDataDecodeDimensionsAndColorSpace.getDimensions();
                if (dimensions != null) {
                    this.mWidth = ((Integer) dimensions.f14612d).intValue();
                    this.mHeight = ((Integer) dimensions.f14613e).intValue();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return imageMetaDataDecodeDimensionsAndColorSpace;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    private Pair<Integer, Integer> readWebPImageSize() {
        InputStream inputStream = getInputStream();
        if (inputStream == null) {
            return null;
        }
        Pair<Integer, Integer> size = WebpUtil.getSize(inputStream);
        if (size != null) {
            this.mWidth = ((Integer) size.f14612d).intValue();
            this.mHeight = ((Integer) size.f14613e).intValue();
        }
        return size;
    }

    public static void setUseCachedMetadata(boolean z5) {
        sUseCachedMetadata = z5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CloseableReference.l(this.mPooledByteBufferRef);
    }

    public void copyMetaDataFrom(EncodedImage encodedImage) {
        this.mImageFormat = encodedImage.getImageFormat();
        this.mWidth = encodedImage.getWidth();
        this.mHeight = encodedImage.getHeight();
        this.mRotationAngle = encodedImage.getRotationAngle();
        this.mExifOrientation = encodedImage.getExifOrientation();
        this.mSampleSize = encodedImage.getSampleSize();
        this.mStreamSize = encodedImage.getSize();
        this.mBytesRange = encodedImage.getBytesRange();
        this.mColorSpace = encodedImage.getColorSpace();
        this.mHasParsedMetadata = encodedImage.hasParsedMetaData();
    }

    public CloseableReference getByteBufferRef() {
        return CloseableReference.g(this.mPooledByteBufferRef);
    }

    public BytesRange getBytesRange() {
        return this.mBytesRange;
    }

    public ColorSpace getColorSpace() throws Throwable {
        parseMetadataIfNeeded();
        return this.mColorSpace;
    }

    public int getExifOrientation() throws Throwable {
        parseMetadataIfNeeded();
        return this.mExifOrientation;
    }

    public String getFirstBytesAsHexString(int i7) {
        CloseableReference byteBufferRef = getByteBufferRef();
        if (byteBufferRef == null) {
            return "";
        }
        int iMin = Math.min(getSize(), i7);
        byte[] bArr = new byte[iMin];
        try {
            ((q) byteBufferRef.q()).l(0, 0, iMin, bArr);
            byteBufferRef.close();
            StringBuilder sb2 = new StringBuilder(iMin * 2);
            for (int i10 = 0; i10 < iMin; i10++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i10])));
            }
            return sb2.toString();
        } catch (Throwable th2) {
            byteBufferRef.close();
            throw th2;
        }
    }

    public int getHeight() throws Throwable {
        parseMetadataIfNeeded();
        return this.mHeight;
    }

    public c getImageFormat() throws Throwable {
        parseMetadataIfNeeded();
        return this.mImageFormat;
    }

    public InputStream getInputStream() {
        Supplier supplier = this.mInputStreamSupplier;
        if (supplier != null) {
            return (InputStream) supplier.get();
        }
        CloseableReference closeableReferenceG = CloseableReference.g(this.mPooledByteBufferRef);
        if (closeableReferenceG == null) {
            return null;
        }
        try {
            return new f((q) closeableReferenceG.q());
        } finally {
            closeableReferenceG.close();
        }
    }

    public InputStream getInputStreamOrThrow() {
        InputStream inputStream = getInputStream();
        inputStream.getClass();
        return inputStream;
    }

    public int getRotationAngle() {
        parseMetadataIfNeeded();
        return this.mRotationAngle;
    }

    public int getSampleSize() {
        return this.mSampleSize;
    }

    public int getSize() {
        CloseableReference closeableReference = this.mPooledByteBufferRef;
        if (closeableReference == null) {
            return this.mStreamSize;
        }
        closeableReference.q();
        return ((q) this.mPooledByteBufferRef.q()).n();
    }

    public String getSource() {
        return this.mSource;
    }

    public synchronized r8.d getUnderlyingReferenceTestOnly() {
        r8.d dVar;
        CloseableReference closeableReference = this.mPooledByteBufferRef;
        if (closeableReference != null) {
            synchronized (closeableReference) {
                dVar = closeableReference.f4625e;
            }
        } else {
            dVar = null;
        }
        return dVar;
    }

    public int getWidth() throws Throwable {
        parseMetadataIfNeeded();
        return this.mWidth;
    }

    public boolean hasParsedMetaData() {
        return this.mHasParsedMetadata;
    }

    public boolean isCompleteAt(int i7) {
        c cVar = this.mImageFormat;
        if ((cVar != b.f23618a && cVar != b.f23627l) || this.mInputStreamSupplier != null) {
            return true;
        }
        this.mPooledByteBufferRef.getClass();
        q qVar = (q) this.mPooledByteBufferRef.q();
        return i7 >= 2 && qVar.i(i7 + (-2)) == -1 && qVar.i(i7 - 1) == -39;
    }

    public synchronized boolean isValid() {
        return CloseableReference.z(this.mPooledByteBufferRef) || this.mInputStreamSupplier != null;
    }

    public void parseMetaData() throws Throwable {
        if (!sUseCachedMetadata) {
            internalParseMetaData();
        } else {
            if (this.mHasParsedMetadata) {
                return;
            }
            internalParseMetaData();
            this.mHasParsedMetadata = true;
        }
    }

    public void setBytesRange(BytesRange bytesRange) {
        this.mBytesRange = bytesRange;
    }

    public void setExifOrientation(int i7) {
        this.mExifOrientation = i7;
    }

    public void setHeight(int i7) {
        this.mHeight = i7;
    }

    public void setImageFormat(c cVar) {
        this.mImageFormat = cVar;
    }

    public void setRotationAngle(int i7) {
        this.mRotationAngle = i7;
    }

    public void setSampleSize(int i7) {
        this.mSampleSize = i7;
    }

    public void setSource(String str) {
        this.mSource = str;
    }

    public void setStreamSize(int i7) {
        this.mStreamSize = i7;
    }

    public void setWidth(int i7) {
        this.mWidth = i7;
    }

    public static boolean isValid(EncodedImage encodedImage) {
        return encodedImage != null && encodedImage.isValid();
    }

    public EncodedImage cloneOrNull() {
        EncodedImage encodedImage;
        Supplier supplier = this.mInputStreamSupplier;
        if (supplier != null) {
            encodedImage = new EncodedImage(supplier, this.mStreamSize);
        } else {
            CloseableReference closeableReferenceG = CloseableReference.g(this.mPooledByteBufferRef);
            if (closeableReferenceG == null) {
                encodedImage = null;
            } else {
                try {
                    encodedImage = new EncodedImage(closeableReferenceG);
                } catch (Throwable th2) {
                    closeableReferenceG.close();
                    throw th2;
                }
            }
            CloseableReference.l(closeableReferenceG);
        }
        if (encodedImage != null) {
            encodedImage.copyMetaDataFrom(this);
        }
        return encodedImage;
    }

    public EncodedImage(Supplier supplier) {
        this.mImageFormat = c.f23631c;
        this.mRotationAngle = -1;
        this.mExifOrientation = 0;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mSampleSize = 1;
        this.mStreamSize = -1;
        supplier.getClass();
        this.mPooledByteBufferRef = null;
        this.mInputStreamSupplier = supplier;
    }

    public EncodedImage(Supplier supplier, int i7) {
        this(supplier);
        this.mStreamSize = i7;
    }
}
