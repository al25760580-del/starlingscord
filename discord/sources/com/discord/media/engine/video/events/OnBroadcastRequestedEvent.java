package com.discord.media.engine.video.events;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/discord/media/engine/video/events/OnBroadcastRequestedEvent;", "Lcom/discord/reactevents/ReactEvent;", "<init>", "()V", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnBroadcastRequestedEvent implements ReactEvent {
    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    public WritableNativeMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
    }
}
