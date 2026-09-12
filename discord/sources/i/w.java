package i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class w extends ContentFrameLayout {
    public final /* synthetic */ androidx.appcompat.app.a F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.a aVar, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, null);
        this.F = aVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.F.L(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            if (x5 < -5 || y5 < -5 || x5 > getWidth() + 5 || y5 > getHeight() + 5) {
                androidx.appcompat.app.a aVar = this.F;
                aVar.J(aVar.Q(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i7) {
        setBackgroundDrawable(mf.f.u(getContext(), i7));
    }
}
