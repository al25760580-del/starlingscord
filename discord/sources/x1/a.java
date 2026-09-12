package x1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import n1.h;
import t1.d;
import u1.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f22587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f22588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f22589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CancellationSignal f22590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f22591i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22587e = context;
        this.f22591i = new c(this, new Handler(Looper.getMainLooper()), 3);
    }
}
