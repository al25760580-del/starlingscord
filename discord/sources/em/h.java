package em;

import android.util.Log;
import app.rive.runtime.kotlin.core.Rive;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.rive.RiveViewManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends BaseReactPackage {
    static {
        if (com.facebook.imagepipeline.nativecode.c.f4928b) {
            return;
        }
        try {
            Log.i("riveOnLoad", "Loading rive C++ library...");
            System.loadLibrary("rive");
            Log.i("riveOnLoad", "Successfully loaded rive C++ library!");
            com.facebook.imagepipeline.nativecode.c.f4928b = true;
        } catch (Error e10) {
            Log.e("riveOnLoad", "Failed to load rive C++ library! Is it properly installed and linked? Is the name correct? (see `CMakeLists.txt`, at `add_library(...)`)", e10);
            throw e10;
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public final List createViewManagers(ReactApplicationContext ctx) {
        Intrinsics.checkNotNullParameter(ctx, "reactContext");
        synchronized (g.f8459a) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            g.f8462d = ctx.getApplicationContext();
            if (!g.f8460b) {
                try {
                    Rive.init$default(Rive.INSTANCE, ctx, null, 2, null);
                    g.f8460b = true;
                    g.f8461c = null;
                } catch (Throwable th2) {
                    g.f8461c = g.a(th2);
                    Log.e("RiveInitializer", "Auto-init failed: " + g.f8461c, th2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RiveViewManager());
        return arrayList;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public final NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public final ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new bl.b(4);
    }
}
