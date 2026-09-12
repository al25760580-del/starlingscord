package h5;

import android.hardware.Camera;
import com.budiyev.android.codescanner.CodeScanner;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CodeScanner f10340a;

    public d(CodeScanner codeScanner) {
        this.f10340a = codeScanner;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        o oVar;
        s frameRect;
        if (!this.f10340a.f3907s || this.f10340a.f3908t || this.f10340a.F == 3 || bArr == null || (oVar = this.f10340a.f3905q) == null) {
            return;
        }
        n nVar = oVar.f10366b;
        if (nVar.f10364h == 2 && (frameRect = this.f10340a.f3894d.getFrameRect()) != null && frameRect.f10379c - frameRect.f10377a >= 1 && frameRect.f10380d - frameRect.f10378b >= 1) {
            l lVar = new l(bArr, oVar.f10367c, oVar.f10368d, oVar.f10369e, frameRect, oVar.f10370f, oVar.f10371g);
            synchronized (nVar.f10361e) {
                try {
                    if (nVar.f10364h != 5) {
                        nVar.f10363g = lVar;
                        nVar.f10361e.notify();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
