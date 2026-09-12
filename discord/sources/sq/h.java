package sq;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up.e f20509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Regex f20510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f20511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f20512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e[] f20513e;

    public h(up.e eVar, Regex regex, Collection collection, Function1 function1, e... eVarArr) {
        this.f20509a = eVar;
        this.f20510b = regex;
        this.f20511c = collection;
        this.f20512d = function1;
        this.f20513e = eVarArr;
    }

    public /* synthetic */ h(up.e eVar, e[] eVarArr) {
        this(eVar, eVarArr, g.f20502e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(up.e name, e[] checks, Function1 additionalChecks) {
        this(name, null, null, additionalChecks, (e[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Collection collection, e[] eVarArr) {
        this(collection, eVarArr, g.f20504v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection nameList, e[] checks, Function1 additionalChecks) {
        this(null, null, nameList, additionalChecks, (e[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(nameList, "nameList");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }
}
