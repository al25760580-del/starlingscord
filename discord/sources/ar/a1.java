package ar;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends CancellationException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Job f2884d;

    public a1(String str, Throwable th2, i1 i1Var) {
        super(str);
        this.f2884d = i1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (!Intrinsics.areEqual(a1Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = a1Var.f2884d;
        if (obj2 == null) {
            obj2 = l1.f2941e;
        }
        Object obj3 = this.f2884d;
        if (obj3 == null) {
            obj3 = l1.f2941e;
        }
        return Intrinsics.areEqual(obj2, obj3) && Intrinsics.areEqual(a1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f2884d;
        if (obj == null) {
            obj = l1.f2941e;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.f2884d;
        if (obj == null) {
            obj = l1.f2941e;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
