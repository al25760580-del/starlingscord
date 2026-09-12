package od;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import he.h0;
import he.p;
import he.s0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements h0 {
    public final long E;
    public final s0 F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17221d = LoadEventInfo.f5695c.getAndIncrement();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f17222e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17223i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Format f17224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f17225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f17226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f17227y;

    public e(DataSource dataSource, p pVar, int i7, Format format, int i10, Object obj, long j, long j5) {
        this.F = new s0(dataSource);
        this.f17222e = pVar;
        this.f17223i = i7;
        this.f17224v = format;
        this.f17225w = i10;
        this.f17226x = obj;
        this.f17227y = j;
        this.E = j5;
    }
}
