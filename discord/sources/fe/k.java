package fe;

import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import ei.e0;
import ei.p0;
import ei.x;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends m implements Comparable {
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9102w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f9103x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f9104y;

    public k(int i7, x0 x0Var, int i10, com.google.android.exoplayer2.trackselection.a aVar, int i11, String str) {
        int iB;
        super(i7, x0Var, i10);
        int i12 = 0;
        this.f9103x = DefaultTrackSelector.d(i11, false);
        int i13 = this.f9108v.f5529v;
        int i14 = aVar.R;
        e0 e0Var = aVar.P;
        int i15 = i13 & (~i14);
        this.f9104y = (i15 & 1) != 0;
        this.E = (i15 & 2) != 0;
        e0 e0VarR = e0Var.isEmpty() ? e0.r("") : e0Var;
        int i16 = 0;
        while (true) {
            if (i16 >= e0VarR.size()) {
                iB = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iB = DefaultTrackSelector.b(this.f9108v, (String) e0VarR.get(i16), aVar.S);
                if (iB > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.F = i16;
        this.G = iB;
        int i17 = this.f9108v.f5530w;
        int i18 = aVar.Q;
        int iBitCount = (i17 == 0 || i17 != i18) ? Integer.bitCount(i17 & i18) : Integer.MAX_VALUE;
        this.H = iBitCount;
        this.J = (this.f9108v.f5530w & 1088) != 0;
        int iB2 = DefaultTrackSelector.b(this.f9108v, str, DefaultTrackSelector.f(str) == null);
        this.I = iB2;
        boolean z5 = iB > 0 || (e0Var.isEmpty() && iBitCount > 0) || this.f9104y || (this.E && iB2 > 0);
        if (DefaultTrackSelector.d(i11, aVar.h0) && z5) {
            i12 = 1;
        }
        this.f9102w = i12;
    }

    @Override // fe.m
    public final int a() {
        return this.f9102w;
    }

    @Override // fe.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        x xVarC = x.f8383a.c(this.f9103x, kVar.f9103x);
        Integer numValueOf = Integer.valueOf(this.F);
        Integer numValueOf2 = Integer.valueOf(kVar.F);
        p0 p0Var = p0.f8341e;
        p0 p0Var2 = p0.f8342i;
        x xVarB = xVarC.b(numValueOf, numValueOf2, p0Var2);
        int i7 = kVar.G;
        int i10 = this.G;
        x xVarA = xVarB.a(i10, i7);
        int i11 = kVar.H;
        int i12 = this.H;
        x xVarC2 = xVarA.a(i12, i11).c(this.f9104y, kVar.f9104y);
        Boolean boolValueOf = Boolean.valueOf(this.E);
        Boolean boolValueOf2 = Boolean.valueOf(kVar.E);
        if (i10 != 0) {
            p0Var = p0Var2;
        }
        x xVarA2 = xVarC2.b(boolValueOf, boolValueOf2, p0Var).a(this.I, kVar.I);
        if (i12 == 0) {
            xVarA2 = xVarA2.d(this.J, kVar.J);
        }
        return xVarA2.e();
    }
}
