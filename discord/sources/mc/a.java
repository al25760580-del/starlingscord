package mc;

import ag.a1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import gc.h1;
import he.j0;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Looper looper) {
        super(looper);
        this.f15484b = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objC;
        long jMin;
        b bVar = (b) message.obj;
        try {
            int i7 = message.what;
            if (i7 == 0) {
                objC = ((e0) this.f15484b.k).c((y) bVar.f15491c);
            } else {
                if (i7 != 1) {
                    throw new RuntimeException();
                }
                c cVar = this.f15484b;
                objC = ((e0) cVar.k).a(cVar.f15504l, (x) bVar.f15491c);
            }
        } catch (h0 e10) {
            b bVar2 = (b) message.obj;
            if (bVar2.f15490b) {
                int i10 = bVar2.f15492d + 1;
                bVar2.f15492d = i10;
                if (i10 <= this.f15484b.f15503i.k(3)) {
                    SystemClock.elapsedRealtime();
                    SystemClock.elapsedRealtime();
                    Throwable a1Var = e10.getCause() instanceof IOException ? (IOException) e10.getCause() : new a1(e10.getCause());
                    o9.d dVar = this.f15484b.f15503i;
                    int i11 = bVar2.f15492d;
                    dVar.getClass();
                    if (!(a1Var instanceof h1) && !(a1Var instanceof FileNotFoundException) && !(a1Var instanceof he.a0) && !(a1Var instanceof j0)) {
                        int i12 = he.m.f10627e;
                        while (true) {
                            if (a1Var == null) {
                                jMin = Math.min((i11 - 1) * 1000, 5000);
                                break;
                            } else {
                                if ((a1Var instanceof he.m) && ((he.m) a1Var).f10628d == 2008) {
                                    jMin = -9223372036854775807L;
                                    break;
                                }
                                a1Var = a1Var.getCause();
                            }
                        }
                    } else {
                        jMin = -9223372036854775807L;
                        break;
                    }
                    if (jMin != -9223372036854775807L) {
                        synchronized (this) {
                            try {
                                if (!this.f15483a) {
                                    sendMessageDelayed(Message.obtain(message), jMin);
                                    return;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            }
            objC = e10;
        } catch (Exception e11) {
            je.b.O("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
            objC = e11;
        }
        o9.d dVar2 = this.f15484b.f15503i;
        long j = bVar.f15489a;
        dVar2.getClass();
        synchronized (this) {
            try {
                if (!this.f15483a) {
                    this.f15484b.f15506n.obtainMessage(message.what, Pair.create(bVar.f15491c, objC)).sendToTarget();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
