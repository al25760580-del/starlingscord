package gc;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f9574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f9575e;

    public c(d dVar, Handler handler) {
        this.f9575e = dVar;
        this.f9574d = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        this.f9574d.post(new a1.l(i7, 4, this));
    }
}
