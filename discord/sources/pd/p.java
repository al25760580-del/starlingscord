package pd;

import android.os.Handler;
import android.os.Message;
import he.q;
import java.util.TreeMap;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Handler.Callback {
    public boolean E;
    public boolean F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f18011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final op.c f18012e;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public qd.c f18016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18017y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TreeMap f18015w = new TreeMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f18014v = e0.m(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dd.b f18013i = new dd.b(1);

    public p(qd.c cVar, op.c cVar2, q qVar) {
        this.f18016x = cVar;
        this.f18012e = cVar2;
        this.f18011d = qVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.F) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j = nVar.f18004a;
            long j5 = nVar.f18005b;
            Long lValueOf = Long.valueOf(j5);
            TreeMap treeMap = this.f18015w;
            Long l6 = (Long) treeMap.get(lValueOf);
            if (l6 == null) {
                treeMap.put(Long.valueOf(j5), Long.valueOf(j));
                return true;
            }
            if (l6.longValue() > j) {
                treeMap.put(Long.valueOf(j5), Long.valueOf(j));
            }
        }
        return true;
    }
}
