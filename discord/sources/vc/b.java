package vc;

import java.util.ArrayDeque;
import pc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f21553a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f21554b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f21555c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pf.b f21556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21559g;

    public final long a(l lVar, int i7) {
        byte[] bArr = this.f21553a;
        lVar.readFully(bArr, 0, i7);
        long j = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j = (j << 8) | ((long) (bArr[i10] & 255));
        }
        return j;
    }
}
