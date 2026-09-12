package com.mkuczera.haptic;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Vibrator;
import java.util.HashMap;
import org.webrtc.MediaStreamTrack;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f7008a;

    static {
        HashMap map = new HashMap();
        f7008a = map;
        g.j(4, map, "clockTick", 6, "contextClick");
        map.put("keyboardPress", 3);
        map.put("keyboardRelease", 7);
        map.put("keyboardTap", 3);
        map.put("longPress", 0);
        g.j(9, map, "textHandleMove", 1, "virtualKey");
        map.put("virtualKeyRelease", 8);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            g.j(16, map, "confirm", 17, "reject");
            g.j(12, map, "gestureStart", 13, "gestureEnd");
            g.j(26, map, "segmentTick", 27, "segmentFrequentTick");
        }
        if (i7 >= 34) {
            g.j(21, map, "toggleOn", 22, "toggleOff");
            g.j(25, map, "dragStart", 23, "gestureThresholdActivate");
            g.j(24, map, "gestureThresholdDeactivate", -1, "noHaptics");
        }
    }

    public static boolean a(Context context) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        return (vibrator != null && vibrator.hasVibrator()) && ((audioManager.getRingerMode() != 0) || (audioManager.getRingerMode() == 1));
    }
}
