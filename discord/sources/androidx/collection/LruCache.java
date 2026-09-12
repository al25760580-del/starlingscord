package androidx.collection;

import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import mp.q;
import t.a;
import vi.d;

/* JADX INFO: loaded from: classes.dex */
public class LruCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f1214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f1215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1218f;

    public LruCache(int i7) {
        this.f1213a = i7;
        if (i7 <= 0) {
            a.c("maxSize <= 0");
            throw null;
        }
        this.f1214b = new q(1);
        this.f1215c = new d(16, (byte) 0);
    }

    public final Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f1215c) {
            q qVar = this.f1214b;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = qVar.f16005a.get(key);
            if (obj != null) {
                this.f1217e++;
                return obj;
            }
            this.f1218f++;
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    public final Object b(Object key, Object value) {
        Object oldValue;
        Object key2;
        Object oldValue2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f1215c) {
            try {
                int i7 = this.f1216d;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f1216d = i7 + 1;
                q qVar = this.f1214b;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                oldValue = qVar.f16005a.put(key, value);
                if (oldValue != null) {
                    int i10 = this.f1216d;
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(oldValue, "value");
                    this.f1216d = i10 - 1;
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (oldValue != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        }
        int i11 = this.f1213a;
        while (true) {
            synchronized (this.f1215c) {
                try {
                    if (this.f1216d < 0 || (this.f1214b.f16005a.isEmpty() && this.f1216d != 0)) {
                        break;
                    }
                    if (this.f1216d > i11 && !this.f1214b.f16005a.isEmpty()) {
                        Set setEntrySet = this.f1214b.f16005a.entrySet();
                        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
                        Map.Entry entry = (Map.Entry) CollectionsKt.L(setEntrySet);
                        if (entry == null) {
                            return oldValue;
                        }
                        key2 = entry.getKey();
                        oldValue2 = entry.getValue();
                        q qVar2 = this.f1214b;
                        qVar2.getClass();
                        Intrinsics.checkNotNullParameter(key2, "key");
                        qVar2.f16005a.remove(key2);
                        int i12 = this.f1216d;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(oldValue2, "value");
                        this.f1216d = i12 - 1;
                    }
                    return oldValue;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Intrinsics.checkNotNullParameter(key2, "key");
            Intrinsics.checkNotNullParameter(oldValue2, "oldValue");
        }
        Intrinsics.checkNotNullParameter("LruCache.sizeOf() is reporting inconsistent results!", "message");
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f1215c) {
            try {
                int i7 = this.f1217e;
                int i10 = this.f1218f + i7;
                str = "LruCache[maxSize=" + this.f1213a + ",hits=" + this.f1217e + ",misses=" + this.f1218f + ",hitRate=" + (i10 != 0 ? (i7 * 100) / i10 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
