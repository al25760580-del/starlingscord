package h5;

import android.hardware.Camera;
import com.budiyev.android.codescanner.CodeScanner;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CodeScanner f10344e;

    public /* synthetic */ f(CodeScanner codeScanner, int i7) {
        this.f10343d = i7;
        this.f10344e = codeScanner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar;
        int i7;
        switch (this.f10343d) {
            case 0:
                CodeScanner codeScanner = this.f10344e;
                codeScanner.A = false;
                if (codeScanner.G == 1) {
                    CodeScanner codeScanner2 = this.f10344e;
                    if (codeScanner2.f3907s && codeScanner2.f3913y && (oVar = codeScanner2.f3905q) != null && oVar.f10372h && codeScanner2.f3909u) {
                        if (!codeScanner2.f3914z || (i7 = codeScanner2.C) >= 2) {
                            try {
                                Camera camera = oVar.f10365a;
                                camera.cancelAutoFocus();
                                camera.autoFocus(codeScanner2.f3899i);
                                codeScanner2.C = 0;
                                codeScanner2.f3914z = true;
                            } catch (Exception unused) {
                                codeScanner2.f3914z = false;
                            }
                        } else {
                            codeScanner2.C = i7 + 1;
                        }
                        codeScanner2.d();
                        break;
                    }
                }
                break;
            default:
                CodeScanner codeScanner3 = this.f10344e;
                if (codeScanner3.f3907s && codeScanner3.f3913y) {
                    codeScanner3.f3895e.removeCallback(codeScanner3.f3896f);
                    codeScanner3.j(false);
                    break;
                }
                break;
        }
    }
}
