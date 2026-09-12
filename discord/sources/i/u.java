package i;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u extends m.j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ue.i f11257e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11258i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11259v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f11261x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.a aVar, Window.Callback callback) {
        super(callback);
        this.f11261x = aVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f11258i = true;
            callback.onContentChanged();
        } finally {
            this.f11258i = false;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z5 = this.f11259v;
        Window.Callback callback = this.f15340d;
        if (z5) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f11261x.L(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f15340d.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            androidx.appcompat.app.a aVar = this.f11261x;
            aVar.S();
            ActionBar actionBar = aVar.L;
            if (actionBar == null || !actionBar.i(keyCode, keyEvent)) {
                x xVar = aVar.f746j0;
                if (xVar == null || !aVar.X(xVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (aVar.f746j0 == null) {
                        x xVarQ = aVar.Q(0);
                        aVar.Y(xVarQ, keyEvent);
                        boolean zX = aVar.X(xVarQ, keyEvent.getKeyCode(), keyEvent);
                        xVarQ.k = false;
                        if (zX) {
                        }
                    }
                    return false;
                }
                x xVar2 = aVar.f746j0;
                if (xVar2 != null) {
                    xVar2.f11274l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f11258i) {
            this.f15340d.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0 || (menu instanceof n.j)) {
            return this.f15340d.onCreatePanelMenu(i7, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i7) {
        ue.i iVar = this.f11257e;
        if (iVar != null) {
            View view = i7 == 0 ? new View(((e0) iVar.f21117d).f11200a.f1164a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f15340d.onCreatePanelView(i7);
    }

    @Override // m.j, android.view.Window.Callback
    public final boolean onMenuOpened(int i7, Menu menu) {
        super.onMenuOpened(i7, menu);
        if (i7 == 108) {
            androidx.appcompat.app.a aVar = this.f11261x;
            aVar.S();
            ActionBar actionBar = aVar.L;
            if (actionBar != null) {
                actionBar.c(true);
            }
        }
        return true;
    }

    @Override // m.j, android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        if (this.f11260w) {
            this.f15340d.onPanelClosed(i7, menu);
            return;
        }
        super.onPanelClosed(i7, menu);
        androidx.appcompat.app.a aVar = this.f11261x;
        if (i7 == 108) {
            aVar.S();
            ActionBar actionBar = aVar.L;
            if (actionBar != null) {
                actionBar.c(false);
                return;
            }
            return;
        }
        if (i7 == 0) {
            x xVarQ = aVar.Q(i7);
            if (xVarQ.f11275m) {
                aVar.J(xVarQ, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        n.j jVar = menu instanceof n.j ? (n.j) menu : null;
        if (i7 == 0 && jVar == null) {
            return false;
        }
        if (jVar != null) {
            jVar.f16163x = true;
        }
        ue.i iVar = this.f11257e;
        if (iVar != null && i7 == 0) {
            e0 e0Var = (e0) iVar.f21117d;
            if (!e0Var.f11203d) {
                e0Var.f11200a.f1173l = true;
                e0Var.f11203d = true;
            }
        }
        boolean zOnPreparePanel = this.f15340d.onPreparePanel(i7, view, menu);
        if (jVar != null) {
            jVar.f16163x = false;
        }
        return zOnPreparePanel;
    }

    @Override // m.j, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
        n.j jVar = this.f11261x.Q(0).f11272h;
        if (jVar != null) {
            super.onProvideKeyboardShortcuts(list, jVar, i7);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i7);
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return m.g.b(this.f15340d, callback, i7);
        }
        androidx.appcompat.app.a aVar = this.f11261x;
        androidx.appcompat.view.b bVar = new androidx.appcompat.view.b(aVar.H, callback);
        androidx.appcompat.view.ActionMode actionModeD = aVar.D(bVar);
        if (actionModeD != null) {
            return bVar.e(actionModeD);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
