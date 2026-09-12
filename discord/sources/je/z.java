package je;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f13867a;

    public final void a() {
        this.f13867a = null;
        ArrayList arrayList = a0.f13756b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        Message message = this.f13867a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
