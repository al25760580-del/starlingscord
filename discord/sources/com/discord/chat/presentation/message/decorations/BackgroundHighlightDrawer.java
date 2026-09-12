package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import ar.u;
import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.presentation.list.item.ChatListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/presentation/message/decorations/BackgroundHighlightDrawer;", "Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackgroundHighlightDrawer extends HighlightedMessageDrawer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundHighlightDrawer(@NotNull Context context) {
        super(context, new u(2), new u(3), new u(4));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _init_$lambda$0(ChatListItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BackgroundHighlight backgroundHighlight = BackgroundHighlightDecorationKt.getBackgroundHighlight(it);
        if (backgroundHighlight != null) {
            return backgroundHighlight.getBackgroundColor();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _init_$lambda$1(ChatListItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BackgroundHighlight backgroundHighlight = BackgroundHighlightDecorationKt.getBackgroundHighlight(it);
        if (backgroundHighlight != null) {
            return backgroundHighlight.getGutterColor();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(ChatListItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return BackgroundHighlightDecorationKt.getBackgroundHighlight(it) != null;
    }
}
