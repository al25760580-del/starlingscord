package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import g4.j;
import hi.o;
import s9.a;
import v3.h;
import v3.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends p {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f2812w;

    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // v3.p
    public final ListenableFuture a() {
        j jVar = new j();
        this.f21414e.f2815c.execute(new o(this, jVar, 20, false));
        return jVar;
    }

    @Override // v3.p
    public final j d() {
        this.f2812w = new j();
        this.f21414e.f2815c.execute(new a(1, this));
        return this.f2812w;
    }

    public abstract v3.o f();

    public h g() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
