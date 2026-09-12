package eh;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import m3.x;
import n.b0;
import n.v;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qg.b f8262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8263e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8264i;

    @Override // n.v
    public final void a(boolean z5) {
        g gVar;
        m3.a aVar;
        if (this.f8263e) {
            return;
        }
        if (z5) {
            this.f8262d.a();
            return;
        }
        qg.b bVar = this.f8262d;
        g gVar2 = bVar.f8246m0;
        if (gVar2 == null || bVar.f8259y == null) {
            return;
        }
        bVar.f8245l0.f8263e = true;
        gVar2.b();
        bVar.f8245l0.f8263e = false;
        if (bVar.f8259y != null && (gVar = bVar.f8246m0) != null && gVar.f8227b.size() == bVar.f8259y.length) {
            for (int i7 = 0; i7 < bVar.f8259y.length; i7++) {
                if (!(bVar.f8246m0.a(i7) instanceof a) || (bVar.f8259y[i7] instanceof b)) {
                    boolean z6 = bVar.f8246m0.a(i7).hasSubMenu() && !(bVar.f8259y[i7] instanceof l);
                    boolean z7 = (bVar.f8246m0.a(i7).hasSubMenu() || (bVar.f8259y[i7] instanceof e)) ? false : true;
                    if ((bVar.f8246m0.a(i7) instanceof a) || (!z6 && !z7)) {
                    }
                }
            }
            int i10 = bVar.E;
            int size = bVar.f8246m0.f8227b.size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem menuItemA = bVar.f8246m0.a(i11);
                if (menuItemA.isChecked()) {
                    bVar.setCheckedItem(menuItemA);
                    bVar.E = menuItemA.getItemId();
                    bVar.F = i11;
                }
            }
            if (i10 != bVar.E && (aVar = bVar.f8235d) != null) {
                x.a(bVar, aVar);
            }
            int i12 = bVar.f8257w;
            boolean z10 = i12 != -1 ? i12 == 0 : bVar.getCurrentVisibleContentItemCount() > 3;
            for (int i13 = 0; i13 < size; i13++) {
                bVar.f8245l0.f8263e = true;
                bVar.f8259y[i13].setExpanded(bVar.f8251r0);
                h hVar = bVar.f8259y[i13];
                if (hVar instanceof e) {
                    e eVar = (e) hVar;
                    eVar.setLabelVisibilityMode(bVar.f8257w);
                    eVar.setItemIconGravity(bVar.f8258x);
                    eVar.setItemGravity(bVar.h0);
                    eVar.setShifting(z10);
                }
                if (bVar.f8246m0.a(i13) instanceof n.l) {
                    bVar.f8259y[i13].a((n.l) bVar.f8246m0.a(i13));
                }
                bVar.f8245l0.f8263e = false;
            }
            return;
        }
        bVar.a();
    }

    @Override // n.v
    public final void c(Context context, n.j jVar) {
        this.f8262d.b(jVar);
    }

    @Override // n.v
    public final boolean d(b0 b0Var) {
        return false;
    }

    @Override // n.v
    public final boolean e() {
        return false;
    }

    @Override // n.v
    public final void f(Parcelable parcelable) {
        if (parcelable instanceof j) {
            qg.b bVar = this.f8262d;
            j jVar = (j) parcelable;
            int i7 = jVar.f8260d;
            int size = bVar.f8246m0.f8227b.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem menuItemA = bVar.f8246m0.a(i10);
                if (i7 == menuItemA.getItemId()) {
                    bVar.E = i7;
                    bVar.F = i10;
                    bVar.setCheckedItem(menuItemA);
                    break;
                }
            }
            Context context = this.f8262d.getContext();
            bh.g gVar = jVar.f8261e;
            SparseArray sparseArray = new SparseArray(gVar.size());
            for (int i11 = 0; i11 < gVar.size(); i11++) {
                int iKeyAt = gVar.keyAt(i11);
                ng.b bVar2 = (ng.b) gVar.valueAt(i11);
                sparseArray.put(iKeyAt, bVar2 != null ? new ng.a(context, bVar2) : null);
            }
            qg.b bVar3 = this.f8262d;
            SparseArray sparseArray2 = bVar3.S;
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                int iKeyAt2 = sparseArray.keyAt(i12);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (ng.a) sparseArray.get(iKeyAt2));
                }
            }
            h[] hVarArr = bVar3.f8259y;
            if (hVarArr != null) {
                for (h hVar : hVarArr) {
                    if (hVar instanceof e) {
                        e eVar = (e) hVar;
                        ng.a aVar = (ng.a) sparseArray2.get(eVar.getId());
                        if (aVar != null) {
                            eVar.setBadge(aVar);
                        }
                    }
                }
            }
        }
    }

    @Override // n.v
    public final int getId() {
        return this.f8264i;
    }

    @Override // n.v
    public final boolean h(n.l lVar) {
        return false;
    }

    @Override // n.v
    public final Parcelable i() {
        j jVar = new j();
        jVar.f8260d = this.f8262d.getSelectedItemId();
        SparseArray<ng.a> badgeDrawables = this.f8262d.getBadgeDrawables();
        bh.g gVar = new bh.g();
        for (int i7 = 0; i7 < badgeDrawables.size(); i7++) {
            int iKeyAt = badgeDrawables.keyAt(i7);
            ng.a aVarValueAt = badgeDrawables.valueAt(i7);
            gVar.put(iKeyAt, aVarValueAt != null ? aVarValueAt.f16809w.f16820a : null);
        }
        jVar.f8261e = gVar;
        return jVar;
    }

    @Override // n.v
    public final boolean k(n.l lVar) {
        return false;
    }

    @Override // n.v
    public final void b(n.j jVar, boolean z5) {
    }
}
