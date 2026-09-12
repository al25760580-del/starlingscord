package kq;

import a5.i0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class j implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f14780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f14781e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function1 f14782i;

    public j(l lVar, ConcurrentHashMap concurrentHashMap, Function1 function1) {
        this.f14780d = lVar;
        this.f14781e = concurrentHashMap;
        this.f14782i = function1;
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 3 || i7 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 3 || i7 == 4) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "map";
        } else if (i7 == 2) {
            objArr[0] = "compute";
        } else if (i7 == 3 || i7 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i7 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i7 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i7 != 3 && i7 != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 3 && i7 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final AssertionError b(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + k.f14784e + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f14780d);
        l.f(assertionError);
        return assertionError;
    }

    public final AssertionError c(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f14780d);
        l.f(assertionError);
        return assertionError;
    }

    public final AssertionError d(Object obj, Throwable th2) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.f14780d, th2);
        l.f(assertionError);
        return assertionError;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) throws Throwable {
        AssertionError assertionErrorC;
        l lVar = this.f14780d;
        a aVar = lVar.f14790b;
        n nVar = lVar.f14789a;
        ConcurrentHashMap concurrentHashMap = this.f14781e;
        Object obj2 = concurrentHashMap.get(obj);
        Object obj3 = vq.m.f21953a;
        k kVar = k.f14784e;
        if (obj2 != null && obj2 != kVar) {
            vq.m.l(obj2);
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        nVar.lock();
        try {
            Object obj4 = concurrentHashMap.get(obj);
            k kVar2 = k.f14785i;
            if (obj4 == kVar) {
                i0 i0VarE = lVar.e(obj, "");
                if (i0VarE == null) {
                    a(3);
                    throw null;
                }
                if (!i0VarE.f214e) {
                    Object obj5 = i0VarE.f215i;
                    nVar.unlock();
                    return obj5;
                }
                obj4 = kVar2;
            }
            if (obj4 == kVar2) {
                i0 i0VarE2 = lVar.e(obj, "");
                if (i0VarE2 == null) {
                    a(3);
                    throw null;
                }
                if (!i0VarE2.f214e) {
                    Object obj6 = i0VarE2.f215i;
                    nVar.unlock();
                    return obj6;
                }
            }
            if (obj4 != null) {
                vq.m.l(obj4);
                Object obj7 = obj4 != obj3 ? obj4 : null;
                nVar.unlock();
                return obj7;
            }
            try {
                concurrentHashMap.put(obj, kVar);
                Object objInvoke = this.f14782i.invoke(obj);
                if (objInvoke != null) {
                    obj3 = objInvoke;
                }
                Object objPut = concurrentHashMap.put(obj, obj3);
                if (objPut == kVar) {
                    nVar.unlock();
                    return objInvoke;
                }
                assertionErrorC = c(obj, objPut);
                try {
                    throw assertionErrorC;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                assertionErrorC = null;
            }
            if (vq.m.j(th)) {
                try {
                    Object objRemove = concurrentHashMap.remove(obj);
                    if (objRemove != kVar) {
                        throw b(obj, objRemove);
                    }
                    throw th;
                } catch (Throwable th4) {
                    throw d(obj, th4);
                }
            }
            if (th != assertionErrorC) {
                Object objPut2 = concurrentHashMap.put(obj, new vq.l(th));
                if (objPut2 != kVar) {
                    throw c(obj, objPut2);
                }
                aVar.a(th);
                throw null;
            }
            try {
                concurrentHashMap.remove(obj);
                aVar.a(th);
                throw null;
            } catch (Throwable th5) {
                throw d(obj, th5);
            }
            nVar.unlock();
            throw th;
        } catch (Throwable th6) {
            nVar.unlock();
            throw th6;
        }
    }
}
