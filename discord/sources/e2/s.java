package e2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Mutex f7910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f7911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f7913d;

    public s(Mutex mutex, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, z zVar) {
        this.f7910a = mutex;
        this.f7911b = booleanRef;
        this.f7912c = objectRef;
        this.f7913d = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(d dVar, xn.c cVar) throws Throwable {
        r rVar;
        Mutex mutex;
        z zVar;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Function2 function2;
        Mutex mutex2;
        Mutex mutex3;
        z zVar2;
        T t5;
        Ref.ObjectRef objectRef2;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i7 = rVar.E;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                rVar.E = i7 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object obj = rVar.f7908x;
        wn.a aVar = wn.a.f22354d;
        int i10 = rVar.E;
        try {
            if (i10 == 0) {
                ib.a.L(obj);
                rVar.f7903d = dVar;
                mutex = this.f7910a;
                rVar.f7904e = mutex;
                Ref.BooleanRef booleanRef2 = this.f7911b;
                rVar.f7905i = booleanRef2;
                Ref.ObjectRef objectRef3 = this.f7912c;
                rVar.f7906v = objectRef3;
                zVar = this.f7913d;
                rVar.f7907w = zVar;
                rVar.E = 1;
                if (mutex.a(rVar) != aVar) {
                    booleanRef = booleanRef2;
                    objectRef = objectRef3;
                    function2 = dVar;
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = rVar.f7905i;
                    objectRef2 = (Ref.ObjectRef) rVar.f7904e;
                    mutex2 = (Mutex) rVar.f7903d;
                    try {
                        ib.a.L(obj);
                        t5 = obj2;
                        objectRef2.element = t5;
                        objectRef = objectRef2;
                        T t10 = objectRef.element;
                        mutex2.b(null);
                        return t10;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.b(null);
                        throw th;
                    }
                }
                zVar2 = (z) rVar.f7905i;
                objectRef = (Ref.ObjectRef) rVar.f7904e;
                mutex3 = (Mutex) rVar.f7903d;
                try {
                    ib.a.L(obj);
                    if (!Intrinsics.areEqual(obj, objectRef.element)) {
                        rVar.f7903d = mutex3;
                        rVar.f7904e = objectRef;
                        rVar.f7905i = obj;
                        rVar.E = 3;
                        if (zVar2.i(obj, rVar) != aVar) {
                            t5 = obj;
                            objectRef2 = objectRef;
                            mutex2 = mutex3;
                            objectRef2.element = t5;
                            objectRef = objectRef2;
                        }
                        return aVar;
                    }
                    mutex2 = mutex3;
                    T t11 = objectRef.element;
                    mutex2.b(null);
                    return t11;
                } catch (Throwable th3) {
                    th = th3;
                    mutex2 = mutex3;
                    mutex2.b(null);
                    throw th;
                }
            }
            z zVar3 = rVar.f7907w;
            objectRef = rVar.f7906v;
            booleanRef = (Ref.BooleanRef) rVar.f7905i;
            Mutex mutex4 = (Mutex) rVar.f7904e;
            Function2 function3 = (Function2) rVar.f7903d;
            ib.a.L(obj);
            zVar = zVar3;
            function2 = function3;
            mutex = mutex4;
            if (booleanRef.element) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj3 = objectRef.element;
            rVar.f7903d = mutex;
            rVar.f7904e = objectRef;
            rVar.f7905i = zVar;
            rVar.f7906v = null;
            rVar.f7907w = null;
            rVar.E = 2;
            Object objInvoke = function2.invoke(obj3, rVar);
            if (objInvoke != aVar) {
                mutex3 = mutex;
                obj = objInvoke;
                zVar2 = zVar;
                if (!Intrinsics.areEqual(obj, objectRef.element)) {
                    rVar.f7903d = mutex3;
                    rVar.f7904e = objectRef;
                    rVar.f7905i = obj;
                    rVar.E = 3;
                    if (zVar2.i(obj, rVar) != aVar) {
                        t5 = obj;
                        objectRef2 = objectRef;
                        mutex2 = mutex3;
                        objectRef2.element = t5;
                        objectRef = objectRef2;
                    }
                } else {
                    mutex2 = mutex3;
                }
                T t12 = objectRef.element;
                mutex2.b(null);
                return t12;
            }
            return aVar;
        } catch (Throwable th4) {
            th = th4;
            mutex2 = mutex;
            mutex2.b(null);
            throw th;
        }
    }
}
