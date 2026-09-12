package sh;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20068i;
    public final /* synthetic */ m j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, ig.g gVar, int i7) {
        super(mVar, gVar);
        this.f20068i = i7;
        this.j = mVar;
    }

    @Override // sh.h, th.l
    public void a(Bundle bundle, Bundle bundle2) {
        switch (this.f20068i) {
            case 1:
                super.a(bundle, bundle2);
                m mVar = this.j;
                if (!mVar.f20101f.compareAndSet(true, false)) {
                    m.f20094g.e("Expected keepingAlive to be true, but was false.", new Object[0]);
                }
                if (bundle.getBoolean("keep_alive")) {
                    mVar.f();
                }
                break;
            default:
                super.a(bundle, bundle2);
                break;
        }
    }

    @Override // sh.h, th.l
    public void c(List list) {
        switch (this.f20068i) {
            case 0:
                super.c(list);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Bundle bundle = (Bundle) it.next();
                    m mVar = this.j;
                    AssetPackState assetPackState = (AssetPackState) x.a(bundle, mVar.f20097b, mVar.f20098c).f20228b.values().iterator().next();
                    if (assetPackState == null) {
                        m.f20094g.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
                    }
                    int iH = assetPackState.h();
                    if (iH == 1 || iH == 7 || iH == 2 || iH == 9 || iH == 3) {
                        arrayList.add(assetPackState.g());
                    }
                }
                this.f20049g.d(arrayList);
                break;
            default:
                super.c(list);
                break;
        }
    }

    @Override // sh.h, th.l
    public void m(Bundle bundle) {
        switch (this.f20068i) {
            case 1:
                th.q qVar = this.j.f20100e;
                ig.g gVar = this.f20049g;
                qVar.d(gVar);
                int i7 = bundle.getInt("error_code");
                m.f20094g.b("onError(%d)", Integer.valueOf(i7));
                gVar.c(new ph.a(i7, 1));
                break;
            default:
                super.m(bundle);
                break;
        }
    }
}
