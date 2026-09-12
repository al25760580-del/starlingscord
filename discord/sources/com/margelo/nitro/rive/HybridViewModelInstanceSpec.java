package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 12\u00020\u0001:\u000223B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000#2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0000H'¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+¨\u00064"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "", "path", "Lcom/margelo/nitro/rive/HybridViewModelNumberPropertySpec;", "numberProperty", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelNumberPropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelStringPropertySpec;", "stringProperty", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelStringPropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelBooleanPropertySpec;", "booleanProperty", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelBooleanPropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelColorPropertySpec;", "colorProperty", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelColorPropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelEnumPropertySpec;", "enumProperty", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelEnumPropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelTriggerPropertySpec;", "triggerProperty", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelTriggerPropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelImagePropertySpec;", "imageProperty", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelImagePropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelListPropertySpec;", "listProperty", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelListPropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelArtboardPropertySpec;", "artboardProperty", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelArtboardPropertySpec;", "viewModel", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "Lcom/margelo/nitro/core/Promise;", "viewModelAsync", "(Ljava/lang/String;)Lcom/margelo/nitro/core/Promise;", "instance", "", "replaceViewModel", "(Ljava/lang/String;Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;)V", "toString", "()Ljava/lang/String;", "Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec$CxxPart;", "createCxxPart", "()Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec$CxxPart;", "getInstanceName", "instanceName", "Companion", "CxxPart", "com/margelo/nitro/rive/i1", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridViewModelInstanceSpec extends HybridObject {

    @NotNull
    public static final i1 Companion = new i1();

    @NotNull
    protected static final String TAG = "HybridViewModelInstanceSpec";

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "<init>", "(Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public static class CxxPart extends HybridObject.CxxPart {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(@NotNull HybridViewModelInstanceSpec javaPart) {
            super(javaPart);
            Intrinsics.checkNotNullParameter(javaPart, "javaPart");
        }

        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        @NotNull
        public native HybridData initHybrid();
    }

    @xa.a
    @Keep
    public abstract HybridViewModelArtboardPropertySpec artboardProperty(@NotNull String path);

    @xa.a
    @Keep
    public abstract HybridViewModelBooleanPropertySpec booleanProperty(@NotNull String path);

    @xa.a
    @Keep
    public abstract HybridViewModelColorPropertySpec colorProperty(@NotNull String path);

    @xa.a
    @Keep
    public abstract HybridViewModelEnumPropertySpec enumProperty(@NotNull String path);

    @xa.a
    @Keep
    @NotNull
    public abstract String getInstanceName();

    @xa.a
    @Keep
    public abstract HybridViewModelImagePropertySpec imageProperty(@NotNull String path);

    @xa.a
    @Keep
    public abstract HybridViewModelListPropertySpec listProperty(@NotNull String path);

    @xa.a
    @Keep
    public abstract HybridViewModelNumberPropertySpec numberProperty(@NotNull String path);

    @xa.a
    @Keep
    public abstract void replaceViewModel(@NotNull String path, @NotNull HybridViewModelInstanceSpec instance);

    @xa.a
    @Keep
    public abstract HybridViewModelStringPropertySpec stringProperty(@NotNull String path);

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public String toString() {
        return "[HybridObject ViewModelInstance]";
    }

    @xa.a
    @Keep
    public abstract HybridViewModelTriggerPropertySpec triggerProperty(@NotNull String path);

    @xa.a
    @Keep
    public abstract HybridViewModelInstanceSpec viewModel(@NotNull String path);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<HybridViewModelInstanceSpec> viewModelAsync(@NotNull String path);

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
