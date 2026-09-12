package yc;

import com.google.android.exoplayer2.Format;
import e4.r;
import java.util.Arrays;
import je.w;
import kotlin.jvm.internal.ByteCompanionObject;
import md.j0;
import pc.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f23245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j0 f23246o;

    @Override // yc.h
    public final long b(w wVar) {
        byte[] bArr = wVar.f13860a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i7 = (bArr[2] & 255) >> 4;
        if (i7 == 6 || i7 == 7) {
            wVar.G(4);
            wVar.A();
        }
        int iR = zs.a.R(i7, wVar);
        wVar.F(0);
        return iR;
    }

    @Override // yc.h
    public final boolean c(w wVar, long j, e4.e eVar) {
        byte[] bArr = wVar.f13860a;
        p pVar = this.f23245n;
        if (pVar == null) {
            p pVar2 = new p(bArr, 17);
            this.f23245n = pVar2;
            eVar.f7971e = pVar2.c(Arrays.copyOfRange(bArr, 9, wVar.f13862c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & ByteCompanionObject.MAX_VALUE) != 3) {
            if (b10 != -1) {
                return true;
            }
            j0 j0Var = this.f23246o;
            if (j0Var != null) {
                j0Var.f15636d = j;
                eVar.f7972i = j0Var;
            }
            ((Format) eVar.f7971e).getClass();
            return false;
        }
        r rVarX = a.a.x(wVar);
        p pVar3 = new p(pVar.f17909a, pVar.f17910b, pVar.f17911c, pVar.f17912d, pVar.f17913e, pVar.f17915g, pVar.f17916h, pVar.j, rVarX, pVar.f17918l);
        this.f23245n = pVar3;
        j0 j0Var2 = new j0();
        j0Var2.f15638i = pVar3;
        j0Var2.f15639v = rVarX;
        j0Var2.f15636d = -1L;
        j0Var2.f15637e = -1L;
        this.f23246o = j0Var2;
        return true;
    }

    @Override // yc.h
    public final void d(boolean z5) {
        super.d(z5);
        if (z5) {
            this.f23245n = null;
            this.f23246o = null;
        }
    }
}
