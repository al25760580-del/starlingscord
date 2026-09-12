package io.sentry.android.ndk;

import io.sentry.ndk.NativeScope;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f12465e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f12466i;

    public /* synthetic */ c(d dVar, String str, int i7) {
        this.f12464d = i7;
        this.f12465e = dVar;
        this.f12466i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12464d) {
            case 0:
                this.f12465e.f12468b.getClass();
                NativeScope.nativeRemoveTag(this.f12466i);
                break;
            default:
                this.f12465e.f12468b.getClass();
                NativeScope.nativeRemoveExtra(this.f12466i);
                break;
        }
    }
}
