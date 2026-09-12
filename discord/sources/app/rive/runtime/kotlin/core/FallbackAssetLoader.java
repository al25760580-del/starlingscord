package app.rive.runtime.kotlin.core;

import android.content.Context;
import app.rive.runtime.kotlin.RiveAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0001J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0001J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bR\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lapp/rive/runtime/kotlin/core/FallbackAssetLoader;", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "context", "Landroid/content/Context;", "loadCDNAssets", "", "loader", "(Landroid/content/Context;ZLapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "loaders", "", "getLoaders$annotations", "()V", "getLoaders", "()Ljava/util/List;", "appendLoader", "", "loadContents", "asset", "Lapp/rive/runtime/kotlin/core/FileAsset;", "inBandBytes", "", "prependLoader", "resetCDNLoader", "needsCDNLoader", "resetWith", "builder", "Lapp/rive/runtime/kotlin/RiveAnimationView$Builder;", "resetWith$kotlin_release", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileAssetLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileAssetLoader.kt\napp/rive/runtime/kotlin/core/FallbackAssetLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1#2:203\n1755#3,3:204\n360#3,7:207\n*S KotlinDebug\n*F\n+ 1 FileAssetLoader.kt\napp/rive/runtime/kotlin/core/FallbackAssetLoader\n*L\n131#1:204,3\n135#1:207,7\n*E\n"})
public final class FallbackAssetLoader extends FileAssetLoader {
    public static final int $stable = 8;

    @NotNull
    private final List<FileAssetLoader> loaders;

    public /* synthetic */ FallbackAssetLoader(Context context, boolean z5, FileAssetLoader fileAssetLoader, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? true : z5, (i7 & 4) != 0 ? null : fileAssetLoader);
    }

    public static /* synthetic */ void getLoaders$annotations() {
    }

    private final void resetCDNLoader(boolean needsCDNLoader, Context context) {
        Iterator<FileAssetLoader> it = this.loaders.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (it.next() instanceof CDNAssetLoader) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1 && needsCDNLoader) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            appendLoader(new CDNAssetLoader(applicationContext));
        } else {
            if (i7 < 0 || needsCDNLoader) {
                return;
            }
            FileAssetLoader fileAssetLoaderRemove = this.loaders.remove(i7);
            getDependencies().remove(fileAssetLoaderRemove);
            fileAssetLoaderRemove.release();
        }
    }

    public final void appendLoader(@NotNull FileAssetLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.loaders.add(loader);
        getDependencies().add(loader);
    }

    @NotNull
    public final List<FileAssetLoader> getLoaders() {
        return this.loaders;
    }

    @Override // app.rive.runtime.kotlin.core.FileAssetLoader
    public boolean loadContents(@NotNull FileAsset asset, @NotNull byte[] inBandBytes) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(inBandBytes, "inBandBytes");
        List<FileAssetLoader> list = this.loaders;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((FileAssetLoader) it.next()).loadContents(asset, inBandBytes)) {
                return true;
            }
        }
        return false;
    }

    public final void prependLoader(@NotNull FileAssetLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.loaders.add(0, loader);
        getDependencies().add(loader);
    }

    public final void resetWith$kotlin_release(@NotNull RiveAnimationView.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        FileAssetLoader assetLoader = builder.getAssetLoader();
        if (assetLoader != null) {
            prependLoader(assetLoader);
        }
        boolean shouldLoadCDNAssets = builder.getShouldLoadCDNAssets();
        Context applicationContext = builder.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        resetCDNLoader(shouldLoadCDNAssets, applicationContext);
    }

    public FallbackAssetLoader(@NotNull Context context, boolean z5, FileAssetLoader fileAssetLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.loaders = new ArrayList();
        if (fileAssetLoader != null) {
            appendLoader(fileAssetLoader);
        }
        if (z5) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            appendLoader(new CDNAssetLoader(applicationContext));
        }
    }
}
