package rd;

import com.google.android.exoplayer2.Format;
import gc.g0;
import java.io.EOFException;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements pc.x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Format f19308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Format f19309g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.x f19310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f19311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Format f19312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f19313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19314e;

    static {
        g0 g0Var = new g0();
        g0Var.k = "application/id3";
        f19308f = new Format(g0Var);
        g0 g0Var2 = new g0();
        g0Var2.k = "application/x-emsg";
        f19309g = new Format(g0Var2);
    }

    public r(pc.x xVar, int i7) {
        this.f19310a = xVar;
        if (i7 == 1) {
            this.f19311b = f19308f;
        } else {
            if (i7 != 3) {
                throw new IllegalArgumentException(kk.b.h(i7, "Unknown metadataType: "));
            }
            this.f19311b = f19309g;
        }
        this.f19313d = new byte[0];
        this.f19314e = 0;
    }

    @Override // pc.x
    public final int a(he.k kVar, int i7, boolean z5) throws EOFException {
        int i10 = this.f19314e + i7;
        byte[] bArr = this.f19313d;
        if (bArr.length < i10) {
            this.f19313d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int i11 = kVar.read(this.f19313d, this.f19314e, i7);
        if (i11 != -1) {
            this.f19314e += i11;
            return i11;
        }
        if (z5) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // pc.x
    public final void c(long j, int i7, int i10, int i11, pc.w wVar) {
        this.f19312c.getClass();
        int i12 = this.f19314e - i11;
        je.w wVar2 = new je.w(Arrays.copyOfRange(this.f19313d, i12 - i10, i12));
        byte[] bArr = this.f19313d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f19314e = i11;
        String str = this.f19312c.I;
        Format format = this.f19311b;
        String str2 = format.I;
        String str3 = format.I;
        if (!e0.a(str, str2)) {
            if (!"application/x-emsg".equals(this.f19312c.I)) {
                je.b.N("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f19312c.I);
                return;
            }
            ed.a aVarE = dd.b.E(wVar2);
            Format formatE = aVarE.e();
            if (formatE == null || !e0.a(str3, formatE.I)) {
                je.b.N("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + aVarE.e());
                return;
            }
            byte[] bArrT = aVarE.t();
            bArrT.getClass();
            wVar2 = new je.w(bArrT);
        }
        int iA = wVar2.a();
        pc.x xVar = this.f19310a;
        xVar.d(iA, wVar2);
        xVar.c(j, i7, iA, i11, wVar);
    }

    @Override // pc.x
    public final void d(int i7, je.w wVar) {
        int i10 = this.f19314e + i7;
        byte[] bArr = this.f19313d;
        if (bArr.length < i10) {
            this.f19313d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        wVar.e(this.f19313d, this.f19314e, i7);
        this.f19314e += i7;
    }

    @Override // pc.x
    public final void e(Format format) {
        this.f19312c = format;
        this.f19310a.e(this.f19311b);
    }
}
