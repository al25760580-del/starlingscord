package kq;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f14776b;

    public g(Object obj, Function0 function0) {
        this.f14775a = obj;
        this.f14776b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.f14775a.equals(((g) obj).f14775a);
    }

    public final int hashCode() {
        return this.f14775a.hashCode();
    }
}
