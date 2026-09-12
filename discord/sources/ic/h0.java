package ic;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f11510a;

    public h0(i0 i0Var) {
        this.f11510a = i0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        j0 j0Var;
        ga.l lVar;
        gc.z zVar;
        if (audioTrack.equals(this.f11510a.f11516c.f11551v) && (lVar = (j0Var = this.f11510a.f11516c).f11547r) != null && j0Var.V && (zVar = ((m0) lVar.f9547e).f11576n1) != null) {
            zVar.f9950a.E.d(2);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        j0 j0Var;
        ga.l lVar;
        gc.z zVar;
        if (audioTrack.equals(this.f11510a.f11516c.f11551v) && (lVar = (j0Var = this.f11510a.f11516c).f11547r) != null && j0Var.V && (zVar = ((m0) lVar.f9547e).f11576n1) != null) {
            zVar.f9950a.E.d(2);
        }
    }
}
