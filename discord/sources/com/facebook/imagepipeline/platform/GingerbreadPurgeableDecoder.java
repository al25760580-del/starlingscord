package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import n8.c;
import n8.i;
import pa.q;
import q8.f;
import w8.a;

/* JADX INFO: loaded from: classes3.dex */
@c
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f4929d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebpBitmapFactoryImpl f4930c;

    @c
    public GingerbreadPurgeableDecoder() {
        WebpBitmapFactoryImpl webpBitmapFactoryImpl = null;
        if (!a.f22070a) {
            try {
                webpBitmapFactoryImpl = (WebpBitmapFactoryImpl) WebpBitmapFactoryImpl.class.newInstance();
            } catch (Throwable unused) {
            }
            a.f22070a = true;
        }
        this.f4930c = webpBitmapFactoryImpl;
    }

    public static MemoryFile g(CloseableReference closeableReference, int i7, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        t8.a aVar;
        f fVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i7);
        memoryFile.allowPurging(false);
        try {
            f fVar2 = new f((q) closeableReference.q());
            try {
                aVar = new t8.a(fVar2, i7);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    outputStream2.getClass();
                    byte[] bArr2 = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
                    while (true) {
                        int i10 = aVar.read(bArr2);
                        if (i10 == -1) {
                            break;
                        }
                        outputStream2.write(bArr2, 0, i10);
                    }
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i7, bArr.length);
                    }
                    closeableReference.close();
                    n8.a.b(fVar2);
                    n8.a.b(aVar);
                    n8.a.a(outputStream2);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = outputStream2;
                    fVar = fVar2;
                    closeableReference.close();
                    n8.a.b(fVar);
                    n8.a.b(aVar);
                    n8.a.a(outputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                aVar = null;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
            aVar = null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap c(CloseableReference closeableReference, BitmapFactory.Options options) {
        return h(closeableReference, ((q) closeableReference.q()).n(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap d(CloseableReference closeableReference, int i7, BitmapFactory.Options options) {
        return h(closeableReference, i7, DalvikPurgeableDecoder.e(i7, closeableReference) ? null : DalvikPurgeableDecoder.f4913b, options);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap h(CloseableReference closeableReference, int i7, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFile = 0;
        try {
            try {
                MemoryFile memoryFileG = g(closeableReference, i7, bArr);
                try {
                    FileDescriptor fileDescriptorI = i(memoryFileG);
                    if (this.f4930c == null) {
                        throw new IllegalStateException("WebpBitmapFactory is null");
                    }
                    Bitmap bitmapHookDecodeFileDescriptor = WebpBitmapFactoryImpl.hookDecodeFileDescriptor(fileDescriptorI, null, options);
                    i.d(bitmapHookDecodeFileDescriptor, "BitmapFactory returned null");
                    memoryFileG.close();
                    return bitmapHookDecodeFileDescriptor;
                } catch (IOException e10) {
                    e = e10;
                    i.h(e);
                    throw null;
                }
            } catch (Throwable th2) {
                th = th2;
                memoryFile = closeableReference;
                if (memoryFile != 0) {
                    memoryFile.close();
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (Throwable th3) {
            th = th3;
            if (memoryFile != 0) {
                memoryFile.close();
            }
            throw th;
        }
    }

    public final FileDescriptor i(MemoryFile memoryFile) throws Throwable {
        Method method;
        try {
            synchronized (this) {
                if (f4929d == null) {
                    try {
                        f4929d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
                    } catch (Exception e10) {
                        i.h(e10);
                        throw null;
                    }
                }
                method = f4929d;
            }
            Object objInvoke = method.invoke(memoryFile, null);
            objInvoke.getClass();
            return (FileDescriptor) objInvoke;
        } catch (Exception e11) {
            i.h(e11);
            throw null;
        }
    }
}
