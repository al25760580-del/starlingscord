package ke;

import android.os.Handler;
import android.os.Message;
import je.e0;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Handler.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f14352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f14353e;

    public h(i iVar, bd.l lVar) {
        this.f14353e = iVar;
        Handler handlerM = e0.m(this);
        this.f14352d = handlerM;
        lVar.a(this, handlerM);
    }

    public final void a(long j) {
        i iVar = this.f14353e;
        if (this != iVar.I1 || iVar.f3195g0 == null) {
            return;
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            iVar.V0 = true;
            return;
        }
        try {
            iVar.q0(j);
            iVar.y0(iVar.E1);
            iVar.X0.f5674e++;
            iVar.x0();
            iVar.Y(j);
        } catch (com.google.android.exoplayer2.b e10) {
            iVar.W0 = e10;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i7 = message.arg1;
        int i10 = message.arg2;
        int i11 = e0.f13788a;
        a(((((long) i7) & 4294967295L) << 32) | (4294967295L & ((long) i10)));
        return true;
    }
}
