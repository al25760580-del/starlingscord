package com.swmansion.reanimated;

import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.module.annotations.ReactModule;
import com.swmansion.worklets.WorkletsModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = NativeReanimatedModuleSpec.NAME)
public class ReanimatedModule extends NativeReanimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    private NodesManager mNodesManager;
    private ArrayList<UIThreadOperation> mOperations;
    private Runnable mUnsubscribe;
    private final WorkletsModule mWorkletsModule;

    public interface UIThreadOperation {
        void execute(NodesManager nodesManager);
    }

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
        this.mUnsubscribe = new bc.a(8);
        this.mWorkletsModule = (WorkletsModule) reactApplicationContext.getNativeModule(WorkletsModule.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$2(UIManager uIManager) {
        ((FabricUIManager) uIManager).removeUIManagerEventListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$3(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.removeLifecycleEventListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$willDispatchViewUpdates$0(ArrayList arrayList, UIBlockViewResolver uIBlockViewResolver) {
        NodesManager nodesManager = getNodesManager();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((UIThreadOperation) it.next()).execute(nodesManager);
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(@NonNull UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(@NonNull UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(@NonNull UIManager uIManager) {
    }

    public NodesManager getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new NodesManager(getReactApplicationContext(), this.mWorkletsModule);
        }
        return this.mNodesManager;
    }

    public WorkletsModule getWorkletsModule() {
        return this.mWorkletsModule;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        UIManager fabricUIManager = reactApplicationContext.getFabricUIManager();
        if (!(fabricUIManager instanceof FabricUIManager)) {
            throw new RuntimeException("[Reanimated] Failed to obtain instance of FabricUIManager.");
        }
        FabricUIManager fabricUIManager2 = (FabricUIManager) fabricUIManager;
        fabricUIManager2.addUIManagerEventListener(this);
        this.mUnsubscribe = Utils.combineRunnables(this.mUnsubscribe, new com.mkuczera.haptic.a(1, this, fabricUIManager2));
        reactApplicationContext.addLifecycleEventListener(this);
        this.mUnsubscribe = Utils.combineRunnables(this.mUnsubscribe, new com.mkuczera.haptic.a(2, this, reactApplicationContext));
    }

    @Override // com.swmansion.reanimated.NativeReanimatedModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean installTurboModule() {
        JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        boolean z5 = javaScriptContextHolder.getContext() == 0;
        Utils.isChromeDebugger = z5;
        if (z5) {
            Log.w("[REANIMATED]", "Unable to create Reanimated Native Module. You can ignore this message if you are using Chrome Debugger now.");
            return false;
        }
        getNodesManager().initWithContext(getReactApplicationContext());
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.invalidate();
        }
        this.mUnsubscribe.run();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostPause();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostResume();
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(@NonNull UIManager uIManager) {
        if (this.mOperations.isEmpty()) {
            return;
        }
        final ArrayList<UIThreadOperation> arrayList = this.mOperations;
        this.mOperations = new ArrayList<>();
        if (!(uIManager instanceof FabricUIManager)) {
            throw new RuntimeException("[Reanimated] Failed to obtain instance of FabricUIManager.");
        }
        ((FabricUIManager) uIManager).addUIBlock(new UIBlock() { // from class: com.swmansion.reanimated.d
            @Override // com.facebook.react.fabric.interop.UIBlock
            public final void execute(UIBlockViewResolver uIBlockViewResolver) {
                this.f7115a.lambda$willDispatchViewUpdates$0(arrayList, uIBlockViewResolver);
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(@NonNull UIManager uIManager) {
    }
}
