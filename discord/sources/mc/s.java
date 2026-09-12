package mc;

import android.os.Looper;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes3.dex */
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f15573a = new p();

    int b(Format format);

    k c(n nVar, Format format);

    default r d(n nVar, Format format) {
        return r.f15572r;
    }

    void e(Looper looper, hc.c0 c0Var);

    default void a() {
    }

    default void release() {
    }
}
