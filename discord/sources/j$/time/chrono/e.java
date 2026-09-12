package j$.time.chrono;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f13475a = new e();

    public static boolean a(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }
}
