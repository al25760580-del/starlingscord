package f9;

import com.facebook.datasource.DataSource;
import com.facebook.drawee.generic.GenericDraweeHierarchy;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends x8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f9023c;

    public a(c cVar, String str, boolean z5) {
        this.f9023c = cVar;
        this.f9021a = str;
        this.f9022b = z5;
    }

    @Override // x8.b
    public final void onFailureImpl(DataSource dataSource) {
        this.f9023c.k(this.f9021a, dataSource, dataSource.b(), true);
    }

    @Override // x8.b
    public final void onNewResultImpl(DataSource dataSource) {
        boolean zIsFinished = dataSource.isFinished();
        float fC = dataSource.c();
        Object result = dataSource.getResult();
        c cVar = this.f9023c;
        if (result != null) {
            cVar.l(this.f9021a, dataSource, result, fC, zIsFinished, this.f9022b, false);
        } else if (zIsFinished) {
            cVar.k(this.f9021a, dataSource, new NullPointerException(), true);
        }
    }

    @Override // x8.b, com.facebook.datasource.DataSubscriber
    public final void onProgressUpdate(DataSource dataSource) {
        boolean zIsFinished = dataSource.isFinished();
        float fC = dataSource.c();
        String str = this.f9021a;
        c cVar = this.f9023c;
        if (!cVar.g(str, dataSource)) {
            cVar.h("ignore_old_datasource @ onProgress", null);
            dataSource.close();
        } else {
            if (zIsFinished) {
                return;
            }
            GenericDraweeHierarchy genericDraweeHierarchy = cVar.f9032f;
            com.facebook.drawee.drawable.d dVar = genericDraweeHierarchy.f4701e;
            if (dVar.c(3) == null) {
                return;
            }
            dVar.O++;
            genericDraweeHierarchy.o(fC);
            dVar.a();
        }
    }
}
