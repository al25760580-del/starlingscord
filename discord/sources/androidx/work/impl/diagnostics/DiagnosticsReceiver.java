package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n8.f;
import v3.q;
import w3.k;
import w3.o;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2843a = q.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        q qVarD = q.d();
        String str = f2843a;
        qVarD.a(str, "Requesting diagnostics");
        try {
            o oVarA = o.a(context);
            Intrinsics.checkNotNullParameter(DiagnosticsWorker.class, "workerClass");
            List listSingletonList = Collections.singletonList(new f(DiagnosticsWorker.class).I());
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new k(oVarA, null, 2, listSingletonList).A0();
        } catch (IllegalStateException e10) {
            q.d().c(str, "WorkManager is not initialized", e10);
        }
    }
}
