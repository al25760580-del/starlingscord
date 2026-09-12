package net.time4j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yr.h f16639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f16640c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f16641a;

    static {
        yr.h hVar = null;
        int i7 = 0;
        for (yr.h hVar2 : vr.c.f21955b.d(yr.h.class)) {
            int length = hVar2.b().length;
            if (length >= i7) {
                hVar = hVar2;
                i7 = length;
            }
        }
        if (hVar == null) {
            hVar = yr.h.f23541a;
        }
        f16639b = hVar;
        f16640c = new ConcurrentHashMap();
        i0[] i0VarArr = {m.f16667v, m.f16669x, m.f16670y, m.E, t.f16710d, t.f16711e, t.f16712i};
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, i0VarArr);
        hashSet.add(t.f16715x);
        Collections.unmodifiableSet(hashSet);
    }

    public g1(Locale locale, vr.d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Missing reference clock.");
        }
        yr.e0.a(locale);
        this.f16641a = locale;
    }
}
