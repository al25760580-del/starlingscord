package com.discord.chat.bridge.botuikit;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/discord/chat/bridge/botuikit/BaseLayoutComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "<init>", "()V", "errorText", "", "getErrorText", "()Ljava/lang/String;", "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;", "Lcom/discord/chat/bridge/botuikit/ContainerComponent;", "Lcom/discord/chat/bridge/botuikit/SectionComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseLayoutComponent extends Component {
    public /* synthetic */ BaseLayoutComponent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getErrorText();

    private BaseLayoutComponent() {
        super(null);
    }
}
