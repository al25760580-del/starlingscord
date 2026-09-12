package com.swmansion.rnscreens;

import android.util.Log;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSSearchBarManagerDelegate;
import com.facebook.react.viewmanagers.RNSSearchBarManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = SearchBarManager.REACT_CLASS)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001DB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0017H\u0017¢\u0006\u0004\b \u0010\u001aJ!\u0010\"\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\"\u0010\u0016J!\u0010$\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b$\u0010\u0016J!\u0010%\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b%\u0010\u001eJ!\u0010&\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b&\u0010\u001eJ!\u0010'\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b'\u0010\u001eJ\u001f\u0010)\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0017H\u0017¢\u0006\u0004\b)\u0010\u001aJ\u001b\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020+0*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b.\u0010\u0013J\u0019\u0010/\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b/\u0010\u0013J\u0019\u00100\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b0\u0010\u0013J!\u00102\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00101\u001a\u00020\u0017H\u0016¢\u0006\u0004\b2\u0010\u001aJ#\u00104\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00103\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b4\u0010\u0016J\u0019\u00105\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b5\u0010\u0013J!\u00106\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b6\u0010\u0016J\u001f\u00108\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u0017H\u0016¢\u0006\u0004\b8\u0010\u001aJ!\u00109\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00107\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010\u001aJ#\u0010:\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00107\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b:\u0010\u0016J#\u0010;\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00107\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b;\u0010\u0016J#\u0010<\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00107\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b<\u0010\u0016J#\u0010=\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00107\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b=\u0010\u001eJ\u0017\u0010?\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\tH\u0002¢\u0006\u0004\b?\u0010@R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/swmansion/rnscreens/SearchBarManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/v0;", "Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/v0;", "view", "", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/v0;)V", "autoCapitalize", "setAutoCapitalize", "(Lcom/swmansion/rnscreens/v0;Ljava/lang/String;)V", "", "autoFocus", "setAutoFocus", "(Lcom/swmansion/rnscreens/v0;Z)V", "", ViewProps.COLOR, "setBarTintColor", "(Lcom/swmansion/rnscreens/v0;Ljava/lang/Integer;)V", "disableBackButtonOverride", "setDisableBackButtonOverride", "inputType", "setInputType", "placeholder", "setPlaceholder", "setTextColor", "setHeaderIconColor", "setHintTextColor", "shouldShowHintSearchIcon", "setShouldShowHintSearchIcon", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "blur", "focus", "clearText", "flag", "toggleCancelButton", "text", "setText", "cancelSearch", "setPlacement", "value", "setAllowToolbarIntegration", "setHideWhenScrolling", "setObscureBackground", "setHideNavigationBar", "setCancelButtonText", "setTintColor", "propName", "logNotAvailable", "(Ljava/lang/String;)V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "com/swmansion/rnscreens/o0", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SearchBarManager extends ViewGroupManager<v0> implements RNSSearchBarManagerInterface<v0> {

    @NotNull
    public static final o0 Companion = new o0();

    @NotNull
    public static final String REACT_CLASS = "RNSSearchBar";

    @NotNull
    private final ViewManagerDelegate<v0> delegate;

    public SearchBarManager() {
        super(null, 1, null);
        this.delegate = new RNSSearchBarManagerDelegate(this);
    }

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<v0> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return w0.f(new Pair("topSearchBlur", w0.f(new Pair("registrationName", "onSearchBlur"))), new Pair("topChangeText", w0.f(new Pair("registrationName", "onChangeText"))), new Pair("topClose", w0.f(new Pair("registrationName", "onClose"))), new Pair("topSearchFocus", w0.f(new Pair("registrationName", "onSearchFocus"))), new Pair("topOpen", w0.f(new Pair("registrationName", "onOpen"))), new Pair("topSearchButtonPress", w0.f(new Pair("registrationName", "onSearchButtonPress"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void toggleCancelButton(v0 view, boolean flag) {
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void blur(v0 view) {
        if (view != null) {
            view.f();
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void cancelSearch(v0 view) {
        if (view != null) {
            view.g();
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void clearText(v0 view) {
        if (view != null) {
            view.h();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public v0 createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new v0(context);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void focus(v0 view) {
        if (view != null) {
            view.i();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull v0 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.l();
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setAllowToolbarIntegration(@NotNull v0 view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("allowToolbarIntegration");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r3.equals(com.facebook.react.uimanager.ViewProps.NONE) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r3.equals("systemDefault") != false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @com.facebook.react.uimanager.annotations.ReactProp(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAutoCapitalize(@org.jetbrains.annotations.NotNull com.swmansion.rnscreens.v0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L4a
            int r0 = r3.hashCode()
            switch(r0) {
                case -721225454: goto L39;
                case 3387192: goto L30;
                case 113318569: goto L25;
                case 490141296: goto L1a;
                case 1245424234: goto Lf;
                default: goto Le;
            }
        Le:
            goto L42
        Lf:
            java.lang.String r0 = "characters"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L42
            com.swmansion.rnscreens.p0 r3 = com.swmansion.rnscreens.p0.f7226v
            goto L4c
        L1a:
            java.lang.String r0 = "sentences"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L42
            com.swmansion.rnscreens.p0 r3 = com.swmansion.rnscreens.p0.f7225i
            goto L4c
        L25:
            java.lang.String r0 = "words"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L42
            com.swmansion.rnscreens.p0 r3 = com.swmansion.rnscreens.p0.f7224e
            goto L4c
        L30:
            java.lang.String r0 = "none"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L42
            goto L4a
        L39:
            java.lang.String r0 = "systemDefault"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L42
            goto L4a
        L42:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden auto capitalize value passed"
            r2.<init>(r3)
            throw r2
        L4a:
            com.swmansion.rnscreens.p0 r3 = com.swmansion.rnscreens.p0.f7223d
        L4c:
            r2.setAutoCapitalize(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setAutoCapitalize(com.swmansion.rnscreens.v0, java.lang.String):void");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(name = "autoFocus")
    public void setAutoFocus(@NotNull v0 view, boolean autoFocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAutoFocus(autoFocus);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(customType = "Color", name = "barTintColor")
    public void setBarTintColor(@NotNull v0 view, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTintColor(color);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setCancelButtonText(v0 view, String value) {
        logNotAvailable("cancelButtonText");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(name = "disableBackButtonOverride")
    public void setDisableBackButtonOverride(@NotNull v0 view, boolean disableBackButtonOverride) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldOverrideBackButton(!disableBackButtonOverride);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(customType = "Color", name = "headerIconColor")
    public void setHeaderIconColor(@NotNull v0 view, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHeaderIconColor(color);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setHideNavigationBar(v0 view, String value) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setHideWhenScrolling(v0 view, boolean value) {
        logNotAvailable("hideWhenScrolling");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(customType = "Color", name = "hintTextColor")
    public void setHintTextColor(@NotNull v0 view, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHintTextColor(color);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r3.equals("text") != false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @com.facebook.react.uimanager.annotations.ReactProp(name = "inputType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setInputType(@org.jetbrains.annotations.NotNull com.swmansion.rnscreens.v0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L41
            int r0 = r3.hashCode()
            switch(r0) {
                case -1034364087: goto L2e;
                case 3556653: goto L25;
                case 96619420: goto L1a;
                case 106642798: goto Lf;
                default: goto Le;
            }
        Le:
            goto L39
        Lf:
            java.lang.String r0 = "phone"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.s0 r3 = com.swmansion.rnscreens.u0.f7235e
            goto L43
        L1a:
            java.lang.String r0 = "email"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.q0 r3 = com.swmansion.rnscreens.u0.f7237v
            goto L43
        L25:
            java.lang.String r0 = "text"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            goto L41
        L2e:
            java.lang.String r0 = "number"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.r0 r3 = com.swmansion.rnscreens.u0.f7236i
            goto L43
        L39:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden input type value"
            r2.<init>(r3)
            throw r2
        L41:
            com.swmansion.rnscreens.t0 r3 = com.swmansion.rnscreens.u0.f7234d
        L43:
            r2.setInputType(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setInputType(com.swmansion.rnscreens.v0, java.lang.String):void");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setObscureBackground(v0 view, String value) {
        logNotAvailable("obscureBackground");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(name = "placeholder")
    public void setPlaceholder(@NotNull v0 view, String placeholder) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (placeholder != null) {
            view.setPlaceholder(placeholder);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setPlacement(@NotNull v0 view, String placeholder) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("setPlacement");
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(name = "shouldShowHintSearchIcon")
    public void setShouldShowHintSearchIcon(@NotNull v0 view, boolean shouldShowHintSearchIcon) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldShowHintSearchIcon(shouldShowHintSearchIcon);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setText(v0 view, String text) {
        if (view != null) {
            view.j(text);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    @ReactProp(customType = "Color", name = "textColor")
    public void setTextColor(@NotNull v0 view, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTextColor(color);
    }

    @Override // com.facebook.react.viewmanagers.RNSSearchBarManagerInterface
    public void setTintColor(v0 view, Integer value) {
        logNotAvailable("tintColor");
    }
}
