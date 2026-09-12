package x8;

import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements DataSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f22653b;

    public d(e eVar, int i7) {
        this.f22653b = eVar;
        this.f22652a = i7;
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onFailure(DataSource dataSource) {
        e.l(this.f22653b, this.f22652a, dataSource);
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onNewResult(DataSource dataSource) {
        Throwable th2;
        int i7;
        if (!dataSource.a()) {
            if (dataSource.isFinished()) {
                e.l(this.f22653b, this.f22652a, dataSource);
                return;
            }
            return;
        }
        e eVar = this.f22653b;
        int i10 = this.f22652a;
        boolean zIsFinished = dataSource.isFinished();
        synchronized (eVar) {
            try {
                int i11 = eVar.f22655i;
                if (dataSource == eVar.n(i10) && i10 != eVar.f22655i) {
                    if (eVar.o() == null || (zIsFinished && i10 < eVar.f22655i)) {
                        eVar.f22655i = i10;
                        i7 = i10;
                    } else {
                        i7 = i11;
                    }
                    while (i11 > i7) {
                        DataSource dataSourceM = eVar.m(i11);
                        if (dataSourceM != null) {
                            dataSourceM.close();
                        }
                        i11--;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (dataSource == eVar.o()) {
            eVar.j(null, i10 == 0 && dataSource.isFinished(), dataSource.getExtras());
        }
        if (eVar.k.incrementAndGet() != eVar.j || (th2 = eVar.f22656l) == null) {
            return;
        }
        eVar.h(th2, eVar.f22657m);
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onProgressUpdate(DataSource dataSource) {
        if (this.f22652a == 0) {
            this.f22653b.i(dataSource.c());
        }
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onCancellation(DataSource dataSource) {
    }
}
