package m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import n.y;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.view.ActionMode f15300b;

    public b(Context context, androidx.appcompat.view.ActionMode actionMode) {
        this.f15299a = context;
        this.f15300b = actionMode;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f15300b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f15300b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new y(this.f15299a, this.f15300b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f15300b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f15300b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f15300b.f763d;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f15300b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f15300b.f764e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f15300b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f15300b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f15300b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f15300b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f15300b.f763d = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f15300b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z5) {
        this.f15300b.n(z5);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i7) {
        this.f15300b.j(i7);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i7) {
        this.f15300b.l(i7);
    }
}
