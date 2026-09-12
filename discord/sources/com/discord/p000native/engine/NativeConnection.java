package com.discord.p000native.engine;

import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.webrtc.VideoCapturer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0011klmnopqrstuvwxyz{B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086 J\u0011\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0086 J\u0006\u0010\u000e\u001a\u00020\u0006J\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0086 J\t\u0010\u0011\u001a\u00020\u0006H\u0086 J\u0011\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0086 J\u0019\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0017H\u0086 J\u0011\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0019H\u0086 J!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u001cH\u0086 J\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0017H\u0086 J\u0011\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\rH\u0086 J\t\u0010 \u001a\u00020\u0006H\u0082 J!\u0010!\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020#H\u0086 J!\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010&\u001a\u00020\rH\u0086 J!\u0010'\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020)H\u0086 J\u0019\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020,H\u0086 J!\u0010-\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010.\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020/H\u0086 J!\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\rH\u0086 J\u0019\u00105\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u00106\u001a\u000203H\u0086 J!\u00107\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0086 J\u0019\u0010;\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010<\u001a\u000209H\u0086 J\u0011\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\bH\u0086 J\u0011\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u000209H\u0086 J\u0011\u0010A\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020BH\u0086 J\u0011\u0010C\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020DH\u0086 J\u0011\u0010E\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020FH\u0086 J\u0011\u0010G\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020HH\u0086 J\u0011\u0010I\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020JH\u0086 J\u0011\u0010K\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020LH\u0086 J\u0011\u0010M\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020NH\u0086 J\u0011\u0010O\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020PH\u0086 J!\u0010Q\u001a\u00020\u00062\u0006\u0010R\u001a\u0002032\u0006\u0010S\u001a\u0002032\u0006\u0010T\u001a\u000203H\u0086 J\u0011\u0010U\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\bH\u0086 J\u0011\u0010W\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020XH\u0086 J\u0011\u0010Y\u001a\u00020\u00062\u0006\u0010Z\u001a\u000203H\u0086 J\u0011\u0010[\u001a\u00020\u00062\u0006\u0010\\\u001a\u000203H\u0086 J\u0011\u0010]\u001a\u00020\u00062\u0006\u0010^\u001a\u00020\rH\u0086 J\u001b\u0010_\u001a\u00020\u00062\b\u0010`\u001a\u0004\u0018\u00010\r2\u0006\u0010a\u001a\u00020\bH\u0086 J\u0011\u0010b\u001a\u00020\u00062\u0006\u0010c\u001a\u000203H\u0086 J\u0019\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u0004H\u0086 J\t\u0010h\u001a\u00020\u0006H\u0086 J\u0011\u0010i\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\rH\u0086 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006|"}, d2 = {"Lcom/discord/native/engine/NativeConnection;", "", "()V", "nativeInstance", "", "configureConnectionRetries", "", "baseDelayMs", "", "maxDelayMs", "maxAttempts", "destroyUser", "userId", "", "dispose", "executeSecureFramesTransition", "transitionId", "fastUdpReconnect", "getEncryptionModes", "callback", "Lcom/discord/native/engine/NativeConnection$GetEncryptionModesCallback;", "getFilteredStats", ViewProps.FILTER, "Lcom/discord/native/engine/NativeConnection$GetStatsCallback;", "getMLSKeyPackageB64", "Lcom/discord/native/engine/NativeConnection$MLSKeyPackageCallback;", "getMLSPairwiseFingerprintB64", "version", "Lcom/discord/native/engine/NativeConnection$MLSPairwiseFingerprintCallback;", "getStats", "mergeUsers", "usersJSON", "nativeDestroyInstance", "prepareMLSCommitTransitionB64", "commit", "Lcom/discord/native/engine/NativeConnection$MLSCommitTransitionCallback;", "prepareSecureFramesEpoch", "epoch", "groupId", "prepareSecureFramesTransition", "protocolVersion", "Lcom/discord/native/engine/NativeConnection$SecureFramesTransitionReadyCallback;", "processMLSProposalsB64", "proposals", "Lcom/discord/native/engine/NativeConnection$MLSProcessProposalsCallback;", "processMLSWelcomeB64", "welcome", "Lcom/discord/native/engine/NativeConnection$MLSWelcomeCallback;", "setDesktopSource", "stringId", "useVideoHook", "", "type", "setLocalMute", "mute", "setLocalPan", ViewProps.LEFT, "", ViewProps.RIGHT, "setLocalVolume", "volume", "setMinimumOutputDelay", "delay", "setNoInputThreshold", "threshold", "setOnConnectionFailedCallback", "Lcom/discord/native/engine/NativeConnection$ConnectionFailedCallback;", "setOnFirstFrameCallback", "Lcom/discord/native/engine/NativeConnection$OnFirstFrameCallback;", "setOnMLSFailureCallback", "Lcom/discord/native/engine/NativeConnection$MLSFailureCallback;", "setOnPingCallback", "Lcom/discord/native/engine/NativeConnection$OnPingCallback;", "setOnPingTimeoutCallback", "Lcom/discord/native/engine/NativeConnection$OnPingTimeoutCallback;", "setOnSpeakingCallback", "Lcom/discord/native/engine/NativeConnection$OnSpeakingCallback;", "setOnSpeakingWhileMutedCallback", "Lcom/discord/native/engine/NativeConnection$OnSpeakingWhileMutedCallback;", "setOnVideoCallback", "Lcom/discord/native/engine/NativeConnection$OnVideoCallback;", "setPTTActive", AppStateModule.APP_STATE_ACTIVE, "priority", "muteOverride", "setPingInterval", "pingInterval", "setSecureFramesStateUpdateCallback", "Lcom/discord/native/engine/NativeConnection$SecureFramesStateUpdateCallback;", "setSelfDeafen", "deafened", "setSelfMute", "muted", "setTransportOptions", "optionsJSON", "setUdpEndpoint", "address", "port", "setVideoBroadcast", "broadcasting", "startBroadcast", "capturer", "Lorg/webrtc/VideoCapturer;", "soundshareNativeInstance", "stopBroadcast", "updateMLSExternalSenderB64", "externalSenderB64", "ConnectionFailedCallback", "GetEncryptionModesCallback", "GetStatsCallback", "MLSCommitTransitionCallback", "MLSFailureCallback", "MLSKeyPackageCallback", "MLSPairwiseFingerprintCallback", "MLSProcessProposalsCallback", "MLSWelcomeCallback", "OnFirstFrameCallback", "OnPingCallback", "OnPingTimeoutCallback", "OnSpeakingCallback", "OnSpeakingWhileMutedCallback", "OnVideoCallback", "SecureFramesStateUpdateCallback", "SecureFramesTransitionReadyCallback", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NativeConnection {
    private final long nativeInstance;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeConnection$ConnectionFailedCallback;", "", "onConnectionFailed", "", "reason", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ConnectionFailedCallback {
        void onConnectionFailed(@NotNull String reason);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/native/engine/NativeConnection$GetEncryptionModesCallback;", "", "onEncryptionModes", "", "modes", "", "", "([Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface GetEncryptionModesCallback {
        void onEncryptionModes(@NotNull String[] modes);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeConnection$GetStatsCallback;", "", "onStats", "", "stats", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface GetStatsCallback {
        void onStats(@NotNull String stats);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/discord/native/engine/NativeConnection$MLSCommitTransitionCallback;", "", "onMLSProcessedCommit", "", "processedCommit", "", "protocolVersion", "", "rosterChange", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MLSCommitTransitionCallback {
        void onMLSProcessedCommit(boolean processedCommit, int protocolVersion, @NotNull String rosterChange);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/discord/native/engine/NativeConnection$MLSFailureCallback;", "", "onMLSFailureCallback", "", "source", "", "reason", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MLSFailureCallback {
        void onMLSFailureCallback(@NotNull String source, @NotNull String reason);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeConnection$MLSKeyPackageCallback;", "", "onMLSKeyPackage", "", "keyPackageB64", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MLSKeyPackageCallback {
        void onMLSKeyPackage(@NotNull String keyPackageB64);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeConnection$MLSPairwiseFingerprintCallback;", "", "onMLSPairwiseFingerprint", "", "fingerprintB64", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MLSPairwiseFingerprintCallback {
        void onMLSPairwiseFingerprint(@NotNull String fingerprintB64);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeConnection$MLSProcessProposalsCallback;", "", "onMLSCommitWelcome", "", "commitWelcome", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MLSProcessProposalsCallback {
        void onMLSCommitWelcome(@NotNull String commitWelcome);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/discord/native/engine/NativeConnection$MLSWelcomeCallback;", "", "onMLSProcessedWelcome", "", "joinedGroup", "", "protocolVersion", "", "rosterChange", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MLSWelcomeCallback {
        void onMLSProcessedWelcome(boolean joinedGroup, int protocolVersion, @NotNull String rosterChange);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/discord/native/engine/NativeConnection$OnFirstFrameCallback;", "", "onFirstFrame", "", "userId", "", "videoSsrc", "", "streamId", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnFirstFrameCallback {
        void onFirstFrame(@NotNull String userId, long videoSsrc, @NotNull String streamId);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/discord/native/engine/NativeConnection$OnPingCallback;", "", "onPing", "", "ping", "", "server", "", "port", "seq", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnPingCallback {
        void onPing(int ping, @NotNull String server, int port, int seq);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/discord/native/engine/NativeConnection$OnPingTimeoutCallback;", "", "onPingTimeout", "", "server", "", "port", "", "seq", "timeout", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnPingTimeoutCallback {
        void onPingTimeout(@NotNull String server, int port, int seq, int timeout);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/discord/native/engine/NativeConnection$OnSpeakingCallback;", "", "onSpeaking", "", "userId", "", "speakingFlags", "", "voiceDb", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnSpeakingCallback {
        void onSpeaking(@NotNull String userId, int speakingFlags, float voiceDb);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/discord/native/engine/NativeConnection$OnSpeakingWhileMutedCallback;", "", "onSpeakingWhileMuted", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnSpeakingWhileMutedCallback {
        void onSpeakingWhileMuted();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/discord/native/engine/NativeConnection$OnVideoCallback;", "", "onVideo", "", "userId", "", "ssrc", "", "streamId", "videoStreamParametersJson", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnVideoCallback {
        void onVideo(@NotNull String userId, long ssrc, @NotNull String streamId, @NotNull String videoStreamParametersJson);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeConnection$SecureFramesStateUpdateCallback;", "", "onSecureFramesStateUpdateCallback", "", "stateUpdateJSON", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SecureFramesStateUpdateCallback {
        void onSecureFramesStateUpdateCallback(@NotNull String stateUpdateJSON);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/discord/native/engine/NativeConnection$SecureFramesTransitionReadyCallback;", "", "onTransitionReady", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SecureFramesTransitionReadyCallback {
        void onTransitionReady();
    }

    private final native void nativeDestroyInstance();

    public final native void configureConnectionRetries(int baseDelayMs, int maxDelayMs, int maxAttempts);

    public final native void destroyUser(@NotNull String userId);

    public final void dispose() {
        nativeDestroyInstance();
    }

    public final native void executeSecureFramesTransition(int transitionId);

    public final native void fastUdpReconnect();

    public final native void getEncryptionModes(@NotNull GetEncryptionModesCallback callback);

    public final native void getFilteredStats(int filter, @NotNull GetStatsCallback callback);

    public final native void getMLSKeyPackageB64(@NotNull MLSKeyPackageCallback callback);

    public final native void getMLSPairwiseFingerprintB64(int version, @NotNull String userId, @NotNull MLSPairwiseFingerprintCallback callback);

    public final native void getStats(@NotNull GetStatsCallback callback);

    public final native void mergeUsers(@NotNull String usersJSON);

    public final native void prepareMLSCommitTransitionB64(int transitionId, @NotNull String commit, @NotNull MLSCommitTransitionCallback callback);

    public final native void prepareSecureFramesEpoch(@NotNull String epoch, int transitionId, @NotNull String groupId);

    public final native void prepareSecureFramesTransition(int transitionId, int protocolVersion, @NotNull SecureFramesTransitionReadyCallback callback);

    public final native void processMLSProposalsB64(@NotNull String proposals, @NotNull MLSProcessProposalsCallback callback);

    public final native void processMLSWelcomeB64(int transitionId, @NotNull String welcome, @NotNull MLSWelcomeCallback callback);

    public final native void setDesktopSource(@NotNull String stringId, boolean useVideoHook, @NotNull String type);

    public final native void setLocalMute(@NotNull String userId, boolean mute);

    public final native void setLocalPan(@NotNull String userId, float left, float right);

    public final native void setLocalVolume(@NotNull String userId, float volume);

    public final native void setMinimumOutputDelay(int delay);

    public final native void setNoInputThreshold(float threshold);

    public final native void setOnConnectionFailedCallback(@NotNull ConnectionFailedCallback callback);

    public final native void setOnFirstFrameCallback(@NotNull OnFirstFrameCallback callback);

    public final native void setOnMLSFailureCallback(@NotNull MLSFailureCallback callback);

    public final native void setOnPingCallback(@NotNull OnPingCallback callback);

    public final native void setOnPingTimeoutCallback(@NotNull OnPingTimeoutCallback callback);

    public final native void setOnSpeakingCallback(@NotNull OnSpeakingCallback callback);

    public final native void setOnSpeakingWhileMutedCallback(@NotNull OnSpeakingWhileMutedCallback callback);

    public final native void setOnVideoCallback(@NotNull OnVideoCallback callback);

    public final native void setPTTActive(boolean active, boolean priority, boolean muteOverride);

    public final native void setPingInterval(int pingInterval);

    public final native void setSecureFramesStateUpdateCallback(@NotNull SecureFramesStateUpdateCallback callback);

    public final native void setSelfDeafen(boolean deafened);

    public final native void setSelfMute(boolean muted);

    public final native void setTransportOptions(@NotNull String optionsJSON);

    public final native void setUdpEndpoint(String address, int port);

    public final native void setVideoBroadcast(boolean broadcasting);

    public final native void startBroadcast(@NotNull VideoCapturer capturer, long soundshareNativeInstance);

    public final native void stopBroadcast();

    public final native void updateMLSExternalSenderB64(@NotNull String externalSenderB64);
}
