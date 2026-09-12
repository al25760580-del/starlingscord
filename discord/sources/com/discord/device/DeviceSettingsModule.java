package com.discord.device;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import com.discord.codegen.NativeDeviceSettingsModuleSpec;
import com.discord.misc.utilities.activity.ActivityUtilities;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react_rootview.RootViewUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.react.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\rH\u0002J\f\u0010\u000e\u001a\u00020\u0007*\u00020\rH\u0002J\f\u0010\u000f\u001a\u00020\u0007*\u00020\rH\u0003J\f\u0010\t\u001a\u00020\u0007*\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Lcom/discord/device/DeviceSettingsModule;", "Lcom/discord/codegen/NativeDeviceSettingsModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "openPrivacySettings", "", "openNotificationSettings", "openAccessibilitySettings", "setSystemGestureExclusionRects", "rects", "Lcom/facebook/react/bridge/ReadableArray;", "Landroid/content/Context;", "openApplicationDetailSettings", "openApplicationNotificationSettings", "device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceSettingsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSettingsModule.kt\ncom/discord/device/DeviceSettingsModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1563#2:97\n1634#2,3:98\n*S KotlinDebug\n*F\n+ 1 DeviceSettingsModule.kt\ncom/discord/device/DeviceSettingsModule\n*L\n43#1:97\n43#1:98,3\n*E\n"})
public final class DeviceSettingsModule extends NativeDeviceSettingsModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSettingsModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    private final void openApplicationDetailSettings(Context context) {
        ActivityUtilities activityUtilities = ActivityUtilities.INSTANCE;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", new Uri.Builder().scheme("package").opaquePart(context.getPackageName()).build());
        intent.setFlags(268435456);
        Unit unit = Unit.f14616a;
        ActivityUtilities.startActivityAsync$default(activityUtilities, context, intent, null, 4, null);
    }

    private final void openApplicationNotificationSettings(Context context) {
        ActivityUtilities activityUtilities = ActivityUtilities.INSTANCE;
        Intent intentPutExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        ActivityUtilities.startActivityAsync$default(activityUtilities, context, intentPutExtra, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSystemGestureExclusionRects$lambda$2(DeviceSettingsModule deviceSettingsModule, ReadableArray readableArray) {
        RootViewUtils rootViewUtils = RootViewUtils.INSTANCE;
        ReactApplicationContext reactApplicationContext = deviceSettingsModule.getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        IntRange intRangeSizeRange = NativeArrayExtensionsKt.sizeRange(readableArray);
        ArrayList arrayList = new ArrayList(e0.l(intRangeSizeRange, 10));
        Iterator it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            ReadableMap map = readableArray.getMap(((s0) it).nextInt());
            Intrinsics.checkNotNull(map);
            arrayList.add(new Rect(SizeUtilsKt.getDpToPx(map.getInt(ViewProps.LEFT)), SizeUtilsKt.getDpToPx(map.getInt(ViewProps.TOP)), SizeUtilsKt.getDpToPx(map.getInt(ViewProps.RIGHT)), SizeUtilsKt.getDpToPx(map.getInt(ViewProps.BOTTOM))));
        }
        rootViewUtils.setSystemGestureExclusionRects(reactApplicationContext, arrayList);
    }

    @Override // com.discord.codegen.NativeDeviceSettingsModuleSpec
    public void openAccessibilitySettings() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            openAccessibilitySettings(currentActivity);
        }
    }

    @Override // com.discord.codegen.NativeDeviceSettingsModuleSpec
    public void openNotificationSettings() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            openNotificationSettings(currentActivity);
        }
    }

    @Override // com.discord.codegen.NativeDeviceSettingsModuleSpec
    public void openPrivacySettings() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            openApplicationDetailSettings(currentActivity);
        }
    }

    @Override // com.discord.codegen.NativeDeviceSettingsModuleSpec
    public void setSystemGestureExclusionRects(@NotNull ReadableArray rects) {
        Intrinsics.checkNotNullParameter(rects, "rects");
        UiThreadUtil.runOnUiThread(new d(16, this, rects));
    }

    private final void openAccessibilitySettings(Context context) {
        ActivityUtilities activityUtilities = ActivityUtilities.INSTANCE;
        Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        intent.setFlags(268435456);
        Unit unit = Unit.f14616a;
        ActivityUtilities.startActivityAsync$default(activityUtilities, context, intent, null, 4, null);
    }

    private final void openNotificationSettings(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            openApplicationNotificationSettings(context);
        } else {
            openApplicationDetailSettings(context);
        }
    }
}
