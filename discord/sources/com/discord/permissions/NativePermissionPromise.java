package com.discord.permissions;

import com.discord.crash_reporting.CrashReporting;
import com.facebook.react.bridge.PromiseImpl;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\n"}, d2 = {"Lcom/discord/permissions/NativePermissionPromise;", "", "<init>", "()V", "generate", "Lcom/facebook/react/bridge/PromiseImpl;", "onAuthorized", "Lkotlin/Function0;", "", "onRejected", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativePermissionPromise {

    @NotNull
    public static final NativePermissionPromise INSTANCE = new NativePermissionPromise();

    private NativePermissionPromise() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void generate$lambda$0(Function0 function0, Function0 function1, Object result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Object obj = result instanceof Object[] ? ((Object[]) result)[0] : result;
        String str = obj instanceof String ? (String) obj : null;
        String lowerCase = "AUTHORIZED".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(str, lowerCase)) {
            function0.invoke();
            return;
        }
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "NativePermissionPromise: Unknown Result: " + result, null, null, null, false, 30, null);
        function1.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void generate$lambda$1(Function0 function0, Object[] result) {
        Intrinsics.checkNotNullParameter(result, "result");
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "NativePermissionPromise: Rejection: " + result, null, null, null, false, 30, null);
        function0.invoke();
    }

    @NotNull
    public final PromiseImpl generate(@NotNull Function0<Unit> onAuthorized, @NotNull Function0<Unit> onRejected) {
        Intrinsics.checkNotNullParameter(onAuthorized, "onAuthorized");
        Intrinsics.checkNotNullParameter(onRejected, "onRejected");
        int i7 = 0;
        return new PromiseImpl(new b(i7, onAuthorized, onRejected), new c(i7, onRejected));
    }
}
