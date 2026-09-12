package com.discord.p000native.engine;

import android.content.Context;
import co.discord.media_engine.CameraEnumeratorProvider;
import co.discord.media_engine.SharedEglBaseContext;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 X2\u00020\u0001:\u0012WXYZ[\\]^_`abcdefghB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086 J\u0006\u0010\u0010\u001a\u00020\u0011J\u0011\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086 J\u0011\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0016H\u0086 J\u0011\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0018H\u0086 J\u0011\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001aH\u0086 J\u0011\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001cH\u0086 J!\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020 H\u0086 J\t\u0010!\u001a\u00020\u0005H\u0086 J\u0011\u0010\"\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020#H\u0086 J\u0011\u0010$\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020%H\u0086 J)\u0010&\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0014H\u0082 J\t\u0010*\u001a\u00020\u0011H\u0082 J\u0019\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020-H\u0086 J\u0011\u0010.\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086 J\u0011\u0010/\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u000200H\u0086 J\u0011\u00101\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086 J\u0011\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u0014H\u0086 J\u0011\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\fH\u0086 J\u0011\u00106\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0005H\u0086 J\u0011\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u000209H\u0086 J\u0011\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u000209H\u0086 J\u0011\u0010<\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020=H\u0086 J\u0011\u0010>\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020?H\u0086 J\u0011\u0010@\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020AH\u0086 J\u0011\u0010B\u001a\u00020\u00112\u0006\u00105\u001a\u00020\fH\u0086 J\u0011\u0010C\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0005H\u0086 J\u0011\u0010D\u001a\u00020\u00112\u0006\u00108\u001a\u000209H\u0086 J\u0011\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u0014H\u0086 J\u0011\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\fH\u0086 J\u0011\u0010I\u001a\u00020\u00112\u0006\u00105\u001a\u00020\fH\u0086 J\u0011\u0010J\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0005H\u0086 J\u001b\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010MH\u0086 J\u0011\u0010N\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020OH\u0086 J\u0019\u0010P\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020QH\u0086 J\u0011\u0010R\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020SH\u0086 J\u0019\u0010T\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\f2\u0006\u0010V\u001a\u00020\fH\u0086 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006i"}, d2 = {"Lcom/discord/native/engine/NativeEngine;", "", "context", "Landroid/content/Context;", "logLevel", "", "(Landroid/content/Context;I)V", "nativeInstance", "", "createVoiceConnection", "Lcom/discord/native/engine/NativeConnection;", "userId", "", "connectionOptionsJSON", "callback", "Lcom/discord/native/engine/NativeEngine$ConnectToServerCallback;", "dispose", "", "enableBuiltInAEC", "enable", "", "getAudioSubsystem", "Lcom/discord/native/engine/NativeEngine$GetAudioSubsystemCallback;", "getCodecCapabilities", "Lcom/discord/native/engine/NativeEngine$GetCodecCapabilitiesCallback;", "getCodecSurvey", "Lcom/discord/native/engine/NativeEngine$GetCodecSurveyCallback;", "getInputDevices", "Lcom/discord/native/engine/NativeEngine$GetAudioInputDevicesCallback;", "getMLSSigningKeyB64", "sessionId", "signatureVersion", "Lcom/discord/native/engine/NativeEngine$MLSSigningKeyCallback;", "getMaxSupportedProtocolVersion", "getOutputDevices", "Lcom/discord/native/engine/NativeEngine$GetAudioOutputDevicesCallback;", "getVideoInputDevices", "Lcom/discord/native/engine/NativeEngine$GetVideoInputDevicesCallback;", "nativeCreateInstance", "eglContext", "Lorg/webrtc/EglBase$Context;", "offloadAdmControls", "nativeDestroyInstance", "rankRtcRegions", "regionsWithIpsJSON", "Lcom/discord/native/engine/NativeEngine$GetRankedRtcRegionsCallback;", "setAudioInputEnabled", "setAudioInputInitializationCallback", "Lcom/discord/native/engine/NativeEngine$AudioInputInitializationCallback;", "setEmitVADLevel2", "setHasFullbandPerformance", "hasFullbandPerformance", "setInputDevice", "deviceIndex", "setInputDeviceIndex", "setInputVolume", "volume", "", "setNoInputThreshold", "threshold", "setOnDeviceChangeCallback", "Lcom/discord/native/engine/NativeEngine$DeviceChangeCallback;", "setOnNoInputCallback", "Lcom/discord/native/engine/NativeEngine$OnNoInputCallback;", "setOnVoiceCallback", "Lcom/discord/native/engine/NativeEngine$OnVoiceCallback;", "setOutputDevice", "setOutputDeviceIndex", "setOutputVolume", "setSidechainCompression", ViewProps.ENABLED, "setTransportOptions", "optionsJSON", "setVideoInputDevice", "setVideoInputDeviceIndex", "setVideoOutputSink", "streamIdentifier", "Lcom/discord/native/engine/NativeEngine$VideoFrameCallback;", "setVoiceProcessingErrorCallback", "Lcom/discord/native/engine/NativeEngine$VoiceProcessingErrorCallback;", "startLocalAudioRecording", "Lcom/discord/native/engine/NativeEngine$StartLocalAudioRecordingCallback;", "stopLocalAudioRecording", "Lcom/discord/native/engine/NativeEngine$StopLocalAudioRecordingCallback;", "updateFieldTrial", "key", "value", "AudioInputInitializationCallback", "Companion", "ConnectToServerCallback", "DeviceChangeCallback", "GetAudioInputDevicesCallback", "GetAudioOutputDevicesCallback", "GetAudioSubsystemCallback", "GetCodecCapabilitiesCallback", "GetCodecSurveyCallback", "GetRankedRtcRegionsCallback", "GetVideoInputDevicesCallback", "MLSSigningKeyCallback", "OnNoInputCallback", "OnVoiceCallback", "StartLocalAudioRecordingCallback", "StopLocalAudioRecordingCallback", "VideoFrameCallback", "VoiceProcessingErrorCallback", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NativeEngine {
    public static final int LOGLEVEL_DEBUG = 1;
    public static final int LOGLEVEL_DEFAULT = 2;
    private final int logLevel;
    private final long nativeInstance;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeEngine$AudioInputInitializationCallback;", "", "onAudioInputInitialized", "", "info", "Lcom/discord/native/engine/AudioInputInitializationInfo;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface AudioInputInitializationCallback {
        void onAudioInputInitialized(@NotNull AudioInputInitializationInfo info);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/discord/native/engine/NativeEngine$ConnectToServerCallback;", "", "onConnectToServer", "", "info", "Lcom/discord/native/engine/ConnectionInfo;", "error", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ConnectToServerCallback {
        void onConnectToServer(@NotNull ConnectionInfo info, @NotNull String error);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/discord/native/engine/NativeEngine$DeviceChangeCallback;", "", "onChange", "", "audioInputDevices", "", "Lcom/discord/native/engine/AudioInputDeviceDescription;", "audioOutputDevices", "Lcom/discord/native/engine/AudioOutputDeviceDescription;", "videoInputDevices", "Lcom/discord/native/engine/VideoInputDeviceDescription;", "([Lcom/discord/native/engine/AudioInputDeviceDescription;[Lcom/discord/native/engine/AudioOutputDeviceDescription;[Lcom/discord/native/engine/VideoInputDeviceDescription;)V", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface DeviceChangeCallback {
        void onChange(@NotNull AudioInputDeviceDescription[] audioInputDevices, @NotNull AudioOutputDeviceDescription[] audioOutputDevices, @NotNull VideoInputDeviceDescription[] videoInputDevices);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/native/engine/NativeEngine$GetAudioInputDevicesCallback;", "", "onDevices", "", "devices", "", "Lcom/discord/native/engine/AudioInputDeviceDescription;", "([Lcom/discord/native/engine/AudioInputDeviceDescription;)V", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface GetAudioInputDevicesCallback {
        void onDevices(@NotNull AudioInputDeviceDescription[] devices);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/native/engine/NativeEngine$GetAudioOutputDevicesCallback;", "", "onDevices", "", "devices", "", "Lcom/discord/native/engine/AudioOutputDeviceDescription;", "([Lcom/discord/native/engine/AudioOutputDeviceDescription;)V", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface GetAudioOutputDevicesCallback {
        void onDevices(@NotNull AudioOutputDeviceDescription[] devices);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/discord/native/engine/NativeEngine$GetAudioSubsystemCallback;", "", "onAudioSubsystem", "", "subsystem", "", "audioLayer", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface GetAudioSubsystemCallback {
        void onAudioSubsystem(@NotNull String subsystem, @NotNull String audioLayer);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeEngine$GetCodecCapabilitiesCallback;", "", "onCodecCapabilities", "", "codecs", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface GetCodecCapabilitiesCallback {
        void onCodecCapabilities(@NotNull String codecs);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeEngine$GetCodecSurveyCallback;", "", "onCodecSurvey", "", "jsonStr", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface GetCodecSurveyCallback {
        void onCodecSurvey(@NotNull String jsonStr);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/native/engine/NativeEngine$GetRankedRtcRegionsCallback;", "", "onRankedRtcRegions", "", "regions", "", "", "([Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface GetRankedRtcRegionsCallback {
        void onRankedRtcRegions(@NotNull String[] regions);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/native/engine/NativeEngine$GetVideoInputDevicesCallback;", "", "onDevices", "", "devices", "", "Lcom/discord/native/engine/VideoInputDeviceDescription;", "([Lcom/discord/native/engine/VideoInputDeviceDescription;)V", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface GetVideoInputDevicesCallback {
        void onDevices(@NotNull VideoInputDeviceDescription[] devices);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/discord/native/engine/NativeEngine$MLSSigningKeyCallback;", "", "onMLSSigningKey", "", "key", "", "signature", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MLSSigningKeyCallback {
        void onMLSSigningKey(@NotNull String key, @NotNull String signature);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeEngine$OnNoInputCallback;", "", "onNoInput", "", "input", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnNoInputCallback {
        void onNoInput(boolean input);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/discord/native/engine/NativeEngine$OnVoiceCallback;", "", "onVoice", "", "level", "", "speaking", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnVoiceCallback {
        void onVoice(float level, int speaking);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeEngine$StartLocalAudioRecordingCallback;", "", "onStartLocalAudioRecording", "", "started", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface StartLocalAudioRecordingCallback {
        void onStartLocalAudioRecording(boolean started);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/discord/native/engine/NativeEngine$StopLocalAudioRecordingCallback;", "", "onStopLocalAudioRecording", "", "fileName", "", "durationMs", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface StopLocalAudioRecordingCallback {
        void onStopLocalAudioRecording(@NotNull String fileName, int durationMs);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/discord/native/engine/NativeEngine$VideoFrameCallback;", "", "onFrame", "", "frame", "Lorg/webrtc/VideoFrame;", "mirror", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface VideoFrameCallback {
        boolean onFrame(@NotNull VideoFrame frame, boolean mirror);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeEngine$VoiceProcessingErrorCallback;", "", "onVoiceProcessingError", "", "error", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface VoiceProcessingErrorCallback {
        void onVoiceProcessingError(int error);
    }

    static {
        System.loadLibrary("discord");
    }

    public NativeEngine(@NotNull Context context, int i7) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.logLevel = i7;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        CameraEnumeratorProvider.maybeInit(applicationContext);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        EglBase.Context eglContext = SharedEglBaseContext.getEglContext();
        Intrinsics.checkNotNullExpressionValue(eglContext, "getEglContext(...)");
        this.nativeInstance = nativeCreateInstance(applicationContext2, eglContext, i7, context.getSharedPreferences("MediaEngine", 0).getBoolean("offloadAdmControls", true));
    }

    private final native long nativeCreateInstance(Context context, EglBase.Context eglContext, int logLevel, boolean offloadAdmControls);

    private final native void nativeDestroyInstance();

    @NotNull
    public final native NativeConnection createVoiceConnection(@NotNull String userId, @NotNull String connectionOptionsJSON, @NotNull ConnectToServerCallback callback);

    public final void dispose() {
        nativeDestroyInstance();
    }

    public final native void enableBuiltInAEC(boolean enable);

    public final native void getAudioSubsystem(@NotNull GetAudioSubsystemCallback callback);

    public final native void getCodecCapabilities(@NotNull GetCodecCapabilitiesCallback callback);

    public final native void getCodecSurvey(@NotNull GetCodecSurveyCallback callback);

    public final native void getInputDevices(@NotNull GetAudioInputDevicesCallback callback);

    public final native void getMLSSigningKeyB64(@NotNull String sessionId, int signatureVersion, @NotNull MLSSigningKeyCallback callback);

    public final native int getMaxSupportedProtocolVersion();

    public final native void getOutputDevices(@NotNull GetAudioOutputDevicesCallback callback);

    public final native void getVideoInputDevices(@NotNull GetVideoInputDevicesCallback callback);

    public final native void rankRtcRegions(@NotNull String regionsWithIpsJSON, @NotNull GetRankedRtcRegionsCallback callback);

    public final native void setAudioInputEnabled(boolean enable);

    public final native void setAudioInputInitializationCallback(@NotNull AudioInputInitializationCallback callback);

    public final native void setEmitVADLevel2(boolean enable);

    public final native void setHasFullbandPerformance(boolean hasFullbandPerformance);

    public final native void setInputDevice(@NotNull String deviceIndex);

    public final native void setInputDeviceIndex(int deviceIndex);

    public final native void setInputVolume(float volume);

    public final native void setNoInputThreshold(float threshold);

    public final native void setOnDeviceChangeCallback(@NotNull DeviceChangeCallback callback);

    public final native void setOnNoInputCallback(@NotNull OnNoInputCallback callback);

    public final native void setOnVoiceCallback(@NotNull OnVoiceCallback callback);

    public final native void setOutputDevice(@NotNull String deviceIndex);

    public final native void setOutputDeviceIndex(int deviceIndex);

    public final native void setOutputVolume(float volume);

    public final native void setSidechainCompression(boolean enabled);

    public final native void setTransportOptions(@NotNull String optionsJSON);

    public final native void setVideoInputDevice(@NotNull String deviceIndex);

    public final native void setVideoInputDeviceIndex(int deviceIndex);

    public final native void setVideoOutputSink(@NotNull String streamIdentifier, VideoFrameCallback callback);

    public final native void setVoiceProcessingErrorCallback(@NotNull VoiceProcessingErrorCallback callback);

    public final native void startLocalAudioRecording(@NotNull String optionsJSON, @NotNull StartLocalAudioRecordingCallback callback);

    public final native void stopLocalAudioRecording(@NotNull StopLocalAudioRecordingCallback callback);

    public final native void updateFieldTrial(@NotNull String key, @NotNull String value);
}
