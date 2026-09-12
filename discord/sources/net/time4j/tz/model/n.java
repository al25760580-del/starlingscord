package net.time4j.tz.model;

import java.util.Comparator;
import net.time4j.x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f16761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n[] f16762e;

    static {
        n nVar = new n("INSTANCE", 0);
        f16761d = nVar;
        f16762e = new n[]{nVar};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f16762e.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        d dVar = (d) obj;
        d dVar2 = (d) obj2;
        g gVar = (g) dVar;
        x0 x0VarB = gVar.b(2000);
        long j = gVar.f16749d;
        net.time4j.k kVar = net.time4j.m.E;
        x0 x0Var = (x0) x0VarB.l(j, kVar);
        g gVar2 = (g) dVar2;
        int iCompareTo = x0Var.compareTo((x0) gVar2.b(2000).l(gVar2.f16749d, kVar));
        return iCompareTo == 0 ? dVar.f16750e.compareTo(dVar2.f16750e) : iCompareTo;
    }
}
