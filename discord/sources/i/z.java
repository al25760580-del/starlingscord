package i;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentDialog;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.view.ActionMode;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends ComponentDialog implements i {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.appcompat.app.a f11280v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f11281w;

    /* JADX WARN: Type inference failed for: r2v2, types: [i.y] */
    public z(ContextThemeWrapper contextThemeWrapper, int i7) {
        int i10;
        if (i7 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = i7;
        }
        super(contextThemeWrapper, i10);
        final f fVar = (f) this;
        this.f11281w = new androidx.core.view.j() { // from class: i.y
            @Override // androidx.core.view.j
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return fVar.d(keyEvent);
            }
        };
        AppCompatDelegate appCompatDelegateC = c();
        if (i7 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i7 = typedValue2.resourceId;
        }
        ((androidx.appcompat.app.a) appCompatDelegateC).f753q0 = i7;
        appCompatDelegateC.n();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().a(view, layoutParams);
    }

    public final AppCompatDelegate c() {
        if (this.f11280v == null) {
            f4.l lVar = AppCompatDelegate.f732d;
            this.f11280v = new androidx.appcompat.app.a(getContext(), getWindow(), this, this);
        }
        return this.f11280v;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().p();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return io.sentry.config.a.m(this.f11281w, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i7) {
        return c().d(i7);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().k();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().j();
        super.onCreate(bundle);
        c().n();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c().t();
    }

    @Override // i.i
    public final ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(int i7) {
        b();
        c().w(i7);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().C(charSequence);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view) {
        b();
        c().x(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i7) {
        super.setTitle(i7);
        c().C(getContext().getString(i7));
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().y(view, layoutParams);
    }

    @Override // i.i
    public final void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // i.i
    public final void onSupportActionModeStarted(ActionMode actionMode) {
    }
}
