package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends g2 implements h2 {
    public static final Method a0;
    public ue.i Z;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // androidx.appcompat.widget.h2
    public final void c(n.j jVar, MenuItem menuItem) {
        ue.i iVar = this.Z;
        if (iVar != null) {
            iVar.c(jVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.h2
    public final void m(n.j jVar, n.l lVar) {
        ue.i iVar = this.Z;
        if (iVar != null) {
            iVar.m(jVar, lVar);
        }
    }

    @Override // androidx.appcompat.widget.g2
    public final t1 o(Context context, boolean z5) {
        k2 k2Var = new k2(context, z5);
        k2Var.setHoverListener(this);
        return k2Var;
    }
}
