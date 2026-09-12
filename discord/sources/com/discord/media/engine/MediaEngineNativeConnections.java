package com.discord.media.engine;

import com.discord.media.engine.types.Debug;
import com.discord.p000native.engine.NativeConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/media/engine/MediaEngineNativeConnections;", "", "<init>", "()V", "connections", "", "", "Lcom/discord/native/engine/NativeConnection;", "get", "connectionId", "register", "", "connection", "removeAndDispose", "removeAndDisposeAll", "Companion", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaEngineNativeConnections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEngineNativeConnections.kt\ncom/discord/media/engine/MediaEngineNativeConnections\n+ 2 Debug.kt\ncom/discord/media/engine/types/Debug\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n38#2,4:44\n44#2,7:48\n38#2,4:55\n1869#3,2:59\n*S KotlinDebug\n*F\n+ 1 MediaEngineNativeConnections.kt\ncom/discord/media/engine/MediaEngineNativeConnections\n*L\n23#1:44,4\n30#1:48,7\n31#1:55,4\n35#1:59,2\n*E\n"})
public final class MediaEngineNativeConnections {

    @NotNull
    private static final String TAG = "MediaEngineNativeConnections";

    @NotNull
    private final Map<Integer, NativeConnection> connections = new LinkedHashMap();

    public final NativeConnection get(int connectionId) {
        return this.connections.get(Integer.valueOf(connectionId));
    }

    public final void register(int connectionId, @NotNull NativeConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (this.connections.containsKey(Integer.valueOf(connectionId))) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.connections.containsValue(connection)) {
            throw new IllegalStateException("Check failed.");
        }
        this.connections.put(Integer.valueOf(connectionId), connection);
        Debug debug = Debug.INSTANCE;
    }

    public final void removeAndDispose(int connectionId) {
        NativeConnection nativeConnectionRemove = this.connections.remove(Integer.valueOf(connectionId));
        if (nativeConnectionRemove == null) {
            Debug debug = Debug.INSTANCE;
            return;
        }
        System.nanoTime();
        nativeConnectionRemove.dispose();
        Debug debug2 = Debug.INSTANCE;
    }

    public final void removeAndDisposeAll() {
        Iterator<T> it = this.connections.keySet().iterator();
        while (it.hasNext()) {
            removeAndDispose(((Number) it.next()).intValue());
        }
        if (!this.connections.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
