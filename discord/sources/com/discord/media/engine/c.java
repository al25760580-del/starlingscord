package com.discord.media.engine;

import com.discord.p000native.engine.NativeConnection;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements NativeConnection.MLSWelcomeCallback, NativeConnection.MLSCommitTransitionCallback, NativeConnection.SecureFramesTransitionReadyCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function f4414a;

    public /* synthetic */ c(Function function) {
        this.f4414a = function;
    }

    @Override // com.discord.native.engine.NativeConnection.MLSCommitTransitionCallback
    public void onMLSProcessedCommit(boolean z5, int i7, String str) {
        MediaEngine.connectionInstancePrepareMLSCommitTransitionB64$lambda$71((Function3) this.f4414a, z5, i7, str);
    }

    @Override // com.discord.native.engine.NativeConnection.MLSWelcomeCallback
    public void onMLSProcessedWelcome(boolean z5, int i7, String str) {
        MediaEngine.connectionInstanceProcessMLSWelcomeB64$lambda$72((Function3) this.f4414a, z5, i7, str);
    }

    @Override // com.discord.native.engine.NativeConnection.SecureFramesTransitionReadyCallback
    public void onTransitionReady() {
        ((Function0) this.f4414a).invoke();
    }
}
