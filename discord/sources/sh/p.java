package sh;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends th.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v0 f20143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n0 f20144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c0 f20145i;
    public final p0 j;
    public final g1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f20146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final th.f f20147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final th.f f20148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final th.f f20149o;

    public p(Context context, v0 v0Var, n0 n0Var, th.f fVar, p0 p0Var, c0 c0Var, th.f fVar2, th.f fVar3, g1 g1Var) {
        super(new a5.o("AssetPackServiceListenerRegistry", 2), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f20146l = new Handler(Looper.getMainLooper());
        this.f20143g = v0Var;
        this.f20144h = n0Var;
        this.f20147m = fVar;
        this.j = p0Var;
        this.f20145i = c0Var;
        this.f20148n = fVar2;
        this.f20149o = fVar3;
        this.k = g1Var;
    }

    @Override // th.n
    public final void b(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.FLAGS");
        if (bundleExtra == null || !bundleExtra.getBoolean("enableWorkManager")) {
            Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
            a5.o oVar = this.f20778a;
            if (bundleExtra2 == null) {
                oVar.b("Empty bundle received from broadcast.", new Object[0]);
                return;
            }
            ArrayList<String> stringArrayList = bundleExtra2.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                oVar.b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            w wVarD = AssetPackState.d(bundleExtra2, stringArrayList.get(0), this.j, this.k, new vi.d(15, (byte) 0));
            oVar.a("ListenerRegistryBroadcastReceiver.onReceive: %s", wVarD);
            if (((PendingIntent) bundleExtra2.getParcelable("confirmation_intent")) != null) {
                this.f20145i.getClass();
            }
            ((Executor) this.f20149o.a()).execute(new a5.t(this, bundleExtra2, wVarD, 11));
            ((Executor) this.f20148n.a()).execute(new hi.o(17, this, bundleExtra2));
        }
    }
}
