package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveRuntime;", "Lcom/margelo/nitro/rive/HybridRiveRuntimeSpec;", "<init>", "()V", "initialize", "Lcom/margelo/nitro/core/Promise;", "", "isInitialized", "", "()Z", "initError", "", "getInitError", "()Ljava/lang/String;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridRiveRuntime extends HybridRiveRuntimeSpec {
    @Override // com.margelo.nitro.rive.HybridRiveRuntimeSpec
    public String getInitError() {
        return em.g.f8461c;
    }

    @Override // com.margelo.nitro.rive.HybridRiveRuntimeSpec
    @NotNull
    public Promise<Unit> initialize() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new p0(1, null, 0));
    }

    @Override // com.margelo.nitro.rive.HybridRiveRuntimeSpec
    public boolean isInitialized() {
        return em.g.f8460b;
    }
}
