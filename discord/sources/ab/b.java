package ab;

import com.facebook.react.jstasks.HeadlessJsTaskContext;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HeadlessJsTaskContext f299e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f300i;

    public /* synthetic */ b(HeadlessJsTaskContext headlessJsTaskContext, int i7, int i10) {
        this.f298d = i10;
        this.f299e = headlessJsTaskContext;
        this.f300i = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f298d) {
            case 0:
                this.f299e.finishTask(this.f300i);
                break;
            default:
                HeadlessJsTaskContext.finishTask$lambda$4(this.f299e, this.f300i);
                break;
        }
    }
}
