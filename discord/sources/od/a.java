package od;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import he.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends l {
    public final long H;
    public final long I;
    public e4.c J;
    public int[] K;

    public a(DataSource dataSource, p pVar, Format format, int i7, Object obj, long j, long j5, long j7, long j10, long j11) {
        super(dataSource, pVar, format, i7, obj, j, j5, j11);
        this.H = j7;
        this.I = j10;
    }

    public final int c(int i7) {
        int[] iArr = this.K;
        je.b.l(iArr);
        return iArr[i7];
    }
}
