package com.discord.media.engine;

import com.discord.p000native.engine.NativeConnection;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements NativeConnection.OnVideoCallback, NativeConnection.OnPingCallback, NativeConnection.OnPingTimeoutCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaEngine f4416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function4 f4417b;

    public /* synthetic */ e(MediaEngine mediaEngine, Function4 function4) {
        this.f4416a = mediaEngine;
        this.f4417b = function4;
    }

    @Override // com.discord.native.engine.NativeConnection.OnPingCallback
    public void onPing(int i7, String str, int i10, int i11) {
        MediaEngine.connectionInstanceSetOnPingCallback$lambda$51(this.f4416a, this.f4417b, i7, str, i10, i11);
    }

    @Override // com.discord.native.engine.NativeConnection.OnPingTimeoutCallback
    public void onPingTimeout(String str, int i7, int i10, int i11) {
        MediaEngine.connectionInstanceSetOnPingTimeoutCallback$lambda$53(this.f4416a, this.f4417b, str, i7, i10, i11);
    }

    @Override // com.discord.native.engine.NativeConnection.OnVideoCallback
    public void onVideo(String str, long j, String str2, String str3) {
        MediaEngine.connectionInstanceSetOnVideoCallback$lambda$57(this.f4416a, this.f4417b, str, j, str2, str3);
    }
}
