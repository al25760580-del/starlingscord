package com.swmansion.rnscreens.gamma.tabs;

import android.content.Context;
import android.net.Uri;
import c9.a;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSTabsScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface;
import gn.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import ls.d;
import org.jetbrains.annotations.NotNull;
import s0.g;
import vm.k;
import vm.m;
import vm.o;
import wm.b;
import xm.c;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = TabsScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001FB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b%\u0010!J#\u0010&\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010$J#\u0010'\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b'\u0010!J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0017¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010!J!\u0010,\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b,\u0010!J!\u0010-\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010!J\u001f\u0010.\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0016¢\u0006\u0004\b.\u0010*J!\u0010/\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0017¢\u0006\u0004\b/\u0010$J\u001f\u00100\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0016¢\u0006\u0004\b0\u0010*J#\u00101\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b1\u0010!J#\u00102\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b2\u0010!J#\u00103\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b3\u0010!J#\u00104\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b4\u0010!J!\u00105\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b5\u0010!J!\u00106\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b6\u0010!J!\u00107\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b7\u0010\u001fJ!\u00108\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b8\u0010!J!\u00109\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b9\u0010!J!\u0010:\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b:\u0010!J!\u0010;\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b;\u0010!J!\u0010<\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0017¢\u0006\u0004\b<\u0010$R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabsScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lvm/k;", "Lcom/facebook/react/viewmanagers/RNSTabsScreenManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lvm/k;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lvm/k;)V", "Lcom/facebook/react/bridge/Dynamic;", "value", "setStandardAppearance", "(Lvm/k;Lcom/facebook/react/bridge/Dynamic;)V", "setScrollEdgeAppearance", "", "setTabBarItemBadgeBackgroundColor", "(Lvm/k;Ljava/lang/Integer;)V", "setIconType", "(Lvm/k;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "setIconImageSource", "(Lvm/k;Lcom/facebook/react/bridge/ReadableMap;)V", "setIconResourceName", "setSelectedIconImageSource", "setSelectedIconResourceName", "", "setIsFocused", "(Lvm/k;Z)V", "setTabKey", "setBadgeValue", "setTitle", "setIsTitleUndefined", "setSpecialEffects", "setOverrideScrollViewContentInsetAdjustmentBehavior", "setBottomScrollEdgeEffect", "setLeftScrollEdgeEffect", "setRightScrollEdgeEffect", "setTopScrollEdgeEffect", "setTabBarItemTestID", "setTabBarItemAccessibilityLabel", "setTabBarItemBadgeTextColor", "setDrawableIconResourceName", "setOrientation", "setSystemItem", "setUserInterfaceStyle", "setImageIconResource", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "setContext", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "Companion", "vm/o", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TabsScreenViewManager extends ViewGroupManager<k> implements RNSTabsScreenManagerInterface<k> {

    @NotNull
    public static final o Companion = new o();

    @NotNull
    public static final String REACT_CLASS = "RNSTabsScreen";
    private ThemedReactContext context;

    @NotNull
    private final ViewManagerDelegate<k> delegate;

    public TabsScreenViewManager() {
        super(null, 1, null);
        this.delegate = new RNSTabsScreenManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public k createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(REACT_CLASS, "tag");
        Intrinsics.checkNotNullParameter("createViewInstance", "message");
        return new k(reactContext);
    }

    public final ThemedReactContext getContext() {
        return this.context;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<k> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return w0.h(h.G(b.f22351v), h.G(b.f22349e), h.G(b.f22352w), h.G(b.f22350i));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    public final void setContext(ThemedReactContext themedReactContext) {
        this.context = themedReactContext;
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setIsTitleUndefined(@NotNull k view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setOrientation(@NotNull k view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setOverrideScrollViewContentInsetAdjustmentBehavior(@NotNull k view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setScrollEdgeAppearance(@NotNull k view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setStandardAppearance(@NotNull k view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setSystemItem(@NotNull k view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setUserInterfaceStyle(@NotNull k view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull k view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, view);
        if (view.getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabsScreen must have its tag set when registering event emitters");
        }
        ThemedReactContext reactContext2 = view.f21774d;
        int id2 = view.getId();
        Intrinsics.checkNotNullParameter(reactContext2, "reactContext");
        view.setEventEmitter$react_native_screens_release(new m(reactContext2, id2));
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    @ReactProp(name = "badgeValue")
    public void setBadgeValue(@NotNull k view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBadgeValue(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setBottomScrollEdgeEffect(k view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    @ReactProp(name = "drawableIconResourceName")
    public void setDrawableIconResourceName(@NotNull k view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDrawableIconResourceName(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setIconImageSource(k view, ReadableMap value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setIconResourceName(k view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setIconType(k view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    @ReactProp(name = "imageIconResource")
    public void setImageIconResource(@NotNull k view, ReadableMap value) {
        Uri uriL;
        String scheme;
        Intrinsics.checkNotNullParameter(view, "view");
        String uri = value != null ? value.getString("uri") : null;
        if (uri != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                uriL = Uri.parse(uri);
                if (uriL.getScheme() == null) {
                    uriL = d.l(context, uri);
                }
            } catch (Exception unused) {
                uriL = d.l(context, uri);
            }
            if ((uriL == null || (scheme = uriL.getScheme()) == null) ? false : x.o(scheme, "res", false)) {
                Intrinsics.checkNotNull(uriL);
                String string = uriL.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                uriL = Uri.parse(x.l(string, "res:/", g.e("android.resource://", context.getPackageName(), "/"), false));
            }
            if (uriL == null) {
                return;
            }
            a.s().a(ImageRequestBuilder.d(uriL).a(), context, null, null, null).d(new c(context, new vm.a(view, 1), uriL), l8.a.f14971d);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    @ReactProp(name = "isFocused")
    public void setIsFocused(@NotNull k view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        String message = "TabsScreen [" + view.getId() + "] setIsFocused " + value;
        Intrinsics.checkNotNullParameter(REACT_CLASS, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        view.setFocusedTab(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setLeftScrollEdgeEffect(k view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setRightScrollEdgeEffect(k view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setSelectedIconImageSource(k view, ReadableMap value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setSelectedIconResourceName(k view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    @ReactProp(name = "specialEffects")
    public void setSpecialEffects(@NotNull k view, ReadableMap value) {
        boolean z5;
        ReadableMap map;
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z6 = true;
        if (!(value != null ? value.hasKey("repeatedTabSelection") : false) || (map = value.getMap("repeatedTabSelection")) == null) {
            z5 = true;
        } else {
            z5 = map.hasKey("scrollToTop") ? map.getBoolean("scrollToTop") : true;
            if (map.hasKey("popToRoot")) {
                z6 = map.getBoolean("popToRoot");
            }
        }
        view.setShouldUseRepeatedTabSelectionPopToRootSpecialEffect(z6);
        view.setShouldUseRepeatedTabSelectionScrollToTopSpecialEffect(z5);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    @ReactProp(name = "tabBarItemAccessibilityLabel")
    public void setTabBarItemAccessibilityLabel(@NotNull k view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemAccessibilityLabel(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemBadgeBackgroundColor")
    public void setTabBarItemBadgeBackgroundColor(@NotNull k view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemBadgeBackgroundColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemBadgeTextColor")
    public void setTabBarItemBadgeTextColor(@NotNull k view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemBadgeTextColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    @ReactProp(name = "tabBarItemTestID")
    public void setTabBarItemTestID(@NotNull k view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemTestID(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    @ReactProp(name = "tabKey")
    public void setTabKey(@NotNull k view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabKey(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    @ReactProp(name = AlertFragment.ARG_TITLE)
    public void setTitle(@NotNull k view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabTitle(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenManagerInterface
    public void setTopScrollEdgeEffect(k view, String value) {
    }
}
