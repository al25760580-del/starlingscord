package md;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements he.h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final he.p f15711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final he.s0 f15712e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f15713i;

    public u0(DataSource dataSource, he.p pVar) {
        LoadEventInfo.f5695c.getAndIncrement();
        this.f15711d = pVar;
        this.f15712e = new he.s0(dataSource);
    }

    @Override // he.h0
    public final void l() {
        he.s0 s0Var = this.f15712e;
        s0Var.f10699e = 0L;
        try {
            s0Var.d(this.f15711d);
            int i7 = 0;
            while (i7 != -1) {
                int i10 = (int) s0Var.f10699e;
                byte[] bArr = this.f15713i;
                if (bArr == null) {
                    this.f15713i = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                } else if (i10 == bArr.length) {
                    this.f15713i = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f15713i;
                i7 = s0Var.read(bArr2, i10, bArr2.length - i10);
            }
        } finally {
            c9.a.f(s0Var);
        }
    }

    @Override // he.h0
    public final void t() {
    }
}
