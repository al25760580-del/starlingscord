package uc;

import androidx.recyclerview.widget.h;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.reactnativecommunity.clipboard.ClipboardModule;
import ei.r0;
import gc.g0;
import gc.h1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import je.w;
import org.xmlpull.v1.XmlPullParserException;
import pc.k;
import pc.l;
import pc.m;
import pc.n;
import pc.o;
import pc.x;
import xc.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f21024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21027e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public id.b f21029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f21030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f21031i;
    public xc.l j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f21023a = new w(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21028f = -1;

    public final void a() {
        b(new cd.b[0]);
        m mVar = this.f21024b;
        mVar.getClass();
        mVar.q();
        this.f21024b.c(new o(-9223372036854775807L));
        this.f21025c = 6;
    }

    public final void b(cd.b... bVarArr) {
        m mVar = this.f21024b;
        mVar.getClass();
        x xVarX = mVar.x(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 4);
        g0 g0Var = new g0();
        g0Var.j = ClipboardModule.MIMETYPE_JPEG;
        g0Var.f9643i = new Metadata(bVarArr);
        xVarX.e(new Format(g0Var));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    @Override // pc.k
    public final int d(l lVar, n nVar) throws h1, EOFException, InterruptedIOException {
        String strP;
        h hVarA;
        r0 r0Var;
        int i7;
        id.b bVar;
        long j;
        int i10 = this.f21025c;
        w wVar = this.f21023a;
        if (i10 == 0) {
            wVar.C(2);
            ((pc.h) lVar).a(wVar.f13860a, 0, 2, false);
            int iZ = wVar.z();
            this.f21026d = iZ;
            if (iZ == 65498) {
                if (this.f21028f != -1) {
                    this.f21025c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((iZ < 65488 || iZ > 65497) && iZ != 65281) {
                this.f21025c = 1;
            }
            return 0;
        }
        if (i10 == 1) {
            wVar.C(2);
            ((pc.h) lVar).a(wVar.f13860a, 0, 2, false);
            this.f21027e = wVar.z() - 2;
            this.f21025c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f21031i == null || lVar != this.f21030h) {
                    this.f21030h = lVar;
                    this.f21031i = new h(lVar, this.f21028f);
                }
                xc.l lVar2 = this.j;
                lVar2.getClass();
                int iD = lVar2.d(this.f21031i, nVar);
                if (iD == 1) {
                    nVar.f17905a += this.f21028f;
                }
                return iD;
            }
            long j5 = ((pc.h) lVar).f17895v;
            long j7 = this.f21028f;
            if (j5 != j7) {
                nVar.f17905a = j7;
                return 1;
            }
            pc.h hVar = (pc.h) lVar;
            if (!hVar.g(wVar.f13860a, 0, 1, true)) {
                a();
                return 0;
            }
            hVar.f17897x = 0;
            if (this.j == null) {
                this.j = new xc.l(0);
            }
            h hVar2 = new h(lVar, this.f21028f);
            this.f21031i = hVar2;
            this.j.getClass();
            if (!j.j(hVar2, false, false)) {
                a();
                return 0;
            }
            xc.l lVar3 = this.j;
            long j10 = this.f21028f;
            m mVar = this.f21024b;
            mVar.getClass();
            lVar3.f22817q = new h(j10, mVar, 7);
            id.b bVar2 = this.f21029g;
            bVar2.getClass();
            b(bVar2);
            this.f21025c = 5;
            return 0;
        }
        if (this.f21026d == 65505) {
            w wVar2 = new w(this.f21027e);
            ((pc.h) lVar).a(wVar2.f13860a, 0, this.f21027e, false);
            if (this.f21029g == null && "http://ns.adobe.com/xap/1.0/".equals(wVar2.p()) && (strP = wVar2.p()) != null) {
                long j11 = ((pc.h) lVar).f17894i;
                if (j11 == -1) {
                    bVar = null;
                } else {
                    try {
                        hVarA = d.a(strP);
                    } catch (h1 | NumberFormatException | XmlPullParserException unused) {
                        je.b.N("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        hVarA = null;
                    }
                    if (hVarA != null && (i7 = (r0Var = (r0) hVarA.f2615i).f8354v) >= 2) {
                        int i11 = i7 - 1;
                        long j12 = -1;
                        long j13 = -1;
                        long j14 = -1;
                        long j15 = -1;
                        boolean z5 = false;
                        while (i11 >= 0) {
                            b bVar3 = (b) r0Var.get(i11);
                            boolean zEquals = "video/mp4".equals(bVar3.f21032a) | z5;
                            if (i11 == 0) {
                                j11 -= bVar3.f21034c;
                                j = 0;
                            } else {
                                j = j11 - bVar3.f21033b;
                            }
                            long j16 = j;
                            long j17 = j11;
                            j11 = j16;
                            if (zEquals && j11 != j17) {
                                j15 = j17 - j11;
                                j14 = j11;
                                zEquals = false;
                            }
                            if (i11 == 0) {
                                j12 = j11;
                                j13 = j17;
                            }
                            i11--;
                            z5 = zEquals;
                        }
                        if (j14 == -1 || j15 == -1 || j12 == -1 || j13 == -1) {
                            bVar = null;
                        } else {
                            bVar = new id.b(j12, j13, hVarA.f2614e, j14, j15);
                        }
                    } else {
                        bVar = null;
                    }
                }
                this.f21029g = bVar;
                if (bVar != null) {
                    this.f21028f = bVar.f11705v;
                }
            }
        } else {
            ((pc.h) lVar).u(this.f21027e);
        }
        this.f21025c = 0;
        return 0;
    }

    @Override // pc.k
    public final void e(m mVar) {
        this.f21024b = mVar;
    }

    @Override // pc.k
    public final boolean f(l lVar) throws EOFException, InterruptedIOException {
        pc.h hVar = (pc.h) lVar;
        w wVar = this.f21023a;
        wVar.C(2);
        hVar.g(wVar.f13860a, 0, 2, false);
        if (wVar.z() == 65496) {
            wVar.C(2);
            hVar.g(wVar.f13860a, 0, 2, false);
            int iZ = wVar.z();
            this.f21026d = iZ;
            if (iZ == 65504) {
                wVar.C(2);
                hVar.g(wVar.f13860a, 0, 2, false);
                hVar.b(wVar.z() - 2, false);
                wVar.C(2);
                hVar.g(wVar.f13860a, 0, 2, false);
                this.f21026d = wVar.z();
            }
            if (this.f21026d == 65505) {
                hVar.b(2, false);
                wVar.C(6);
                hVar.g(wVar.f13860a, 0, 6, false);
                if (wVar.v() == 1165519206 && wVar.z() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        if (j == 0) {
            this.f21025c = 0;
            this.j = null;
        } else if (this.f21025c == 5) {
            xc.l lVar = this.j;
            lVar.getClass();
            lVar.g(j, j5);
        }
    }

    @Override // pc.k
    public final void release() {
        xc.l lVar = this.j;
        if (lVar != null) {
            lVar.getClass();
        }
    }
}
