package i8;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements CacheKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11399a;

    public d(String str) {
        str.getClass();
        this.f11399a = str;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean a(Uri uri) {
        return this.f11399a.contains(uri.toString());
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean b() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String c() {
        return this.f11399a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f11399a.equals(((d) obj).f11399a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11399a.hashCode();
    }

    public final String toString() {
        return this.f11399a;
    }
}
