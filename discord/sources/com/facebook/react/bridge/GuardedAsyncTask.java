package com.facebook.react.bridge;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0014\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ#\u0010\f\u001a\u0004\u0018\u00010\u00042\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0005¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00112\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H$¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/bridge/GuardedAsyncTask;", "Params", "Progress", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "exceptionHandler", "Lcom/facebook/react/bridge/JSExceptionHandler;", "<init>", "(Lcom/facebook/react/bridge/JSExceptionHandler;)V", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "doInBackground", "params", "", "([Ljava/lang/Object;)Ljava/lang/Void;", "doInBackgroundGuarded", "", "([Ljava/lang/Object;)V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class GuardedAsyncTask<Params, Progress> extends AsyncTask<Params, Progress, Void> {

    @NotNull
    public static final Executor THREAD_POOL_EXECUTOR;

    @NotNull
    private final JSExceptionHandler exceptionHandler;

    static {
        Executor THREAD_POOL_EXECUTOR2 = AsyncTask.THREAD_POOL_EXECUTOR;
        Intrinsics.checkNotNullExpressionValue(THREAD_POOL_EXECUTOR2, "THREAD_POOL_EXECUTOR");
        THREAD_POOL_EXECUTOR = THREAD_POOL_EXECUTOR2;
    }

    public GuardedAsyncTask(@NotNull JSExceptionHandler exceptionHandler) {
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        this.exceptionHandler = exceptionHandler;
    }

    public abstract void doInBackgroundGuarded(@NotNull Params... params);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.AsyncTask
    @d
    public final Void doInBackground(@NotNull Params... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            doInBackgroundGuarded(Arrays.copyOf(params, params.length));
            return null;
        } catch (RuntimeException e10) {
            this.exceptionHandler.handleException(e10);
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GuardedAsyncTask(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        Intrinsics.checkNotNullExpressionValue(exceptionHandler, "getExceptionHandler(...)");
        this(exceptionHandler);
    }
}
