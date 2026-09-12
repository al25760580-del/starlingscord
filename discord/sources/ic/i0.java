package ic;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f11514a = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f11515b = new h0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f11516c;

    public i0(j0 j0Var) {
        this.f11516c = j0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f11515b);
        this.f11514a.removeCallbacksAndMessages(null);
    }
}
