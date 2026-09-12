package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.BindableArtboard;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/margelo/nitro/rive/HybridBindableArtboard;", "Lcom/margelo/nitro/rive/HybridBindableArtboardSpec;", "bindableArtboard", "Lapp/rive/runtime/kotlin/core/BindableArtboard;", "<init>", "(Lapp/rive/runtime/kotlin/core/BindableArtboard;)V", "getBindableArtboard$rive_app_react_native_release", "()Lapp/rive/runtime/kotlin/core/BindableArtboard;", "setBindableArtboard$rive_app_react_native_release", "artboardName", "", "getArtboardName", "()Ljava/lang/String;", "dispose", "", "finalize", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridBindableArtboard extends HybridBindableArtboardSpec {
    private BindableArtboard bindableArtboard;

    public HybridBindableArtboard(BindableArtboard bindableArtboard) {
        this.bindableArtboard = bindableArtboard;
    }

    @Override // com.margelo.nitro.core.HybridObject
    public void dispose() {
        BindableArtboard bindableArtboard = this.bindableArtboard;
        if (bindableArtboard != null) {
            bindableArtboard.release();
        }
        this.bindableArtboard = null;
    }

    public final void finalize() {
        dispose();
    }

    @Override // com.margelo.nitro.rive.HybridBindableArtboardSpec
    @NotNull
    public String getArtboardName() {
        String name;
        BindableArtboard bindableArtboard = this.bindableArtboard;
        if (bindableArtboard == null || (name = bindableArtboard.getName()) == null) {
            throw new IllegalStateException("BindableArtboard has been disposed");
        }
        return name;
    }

    /* JADX INFO: renamed from: getBindableArtboard$rive_app_react_native_release, reason: from getter */
    public final BindableArtboard getBindableArtboard() {
        return this.bindableArtboard;
    }

    public final void setBindableArtboard$rive_app_react_native_release(BindableArtboard bindableArtboard) {
        this.bindableArtboard = bindableArtboard;
    }
}
