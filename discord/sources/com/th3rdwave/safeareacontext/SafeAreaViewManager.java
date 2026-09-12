package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import gn.i;
import gn.j;
import gn.k;
import gn.m;
import gn.n;
import gn.o;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = SafeAreaViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "Lgn/i;", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lgn/i;", "Lgn/o;", "createShadowNodeInstance", "()Lgn/o;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "mode", "", "setMode", "(Lgn/i;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "propList", "setEdges", "(Lgn/i;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "updateState", "(Lcom/facebook/react/views/view/ReactViewGroup;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "Companion", "gn/m", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSafeAreaViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeAreaViewManager.kt\ncom/th3rdwave/safeareacontext/SafeAreaViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class SafeAreaViewManager extends ReactViewManager {

    @NotNull
    public static final m Companion = new m();

    @NotNull
    public static final String REACT_CLASS = "RNCSafeAreaView";

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<o> getShadowNodeClass() {
        return o.class;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    @ReactProp(name = "edges")
    public final void setEdges(@NotNull i view, ReadableMap propList) {
        j jVarValueOf;
        j jVarValueOf2;
        j jVarValueOf3;
        j jVarValueOf4;
        Intrinsics.checkNotNullParameter(view, "view");
        if (propList != null) {
            String string = propList.getString(ViewProps.TOP);
            if (string != null) {
                String upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                jVarValueOf = j.valueOf(upperCase);
                if (jVarValueOf == null) {
                    jVarValueOf = j.f10148d;
                }
            } else {
                jVarValueOf = j.f10148d;
            }
            String string2 = propList.getString(ViewProps.RIGHT);
            if (string2 != null) {
                String upperCase2 = string2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                jVarValueOf2 = j.valueOf(upperCase2);
                if (jVarValueOf2 == null) {
                    jVarValueOf2 = j.f10148d;
                }
            } else {
                jVarValueOf2 = j.f10148d;
            }
            String string3 = propList.getString(ViewProps.BOTTOM);
            if (string3 != null) {
                String upperCase3 = string3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                jVarValueOf3 = j.valueOf(upperCase3);
                if (jVarValueOf3 == null) {
                    jVarValueOf3 = j.f10148d;
                }
            } else {
                jVarValueOf3 = j.f10148d;
            }
            String string4 = propList.getString(ViewProps.LEFT);
            if (string4 != null) {
                String upperCase4 = string4.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                jVarValueOf4 = j.valueOf(upperCase4);
                if (jVarValueOf4 == null) {
                    jVarValueOf4 = j.f10148d;
                }
            } else {
                jVarValueOf4 = j.f10148d;
            }
            view.setEdges(new k(jVarValueOf, jVarValueOf2, jVarValueOf3, jVarValueOf4));
        }
    }

    @ReactProp(name = "mode")
    public final void setMode(@NotNull i view, String mode) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(mode, ViewProps.PADDING)) {
            view.setMode(n.f10159d);
        } else if (Intrinsics.areEqual(mode, ViewProps.MARGIN)) {
            view.setMode(n.f10160e);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(@NotNull ReactViewGroup view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((i) view).setStateWrapper(stateWrapper);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public o createShadowNodeInstance() {
        return new o();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public i createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        i iVar = new i(context);
        iVar.f10143d = n.f10159d;
        return iVar;
    }
}
