package com.discord.deep_link;

import am.c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.activity.ActivityUtilities;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/deep_link/DeepLinks;", "", "<init>", "()V", "initialUrl", "Lkotlin/Pair;", "", "", "getInitialUrl", "getDeepLinkDestinationWithAppsFlyerParam", "deepLinkDestination", DeepLinksKt.FROM_APPSFLYER_PARAM, "init", "", "context", "Landroid/content/Context;", "deep_link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeepLinks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinks.kt\ncom/discord/deep_link/DeepLinks\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,137:1\n29#2:138\n*S KotlinDebug\n*F\n+ 1 DeepLinks.kt\ncom/discord/deep_link/DeepLinks\n*L\n29#1:138\n*E\n"})
public final class DeepLinks {

    @NotNull
    public static final DeepLinks INSTANCE = new DeepLinks();
    private static Pair<String, Boolean> initialUrl;

    /* JADX INFO: renamed from: com.discord.deep_link.DeepLinks$init$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/discord/deep_link/DeepLinks$init$2", "Lcom/appsflyer/deeplink/DeepLinkListener;", "onDeepLinking", "", "deepLinkResult", "Lcom/appsflyer/deeplink/DeepLinkResult;", "deep_link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeepLinks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinks.kt\ncom/discord/deep_link/DeepLinks$init$2\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,137:1\n29#2:138\n29#2:139\n*S KotlinDebug\n*F\n+ 1 DeepLinks.kt\ncom/discord/deep_link/DeepLinks$init$2\n*L\n106#1:138\n118#1:139\n*E\n"})
    public static final class AnonymousClass2 implements DeepLinkListener {
        final /* synthetic */ Context $context;

        public AnonymousClass2(Context context) {
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDeepLinking$lambda$1(Throwable th2) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            Intrinsics.checkNotNull(th2);
            CrashReporting.captureException$default(crashReporting, th2, false, 2, null);
            return Unit.f14616a;
        }

        @Override // com.appsflyer.deeplink.DeepLinkListener
        public void onDeepLinking(DeepLinkResult deepLinkResult) {
            DeepLink deepLink;
            boolean zAreEqual;
            boolean z5;
            Intrinsics.checkNotNullParameter(deepLinkResult, "deepLinkResult");
            if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND && (deepLink = deepLinkResult.getDeepLink()) != null) {
                String deepLinkValue = deepLink.getDeepLinkValue();
                if (deepLinkValue != null) {
                    zAreEqual = Intrinsics.areEqual(deepLink.isDeferred(), Boolean.TRUE);
                    z5 = true;
                } else {
                    String stringValue = deepLink.getStringValue("link");
                    if (stringValue == null) {
                        stringValue = null;
                    }
                    deepLinkValue = stringValue != null ? stringValue : null;
                    zAreEqual = false;
                    z5 = false;
                }
                if (deepLinkValue != null && Uri.parse(deepLinkValue).getQueryParameter(DeepLinksKt.FROM_APPSFLYER_PARAM) == null) {
                    String deepLinkDestinationWithAppsFlyerParam = DeepLinks.INSTANCE.getDeepLinkDestinationWithAppsFlyerParam(deepLinkValue, z5);
                    if (DeepLinks.initialUrl == null) {
                        DeepLinks.initialUrl = new Pair(deepLinkDestinationWithAppsFlyerParam, Boolean.valueOf(zAreEqual));
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(deepLinkDestinationWithAppsFlyerParam));
                    Context context = this.$context;
                    intent.addFlags(268435456);
                    intent.setPackage(context.getPackageName());
                    ActivityUtilities.startActivityAsyncWithFuture$default(ActivityUtilities.INSTANCE, this.$context, intent, null, 4, null).exceptionally((Function) new a());
                }
            }
        }
    }

    private DeepLinks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDeepLinkDestinationWithAppsFlyerParam(String deepLinkDestination, boolean fromAppsFlyer) {
        Uri.Builder builderBuildUpon = Uri.parse(deepLinkDestination).buildUpon();
        Uri uriBuild = builderBuildUpon.build();
        builderBuildUpon.clearQuery();
        for (String str : uriBuild.getQueryParameterNames()) {
            if (!Intrinsics.areEqual(str, DeepLinksKt.FROM_APPSFLYER_PARAM)) {
                Iterator<String> it = uriBuild.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        builderBuildUpon.appendQueryParameter(DeepLinksKt.FROM_APPSFLYER_PARAM, fromAppsFlyer ? "true" : "false");
        String string = builderBuildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(ScheduledExecutorService scheduledExecutorService) {
        try {
            if (AppsFlyerLib.getInstance() == null) {
                CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Retry: Unable to get AppsFlyer instance", null, null, null, false, 30, null);
            } else {
                CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Retry: AppsFlyer instance found", null, null, null, false, 30, null);
            }
            CrashReporting.captureMessage$default(CrashReporting.INSTANCE, DeepLinksKt.LOG_TAG, "AppsFlyer instance not found when calling init", null, 4, null);
        } finally {
            scheduledExecutorService.shutdown();
        }
    }

    public final Pair<String, Boolean> getInitialUrl() {
        return initialUrl;
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        if (appsFlyerLib == null) {
            CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Initial attempt: Unable to get AppsFlyer instance", null, null, null, false, 30, null);
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new c(9, scheduledExecutorServiceNewSingleThreadScheduledExecutor), 2L, TimeUnit.SECONDS);
        } else {
            appsFlyerLib.subscribeForDeepLink(new AnonymousClass2(context));
            appsFlyerLib.init(BuildConfig.APPSFLYER_KEY, null, context);
            appsFlyerLib.start(context);
        }
    }
}
