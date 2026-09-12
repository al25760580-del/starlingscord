package dr;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends er.b implements MutableStateFlow, Flow, er.s {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7722x = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7723w;

    public d0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // er.s
    public final Flow a(CoroutineContext coroutineContext, int i7, cr.a aVar) {
        return ((((i7 < 0 || i7 >= 2) && i7 != -2) || aVar != cr.a.f7343e) && !((i7 == 0 || i7 == -3) && aVar == cr.a.f7342d)) ? new er.g(this, coroutineContext, i7, aVar) : this;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final boolean b(Object obj, Object obj2) {
        a5.h hVar = er.c.f8670b;
        if (obj == null) {
            obj = hVar;
        }
        if (obj2 == null) {
            obj2 = hVar;
        }
        return i(obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:36:0x0092, B:38:0x009a, B:41:0x00a1, B:42:0x00a5, B:44:0x00a8, B:54:0x00c9, B:57:0x00d9, B:46:0x00ae, B:50:0x00b5, B:21:0x004d, B:24:0x0058, B:35:0x0083), top: B:62:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:36:0x0092, B:38:0x009a, B:41:0x00a1, B:42:0x00a5, B:44:0x00a8, B:54:0x00c9, B:57:0x00d9, B:46:0x00ae, B:50:0x00b5, B:21:0x004d, B:24:0x0058, B:35:0x0083), top: B:62:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:36:0x0092, B:38:0x009a, B:41:0x00a1, B:42:0x00a5, B:44:0x00a8, B:54:0x00c9, B:57:0x00d9, B:46:0x00ae, B:50:0x00b5, B:21:0x004d, B:24:0x0058, B:35:0x0083), top: B:62:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [er.d] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [dr.e0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [dr.e0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [er.b] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [dr.d0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [dr.d0, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00d8 -> B:36:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00e9 -> B:36:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.d0.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean d(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // er.b
    public final er.d e() {
        return new e0();
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.f14616a;
    }

    @Override // er.b
    public final er.d[] g() {
        return new e0[2];
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final Object getValue() {
        a5.h hVar = er.c.f8670b;
        Object obj = f7722x.get(this);
        if (obj == hVar) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        int i7;
        er.d[] dVarArr;
        a5.h hVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7722x;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f7723w;
            if ((i10 & 1) != 0) {
                this.f7723w = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f7723w = i11;
            er.d[] dVarArr2 = this.f8662d;
            Unit unit = Unit.f14616a;
            while (true) {
                e0[] e0VarArr = (e0[]) dVarArr2;
                if (e0VarArr != null) {
                    for (e0 e0Var : e0VarArr) {
                        if (e0Var != null) {
                            AtomicReference atomicReference = e0Var.f7726a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (hVar = z.f7812c)) {
                                    break;
                                }
                                a5.h hVar2 = z.f7811b;
                                if (obj4 != hVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, hVar2)) {
                                            rn.q qVar = Result.f14614e;
                                            ((ar.k) obj4).resumeWith(Unit.f14616a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, hVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f7723w;
                    if (i7 == i11) {
                        this.f7723w = i11 + 1;
                        return true;
                    }
                    dVarArr = this.f8662d;
                    Unit unit2 = Unit.f14616a;
                }
                dVarArr2 = dVarArr;
                i11 = i7;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final void setValue(Object obj) {
        if (obj == null) {
            obj = er.c.f8670b;
        }
        i(null, obj);
    }
}
