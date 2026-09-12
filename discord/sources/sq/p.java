package sq;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lq.j f20526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20527e;

    public p(int i7, lq.j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f20526d = value;
        this.f20527e = i7;
    }

    @Override // sq.a
    public final int a() {
        return 1;
    }

    @Override // sq.a
    public final void b(int i7, lq.j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    @Override // sq.a
    public final Object get(int i7) {
        if (i7 == this.f20527e) {
            return this.f20526d;
        }
        return null;
    }

    @Override // sq.a, java.lang.Iterable
    public final Iterator iterator() {
        return new o(this);
    }
}
