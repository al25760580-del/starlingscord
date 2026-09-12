package ge;

import android.view.MotionEvent;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends WebView {
    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
