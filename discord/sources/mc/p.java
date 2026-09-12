package mc;

import android.os.Looper;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements s {
    @Override // mc.s
    public final int b(Format format) {
        return format.L != null ? 1 : 0;
    }

    @Override // mc.s
    public final k c(n nVar, Format format) {
        if (format.L == null) {
            return null;
        }
        return new w(new j(6001, new i0()));
    }

    @Override // mc.s
    public final void e(Looper looper, hc.c0 c0Var) {
    }
}
