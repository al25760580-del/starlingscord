package com.discord.media.engine;

import com.discord.p000native.engine.AudioInputDeviceDescription;
import com.discord.p000native.engine.AudioOutputDeviceDescription;
import com.discord.p000native.engine.NativeConnection;
import com.discord.p000native.engine.NativeEngine;
import com.discord.p000native.engine.VideoInputDeviceDescription;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements NativeConnection.GetEncryptionModesCallback, NativeEngine.GetRankedRtcRegionsCallback, NativeEngine.GetAudioOutputDevicesCallback, NativeEngine.GetCodecCapabilitiesCallback, NativeConnection.MLSProcessProposalsCallback, NativeConnection.GetStatsCallback, NativeEngine.StartLocalAudioRecordingCallback, NativeEngine.GetAudioInputDevicesCallback, NativeConnection.MLSKeyPackageCallback, NativeEngine.GetVideoInputDevicesCallback, NativeConnection.MLSPairwiseFingerprintCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f4411b;

    public /* synthetic */ a(Function1 function1, int i7) {
        this.f4410a = i7;
        this.f4411b = function1;
    }

    @Override // com.discord.native.engine.NativeEngine.GetCodecCapabilitiesCallback
    public void onCodecCapabilities(String str) {
        MediaEngine.getCodecCapabilities$lambda$31$lambda$30(this.f4411b, str);
    }

    @Override // com.discord.native.engine.NativeEngine.GetAudioInputDevicesCallback
    public void onDevices(AudioInputDeviceDescription[] audioInputDeviceDescriptionArr) {
        MediaEngine.getInputDevices$lambda$10$lambda$9(this.f4411b, audioInputDeviceDescriptionArr);
    }

    @Override // com.discord.native.engine.NativeConnection.GetEncryptionModesCallback
    public void onEncryptionModes(String[] strArr) {
        MediaEngine.connectionInstanceGetEncryptionModes$lambda$65(this.f4411b, strArr);
    }

    @Override // com.discord.native.engine.NativeConnection.MLSProcessProposalsCallback
    public void onMLSCommitWelcome(String str) {
        MediaEngine.connectionInstanceProcessMLSProposalsB64$lambda$70(this.f4411b, str);
    }

    @Override // com.discord.native.engine.NativeConnection.MLSKeyPackageCallback
    public void onMLSKeyPackage(String str) {
        MediaEngine.connectionInstanceGetMLSKeyPackageB64$lambda$69(this.f4411b, str);
    }

    @Override // com.discord.native.engine.NativeConnection.MLSPairwiseFingerprintCallback
    public void onMLSPairwiseFingerprint(String str) {
        MediaEngine.connectionInstanceGetMLSPairwiseFingerprintB64$lambda$73(this.f4411b, str);
    }

    @Override // com.discord.native.engine.NativeEngine.GetRankedRtcRegionsCallback
    public void onRankedRtcRegions(String[] strArr) {
        MediaEngine.rankRtcRegions$lambda$37$lambda$36(this.f4411b, strArr);
    }

    @Override // com.discord.native.engine.NativeEngine.StartLocalAudioRecordingCallback
    public void onStartLocalAudioRecording(boolean z5) {
        MediaEngine.startLocalAudioRecording$lambda$39(this.f4411b, z5);
    }

    @Override // com.discord.native.engine.NativeConnection.GetStatsCallback
    public void onStats(String str) {
        switch (this.f4410a) {
            case 5:
                MediaEngine.connectionInstanceGetFilteredStats$lambda$67(this.f4411b, str);
                break;
            default:
                MediaEngine.connectionInstanceGetStats$lambda$66(this.f4411b, str);
                break;
        }
    }

    @Override // com.discord.native.engine.NativeEngine.GetAudioOutputDevicesCallback
    public void onDevices(AudioOutputDeviceDescription[] audioOutputDeviceDescriptionArr) {
        MediaEngine.getOutputDevices$lambda$15$lambda$14(this.f4411b, audioOutputDeviceDescriptionArr);
    }

    @Override // com.discord.native.engine.NativeEngine.GetVideoInputDevicesCallback
    public void onDevices(VideoInputDeviceDescription[] videoInputDeviceDescriptionArr) {
        MediaEngine.getVideoInputDevices$lambda$20$lambda$19(this.f4411b, videoInputDeviceDescriptionArr);
    }
}
