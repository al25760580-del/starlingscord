package qa;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import io.sentry.hints.j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import pa.e;
import pa.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f18671d = {-1, -39};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f18672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PreverificationHelper f18673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1.b f18674c;

    public b(e eVar, k1.b bVar, q8.c cVar) {
        this.f18673b = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f18672a = eVar;
        if (eVar instanceof l) {
            cVar.getClass();
        }
        this.f18674c = bVar;
    }

    public static BitmapFactory.Options e(EncodedImage encodedImage, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = encodedImage.getSampleSize();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z5 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z5) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        BitmapFactory.decodeStream(encodedImage.getInputStream(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        if (z5) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // qa.d
    public final CloseableReference a(EncodedImage encodedImage, Bitmap.Config config) {
        BitmapFactory.Options optionsE = e(encodedImage, config);
        boolean z5 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream inputStream = encodedImage.getInputStream();
            inputStream.getClass();
            return c(inputStream, optionsE, null);
        } catch (RuntimeException e10) {
            if (z5) {
                return a(encodedImage, Bitmap.Config.ARGB_8888);
            }
            throw e10;
        }
    }

    @Override // qa.d
    public final CloseableReference b(EncodedImage encodedImage, Bitmap.Config config, int i7, ColorSpace colorSpace) {
        boolean zIsCompleteAt = encodedImage.isCompleteAt(i7);
        BitmapFactory.Options optionsE = e(encodedImage, config);
        InputStream inputStream = encodedImage.getInputStream();
        inputStream.getClass();
        if (encodedImage.getSize() > i7) {
            inputStream = new t8.a(inputStream, i7);
        }
        if (!zIsCompleteAt) {
            inputStream = new t8.b(inputStream, f18671d);
        }
        boolean z5 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                r8.b bVarC = c(inputStream, optionsE, colorSpace);
                try {
                    inputStream.close();
                    return bVarC;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    return bVarC;
                }
            } catch (RuntimeException e11) {
                if (!z5) {
                    throw e11;
                }
                CloseableReference closeableReferenceB = b(encodedImage, Bitmap.Config.ARGB_8888, i7, colorSpace);
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
                return closeableReferenceB;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            throw th2;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final r8.b c(InputStream inputStream, BitmapFactory.Options options, ColorSpace colorSpace) {
        Bitmap bitmap;
        PreverificationHelper preverificationHelper;
        i8.b bVar = CloseableReference.f4623x;
        int i7 = options.outWidth;
        int i10 = options.outHeight;
        int i11 = Build.VERSION.SDK_INT;
        e eVar = this.f18672a;
        if (i11 < 26 || (preverificationHelper = this.f18673b) == null || !preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig)) {
            bitmap = (Bitmap) eVar.get(d(i7, i10, options));
            if (bitmap == null) {
                throw new NullPointerException("BitmapPool.get returned null");
            }
        } else {
            options.inMutable = false;
            bitmap = null;
        }
        options.inBitmap = bitmap;
        if (i11 >= 26) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
        k1.b bVar2 = this.f18674c;
        ByteBuffer byteBufferAllocate = (ByteBuffer) bVar2.acquire();
        if (byteBufferAllocate == null) {
            hs.c cVar = q8.a.f18629a;
            byteBufferAllocate = ByteBuffer.allocate(16384);
        }
        try {
            try {
                try {
                    options.inTempStorage = byteBufferAllocate.array();
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    bVar2.release(byteBufferAllocate);
                    if (bitmap == null || bitmap == bitmapDecodeStream) {
                        return CloseableReference.O(bitmapDecodeStream, eVar, bVar);
                    }
                    eVar.release(bitmap);
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.recycle();
                    }
                    throw new IllegalStateException();
                } catch (IllegalArgumentException e10) {
                    if (bitmap != null) {
                        eVar.release(bitmap);
                    }
                    try {
                        inputStream.reset();
                        Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                        if (bitmapDecodeStream2 == null) {
                            throw e10;
                        }
                        r8.b bVarO = CloseableReference.O(bitmapDecodeStream2, j.C(), bVar);
                        bVar2.release(byteBufferAllocate);
                        return bVarO;
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (RuntimeException e11) {
                if (bitmap != null) {
                    eVar.release(bitmap);
                }
                throw e11;
            }
        } catch (Throwable th2) {
            bVar2.release(byteBufferAllocate);
            throw th2;
        }
    }

    public abstract int d(int i7, int i10, BitmapFactory.Options options);
}
