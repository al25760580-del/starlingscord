package ee;

import java.util.List;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends vd.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f8138n;

    public a(List list) {
        this.f8137m = 1;
        w wVar = new w((byte[]) list.get(0));
        this.f8138n = new xd.g(wVar.z(), wVar.z());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // vd.e
    public final vd.f e(byte[] r50, int r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.a.e(byte[], int, boolean):vd.f");
    }

    public a() {
        this.f8137m = 0;
        this.f8138n = new w();
    }
}
