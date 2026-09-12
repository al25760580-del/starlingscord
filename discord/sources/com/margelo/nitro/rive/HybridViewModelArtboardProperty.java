package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.ViewModelArtboardProperty;
import app.rive.runtime.kotlin.core.errors.RiveException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelArtboardProperty;", "Lcom/margelo/nitro/rive/HybridViewModelArtboardPropertySpec;", "property", "Lapp/rive/runtime/kotlin/core/ViewModelArtboardProperty;", "<init>", "(Lapp/rive/runtime/kotlin/core/ViewModelArtboardProperty;)V", "set", "", "artboard", "Lcom/margelo/nitro/rive/HybridBindableArtboardSpec;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridViewModelArtboardProperty extends HybridViewModelArtboardPropertySpec {

    @NotNull
    private final ViewModelArtboardProperty property;

    public HybridViewModelArtboardProperty(@NotNull ViewModelArtboardProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.property = property;
    }

    @Override // com.margelo.nitro.rive.HybridViewModelArtboardPropertySpec
    public void set(HybridBindableArtboardSpec artboard) throws RiveException {
        HybridBindableArtboard hybridBindableArtboard = artboard instanceof HybridBindableArtboard ? (HybridBindableArtboard) artboard : null;
        this.property.set(hybridBindableArtboard != null ? hybridBindableArtboard.getBindableArtboard() : null);
    }
}
