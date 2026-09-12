package com.discord.chat.bridge.botuikit;

import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kr.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f(with = ComponentSerializer.class)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/bridge/botuikit/Component;", "", "<init>", "()V", "type", "", "getType", "()I", StackTraceHelper.ID_KEY, "", "getId", "()Ljava/lang/String;", "Companion", "Lcom/discord/chat/bridge/botuikit/BaseActionComponent;", "Lcom/discord/chat/bridge/botuikit/BaseLayoutComponent;", "Lcom/discord/chat/bridge/botuikit/CheckpointCardComponent;", "Lcom/discord/chat/bridge/botuikit/ContentInventoryEntryComponent;", "Lcom/discord/chat/bridge/botuikit/FileDisplayComponent;", "Lcom/discord/chat/bridge/botuikit/MediaGalleryDisplayComponent;", "Lcom/discord/chat/bridge/botuikit/SeparatorDisplayComponent;", "Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;", "Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;", "Lcom/discord/chat/bridge/botuikit/UnknownComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Component {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/Component$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/Component;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ComponentSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Component(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getId();

    public abstract int getType();

    private Component() {
    }
}
