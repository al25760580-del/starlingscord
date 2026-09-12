package pc;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17903a = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];

    @Override // pc.x
    public final int a(he.k kVar, int i7, boolean z5) throws EOFException {
        byte[] bArr = this.f17903a;
        int i10 = kVar.read(bArr, 0, Math.min(bArr.length, i7));
        if (i10 != -1) {
            return i10;
        }
        if (z5) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // pc.x
    public final void d(int i7, je.w wVar) {
        wVar.G(i7);
    }

    @Override // pc.x
    public final void e(Format format) {
    }

    @Override // pc.x
    public final void c(long j, int i7, int i10, int i11, w wVar) {
    }
}
