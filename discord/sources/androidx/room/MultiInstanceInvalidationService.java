package androidx.room;

import a3.j;
import a3.k;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f2732e = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f2733i = new k(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f2734v = new j(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f2734v;
    }
}
