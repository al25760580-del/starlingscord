package j2;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f13613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f13614b;

    public b(c cVar) {
        this.f13614b = cVar;
    }

    public final boolean a() {
        boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f13613a);
        this.f13613a = null;
        return zUnregisterDurationScaleChangeListener;
    }
}
