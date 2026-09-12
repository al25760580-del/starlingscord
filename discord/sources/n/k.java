package n;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class k implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f16164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i.f f16165e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f16166i;

    @Override // n.u
    public final void b(j jVar, boolean z5) {
        i.f fVar;
        if ((z5 || jVar == this.f16164d) && (fVar = this.f16165e) != null) {
            fVar.dismiss();
        }
    }

    @Override // n.u
    public final boolean f(j jVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        b0 b0Var = this.f16164d;
        f fVar = this.f16166i;
        if (fVar.f16134x == null) {
            fVar.f16134x = new e(fVar);
        }
        b0Var.q(fVar.f16134x.getItem(i7), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f16166i.b(this.f16164d, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        b0 b0Var = this.f16164d;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f16165e.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f16165e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                b0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return b0Var.performShortcut(i7, keyEvent, 0);
    }
}
