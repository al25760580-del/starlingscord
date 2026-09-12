package zo;

import kotlin.jvm.internal.Intrinsics;
import or.y0;
import sn.i;
import vo.a1;
import vo.b1;
import vo.e1;
import vo.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24059d = new a("package", false);

    @Override // or.y0
    public final Integer c(y0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        i iVar = e1.f21805a;
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return visibility == z0.f21858d || visibility == a1.f21788d ? 1 : -1;
    }

    @Override // or.y0
    public final String s() {
        return "public/*package*/";
    }

    @Override // or.y0
    public final y0 u() {
        return b1.f21791d;
    }
}
