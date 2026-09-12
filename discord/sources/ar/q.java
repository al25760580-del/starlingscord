package ar;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f2952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f2953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f2955e;

    public q(Object obj, i iVar, Function3 function3, Object obj2, Throwable th2) {
        this.f2951a = obj;
        this.f2952b = iVar;
        this.f2953c = function3;
        this.f2954d = obj2;
        this.f2955e = th2;
    }

    public static q a(q qVar, i iVar, Throwable th2, int i7) {
        Object obj = qVar.f2951a;
        if ((i7 & 2) != 0) {
            iVar = qVar.f2952b;
        }
        i iVar2 = iVar;
        Function3 function3 = qVar.f2953c;
        Object obj2 = qVar.f2954d;
        if ((i7 & 16) != 0) {
            th2 = qVar.f2955e;
        }
        return new q(obj, iVar2, function3, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f2951a, qVar.f2951a) && Intrinsics.areEqual(this.f2952b, qVar.f2952b) && Intrinsics.areEqual(this.f2953c, qVar.f2953c) && Intrinsics.areEqual(this.f2954d, qVar.f2954d) && Intrinsics.areEqual(this.f2955e, qVar.f2955e);
    }

    public final int hashCode() {
        Object obj = this.f2951a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f2952b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Function3 function3 = this.f2953c;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.f2954d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f2955e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2951a + ", cancelHandler=" + this.f2952b + ", onCancellation=" + this.f2953c + ", idempotentResume=" + this.f2954d + ", cancelCause=" + this.f2955e + ')';
    }

    public /* synthetic */ q(Object obj, i iVar, Function3 function3, Throwable th2, int i7) {
        this(obj, (i7 & 2) != 0 ? null : iVar, (i7 & 4) != 0 ? null : function3, (Object) null, (i7 & 16) != 0 ? null : th2);
    }
}
