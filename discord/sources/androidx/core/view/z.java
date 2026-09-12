package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f1756e;

    public /* synthetic */ z(int i7, View view) {
        this.f1755d = i7;
        this.f1756e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1755d) {
            case 0:
                View view = this.f1756e;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 1:
                View view2 = this.f1756e;
                ((InputMethodManager) view2.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view2, 1);
                break;
            case 2:
                this.f1756e.sendAccessibilityEvent(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS);
                break;
            default:
                this.f1756e.invalidate();
                break;
        }
    }
}
