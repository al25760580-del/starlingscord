package cs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f7430c = new j(CollectionsKt.l0(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f7431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls.l f7432b;

    public j(Set pins, ls.l lVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f7431a = pins;
        this.f7432b = lVar;
    }

    public final void a(String hostname, Function0 cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f7431a;
        n0 n0Var = n0.f14659d;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw s0.g.a(it);
        }
        n0Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(jVar.f7431a, this.f7431a) && Intrinsics.areEqual(jVar.f7432b, this.f7432b);
    }

    public final int hashCode() {
        int iHashCode = (this.f7431a.hashCode() + 1517) * 41;
        ls.l lVar = this.f7432b;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
