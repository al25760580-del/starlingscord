package ic;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    private static final ei.h0 a() {
        ei.g0 g0Var = new ei.g0();
        Integer[] numArr = {8, 7};
        ei.p.b(2, numArr);
        g0Var.e(g0Var.f8391b + 2);
        System.arraycopy(numArr, 0, g0Var.f8390a, g0Var.f8391b, 2);
        g0Var.f8391b += 2;
        int i7 = je.e0.f13788a;
        if (i7 >= 31) {
            Integer[] numArr2 = {26, 27};
            ei.p.b(2, numArr2);
            g0Var.e(g0Var.f8391b + 2);
            System.arraycopy(numArr2, 0, g0Var.f8390a, g0Var.f8391b, 2);
            g0Var.f8391b += 2;
        }
        if (i7 >= 33) {
            g0Var.a(30);
        }
        return g0Var.f();
    }

    public static final boolean b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        ei.h0 h0VarA = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (h0VarA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
