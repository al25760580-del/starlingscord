package ba;

import com.facebook.animated.gif.GifImage;
import com.facebook.animated.webp.WebPImage;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.google.firebase.messaging.r;
import e4.i;
import java.util.ArrayList;
import ph.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3085b;

    static {
        a aVar;
        a aVar2 = null;
        try {
            aVar = (a) GifImage.class.newInstance();
        } catch (Throwable unused) {
            aVar = null;
        }
        f3084a = aVar;
        try {
            aVar2 = (a) WebPImage.class.newInstance();
        } catch (Throwable unused2) {
        }
        f3085b = aVar2;
    }

    public b(c cVar, PlatformBitmapFactory platformBitmapFactory, boolean z5) {
    }

    public static na.b a(String str, ImageDecodeOptions imageDecodeOptions, aa.b bVar) {
        imageDecodeOptions.getClass();
        i iVar = new i(bVar);
        iVar.f7981i = null;
        iVar.f7982v = null;
        iVar.f7983w = str;
        try {
            r rVar = new r(iVar);
            CloseableReference.l((CloseableReference) iVar.f7981i);
            iVar.f7981i = null;
            CloseableReference.n((ArrayList) iVar.f7982v);
            iVar.f7982v = null;
            na.b bVar2 = new na.b();
            bVar2.f16525v = rVar;
            bVar2.f16526w = true;
            return bVar2;
        } catch (Throwable th2) {
            CloseableReference.l((CloseableReference) iVar.f7981i);
            iVar.f7981i = null;
            CloseableReference.n((ArrayList) iVar.f7982v);
            iVar.f7982v = null;
            throw th2;
        }
    }
}
