package com.swmansion.rnscreens.safearea;

import androidx.core.view.l0;
import androidx.core.view.u0;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSSafeAreaViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSSafeAreaViewManagerInterface;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ym.a;
import ym.d;
import ym.e;
import zm.b;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = SafeAreaViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001(B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/swmansion/rnscreens/safearea/SafeAreaViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lym/d;", "Lcom/facebook/react/viewmanagers/RNSSafeAreaViewManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lym/d;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Lzm/b;", "createShadowNodeInstance", "()Lzm/b;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "Lcom/facebook/react/bridge/ReadableMap;", "value", "", "setEdges", "(Lym/d;Lcom/facebook/react/bridge/ReadableMap;)V", "setInsetType", "(Lym/d;Ljava/lang/String;)V", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "updateState", "(Lym/d;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "ym/e", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeAreaViewManager extends ViewGroupManager<d> implements RNSSafeAreaViewManagerInterface<d> {

    @NotNull
    public static final e Companion = new e();

    @NotNull
    public static final String REACT_CLASS = "RNSSafeAreaView";

    @NotNull
    private final ViewManagerDelegate<d> delegate;

    public SafeAreaViewManager() {
        super(null, 1, null);
        this.delegate = new RNSSafeAreaViewManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<d> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public d createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        d dVar = new d(reactContext);
        dVar.f23405d = new WeakReference(null);
        a aVar = a.f23396e;
        dVar.f23406e = aVar;
        dVar.f23407i = aVar;
        dVar.f23411y = ym.b.f23401d;
        WeakHashMap weakHashMap = u0.f1729a;
        l0.m(dVar, dVar);
        return dVar;
    }

    @Override // com.facebook.react.viewmanagers.RNSSafeAreaViewManagerInterface
    @ReactProp(name = "edges")
    public void setEdges(@NotNull d view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        zm.a aVar = value != null ? new zm.a(value.getBoolean(ViewProps.LEFT), value.getBoolean(ViewProps.TOP), value.getBoolean(ViewProps.RIGHT), value.getBoolean(ViewProps.BOTTOM)) : null;
        if (aVar != null) {
            view.setEdges(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r4.equals("all") != false) goto L21;
     */
    @Override // com.facebook.react.viewmanagers.RNSSafeAreaViewManagerInterface
    @com.facebook.react.uimanager.annotations.ReactProp(name = "insetType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setInsetType(@org.jetbrains.annotations.NotNull ym.d r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto L45
            int r0 = r4.hashCode()
            r1 = -887328209(0xffffffffcb1c722f, float:-1.0252847E7)
            if (r0 == r1) goto L2e
            r1 = 96673(0x179a1, float:1.35468E-40)
            if (r0 == r1) goto L25
            r1 = 502623545(0x1df56d39, float:6.4963894E-21)
            if (r0 != r1) goto L39
            java.lang.String r0 = "interface"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L39
            ym.b r4 = ym.b.f23403i
            goto L47
        L25:
            java.lang.String r0 = "all"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L39
            goto L45
        L2e:
            java.lang.String r0 = "system"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L39
            ym.b r4 = ym.b.f23402e
            goto L47
        L39:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r0 = "Unknown inset type "
            java.lang.String r4 = r0.concat(r4)
            r3.<init>(r4)
            throw r3
        L45:
            ym.b r4 = ym.b.f23401d
        L47:
            r3.setInsetType(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.safearea.SafeAreaViewManager.setInsetType(ym.d, java.lang.String):void");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(@NotNull d view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public b createShadowNodeInstance() {
        return new b();
    }
}
