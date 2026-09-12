package com.swmansion.rnscreens.gamma.tabs;

import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSTabsHostManagerDelegate;
import com.facebook.react.viewmanagers.RNSTabsHostManagerInterface;
import gn.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;
import vm.c;
import vm.e;
import vm.i;
import vm.k;
import vm.n;
import wm.a;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = TabsHostViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001CB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0002H\u0014¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b(\u0010'J!\u0010*\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b1\u00100J!\u00102\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b2\u00100J!\u00103\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b3\u0010'J!\u00104\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b4\u0010'J!\u00105\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b5\u00100J!\u00106\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b6\u00100J\u001f\u00107\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020,H\u0017¢\u0006\u0004\b7\u0010.J!\u00108\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b8\u0010'J!\u00109\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b9\u0010'J!\u0010:\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b:\u0010'J\u001f\u0010;\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020,H\u0017¢\u0006\u0004\b;\u0010.J!\u0010<\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b<\u0010'J!\u0010=\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)H\u0017¢\u0006\u0004\b=\u0010+J!\u0010>\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b>\u0010'J!\u0010?\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b?\u00100R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lvm/e;", "Lcom/facebook/react/viewmanagers/RNSTabsHostManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lvm/e;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "parent", "Landroid/view/View;", "child", "", "index", "", "addView", "(Lvm/e;Landroid/view/View;I)V", "removeView", "(Lvm/e;Landroid/view/View;)V", "removeViewAt", "(Lvm/e;I)V", "removeAllViews", "(Lvm/e;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lvm/e;)V", "value", "setTabBarBackgroundColor", "(Lvm/e;Ljava/lang/Integer;)V", "setTabBarTintColor", "", "setTabBarItemTitleFontSize", "(Lvm/e;F)V", "", "setControlNavigationStateInJS", "(Lvm/e;Z)V", "setTabBarItemTitleFontFamily", "(Lvm/e;Ljava/lang/String;)V", "setTabBarItemTitleFontWeight", "setTabBarItemTitleFontStyle", "setTabBarItemTitleFontColor", "setTabBarItemIconColor", "setTabBarMinimizeBehavior", "setTabBarControllerMode", "setTabBarHidden", "setNativeContainerBackgroundColor", "setTabBarItemTitleFontColorActive", "setTabBarItemActiveIndicatorColor", "setTabBarItemActiveIndicatorEnabled", "setTabBarItemIconColorActive", "setTabBarItemTitleFontSizeActive", "setTabBarItemRippleColor", "setTabBarItemLabelVisibilityMode", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "vm/i", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabsHostViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabsHostViewManager.kt\ncom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
public final class TabsHostViewManager extends ViewGroupManager<e> implements RNSTabsHostManagerInterface<e> {

    @NotNull
    public static final i Companion = new i();

    @NotNull
    public static final String REACT_CLASS = "RNSTabsHost";

    @NotNull
    private final ViewManagerDelegate<e> delegate;

    public TabsHostViewManager() {
        super(null, 1, null);
        this.delegate = new RNSTabsHostManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<e> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return w0.h(h.G(a.f22345v));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    public void setTabBarControllerMode(@NotNull e view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    public void setTabBarMinimizeBehavior(@NotNull e view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    public void setTabBarTintColor(@NotNull e view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull e view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, view);
        if (view.getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabsHost must have its tag set when registering event emitters");
        }
        ThemedReactContext reactContext2 = view.f21759d;
        int id2 = view.getId();
        Intrinsics.checkNotNullParameter(reactContext2, "reactContext");
        view.setEventEmitter$react_native_screens_release(new vm.h(reactContext2, id2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public e createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new e(reactContext);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(@NotNull e parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ArrayList arrayList = parent.F;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).f21781d.setTabsScreenDelegate$react_native_screens_release(null);
        }
        arrayList.clear();
        c cVar = parent.f21761e;
        cVar.a();
        cVar.b();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull e parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (!(child instanceof k)) {
            throw new IllegalArgumentException("[RNScreens] Attempt to detach child that is not of type javaClass");
        }
        k reactSubview = (k) child;
        parent.getClass();
        Intrinsics.checkNotNullParameter(reactSubview, "reactSubview");
        ArrayList arrayList = parent.F;
        final vm.a aVar = new vm.a(reactSubview, 0);
        boolean zRemoveIf = arrayList.removeIf(new Predicate() { // from class: vm.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) aVar.invoke(obj)).booleanValue();
            }
        });
        Boolean boolValueOf = Boolean.valueOf(zRemoveIf);
        if (!zRemoveIf) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            reactSubview.setTabsScreenDelegate$react_native_screens_release(null);
            c cVar = parent.f21761e;
            cVar.a();
            cVar.b();
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    public void setControlNavigationStateInJS(e view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(customType = "Color", name = "nativeContainerBackgroundColor")
    public void setNativeContainerBackgroundColor(@NotNull e view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNativeContainerBackgroundColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(customType = "Color", name = "tabBarBackgroundColor")
    public void setTabBarBackgroundColor(@NotNull e view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarBackgroundColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(name = "tabBarHidden")
    public void setTabBarHidden(@NotNull e view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarHidden(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemActiveIndicatorColor")
    public void setTabBarItemActiveIndicatorColor(@NotNull e view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemActiveIndicatorColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(name = "tabBarItemActiveIndicatorEnabled")
    public void setTabBarItemActiveIndicatorEnabled(@NotNull e view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemActiveIndicatorEnabled(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemIconColor")
    public void setTabBarItemIconColor(@NotNull e view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemIconColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemIconColorActive")
    public void setTabBarItemIconColorActive(@NotNull e view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemIconColorActive(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(name = "tabBarItemLabelVisibilityMode")
    public void setTabBarItemLabelVisibilityMode(@NotNull e view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemLabelVisibilityMode(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemRippleColor")
    public void setTabBarItemRippleColor(@NotNull e view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemRippleColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemTitleFontColor")
    public void setTabBarItemTitleFontColor(@NotNull e view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemTitleFontColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemTitleFontColorActive")
    public void setTabBarItemTitleFontColorActive(@NotNull e view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemTitleFontColorActive(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(name = "tabBarItemTitleFontFamily")
    public void setTabBarItemTitleFontFamily(@NotNull e view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemTitleFontFamily(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(name = "tabBarItemTitleFontSize")
    public void setTabBarItemTitleFontSize(e view, float value) {
        if (view != null) {
            view.setTabBarItemTitleFontSize(Float.valueOf(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(name = "tabBarItemTitleFontSizeActive")
    public void setTabBarItemTitleFontSizeActive(e view, float value) {
        if (view != null) {
            view.setTabBarItemTitleFontSizeActive(Float.valueOf(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(name = "tabBarItemTitleFontStyle")
    public void setTabBarItemTitleFontStyle(@NotNull e view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemTitleFontStyle(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostManagerInterface
    @ReactProp(name = "tabBarItemTitleFontWeight")
    public void setTabBarItemTitleFontWeight(@NotNull e view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemTitleFontWeight(value);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull e parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof k) {
            k tabsScreen = (k) child;
            parent.getClass();
            Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
            qg.e eVar = parent.f21765w;
            if (index < eVar.getMaxItemCount()) {
                parent.F.add(index, new n(tabsScreen));
                tabsScreen.setTabsScreenDelegate$react_native_screens_release(parent);
                c cVar = parent.f21761e;
                cVar.a();
                cVar.b();
                return;
            }
            throw new IllegalArgumentException(g.c(index, "[RNScreens] Attempt to insert TabsScreen at index ", eVar.getMaxItemCount(), "; BottomNavigationView supports at most ", " items").toString());
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to attach child that is not of type javaClass");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull e parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ((n) parent.F.remove(index)).f21781d.setTabsScreenDelegate$react_native_screens_release(null);
        c cVar = parent.f21761e;
        cVar.a();
        cVar.b();
    }
}
