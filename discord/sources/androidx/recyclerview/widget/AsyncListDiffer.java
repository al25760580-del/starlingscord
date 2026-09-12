package androidx.recyclerview.widget;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncListDiffer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f2437h = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f2439b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f2442e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2444g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f2441d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f2443f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f2440c = f2437h;

    public interface ListListener {
        void a(List list, List list2);
    }

    public AsyncListDiffer(b bVar, d dVar) {
        this.f2438a = bVar;
        this.f2439b = dVar;
    }

    public final void a(List list, Runnable runnable) {
        Iterator it = this.f2441d.iterator();
        while (it.hasNext()) {
            ((ListListener) it.next()).a(list, this.f2443f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i7 = this.f2444g + 1;
        this.f2444g = i7;
        List list2 = this.f2442e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f2443f;
        b bVar = this.f2438a;
        if (list == null) {
            int size = list2.size();
            this.f2442e = null;
            this.f2443f = Collections.EMPTY_LIST;
            bVar.c(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            ((Executor) this.f2439b.f2590a).execute(new androidx.fragment.app.s1(this, list2, list, i7, runnable));
            return;
        }
        this.f2442e = list;
        this.f2443f = Collections.unmodifiableList(list);
        bVar.b(0, list.size());
        a(list3, runnable);
    }
}
