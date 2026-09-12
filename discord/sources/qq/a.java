package qq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.d1;
import vo.i;
import vo.q0;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f18989e = new a(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f18990i = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18991d;

    public /* synthetic */ a(int i7) {
        this.f18991d = i7;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z5;
        d1 it = (d1) obj;
        switch (this.f18991d) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                i iVarG = it.r0().g();
                if (iVarG != null) {
                    Intrinsics.checkNotNullParameter(iVarG, "<this>");
                    if ((iVarG instanceof r0) && (((r0) iVarG).g() instanceof q0)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                i iVarG2 = it.r0().g();
                return Boolean.valueOf(iVarG2 != null && ((iVarG2 instanceof q0) || (iVarG2 instanceof r0)));
        }
    }
}
