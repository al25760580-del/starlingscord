package io.sentry.android.ndk;

import io.sentry.ndk.NativeScope;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f12461e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f12462i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f12463v;

    public /* synthetic */ b(d dVar, String str, String str2, int i7) {
        this.f12460d = i7;
        this.f12461e = dVar;
        this.f12462i = str;
        this.f12463v = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12460d) {
            case 0:
                this.f12461e.f12468b.getClass();
                NativeScope.nativeSetExtra(this.f12462i, this.f12463v);
                break;
            default:
                this.f12461e.f12468b.getClass();
                NativeScope.nativeSetTag(this.f12462i, this.f12463v);
                break;
        }
    }
}
