package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.facebook.react.devsupport.StackTraceHelper;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000 32\u00020\u0001:\u000245B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00170\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00162\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H'¢\u0006\u0004\b \u0010\u0019J\u001b\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00170\u0016H'¢\u0006\u0004\b!\u0010\u0019J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b(\u0010)R\u0016\u0010,\u001a\u0004\u0018\u00010\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\u00178gX¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveFileSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "", "index", "Lcom/margelo/nitro/rive/HybridViewModelSpec;", "viewModelByIndex", "(D)Lcom/margelo/nitro/rive/HybridViewModelSpec;", "", StackTraceHelper.NAME_KEY, "viewModelByName", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelSpec;", "Lcom/margelo/nitro/rive/ArtboardBy;", "artboardBy", "defaultArtboardViewModel", "(Lcom/margelo/nitro/rive/ArtboardBy;)Lcom/margelo/nitro/rive/HybridViewModelSpec;", "Lcom/margelo/nitro/rive/ReferencedAssetsType;", "referencedAssets", "", "updateReferencedAssets", "(Lcom/margelo/nitro/rive/ReferencedAssetsType;)V", "Lcom/margelo/nitro/core/Promise;", "", "getViewModelNamesAsync", "()Lcom/margelo/nitro/core/Promise;", "", "validate", "viewModelByNameAsync", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/margelo/nitro/core/Promise;", "defaultArtboardViewModelAsync", "(Lcom/margelo/nitro/rive/ArtboardBy;)Lcom/margelo/nitro/core/Promise;", "getArtboardCountAsync", "getArtboardNamesAsync", "Lcom/margelo/nitro/rive/HybridBindableArtboardSpec;", "getBindableArtboard", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridBindableArtboardSpec;", "toString", "()Ljava/lang/String;", "Lcom/margelo/nitro/rive/HybridRiveFileSpec$CxxPart;", "createCxxPart", "()Lcom/margelo/nitro/rive/HybridRiveFileSpec$CxxPart;", "getViewModelCount", "()Ljava/lang/Double;", "viewModelCount", "getArtboardCount", "()D", "artboardCount", "getArtboardNames", "()[Ljava/lang/String;", "artboardNames", "Companion", "CxxPart", "com/margelo/nitro/rive/f0", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridRiveFileSpec extends HybridObject {

    @NotNull
    public static final f0 Companion = new f0();

    @NotNull
    protected static final String TAG = "HybridRiveFileSpec";

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveFileSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/rive/HybridRiveFileSpec;", "<init>", "(Lcom/margelo/nitro/rive/HybridRiveFileSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public static class CxxPart extends HybridObject.CxxPart {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(@NotNull HybridRiveFileSpec javaPart) {
            super(javaPart);
            Intrinsics.checkNotNullParameter(javaPart, "javaPart");
        }

        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        @NotNull
        public native HybridData initHybrid();
    }

    @xa.a
    @Keep
    public abstract HybridViewModelSpec defaultArtboardViewModel(ArtboardBy artboardBy);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<HybridViewModelSpec> defaultArtboardViewModelAsync(ArtboardBy artboardBy);

    @xa.a
    @Keep
    public abstract double getArtboardCount();

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Double> getArtboardCountAsync();

    @xa.a
    @Keep
    @NotNull
    public abstract String[] getArtboardNames();

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<String[]> getArtboardNamesAsync();

    @xa.a
    @Keep
    @NotNull
    public abstract HybridBindableArtboardSpec getBindableArtboard(@NotNull String name);

    @xa.a
    @Keep
    public abstract Double getViewModelCount();

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<String[]> getViewModelNamesAsync();

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public String toString() {
        return "[HybridObject RiveFile]";
    }

    @xa.a
    @Keep
    public abstract void updateReferencedAssets(@NotNull ReferencedAssetsType referencedAssets);

    @xa.a
    @Keep
    public abstract HybridViewModelSpec viewModelByIndex(double index);

    @xa.a
    @Keep
    public abstract HybridViewModelSpec viewModelByName(@NotNull String name);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<HybridViewModelSpec> viewModelByNameAsync(@NotNull String name, Boolean validate);

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
