package e2;

import androidx.lifecycle.e0;
import dr.d0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashSet f7945i = new LinkedHashSet();
    public static final Object j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.q f7946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i8.c f7947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4.h f7948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rn.u f7950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f7951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f7952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4.i f7953h;

    public z(a3.q produceFile, List initTasksList, i8.c corruptionHandler, fr.d scope) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        h2.f serializer = h2.f.f10292a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7946a = produceFile;
        this.f7947b = corruptionHandler;
        Continuation continuation = null;
        this.f7948c = new a4.h(new m(this, continuation, 1));
        this.f7949d = ".tmp";
        this.f7950e = rn.l.b(new a3.q(3, this));
        this.f7951f = dr.z.b(b0.f7856a);
        this.f7952g = CollectionsKt.i0(initTasksList);
        this.f7953h = new e4.i(scope, new androidx.fragment.app.r(1, this), l.f7880d, new m(this, continuation, 0));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        if (r8 == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.jvm.functions.Function2, xn.h] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.jvm.functions.Function2, xn.h] */
    /* JADX WARN: Type inference failed for: r8v0, types: [e2.z] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [e2.z] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(e2.z r8, e2.i r9, xn.c r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.z.a(e2.z, e2.i, xn.c):java.lang.Object");
    }

    public final File b() {
        return (File) this.f7950e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x011a  */
    /* JADX WARN: Code duplicated, block: B:47:0x011f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:33:0x00cc->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(xn.c cVar) throws a, FileNotFoundException {
        q qVar;
        Mutex bVar;
        Ref.ObjectRef objectRef;
        z zVar;
        Ref.ObjectRef objectRef2;
        T t5;
        z zVar2;
        Ref.ObjectRef objectRef3;
        s sVar;
        Iterator it;
        Mutex mutex;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        z zVar3;
        Ref.ObjectRef objectRef4;
        Mutex mutex2;
        Function2 function2;
        T t10;
        int iHashCode;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i7 = qVar.F;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                qVar.F = i7 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj = qVar.f7902y;
        wn.a aVar = wn.a.f22354d;
        int i10 = qVar.F;
        if (i10 == 0) {
            ib.a.L(obj);
            d0 d0Var = this.f7951f;
            if (!Intrinsics.areEqual(d0Var.getValue(), b0.f7856a) && !(d0Var.getValue() instanceof f)) {
                throw new IllegalStateException("Check failed.");
            }
            bVar = new jr.b();
            objectRef = new Ref.ObjectRef();
            qVar.f7896d = this;
            qVar.f7897e = bVar;
            qVar.f7898i = objectRef;
            qVar.f7899v = objectRef;
            qVar.F = 1;
            Object objG = g(qVar);
            if (objG != aVar) {
                zVar = this;
                objectRef2 = objectRef;
                t5 = objG;
            }
            return aVar;
        }
        if (i10 == 1) {
            objectRef = (Ref.ObjectRef) qVar.f7899v;
            objectRef2 = (Ref.ObjectRef) qVar.f7898i;
            bVar = (Mutex) qVar.f7897e;
            zVar = qVar.f7896d;
            ib.a.L(obj);
            t5 = obj;
        } else {
            if (i10 == 2) {
                it = qVar.f7901x;
                sVar = qVar.f7900w;
                booleanRef = (Ref.BooleanRef) qVar.f7899v;
                objectRef3 = (Ref.ObjectRef) qVar.f7898i;
                mutex = (Mutex) qVar.f7897e;
                zVar2 = qVar.f7896d;
                ib.a.L(obj);
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    qVar.f7896d = zVar2;
                    qVar.f7897e = mutex;
                    qVar.f7898i = objectRef3;
                    qVar.f7899v = booleanRef;
                    qVar.f7900w = sVar;
                    qVar.f7901x = it;
                    qVar.F = 2;
                    if (function2.invoke(sVar, qVar) == aVar) {
                        return aVar;
                    }
                }
                booleanRef2 = booleanRef;
                objectRef2 = objectRef3;
                bVar = mutex;
                zVar3 = zVar2;
                zVar3.f7952g = null;
                qVar.f7896d = zVar3;
                qVar.f7897e = objectRef2;
                qVar.f7898i = booleanRef2;
                qVar.f7899v = bVar;
                qVar.f7900w = null;
                qVar.f7901x = null;
                qVar.F = 3;
                if (bVar.a(qVar) != aVar) {
                    objectRef4 = objectRef2;
                    mutex2 = bVar;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex2 = (Mutex) qVar.f7899v;
            booleanRef2 = (Ref.BooleanRef) qVar.f7898i;
            objectRef4 = (Ref.ObjectRef) qVar.f7897e;
            zVar3 = qVar.f7896d;
            ib.a.L(obj);
        }
        try {
            booleanRef2.element = true;
            Unit unit = Unit.f14616a;
            mutex2.b(null);
            d0 d0Var2 = zVar3.f7951f;
            t10 = objectRef4.element;
            if (t10 != 0) {
                iHashCode = t10.hashCode();
            } else {
                iHashCode = 0;
            }
            b bVar2 = new b(iHashCode, t10);
            d0Var2.getClass();
            d0Var2.i(null, bVar2);
            return Unit.f14616a;
        } catch (Throwable th2) {
            mutex2.b(null);
            throw th2;
        }
        objectRef.element = t5;
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        s sVar2 = new s(bVar, booleanRef3, objectRef2, zVar);
        List list = zVar.f7952g;
        if (list == null) {
            booleanRef2 = booleanRef3;
            zVar3 = zVar;
        } else {
            zVar2 = zVar;
            objectRef3 = objectRef2;
            sVar = sVar2;
            it = list.iterator();
            mutex = bVar;
            booleanRef = booleanRef3;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                qVar.f7896d = zVar2;
                qVar.f7897e = mutex;
                qVar.f7898i = objectRef3;
                qVar.f7899v = booleanRef;
                qVar.f7900w = sVar;
                qVar.f7901x = it;
                qVar.F = 2;
                if (function2.invoke(sVar, qVar) == aVar) {
                    return aVar;
                }
            }
            booleanRef2 = booleanRef;
            objectRef2 = objectRef3;
            bVar = mutex;
            zVar3 = zVar2;
        }
        zVar3.f7952g = null;
        qVar.f7896d = zVar3;
        qVar.f7897e = objectRef2;
        qVar.f7898i = booleanRef2;
        qVar.f7899v = bVar;
        qVar.f7900w = null;
        qVar.f7901x = null;
        qVar.F = 3;
        if (bVar.a(qVar) != aVar) {
            objectRef4 = objectRef2;
            mutex2 = bVar;
            booleanRef2.element = true;
            Unit unit2 = Unit.f14616a;
            mutex2.b(null);
            d0 d0Var3 = zVar3.f7951f;
            t10 = objectRef4.element;
            if (t10 != 0) {
                iHashCode = t10.hashCode();
            } else {
                iHashCode = 0;
            }
            b bVar3 = new b(iHashCode, t10);
            d0Var3.getClass();
            d0Var3.i(null, bVar3);
            return Unit.f14616a;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(xn.c cVar) throws Throwable {
        t tVar;
        z zVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i7 = tVar.f7917v;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                tVar.f7917v = i7 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.f7915e;
        wn.a aVar = wn.a.f22354d;
        int i10 = tVar.f7917v;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = tVar.f7914d;
            try {
                ib.a.L(obj);
                return Unit.f14616a;
            } catch (Throwable th2) {
                th = th2;
                d0 d0Var = zVar.f7951f;
                f fVar = new f(th);
                d0Var.getClass();
                d0Var.i(null, fVar);
                throw th;
            }
        }
        ib.a.L(obj);
        try {
            tVar.f7914d = this;
            tVar.f7917v = 1;
            if (c(tVar) == aVar) {
                return aVar;
            }
            return Unit.f14616a;
        } catch (Throwable th3) {
            th = th3;
            zVar = this;
            d0 d0Var2 = zVar.f7951f;
            f fVar2 = new f(th);
            d0Var2.getClass();
            d0Var2.i(null, fVar2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(xn.c cVar) {
        u uVar;
        z zVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i7 = uVar.f7921v;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                uVar.f7921v = i7 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.f7919e;
        wn.a aVar = wn.a.f22354d;
        int i10 = uVar.f7921v;
        if (i10 == 0) {
            ib.a.L(obj);
            try {
                uVar.f7918d = this;
                uVar.f7921v = 1;
                if (c(uVar) == aVar) {
                    return aVar;
                }
            } catch (Throwable th2) {
                th = th2;
                zVar = this;
                d0 d0Var = zVar.f7951f;
                f fVar = new f(th);
                d0Var.getClass();
                d0Var.i(null, fVar);
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = uVar.f7918d;
            try {
                ib.a.L(obj);
            } catch (Throwable th3) {
                th = th3;
                d0 d0Var2 = zVar.f7951f;
                f fVar2 = new f(th);
                d0Var2.getClass();
                d0Var2.i(null, fVar2);
            }
        }
        return Unit.f14616a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [e2.z] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [e2.v] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [e2.z] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Object f(xn.c cVar) throws FileNotFoundException {
        ?? vVar;
        FileInputStream fileInputStream;
        Throwable th2;
        if (cVar instanceof v) {
            v vVar2 = (v) cVar;
            int i7 = vVar2.f7926w;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                vVar2.f7926w = i7 - Integer.MIN_VALUE;
                vVar = vVar2;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.f7924i;
        wn.a aVar = wn.a.f22354d;
        int i10 = vVar.f7926w;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileInputStream = vVar.f7923e;
                vVar = vVar.f7922d;
                try {
                    ib.a.L(obj);
                    ls.d.k(fileInputStream, null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        throw th2;
                    } catch (Throwable th4) {
                        ls.d.k(fileInputStream, th2);
                        throw th4;
                    }
                }
            }
            ib.a.L(obj);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(b());
                try {
                    h2.f fVar = h2.f.f10292a;
                    vVar.f7922d = this;
                    vVar.f7923e = fileInputStream2;
                    vVar.f7926w = 1;
                    h2.b bVarA = fVar.a(fileInputStream2);
                    if (bVarA == aVar) {
                        return aVar;
                    }
                    fileInputStream = fileInputStream2;
                    obj = bVarA;
                    ls.d.k(fileInputStream, null);
                    return obj;
                } catch (Throwable th5) {
                    fileInputStream = fileInputStream2;
                    th2 = th5;
                    vVar = this;
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                e = e10;
                vVar = this;
                if (vVar.b().exists()) {
                    throw e;
                }
                return new h2.b(true);
            }
        } catch (FileNotFoundException e11) {
            e = e11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(xn.c cVar) throws a, FileNotFoundException {
        w wVar;
        z zVar;
        a aVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i7 = wVar.f7931w;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                wVar.f7931w = i7 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object obj = wVar.f7929i;
        wn.a aVar2 = wn.a.f22354d;
        int i10 = wVar.f7931w;
        if (i10 == 0) {
            ib.a.L(obj);
            try {
                wVar.f7927d = this;
                wVar.f7931w = 1;
                Object objF = f(wVar);
                if (objF == aVar2) {
                    return aVar2;
                }
                return objF;
            } catch (a e10) {
                e = e10;
                zVar = this;
                i8.c cVar2 = zVar.f7947b;
                wVar.f7927d = zVar;
                wVar.f7928e = e;
                wVar.f7931w = 2;
                throw e;
            }
        }
        if (i10 == 1) {
            zVar = (z) wVar.f7927d;
            try {
                ib.a.L(obj);
                return obj;
            } catch (a e11) {
                e = e11;
                i8.c cVar3 = zVar.f7947b;
                wVar.f7927d = zVar;
                wVar.f7928e = e;
                wVar.f7931w = 2;
                throw e;
            }
        }
        if (i10 == 2) {
            a aVar3 = (a) wVar.f7928e;
            z zVar2 = (z) wVar.f7927d;
            ib.a.L(obj);
            try {
                wVar.f7927d = aVar3;
                wVar.f7928e = obj;
                wVar.f7931w = 3;
                if (zVar2.i(obj, wVar) == aVar2) {
                    return aVar2;
                }
                return obj;
            } catch (IOException e12) {
                e = e12;
                aVar = aVar3;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = wVar.f7928e;
            aVar = (a) wVar.f7927d;
            try {
                ib.a.L(obj);
                return obj2;
            } catch (IOException e13) {
                e = e13;
            }
        }
        rn.f.a(aVar, e);
        throw aVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Function2 function2, CoroutineContext coroutineContext, xn.c cVar) throws Throwable {
        x xVar;
        b bVar;
        Object obj;
        z zVar;
        Object obj2;
        z zVar2;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i7 = xVar.f7937x;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                xVar.f7937x = i7 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object obj3 = xVar.f7935v;
        wn.a aVar = wn.a.f22354d;
        int i10 = xVar.f7937x;
        if (i10 != 0) {
            if (i10 == 1) {
                obj = xVar.f7934i;
                bVar = (b) xVar.f7933e;
                zVar = xVar.f7932d;
                ib.a.L(obj3);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = xVar.f7933e;
                zVar2 = xVar.f7932d;
                ib.a.L(obj3);
            }
            d0 d0Var = zVar2.f7951f;
            b bVar2 = new b(obj2 != null ? obj2.hashCode() : 0, obj2);
            d0Var.getClass();
            d0Var.i(null, bVar2);
            return obj2;
        }
        ib.a.L(obj3);
        b bVar3 = (b) this.f7951f.getValue();
        Object obj4 = bVar3.f7854a;
        if ((obj4 != null ? obj4.hashCode() : 0) != bVar3.f7855b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        Object obj5 = bVar3.f7854a;
        e0 e0Var = new e0(function2, obj5, null);
        xVar.f7932d = this;
        xVar.f7933e = bVar3;
        xVar.f7934i = obj5;
        xVar.f7937x = 1;
        Object objA = ar.b0.A(coroutineContext, e0Var, xVar);
        if (objA != aVar) {
            bVar = bVar3;
            obj3 = objA;
            obj = obj5;
            zVar = this;
        }
        return aVar;
        Object obj6 = bVar.f7854a;
        if ((obj6 != null ? obj6.hashCode() : 0) != bVar.f7855b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (Intrinsics.areEqual(obj, obj3)) {
            return obj;
        }
        xVar.f7932d = zVar;
        xVar.f7933e = obj3;
        xVar.f7934i = null;
        xVar.f7937x = 2;
        if (zVar.i(obj3, xVar) != aVar) {
            obj2 = obj3;
            zVar2 = zVar;
            d0 d0Var2 = zVar2.f7951f;
            b bVar4 = new b(obj2 != null ? obj2.hashCode() : 0, obj2);
            d0Var2.getClass();
            d0Var2.i(null, bVar4);
            return obj2;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object i(Object obj, xn.c cVar) throws IOException {
        y yVar;
        File file;
        FileOutputStream fileOutputStream;
        z zVar;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i7 = yVar.f7944y;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                yVar.f7944y = i7 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object obj2 = yVar.f7942w;
        wn.a aVar = wn.a.f22354d;
        int i10 = yVar.f7944y;
        if (i10 == 0) {
            ib.a.L(obj2);
            File fileB = b();
            File parentFile = fileB.getCanonicalFile().getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    throw new IOException(Intrinsics.stringPlus("Unable to create parent directories of ", fileB));
                }
            }
            file = new File(Intrinsics.stringPlus(b().getAbsolutePath(), this.f7949d));
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                try {
                    h2.f fVar = h2.f.f10292a;
                    k kVar = new k(fileOutputStream3);
                    yVar.f7938d = this;
                    yVar.f7939e = file;
                    yVar.f7940i = fileOutputStream3;
                    yVar.f7941v = fileOutputStream3;
                    yVar.f7944y = 1;
                    if (fVar.b(obj, kVar) == aVar) {
                        return aVar;
                    }
                    zVar = this;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream3;
                    throw th;
                }
            } catch (IOException e10) {
                if (file.exists()) {
                    file.delete();
                }
                throw e10;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = yVar.f7941v;
            fileOutputStream = yVar.f7940i;
            file = yVar.f7939e;
            zVar = yVar.f7938d;
            try {
                ib.a.L(obj2);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ls.d.k(fileOutputStream, th);
                    throw th4;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        Unit unit = Unit.f14616a;
        ls.d.k(fileOutputStream, null);
        if (file.renameTo(zVar.b())) {
            return Unit.f14616a;
        }
        throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
    }
}
