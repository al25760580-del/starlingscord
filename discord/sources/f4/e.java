package f4;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import androidx.work.impl.WorkDatabase;
import io.sentry.i0;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8831e;

    public /* synthetic */ e(int i7, Object obj) {
        this.f8830d = i7;
        this.f8831e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8830d) {
            case 0:
                ue.i this$0 = (ue.i) this.f8831e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WorkDatabase workDatabase = (WorkDatabase) this$0.f21117d;
                Long lF = workDatabase.l().F("next_alarm_manager_id");
                int iLongValue = lF != null ? (int) lF.longValue() : 0;
                workDatabase.l().G(new e4.d("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            case 1:
                ga.b this$1 = (ga.b) this.f8831e;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                try {
                    this$1.f9530g.j();
                    ((j8.g) this$1.f9524a).a();
                    return null;
                } catch (Throwable th2) {
                    Intrinsics.checkNotNullParameter(th2, "th");
                    throw th2;
                }
            case 2:
                i0 i0Var = (i0) this.f8831e;
                try {
                    i0Var.f12736e.getClass();
                    i0Var.f12733b = InetAddress.getLocalHost().getCanonicalHostName();
                    i0Var.f12734c = System.currentTimeMillis() + i0Var.f12732a;
                    return null;
                } finally {
                    i0Var.f12735d.set(false);
                }
            default:
                return MediaCodec.createByCodecName(((MediaCodecInfo) this.f8831e).getName());
        }
    }
}
