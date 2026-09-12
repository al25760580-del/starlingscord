package n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f16135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16136e = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16137i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f16138v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LayoutInflater f16139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f16140x;

    public g(j jVar, LayoutInflater layoutInflater, boolean z5, int i7) {
        this.f16138v = z5;
        this.f16139w = layoutInflater;
        this.f16135d = jVar;
        this.f16140x = i7;
        a();
    }

    public final void a() {
        j jVar = this.f16135d;
        l lVar = jVar.f16161v;
        if (lVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((l) arrayList.get(i7)) == lVar) {
                    this.f16136e = i7;
                    return;
                }
            }
        }
        this.f16136e = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l getItem(int i7) {
        ArrayList arrayListL;
        boolean z5 = this.f16138v;
        j jVar = this.f16135d;
        if (z5) {
            jVar.i();
            arrayListL = jVar.j;
        } else {
            arrayListL = jVar.l();
        }
        int i10 = this.f16136e;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return (l) arrayListL.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z5 = this.f16138v;
        j jVar = this.f16135d;
        if (z5) {
            jVar.i();
            arrayListL = jVar.j;
        } else {
            arrayListL = jVar.l();
        }
        return this.f16136e < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        boolean z5 = false;
        if (view == null) {
            view = this.f16139w.inflate(this.f16140x, viewGroup, false);
        }
        int i10 = getItem(i7).f16168b;
        int i11 = i7 - 1;
        int i12 = i11 >= 0 ? getItem(i11).f16168b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f16135d.m() && i10 != i12) {
            z5 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z5);
        w wVar = (w) view;
        if (this.f16137i) {
            listMenuItemView.setForceShowIcon(true);
        }
        wVar.a(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
