package ar;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x1 {
    public static final Object a(v1 v1Var, Function2 function2) {
        b0.r(v1Var, new n0(0, b0.n(v1Var.f9396v.getContext()).P(v1Var.f2973w, v1Var, v1Var.f2883i)));
        return a.a.A(v1Var, false, v1Var, function2);
    }

    public static final Object b(long j, Function2 function2, xn.c frame) {
        if (j <= 0) {
            throw new u1("Timed out immediately", null);
        }
        Object objA = a(new v1(j, frame), function2);
        if (objA == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, ar.v1] */
    public static final Object c(long j, Function2 function2, xn.c cVar) {
        w1 frame;
        Ref.ObjectRef objectRef;
        if (cVar instanceof w1) {
            frame = (w1) cVar;
            int i7 = frame.f2980v;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f2980v = i7 - Integer.MIN_VALUE;
            } else {
                frame = new w1(cVar);
            }
        } else {
            frame = new w1(cVar);
        }
        Object obj = frame.f2979i;
        wn.a aVar = wn.a.f22354d;
        int i10 = frame.f2980v;
        if (i10 == 0) {
            ib.a.L(obj);
            if (j <= 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                frame.f2977d = function2;
                frame.f2978e = objectRef2;
                frame.f2980v = 1;
                ?? v1Var = new v1(j, frame);
                objectRef2.element = v1Var;
                Object objA = a(v1Var, function2);
                if (objA == aVar) {
                    try {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    } catch (u1 e10) {
                        e = e10;
                        objectRef = objectRef2;
                        if (e.f2971d == objectRef.element) {
                            return null;
                        }
                        throw e;
                    }
                }
                return objA == aVar ? aVar : objA;
            } catch (u1 e11) {
                e = e11;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = frame.f2978e;
            try {
                ib.a.L(obj);
                return obj;
            } catch (u1 e12) {
                e = e12;
            }
        }
        if (e.f2971d == objectRef.element) {
            return null;
        }
        throw e;
    }
}
