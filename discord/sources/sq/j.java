package sq;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f20514d = new j();

    @Override // sq.a
    public final int a() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sq.a
    public final void b(int i7, lq.j jVar) {
        Void value = (Void) jVar;
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    @Override // sq.a
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        return null;
    }

    @Override // sq.a, java.lang.Iterable
    public final Iterator iterator() {
        return new i();
    }
}
