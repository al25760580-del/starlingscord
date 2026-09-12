package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u2 f6145b = new u2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f6146a = new ConcurrentHashMap();

    public final x2 a(Class cls) {
        x2 x2VarV;
        ConcurrentHashMap concurrentHashMap = this.f6146a;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (x2) obj;
        }
        a aVar = y2.f6191a;
        if (!d2.class.isAssignableFrom(cls)) {
            int i7 = q1.f6096a;
        }
        int i10 = q1.f6096a;
        if (!d2.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            w2 w2Var = (w2) d2.m(cls.asSubclass(d2.class)).j(3);
            if ((w2Var.f6179d & 2) == 2) {
                x2VarV = new t2(y2.f6191a, w2Var.f6176a);
            } else {
                x2VarV = s2.v(w2Var, y2.f6191a, w2Var.a() + (-1) != 1 ? z1.f6196a : null);
            }
            x2 x2Var = (x2) concurrentHashMap.putIfAbsent(cls, x2VarV);
            return x2Var != null ? x2Var : x2VarV;
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
