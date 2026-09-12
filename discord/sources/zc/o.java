package zc;

import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.x f23787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23789c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final je.v f23792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f23793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23795i;
    public long j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f23796l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f23800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f23801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23802r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f23790d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f23791e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f23797m = new n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f23798n = new n();

    public o(pc.x xVar, boolean z5, boolean z6) {
        this.f23787a = xVar;
        this.f23788b = z5;
        this.f23789c = z6;
        byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        this.f23793g = bArr;
        this.f23792f = new je.v(bArr, 0, 0);
        this.k = false;
        this.f23799o = false;
        n nVar = this.f23798n;
        nVar.f23774b = false;
        nVar.f23773a = false;
    }
}
