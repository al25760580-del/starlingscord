package jj;

import ij.m;
import java.io.EOFException;
import je.w;
import pc.l;
import yc.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13915e;

    public a(mj.b bVar, m[] mVarArr, boolean z5, int i7, int i10) {
        this.f13914d = bVar;
        this.f13915e = mVarArr;
        this.f13913c = z5;
        this.f13911a = i7;
        this.f13912b = i10;
    }

    public int a(int i7) {
        int i10;
        int i11 = 0;
        this.f13912b = 0;
        do {
            int i12 = this.f13912b;
            int i13 = i7 + i12;
            e eVar = (e) this.f13914d;
            if (i13 >= eVar.f23252c) {
                break;
            }
            int[] iArr = eVar.f23255f;
            this.f13912b = i12 + 1;
            i10 = iArr[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public boolean b(l lVar) {
        int i7;
        e eVar = (e) this.f13914d;
        w wVar = (w) this.f13915e;
        je.b.k(lVar != null);
        if (this.f13913c) {
            this.f13913c = false;
            wVar.C(0);
        }
        while (!this.f13913c) {
            if (this.f13911a < 0) {
                if (eVar.b(lVar, -1L) && eVar.a(lVar, true)) {
                    int iA = eVar.f23253d;
                    if ((eVar.f23250a & 1) == 1 && wVar.f13862c == 0) {
                        iA += a(0);
                        i7 = this.f13912b;
                    } else {
                        i7 = 0;
                    }
                    try {
                        lVar.u(iA);
                        this.f13911a = i7;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f13911a);
            int i10 = this.f13911a + this.f13912b;
            if (iA2 > 0) {
                wVar.b(wVar.f13862c + iA2);
                try {
                    lVar.readFully(wVar.f13860a, wVar.f13862c, iA2);
                    wVar.E(wVar.f13862c + iA2);
                    this.f13913c = eVar.f23255f[i10 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i10 == eVar.f23252c) {
                i10 = -1;
            }
            this.f13911a = i10;
        }
        return true;
    }

    public a() {
        this.f13914d = new e();
        this.f13915e = new w(new byte[65025], 0);
        this.f13911a = -1;
    }
}
