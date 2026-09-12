package af;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends eg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f497a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(f fVar, Looper looper) {
        super(looper, 3);
        this.f497a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        u uVar;
        f fVar = this.f497a;
        if (fVar.S.get() != message.arg1) {
            int i7 = message.what;
            if ((i7 == 2 || i7 == 1 || i7 == 7) && (uVar = (u) message.obj) != null) {
                synchronized (uVar) {
                    uVar.f485a = null;
                }
                f fVar2 = uVar.f487c;
                synchronized (fVar2.H) {
                    fVar2.H.remove(uVar);
                }
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || i10 == 4 || i10 == 5) && !fVar.d()) {
            u uVar2 = (u) message.obj;
            if (uVar2 != null) {
                synchronized (uVar2) {
                    uVar2.f485a = null;
                }
                f fVar3 = uVar2.f487c;
                synchronized (fVar3.H) {
                    fVar3.H.remove(uVar2);
                }
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            fVar.P = new xe.b(message.arg2, null, null);
            if (!fVar.Q && !TextUtils.isEmpty(fVar.p()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(fVar.p());
                    if (!fVar.Q) {
                        fVar.u(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            xe.b bVar = fVar.P;
            if (bVar == null) {
                bVar = new xe.b(8, null, null);
            }
            fVar.F.g(bVar);
            System.currentTimeMillis();
            return;
        }
        if (i11 == 5) {
            xe.b bVar2 = fVar.P;
            if (bVar2 == null) {
                bVar2 = new xe.b(8, null, null);
            }
            fVar.F.g(bVar2);
            System.currentTimeMillis();
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            fVar.F.g(new xe.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i11 == 6) {
            fVar.u(5, null);
            i iVar = fVar.K;
            if (iVar != null) {
                ((ye.j) iVar.f446a).k(message.arg2);
            }
            System.currentTimeMillis();
            fVar.t(5, 1, null);
            return;
        }
        if (i11 == 2 && !fVar.isConnected()) {
            u uVar3 = (u) message.obj;
            if (uVar3 != null) {
                synchronized (uVar3) {
                    uVar3.f485a = null;
                }
                f fVar4 = uVar3.f487c;
                synchronized (fVar4.H) {
                    fVar4.H.remove(uVar3);
                }
                return;
            }
            return;
        }
        int i12 = message.what;
        if (i12 != 2 && i12 != 1 && i12 != 7) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i12);
            Log.wtf("GmsClient", sb2.toString(), new Exception());
            return;
        }
        u uVar4 = (u) message.obj;
        synchronized (uVar4) {
            try {
                bool = uVar4.f485a;
                if (uVar4.f486b) {
                    String string = uVar4.toString();
                    StringBuilder sb3 = new StringBuilder(string.length() + 47);
                    sb3.append("Callback proxy ");
                    sb3.append(string);
                    sb3.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb3.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            f fVar5 = uVar4.f490f;
            int i13 = uVar4.f488d;
            if (i13 != 0) {
                fVar5.u(1, null);
                Bundle bundle = uVar4.f489e;
                uVar4.b(new xe.b(i13, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!uVar4.a()) {
                fVar5.u(1, null);
                uVar4.b(new xe.b(8, null, null));
            }
        }
        synchronized (uVar4) {
            uVar4.f486b = true;
        }
        synchronized (uVar4) {
            uVar4.f485a = null;
        }
        f fVar6 = uVar4.f487c;
        synchronized (fVar6.H) {
            fVar6.H.remove(uVar4);
        }
    }
}
