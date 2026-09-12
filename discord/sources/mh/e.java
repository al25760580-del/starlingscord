package mh;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import we.i;
import we.j;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Handler.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15796e;

    public /* synthetic */ e(int i7, Object obj) {
        this.f15795d = i7;
        this.f15796e = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f15795d) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                l1.c cVar = (l1.c) this.f15796e;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (cVar.f14815a) {
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                int i7 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    kk.b.q(i7, "Received response to request: ", "MessengerIpcClient");
                }
                i iVar = (i) this.f15796e;
                synchronized (iVar) {
                    try {
                        j jVar = (j) iVar.f22210w.get(i7);
                        if (jVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i7);
                            return true;
                        }
                        iVar.f22210w.remove(i7);
                        iVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            jVar.b(new ag.b(8, "Not supported by GmsCore", null));
                            return true;
                        }
                        switch (jVar.f22216e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    jVar.c(null);
                                    return true;
                                }
                                jVar.b(new ag.b(8, "Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                jVar.c(bundle);
                                return true;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
        }
    }
}
