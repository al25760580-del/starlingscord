package as;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import net.time4j.x0;
import xr.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Iterable, Comparator {
    public static final b[] E;
    public static final c F;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final boolean f2993x = Boolean.getBoolean("net.time4j.scale.leapseconds.suppressed");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f2994y = Boolean.getBoolean("net.time4j.scale.leapseconds.final");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f2995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2996e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b[] f2997i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile b[] f2998v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f2999w;

    static {
        System.getProperty("net.time4j.scale.leapseconds.path", "data/leapseconds.data");
        E = new b[0];
        F = new c();
    }

    public c() {
        a aVar;
        int i7;
        boolean z5 = false;
        if (f2993x) {
            aVar = null;
            i7 = 0;
        } else {
            aVar = null;
            i7 = 0;
            for (a aVar2 : vr.c.f21955b.d(a.class)) {
                int size = Collections.unmodifiableMap(((bs.a) aVar2).f3394f).size();
                if (size > i7) {
                    aVar = aVar2;
                    i7 = size;
                }
            }
        }
        if (aVar == null || i7 == 0) {
            this.f2995d = null;
            this.f2996e = Collections.EMPTY_LIST;
            b[] bVarArr = E;
            this.f2997i = bVarArr;
            this.f2998v = bVarArr;
            this.f2999w = false;
            return;
        }
        TreeSet<b> treeSet = new TreeSet(this);
        bs.a aVar3 = (bs.a) aVar;
        for (Map.Entry entry : Collections.unmodifiableMap(aVar3.f3394f).entrySet()) {
            vr.a aVar4 = (vr.a) entry.getKey();
            treeSet.add(new b(aVar4, yk.a.C(yk.a.E(m.T(aVar4.a(), aVar4.b(), aVar4.c()), 40587L), 86400L) - 62985601, ((Integer) entry.getValue()).intValue()));
        }
        ArrayList arrayList = new ArrayList(treeSet.size());
        int iB = 0;
        for (b bVar : treeSet) {
            if (bVar.d() == Long.MIN_VALUE) {
                iB += bVar.b();
                arrayList.add(new b(bVar, iB));
            } else {
                arrayList.add(bVar);
            }
        }
        treeSet.clear();
        treeSet.addAll(arrayList);
        boolean z6 = f2994y;
        if (z6) {
            this.f2996e = Collections.unmodifiableList(new ArrayList(treeSet));
        } else {
            this.f2996e = new CopyOnWriteArrayList(treeSet);
        }
        List list = this.f2996e;
        ArrayList arrayList2 = new ArrayList(list.size());
        arrayList2.addAll(list);
        Collections.reverse(arrayList2);
        b[] bVarArr2 = (b[]) arrayList2.toArray(new b[arrayList2.size()]);
        this.f2997i = bVarArr2;
        this.f2998v = bVarArr2;
        this.f2995d = aVar;
        if (!z6) {
            this.f2999w = true;
            return;
        }
        boolean zIsEmpty = aVar3.f3394f.isEmpty();
        boolean z7 = !zIsEmpty;
        if (!zIsEmpty) {
            Iterator it = this.f2996e.iterator();
            while (it.hasNext()) {
                if (((b) it.next()).b() < 0) {
                    z5 = true;
                    break;
                }
            }
            z7 = z5;
        }
        this.f2999w = z7;
    }

    public final long b(long j) {
        long j5 = j - 63072000;
        if (j > 0) {
            for (b bVar : d()) {
                if (bVar.c() < j5) {
                    return yk.a.A(j5, bVar.d() - bVar.c());
                }
            }
        }
        return j5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        vr.a aVarA = ((b) obj).a();
        vr.a aVarA2 = ((b) obj2).a();
        int iA = aVarA.a();
        int iA2 = aVarA2.a();
        if (iA < iA2) {
            return -1;
        }
        if (iA > iA2) {
            return 1;
        }
        int iB = aVarA.b();
        int iB2 = aVarA2.b();
        if (iB < iB2) {
            return -1;
        }
        if (iB > iB2) {
            return 1;
        }
        int iC = aVarA.c();
        int iC2 = aVarA2.c();
        if (iC < iC2) {
            return -1;
        }
        return iC == iC2 ? 0 : 1;
    }

    public final b[] d() {
        return (f2993x || f2994y) ? this.f2997i : this.f2998v;
    }

    public final boolean e() {
        return !this.f2996e.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Collections.unmodifiableList(Arrays.asList(d())).iterator();
    }

    public final long j(long j) {
        if (j <= 0) {
            return j + 63072000;
        }
        for (b bVar : d()) {
            if (bVar.d() - ((long) bVar.b()) < j || (this.f2999w && bVar.b() < 0 && bVar.d() < j)) {
                j = yk.a.A(j, bVar.c() - bVar.d());
                break;
            }
        }
        return j + 63072000;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(RecyclerView.ItemAnimator.FLAG_MOVED);
        sb2.append("[PROVIDER=");
        a aVar = this.f2995d;
        sb2.append(aVar);
        if (aVar != null) {
            sb2.append(",EXPIRES=");
            if (!e()) {
                throw new IllegalStateException("Leap seconds not activated.");
            }
            x0 x0Var = ((bs.a) aVar).f3393e;
            sb2.append(String.format("%1$04d-%2$02d-%3$02d", Integer.valueOf(x0Var.a()), Integer.valueOf(x0Var.b()), Integer.valueOf(x0Var.c())));
        }
        sb2.append(",EVENTS=[");
        if (e()) {
            boolean z5 = true;
            for (Object obj : this.f2996e) {
                if (z5) {
                    z5 = false;
                } else {
                    sb2.append('|');
                }
                sb2.append(obj);
            }
        } else {
            sb2.append("NOT SUPPORTED");
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
