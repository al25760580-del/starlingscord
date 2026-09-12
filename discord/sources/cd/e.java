package cd;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import e4.r;
import gc.o;
import gc.u0;
import gc.w;
import java.util.ArrayList;
import je.e0;
import je.m;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gc.e implements Handler.Callback {
    public final c L;
    public final w M;
    public final Handler N;
    public final d O;
    public com.facebook.imagepipeline.nativecode.b P;
    public boolean Q;
    public boolean R;
    public long S;
    public Metadata T;
    public long U;

    public e(w wVar, Looper looper) {
        Handler handler;
        super(5);
        this.M = wVar;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = e0.f13788a;
            handler = new Handler(looper, this);
        }
        this.N = handler;
        this.L = c.f3589a;
        this.O = new d(1);
        this.U = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public final void A(Metadata metadata, ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            b[] bVarArr = metadata.f5693d;
            if (i7 >= bVarArr.length) {
                return;
            }
            Format formatE = bVarArr[i7].e();
            if (formatE != null) {
                c cVar = this.L;
                if (cVar.b(formatE)) {
                    com.facebook.imagepipeline.nativecode.b bVarA = cVar.a(formatE);
                    byte[] bArrT = bVarArr[i7].t();
                    bArrT.getClass();
                    d dVar = this.O;
                    dVar.e();
                    dVar.i(bArrT.length);
                    dVar.f15010v.put(bArrT);
                    dVar.j();
                    Metadata metadataI = bVarA.i(dVar);
                    if (metadataI != null) {
                        A(metadataI, arrayList);
                    }
                } else {
                    arrayList.add(bVarArr[i7]);
                }
            } else {
                arrayList.add(bVarArr[i7]);
            }
            i7++;
        }
    }

    public final long B(long j) {
        je.b.k(j != -9223372036854775807L);
        je.b.k(this.U != -9223372036854775807L);
        return j - this.U;
    }

    @Override // gc.e
    public final String h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        Metadata metadata = (Metadata) message.obj;
        w wVar = this.M;
        com.google.android.exoplayer2.c cVar = wVar.f9916d;
        m mVar = cVar.f5654l;
        u0 u0VarA = cVar.f5648f0.a();
        int i7 = 0;
        while (true) {
            b[] bVarArr = metadata.f5693d;
            if (i7 >= bVarArr.length) {
                break;
            }
            bVarArr[i7].b(u0VarA);
            i7++;
        }
        cVar.f5648f0 = new MediaMetadata(u0VarA);
        MediaMetadata mediaMetadataC0 = cVar.c0();
        if (!mediaMetadataC0.equals(cVar.M)) {
            cVar.M = mediaMetadataC0;
            mVar.c(14, new o(3, wVar));
        }
        mVar.c(28, new o(4, metadata));
        mVar.b();
        return true;
    }

    @Override // gc.e
    public final boolean j() {
        return this.R;
    }

    @Override // gc.e
    public final boolean k() {
        return true;
    }

    @Override // gc.e
    public final void l() {
        this.T = null;
        this.P = null;
        this.U = -9223372036854775807L;
    }

    @Override // gc.e
    public final void n(long j, boolean z5) {
        this.T = null;
        this.Q = false;
        this.R = false;
    }

    @Override // gc.e
    public final void s(Format[] formatArr, long j, long j5) {
        this.P = this.L.a(formatArr[0]);
        Metadata metadata = this.T;
        if (metadata != null) {
            long j7 = metadata.f5694e;
            long j10 = (this.U + j7) - j5;
            if (j7 != j10) {
                metadata = new Metadata(j10, metadata.f5693d);
            }
            this.T = metadata;
        }
        this.U = j5;
    }

    @Override // gc.e
    public final void u(long j, long j5) {
        boolean z5 = true;
        while (z5) {
            int i7 = 0;
            if (!this.Q && this.T == null) {
                d dVar = this.O;
                dVar.e();
                r rVar = this.f9603i;
                rVar.y();
                int iT = t(rVar, dVar, 0);
                if (iT == -4) {
                    if (dVar.c(4)) {
                        this.Q = true;
                    } else {
                        dVar.F = this.S;
                        dVar.j();
                        com.facebook.imagepipeline.nativecode.b bVar = this.P;
                        int i10 = e0.f13788a;
                        Metadata metadataI = bVar.i(dVar);
                        if (metadataI != null) {
                            ArrayList arrayList = new ArrayList(metadataI.f5693d.length);
                            A(metadataI, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.T = new Metadata(B(dVar.f15012x), (b[]) arrayList.toArray(new b[0]));
                            }
                        }
                    }
                } else if (iT == -5) {
                    Format format = (Format) rVar.f8035i;
                    format.getClass();
                    this.S = format.M;
                }
            }
            Metadata metadata = this.T;
            if (metadata == null || metadata.f5694e > B(j)) {
                z5 = false;
            } else {
                Metadata metadata2 = this.T;
                Handler handler = this.N;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    w wVar = this.M;
                    com.google.android.exoplayer2.c cVar = wVar.f9916d;
                    m mVar = cVar.f5654l;
                    u0 u0VarA = cVar.f5648f0.a();
                    while (true) {
                        b[] bVarArr = metadata2.f5693d;
                        if (i7 >= bVarArr.length) {
                            break;
                        }
                        bVarArr[i7].b(u0VarA);
                        i7++;
                    }
                    cVar.f5648f0 = new MediaMetadata(u0VarA);
                    MediaMetadata mediaMetadataC0 = cVar.c0();
                    if (!mediaMetadataC0.equals(cVar.M)) {
                        cVar.M = mediaMetadataC0;
                        mVar.c(14, new o(3, wVar));
                    }
                    mVar.c(28, new o(4, metadata2));
                    mVar.b();
                }
                this.T = null;
                z5 = true;
            }
            if (this.Q && this.T == null) {
                this.R = true;
            }
        }
    }

    @Override // gc.e
    public final int y(Format format) {
        if (this.L.b(format)) {
            return gc.e.e(format.f5525d0 == 0 ? 4 : 2, 0, 0);
        }
        return gc.e.e(0, 0, 0);
    }
}
