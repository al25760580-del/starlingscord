package kotlinx.coroutines;

import ar.b0;
import ar.u;
import ar.v;
import fr.h;
import fr.i;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.a implements kotlin.coroutines.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f14751e = new v(kotlin.coroutines.d.k, new u(0));

    public CoroutineDispatcher() {
        super(kotlin.coroutines.d.k);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext B(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            f key2 = this.f14676d;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.f14678e != key2) {
                return this;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            if (((CoroutineContext.Element) bVar.f14677d.invoke(this)) != null) {
                return g.f14681d;
            }
        } else if (kotlin.coroutines.d.k == key) {
            return g.f14681d;
        }
        return this;
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element l(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            f key2 = this.f14676d;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.f14678e != key2) {
                return null;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            CoroutineContext.Element element = (CoroutineContext.Element) bVar.f14677d.invoke(this);
            if (element != null) {
                return element;
            }
        } else if (kotlin.coroutines.d.k == key) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return this;
        }
        return null;
    }

    public abstract void l0(CoroutineContext coroutineContext, Runnable runnable);

    public void m0(CoroutineContext coroutineContext, Runnable runnable) {
        h.g(this, coroutineContext, runnable);
    }

    public boolean n0(CoroutineContext coroutineContext) {
        return !(this instanceof d);
    }

    public CoroutineDispatcher o0(int i7) {
        h.a(i7);
        return new i(this, i7);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + b0.o(this);
    }
}
