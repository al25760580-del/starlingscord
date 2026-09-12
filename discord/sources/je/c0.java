package je;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13776b;

    public /* synthetic */ c0(String str, int i7) {
        this.f13775a = i7;
        this.f13776b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f13775a) {
            case 0:
                return new Thread(runnable, this.f13776b);
            default:
                Thread thread = new Thread(runnable, this.f13776b);
                thread.setPriority(10);
                return thread;
        }
    }
}
