package com.discord.audio;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002\"&\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"audioDeviceTypeToSimpleMapping", "", "", "Lcom/discord/audio/SimpleDeviceType;", "getAudioDeviceTypeToSimpleMapping", "()Ljava/util/Map;", "setAudioDeviceTypeToSimpleMapping", "(Ljava/util/Map;)V", "audioDeviceInfoToString", "", "type", "audio_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AndroidAudioDeviceKt {

    @NotNull
    private static Map<Integer, SimpleDeviceType> audioDeviceTypeToSimpleMapping;

    static {
        SimpleDeviceType simpleDeviceType = SimpleDeviceType.EARPIECE;
        Pair pair = new Pair(1, simpleDeviceType);
        Pair pair2 = new Pair(2, SimpleDeviceType.SPEAKERPHONE);
        SimpleDeviceType simpleDeviceType2 = SimpleDeviceType.WIRED_HEADSET;
        Pair pair3 = new Pair(3, simpleDeviceType2);
        Pair pair4 = new Pair(4, simpleDeviceType2);
        SimpleDeviceType simpleDeviceType3 = SimpleDeviceType.BLUETOOTH_HEADSET;
        Pair pair5 = new Pair(7, simpleDeviceType3);
        SimpleDeviceType simpleDeviceType4 = SimpleDeviceType.INVALID;
        audioDeviceTypeToSimpleMapping = w0.h(pair, pair2, pair3, pair4, pair5, new Pair(8, simpleDeviceType4), new Pair(9, simpleDeviceType), new Pair(13, simpleDeviceType), new Pair(12, simpleDeviceType2), new Pair(11, simpleDeviceType2), new Pair(18, simpleDeviceType), new Pair(5, simpleDeviceType), new Pair(10, simpleDeviceType), new Pair(18, simpleDeviceType), new Pair(5, simpleDeviceType), new Pair(10, simpleDeviceType), new Pair(6, simpleDeviceType), new Pair(14, simpleDeviceType4), new Pair(19, simpleDeviceType), new Pair(20, simpleDeviceType), new Pair(21, simpleDeviceType), new Pair(15, simpleDeviceType), new Pair(16, simpleDeviceType4), new Pair(17, simpleDeviceType4), new Pair(22, simpleDeviceType2), new Pair(23, simpleDeviceType3), new Pair(24, simpleDeviceType4), new Pair(29, simpleDeviceType), new Pair(25, simpleDeviceType4), new Pair(26, simpleDeviceType3), new Pair(27, simpleDeviceType3), new Pair(30, simpleDeviceType3));
    }

    @NotNull
    public static final String audioDeviceInfoToString(int i7) {
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
                return "";
            case 29:
                return "TYPE_HDMI_EARC";
            case 30:
                return "TYPE_BLE_BROADCAST";
            case 31:
                return "TYPE_DOCK_ANALOG";
        }
    }

    @NotNull
    public static final Map<Integer, SimpleDeviceType> getAudioDeviceTypeToSimpleMapping() {
        return audioDeviceTypeToSimpleMapping;
    }

    public static final void setAudioDeviceTypeToSimpleMapping(@NotNull Map<Integer, SimpleDeviceType> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        audioDeviceTypeToSimpleMapping = map;
    }
}
