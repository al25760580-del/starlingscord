package vl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import we.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21731d = 1;

    public /* synthetic */ b() {
    }

    private final void a(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f21731d) {
            case 0:
                break;
            default:
                StringBuilder sbR = a3.e.r(i7, "BottomNavigationView layout changed {", i10, ", ", "} {");
                sbR.append(i11 - i7);
                sbR.append(", ");
                sbR.append(i12 - i10);
                sbR.append("}");
                String message = sbR.toString();
                Intrinsics.checkNotNullParameter("TabsHost", "tag");
                Intrinsics.checkNotNullParameter(message, "message");
                break;
        }
    }

    public /* synthetic */ b(k kVar) {
    }
}
