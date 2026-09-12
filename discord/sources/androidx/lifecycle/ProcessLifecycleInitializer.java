package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lj3/b;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements j3.b {
    @Override // j3.b
    public final Object create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        j3.a aVarC = j3.a.c(context);
        Intrinsics.checkNotNullExpressionValue(aVarC, "getInstance(...)");
        if (!aVarC.f13643b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        AtomicBoolean atomicBoolean = s.f2388a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!s.f2388a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.F;
        Intrinsics.checkNotNullParameter(context, "context");
        ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.F;
        processLifecycleOwner2.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        processLifecycleOwner2.f2322w = new Handler();
        processLifecycleOwner2.f2323x.f(n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new d0(processLifecycleOwner2));
        return processLifecycleOwner2;
    }

    @Override // j3.b
    public final List dependencies() {
        return kotlin.collections.n0.f14659d;
    }
}
