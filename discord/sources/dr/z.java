package dr;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5.h f7810a = new a5.h("NO_VALUE", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5.h f7811b = new a5.h("NONE", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a5.h f7812c = new a5.h("PENDING", 2);

    public static final y a(int i7, int i10, cr.a aVar) {
        if (i7 < 0) {
            throw new IllegalArgumentException(kk.b.h(i7, "replay cannot be negative, but was ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(kk.b.h(i10, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i7 <= 0 && i10 <= 0 && aVar != cr.a.f7342d) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i11 = i10 + i7;
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        return new y(i7, i11, aVar);
    }

    public static final d0 b(Object obj) {
        if (obj == null) {
            obj = er.c.f8670b;
        }
        return new d0(obj);
    }

    public static final Object c(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final Flow e(Flow flow, int i7, cr.a aVar) {
        if (i7 < 0 && i7 != -2 && i7 != -1) {
            throw new IllegalArgumentException(kk.b.h(i7, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i7 == -1 && aVar != cr.a.f7342d) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i7 == -1) {
            aVar = cr.a.f7343e;
            i7 = 0;
        }
        int i10 = i7;
        cr.a aVar2 = aVar;
        return flow instanceof er.s ? er.c.a((er.s) flow, null, i10, aVar2, 1) : new er.g(flow, null, i10, aVar2, 2);
    }

    public static final Object f(Flow flow, Function2 function2, xn.h hVar) {
        int i7 = q.f7782a;
        p pVar = new p(function2, null);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f14681d;
        cr.a aVar = cr.a.f7342d;
        Object objCollect = e(new er.k(pVar, flow, gVar, -2, aVar), 0, aVar).collect(er.u.f8713d, hVar);
        wn.a aVar2 = wn.a.f22354d;
        if (objCollect != aVar2) {
            objCollect = Unit.f14616a;
        }
        return objCollect == aVar2 ? objCollect : Unit.f14616a;
    }

    public static final Flow g(Flow flow, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative");
        }
        if (j == 0) {
            return flow;
        }
        return new a4.h(2, new k(new c7.a(j, 1), flow, null));
    }

    public static final Flow h(Flow flow) {
        return ((flow instanceof b0) || (flow instanceof f)) ? flow : new f(flow);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:24:0x005a, B:28:0x006e, B:30:0x0076, B:32:0x007c, B:34:0x0082, B:37:0x0093, B:38:0x009b, B:39:0x009c, B:40:0x00a3, B:20:0x0049, B:23:0x0050), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:24:0x005a, B:28:0x006e, B:30:0x0076, B:32:0x007c, B:34:0x0082, B:37:0x0093, B:38:0x009b, B:39:0x009c, B:40:0x00a3, B:20:0x0049, B:23:0x0050), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:24:0x005a, B:28:0x006e, B:30:0x0076, B:32:0x007c, B:34:0x0082, B:37:0x0093, B:38:0x009b, B:39:0x009c, B:40:0x00a3, B:20:0x0049, B:23:0x0050), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0093 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:24:0x005a, B:28:0x006e, B:30:0x0076, B:32:0x007c, B:34:0x0082, B:37:0x0093, B:38:0x009b, B:39:0x009c, B:40:0x00a3, B:20:0x0049, B:23:0x0050), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009c A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:24:0x005a, B:28:0x006e, B:30:0x0076, B:32:0x007c, B:34:0x0082, B:37:0x0093, B:38:0x009b, B:39:0x009c, B:40:0x00a3, B:20:0x0049, B:23:0x0050), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r2.emit(r11, r0) == r1) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0090 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(kotlinx.coroutines.flow.FlowCollector r8, cr.t r9, boolean r10, xn.c r11) {
        /*
            boolean r0 = r11 instanceof dr.g
            if (r0 == 0) goto L13
            r0 = r11
            dr.g r0 = (dr.g) r0
            int r1 = r0.f7738x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7738x = r1
            goto L18
        L13:
            dr.g r0 = new dr.g
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f7737w
            wn.a r1 = wn.a.f22354d
            int r2 = r0.f7738x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L41
            if (r2 != r4) goto L39
            boolean r10 = r0.f7736v
            cr.c r8 = r0.f7735i
            cr.v r9 = r0.f7734e
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f7733d
            ib.a.L(r11)     // Catch: java.lang.Throwable -> L36
        L32:
            r7 = r2
            r2 = r8
            r8 = r7
            goto L5a
        L36:
            r8 = move-exception
            goto Lac
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            boolean r10 = r0.f7736v
            cr.c r8 = r0.f7735i
            cr.v r9 = r0.f7734e
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f7733d
            ib.a.L(r11)     // Catch: java.lang.Throwable -> L36
            goto L6e
        L4d:
            ib.a.L(r11)
            cr.h r11 = r9.f7394v     // Catch: java.lang.Throwable -> L36
            r11.getClass()     // Catch: java.lang.Throwable -> L36
            cr.c r2 = new cr.c     // Catch: java.lang.Throwable -> L36
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L36
        L5a:
            r0.f7733d = r8     // Catch: java.lang.Throwable -> L36
            r0.f7734e = r9     // Catch: java.lang.Throwable -> L36
            r0.f7735i = r2     // Catch: java.lang.Throwable -> L36
            r0.f7736v = r10     // Catch: java.lang.Throwable -> L36
            r0.f7738x = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r11 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            if (r11 != r1) goto L6b
            goto L92
        L6b:
            r7 = r2
            r2 = r8
            r8 = r7
        L6e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L36
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r11 == 0) goto La4
            java.lang.Object r11 = r8.f7346d     // Catch: java.lang.Throwable -> L36
            a5.h r6 = cr.j.f7378p     // Catch: java.lang.Throwable -> L36
            if (r11 == r6) goto L9c
            r8.f7346d = r6     // Catch: java.lang.Throwable -> L36
            a5.h r6 = cr.j.f7374l     // Catch: java.lang.Throwable -> L36
            if (r11 == r6) goto L93
            r0.f7733d = r2     // Catch: java.lang.Throwable -> L36
            r0.f7734e = r9     // Catch: java.lang.Throwable -> L36
            r0.f7735i = r8     // Catch: java.lang.Throwable -> L36
            r0.f7736v = r10     // Catch: java.lang.Throwable -> L36
            r0.f7738x = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r11 = r2.emit(r11, r0)     // Catch: java.lang.Throwable -> L36
            if (r11 != r1) goto L32
        L92:
            return r1
        L93:
            cr.h r8 = r8.f7348i     // Catch: java.lang.Throwable -> L36
            java.lang.Throwable r8 = r8.u()     // Catch: java.lang.Throwable -> L36
            int r11 = fr.v.f9399a     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9c:
            java.lang.String r8 = "`hasNext()` has not been invoked"
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L36
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L36
            throw r11     // Catch: java.lang.Throwable -> L36
        La4:
            if (r10 == 0) goto La9
            r9.f(r3)
        La9:
            kotlin.Unit r8 = kotlin.Unit.f14616a
            return r8
        Lac:
            throw r8     // Catch: java.lang.Throwable -> Lad
        Lad:
            r11 = move-exception
            if (r10 == 0) goto Lc6
            boolean r10 = r8 instanceof java.util.concurrent.CancellationException
            if (r10 == 0) goto Lb7
            r3 = r8
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        Lb7:
            if (r3 != 0) goto Lc3
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "Channel was consumed, consumer had failed"
            r3.<init>(r10)
            r3.initCause(r8)
        Lc3:
            r9.f(r3)
        Lc6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.z.i(kotlinx.coroutines.flow.FlowCollector, cr.t, boolean, xn.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, a5.h] */
    public static final Object j(t tVar, xn.c cVar) {
        r rVar;
        Ref.ObjectRef objectRef;
        er.a e10;
        com.margelo.nitro.rive.c cVar2;
        ?? r5 = er.c.f8670b;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i7 = rVar.f7786v;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                rVar.f7786v = i7 - Integer.MIN_VALUE;
            } else {
                rVar = new r(cVar);
            }
        } else {
            rVar = new r(cVar);
        }
        Object obj = rVar.f7785i;
        Object obj2 = wn.a.f22354d;
        int i10 = rVar.f7786v;
        if (i10 == 0) {
            ib.a.L(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = r5;
            com.margelo.nitro.rive.c cVar3 = new com.margelo.nitro.rive.c(2, objectRef2);
            try {
                rVar.f7783d = objectRef2;
                rVar.f7784e = cVar3;
                rVar.f7786v = 1;
                if (tVar.collect(cVar3, rVar) == obj2) {
                    return obj2;
                }
                objectRef = objectRef2;
            } catch (er.a e11) {
                objectRef = objectRef2;
                e10 = e11;
                cVar2 = cVar3;
                if (e10.f8661d == cVar2) {
                    throw e10;
                }
                ar.b0.l(rVar.getContext());
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = rVar.f7784e;
            objectRef = rVar.f7783d;
            try {
                ib.a.L(obj);
            } catch (er.a e12) {
                e10 = e12;
                if (e10.f8661d == cVar2) {
                    throw e10;
                }
                ar.b0.l(rVar.getContext());
            }
        }
        T t5 = objectRef.element;
        if (t5 != r5) {
            return t5;
        }
        throw new NoSuchElementException("Expected at least one element");
    }
}
