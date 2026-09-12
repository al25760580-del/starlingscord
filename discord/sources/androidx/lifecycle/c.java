package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f2335b;

    public c(int i7, Method method) {
        this.f2334a = i7;
        this.f2335b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2334a == cVar.f2334a && this.f2335b.getName().equals(cVar.f2335b.getName());
    }

    public final int hashCode() {
        return this.f2335b.getName().hashCode() + (this.f2334a * 31);
    }
}
