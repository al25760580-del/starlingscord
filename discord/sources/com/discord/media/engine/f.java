package com.discord.media.engine;

import com.discord.p000native.engine.NativeConnection;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements NativeConnection.OnFirstFrameCallback, NativeConnection.OnSpeakingCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaEngine f4418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function3 f4419b;

    public /* synthetic */ f(MediaEngine mediaEngine, Function3 function3) {
        this.f4418a = mediaEngine;
        this.f4419b = function3;
    }

    @Override // com.discord.native.engine.NativeConnection.OnFirstFrameCallback
    public void onFirstFrame(String str, long j, String str2) {
        MediaEngine.connectionInstanceSetOnFirstFrameCallback$lambda$55(this.f4418a, this.f4419b, str, j, str2);
    }

    @Override // com.discord.native.engine.NativeConnection.OnSpeakingCallback
    public void onSpeaking(String str, int i7, float f2) {
        MediaEngine.connectionInstanceSetOnSpeakingCallback$lambda$47(this.f4418a, this.f4419b, str, i7, f2);
    }
}
