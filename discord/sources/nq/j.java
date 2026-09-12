package nq;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import lq.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f17049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f17050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17051c;

    public j(k kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f17049a = kind;
        this.f17050b = formatParams;
        b[] bVarArr = b.f17028d;
        String str = kind.f17059d;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String str3 = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        this.f17051c = str3;
    }

    @Override // lq.q0
    public final so.i f() {
        return (so.e) so.e.f20335f.getValue();
    }

    @Override // lq.q0
    public final vo.i g() {
        l.f17061a.getClass();
        return l.f17063c;
    }

    @Override // lq.q0
    public final List getParameters() {
        return n0.f14659d;
    }

    @Override // lq.q0
    public final Collection h() {
        return n0.f14659d;
    }

    @Override // lq.q0
    public final boolean i() {
        return false;
    }

    public final String toString() {
        return this.f17051c;
    }
}
