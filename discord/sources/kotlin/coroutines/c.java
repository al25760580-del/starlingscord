package kotlin.coroutines;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineContext f14679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineContext.Element f14680e;

    public c(CoroutineContext.Element element, CoroutineContext left) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f14679d = left;
        this.f14680e = element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext B(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.f14680e;
        CoroutineContext.Element elementL = element.l(key);
        CoroutineContext coroutineContext = this.f14679d;
        if (elementL != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextB = coroutineContext.B(key);
        if (coroutineContextB == coroutineContext) {
            return this;
        }
        return coroutineContextB == g.f14681d ? element : new c(element, coroutineContextB);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object Y(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f14679d.Y(obj, operation), this.f14680e);
    }

    public final boolean equals(Object obj) {
        boolean zAreEqual;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i7 = 2;
            c cVar2 = cVar;
            int i10 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.f14679d;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i10++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.f14679d;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i7++;
            }
            if (i10 == i7) {
                c cVar4 = this;
                while (true) {
                    CoroutineContext.Element element = cVar4.f14680e;
                    if (!Intrinsics.areEqual(cVar.l(element.getKey()), element)) {
                        zAreEqual = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = cVar4.f14679d;
                    if (!(coroutineContext3 instanceof c)) {
                        Intrinsics.checkNotNull(coroutineContext3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        zAreEqual = Intrinsics.areEqual(cVar.l(element2.getKey()), element2);
                        break;
                    }
                    cVar4 = (c) coroutineContext3;
                }
                if (zAreEqual) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14680e.hashCode() + this.f14679d.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element l(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element elementL = cVar.f14680e.l(key);
            if (elementL != null) {
                return elementL;
            }
            CoroutineContext coroutineContext = cVar.f14679d;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.l(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext n(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.f14681d ? this : (CoroutineContext) context.Y(this, new ol.c(5));
    }

    public final String toString() {
        return s0.g.g(new StringBuilder("["), (String) Y("", new ol.c(4)), ']');
    }
}
