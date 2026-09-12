package fe;

import com.google.android.exoplayer2.Format;
import java.util.List;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public interface p {
    boolean a(int i7, long j);

    void b(long j, long j5, long j7, List list, od.m[] mVarArr);

    x0 c();

    int d();

    void disable();

    void enable();

    Format f(int i7);

    int g(int i7);

    int h(long j, List list);

    int i(Format format);

    default boolean j(long j, od.e eVar, List list) {
        return false;
    }

    int k();

    Format l();

    int length();

    int m();

    boolean n(int i7, long j);

    void o(float f2);

    Object p();

    int s(int i7);

    default void q() {
    }

    default void r() {
    }

    default void e(boolean z5) {
    }
}
