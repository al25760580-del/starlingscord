package com.discord.media.engine;

import com.discord.p000native.engine.NativeConnection;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements NativeConnection.OnSpeakingWhileMutedCallback, NativeConnection.MLSFailureCallback, NativeConnection.SecureFramesStateUpdateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaEngine f4412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f4413b;

    public /* synthetic */ b(MediaEngine mediaEngine, Function function) {
        this.f4412a = mediaEngine;
        this.f4413b = function;
    }

    @Override // com.discord.native.engine.NativeConnection.MLSFailureCallback
    public void onMLSFailureCallback(String str, String str2) {
        MediaEngine.connectionInstanceSetOnMLSFailureCallback$lambda$59(this.f4412a, (Function2) this.f4413b, str, str2);
    }

    @Override // com.discord.native.engine.NativeConnection.SecureFramesStateUpdateCallback
    public void onSecureFramesStateUpdateCallback(String str) {
        MediaEngine.connectionInstanceSetSecureFramesStateUpdateCallback$lambda$61(this.f4412a, (Function1) this.f4413b, str);
    }

    @Override // com.discord.native.engine.NativeConnection.OnSpeakingWhileMutedCallback
    public void onSpeakingWhileMuted() {
        MediaEngine.connectionInstanceSetOnSpeakingWhileMutedCallback$lambda$49(this.f4412a, (Function0) this.f4413b);
    }
}
