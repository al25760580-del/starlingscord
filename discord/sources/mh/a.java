package mh;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            message.obj.getClass();
            throw new ClassCastException();
        }
        if (i7 != 1) {
            return false;
        }
        message.obj.getClass();
        throw new ClassCastException();
    }
}
