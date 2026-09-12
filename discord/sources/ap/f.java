package ap;

import bp.s;
import kotlin.jvm.internal.Intrinsics;
import vo.n0;
import vo.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f2863d;

    public f(s javaElement) {
        Intrinsics.checkNotNullParameter(javaElement, "javaElement");
        this.f2863d = javaElement;
    }

    @Override // vo.n0
    public final void a() {
        o0 NO_SOURCE_FILE = o0.f21821e;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a3.e.w(f.class, sb2, ": ");
        sb2.append(this.f2863d);
        return sb2.toString();
    }
}
