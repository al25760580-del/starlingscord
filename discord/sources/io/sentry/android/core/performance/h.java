package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.i;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cb.a f12387e;

    public h(Window.Callback callback, cb.a aVar) {
        super(callback);
        this.f12387e = aVar;
    }

    @Override // io.sentry.android.core.internal.gestures.i, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.f12387e.run();
    }
}
