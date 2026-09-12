package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import n.j;
import n.q;
import n.y;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.ActionMode.Callback f776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f778c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SimpleArrayMap f779d = new SimpleArrayMap(0);

    public b(Context context, android.view.ActionMode.Callback callback) {
        this.f777b = context;
        this.f776a = callback;
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final void a(ActionMode actionMode) {
        this.f776a.onDestroyActionMode(e(actionMode));
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean b(ActionMode actionMode, Menu menu) {
        m.b bVarE = e(actionMode);
        SimpleArrayMap simpleArrayMap = this.f779d;
        Menu yVar = (Menu) simpleArrayMap.get(menu);
        if (yVar == null) {
            yVar = new y(this.f777b, (j) menu);
            simpleArrayMap.put(menu, yVar);
        }
        return this.f776a.onCreateActionMode(bVarE, yVar);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean c(ActionMode actionMode, Menu menu) {
        m.b bVarE = e(actionMode);
        SimpleArrayMap simpleArrayMap = this.f779d;
        Menu yVar = (Menu) simpleArrayMap.get(menu);
        if (yVar == null) {
            yVar = new y(this.f777b, (j) menu);
            simpleArrayMap.put(menu, yVar);
        }
        return this.f776a.onPrepareActionMode(bVarE, yVar);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        return this.f776a.onActionItemClicked(e(actionMode), new q(this.f777b, (d1.a) menuItem));
    }

    public final m.b e(ActionMode actionMode) {
        ArrayList arrayList = this.f778c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            m.b bVar = (m.b) arrayList.get(i7);
            if (bVar != null && bVar.f15300b == actionMode) {
                return bVar;
            }
        }
        m.b bVar2 = new m.b(this.f777b, actionMode);
        arrayList.add(bVar2);
        return bVar2;
    }
}
