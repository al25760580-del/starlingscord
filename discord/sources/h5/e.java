package h5;

import android.hardware.Camera;
import com.budiyev.android.codescanner.CodeScanner;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CodeScanner f10342b;

    public /* synthetic */ e(CodeScanner codeScanner, int i7) {
        this.f10341a = i7;
        this.f10342b = codeScanner;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z5, Camera camera) {
        switch (this.f10341a) {
            case 0:
                this.f10342b.f3914z = false;
                break;
            default:
                this.f10342b.f3912x = false;
                break;
        }
    }
}
