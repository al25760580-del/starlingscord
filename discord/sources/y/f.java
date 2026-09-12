package y;

import com.google.firebase.messaging.p;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n8.f f23111a = new n8.f(23);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f23112b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f23113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f23114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f23115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f23116f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n0 f23117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f23118h;

    static {
        f23113c = e.f23106w;
        long j = 1;
        f23114d = j + j;
        p pVar = new p();
        pVar.f6604c = new long[16];
        pVar.f6605d = new int[16];
        int[] iArr = new int[16];
        int i7 = 0;
        while (i7 < 16) {
            int i10 = i7 + 1;
            iArr[i7] = i10;
            i7 = i10;
        }
        pVar.f6606e = iArr;
        f23115e = pVar;
        f23117g = n0.f14659d;
        long j5 = f23114d;
        f23114d = j + j5;
        a aVar = new a(j5, null, new n6.e(22));
        f23113c = f23113c.b(aVar.f23098b);
        f23118h = aVar;
        new x.a(0);
    }

    public static final h a(h hVar) {
        h hVarE;
        c cVarB = b();
        h hVarE2 = e(hVar, cVarB.e(), cVarB.b());
        if (hVarE2 != null) {
            return hVarE2;
        }
        synchronized (f23112b) {
            c cVarB2 = b();
            hVarE = e(hVar, cVarB2.e(), cVarB2.b());
        }
        if (hVarE != null) {
            return hVarE;
        }
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final c b() {
        c cVar = (c) f23111a.get();
        return cVar == null ? f23118h : cVar;
    }

    public static final Function1 c(Function1 function1, Function1 function2, boolean z5) {
        if (!z5) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new com.facebook.react.runtime.p(13, function1, function2);
    }

    public static final h d(h hVar, g gVar) {
        p pVar = f23115e;
        long j = (pVar.f6602a > 0 ? ((long[]) pVar.f6604c)[0] : f23114d) - ((long) 1);
        h hVar2 = null;
        h hVar3 = null;
        for (h hVarA = gVar.a(); hVarA != null; hVarA = hVarA.f23120b) {
            long j5 = hVarA.f23119a;
            if (j5 != 0) {
                if (j5 != 0 && Intrinsics.compare(j5, j) <= 0 && !e.f23106w.a(j5)) {
                    if (hVar3 != null) {
                        if (Intrinsics.compare(hVarA.f23119a, hVar3.f23119a) >= 0) {
                            hVar2 = hVar3;
                            break;
                        }
                        break;
                    }
                    hVar3 = hVarA;
                }
            }
            hVar2 = hVarA;
            break;
        }
        if (hVar2 != null) {
            hVar2.f23119a = LongCompanionObject.MAX_VALUE;
            return hVar2;
        }
        h hVarA2 = hVar.a();
        hVarA2.f23120b = gVar.a();
        Intrinsics.checkNotNull(hVarA2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        gVar.h(hVarA2);
        Intrinsics.checkNotNull(hVarA2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return hVarA2;
    }

    public static final h e(h hVar, long j, e eVar) {
        h hVar2 = null;
        while (hVar != null) {
            long j5 = hVar.f23119a;
            if (j5 != 0 && Intrinsics.compare(j5, j) <= 0 && !eVar.a(j5) && (hVar2 == null || Intrinsics.compare(hVar2.f23119a, hVar.f23119a) < 0)) {
                hVar2 = hVar;
            }
            hVar = hVar.f23120b;
        }
        if (hVar2 != null) {
            return hVar2;
        }
        return null;
    }

    public static final h f(h hVar, g gVar) {
        h hVarE;
        c cVarB = b();
        Function1 function1C = cVarB.c();
        if (function1C != null) {
            function1C.invoke(gVar);
        }
        h hVarE2 = e(hVar, cVarB.e(), cVarB.b());
        if (hVarE2 != null) {
            return hVarE2;
        }
        synchronized (f23112b) {
            c cVarB2 = b();
            h hVarA = gVar.a();
            Intrinsics.checkNotNull(hVarA, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            hVarE = e(hVarA, cVarB2.e(), cVarB2.b());
            if (hVarE == null) {
                throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
        }
        return hVarE;
    }

    public static final void g(int i7) {
        p pVar = f23115e;
        int i10 = ((int[]) pVar.f6606e)[i7];
        pVar.h(i10, pVar.f6602a - 1);
        pVar.f6602a--;
        long[] jArr = (long[]) pVar.f6604c;
        long j = jArr[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = ((i11 + 1) >> 1) - 1;
            if (Intrinsics.compare(jArr[i12], j) <= 0) {
                break;
            }
            pVar.h(i12, i11);
            i11 = i12;
        }
        long[] jArr2 = (long[]) pVar.f6604c;
        int i13 = pVar.f6602a >> 1;
        while (i10 < i13) {
            int i14 = (i10 + 1) << 1;
            int i15 = i14 - 1;
            if (i14 < pVar.f6602a && Intrinsics.compare(jArr2[i14], jArr2[i15]) < 0) {
                if (Intrinsics.compare(jArr2[i14], jArr2[i10]) >= 0) {
                    break;
                }
                pVar.h(i14, i10);
                i10 = i14;
            } else {
                if (Intrinsics.compare(jArr2[i15], jArr2[i10]) >= 0) {
                    break;
                }
                pVar.h(i15, i10);
                i10 = i15;
            }
        }
        ((int[]) pVar.f6606e)[i7] = pVar.f6603b;
        pVar.f6603b = i7;
    }
}
