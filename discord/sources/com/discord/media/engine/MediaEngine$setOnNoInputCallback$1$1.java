package com.discord.media.engine;

import com.discord.p000native.engine.NativeEngine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class MediaEngine$setOnNoInputCallback$1$1 implements NativeEngine.OnNoInputCallback {
    final /* synthetic */ Function1<Boolean, Unit> $cb;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$setOnNoInputCallback$1$1(Function1<? super Boolean, Unit> function1) {
        this.$cb = function1;
    }

    @Override // com.discord.native.engine.NativeEngine.OnNoInputCallback
    public final void onNoInput(boolean z5) {
        this.$cb.invoke(Boolean.valueOf(z5));
    }
}
