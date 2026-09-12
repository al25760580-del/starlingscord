package hj;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f10886c = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10888b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f10887a = new c0();

    public final q0 a(Class cls) {
        q0 q0VarU;
        Class cls2;
        t.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f10888b;
        q0 q0Var = (q0) concurrentHashMap.get(cls);
        if (q0Var != null) {
            return q0Var;
        }
        c0 c0Var = this.f10887a;
        c0Var.getClass();
        Class cls3 = r0.f10903a;
        if (!r.class.isAssignableFrom(cls) && (cls2 = r0.f10903a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        p0 p0VarA = c0Var.f10808a.a(cls);
        int i7 = p0VarA.f10899d;
        b bVar = p0VarA.f10896a;
        if ((i7 & 2) == 2) {
            if (r.class.isAssignableFrom(cls)) {
                q0VarU = new k0(r0.f10905c, n.f10884a, bVar);
            } else {
                u0 u0Var = r0.f10904b;
                m mVar = n.f10885b;
                if (mVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                q0VarU = new k0(u0Var, mVar, bVar);
            }
        } else if (r.class.isAssignableFrom(cls)) {
            q0VarU = f0.e.b(p0VarA.a()) != 1 ? j0.u(p0VarA, m0.f10883b, a0.f10802b, r0.f10905c, n.f10884a, g0.f10833b) : j0.u(p0VarA, m0.f10883b, a0.f10802b, r0.f10905c, null, g0.f10833b);
        } else if (f0.e.b(p0VarA.a()) != 1) {
            l0 l0Var = m0.f10882a;
            y yVar = a0.f10801a;
            u0 u0Var2 = r0.f10904b;
            m mVar2 = n.f10885b;
            if (mVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            q0VarU = j0.u(p0VarA, l0Var, yVar, u0Var2, mVar2, g0.f10832a);
        } else {
            q0VarU = j0.u(p0VarA, m0.f10882a, a0.f10801a, r0.f10904b, null, g0.f10832a);
        }
        q0 q0Var2 = (q0) concurrentHashMap.putIfAbsent(cls, q0VarU);
        return q0Var2 != null ? q0Var2 : q0VarU;
    }
}
