package com.google.android.exoplayer2.trackselection;

import ei.e0;
import ei.h0;
import ei.p;
import ei.w0;
import fe.t;
import gc.g;

/* JADX INFO: loaded from: classes3.dex */
public class TrackSelectionParameters implements g {
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final e0 I;
    public final int J;
    public final e0 K;
    public final int L;
    public final int M;
    public final int N;
    public final e0 O;
    public final e0 P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final w0 V;
    public final h0 W;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5741e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5742i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5743v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f5745x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f5746y;

    static {
        new TrackSelectionParameters(new t());
        int i7 = je.e0.f13788a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
    }

    public TrackSelectionParameters(t tVar) {
        this.f5740d = tVar.f9121a;
        this.f5741e = tVar.f9122b;
        this.f5742i = tVar.f9123c;
        this.f5743v = tVar.f9124d;
        this.f5744w = tVar.f9125e;
        this.f5745x = tVar.f9126f;
        this.f5746y = tVar.f9127g;
        this.E = tVar.f9128h;
        this.F = tVar.f9129i;
        this.G = tVar.j;
        this.H = tVar.k;
        this.I = tVar.f9130l;
        this.J = tVar.f9131m;
        this.K = tVar.f9132n;
        this.L = tVar.f9133o;
        this.M = tVar.f9134p;
        this.N = tVar.f9135q;
        this.O = tVar.f9136r;
        this.P = tVar.f9137s;
        this.Q = tVar.f9138t;
        this.R = tVar.f9139u;
        this.S = tVar.f9140v;
        this.T = tVar.f9141w;
        this.U = tVar.f9142x;
        this.V = w0.a(tVar.f9143y);
        this.W = h0.m(tVar.f9144z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
            if (this.f5740d == trackSelectionParameters.f5740d && this.f5741e == trackSelectionParameters.f5741e && this.f5742i == trackSelectionParameters.f5742i && this.f5743v == trackSelectionParameters.f5743v && this.f5744w == trackSelectionParameters.f5744w && this.f5745x == trackSelectionParameters.f5745x && this.f5746y == trackSelectionParameters.f5746y && this.E == trackSelectionParameters.E && this.H == trackSelectionParameters.H && this.F == trackSelectionParameters.F && this.G == trackSelectionParameters.G && this.I.equals(trackSelectionParameters.I) && this.J == trackSelectionParameters.J && this.K.equals(trackSelectionParameters.K) && this.L == trackSelectionParameters.L && this.M == trackSelectionParameters.M && this.N == trackSelectionParameters.N && this.O.equals(trackSelectionParameters.O) && this.P.equals(trackSelectionParameters.P) && this.Q == trackSelectionParameters.Q && this.R == trackSelectionParameters.R && this.S == trackSelectionParameters.S && this.T == trackSelectionParameters.T && this.U == trackSelectionParameters.U) {
                w0 w0Var = trackSelectionParameters.V;
                w0 w0Var2 = this.V;
                w0Var2.getClass();
                if (p.e(w0Var2, w0Var) && this.W.equals(trackSelectionParameters.W)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.W.hashCode() + ((this.V.hashCode() + ((((((((((((this.P.hashCode() + ((this.O.hashCode() + ((((((((this.K.hashCode() + ((((this.I.hashCode() + ((((((((((((((((((((((this.f5740d + 31) * 31) + this.f5741e) * 31) + this.f5742i) * 31) + this.f5743v) * 31) + this.f5744w) * 31) + this.f5745x) * 31) + this.f5746y) * 31) + this.E) * 31) + (this.H ? 1 : 0)) * 31) + this.F) * 31) + this.G) * 31)) * 31) + this.J) * 31)) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31)) * 31)) * 31) + this.Q) * 31) + this.R) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31)) * 31);
    }
}
