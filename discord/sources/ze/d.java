package ze;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends eg.a {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            if (i7 != 2) {
                Log.wtf("BasePendingResult", kk.b.h(i7, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.E);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            throw new ClassCastException();
        }
        ye.n nVar = (ye.n) pair.second;
        try {
            throw null;
        } catch (RuntimeException e10) {
            BasePendingResult.zal(nVar);
            throw e10;
        }
    }
}
