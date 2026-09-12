package rc;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import je.e0;
import pc.t;
import pc.v;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f19240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19248i;
    public int j;
    public long[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f19249l;

    public e(int i7, int i10, long j, int i11, x xVar) {
        boolean z5 = true;
        if (i10 != 1 && i10 != 2) {
            z5 = false;
        }
        je.b.g(z5);
        this.f19243d = j;
        this.f19244e = i11;
        this.f19240a = xVar;
        int i12 = (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48);
        this.f19241b = (i10 == 2 ? 1667497984 : 1651965952) | i12;
        this.f19242c = i10 == 2 ? i12 | 1650720768 : -1;
        this.k = new long[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        this.f19249l = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
    }

    public final v a(int i7) {
        return new v(((this.f19243d * ((long) 1)) / ((long) this.f19244e)) * ((long) this.f19249l[i7]), this.k[i7]);
    }

    public final t b(long j) {
        int i7 = (int) (j / ((this.f19243d * ((long) 1)) / ((long) this.f19244e)));
        int iD = e0.d(this.f19249l, i7, true, true);
        if (this.f19249l[iD] == i7) {
            v vVarA = a(iD);
            return new t(vVarA, vVarA);
        }
        v vVarA2 = a(iD);
        int i10 = iD + 1;
        return i10 < this.k.length ? new t(vVarA2, a(i10)) : new t(vVarA2, vVarA2);
    }
}
