package he;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements DataSource {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DataSource f10698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10699e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f10700i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Map f10701v;

    public s0(DataSource dataSource) {
        dataSource.getClass();
        this.f10698d = dataSource;
        this.f10700i = Uri.EMPTY;
        this.f10701v = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void B(u0 u0Var) {
        u0Var.getClass();
        this.f10698d.B(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        this.f10698d.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) {
        this.f10700i = pVar.f10649a;
        this.f10701v = Collections.EMPTY_MAP;
        DataSource dataSource = this.f10698d;
        long jD = dataSource.d(pVar);
        Uri uriY = dataSource.y();
        uriY.getClass();
        this.f10700i = uriY;
        this.f10701v = dataSource.s();
        return jD;
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) {
        int i11 = this.f10698d.read(bArr, i7, i10);
        if (i11 != -1) {
            this.f10699e += (long) i11;
        }
        return i11;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map s() {
        return this.f10698d.s();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        return this.f10698d.y();
    }
}
