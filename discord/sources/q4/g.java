package q4;

import androidx.collection.LruCache;
import l4.i;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f18624b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f18625a = new LruCache(20);

    public final i a(String str) {
        if (str == null) {
            return null;
        }
        return (i) this.f18625a.a(str);
    }
}
