package org.webrtc.audio;

import a3.e;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import kk.b;
import org.webrtc.Logging;
import s0.g;

/* JADX INFO: loaded from: classes4.dex */
public final class WebRtcAudioUtils {
    private static final String TAG = "WebRtcAudioUtilsExternal";

    @TargetApi(24)
    public static String audioEncodingToString(int i7) {
        if (i7 == 0) {
            return "INVALID";
        }
        switch (i7) {
            case 2:
                return "PCM_16BIT";
            case 3:
                return "PCM_8BIT";
            case 4:
                return "PCM_FLOAT";
            case 5:
            case 6:
                return "AC3";
            case 7:
                return "DTS";
            case 8:
                return "DTS_HD";
            case 9:
                return "MP3";
            default:
                return b.h(i7, "Invalid encoding: ");
        }
    }

    public static String audioSourceToString(int i7) {
        switch (i7) {
            case 0:
                return "DEFAULT";
            case 1:
                return "MIC";
            case 2:
                return "VOICE_UPLINK";
            case 3:
                return "VOICE_DOWNLINK";
            case 4:
                return "VOICE_CALL";
            case 5:
                return "CAMCORDER";
            case 6:
                return "VOICE_RECOGNITION";
            case 7:
                return "VOICE_COMMUNICATION";
            case 8:
            default:
                return "INVALID";
            case 9:
                return "UNPROCESSED";
            case 10:
                return "VOICE_PERFORMANCE";
        }
    }

    public static String channelMaskToString(int i7) {
        if (i7 != 12) {
            return i7 != 16 ? "INVALID" : "IN_MONO";
        }
        return "IN_STEREO";
    }

    public static String deviceTypeToString(int i7) {
        switch (i7) {
            case 0:
                return "TYPE_UNKNOWN";
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            case 23:
                return "TYPE_HEARING_AID";
            case 24:
                return "TYPE_BUILTIN_SPEAKER_SAFE";
            case 25:
                return "TYPE_REMOTE_SUBMIX";
            case 26:
                return "TYPE_BLE_HEADSET";
            case 27:
                return "TYPE_BLE_SPEAKER";
            case 28:
            default:
                return g.d(i7, "TYPE_UNKNOWN(", ")");
            case 29:
                return "TYPE_HDMI_EARC";
            case 30:
                return "TYPE_BLE_BROADCAST";
            case 31:
                return "TYPE_DOCK_ANALOG";
        }
    }

    public static String getThreadInfo() {
        Thread threadCurrentThread = Thread.currentThread();
        return "@[name=" + threadCurrentThread.getName() + ", id=" + threadCurrentThread.getId() + "]";
    }

    private static boolean hasMicrophone(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        Logging.d(str, "Audio Devices: ");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            StringBuilder sb2 = new StringBuilder("  ");
            sb2.append(deviceTypeToString(audioDeviceInfo.getType()));
            sb2.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb2.append("channels=");
                sb2.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb2.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb2.append("encodings=");
                sb2.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                sb2.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb2.append("sample rates=");
                sb2.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb2.append(", ");
            }
            sb2.append("id=");
            sb2.append(audioDeviceInfo.getId());
            Logging.d(str, sb2.toString());
        }
    }

    public static void logAudioState(String str, Context context, AudioManager audioManager) {
        logDeviceInfo(str);
        logAudioStateBasic(str, context, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, Context context, AudioManager audioManager) {
        String strModeToString = modeToString(audioManager.getMode());
        boolean zHasMicrophone = hasMicrophone(context);
        boolean zIsMicrophoneMute = audioManager.isMicrophoneMute();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        boolean zIsBluetoothScoOn = audioManager.isBluetoothScoOn();
        StringBuilder sb2 = new StringBuilder("Audio State: audio mode: ");
        sb2.append(strModeToString);
        sb2.append(", has mic: ");
        sb2.append(zHasMicrophone);
        sb2.append(", mic muted: ");
        e.B(sb2, zIsMicrophoneMute, ", music active: ", zIsMusicActive, ", speakerphone: ");
        sb2.append(zIsSpeakerphoneOn);
        sb2.append(", BT SCO: ");
        sb2.append(zIsBluetoothScoOn);
        Logging.d(str, sb2.toString());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.d(str, "Audio State: ");
        boolean zIsVolumeFixed = audioManager.isVolumeFixed();
        Logging.d(str, "  fixed volume=" + zIsVolumeFixed);
        if (zIsVolumeFixed) {
            return;
        }
        for (int i7 = 0; i7 < 6; i7++) {
            int i10 = iArr[i7];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  " + streamTypeToString(i10) + ": ");
            sb2.append("volume=");
            sb2.append(audioManager.getStreamVolume(i10));
            sb2.append(", max=");
            sb2.append(audioManager.getStreamMaxVolume(i10));
            sb2.append(", muted=");
            sb2.append(audioManager.isStreamMute(i10));
            Logging.d(str, sb2.toString());
        }
    }

    private static void logDeviceInfo(String str) {
        int i7 = Build.VERSION.SDK_INT;
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.BRAND;
        String str4 = Build.DEVICE;
        String str5 = Build.ID;
        String str6 = Build.HARDWARE;
        String str7 = Build.MANUFACTURER;
        String str8 = Build.MODEL;
        String str9 = Build.PRODUCT;
        StringBuilder sbO = com.discord.chat.presentation.list.a.o("Android SDK: ", ", Release: ", str2, i7, ", Brand: ");
        e.A(sbO, str3, ", Device: ", str4, ", Id: ");
        e.A(sbO, str5, ", Hardware: ", str6, ", Manufacturer: ");
        e.A(sbO, str7, ", Model: ", str8, ", Product: ");
        sbO.append(str9);
        Logging.d(str, sbO.toString());
    }

    public static String modeToString(int i7) {
        if (i7 == 0) {
            return "MODE_NORMAL";
        }
        if (i7 == 1) {
            return "MODE_RINGTONE";
        }
        if (i7 != 2) {
            return i7 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION";
        }
        return "MODE_IN_CALL";
    }

    public static boolean runningOnEmulator() {
        String str = Build.HARDWARE;
        return str.equals("goldfish") || str.equals("ranchu");
    }

    private static String streamTypeToString(int i7) {
        if (i7 == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (i7 == 1) {
            return "STREAM_SYSTEM";
        }
        if (i7 == 2) {
            return "STREAM_RING";
        }
        if (i7 == 3) {
            return "STREAM_MUSIC";
        }
        if (i7 != 4) {
            return i7 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION";
        }
        return "STREAM_ALARM";
    }
}
