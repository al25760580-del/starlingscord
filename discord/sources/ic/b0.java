package ic;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 {
    public static void a(AudioTrack audioTrack, d0 d0Var) {
        audioTrack.setPreferredDevice(d0Var == null ? null : d0Var.f11489a);
    }
}
