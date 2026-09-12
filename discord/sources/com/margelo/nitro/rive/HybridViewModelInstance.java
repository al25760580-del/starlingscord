package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.ViewModelInstance;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\f\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0082\b¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0001H\u0016J\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010)2\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006*"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelInstance;", "Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "viewModelInstance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "<init>", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "getViewModelInstance", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "instanceName", "", "getInstanceName", "()Ljava/lang/String;", "getPropertyOrNull", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "numberProperty", "Lcom/margelo/nitro/rive/HybridViewModelNumberProperty;", "path", "stringProperty", "Lcom/margelo/nitro/rive/HybridViewModelStringProperty;", "booleanProperty", "Lcom/margelo/nitro/rive/HybridViewModelBooleanProperty;", "colorProperty", "Lcom/margelo/nitro/rive/HybridViewModelColorProperty;", "enumProperty", "Lcom/margelo/nitro/rive/HybridViewModelEnumProperty;", "triggerProperty", "Lcom/margelo/nitro/rive/HybridViewModelTriggerProperty;", "imageProperty", "Lcom/margelo/nitro/rive/HybridViewModelImageProperty;", "listProperty", "Lcom/margelo/nitro/rive/HybridViewModelListProperty;", "artboardProperty", "Lcom/margelo/nitro/rive/HybridViewModelArtboardProperty;", "viewModel", "replaceViewModel", "", "instance", "viewModelAsync", "Lcom/margelo/nitro/core/Promise;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@xa.a
@SourceDebugExtension({"SMAP\nHybridViewModelInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridViewModelInstance.kt\ncom/margelo/nitro/rive/HybridViewModelInstance\n*L\n1#1,74:1\n18#1,4:75\n18#1,4:79\n18#1,4:83\n18#1,4:87\n18#1,4:91\n18#1,4:95\n18#1,4:99\n18#1,4:103\n18#1,4:107\n18#1,4:111\n*S KotlinDebug\n*F\n+ 1 HybridViewModelInstance.kt\ncom/margelo/nitro/rive/HybridViewModelInstance\n*L\n25#1:75,4\n29#1:79,4\n33#1:83,4\n37#1:87,4\n41#1:91,4\n45#1:95,4\n49#1:99,4\n53#1:103,4\n57#1:107,4\n61#1:111,4\n*E\n"})
public final class HybridViewModelInstance extends HybridViewModelInstanceSpec {

    @NotNull
    private final ViewModelInstance viewModelInstance;

    public HybridViewModelInstance(@NotNull ViewModelInstance viewModelInstance) {
        Intrinsics.checkNotNullParameter(viewModelInstance, "viewModelInstance");
        this.viewModelInstance = viewModelInstance;
    }

    private final <T> T getPropertyOrNull(Function0<? extends T> block) {
        try {
            return (T) block.invoke();
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    @NotNull
    public String getInstanceName() {
        return this.viewModelInstance.getName();
    }

    @NotNull
    public final ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    public void replaceViewModel(@NotNull String path, @NotNull HybridViewModelInstanceSpec instance) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.viewModelInstance.setInstanceProperty(path, ((HybridViewModelInstance) instance).viewModelInstance);
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    @NotNull
    public Promise<HybridViewModelInstanceSpec> viewModelAsync(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return com.margelo.nitro.core.f.a(Promise.Companion, new z(this, path, null, 4));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    public HybridViewModelArtboardProperty artboardProperty(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new HybridViewModelArtboardProperty(this.viewModelInstance.getArtboardProperty(path));
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    public HybridViewModelBooleanProperty booleanProperty(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new HybridViewModelBooleanProperty(this.viewModelInstance.getBooleanProperty(path));
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    public HybridViewModelColorProperty colorProperty(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new HybridViewModelColorProperty(this.viewModelInstance.getColorProperty(path));
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    public HybridViewModelEnumProperty enumProperty(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new HybridViewModelEnumProperty(this.viewModelInstance.getEnumProperty(path));
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    public HybridViewModelImageProperty imageProperty(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new HybridViewModelImageProperty(this.viewModelInstance.getImageProperty(path));
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    public HybridViewModelListProperty listProperty(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new HybridViewModelListProperty(this.viewModelInstance.getListProperty(path));
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    public HybridViewModelNumberProperty numberProperty(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new HybridViewModelNumberProperty(this.viewModelInstance.getNumberProperty(path));
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    public HybridViewModelStringProperty stringProperty(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new HybridViewModelStringProperty(this.viewModelInstance.getStringProperty(path));
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    public HybridViewModelTriggerProperty triggerProperty(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new HybridViewModelTriggerProperty(this.viewModelInstance.getTriggerProperty(path));
        } catch (ViewModelException unused) {
            return null;
        }
    }

    @Override // com.margelo.nitro.rive.HybridViewModelInstanceSpec
    public HybridViewModelInstance viewModel(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new HybridViewModelInstance(this.viewModelInstance.getInstanceProperty(path));
        } catch (ViewModelException unused) {
            return null;
        }
    }
}
