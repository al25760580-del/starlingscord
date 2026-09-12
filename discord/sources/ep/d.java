package ep;

import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yo.k0;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f8523e = new d(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f8524i = new d(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f8525v = new d(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f8526w = new d(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f8527x = new d(4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f8528y = new d(5);
    public static final d E = new d(6);

    public /* synthetic */ d(int i7) {
        this.f8529d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vo.d dVarB;
        String builtinSignature;
        boolean z5 = false;
        int i7 = 1;
        switch (this.f8529d) {
            case 0:
                vo.d it = (vo.d) obj;
                int i10 = e.f8531l;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(CollectionsKt.E(j0.f8564f, com.facebook.imagepipeline.nativecode.b.g(it)));
            case 1:
                vo.d it2 = (vo.d) obj;
                int i11 = e.f8531l;
                Intrinsics.checkNotNullParameter(it2, "it");
                if ((it2 instanceof vo.u) && CollectionsKt.E(j0.f8564f, com.facebook.imagepipeline.nativecode.b.g(it2))) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 2:
                vo.d it3 = (vo.d) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Boolean.valueOf(gn.h.F(it3));
            case 3:
                return ((q0) obj).getType();
            case 4:
                vo.d it4 = (vo.d) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return Boolean.valueOf(gn.h.F(bq.e.k(it4)));
            case 5:
                vo.d it5 = (vo.d) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                int i12 = c.f8520l;
                k0 functionDescriptor = (k0) it5;
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                if (so.i.A(functionDescriptor) && bq.e.b(functionDescriptor, new bp.i(i7, functionDescriptor)) != null) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            default:
                vo.d it6 = (vo.d) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (so.i.A(it6)) {
                    int i13 = e.f8531l;
                    Intrinsics.checkNotNullParameter(it6, "<this>");
                    g0 g0Var = null;
                    if (j0.f8563e.contains(it6.getName()) && (dVarB = bq.e.b(it6, f8524i)) != null && (builtinSignature = com.facebook.imagepipeline.nativecode.b.g(dVarB)) != null) {
                        Intrinsics.checkNotNullParameter(builtinSignature, "builtinSignature");
                        if (j0.f8560b.contains(builtinSignature)) {
                            g0Var = g0.f8546d;
                        } else {
                            g0Var = ((i0) w0.e(j0.f8562d, builtinSignature)) == i0.f8551e ? g0.f8548i : g0.f8547e;
                        }
                    }
                    if (g0Var != null) {
                        z5 = true;
                    }
                }
                return Boolean.valueOf(z5);
        }
    }
}
