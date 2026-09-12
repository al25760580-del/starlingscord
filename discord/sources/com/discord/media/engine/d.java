package com.discord.media.engine;

import com.discord.p000native.engine.ConnectionInfo;
import com.discord.p000native.engine.NativeEngine;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements NativeEngine.ConnectToServerCallback, NativeEngine.MLSSigningKeyCallback, NativeEngine.StopLocalAudioRecordingCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f4415a;

    public /* synthetic */ d(Function2 function2) {
        this.f4415a = function2;
    }

    @Override // com.discord.native.engine.NativeEngine.ConnectToServerCallback
    public void onConnectToServer(ConnectionInfo connectionInfo, String str) {
        MediaEngine.createVoiceConnection$lambda$44(this.f4415a, connectionInfo, str);
    }

    @Override // com.discord.native.engine.NativeEngine.MLSSigningKeyCallback
    public void onMLSSigningKey(String str, String str2) {
        MediaEngine.getMLSSigningKeyB64$lambda$74(this.f4415a, str, str2);
    }

    @Override // com.discord.native.engine.NativeEngine.StopLocalAudioRecordingCallback
    public void onStopLocalAudioRecording(String str, int i7) {
        MediaEngine.stopLocalAudioRecording$lambda$41$lambda$40(this.f4415a, str, i7);
    }
}
