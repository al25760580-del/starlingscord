package jd;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import je.b0;
import je.v;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.facebook.imagepipeline.nativecode.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f13727f = new w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f13728g = new v();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f13729h;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // com.facebook.imagepipeline.nativecode.b
    public final Metadata j(cd.d dVar, ByteBuffer byteBuffer) {
        int i7;
        cd.b fVar;
        long j;
        long j5;
        boolean z5;
        boolean z6;
        boolean z7;
        int iZ;
        int iU;
        int iU2;
        long jV;
        boolean z10;
        long j7;
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        int iU3;
        long j11;
        boolean z15;
        long j12;
        w wVar = this.f13727f;
        v vVar = this.f13728g;
        b0 b0Var = this.f13729h;
        if (b0Var != null) {
            long j13 = dVar.F;
            synchronized (b0Var) {
                j12 = b0Var.f13768b;
            }
            if (j13 != j12) {
                b0 b0Var2 = new b0(dVar.f15012x);
                this.f13729h = b0Var2;
                b0Var2.a(dVar.f15012x - dVar.F);
            }
        } else {
            b0 b0Var3 = new b0(dVar.f15012x);
            this.f13729h = b0Var3;
            b0Var3.a(dVar.f15012x - dVar.F);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        wVar.D(bArrArray, iLimit);
        vVar.o(bArrArray, iLimit);
        vVar.s(39);
        boolean z16 = true;
        long jI = (((long) vVar.i(1)) << 32) | ((long) vVar.i(32));
        vVar.s(20);
        int i12 = vVar.i(12);
        int i13 = vVar.i(8);
        wVar.G(14);
        if (i13 == 0) {
            i7 = 0;
            fVar = new f();
        } else if (i13 != 255) {
            long jV2 = -9223372036854775807L;
            if (i13 == 4) {
                int iU4 = wVar.u();
                ArrayList arrayList = new ArrayList(iU4);
                int i14 = 0;
                while (i14 < iU4) {
                    long jV3 = wVar.v();
                    boolean z17 = (wVar.u() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? z16 : false;
                    ArrayList arrayList2 = new ArrayList();
                    if (z17) {
                        j = -9223372036854775807L;
                        j5 = -9223372036854775807L;
                        z5 = false;
                        z6 = false;
                        z7 = false;
                        iZ = 0;
                        iU = 0;
                        iU2 = 0;
                    } else {
                        int iU5 = wVar.u();
                        boolean z18 = (iU5 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? z16 : false;
                        boolean z19 = (iU5 & 64) != 0 ? z16 : false;
                        boolean z20 = (iU5 & 32) != 0 ? z16 : false;
                        long jV4 = z19 ? wVar.v() : -9223372036854775807L;
                        if (!z19) {
                            int iU6 = wVar.u();
                            ArrayList arrayList3 = new ArrayList(iU6);
                            for (int i15 = 0; i15 < iU6; i15++) {
                                arrayList3.add(new g(wVar.u(), wVar.v()));
                            }
                            arrayList2 = arrayList3;
                        }
                        if (z20) {
                            long jU = wVar.u();
                            z10 = (jU & 128) != 0;
                            jV = ((((jU & 1) << 32) | wVar.v()) * 1000) / 90;
                        } else {
                            jV = -9223372036854775807L;
                            z10 = false;
                        }
                        j5 = jV;
                        z7 = z10;
                        iZ = wVar.z();
                        z5 = z18;
                        z6 = z19;
                        j = jV4;
                        iU = wVar.u();
                        iU2 = wVar.u();
                    }
                    arrayList.add(new h(jV3, z17, z5, z6, arrayList2, j, z7, j5, iZ, iU, iU2));
                    i14++;
                    z16 = true;
                }
                fVar = new i(arrayList);
            } else if (i13 == 5) {
                b0 b0Var4 = this.f13729h;
                long jV5 = wVar.v();
                boolean z21 = (wVar.u() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
                List list = Collections.EMPTY_LIST;
                if (z21) {
                    j7 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                    z11 = false;
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    i10 = 0;
                    i11 = 0;
                    iU3 = 0;
                } else {
                    int iU7 = wVar.u();
                    boolean z22 = (iU7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
                    boolean z23 = (iU7 & 64) != 0;
                    boolean z24 = (iU7 & 32) != 0;
                    boolean z25 = (iU7 & 16) != 0;
                    long jA = (!z23 || z25) ? -9223372036854775807L : j.a(jI, wVar);
                    if (z23) {
                        j11 = 90;
                    } else {
                        int iU8 = wVar.u();
                        ArrayList arrayList4 = new ArrayList(iU8);
                        j11 = 90;
                        for (int i16 = 0; i16 < iU8; i16++) {
                            int iU9 = wVar.u();
                            long jA2 = !z25 ? j.a(jI, wVar) : -9223372036854775807L;
                            arrayList4.add(new d(iU9, jA2, b0Var4.b(jA2)));
                        }
                        list = arrayList4;
                    }
                    if (z24) {
                        long jU2 = wVar.u();
                        z15 = (jU2 & 128) != 0;
                        jV2 = ((((jU2 & 1) << 32) | wVar.v()) * 1000) / j11;
                    } else {
                        z15 = false;
                    }
                    int iZ2 = wVar.z();
                    int iU10 = wVar.u();
                    iU3 = wVar.u();
                    z14 = z15;
                    z13 = z25;
                    i10 = iZ2;
                    i11 = iU10;
                    j10 = jV2;
                    j7 = jA;
                    z11 = z22;
                    z12 = z23;
                }
                fVar = new e(jV5, z21, z11, z12, z13, j7, b0Var4.b(j7), list, z14, j10, i10, i11, iU3);
            } else if (i13 != 6) {
                fVar = null;
            } else {
                b0 b0Var5 = this.f13729h;
                long jA3 = j.a(jI, wVar);
                fVar = new j(jA3, b0Var5.b(jA3));
            }
            i7 = 0;
        } else {
            long jV6 = wVar.v();
            int i17 = i12 - 4;
            byte[] bArr = new byte[i17];
            i7 = 0;
            wVar.e(bArr, 0, i17);
            fVar = new a(jV6, jI, bArr);
        }
        if (fVar == null) {
            return new Metadata(new cd.b[i7]);
        }
        cd.b[] bVarArr = new cd.b[1];
        bVarArr[i7] = fVar;
        return new Metadata(bVarArr);
    }
}
