package xe;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends eg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f22936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f22936b = eVar;
        this.f22935a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i7);
            return;
        }
        int i10 = f.f22923a;
        e eVar = this.f22936b;
        Context context = this.f22935a;
        int iB = eVar.b(context, i10);
        AtomicBoolean atomicBoolean = i.f22925a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = eVar.a(context, "n", iB);
            eVar.g(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
