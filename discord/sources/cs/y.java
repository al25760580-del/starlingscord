package cs;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public abstract void onClosed(WebSocket webSocket, int i7, String str);

    public void onClosing(@NotNull WebSocket webSocket, int i7, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public abstract void onFailure(WebSocket webSocket, Throwable th2, Response response);

    public abstract void onMessage(WebSocket webSocket, String str);

    public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
    }

    public abstract void onOpen(WebSocket webSocket, Response response);
}
