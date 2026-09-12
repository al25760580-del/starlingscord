package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p3 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1081b;

    public /* synthetic */ p3(int i7, Object obj) {
        this.f1080a = i7;
        this.f1081b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1080a) {
            case 0:
                ((Runnable) this.f1081b).run();
                break;
            case 1:
                ((e.p) this.f1081b).invoke();
                break;
            default:
                ((androidx.appcompat.app.a) this.f1081b).V();
                break;
        }
    }
}
