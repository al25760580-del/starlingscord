package com.discord.appreview;

import android.app.Activity;
import android.content.Context;
import bc.i;
import com.discord.logging.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewManager;
import e4.r;
import ig.h;
import ig.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yh.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0016\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/appreview/AppRatingRequester;", "", "activity", "Landroid/app/Activity;", "useFakeReviewManager", "", "onComplete", "Lkotlin/Function0;", "", "onFailure", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Landroid/app/Activity;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "executeRequest", "createReviewManager", "Lcom/google/android/play/core/review/ReviewManager;", "fake", "Companion", "app_review_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppRatingRequester {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "AppRatingRequester";

    @NotNull
    private final Activity activity;

    @NotNull
    private final Function0<Unit> onComplete;

    @NotNull
    private final Function1<Exception, Unit> onFailure;
    private final boolean useFakeReviewManager;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/discord/appreview/AppRatingRequester$Companion;", "", "<init>", "()V", "TAG", "", "app_review_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppRatingRequester(@NotNull Activity activity, boolean z5, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super Exception, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        this.activity = activity;
        this.useFakeReviewManager = z5;
        this.onComplete = onComplete;
        this.onFailure = onFailure;
    }

    private final ReviewManager createReviewManager(boolean fake, Activity activity) {
        if (fake) {
            return new r(3, activity);
        }
        Context applicationContext = activity.getApplicationContext();
        if (applicationContext != null) {
            activity = applicationContext;
        }
        r rVar = new r(new f(activity));
        Intrinsics.checkNotNullExpressionValue(rVar, "create(...)");
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeRequest$lambda$1(ReviewManager reviewManager, AppRatingRequester appRatingRequester, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.m()) {
            Log.i$default(Log.INSTANCE, TAG, "review flow request succeeded; launching", (Throwable) null, 4, (Object) null);
            l lVarO = reviewManager.o(appRatingRequester.activity, (yh.b) task.i());
            Intrinsics.checkNotNullExpressionValue(lVarO, "launchReviewFlow(...)");
            lVarO.addOnCompleteListener(new b(appRatingRequester));
            return;
        }
        Exception excH = task.h();
        yh.a aVar = excH instanceof yh.a ? (yh.a) excH : null;
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f23289d.f5936d) : null;
        Log.INSTANCE.w(TAG, "review flow request failed (errorCode=" + numValueOf + ")", excH);
        Function1<Exception, Unit> function1 = appRatingRequester.onFailure;
        if (excH == null) {
            excH = new Exception("Unknown error");
        }
        function1.invoke(excH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeRequest$lambda$1$lambda$0(AppRatingRequester appRatingRequester, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Log.i$default(Log.INSTANCE, TAG, "launch review flow completed (display not reported by API)", (Throwable) null, 4, (Object) null);
        appRatingRequester.onComplete.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeRequest$lambda$2(AppRatingRequester appRatingRequester) {
        Log.w$default(Log.INSTANCE, TAG, "review flow request canceled", (Throwable) null, 4, (Object) null);
        appRatingRequester.onFailure.invoke(new Exception("Request was canceled"));
    }

    public final void executeRequest() {
        ReviewManager reviewManagerCreateReviewManager = createReviewManager(this.useFakeReviewManager, this.activity);
        Log.i$default(Log.INSTANCE, TAG, "requesting review flow (fake=" + this.useFakeReviewManager + ")", (Throwable) null, 4, (Object) null);
        l lVarP = reviewManagerCreateReviewManager.p();
        Intrinsics.checkNotNullExpressionValue(lVarP, "requestReviewFlow(...)");
        lVarP.addOnCompleteListener(new i(3, reviewManagerCreateReviewManager, this));
        lVarP.a(h.f11764a, new b(this));
    }
}
