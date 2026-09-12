package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.ViewModel;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import com.facebook.react.devsupport.StackTraceHelper;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\rH\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0016J\u0018\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00182\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0018H\u0016J\u0010\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModel;", "Lcom/margelo/nitro/rive/HybridViewModelSpec;", "viewModel", "Lapp/rive/runtime/kotlin/core/ViewModel;", "<init>", "(Lapp/rive/runtime/kotlin/core/ViewModel;)V", "propertyCount", "", "getPropertyCount", "()D", "instanceCount", "getInstanceCount", "modelName", "", "getModelName", "()Ljava/lang/String;", "createInstanceByIndex", "Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "index", "createInstanceByName", StackTraceHelper.NAME_KEY, "createDefaultInstance", "createInstance", "getPropertyCountAsync", "Lcom/margelo/nitro/core/Promise;", "getInstanceCountAsync", "createInstanceByNameAsync", "createDefaultInstanceAsync", "createBlankInstanceAsync", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridViewModel extends HybridViewModelSpec {

    @NotNull
    private final ViewModel viewModel;

    public HybridViewModel(@NotNull ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    @NotNull
    public Promise<HybridViewModelInstanceSpec> createBlankInstanceAsync() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new y0(this, null, 0));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    public HybridViewModelInstanceSpec createDefaultInstance() {
        try {
            return new HybridViewModelInstance(this.viewModel.createDefaultInstance());
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    @NotNull
    public Promise<HybridViewModelInstanceSpec> createDefaultInstanceAsync() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new y0(this, null, 1));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    public HybridViewModelInstanceSpec createInstance() {
        try {
            return new HybridViewModelInstance(this.viewModel.createBlankInstance());
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    public HybridViewModelInstanceSpec createInstanceByIndex(double index) {
        if (index < 0.0d) {
            return null;
        }
        try {
            return new HybridViewModelInstance(this.viewModel.createInstanceFromIndex((int) index));
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    public HybridViewModelInstanceSpec createInstanceByName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return new HybridViewModelInstance(this.viewModel.createInstanceFromName(name));
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    @NotNull
    public Promise<HybridViewModelInstanceSpec> createInstanceByNameAsync(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return com.margelo.nitro.core.f.a(Promise.Companion, new z(this, name, null, 3));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    public double getInstanceCount() {
        return this.viewModel.getInstanceCount();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    @NotNull
    public Promise<Double> getInstanceCountAsync() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new y0(this, null, 2));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    @NotNull
    public String getModelName() {
        return this.viewModel.getName();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    public double getPropertyCount() {
        return this.viewModel.getPropertyCount();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelSpec
    @NotNull
    public Promise<Double> getPropertyCountAsync() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new y0(this, null, 3));
    }
}
