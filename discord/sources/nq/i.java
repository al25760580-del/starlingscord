package nq;

import eq.o;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import lq.d0;
import lq.d1;
import lq.l0;
import lq.q0;
import lq.z;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends d0 {
    public final String E;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f17043e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f17044i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f17045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f17046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f17047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String[] f17048y;

    public i(q0 constructor, g memberScope, k kind, List arguments, boolean z5, String... formatParams) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f17043e = constructor;
        this.f17044i = memberScope;
        this.f17045v = kind;
        this.f17046w = arguments;
        this.f17047x = z5;
        this.f17048y = formatParams;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = kind.f17059d;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        this.E = str2;
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: A0 */
    public final d0 x0(boolean z5) {
        String[] strArr = this.f17048y;
        return new i(this.f17043e, this.f17044i, this.f17045v, this.f17046w, z5, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: B0 */
    public final d0 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @Override // lq.z
    public final o J() {
        return this.f17044i;
    }

    @Override // lq.z
    public final List l0() {
        return this.f17046w;
    }

    @Override // lq.z
    public final l0 q0() {
        l0.f15225e.getClass();
        return l0.f15226i;
    }

    @Override // lq.z
    public final q0 r0() {
        return this.f17043e;
    }

    @Override // lq.z
    public final boolean t0() {
        return this.f17047x;
    }

    @Override // lq.z
    /* JADX INFO: renamed from: v0 */
    public final z y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // lq.d1
    public final d1 y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // lq.d0, lq.d1
    public final d1 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }
}
