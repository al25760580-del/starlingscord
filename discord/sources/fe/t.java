package fe;

import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import ei.c0;
import ei.e0;
import ei.r0;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9128h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e0 f9130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e0 f9132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9135q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e0 f9136r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e0 f9137s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9138t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9139u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9140v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9142x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap f9143y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashSet f9144z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9121a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9122b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9123c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9124d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9129i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;

    public t() {
        c0 c0Var = e0.f8303e;
        r0 r0Var = r0.f8352w;
        this.f9130l = r0Var;
        this.f9131m = 0;
        this.f9132n = r0Var;
        this.f9133o = 0;
        this.f9134p = Integer.MAX_VALUE;
        this.f9135q = Integer.MAX_VALUE;
        this.f9136r = r0Var;
        this.f9137s = r0Var;
        this.f9138t = 0;
        this.f9139u = 0;
        this.f9140v = false;
        this.f9141w = false;
        this.f9142x = false;
        this.f9143y = new HashMap();
        this.f9144z = new HashSet();
    }

    public final void a(TrackSelectionParameters trackSelectionParameters) {
        this.f9121a = trackSelectionParameters.f5740d;
        this.f9122b = trackSelectionParameters.f5741e;
        this.f9123c = trackSelectionParameters.f5742i;
        this.f9124d = trackSelectionParameters.f5743v;
        this.f9125e = trackSelectionParameters.f5744w;
        this.f9126f = trackSelectionParameters.f5745x;
        this.f9127g = trackSelectionParameters.f5746y;
        this.f9128h = trackSelectionParameters.E;
        this.f9129i = trackSelectionParameters.F;
        this.j = trackSelectionParameters.G;
        this.k = trackSelectionParameters.H;
        this.f9130l = trackSelectionParameters.I;
        this.f9131m = trackSelectionParameters.J;
        this.f9132n = trackSelectionParameters.K;
        this.f9133o = trackSelectionParameters.L;
        this.f9134p = trackSelectionParameters.M;
        this.f9135q = trackSelectionParameters.N;
        this.f9136r = trackSelectionParameters.O;
        this.f9137s = trackSelectionParameters.P;
        this.f9138t = trackSelectionParameters.Q;
        this.f9139u = trackSelectionParameters.R;
        this.f9140v = trackSelectionParameters.S;
        this.f9141w = trackSelectionParameters.T;
        this.f9142x = trackSelectionParameters.U;
        this.f9144z = new HashSet(trackSelectionParameters.W);
        this.f9143y = new HashMap(trackSelectionParameters.V);
    }

    public t b(int i7, int i10) {
        this.f9129i = i7;
        this.j = i10;
        this.k = true;
        return this;
    }
}
