package com.discord.misc.utilities.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bc.e;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import java.lang.ref.WeakReference;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\"\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u0014"}, d2 = {"Lcom/discord/misc/utilities/activity/ActivityUtilities;", "", "<init>", "()V", "startActivityForResultAsync", "", "activity", "Landroid/app/Activity;", "intent", "Landroid/content/Intent;", "code", "", "bundle", "Landroid/os/Bundle;", "startActivityForResultAsyncWithFuture", "Ljava/util/concurrent/CompletableFuture;", "startActivityAsync", "context", "Landroid/content/Context;", "startActivityAsyncWithFuture", "misc_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityUtilities.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityUtilities.kt\ncom/discord/misc/utilities/activity/ActivityUtilities\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n*L\n1#1,78:1\n25#2,8:79\n25#2,8:87\n*S KotlinDebug\n*F\n+ 1 ActivityUtilities.kt\ncom/discord/misc/utilities/activity/ActivityUtilities\n*L\n60#1:79,8\n67#1:87,8\n*E\n"})
public final class ActivityUtilities {

    @NotNull
    public static final ActivityUtilities INSTANCE = new ActivityUtilities();

    private ActivityUtilities() {
    }

    public static /* synthetic */ void startActivityAsync$default(ActivityUtilities activityUtilities, Context context, Intent intent, Bundle bundle, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            bundle = null;
        }
        activityUtilities.startActivityAsync(context, intent, bundle);
    }

    public static /* synthetic */ CompletableFuture startActivityAsyncWithFuture$default(ActivityUtilities activityUtilities, Context context, Intent intent, Bundle bundle, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            bundle = null;
        }
        return activityUtilities.startActivityAsyncWithFuture(context, intent, bundle);
    }

    public static /* synthetic */ void startActivityForResultAsync$default(ActivityUtilities activityUtilities, Activity activity, Intent intent, int i7, Bundle bundle, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            bundle = null;
        }
        activityUtilities.startActivityForResultAsync(activity, intent, i7, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startActivityForResultAsync$lambda$0(WeakReference weakReference, Intent intent, int i7, Bundle bundle) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            activity.startActivityForResult(intent, i7, bundle);
        }
    }

    public static /* synthetic */ CompletableFuture startActivityForResultAsyncWithFuture$default(ActivityUtilities activityUtilities, Activity activity, Intent intent, int i7, Bundle bundle, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            bundle = null;
        }
        return activityUtilities.startActivityForResultAsyncWithFuture(activity, intent, i7, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startActivityForResultAsyncWithFuture$lambda$1(WeakReference weakReference, CompletableFuture completableFuture, Intent intent, int i7, Bundle bundle) {
        Activity activity = (Activity) weakReference.get();
        if (activity == null) {
            completableFuture.completeExceptionally(new IllegalStateException("Activity was null"));
            return;
        }
        try {
            activity.startActivityForResult(intent, i7, bundle);
            completableFuture.complete(Unit.f14616a);
        } catch (Exception e10) {
            completableFuture.completeExceptionally(e10);
        }
    }

    public final void startActivityAsync(@NotNull final Context context, @NotNull final Intent intent, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (ThreadUtilsKt.isOnMainThread()) {
            context.startActivity(intent, bundle);
        } else {
            ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.misc.utilities.activity.ActivityUtilities$startActivityAsync$$inlined$postOrRunOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    context.startActivity(intent, bundle);
                }
            });
        }
    }

    @NotNull
    public final CompletableFuture<Unit> startActivityAsyncWithFuture(@NotNull final Context context, @NotNull final Intent intent, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        final CompletableFuture<Unit> completableFuture = new CompletableFuture<>();
        if (!ThreadUtilsKt.isOnMainThread()) {
            ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.misc.utilities.activity.ActivityUtilities$startActivityAsyncWithFuture$$inlined$postOrRunOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        context.startActivity(intent, bundle);
                        completableFuture.complete(Unit.f14616a);
                    } catch (Exception e10) {
                        completableFuture.completeExceptionally(e10);
                    }
                }
            });
            return completableFuture;
        }
        try {
            context.startActivity(intent, bundle);
            completableFuture.complete(Unit.f14616a);
        } catch (Exception e10) {
            completableFuture.completeExceptionally(e10);
        }
        return completableFuture;
    }

    public final void startActivityForResultAsync(@NotNull Activity activity, @NotNull Intent intent, int code, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(intent, "intent");
        activity.runOnUiThread(new e(code, 1, new WeakReference(activity), intent, bundle));
    }

    @NotNull
    public final CompletableFuture<Unit> startActivityForResultAsyncWithFuture(@NotNull Activity activity, @NotNull Intent intent, int code, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(intent, "intent");
        CompletableFuture<Unit> completableFuture = new CompletableFuture<>();
        activity.runOnUiThread(new a(new WeakReference(activity), completableFuture, intent, code, bundle, 0));
        return completableFuture;
    }
}
