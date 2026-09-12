package ga;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements CacheKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResizeOptions f9517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RotationOptions f9518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageDecodeOptions f9519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CacheKey f9520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f9522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9523h;

    public a(String sourceString, ResizeOptions resizeOptions, RotationOptions rotationOptions, ImageDecodeOptions imageDecodeOptions, CacheKey cacheKey, String str) {
        Intrinsics.checkNotNullParameter(sourceString, "sourceString");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(imageDecodeOptions, "imageDecodeOptions");
        this.f9516a = sourceString;
        this.f9517b = resizeOptions;
        this.f9518c = rotationOptions;
        this.f9519d = imageDecodeOptions;
        this.f9520e = cacheKey;
        this.f9521f = str;
        this.f9523h = ((((imageDecodeOptions.hashCode() + ((rotationOptions.hashCode() + (((sourceString.hashCode() * 31) + (resizeOptions != null ? resizeOptions.hashCode() : 0)) * 31)) * 31)) * 31) + (cacheKey != null ? cacheKey.hashCode() : 0)) * 31) + (str != null ? str.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.D(this.f9516a, string, false);
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean b() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String c() {
        return this.f9516a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f9516a, aVar.f9516a) && Intrinsics.areEqual(this.f9517b, aVar.f9517b) && Intrinsics.areEqual(this.f9518c, aVar.f9518c) && Intrinsics.areEqual(this.f9519d, aVar.f9519d) && Intrinsics.areEqual(this.f9520e, aVar.f9520e) && Intrinsics.areEqual(this.f9521f, aVar.f9521f);
    }

    public final int hashCode() {
        return this.f9523h;
    }

    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.f9516a + ", resizeOptions=" + this.f9517b + ", rotationOptions=" + this.f9518c + ", imageDecodeOptions=" + this.f9519d + ", postprocessorCacheKey=" + this.f9520e + ", postprocessorName=" + this.f9521f + ")";
    }
}
