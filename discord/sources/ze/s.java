package ze;

import af.e0;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements OnCompleteListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f23961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23962e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f23963i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f23964v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f23965w;

    public s(e eVar, int i7, a aVar, long j, long j5) {
        this.f23961d = eVar;
        this.f23962e = i7;
        this.f23963i = aVar;
        this.f23964v = j;
        this.f23965w = j5;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static af.d a(m mVar, af.f fVar, int i7) {
        e0 e0Var = fVar.R;
        af.d dVar = e0Var == null ? null : e0Var.f418v;
        if (dVar != null && dVar.f402e) {
            int[] iArr = dVar.f404v;
            int i10 = 0;
            if (iArr == null) {
                int[] iArr2 = dVar.f406x;
                if (iArr2 != null) {
                    while (i10 < iArr2.length) {
                        if (iArr2[i10] != i7) {
                            i10++;
                        }
                    }
                    if (mVar.f23954q < dVar.f405w) {
                        return dVar;
                    }
                } else if (mVar.f23954q < dVar.f405w) {
                    return dVar;
                }
            } else {
                while (i10 < iArr.length) {
                    if (iArr[i10] != i7) {
                        i10++;
                    } else if (mVar.f23954q < dVar.f405w) {
                        return dVar;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        long j;
        long j5;
        long j7 = this.f23964v;
        e eVar = this.f23961d;
        if (eVar.c()) {
            af.j jVar = (af.j) af.i.a().f446a;
            if (jVar == null || jVar.f457e) {
                m mVar = (m) eVar.G.get(this.f23963i);
                if (mVar != null) {
                    ye.c cVar = mVar.f23946g;
                    if (cVar instanceof af.f) {
                        af.f fVar = (af.f) cVar;
                        int i14 = 0;
                        boolean z5 = j7 > 0;
                        int i15 = fVar.M;
                        if (jVar != null) {
                            z5 &= jVar.f458i;
                            i7 = jVar.f459v;
                            int i16 = jVar.f460w;
                            int i17 = jVar.f456d;
                            if (fVar.R == null || fVar.d()) {
                                i10 = i17;
                                i11 = i16;
                            } else {
                                af.d dVarA = a(mVar, fVar, this.f23962e);
                                if (dVarA == null) {
                                    return;
                                }
                                boolean z6 = dVarA.f403i && j7 > 0;
                                i10 = i17;
                                i11 = dVarA.f405w;
                                z5 = z6;
                            }
                        } else {
                            i7 = 5000;
                            i10 = 0;
                            i11 = 100;
                        }
                        int i18 = i7;
                        int iElapsedRealtime = -1;
                        if (task.m()) {
                            i13 = 0;
                        } else if (task.k()) {
                            i14 = -1;
                            i13 = 100;
                        } else {
                            Exception excH = task.h();
                            if (excH instanceof ye.e) {
                                Status status = ((ye.e) excH).f23289d;
                                i12 = status.f5936d;
                                xe.b bVar = status.f5939v;
                                if (bVar != null) {
                                    i13 = i12;
                                    i14 = bVar.f22910e;
                                }
                            } else {
                                i12 = 101;
                            }
                            i13 = i12;
                            i14 = -1;
                        }
                        if (z5) {
                            long j10 = this.f23965w;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j10);
                            j5 = jCurrentTimeMillis;
                            j = j7;
                        } else {
                            j = 0;
                            j5 = 0;
                        }
                        t tVar = new t(new af.h(this.f23962e, i13, i14, j, j5, null, null, i15, iElapsedRealtime), i10, i18, i11);
                        eg.a aVar = eVar.K;
                        aVar.sendMessage(aVar.obtainMessage(18, tVar));
                    }
                }
            }
        }
    }
}
