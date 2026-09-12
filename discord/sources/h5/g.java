package h5;

import android.view.SurfaceHolder;
import com.budiyev.android.codescanner.CodeScanner;

/* JADX INFO: loaded from: classes.dex */
public final class g implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CodeScanner f10345d;

    public g(CodeScanner codeScanner) {
        this.f10345d = codeScanner;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
        CodeScanner codeScanner = this.f10345d;
        if (surfaceHolder.getSurface() == null) {
            codeScanner.f3913y = false;
            return;
        }
        if (codeScanner.f3907s && codeScanner.f3913y) {
            codeScanner.j(true);
        }
        if (!codeScanner.f3907s || codeScanner.f3913y) {
            return;
        }
        codeScanner.i(true);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        CodeScanner codeScanner = this.f10345d;
        if (!codeScanner.f3907s || codeScanner.f3913y) {
            return;
        }
        codeScanner.i(true);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        CodeScanner codeScanner = this.f10345d;
        if (codeScanner.f3907s && codeScanner.f3913y) {
            codeScanner.j(true);
        }
    }
}
