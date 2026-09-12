package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a4 implements io.sentry.util.runtime.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f12047e;

    public /* synthetic */ a4(File file, int i7) {
        this.f12046d = i7;
        this.f12047e = file;
    }

    @Override // io.sentry.util.runtime.a
    public final Object run() {
        switch (this.f12046d) {
            case 0:
                return Boolean.valueOf(this.f12047e.mkdirs());
            case 1:
                return Boolean.valueOf(this.f12047e.mkdirs());
            case 2:
                return Boolean.valueOf(this.f12047e.mkdirs());
            case 3:
                return Boolean.valueOf(this.f12047e.exists());
            default:
                return Boolean.valueOf(this.f12047e.delete());
        }
    }
}
