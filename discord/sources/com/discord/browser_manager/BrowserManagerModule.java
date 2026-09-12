package com.discord.browser_manager;

import a1.k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.discord.cache.Cache;
import com.discord.chrome_custom_tabs.CustomTabs;
import com.discord.chrome_custom_tabs.TrackedCustomTab;
import com.discord.codegen.NativeBrowserManagerModuleSpec;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J/\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/discord/browser_manager/BrowserManagerModule;", "Lcom/discord/codegen/NativeBrowserManagerModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "getTypedExportedConstants", "", "", "", "selectBrowser", "", "browser", "", "openInChromeURL", "url", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "openInAppURL", "openTrackedCustomTab", "resumeTrackedCustomTab", "openPlayStoreInline", "appId", "onDismiss", "Lcom/facebook/react/bridge/Callback;", "(Ljava/lang/String;Ljava/lang/Double;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Promise;)V", "Companion", "browser_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BrowserManagerModule extends NativeBrowserManagerModuleSpec {

    @NotNull
    private static final String BROWSER_CACHE_KEY = "SELECTED_BROWSER";
    private static final int BROWSER_CHROME = 2;
    private static final int BROWSER_IN_APP = 1;
    private static final int BROWSER_SAFARI = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int PLAY_STORE_INLINE_REQUEST_CODE = 234781;

    @NotNull
    private final ReactApplicationContext reactContext;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/browser_manager/BrowserManagerModule$Companion;", "", "<init>", "()V", "PLAY_STORE_INLINE_REQUEST_CODE", "", "BROWSER_CACHE_KEY", "", "BROWSER_SAFARI", "BROWSER_IN_APP", "BROWSER_CHROME", "browser_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openInAppURL$lambda$1(Promise promise, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        promise.reject(null, e10.getMessage(), e10, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openInChromeURL$lambda$0(Promise promise, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        promise.reject(null, e10.getMessage(), e10, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openPlayStoreInline$lambda$7(Promise promise, BrowserManagerModule browserManagerModule, BrowserManagerModule$openPlayStoreInline$listener$1 browserManagerModule$openPlayStoreInline$listener$1, boolean z5) {
        promise.resolve(Boolean.valueOf(z5));
        if (!z5) {
            browserManagerModule.reactContext.removeActivityEventListener(browserManagerModule$openPlayStoreInline$listener$1);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openPlayStoreInline$lambda$8(BrowserManagerModule browserManagerModule, BrowserManagerModule$openPlayStoreInline$listener$1 browserManagerModule$openPlayStoreInline$listener$1, Promise promise, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        browserManagerModule.reactContext.removeActivityEventListener(browserManagerModule$openPlayStoreInline$listener$1);
        promise.reject(null, e10.getMessage(), e10, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openTrackedCustomTab$lambda$4(Activity activity, String str, Promise promise, BrowserManagerModule browserManagerModule) {
        BrowserManager.INSTANCE.tryOpenTrackedCustomTab(activity, str, new com.discord.age_assurance.c(promise, 4), new e(browserManagerModule, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openTrackedCustomTab$lambda$4$lambda$2(Promise promise, boolean z5) {
        promise.resolve(Boolean.valueOf(z5));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openTrackedCustomTab$lambda$4$lambda$3(BrowserManagerModule browserManagerModule) {
        browserManagerModule.emitOnTrackedCustomTabClosed();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeTrackedCustomTab$lambda$6(Promise promise, BrowserManagerModule browserManagerModule) {
        promise.resolve(Boolean.valueOf(TrackedCustomTab.INSTANCE.reattach(new e(browserManagerModule, 1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resumeTrackedCustomTab$lambda$6$lambda$5(BrowserManagerModule browserManagerModule) {
        browserManagerModule.emitOnTrackedCustomTabClosed();
        return Unit.f14616a;
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.discord.codegen.NativeBrowserManagerModuleSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        int iIntValue;
        Integer intOrNull;
        CustomTabs customTabs = CustomTabs.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        boolean zSupportsCustomTabs = customTabs.supportsCustomTabs(reactApplicationContext);
        String item = Cache.INSTANCE.get().getItem(BROWSER_CACHE_KEY);
        if (item == null || (intOrNull = StringsKt.toIntOrNull(item)) == null) {
            iIntValue = zSupportsCustomTabs ? 1 : 2;
        } else {
            iIntValue = intOrNull.intValue();
        }
        return w0.h(new Pair("selectedBrowser", Integer.valueOf(iIntValue)), new Pair("isChromeInstalled", Boolean.TRUE), new Pair("supportsInAppBrowser", Boolean.valueOf(zSupportsCustomTabs)));
    }

    @Override // com.discord.codegen.NativeBrowserManagerModuleSpec
    public void openInAppURL(@NotNull String url, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BrowserManager browserManager = BrowserManager.INSTANCE;
        Context currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(currentActivity, "getReactApplicationContext(...)");
        }
        browserManager.tryOpenUrlWithCustomTabs(currentActivity, url, new com.discord.age_assurance.c(promise, 6));
    }

    @Override // com.discord.codegen.NativeBrowserManagerModuleSpec
    public void openInChromeURL(@NotNull String url, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BrowserManager browserManager = BrowserManager.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        browserManager.tryOpenUrlExternally(reactApplicationContext, url, new com.discord.age_assurance.c(promise, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.discord.browser_manager.BrowserManagerModule$openPlayStoreInline$listener$1, com.facebook.react.bridge.ActivityEventListener] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.discord.codegen.NativeBrowserManagerModuleSpec
    public void openPlayStoreInline(@NotNull String url, Double appId, @NotNull final Callback onDismiss, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ?? r10 = new ActivityEventListener() { // from class: com.discord.browser_manager.BrowserManagerModule$openPlayStoreInline$listener$1
            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (requestCode == 234781) {
                    this.this$0.getReactContext().removeActivityEventListener(this);
                    onDismiss.invoke(new Object[0]);
                }
            }

            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onNewIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
            }
        };
        this.reactContext.addActivityEventListener(r10);
        BrowserManager.INSTANCE.tryOpenPlayStoreInline(this.reactContext, url, PLAY_STORE_INLINE_REQUEST_CODE, new d(promise, this, (BrowserManagerModule$openPlayStoreInline$listener$1) r10), new d(this, (BrowserManagerModule$openPlayStoreInline$listener$1) r10, promise));
    }

    @Override // com.discord.codegen.NativeBrowserManagerModuleSpec
    public void openTrackedCustomTab(@NotNull String url, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(Boolean.FALSE);
        } else {
            UiThreadUtil.runOnUiThread(new cb.a(2, currentActivity, url, promise, this));
        }
    }

    @Override // com.discord.codegen.NativeBrowserManagerModuleSpec
    public void resumeTrackedCustomTab(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        UiThreadUtil.runOnUiThread(new k(8, promise, this));
    }

    @Override // com.discord.codegen.NativeBrowserManagerModuleSpec
    public void selectBrowser(double browser) {
        int i7 = (int) browser;
        if (i7 == 0) {
            Cache.INSTANCE.get().setItem(BROWSER_CACHE_KEY, "1");
        } else if (i7 == 1 || i7 == 2) {
            Cache.INSTANCE.get().setItem(BROWSER_CACHE_KEY, String.valueOf(i7));
        } else {
            throw new IllegalArgumentException("Unknown browser id provided: " + browser);
        }
    }
}
