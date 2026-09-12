package n;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class f implements v, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f16129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f16130e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f16131i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ExpandedMenuView f16132v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u f16133w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f16134x;

    public f(Context context) {
        this.f16129d = context;
        this.f16130e = LayoutInflater.from(context);
    }

    @Override // n.v
    public final void a(boolean z5) {
        e eVar = this.f16134x;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // n.v
    public final void b(j jVar, boolean z5) {
        u uVar = this.f16133w;
        if (uVar != null) {
            uVar.b(jVar, z5);
        }
    }

    @Override // n.v
    public final void c(Context context, j jVar) {
        if (this.f16129d != null) {
            this.f16129d = context;
            if (this.f16130e == null) {
                this.f16130e = LayoutInflater.from(context);
            }
        }
        this.f16131i = jVar;
        e eVar = this.f16134x;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // n.v
    public final boolean d(b0 b0Var) {
        boolean zHasVisibleItems = b0Var.hasVisibleItems();
        Context context = b0Var.f16142a;
        if (!zHasVisibleItems) {
            return false;
        }
        k kVar = new k();
        kVar.f16164d = b0Var;
        i.e eVar = new i.e(context);
        f fVar = new f(eVar.getContext());
        kVar.f16166i = fVar;
        fVar.f16133w = kVar;
        b0Var.b(fVar, context);
        f fVar2 = kVar.f16166i;
        if (fVar2.f16134x == null) {
            fVar2.f16134x = new e(fVar2);
        }
        e eVar2 = fVar2.f16134x;
        i.b bVar = eVar.f11198a;
        bVar.f11160o = eVar2;
        bVar.f11161p = kVar;
        View view = b0Var.f16154o;
        if (view != null) {
            bVar.f11152e = view;
        } else {
            bVar.f11150c = b0Var.f16153n;
            eVar.setTitle(b0Var.f16152m);
        }
        bVar.f11158m = kVar;
        i.f fVarCreate = eVar.create();
        kVar.f16165e = fVarCreate;
        fVarCreate.setOnDismissListener(kVar);
        WindowManager.LayoutParams attributes = kVar.f16165e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        kVar.f16165e.show();
        u uVar = this.f16133w;
        if (uVar == null) {
            return true;
        }
        uVar.f(b0Var);
        return true;
    }

    @Override // n.v
    public final boolean e() {
        return false;
    }

    @Override // n.v
    public final void f(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f16132v.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // n.v
    public final int getId() {
        return 0;
    }

    @Override // n.v
    public final boolean h(l lVar) {
        return false;
    }

    @Override // n.v
    public final Parcelable i() {
        if (this.f16132v == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f16132v;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // n.v
    public final void j(u uVar) {
        throw null;
    }

    @Override // n.v
    public final boolean k(l lVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        this.f16131i.q(this.f16134x.getItem(i7), this, 0);
    }
}
