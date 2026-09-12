package zo;

import kotlin.jvm.internal.Intrinsics;
import or.y0;
import sn.i;
import vo.a1;
import vo.b1;
import vo.e1;
import vo.w0;
import vo.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f24060d = new b("protected_and_package", true);

    @Override // or.y0
    public final Integer c(y0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (Intrinsics.areEqual(this, visibility)) {
            return 0;
        }
        if (visibility == w0.f21849d) {
            return null;
        }
        i iVar = e1.f21805a;
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return visibility == z0.f21858d || visibility == a1.f21788d ? 1 : -1;
    }

    @Override // or.y0
    public final String s() {
        return "protected/*protected and package*/";
    }

    @Override // or.y0
    public final y0 u() {
        return b1.f21791d;
    }
}
