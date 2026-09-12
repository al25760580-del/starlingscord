package sh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements th.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pf.b f20111e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final th.f f20112i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final th.f f20113v;

    public /* synthetic */ n(pf.b bVar, th.f fVar, th.f fVar2, int i7) {
        this.f20110d = i7;
        this.f20111e = bVar;
        this.f20112i = fVar;
        this.f20113v = fVar2;
    }

    @Override // th.g
    public final Object a() {
        String string;
        switch (this.f20110d) {
            case 0:
                return new m(((u1) this.f20111e.f18027e).f20202a, (p0) this.f20112i.a(), (g1) this.f20113v.a());
            default:
                Context context = ((u1) this.f20111e.f18027e).f20202a;
                th.f fVar = new th.f(new pf.b(8, this.f20112i));
                th.f fVar2 = new th.f(new pf.b(8, this.f20113v));
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
                    string = bundle == null ? null : bundle.getString("local_testing_dir");
                } catch (PackageManager.NameNotFoundException unused) {
                }
                v1 v1Var = string == null ? (v1) fVar.a() : (v1) fVar2.a();
                e4.f.d(v1Var);
                return v1Var;
        }
    }
}
