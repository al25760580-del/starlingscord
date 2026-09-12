package ShiggyXposed.xposed.modules;

import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import ShiggyXposed.xposed.modules.bridge.BridgeModule;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PluginsModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"LShiggyXposed/xposed/modules/PluginsModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", PluginsModule.STATES_FILE, "LShiggyXposed/xposed/modules/PluginStates;", "onContext", "", "context", "Landroid/content/Context;", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class PluginsModule extends Module {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String DATA_DIR = "Shiggy/plugins";

    @Deprecated
    public static final String STATES_FILE = "states";
    private PluginStates states;

    /* JADX INFO: compiled from: PluginsModule.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"LShiggyXposed/xposed/modules/PluginsModule$Companion;", "", "<init>", "()V", "DATA_DIR", "", "STATES_FILE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ShiggyXposed.xposed.Module
    public void onContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final File file = new File(new File(context.getFilesDir(), DATA_DIR), STATES_FILE);
        asFile(file);
        BridgeModule.INSTANCE.registerMethod("Shiggy.plugins.states.read", new Function1() { // from class: ShiggyXposed.xposed.modules.PluginsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PluginsModule.onContext$lambda$5$lambda$2(this.f$0, file, (ArrayList) obj);
            }
        });
        BridgeModule.INSTANCE.registerMethod("Shiggy.plugins.states.write", new Function1() { // from class: ShiggyXposed.xposed.modules.PluginsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PluginsModule.onContext$lambda$5$lambda$4(this.f$0, file, (ArrayList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onContext$lambda$5$lambda$2(PluginsModule pluginsModule, File file, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PluginStates pluginStates = pluginsModule.states;
        if (pluginStates != null) {
            if (pluginStates == null) {
                Intrinsics.throwUninitializedPropertyAccessException(STATES_FILE);
                pluginStates = null;
            }
            return pluginStates.toMap();
        }
        PluginStates pluginStatesLoadFromFileOrNull = PluginStates.INSTANCE.loadFromFileOrNull(file);
        if (pluginStatesLoadFromFileOrNull == null) {
            return null;
        }
        pluginsModule.states = pluginStatesLoadFromFileOrNull;
        return pluginStatesLoadFromFileOrNull.toMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onContext$lambda$5$lambda$4(PluginsModule pluginsModule, File file, ArrayList it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Double>");
        PluginStates pluginStates = new PluginStates((Map) obj);
        pluginStates.saveToFile(file);
        pluginsModule.states = pluginStates;
        return Integer.valueOf(Utils.Log.INSTANCE.i("Plugin states saved: " + file.getAbsolutePath()));
    }
}
