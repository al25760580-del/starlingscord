package b4;

import android.os.Build;
import c4.i;
import e4.o;
import kotlin.jvm.internal.Intrinsics;
import v3.q;
import v3.r;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f3068c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3069b;

    static {
        String strF = q.f("NetworkMeteredCtrlr");
        Intrinsics.checkNotNullExpressionValue(strF, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f3068c = strF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f3069b = 7;
    }

    @Override // b4.e
    public final int a() {
        return this.f3069b;
    }

    @Override // b4.e
    public final boolean b(o workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.f21394a == r.f21424w;
    }

    @Override // b4.e
    public final boolean c(Object obj) {
        a4.d value = (a4.d) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            return (value.f122a && value.f124c) ? false : true;
        }
        q.d().a(f3068c, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !value.f122a;
    }
}
