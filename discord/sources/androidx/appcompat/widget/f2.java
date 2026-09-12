package androidx.appcompat.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements View.OnTouchListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2 f951d;

    public f2(g2 g2Var) {
        this.f951d = g2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g2 g2Var = this.f951d;
        c2 c2Var = g2Var.O;
        Handler handler = g2Var.S;
        a0 a0Var = g2Var.W;
        int action = motionEvent.getAction();
        int x5 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        if (action == 0 && a0Var != null && a0Var.isShowing() && x5 >= 0 && x5 < a0Var.getWidth() && y5 >= 0 && y5 < a0Var.getHeight()) {
            handler.postDelayed(c2Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(c2Var);
        return false;
    }
}
