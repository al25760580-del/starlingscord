package b4;

import c4.i;
import e4.o;
import kotlin.jvm.internal.Intrinsics;
import v3.q;
import v3.r;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3070b;

    static {
        Intrinsics.checkNotNullExpressionValue(q.f("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f3070b = 7;
    }

    @Override // b4.e
    public final int a() {
        return this.f3070b;
    }

    @Override // b4.e
    public final boolean b(o workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.f21394a == r.f21423v;
    }

    @Override // b4.e
    public final boolean c(Object obj) {
        a4.d value = (a4.d) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.f122a && value.f125d) ? false : true;
    }
}
