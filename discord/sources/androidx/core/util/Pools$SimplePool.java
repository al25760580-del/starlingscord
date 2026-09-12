package androidx.core.util;

import k1.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class Pools$SimplePool implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f1580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1581b;

    public Pools$SimplePool(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1580a = new Object[i7];
    }

    @Override // k1.b
    public Object acquire() {
        int i7 = this.f1581b;
        if (i7 <= 0) {
            return null;
        }
        int i10 = i7 - 1;
        Object[] objArr = this.f1580a;
        Object obj = objArr[i10];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f1581b--;
        return obj;
    }

    @Override // k1.b
    public boolean release(Object instance) {
        Object[] objArr;
        boolean z5;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i7 = this.f1581b;
        int i10 = 0;
        while (true) {
            objArr = this.f1580a;
            if (i10 >= i7) {
                z5 = false;
                break;
            }
            if (objArr[i10] == instance) {
                z5 = true;
                break;
            }
            i10++;
        }
        if (z5) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i11 = this.f1581b;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = instance;
        this.f1581b = i11 + 1;
        return true;
    }
}
