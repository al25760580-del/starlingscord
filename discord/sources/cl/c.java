package cl;

import android.os.Build;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.mkuczera.haptic.NativeHapticFeedbackSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f3731a;

    static {
        HashMap map = new HashMap();
        f3731a = map;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            map.put("impactLight", new d(7, 0.3f, new f(new long[]{0, 20})));
            map.put("impactMedium", new d(1, 0.6f, new f(new long[]{0, 40})));
            map.put("impactHeavy", new d(2, 1.0f, new f(new long[]{0, 60})));
            map.put("rigid", new d(1, 0.9f, new f(new long[]{0, 30})));
            map.put("soft", new d(7, 0.3f, new f(new long[]{0, 10})));
            map.put("selection", new d(7, 0.4f, new f(new long[]{0, 10})));
            map.put("notificationSuccess", new f(new long[]{0, 40, 60, 20}));
            map.put("notificationWarning", new f(new long[]{0, 20, 60, 40}));
            map.put("notificationError", new f(new long[]{0, 20, 40, 30, 40, 40}));
        } else {
            map.put("impactLight", new f(new long[]{0, 20}));
            map.put("impactMedium", new f(new long[]{0, 40}));
            map.put("impactHeavy", new f(new long[]{0, 60}));
            map.put("notificationSuccess", new f(new long[]{0, 40, 60, 20}));
            map.put("notificationWarning", new f(new long[]{0, 20, 60, 40}));
            map.put("notificationError", new f(new long[]{0, 20, 40, 30, 40, 40}));
            map.put("rigid", new f(new long[]{0, 30}));
            map.put("soft", new f(new long[]{0, 10}));
            map.put("selection", new f(new long[]{0, 10}));
        }
        map.put("clockTick", new f(new long[]{0, 15}));
        map.put("contextClick", new f(new long[]{0, 20}));
        map.put("keyboardPress", new f(new long[]{0, 20}));
        map.put("keyboardRelease", new f(new long[]{0, 10}));
        map.put("keyboardTap", new f(new long[]{0, 20}));
        map.put("longPress", new f(new long[]{0, 40}));
        map.put("textHandleMove", new f(new long[]{0, 10}));
        map.put("virtualKey", new f(new long[]{0, 20}));
        map.put("virtualKeyRelease", new f(new long[]{0, 10}));
        map.put("confirm", new f(new long[]{0, 40, 60, 20}));
        map.put("reject", new f(new long[]{0, 60, 40, 30}));
        map.put("gestureStart", new f(new long[]{0, 15}));
        map.put("gestureEnd", new f(new long[]{0, 20}));
        map.put("segmentTick", new f(new long[]{0, 10}));
        map.put("segmentFrequentTick", new f(new long[]{0, 8}));
        map.put("toggleOn", new f(new long[]{0, 15, 30, 25}));
        map.put("toggleOff", new f(new long[]{0, 25, 30, 15}));
        map.put("dragStart", new f(new long[]{0, 15}));
        map.put("gestureThresholdActivate", new f(new long[]{0, 20}));
        map.put("gestureThresholdDeactivate", new f(new long[]{0, 10}));
        if (i7 >= 29) {
            map.put("effectClick", new e(0));
            map.put("effectDoubleClick", new e(1));
            map.put("effectHeavyClick", new e(5));
            map.put("effectTick", new e(2));
            return;
        }
        map.put("effectClick", new f(new long[]{0, 20}));
        map.put("effectDoubleClick", new f(new long[]{0, 20, 40, 20}));
        map.put("effectHeavyClick", new f(new long[]{0, 50}));
        map.put("effectTick", new f(new long[]{0, 15}));
    }

    public static void a(Vibrator vibrator, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return;
        }
        int size = readableArray.size();
        ArrayList<ReadableMap> arrayList = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            ReadableMap map = readableArray.getMap(i7);
            if (map != null) {
                arrayList.add(map);
            }
        }
        Collections.sort(arrayList, new b(0));
        int size2 = arrayList.size() * 2;
        long[] jArr = new long[size2];
        int[] iArr = new int[size2];
        int i10 = 0;
        long j = 0;
        for (ReadableMap readableMap : arrayList) {
            if (readableMap != null) {
                long j5 = readableMap.hasKey("time") ? (long) readableMap.getDouble("time") : 0L;
                long j7 = readableMap.hasKey("duration") ? (long) readableMap.getDouble("duration") : 50L;
                int iRound = (int) Math.round((readableMap.hasKey("intensity") ? readableMap.getDouble("intensity") : 0.5d) * 255.0d);
                jArr[i10] = Math.max(0L, j5 - j);
                iArr[i10] = 0;
                int i11 = i10 + 1;
                jArr[i11] = j7;
                iArr[i11] = Math.max(1, Math.min(255, iRound));
                i10 += 2;
                j = j5 + j7;
            }
        }
        long[] jArr2 = new long[i10];
        int[] iArr2 = new int[i10];
        System.arraycopy(jArr, 0, jArr2, 0, i10);
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        try {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 33) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr2, iArr2, -1), new VibrationAttributes.Builder().setUsage(18).build());
            } else if (i12 >= 26) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr2, iArr2, -1));
            } else {
                vibrator.vibrate(jArr2, -1);
            }
        } catch (Exception e10) {
            Log.w(NativeHapticFeedbackSpec.NAME, "vibratePattern failed", e10);
        }
    }
}
