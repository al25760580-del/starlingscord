package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0014J&\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0000\u0012\u00020\u0014\u0012\u0006\b\u0000\u0012\u00020\u00140\u00130\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H&¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/BaseReactPackage;", "Lcom/facebook/react/ReactPackage;", "<init>", "()V", "createNativeModules", "", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getModule", StackTraceHelper.NAME_KEY, "", "getNativeModuleIterator", "", "Lcom/facebook/react/bridge/ModuleHolder;", "getNativeModuleIterator$ReactAndroid_release", "getViewManagers", "Lcom/facebook/react/bridge/ModuleSpec;", "createViewManagers", "Lcom/facebook/react/uimanager/ViewManager;", "", "getReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "ModuleHolderProvider", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseReactPackage implements ReactPackage {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/BaseReactPackage$ModuleHolderProvider;", "Ljavax/inject/Provider;", "Lcom/facebook/react/bridge/NativeModule;", StackTraceHelper.NAME_KEY, "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/BaseReactPackage;Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "get", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ModuleHolderProvider implements Provider {

        @NotNull
        private final String name;

        @NotNull
        private final ReactApplicationContext reactContext;
        final /* synthetic */ BaseReactPackage this$0;

        public ModuleHolderProvider(@NotNull BaseReactPackage baseReactPackage, @NotNull String name, ReactApplicationContext reactContext) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            this.this$0 = baseReactPackage;
            this.name = name;
            this.reactContext = reactContext;
        }

        @Override // javax.inject.Provider
        public NativeModule get() {
            return this.this$0.getModule(this.name, this.reactContext);
        }
    }

    @Override // com.facebook.react.ReactPackage
    @NotNull
    @rn.d
    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    @Override // com.facebook.react.ReactPackage
    @NotNull
    public List<ViewManager> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        List<ModuleSpec> viewManagers = getViewManagers(reactContext);
        if (viewManagers == null || viewManagers.isEmpty()) {
            return n0.f14659d;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = viewManagers.iterator();
        while (it.hasNext()) {
            Object obj = it.next().provider().get();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.react.uimanager.ViewManager<*, *>");
            arrayList.add((ViewManager) obj);
        }
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public abstract NativeModule getModule(@NotNull String name, @NotNull ReactApplicationContext reactContext);

    @NotNull
    public final Iterable<ModuleHolder> getNativeModuleIterator$ReactAndroid_release(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new BaseReactPackage$getNativeModuleIterator$$inlined$Iterable$1(getReactModuleInfoProvider().getReactModuleInfos().entrySet().iterator(), this, reactContext);
    }

    @NotNull
    public abstract ReactModuleInfoProvider getReactModuleInfoProvider();

    @NotNull
    public List<ModuleSpec> getViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return n0.f14659d;
    }
}
