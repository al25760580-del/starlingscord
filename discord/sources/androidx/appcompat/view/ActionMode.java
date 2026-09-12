package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import n.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionMode {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f764e;

    public interface Callback {
        void a(ActionMode actionMode);

        boolean b(ActionMode actionMode, Menu menu);

        boolean c(ActionMode actionMode, Menu menu);

        boolean d(ActionMode actionMode, MenuItem menuItem);
    }

    public abstract void a();

    public abstract View b();

    public abstract j c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract void g();

    public boolean h() {
        return false;
    }

    public abstract void i(View view);

    public abstract void j(int i7);

    public abstract void k(CharSequence charSequence);

    public abstract void l(int i7);

    public abstract void m(CharSequence charSequence);

    public void n(boolean z5) {
        this.f764e = z5;
    }
}
