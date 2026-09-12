package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mo.u;
import mo.v;
import mo.w;
import org.jetbrains.annotations.NotNull;
import po.q1;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "c", "mo/u", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KTypeProjection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final u f14691c = new u(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KTypeProjection f14692d = new KTypeProjection(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f14693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KType f14694b;

    public KTypeProjection(w wVar, q1 q1Var) {
        String str;
        this.f14693a = wVar;
        this.f14694b = q1Var;
        if ((wVar == null) == (q1Var == null)) {
            return;
        }
        if (wVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + wVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f14693a == kTypeProjection.f14693a && Intrinsics.areEqual(this.f14694b, kTypeProjection.f14694b);
    }

    public final int hashCode() {
        w wVar = this.f14693a;
        int iHashCode = (wVar == null ? 0 : wVar.hashCode()) * 31;
        KType kType = this.f14694b;
        return iHashCode + (kType != null ? kType.hashCode() : 0);
    }

    public final String toString() {
        w wVar = this.f14693a;
        int i7 = wVar == null ? -1 : v.f15953a[wVar.ordinal()];
        if (i7 == -1) {
            return "*";
        }
        KType kType = this.f14694b;
        if (i7 == 1) {
            return String.valueOf(kType);
        }
        if (i7 == 2) {
            return "in " + kType;
        }
        if (i7 != 3) {
            throw new n();
        }
        return "out " + kType;
    }
}
