package fe;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import ei.e0;
import ei.p0;
import ei.q0;
import ei.x;
import java.util.Locale;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends m implements Comparable {
    public final com.google.android.exoplayer2.trackselection.a E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final int K;
    public final int L;
    public final boolean M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final boolean R;
    public final boolean S;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f9087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f9088y;

    public e(int i7, x0 x0Var, int i10, com.google.android.exoplayer2.trackselection.a aVar, int i11, boolean z5, d dVar) {
        e0 e0Var;
        int i12;
        int iB;
        String[] strArrSplit;
        int iB2;
        super(i7, x0Var, i10);
        this.E = aVar;
        this.f9088y = DefaultTrackSelector.f(this.f9108v.f5528i);
        int i13 = 0;
        this.F = DefaultTrackSelector.d(i11, false);
        int i14 = 0;
        while (true) {
            e0 e0Var2 = aVar.K;
            e0Var = aVar.O;
            i12 = Integer.MAX_VALUE;
            if (i14 >= e0Var2.size()) {
                iB = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iB = DefaultTrackSelector.b(this.f9108v, (String) aVar.K.get(i14), false);
                if (iB > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.H = i14;
        this.G = iB;
        int i15 = this.f9108v.f5530w;
        int i16 = aVar.L;
        this.I = (i15 == 0 || i15 != i16) ? Integer.bitCount(i15 & i16) : Integer.MAX_VALUE;
        Format format = this.f9108v;
        int i17 = format.f5530w;
        this.J = i17 == 0 || (i17 & 1) != 0;
        this.M = (format.f5529v & 1) != 0;
        int i18 = format.V;
        this.N = i18;
        this.O = format.W;
        int i19 = format.E;
        this.P = i19;
        this.f9087x = (i19 == -1 || i19 <= aVar.N) && (i18 == -1 || i18 <= aVar.M) && dVar.apply(format);
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i20 = je.e0.f13788a;
        if (i20 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i20 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i21 = 0; i21 < strArrSplit.length; i21++) {
            strArrSplit[i21] = je.e0.J(strArrSplit[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 >= strArrSplit.length) {
                iB2 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            } else {
                iB2 = DefaultTrackSelector.b(this.f9108v, strArrSplit[i22], false);
                if (iB2 > 0) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.K = i22;
        this.L = iB2;
        for (int i23 = 0; i23 < e0Var.size(); i23++) {
            String str = this.f9108v.I;
            if (str != null && str.equals(e0Var.get(i23))) {
                i12 = i23;
                break;
            }
        }
        this.Q = i12;
        this.R = (i11 & 384) == 128;
        this.S = (i11 & 64) == 64;
        boolean z6 = this.f9087x;
        com.google.android.exoplayer2.trackselection.a aVar2 = this.E;
        if (DefaultTrackSelector.d(i11, aVar2.h0) && (z6 || aVar2.f5749b0)) {
            i13 = (!DefaultTrackSelector.d(i11, false) || !z6 || this.f9108v.E == -1 || aVar2.U || aVar2.T || (!aVar2.f5756j0 && z5)) ? 1 : 2;
        }
        this.f9086w = i13;
    }

    @Override // fe.m
    public final int a() {
        return this.f9086w;
    }

    @Override // fe.m
    public final boolean b(m mVar) {
        int i7;
        String str;
        int i10;
        e eVar = (e) mVar;
        Format format = eVar.f9108v;
        com.google.android.exoplayer2.trackselection.a aVar = this.E;
        boolean z5 = aVar.f5752e0;
        Format format2 = this.f9108v;
        if (!z5 && ((i10 = format2.V) == -1 || i10 != format.V)) {
            return false;
        }
        if (!aVar.f5750c0 && ((str = format2.I) == null || !TextUtils.equals(str, format.I))) {
            return false;
        }
        if (!aVar.f5751d0 && ((i7 = format2.W) == -1 || i7 != format.W)) {
            return false;
        }
        if (aVar.f5753f0) {
            return true;
        }
        return this.R == eVar.R && this.S == eVar.S;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        boolean z5 = this.F;
        boolean z6 = this.f9087x;
        q0 q0VarB = (z6 && z5) ? DefaultTrackSelector.k : DefaultTrackSelector.k.b();
        boolean z7 = eVar.F;
        int i7 = eVar.P;
        x xVarC = x.f8383a.c(z5, z7);
        Integer numValueOf = Integer.valueOf(this.H);
        Integer numValueOf2 = Integer.valueOf(eVar.H);
        p0 p0Var = p0.f8342i;
        x xVarB = xVarC.b(numValueOf, numValueOf2, p0Var).a(this.G, eVar.G).a(this.I, eVar.I).c(this.M, eVar.M).c(this.J, eVar.J).b(Integer.valueOf(this.K), Integer.valueOf(eVar.K), p0Var).a(this.L, eVar.L).c(z6, eVar.f9087x).b(Integer.valueOf(this.Q), Integer.valueOf(eVar.Q), p0Var);
        int i10 = this.P;
        x xVarB2 = xVarB.b(Integer.valueOf(i10), Integer.valueOf(i7), this.E.T ? DefaultTrackSelector.k.b() : DefaultTrackSelector.f5727l).c(this.R, eVar.R).c(this.S, eVar.S).b(Integer.valueOf(this.N), Integer.valueOf(eVar.N), q0VarB).b(Integer.valueOf(this.O), Integer.valueOf(eVar.O), q0VarB);
        Integer numValueOf3 = Integer.valueOf(i10);
        Integer numValueOf4 = Integer.valueOf(i7);
        if (!je.e0.a(this.f9088y, eVar.f9088y)) {
            q0VarB = DefaultTrackSelector.f5727l;
        }
        return xVarB2.b(numValueOf3, numValueOf4, q0VarB).e();
    }
}
