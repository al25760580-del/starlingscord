package ar;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends CancellationException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Job f2971d;

    public u1(String str, Job job) {
        super(str);
        this.f2971d = job;
    }
}
