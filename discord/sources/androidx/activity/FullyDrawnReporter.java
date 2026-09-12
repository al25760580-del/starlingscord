package androidx.activity;

import e.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FullyDrawnReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f708d;

    public FullyDrawnReporter(ComponentActivity.ReportFullyDrawnExecutor executor, h reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f705a = executor;
        this.f706b = new Object();
        this.f708d = new ArrayList();
    }

    public final void a() {
        synchronized (this.f706b) {
            try {
                this.f707c = true;
                Iterator it = this.f708d.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f708d.clear();
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
