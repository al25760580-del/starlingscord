package io.sentry.android.replay;

import io.sentry.IScope;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.r3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements r3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f12472e;

    public /* synthetic */ a(Ref.ObjectRef objectRef, int i7) {
        this.f12471d = i7;
        this.f12472e = objectRef;
    }

    @Override // io.sentry.r3
    public final void g(IScope iScope) {
        switch (this.f12471d) {
            case 0:
                ReplayIntegration.onScreenshotRecorded$lambda$4(this.f12472e, iScope);
                break;
            default:
                CaptureStrategy.Companion.createSegment$lambda$1(this.f12472e, iScope);
                break;
        }
    }
}
