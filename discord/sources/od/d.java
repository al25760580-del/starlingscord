package od;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import pc.u;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements pc.m {
    public static final pc.n G = new pc.n();
    public u E;
    public Format[] F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pc.k f17214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17215e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Format f17216i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SparseArray f17217v = new SparseArray();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e4.c f17219x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f17220y;

    public d(pc.k kVar, int i7, Format format) {
        this.f17214d = kVar;
        this.f17215e = i7;
        this.f17216i = format;
    }

    public final void a(e4.c cVar, long j, long j5) {
        this.f17219x = cVar;
        this.f17220y = j5;
        boolean z5 = this.f17218w;
        pc.k kVar = this.f17214d;
        if (!z5) {
            kVar.e(this);
            if (j != -9223372036854775807L) {
                kVar.g(0L, j);
            }
            this.f17218w = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        kVar.g(0L, j);
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f17217v;
            if (i7 >= sparseArray.size()) {
                return;
            }
            c cVar2 = (c) sparseArray.valueAt(i7);
            if (cVar == null) {
                cVar2.f17212e = cVar2.f17210c;
            } else {
                cVar2.f17213f = j5;
                x xVarU = cVar.U(cVar2.f17208a);
                cVar2.f17212e = xVarU;
                Format format = cVar2.f17211d;
                if (format != null) {
                    xVarU.e(format);
                }
            }
            i7++;
        }
    }

    @Override // pc.m
    public final void c(u uVar) {
        this.E = uVar;
    }

    @Override // pc.m
    public final void q() {
        SparseArray sparseArray = this.f17217v;
        Format[] formatArr = new Format[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            Format format = ((c) sparseArray.valueAt(i7)).f17211d;
            je.b.l(format);
            formatArr[i7] = format;
        }
        this.F = formatArr;
    }

    @Override // pc.m
    public final x x(int i7, int i10) {
        SparseArray sparseArray = this.f17217v;
        c cVar = (c) sparseArray.get(i7);
        if (cVar == null) {
            je.b.k(this.F == null);
            cVar = new c(i7, i10, i10 == this.f17215e ? this.f17216i : null);
            e4.c cVar2 = this.f17219x;
            long j = this.f17220y;
            if (cVar2 == null) {
                cVar.f17212e = cVar.f17210c;
            } else {
                cVar.f17213f = j;
                x xVarU = cVar2.U(i10);
                cVar.f17212e = xVarU;
                Format format = cVar.f17211d;
                if (format != null) {
                    xVarU.e(format);
                }
            }
            sparseArray.put(i7, cVar);
        }
        return cVar;
    }
}
