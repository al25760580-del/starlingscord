package kq;

import a5.i0;
import ep.x;
import kotlin.collections.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile io.sentry.internal.debugmeta.c f14772v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lq.g f14773w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, x xVar, lq.g gVar) {
        super(lVar, xVar);
        this.f14773w = gVar;
        if (lVar == null) {
            d(0);
            throw null;
        }
        this.f14772v = null;
    }

    public static /* synthetic */ void a(int i7) {
        String str = i7 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i7 != 2 ? 2 : 3];
        if (i7 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i7 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i7 == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void d(int i7) {
        String str = i7 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 2 ? 3 : 2];
        if (i7 == 1) {
            objArr[0] = "computable";
        } else if (i7 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i7 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i7 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kq.h
    public final void b(Object obj) {
        this.f14772v = new io.sentry.internal.debugmeta.c(obj);
        try {
            if (obj == null) {
                a(2);
                throw null;
            }
            this.f14773w.invoke(obj);
            this.f14772v = null;
        } catch (Throwable th2) {
            this.f14772v = null;
            throw th2;
        }
    }

    @Override // kq.h
    public final i0 c(boolean z5) {
        return new i0(new lq.h(c0.c(nq.l.f17064d)), false, 8);
    }

    @Override // kq.h, kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        Object objInvoke;
        io.sentry.internal.debugmeta.c cVar = this.f14772v;
        if (cVar == null || ((Thread) cVar.f12760i) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else {
            if (((Thread) cVar.f12760i) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objInvoke = cVar.f12759e;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        d(2);
        throw null;
    }
}
