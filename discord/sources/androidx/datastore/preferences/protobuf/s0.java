package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s0 f1930c = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1932b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f1931a = new e0();

    public final v0 a(Class cls) {
        v0 v0VarW;
        Class cls2;
        u.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1932b;
        v0 v0Var = (v0) concurrentHashMap.get(cls);
        if (v0Var != null) {
            return v0Var;
        }
        e0 e0Var = this.f1931a;
        e0Var.getClass();
        Class cls3 = w0.f1948a;
        if (!s.class.isAssignableFrom(cls) && (cls2 = w0.f1948a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        u0 u0VarA = ((d0) e0Var.f1840a).a(cls);
        int i7 = u0VarA.f1941d;
        a aVar = u0VarA.f1938a;
        if ((i7 & 2) == 2) {
            if (s.class.isAssignableFrom(cls)) {
                v0VarW = new n0(w0.f1951d, m.f1885a, aVar);
            } else {
                f1 f1Var = w0.f1949b;
                l lVar = m.f1886b;
                if (lVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                v0VarW = new n0(f1Var, lVar, aVar);
            }
        } else if (s.class.isAssignableFrom(cls)) {
            v0VarW = (u0VarA.f1941d & 1) == 1 ? m0.w(u0VarA, p0.f1925b, c0.f1830b, w0.f1951d, m.f1885a, j0.f1879b) : m0.w(u0VarA, p0.f1925b, c0.f1830b, w0.f1951d, null, j0.f1879b);
        } else if ((u0VarA.f1941d & 1) == 1) {
            o0 o0Var = p0.f1924a;
            a0 a0Var = c0.f1829a;
            f1 f1Var2 = w0.f1949b;
            l lVar2 = m.f1886b;
            if (lVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            v0VarW = m0.w(u0VarA, o0Var, a0Var, f1Var2, lVar2, j0.f1878a);
        } else {
            v0VarW = m0.w(u0VarA, p0.f1924a, c0.f1829a, w0.f1950c, null, j0.f1878a);
        }
        v0 v0Var2 = (v0) concurrentHashMap.putIfAbsent(cls, v0VarW);
        return v0Var2 != null ? v0Var2 : v0VarW;
    }
}
