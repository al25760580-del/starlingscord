package com.discord.chat.bridge.botuikit;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/bridge/botuikit/BaseActionComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "<init>", "()V", "state", "Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "getState", "()Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "customId", "", "getCustomId", "()Ljava/lang/String;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseActionComponent extends Component {
    public /* synthetic */ BaseActionComponent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getCustomId();

    @NotNull
    public abstract ActionComponentState getState();

    private BaseActionComponent() {
        super(null);
    }
}
