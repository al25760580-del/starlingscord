package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.FileAsset;
import app.rive.runtime.kotlin.core.ViewModel;
import com.facebook.react.devsupport.StackTraceHelper;
import com.margelo.nitro.core.Promise;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001b\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0016¢\u0006\u0004\b%\u0010\u001eJ\u001b\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0\u001bH\u0016¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\u0003R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R6\u00106\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u000204\u0018\u000103j\u0004\u0018\u0001`58\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveFile;", "Lcom/margelo/nitro/rive/HybridRiveFileSpec;", "<init>", "()V", "", "refreshAfterAssetChange", "", "index", "Lcom/margelo/nitro/rive/HybridViewModelSpec;", "viewModelByIndex", "(D)Lcom/margelo/nitro/rive/HybridViewModelSpec;", "", StackTraceHelper.NAME_KEY, "viewModelByName", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelSpec;", "Lcom/margelo/nitro/rive/ArtboardBy;", "artboardBy", "defaultArtboardViewModel", "(Lcom/margelo/nitro/rive/ArtboardBy;)Lcom/margelo/nitro/rive/HybridViewModelSpec;", "Lcom/margelo/nitro/rive/HybridBindableArtboardSpec;", "getBindableArtboard", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridBindableArtboardSpec;", "Lcom/margelo/nitro/rive/HybridRiveView;", "view", "registerView", "(Lcom/margelo/nitro/rive/HybridRiveView;)V", "unregisterView", "Lcom/margelo/nitro/core/Promise;", "", "getViewModelNamesAsync", "()Lcom/margelo/nitro/core/Promise;", "", "validate", "viewModelByNameAsync", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/margelo/nitro/core/Promise;", "defaultArtboardViewModelAsync", "(Lcom/margelo/nitro/rive/ArtboardBy;)Lcom/margelo/nitro/core/Promise;", "getArtboardCountAsync", "getArtboardNamesAsync", "Lcom/margelo/nitro/rive/ReferencedAssetsType;", "referencedAssets", "updateReferencedAssets", "(Lcom/margelo/nitro/rive/ReferencedAssetsType;)V", "dispose", "Lapp/rive/runtime/kotlin/core/File;", "riveFile", "Lapp/rive/runtime/kotlin/core/File;", "getRiveFile", "()Lapp/rive/runtime/kotlin/core/File;", "setRiveFile", "(Lapp/rive/runtime/kotlin/core/File;)V", "", "Lapp/rive/runtime/kotlin/core/FileAsset;", "Lcom/margelo/nitro/rive/ReferencedAssetCache;", "referencedAssetCache", "Ljava/util/Map;", "getReferencedAssetCache", "()Ljava/util/Map;", "setReferencedAssetCache", "(Ljava/util/Map;)V", "Lcom/margelo/nitro/rive/x1;", "assetLoader", "Lcom/margelo/nitro/rive/x1;", "getAssetLoader", "()Lcom/margelo/nitro/rive/x1;", "setAssetLoader", "(Lcom/margelo/nitro/rive/x1;)V", "", "Ljava/lang/ref/WeakReference;", "weakViews", "Ljava/util/List;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getViewModelCount", "()Ljava/lang/Double;", "viewModelCount", "getArtboardCount", "()D", "artboardCount", "getArtboardNames", "()[Ljava/lang/String;", "artboardNames", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@xa.a
@SourceDebugExtension({"SMAP\nHybridRiveFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridRiveFile.kt\ncom/margelo/nitro/rive/HybridRiveFile\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,152:1\n37#2:153\n36#2,3:154\n*S KotlinDebug\n*F\n+ 1 HybridRiveFile.kt\ncom/margelo/nitro/rive/HybridRiveFile\n*L\n65#1:153\n65#1:154,3\n*E\n"})
public final class HybridRiveFile extends HybridRiveFileSpec {
    private x1 assetLoader;
    private Map<String, FileAsset> referencedAssetCache;
    private File riveFile;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final List<WeakReference<HybridRiveView>> weakViews = new ArrayList();

    public HybridRiveFile() {
        hr.e eVar = ar.k0.f2938a;
        br.d dVar = fr.q.f9394a;
        ar.q1 q1Var = new ar.q1();
        dVar.getClass();
        this.scope = ar.b0.b(kotlin.coroutines.e.c(dVar, q1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshAfterAssetChange() {
        kotlin.collections.i0.s(this.weakViews, new com.discord.user_search_worker.a(9));
        Iterator<WeakReference<HybridRiveView>> it = this.weakViews.iterator();
        while (it.hasNext()) {
            HybridRiveView hybridRiveView = it.next().get();
            if (hybridRiveView != null) {
                hybridRiveView.refreshAfterAssetChange();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshAfterAssetChange$lambda$1(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean unregisterView$lambda$0(HybridRiveView hybridRiveView, WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.get(), hybridRiveView);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    public HybridViewModelSpec defaultArtboardViewModel(ArtboardBy artboardBy) {
        ArtboardByTypes type;
        Artboard firstArtboard;
        File file;
        ViewModel viewModelDefaultViewModelForArtboard;
        if (artboardBy != null) {
            try {
                type = artboardBy.getType();
            } catch (Exception unused) {
            }
        } else {
            type = null;
        }
        int i7 = type == null ? -1 : y.f6999a[type.ordinal()];
        if (i7 == -1) {
            File file2 = this.riveFile;
            if (file2 != null) {
                firstArtboard = file2.getFirstArtboard();
            } else {
                firstArtboard = null;
            }
        } else if (i7 == 1) {
            File file3 = this.riveFile;
            if (file3 != null) {
                Double index = artboardBy.getIndex();
                Intrinsics.checkNotNull(index);
                firstArtboard = file3.artboard((int) index.doubleValue());
            } else {
                firstArtboard = null;
            }
        } else {
            if (i7 != 2) {
                throw new rn.n();
            }
            File file4 = this.riveFile;
            if (file4 != null) {
                String name = artboardBy.getName();
                Intrinsics.checkNotNull(name);
                firstArtboard = file4.artboard(name);
            } else {
                firstArtboard = null;
            }
        }
        if (firstArtboard != null && (file = this.riveFile) != null && (viewModelDefaultViewModelForArtboard = file.defaultViewModelForArtboard(firstArtboard)) != null) {
            return new HybridViewModel(viewModelDefaultViewModelForArtboard);
        }
        return null;
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    @NotNull
    public Promise<HybridViewModelSpec> defaultArtboardViewModelAsync(ArtboardBy artboardBy) {
        return com.margelo.nitro.core.f.a(Promise.Companion, new z(this, artboardBy, null, 0));
    }

    @Override // com.margelo.nitro.core.HybridObject
    public void dispose() {
        ar.b0.f(this.scope, null);
        this.weakViews.clear();
        x1 x1Var = this.assetLoader;
        if (x1Var != null) {
            ar.b0.f(x1Var.f6998a, null);
        }
        this.assetLoader = null;
        File file = this.riveFile;
        if (file != null) {
            file.release();
        }
        this.riveFile = null;
        Map<String, FileAsset> map = this.referencedAssetCache;
        if (map != null) {
            map.clear();
        }
        this.referencedAssetCache = null;
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    public double getArtboardCount() {
        List<String> artboardNames;
        File file = this.riveFile;
        if (file == null || (artboardNames = file.getArtboardNames()) == null) {
            return 0.0d;
        }
        return artboardNames.size();
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    @NotNull
    public Promise<Double> getArtboardCountAsync() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new a0(this, null, 0));
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    @NotNull
    public String[] getArtboardNames() {
        List<String> artboardNames;
        String[] strArr;
        File file = this.riveFile;
        return (file == null || (artboardNames = file.getArtboardNames()) == null || (strArr = (String[]) artboardNames.toArray(new String[0])) == null) ? new String[0] : strArr;
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    @NotNull
    public Promise<String[]> getArtboardNamesAsync() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new a0(this, null, 1));
    }

    public final x1 getAssetLoader() {
        return this.assetLoader;
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    @NotNull
    public HybridBindableArtboardSpec getBindableArtboard(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        File file = this.riveFile;
        if (file != null) {
            return new HybridBindableArtboard(File.createBindableArtboardByName$default(file, name, null, 2, null));
        }
        throw new IllegalStateException("RiveFile not loaded");
    }

    public final Map<String, FileAsset> getReferencedAssetCache() {
        return this.referencedAssetCache;
    }

    public final File getRiveFile() {
        return this.riveFile;
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    public Double getViewModelCount() {
        File file = this.riveFile;
        if (file != null) {
            return Double.valueOf(file.getViewModelCount());
        }
        return null;
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    @NotNull
    public Promise<String[]> getViewModelNamesAsync() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new a0(this, null, 2));
    }

    public final void registerView(@NotNull HybridRiveView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.weakViews.add(new WeakReference<>(view));
    }

    public final void setAssetLoader(x1 x1Var) {
        this.assetLoader = x1Var;
    }

    public final void setReferencedAssetCache(Map<String, FileAsset> map) {
        this.referencedAssetCache = map;
    }

    public final void setRiveFile(File file) {
        this.riveFile = file;
    }

    public final void unregisterView(@NotNull HybridRiveView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        kotlin.collections.i0.s(this.weakViews, new x(view, 0));
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    public void updateReferencedAssets(@NotNull ReferencedAssetsType referencedAssets) {
        Map<String, FileAsset> map;
        x1 x1Var;
        Intrinsics.checkNotNullParameter(referencedAssets, "referencedAssets");
        Map<String, ResolvedReferencedAsset> data = referencedAssets.getData();
        if (data == null || (map = this.referencedAssetCache) == null || (x1Var = this.assetLoader) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ResolvedReferencedAsset> entry : data.entrySet()) {
            String key = entry.getKey();
            ResolvedReferencedAsset assetData = entry.getValue();
            FileAsset asset = map.get(key);
            if (asset != null) {
                Intrinsics.checkNotNullParameter(assetData, "assetData");
                Intrinsics.checkNotNullParameter(asset, "asset");
                arrayList.add(x1Var.a(assetData, asset));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ar.b0.t(this.scope, null, new b4.d(arrayList, this, null, 2), 3);
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    public HybridViewModelSpec viewModelByIndex(double index) {
        ViewModel viewModelByIndex;
        if (index < 0.0d) {
            return null;
        }
        try {
            File file = this.riveFile;
            if (file != null && (viewModelByIndex = file.getViewModelByIndex((int) index)) != null) {
                return new HybridViewModel(viewModelByIndex);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    public HybridViewModelSpec viewModelByName(@NotNull String name) {
        ViewModel viewModelByName;
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            File file = this.riveFile;
            if (file != null && (viewModelByName = file.getViewModelByName(name)) != null) {
                return new HybridViewModel(viewModelByName);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileSpec
    @NotNull
    public Promise<HybridViewModelSpec> viewModelByNameAsync(@NotNull String name, Boolean validate) {
        Intrinsics.checkNotNullParameter(name, "name");
        return com.margelo.nitro.core.f.a(Promise.Companion, new z(this, name, null, 1));
    }
}
