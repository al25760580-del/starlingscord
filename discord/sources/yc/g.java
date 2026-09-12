package yc;

import a5.l0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import ei.e0;
import gc.g0;
import java.util.ArrayList;
import java.util.Arrays;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f23257o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f23258p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23259n;

    public static boolean e(w wVar, byte[] bArr) {
        if (wVar.a() < bArr.length) {
            return false;
        }
        int i7 = wVar.f13861b;
        byte[] bArr2 = new byte[bArr.length];
        wVar.e(bArr2, 0, bArr.length);
        wVar.F(i7);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // yc.h
    public final long b(w wVar) {
        byte[] bArr = wVar.f13860a;
        return (((long) this.f23268i) * ic.a.f(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // yc.h
    public final boolean c(w wVar, long j, e4.e eVar) {
        if (e(wVar, f23257o)) {
            byte[] bArrCopyOf = Arrays.copyOf(wVar.f13860a, wVar.f13862c);
            int i7 = bArrCopyOf[9] & 255;
            ArrayList arrayListB = ic.a.b(bArrCopyOf);
            if (((Format) eVar.f7971e) == null) {
                g0 g0Var = new g0();
                g0Var.k = "audio/opus";
                g0Var.f9656x = i7;
                g0Var.f9657y = 48000;
                g0Var.f9645m = arrayListB;
                eVar.f7971e = new Format(g0Var);
                return true;
            }
        } else {
            if (!e(wVar, f23258p)) {
                je.b.l((Format) eVar.f7971e);
                return false;
            }
            je.b.l((Format) eVar.f7971e);
            if (!this.f23259n) {
                this.f23259n = true;
                wVar.G(8);
                Metadata metadataL = l0.L(e0.m((String[]) l0.N(wVar, false, false).f20946d));
                if (metadataL != null) {
                    g0 g0VarA = ((Format) eVar.f7971e).a();
                    Metadata metadata = ((Format) eVar.f7971e).G;
                    if (metadata != null) {
                        metadataL = metadataL.a(metadata.f5693d);
                    }
                    g0VarA.f9643i = metadataL;
                    eVar.f7971e = new Format(g0VarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // yc.h
    public final void d(boolean z5) {
        super.d(z5);
        if (z5) {
            this.f23259n = false;
        }
    }
}
