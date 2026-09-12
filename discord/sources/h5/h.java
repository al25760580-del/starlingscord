package h5;

import android.view.View;
import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;

/* JADX INFO: loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CodeScannerView f10347e;

    public /* synthetic */ h(CodeScannerView codeScannerView, int i7) {
        this.f10346d = i7;
        this.f10347e = codeScannerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10346d) {
            case 0:
                CodeScanner codeScanner = this.f10347e.P;
                if (codeScanner != null) {
                    o oVar = codeScanner.f3905q;
                    if (oVar == null || oVar.f10372h) {
                        boolean z5 = !codeScanner.f3909u;
                        codeScanner.e(z5);
                        this.f10347e.setAutoFocusEnabled(z5);
                        return;
                    }
                    return;
                }
                return;
            default:
                CodeScanner codeScanner2 = this.f10347e.P;
                if (codeScanner2 != null) {
                    o oVar2 = codeScanner2.f3905q;
                    if (oVar2 == null || oVar2.f10373i) {
                        boolean z6 = true;
                        boolean z7 = !codeScanner2.f3910v;
                        synchronized (codeScanner2.f3891a) {
                            try {
                                if (codeScanner2.f3910v == z7) {
                                    z6 = false;
                                }
                                codeScanner2.f3910v = z7;
                                codeScanner2.f3894d.setFlashEnabled(z7);
                                o oVar3 = codeScanner2.f3905q;
                                if (codeScanner2.f3907s && codeScanner2.f3913y && z6 && oVar3 != null && oVar3.f10373i) {
                                    codeScanner2.g(z7);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        this.f10347e.setFlashEnabled(z7);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
