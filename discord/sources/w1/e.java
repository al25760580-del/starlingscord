package w1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import n1.h;

/* JADX INFO: loaded from: classes.dex */
public final class e extends t1.d {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f21993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f21994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f21995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CancellationSignal f21996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u1.c f21997i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21993e = context;
        this.f21997i = new u1.c(this, new Handler(Looper.getMainLooper()), 2);
    }
}
