package ShiggyXposed.xposed.modules;

import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import ShiggyXposed.xposed.modules.bridge.BridgeModule;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CacheModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"LShiggyXposed/xposed/modules/CacheModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", "CACHE_DIR", "", "MODULES_CACHE_PREFIX", "ASSETS_CACHE_PREFIX", "modulesCache", "LShiggyXposed/xposed/modules/ModulesCache;", "assetsCache", "LShiggyXposed/xposed/modules/AssetsCache;", "onContext", "", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CacheModule extends Module {
    private static final String ASSETS_CACHE_PREFIX = "assets";
    private static final String CACHE_DIR = "Shiggy";
    public static final CacheModule INSTANCE = new CacheModule();
    private static final String MODULES_CACHE_PREFIX = "modules";
    private static AssetsCache assetsCache;
    private static ModulesCache modulesCache;

    private CacheModule() {
    }

    @Override // ShiggyXposed.xposed.Module
    public void onContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getCacheDir(), "Shiggy");
        CacheModule cacheModule = INSTANCE;
        cacheModule.asDir(file);
        long versionCode = cacheModule.getAppInfo(context).getVersionCode();
        final File file2 = new File(file, "modules." + versionCode);
        cacheModule.asFile(file2);
        final File file3 = new File(file, "assets." + versionCode);
        cacheModule.asFile(file3);
        BridgeModule.INSTANCE.registerMethod("Shiggy.caches.modules.read", new Function1() { // from class: ShiggyXposed.xposed.modules.CacheModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CacheModule.onContext$lambda$11$lambda$4(file2, (ArrayList) obj);
            }
        });
        BridgeModule.INSTANCE.registerMethod("Shiggy.caches.modules.write", new Function1() { // from class: ShiggyXposed.xposed.modules.CacheModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CacheModule.onContext$lambda$11$lambda$6(file2, (ArrayList) obj);
            }
        });
        BridgeModule.INSTANCE.registerMethod("Shiggy.caches.assets.read", new Function1() { // from class: ShiggyXposed.xposed.modules.CacheModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CacheModule.onContext$lambda$11$lambda$8(file3, (ArrayList) obj);
            }
        });
        BridgeModule.INSTANCE.registerMethod("Shiggy.caches.assets.write", new Function1() { // from class: ShiggyXposed.xposed.modules.CacheModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CacheModule.onContext$lambda$11$lambda$10(file3, (ArrayList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onContext$lambda$11$lambda$4(File file, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ModulesCache modulesCache2 = modulesCache;
        if (modulesCache2 != null) {
            if (modulesCache2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("modulesCache");
                modulesCache2 = null;
            }
            return modulesCache2.toMap();
        }
        ModulesCache modulesCacheLoadFromFileOrNull = ModulesCache.INSTANCE.loadFromFileOrNull(file);
        if (modulesCacheLoadFromFileOrNull == null) {
            return null;
        }
        modulesCache = modulesCacheLoadFromFileOrNull;
        return modulesCacheLoadFromFileOrNull.toMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onContext$lambda$11$lambda$6(File file, ArrayList it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = it;
        Object obj = arrayList.get(0);
        Object obj2 = arrayList.get(1);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Double>");
        ArrayList arrayList2 = (ArrayList) obj;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.util.HashMap<kotlin.String, kotlin.Double>?>");
        HashMap map = (HashMap) obj2;
        ModulesCache modulesCache2 = new ModulesCache(arrayList2, map);
        modulesCache2.saveToFile(file);
        modulesCache = modulesCache2;
        return Integer.valueOf(Utils.Log.INSTANCE.i("Modules cache saved: " + file.getAbsolutePath() + " (blacklisted: " + arrayList2.size() + ", finds: " + map.size() + ')'));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onContext$lambda$11$lambda$8(File file, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AssetsCache assetsCache2 = assetsCache;
        if (assetsCache2 != null) {
            if (assetsCache2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("assetsCache");
                assetsCache2 = null;
            }
            return assetsCache2.toMap();
        }
        AssetsCache assetsCacheLoadFromFileOrNull = AssetsCache.INSTANCE.loadFromFileOrNull(file);
        if (assetsCacheLoadFromFileOrNull == null) {
            return null;
        }
        assetsCache = assetsCacheLoadFromFileOrNull;
        return assetsCacheLoadFromFileOrNull.toMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onContext$lambda$11$lambda$10(File file, ArrayList it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.util.HashMap<kotlin.String, kotlin.Double>>");
        HashMap map = (HashMap) obj;
        AssetsCache assetsCache2 = new AssetsCache(map);
        assetsCache2.saveToFile(file);
        assetsCache = assetsCache2;
        return Integer.valueOf(Utils.Log.INSTANCE.i("Assets cache saved: " + file.getAbsolutePath() + " (count: " + map.size() + ')'));
    }
}
