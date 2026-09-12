package fr;

import ar.r0;
import ar.s0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9405b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0[] f9406a;

    public final void a(r0 r0Var) {
        r0Var.c((s0) this);
        r0[] r0VarArr = this.f9406a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9405b;
        if (r0VarArr == null) {
            r0VarArr = new r0[4];
            this.f9406a = r0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= r0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(r0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            r0VarArr = (r0[]) objArrCopyOf;
            this.f9406a = r0VarArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        r0VarArr[i7] = r0Var;
        r0Var.f2960e = i7;
        c(i7);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final r0 b(int i7) {
        int i10;
        int i11;
        Object[] objArr;
        int i12;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f9406a;
        Intrinsics.checkNotNull(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9405b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i7 < atomicIntegerFieldUpdater.get(this)) {
            d(i7, atomicIntegerFieldUpdater.get(this));
            int i13 = (i7 - 1) / 2;
            if (i7 > 0) {
                r0 r0Var = objArr2[i7];
                Intrinsics.checkNotNull(r0Var);
                Object obj2 = objArr2[i13];
                Intrinsics.checkNotNull(obj2);
                if (r0Var.compareTo(obj2) < 0) {
                    d(i7, i13);
                    c(i13);
                } else {
                    while (true) {
                        i10 = i7 * 2;
                        i11 = i10 + 1;
                        if (i11 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f9406a;
                        Intrinsics.checkNotNull(objArr);
                        i12 = i10 + 2;
                        if (i12 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i12];
                            Intrinsics.checkNotNull(comparable3);
                            obj = objArr[i11];
                            Intrinsics.checkNotNull(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i12 = i11;
                            }
                        } else {
                            i12 = i11;
                        }
                        comparable = objArr[i7];
                        Intrinsics.checkNotNull(comparable);
                        comparable2 = objArr[i12];
                        Intrinsics.checkNotNull(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i7, i12);
                        i7 = i12;
                    }
                }
            } else {
                while (true) {
                    i10 = i7 * 2;
                    i11 = i10 + 1;
                    if (i11 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f9406a;
                    Intrinsics.checkNotNull(objArr);
                    i12 = i10 + 2;
                    if (i12 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i12];
                        Intrinsics.checkNotNull(comparable3);
                        obj = objArr[i11];
                        Intrinsics.checkNotNull(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i12 = i11;
                        }
                    } else {
                        i12 = i11;
                    }
                    comparable = objArr[i7];
                    Intrinsics.checkNotNull(comparable);
                    comparable2 = objArr[i12];
                    Intrinsics.checkNotNull(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i7, i12);
                    i7 = i12;
                }
            }
        }
        r0 r0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.checkNotNull(r0Var2);
        r0Var2.c(null);
        r0Var2.f2960e = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return r0Var2;
    }

    public final void c(int i7) {
        while (i7 > 0) {
            r0[] r0VarArr = this.f9406a;
            Intrinsics.checkNotNull(r0VarArr);
            int i10 = (i7 - 1) / 2;
            r0 r0Var = r0VarArr[i10];
            Intrinsics.checkNotNull(r0Var);
            r0 r0Var2 = r0VarArr[i7];
            Intrinsics.checkNotNull(r0Var2);
            if (r0Var.compareTo(r0Var2) <= 0) {
                return;
            }
            d(i7, i10);
            i7 = i10;
        }
    }

    public final void d(int i7, int i10) {
        r0[] r0VarArr = this.f9406a;
        Intrinsics.checkNotNull(r0VarArr);
        r0 r0Var = r0VarArr[i10];
        Intrinsics.checkNotNull(r0Var);
        r0 r0Var2 = r0VarArr[i7];
        Intrinsics.checkNotNull(r0Var2);
        r0VarArr[i7] = r0Var;
        r0VarArr[i10] = r0Var2;
        r0Var.f2960e = i7;
        r0Var2.f2960e = i10;
    }
}
