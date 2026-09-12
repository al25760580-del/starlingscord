package ze;

import android.app.AlertDialog;
import com.google.android.gms.internal.play_billing.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f23919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f23920b;

    public b0(u0 u0Var, AlertDialog alertDialog) {
        this.f23920b = u0Var;
        this.f23919a = alertDialog;
    }

    @Override // ze.p
    public final void a() {
        k kVar = (k) this.f23920b.f6143i;
        kVar.f23939i.set(null);
        eg.a aVar = kVar.f23943y.K;
        aVar.sendMessage(aVar.obtainMessage(3));
        AlertDialog alertDialog = this.f23919a;
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }
}
