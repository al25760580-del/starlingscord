package np;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public static final r k = new r(false, false, false, false, false, new r(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f17024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f17026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f17027i;
    public final boolean j;

    public r(boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, r rVar, boolean z12, r rVar2, r rVar3, int i7) {
        z5 = (i7 & 1) != 0 ? true : z5;
        z6 = (i7 & 2) != 0 ? true : z6;
        z7 = (i7 & 4) != 0 ? false : z7;
        z10 = (i7 & 8) != 0 ? false : z10;
        z11 = (i7 & 16) != 0 ? false : z11;
        rVar = (i7 & 32) != 0 ? null : rVar;
        z12 = (i7 & 64) != 0 ? true : z12;
        rVar2 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? rVar : rVar2;
        rVar3 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? rVar : rVar3;
        boolean z13 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0;
        this.f17019a = z5;
        this.f17020b = z6;
        this.f17021c = z7;
        this.f17022d = z10;
        this.f17023e = z11;
        this.f17024f = rVar;
        this.f17025g = z12;
        this.f17026h = rVar2;
        this.f17027i = rVar3;
        this.j = z13;
    }
}
