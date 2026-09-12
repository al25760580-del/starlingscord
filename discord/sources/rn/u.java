package rn;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Lazy, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f19494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f19495e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19496i;

    public u(Function0 initializer, Object obj, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i7 & 2) != 0 ? null : obj;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f19494d = initializer;
        this.f19495e = g0.f19473a;
        this.f19496i = obj == null ? this : obj;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f19495e;
        g0 g0Var = g0.f19473a;
        if (obj != g0Var) {
            return obj;
        }
        synchronized (this.f19496i) {
            objInvoke = this.f19495e;
            if (objInvoke == g0Var) {
                Function0 function0 = this.f19494d;
                Intrinsics.checkNotNull(function0);
                objInvoke = function0.invoke();
                this.f19495e = objInvoke;
                this.f19494d = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f19495e != g0.f19473a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
