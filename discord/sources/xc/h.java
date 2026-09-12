package xc;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import je.e0;
import je.w;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f22762a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f22765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f22766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22770i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22771l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f22763b = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f22764c = new w();
    public final w j = new w(1);
    public final w k = new w();

    public h(x xVar, r rVar, f fVar) {
        this.f22762a = xVar;
        this.f22765d = rVar;
        this.f22766e = fVar;
        this.f22765d = rVar;
        this.f22766e = fVar;
        xVar.e(rVar.f22859a.f22835f);
        d();
    }

    public final p a() {
        if (this.f22771l) {
            q qVar = this.f22763b;
            f fVar = qVar.f22844a;
            int i7 = e0.f13788a;
            int i10 = fVar.f22755a;
            p pVar = qVar.f22854m;
            if (pVar == null) {
                p[] pVarArr = this.f22765d.f22859a.k;
                pVar = pVarArr == null ? null : pVarArr[i10];
            }
            if (pVar != null && pVar.f22839a) {
                return pVar;
            }
        }
        return null;
    }

    public final boolean b() {
        this.f22767f++;
        if (!this.f22771l) {
            return false;
        }
        int i7 = this.f22768g + 1;
        this.f22768g = i7;
        int[] iArr = this.f22763b.f22850g;
        int i10 = this.f22769h;
        if (i7 != iArr[i10]) {
            return true;
        }
        this.f22769h = i10 + 1;
        this.f22768g = 0;
        return false;
    }

    public final int c(int i7, int i10) {
        w wVar;
        p pVarA = a();
        if (pVarA == null) {
            return 0;
        }
        int length = pVarA.f22842d;
        q qVar = this.f22763b;
        if (length != 0) {
            wVar = qVar.f22855n;
        } else {
            byte[] bArr = pVarA.f22843e;
            int i11 = e0.f13788a;
            int length2 = bArr.length;
            w wVar2 = this.k;
            wVar2.D(bArr, length2);
            length = bArr.length;
            wVar = wVar2;
        }
        boolean z5 = qVar.k && qVar.f22853l[this.f22767f];
        boolean z6 = z5 || i10 != 0;
        w wVar3 = this.j;
        wVar3.f13860a[0] = (byte) ((z6 ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 0) | length);
        wVar3.F(0);
        x xVar = this.f22762a;
        xVar.d(1, wVar3);
        xVar.d(length, wVar);
        if (!z6) {
            return length + 1;
        }
        w wVar4 = this.f22764c;
        if (!z5) {
            wVar4.C(8);
            byte[] bArr2 = wVar4.f13860a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i10 & 255);
            bArr2[4] = (byte) ((i7 >> 24) & 255);
            bArr2[5] = (byte) ((i7 >> 16) & 255);
            bArr2[6] = (byte) ((i7 >> 8) & 255);
            bArr2[7] = (byte) (i7 & 255);
            xVar.d(8, wVar4);
            return length + 9;
        }
        w wVar5 = qVar.f22855n;
        int iZ = wVar5.z();
        wVar5.G(-2);
        int i12 = (iZ * 6) + 2;
        if (i10 != 0) {
            wVar4.C(i12);
            byte[] bArr3 = wVar4.f13860a;
            wVar5.e(bArr3, 0, i12);
            int i13 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i10;
            bArr3[2] = (byte) ((i13 >> 8) & 255);
            bArr3[3] = (byte) (i13 & 255);
        } else {
            wVar4 = wVar5;
        }
        xVar.d(i12, wVar4);
        return length + 1 + i12;
    }

    public final void d() {
        q qVar = this.f22763b;
        qVar.f22847d = 0;
        qVar.f22857p = 0L;
        qVar.f22858q = false;
        qVar.k = false;
        qVar.f22856o = false;
        qVar.f22854m = null;
        this.f22767f = 0;
        this.f22769h = 0;
        this.f22768g = 0;
        this.f22770i = 0;
        this.f22771l = false;
    }
}
