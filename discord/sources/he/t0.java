package he;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements DataSource {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DataSource f10709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ie.d f10710e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10711i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10712v;

    public t0(DataSource dataSource, ie.d dVar) {
        dataSource.getClass();
        this.f10709d = dataSource;
        this.f10710e = dVar;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void B(u0 u0Var) {
        u0Var.getClass();
        this.f10709d.B(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() throws ie.c {
        ie.d dVar = this.f10710e;
        try {
            this.f10709d.close();
            if (this.f10711i) {
                this.f10711i = false;
                if (dVar.f11717d == null) {
                    return;
                }
                try {
                    dVar.a();
                } catch (IOException e10) {
                    throw new ie.c(e10);
                }
            }
        } catch (Throwable th2) {
            if (this.f10711i) {
                this.f10711i = false;
                if (dVar.f11717d != null) {
                    try {
                        dVar.a();
                    } catch (IOException e11) {
                        throw new ie.c(e11);
                    }
                }
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) throws ie.c {
        long jD = this.f10709d.d(pVar);
        this.f10712v = jD;
        if (jD == 0) {
            return 0L;
        }
        if (pVar.f10655g == -1 && jD != -1) {
            pVar = pVar.d(0L, jD);
        }
        int i7 = pVar.f10657i;
        this.f10711i = true;
        pVar.f10656h.getClass();
        long j = pVar.f10655g;
        ie.d dVar = this.f10710e;
        if (j == -1 && (i7 & 2) == 2) {
            dVar.f11717d = null;
        } else {
            dVar.f11717d = pVar;
            dVar.f11718e = (i7 & 4) == 4 ? dVar.f11715b : LongCompanionObject.MAX_VALUE;
            dVar.f11722i = 0L;
            try {
                dVar.b(pVar);
            } catch (IOException e10) {
                throw new ie.c(e10);
            }
        }
        return this.f10712v;
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) throws ie.c {
        if (this.f10712v == 0) {
            return -1;
        }
        int i11 = this.f10709d.read(bArr, i7, i10);
        if (i11 > 0) {
            ie.d dVar = this.f10710e;
            p pVar = dVar.f11717d;
            if (pVar != null) {
                int i12 = 0;
                while (i12 < i11) {
                    try {
                        if (dVar.f11721h == dVar.f11718e) {
                            dVar.a();
                            dVar.b(pVar);
                        }
                        int iMin = (int) Math.min(i11 - i12, dVar.f11718e - dVar.f11721h);
                        OutputStream outputStream = dVar.f11720g;
                        int i13 = je.e0.f13788a;
                        outputStream.write(bArr, i7 + i12, iMin);
                        i12 += iMin;
                        long j = iMin;
                        dVar.f11721h += j;
                        dVar.f11722i += j;
                    } catch (IOException e10) {
                        throw new ie.c(e10);
                    }
                }
            }
            long j5 = this.f10712v;
            if (j5 != -1) {
                this.f10712v = j5 - ((long) i11);
            }
        }
        return i11;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map s() {
        return this.f10709d.s();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        return this.f10709d.y();
    }
}
