package we;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Executor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g f22201e = new g(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ g f22202i = new g(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22203d;

    public /* synthetic */ g(int i7) {
        this.f22203d = i7;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f22203d) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
