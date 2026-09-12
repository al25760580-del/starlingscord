package rn;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements Lazy, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f19483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f19484e;

    @Override // kotlin.Lazy
    public final Object getValue() {
        if (this.f19484e == g0.f19473a) {
            Function0 function0 = this.f19483d;
            Intrinsics.checkNotNull(function0);
            this.f19484e = function0.invoke();
            this.f19483d = null;
        }
        return this.f19484e;
    }

    public final String toString() {
        return this.f19484e != g0.f19473a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
