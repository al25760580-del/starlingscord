package eg;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Looper looper, int i7) {
        super(looper);
        switch (i7) {
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
