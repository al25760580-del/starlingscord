package x8;

import com.facebook.common.internal.Supplier;
import com.facebook.datasource.DataSource;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f22654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22655i;
    public int j;
    public AtomicInteger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f22656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map f22657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f22658n;

    public e(f fVar) {
        this.f22658n = fVar;
        if (this.k != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new AtomicInteger(0);
                    int size = this.f22658n.f22659a.size();
                    this.j = size;
                    this.f22655i = size;
                    this.f22654h = new ArrayList(size);
                    for (int i7 = 0; i7 < size; i7++) {
                        DataSource dataSource = (DataSource) ((Supplier) this.f22658n.f22659a.get(i7)).get();
                        this.f22654h.add(dataSource);
                        dataSource.d(new d(this, i7), l8.a.f14971d);
                        if (dataSource.a()) {
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void l(e eVar, int i7, DataSource dataSource) {
        DataSource dataSourceM;
        Throwable th2;
        synchronized (eVar) {
            if (dataSource == eVar.o()) {
                dataSourceM = null;
            } else {
                dataSourceM = dataSource == eVar.n(i7) ? eVar.m(i7) : dataSource;
            }
        }
        if (dataSourceM != null) {
            dataSourceM.close();
        }
        if (i7 == 0) {
            eVar.f22656l = dataSource.b();
            eVar.f22657m = dataSource.getExtras();
        }
        if (eVar.k.incrementAndGet() != eVar.j || (th2 = eVar.f22656l) == null) {
            return;
        }
        eVar.h(th2, eVar.f22657m);
    }

    @Override // x8.a, com.facebook.datasource.DataSource
    public final synchronized boolean a() {
        DataSource dataSourceO;
        dataSourceO = o();
        return dataSourceO != null && dataSourceO.a();
    }

    @Override // x8.a, com.facebook.datasource.DataSource
    public final boolean close() {
        synchronized (this) {
            try {
                if (!super.close()) {
                    return false;
                }
                ArrayList arrayList = this.f22654h;
                this.f22654h = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    DataSource dataSource = (DataSource) arrayList.get(i7);
                    if (dataSource != null) {
                        dataSource.close();
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x8.a, com.facebook.datasource.DataSource
    public final synchronized Object getResult() {
        DataSource dataSourceO;
        dataSourceO = o();
        return dataSourceO != null ? dataSourceO.getResult() : null;
    }

    public final synchronized DataSource m(int i7) {
        DataSource dataSource;
        ArrayList arrayList = this.f22654h;
        dataSource = null;
        if (arrayList != null && i7 < arrayList.size()) {
            dataSource = (DataSource) this.f22654h.set(i7, null);
        }
        return dataSource;
    }

    public final synchronized DataSource n(int i7) {
        ArrayList arrayList;
        arrayList = this.f22654h;
        return (arrayList == null || i7 >= arrayList.size()) ? null : (DataSource) this.f22654h.get(i7);
    }

    public final synchronized DataSource o() {
        return n(this.f22655i);
    }
}
