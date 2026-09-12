package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements q0, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i.f f1007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l0 f1008e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f1009i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r0 f1010v;

    public k0(r0 r0Var) {
        this.f1010v = r0Var;
    }

    @Override // androidx.appcompat.widget.q0
    public final int a() {
        return 0;
    }

    @Override // androidx.appcompat.widget.q0
    public final void b(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.q0
    public final CharSequence d() {
        return this.f1009i;
    }

    @Override // androidx.appcompat.widget.q0
    public final void dismiss() {
        i.f fVar = this.f1007d;
        if (fVar != null) {
            fVar.dismiss();
            this.f1007d = null;
        }
    }

    @Override // androidx.appcompat.widget.q0
    public final Drawable e() {
        return null;
    }

    @Override // androidx.appcompat.widget.q0
    public final void f(CharSequence charSequence) {
        this.f1009i = charSequence;
    }

    @Override // androidx.appcompat.widget.q0
    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.q0
    public final void i(int i7) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.q0
    public final boolean isShowing() {
        i.f fVar = this.f1007d;
        if (fVar != null) {
            return fVar.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.q0
    public final void j(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.q0
    public final void k(int i7, int i10) {
        if (this.f1008e == null) {
            return;
        }
        r0 r0Var = this.f1010v;
        i.e eVar = new i.e(r0Var.getPopupContext());
        CharSequence charSequence = this.f1009i;
        if (charSequence != null) {
            eVar.setTitle(charSequence);
        }
        l0 l0Var = this.f1008e;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        i.b bVar = eVar.f11198a;
        bVar.f11160o = l0Var;
        bVar.f11161p = this;
        bVar.f11164s = selectedItemPosition;
        bVar.f11163r = true;
        i.f fVarCreate = eVar.create();
        this.f1007d = fVarCreate;
        AlertController$RecycleListView alertController$RecycleListView = fVarCreate.f11208x.f11178f;
        alertController$RecycleListView.setTextDirection(i7);
        alertController$RecycleListView.setTextAlignment(i10);
        this.f1007d.show();
    }

    @Override // androidx.appcompat.widget.q0
    public final int l() {
        return 0;
    }

    @Override // androidx.appcompat.widget.q0
    public final void n(ListAdapter listAdapter) {
        this.f1008e = (l0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        r0 r0Var = this.f1010v;
        r0Var.setSelection(i7);
        if (r0Var.getOnItemClickListener() != null) {
            r0Var.performItemClick(null, i7, this.f1008e.getItemId(i7));
        }
        dismiss();
    }
}
