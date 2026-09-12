package ca;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import n8.f;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements CacheKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9.a f3557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3558b;

    public c(n9.a aVar, int i7) {
        this.f3557a = aVar;
        this.f3558b = i7;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean a(Uri uri) {
        return this.f3557a.a(uri);
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean b() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3558b == cVar.f3558b && this.f3557a.equals(cVar.f3557a);
    }

    public final int hashCode() {
        return (this.f3557a.hashCode() * 1013) + this.f3558b;
    }

    public final String toString() {
        f fVarJ = i.j(this);
        fVarJ.H(this.f3557a, "imageCacheKey");
        fVarJ.F(this.f3558b, "frameIndex");
        return fVarJ.toString();
    }
}
