package com.discord.notifications.service.utils;

import a1.k;
import com.discord.logging.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import hm.a;
import ig.g;
import ig.h;
import ig.l;
import ji.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ue.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/discord/notifications/service/utils/FCMTokenHelper;", "", "<init>", "()V", "", "", "logError", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "", "onToken", "getToken", "(Lkotlin/jvm/functions/Function1;)V", "notification_service_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FCMTokenHelper {

    @NotNull
    public static final FCMTokenHelper INSTANCE = new FCMTokenHelper();

    private FCMTokenHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$0(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        INSTANCE.logError(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$1(Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            String str = (String) task.i();
            if (str != null && task.m()) {
                function1.invoke(str);
                return;
            }
            Exception excH = task.h();
            if (excH != null) {
                INSTANCE.logError(excH);
            }
        } catch (Exception e10) {
            INSTANCE.logError(e10);
        }
    }

    private final void logError(Throwable th2) {
        Log log = Log.INSTANCE;
        String simpleName = th2.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        log.w(simpleName, "Fetching FCM registration token failed", th2);
    }

    public final void getToken(@NotNull Function1<? super String, Unit> onToken) {
        FirebaseMessaging firebaseMessaging;
        Intrinsics.checkNotNullParameter(onToken, "onToken");
        try {
            i iVar = FirebaseMessaging.k;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(f.b());
            }
            firebaseMessaging.getClass();
            g gVar = new g();
            firebaseMessaging.f6536f.execute(new k(28, firebaseMessaging, gVar));
            l lVar = gVar.f11763a;
            a aVar = new a(7);
            lVar.getClass();
            lVar.c(h.f11764a, aVar);
            lVar.addOnCompleteListener(new app.rive.runtime.kotlin.a(onToken));
            Intrinsics.checkNotNull(lVar);
        } catch (Exception e10) {
            logError(e10);
        }
    }
}
