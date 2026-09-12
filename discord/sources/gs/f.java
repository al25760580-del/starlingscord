package gs;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cs.h f10207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile AtomicInteger f10208e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f10209i;

    public f(i this$0, cs.h responseCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        this.f10209i = this$0;
        this.f10207d = responseCallback;
        this.f10208e = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        Throwable th2;
        IOException e10;
        OkHttpClient okHttpClient;
        String strStringPlus = Intrinsics.stringPlus("OkHttp ", this.f10209i.f10213e.f17368a.f());
        i iVar = this.f10209i;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strStringPlus);
        try {
            iVar.f10216w.i();
            try {
                try {
                    z5 = true;
                    try {
                        this.f10207d.onResponse(iVar, iVar.g());
                        okHttpClient = iVar.f10212d;
                    } catch (IOException e11) {
                        e10 = e11;
                        if (z5) {
                            ls.n nVar = ls.n.f15297a;
                            ls.n nVar2 = ls.n.f15297a;
                            String strStringPlus2 = Intrinsics.stringPlus("Callback failure for ", i.a(iVar));
                            nVar2.getClass();
                            ls.n.i(4, strStringPlus2, e10);
                        } else {
                            this.f10207d.onFailure(iVar, e10);
                        }
                        okHttpClient = iVar.f10212d;
                    } catch (Throwable th3) {
                        th2 = th3;
                        iVar.cancel();
                        if (!z5) {
                            IOException iOException = new IOException(Intrinsics.stringPlus("canceled due to ", th2));
                            rn.f.a(iOException, th2);
                            this.f10207d.onFailure(iVar, iOException);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    iVar.f10212d.f17337d.d(this);
                    throw th4;
                }
            } catch (IOException e12) {
                z5 = false;
                e10 = e12;
            } catch (Throwable th5) {
                z5 = false;
                th2 = th5;
            }
            okHttpClient.f17337d.d(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th6) {
            threadCurrentThread.setName(name);
            throw th6;
        }
    }
}
