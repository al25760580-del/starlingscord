package ic;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 {
    public static void a(u uVar, Object obj) {
        d0 d0Var;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        j0 j0Var = (j0) uVar;
        if (audioDeviceInfo == null) {
            d0Var = null;
        } else {
            j0Var.getClass();
            d0Var = new d0(audioDeviceInfo);
        }
        j0Var.Z = d0Var;
        AudioTrack audioTrack = j0Var.f11551v;
        if (audioTrack != null) {
            b0.a(audioTrack, d0Var);
        }
    }
}
