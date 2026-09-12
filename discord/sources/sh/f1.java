package sh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 implements th.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pf.b f20037e;

    public /* synthetic */ f1(pf.b bVar, int i7) {
        this.f20036d = i7;
        this.f20037e = bVar;
    }

    @Override // th.g
    public final Object a() {
        switch (this.f20036d) {
            case 0:
                return new e1(((u1) this.f20037e.f18027e).f20202a);
            default:
                Context context = ((u1) this.f20037e.f18027e).f20202a;
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
                    if (bundle != null) {
                        return bundle.getString("local_testing_dir");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return null;
        }
    }
}
