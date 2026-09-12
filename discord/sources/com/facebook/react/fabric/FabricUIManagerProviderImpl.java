package com.facebook.react.fabric;

import android.os.Trace;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mo.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;", "Lcom/facebook/react/bridge/UIManagerProvider;", "componentFactory", "Lcom/facebook/react/fabric/ComponentFactory;", "viewManagerRegistry", "Lcom/facebook/react/uimanager/ViewManagerRegistry;", "<init>", "(Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/uimanager/ViewManagerRegistry;)V", "createUIManager", "Lcom/facebook/react/bridge/UIManager;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@rn.d
public final class FabricUIManagerProviderImpl implements UIManagerProvider {

    @NotNull
    private final ComponentFactory componentFactory;

    @NotNull
    private final ViewManagerRegistry viewManagerRegistry;

    public FabricUIManagerProviderImpl(@NotNull ComponentFactory componentFactory, @NotNull ViewManagerRegistry viewManagerRegistry) {
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        Intrinsics.checkNotNullParameter(viewManagerRegistry, "viewManagerRegistry");
        this.componentFactory = componentFactory;
        this.viewManagerRegistry = viewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.UIManagerProvider
    @NotNull
    public UIManager createUIManager(@NotNull ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("FabricUIManagerProviderImpl.create", "sectionName");
        c0.d("FabricUIManagerProviderImpl.create");
        EventBeatManager eventBeatManager = new EventBeatManager();
        Intrinsics.checkNotNullParameter("FabricUIManagerProviderImpl.createUIManager", "sectionName");
        c0.d("FabricUIManagerProviderImpl.createUIManager");
        FabricUIManager fabricUIManager = new FabricUIManager(context, this.viewManagerRegistry, eventBeatManager);
        Trace.endSection();
        Intrinsics.checkNotNullParameter("FabricUIManagerProviderImpl.registerBinding", "sectionName");
        c0.d("FabricUIManagerProviderImpl.registerBinding");
        FabricUIManagerBinding fabricUIManagerBinding = new FabricUIManagerBinding();
        CatalystInstance catalystInstance = context.getCatalystInstance();
        RuntimeExecutor runtimeExecutor = catalystInstance != null ? catalystInstance.getRuntimeExecutor() : null;
        RuntimeScheduler runtimeScheduler = catalystInstance != null ? catalystInstance.getRuntimeScheduler() : null;
        AnimationBackendChoreographer animationBackendChoreographer = new AnimationBackendChoreographer(context);
        if (runtimeExecutor == null || runtimeScheduler == null) {
            throw new IllegalStateException("Unable to register FabricUIManager with CatalystInstance, runtimeExecutor and runtimeScheduler must not be null");
        }
        fabricUIManagerBinding.register(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, this.componentFactory, animationBackendChoreographer);
        Trace.endSection();
        Trace.endSection();
        return fabricUIManager;
    }
}
