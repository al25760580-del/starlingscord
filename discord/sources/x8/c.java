package x8;

import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements DataSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1.c f22649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f22650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.c f22651c;

    public c(l1.c cVar, CountDownLatch countDownLatch, l1.c cVar2) {
        this.f22649a = cVar;
        this.f22650b = countDownLatch;
        this.f22651c = cVar2;
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onCancellation(DataSource dataSource) {
        this.f22650b.countDown();
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onFailure(DataSource dataSource) {
        CountDownLatch countDownLatch = this.f22650b;
        try {
            this.f22651c.f14815a = dataSource.b();
        } finally {
            countDownLatch.countDown();
        }
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onNewResult(DataSource dataSource) {
        CountDownLatch countDownLatch = this.f22650b;
        if (dataSource.isFinished()) {
            try {
                this.f22649a.f14815a = dataSource.getResult();
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onProgressUpdate(DataSource dataSource) {
    }
}
