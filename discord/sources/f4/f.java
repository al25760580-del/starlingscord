package f4;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8833e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8834i;

    public /* synthetic */ f(int i7, int i10, Object obj) {
        this.f8832d = i10;
        this.f8834i = obj;
        this.f8833e = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8832d) {
            case 0:
                ue.i this$0 = (ue.i) this.f8834i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WorkDatabase workDatabase = (WorkDatabase) this$0.f21117d;
                Long lF = workDatabase.l().F("next_job_scheduler_id");
                int i7 = 0;
                int iLongValue = lF != null ? (int) lF.longValue() : 0;
                workDatabase.l().G(new e4.d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                if (iLongValue < 0 || iLongValue > this.f8833e) {
                    workDatabase.l().G(new e4.d("next_job_scheduler_id", Long.valueOf(1)));
                } else {
                    i7 = iLongValue;
                }
                return Integer.valueOf(i7);
            default:
                l4.h hVar = (l4.h) this.f8834i;
                boolean z5 = hVar.G;
                int i10 = this.f8833e;
                if (!z5) {
                    return l4.m.e(hVar.getContext(), null, i10);
                }
                Context context = hVar.getContext();
                return l4.m.e(context, l4.m.j(context, i10), i10);
        }
    }
}
