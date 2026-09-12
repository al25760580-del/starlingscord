package androidx.recyclerview.widget;

import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes.dex */
public final class ViewInfoStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f2551a = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.k f2552b = new s.k();

    public interface ProcessCallback {
        void a(RecyclerView.ViewHolder viewHolder);

        void b(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);
    }

    public final void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        SimpleArrayMap simpleArrayMap = this.f2551a;
        u1 u1VarA = (u1) simpleArrayMap.get(viewHolder);
        if (u1VarA == null) {
            u1VarA = u1.a();
            simpleArrayMap.put(viewHolder, u1VarA);
        }
        u1VarA.f2711c = itemHolderInfo;
        u1VarA.f2709a |= 8;
    }

    public final RecyclerView.ItemAnimator.ItemHolderInfo b(RecyclerView.ViewHolder viewHolder, int i7) {
        u1 u1Var;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        SimpleArrayMap simpleArrayMap = this.f2551a;
        int iD = simpleArrayMap.d(viewHolder);
        if (iD >= 0 && (u1Var = (u1) simpleArrayMap.i(iD)) != null) {
            int i10 = u1Var.f2709a;
            if ((i10 & i7) != 0) {
                int i11 = i10 & (~i7);
                u1Var.f2709a = i11;
                if (i7 == 4) {
                    itemHolderInfo = u1Var.f2710b;
                } else {
                    if (i7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    itemHolderInfo = u1Var.f2711c;
                }
                if ((i11 & 12) == 0) {
                    simpleArrayMap.g(iD);
                    u1Var.f2709a = 0;
                    u1Var.f2710b = null;
                    u1Var.f2711c = null;
                    u1.f2708d.release(u1Var);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        u1 u1Var = (u1) this.f2551a.get(viewHolder);
        if (u1Var == null) {
            return;
        }
        u1Var.f2709a &= -2;
    }

    public final void d(RecyclerView.ViewHolder viewHolder) {
        s.k kVar = this.f2552b;
        for (int iF = kVar.f() - 1; iF >= 0; iF--) {
            if (viewHolder == kVar.g(iF)) {
                Object[] objArr = kVar.f19638i;
                Object obj = objArr[iF];
                Object obj2 = s.l.f19640a;
                if (obj == obj2) {
                    break;
                }
                objArr[iF] = obj2;
                kVar.f19636d = true;
                break;
            }
        }
        u1 u1Var = (u1) this.f2551a.remove(viewHolder);
        if (u1Var != null) {
            u1Var.f2709a = 0;
            u1Var.f2710b = null;
            u1Var.f2711c = null;
            u1.f2708d.release(u1Var);
        }
    }
}
