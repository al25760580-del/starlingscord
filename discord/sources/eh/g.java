package eh;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.j f8226a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8228c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8229d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8230e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8227b = new ArrayList();

    public g(n.j jVar) {
        this.f8226a = jVar;
        b();
    }

    public final MenuItem a(int i7) {
        return (MenuItem) this.f8227b.get(i7);
    }

    public final void b() {
        ArrayList arrayList = this.f8227b;
        arrayList.clear();
        this.f8228c = 0;
        this.f8229d = 0;
        this.f8230e = 0;
        int i7 = 0;
        while (true) {
            n.j jVar = this.f8226a;
            if (i7 >= jVar.f16147f.size()) {
                break;
            }
            MenuItem item = jVar.getItem(i7);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(kk.b.e(1, arrayList) instanceof a) && item.isVisible()) {
                    arrayList.add(new a());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i10 = 0; i10 < subMenu.size(); i10++) {
                    MenuItem item2 = subMenu.getItem(i10);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.f8228c++;
                    if (item2.isVisible()) {
                        this.f8229d++;
                    }
                }
                arrayList.add(new a());
            } else {
                arrayList.add(item);
                this.f8228c++;
                if (item.isVisible()) {
                    this.f8229d++;
                    this.f8230e++;
                }
            }
            i7++;
        }
        if (arrayList.isEmpty() || !(kk.b.e(1, arrayList) instanceof a)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
