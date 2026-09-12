package n9;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements CacheKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16517b;

    public a(int i7, boolean z5) {
        this.f16516a = z5;
        this.f16517b = kk.b.h(i7, "anim://");
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return x.o(string, this.f16517b, false);
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean b() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String c() {
        return this.f16517b;
    }

    public final boolean equals(Object obj) {
        if (!this.f16516a) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(a.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f16517b, ((a) obj).f16517b);
    }

    public final int hashCode() {
        return !this.f16516a ? super.hashCode() : this.f16517b.hashCode();
    }
}
