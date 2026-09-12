package nq;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends g {
    @Override // nq.g, eq.o
    public final /* bridge */ /* synthetic */ Collection a(up.e eVar, dp.c cVar) {
        a(eVar, cVar);
        throw null;
    }

    @Override // nq.g, eq.o
    public final Set b() {
        throw new IllegalStateException();
    }

    @Override // nq.g, eq.o
    public final /* bridge */ /* synthetic */ Collection c(up.e eVar, dp.a aVar) {
        c(eVar, (dp.c) aVar);
        throw null;
    }

    @Override // nq.g, eq.q
    public final Collection d(eq.f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        throw new IllegalStateException(this.f17035b);
    }

    @Override // nq.g, eq.o
    public final Set e() {
        throw new IllegalStateException();
    }

    @Override // nq.g, eq.o
    public final Set f() {
        throw new IllegalStateException();
    }

    @Override // nq.g, eq.q
    public final vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(this.f17035b + ", required name: " + name);
    }

    @Override // nq.g
    /* JADX INFO: renamed from: h */
    public final Set c(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(this.f17035b + ", required name: " + name);
    }

    @Override // nq.g
    /* JADX INFO: renamed from: i */
    public final Set a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(this.f17035b + ", required name: " + name);
    }

    @Override // nq.g
    public final String toString() {
        return s0.g.g(new StringBuilder("ThrowingScope{"), this.f17035b, '}');
    }
}
