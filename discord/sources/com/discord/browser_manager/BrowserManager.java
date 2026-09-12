package com.discord.browser_manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import ar.u;
import co.s;
import com.discord.chrome_custom_tabs.CustomTabs;
import com.discord.chrome_custom_tabs.TrackedCustomTab;
import com.discord.misc.utilities.activity.ActivityUtilities;
import com.discord.theme.R;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import xq.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JS\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\b2\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010#\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!¢\u0006\u0004\b#\u0010$J5\u0010%\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b%\u0010\u001dJQ\u0010&\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\b2\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b&\u0010\u001b¨\u0006'"}, d2 = {"Lcom/discord/browser_manager/BrowserManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "onFailure", "openUrlWithCustomTabs", "(Landroid/content/Context;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V", "", "forceExternal", "openUrlExternally", "(Landroid/content/Context;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Z)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "url", "", "requestCode", "onStarted", "openPlayStoreInline", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "tryOpenUrlWithCustomTabs", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", "activity", "onLaunched", "Lkotlin/Function0;", "onClosed", "tryOpenTrackedCustomTab", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "tryOpenUrlExternally", "tryOpenPlayStoreInline", "browser_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrowserManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrowserManager.kt\ncom/discord/browser_manager/BrowserManager\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,175:1\n29#2:176\n29#2:177\n29#2:178\n29#2:179\n*S KotlinDebug\n*F\n+ 1 BrowserManager.kt\ncom/discord/browser_manager/BrowserManager\n*L\n25#1:176\n51#1:177\n73#1:178\n146#1:179\n*E\n"})
public final class BrowserManager {

    @NotNull
    public static final BrowserManager INSTANCE = new BrowserManager();

    private BrowserManager() {
    }

    private final void openPlayStoreInline(ReactApplicationContext reactContext, String url, int requestCode, Function1<? super Boolean, Unit> onStarted, Function1<? super Exception, Unit> onFailure) {
        Uri uri = Uri.parse(url);
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            tryOpenUrlExternally(reactContext, url, onFailure);
            onStarted.invoke(Boolean.FALSE);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(uri);
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", currentActivity.getPackageName());
        ActivityUtilities.startActivityForResultAsyncWithFuture$default(ActivityUtilities.INSTANCE, currentActivity, intent, requestCode, null, 8, null).whenComplete((BiConsumer) new c(0, new b(reactContext, url, onFailure, onStarted, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openPlayStoreInline$lambda$4(ReactApplicationContext reactApplicationContext, String str, Function1 function1, Function1 function2, Unit unit, Throwable th2) throws Throwable {
        if (th2 == null) {
            function2.invoke(Boolean.TRUE);
        } else {
            if (th2 instanceof Error) {
                throw th2;
            }
            INSTANCE.tryOpenUrlExternally(reactApplicationContext, str, function1);
            function2.invoke(Boolean.FALSE);
        }
        return Unit.f14616a;
    }

    private final void openUrlExternally(Context context, Uri uri, Function1<? super Exception, Unit> onFailure, boolean forceExternal) {
        Intent intentAddFlags = new Intent("android.intent.action.VIEW", uri).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        if (forceExternal) {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intentAddFlags, 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
            intentAddFlags.setPackage((String) r.j(r.h(r.o(CollectionsKt.C(listQueryIntentActivities), new u(20)), new s(1, context))));
        }
        ActivityUtilities.startActivityAsyncWithFuture$default(ActivityUtilities.INSTANCE, context, intentAddFlags, null, 4, null).exceptionally((Function) new a(onFailure, 0));
    }

    public static /* synthetic */ void openUrlExternally$default(BrowserManager browserManager, Context context, Uri uri, Function1 function1, boolean z5, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            z5 = true;
        }
        browserManager.openUrlExternally(context, uri, function1, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUrlExternally$lambda$1(ResolveInfo resolveInfo) {
        return resolveInfo.activityInfo.packageName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean openUrlExternally$lambda$2(Context context, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !Intrinsics.areEqual(it, context.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openUrlExternally$lambda$3(Function1 function1, Throwable th2) throws Throwable {
        if (th2 instanceof Error) {
            throw th2;
        }
        function1.invoke(new Exception(th2));
        return Unit.f14616a;
    }

    private final void openUrlWithCustomTabs(Context context, Uri uri, Function1<? super Exception, Unit> onFailure) {
        CustomTabs.openUrlWithCustomTabs$default(CustomTabs.INSTANCE, context, uri, false, ColorUtilsKt.getThemeColor(context, R.color.white, R.color.primary_600), null, null, null, null, onFailure, 244, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tryOpenUrlWithCustomTabs$lambda$0(Context context, String str, Function1 function1, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.tryOpenUrlExternally(context, str, function1);
        return Unit.f14616a;
    }

    public final void tryOpenPlayStoreInline(@NotNull ReactApplicationContext context, @NotNull String url, int requestCode, @NotNull Function1<? super Boolean, Unit> onStarted, @NotNull Function1<? super Exception, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        try {
            openPlayStoreInline(context, url, requestCode, onStarted, onFailure);
        } catch (Exception unused) {
            tryOpenUrlExternally(context, url, onFailure);
            onStarted.invoke(Boolean.FALSE);
        }
    }

    public final void tryOpenTrackedCustomTab(@NotNull Activity activity, @NotNull String url, @NotNull Function1<? super Boolean, Unit> onLaunched, @NotNull Function0<Unit> onClosed) {
        Function1<? super Boolean, Unit> function1;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onLaunched, "onLaunched");
        Intrinsics.checkNotNullParameter(onClosed, "onClosed");
        try {
            function1 = onLaunched;
            try {
                TrackedCustomTab.INSTANCE.launch(activity, Uri.parse(url), ColorUtilsKt.getThemeColor(activity, R.color.white, R.color.primary_600), function1, onClosed);
            } catch (Exception unused) {
                function1.invoke(Boolean.FALSE);
            }
        } catch (Exception unused2) {
            function1 = onLaunched;
        }
    }

    public final void tryOpenUrlExternally(@NotNull Context context, @NotNull String url, @NotNull Function1<? super Exception, Unit> onFailure) {
        Function1<? super Exception, Unit> function1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        try {
            function1 = onFailure;
            try {
                openUrlExternally$default(this, context, Uri.parse(url), function1, false, 8, null);
            } catch (Exception e10) {
                e = e10;
                function1.invoke(e);
            }
        } catch (Exception e11) {
            e = e11;
            function1 = onFailure;
        }
    }

    public final void tryOpenUrlWithCustomTabs(@NotNull Context context, @NotNull String url, @NotNull Function1<? super Exception, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        try {
            openUrlWithCustomTabs(context, Uri.parse(url), new com.discord.age_assurance.a(context, url, onFailure, 1));
        } catch (Exception unused) {
            tryOpenUrlExternally(context, url, onFailure);
        }
    }
}
