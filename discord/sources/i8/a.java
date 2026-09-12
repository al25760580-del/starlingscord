package i8;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements CacheKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11393a;

    public a(ArrayList arrayList) {
        this.f11393a = arrayList;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean a(Uri uri) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f11393a;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (((CacheKey) arrayList.get(i7)).a(uri)) {
                return true;
            }
            i7++;
        }
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean b() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String c() {
        return ((CacheKey) this.f11393a.get(0)).c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return this.f11393a.equals(((a) obj).f11393a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11393a.hashCode();
    }

    public final String toString() {
        return "MultiCacheKey:" + this.f11393a.toString();
    }
}
