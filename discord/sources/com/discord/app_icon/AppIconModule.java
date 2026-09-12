package com.discord.app_icon;

import com.discord.codegen.NativeAppIconModuleSpec;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/discord/app_icon/AppIconModule;", "Lcom/discord/codegen/NativeAppIconModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getCurrentIcon", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "setIcon", StackTraceHelper.ID_KEY, "", "getAvailableIcons", "app_icon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppIconModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppIconModule.kt\ncom/discord/app_icon/AppIconModule\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,38:1\n11228#2:39\n11563#2,3:40\n*S KotlinDebug\n*F\n+ 1 AppIconModule.kt\ncom/discord/app_icon/AppIconModule\n*L\n33#1:39\n33#1:40,3\n*E\n"})
public final class AppIconModule extends NativeAppIconModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIconModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeAppIconModuleSpec
    public void getAvailableIcons(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        AppIcon[] availableIcons = AppIconUtil.INSTANCE.getAvailableIcons();
        ArrayList arrayList = new ArrayList(availableIcons.length);
        for (AppIcon appIcon : availableIcons) {
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(new Pair(StackTraceHelper.ID_KEY, appIcon.getId())));
        }
        promise.resolve(NativeArrayExtensionsKt.toNativeArray$default(arrayList, null, 1, null));
    }

    @Override // com.discord.codegen.NativeAppIconModuleSpec
    public void getCurrentIcon(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        AppIconUtil appIconUtil = AppIconUtil.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        promise.resolve(NativeMapExtensionsKt.nativeMapOf(new Pair(StackTraceHelper.ID_KEY, appIconUtil.getCurrentAppIcon(reactApplicationContext).getId())));
    }

    @Override // com.discord.codegen.NativeAppIconModuleSpec
    public void setIcon(@NotNull String id2, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            AppIconUtil appIconUtil = AppIconUtil.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            appIconUtil.setAppIcon(reactApplicationContext, id2);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }
}
