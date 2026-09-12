package we;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.u0;
import e4.l;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f22205e;

    public /* synthetic */ h(i iVar, int i7) {
        this.f22204d = i7;
        this.f22205e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22204d) {
            case 0:
                break;
            case 1:
                i iVar = this.f22205e;
                synchronized (iVar) {
                    if (iVar.f22206d == 1) {
                        iVar.a("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.f22205e.a("Service disconnected");
                return;
        }
        while (true) {
            i iVar2 = this.f22205e;
            synchronized (iVar2) {
                try {
                    if (iVar2.f22206d != 2) {
                        return;
                    }
                    if (iVar2.f22209v.isEmpty()) {
                        iVar2.c();
                        return;
                    }
                    j jVar = (j) iVar2.f22209v.poll();
                    iVar2.f22210w.put(jVar.f22212a, jVar);
                    ((ScheduledExecutorService) iVar2.f22211x.f22221d).schedule(new u0(23, iVar2, jVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                    }
                    k kVar = iVar2.f22211x;
                    Messenger messenger = iVar2.f22207e;
                    int i7 = jVar.f22214c;
                    Context context = (Context) kVar.f22220c;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i7;
                    messageObtain.arg1 = jVar.f22212a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", jVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", jVar.f22215d);
                    messageObtain.setData(bundle);
                    try {
                        l lVar = iVar2.f22208i;
                        Messenger messenger2 = (Messenger) lVar.f7989e;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            f fVar = (f) lVar.f7990i;
                            if (fVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = fVar.f22200d;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e10) {
                        iVar2.a(e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
