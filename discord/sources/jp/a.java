package jp;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f13990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f13991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f13994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f13995f;

    public /* synthetic */ a(z0 z0Var, boolean z5, boolean z6, Set set, int i7) {
        this(z0Var, b.f13996d, (i7 & 4) != 0 ? false : z5, (i7 & 8) != 0 ? false : z6, (i7 & 16) != 0 ? null : set, null);
    }

    public static a a(a aVar, b bVar, boolean z5, Set set, d0 d0Var, int i7) {
        z0 howThisTypeIsUsed = aVar.f13990a;
        if ((i7 & 2) != 0) {
            bVar = aVar.f13991b;
        }
        b flexibility = bVar;
        if ((i7 & 4) != 0) {
            z5 = aVar.f13992c;
        }
        boolean z6 = z5;
        boolean z7 = aVar.f13993d;
        if ((i7 & 16) != 0) {
            set = aVar.f13994e;
        }
        Set set2 = set;
        if ((i7 & 32) != 0) {
            d0Var = aVar.f13995f;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z6, z7, set2, d0Var);
    }

    public final a b(b flexibility) {
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return a(this, flexibility, false, null, null, 61);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(aVar.f13995f, this.f13995f) && aVar.f13990a == this.f13990a && aVar.f13991b == this.f13991b && aVar.f13992c == this.f13992c && aVar.f13993d == this.f13993d;
    }

    public final int hashCode() {
        d0 d0Var = this.f13995f;
        int iHashCode = d0Var != null ? d0Var.hashCode() : 0;
        int iHashCode2 = this.f13990a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f13991b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i7 = (iHashCode3 * 31) + (this.f13992c ? 1 : 0) + iHashCode3;
        return (i7 * 31) + (this.f13993d ? 1 : 0) + i7;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f13990a + ", flexibility=" + this.f13991b + ", isRaw=" + this.f13992c + ", isForAnnotationParameter=" + this.f13993d + ", visitedTypeParameters=" + this.f13994e + ", defaultType=" + this.f13995f + ')';
    }

    public a(z0 howThisTypeIsUsed, b flexibility, boolean z5, boolean z6, Set set, d0 d0Var) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f13990a = howThisTypeIsUsed;
        this.f13991b = flexibility;
        this.f13992c = z5;
        this.f13993d = z6;
        this.f13994e = set;
        this.f13995f = d0Var;
    }
}
