package qb;

import android.app.Activity;
import android.view.OrientationEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f18683a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, e eVar) {
        super(activity);
        this.f18683a = eVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i7) {
        e.f18685w.invoke(Integer.valueOf(i7), this.f18683a.f18686d);
    }
}
