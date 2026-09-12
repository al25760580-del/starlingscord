package od;

import com.google.android.exoplayer2.Format;
import je.e0;
import pc.w;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f17209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pc.j f17210c = new pc.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Format f17211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f17212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17213f;

    public c(int i7, int i10, Format format) {
        this.f17208a = i10;
        this.f17209b = format;
    }

    @Override // pc.x
    public final int a(he.k kVar, int i7, boolean z5) {
        x xVar = this.f17212e;
        int i10 = e0.f13788a;
        return xVar.b(kVar, i7, z5);
    }

    @Override // pc.x
    public final void c(long j, int i7, int i10, int i11, w wVar) {
        long j5 = this.f17213f;
        if (j5 != -9223372036854775807L && j >= j5) {
            this.f17212e = this.f17210c;
        }
        x xVar = this.f17212e;
        int i12 = e0.f13788a;
        xVar.c(j, i7, i10, i11, wVar);
    }

    @Override // pc.x
    public final void d(int i7, je.w wVar) {
        x xVar = this.f17212e;
        int i10 = e0.f13788a;
        xVar.d(i7, wVar);
    }

    @Override // pc.x
    public final void e(Format format) {
        Format format2 = this.f17209b;
        if (format2 != null) {
            format = format.c(format2);
        }
        this.f17211d = format;
        x xVar = this.f17212e;
        int i7 = e0.f13788a;
        xVar.e(format);
    }
}
