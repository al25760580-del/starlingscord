package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.presentation.message.messagepart.AutoModerationNotificationEmbedAccessory;
import com.discord.chat.presentation.message.view.AutoModerationNotificationEmbedView;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/AutoModerationNotificationEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "notificationEmbedView", "Lcom/discord/chat/presentation/message/view/AutoModerationNotificationEmbedView;", "<init>", "(Lcom/discord/chat/presentation/message/view/AutoModerationNotificationEmbedView;)V", "bind", "", "notificationEmbedAccessory", "Lcom/discord/chat/presentation/message/messagepart/AutoModerationNotificationEmbedAccessory;", "onTapAutoModerationActions", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/primitives/ChannelId;", "onTapAutoModerationFeedback", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutoModerationNotificationEmbedViewHolder extends MessagePartViewHolder {

    @NotNull
    private final AutoModerationNotificationEmbedView notificationEmbedView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoModerationNotificationEmbedViewHolder(@NotNull AutoModerationNotificationEmbedView notificationEmbedView) {
        super(notificationEmbedView, null);
        Intrinsics.checkNotNullParameter(notificationEmbedView, "notificationEmbedView");
        this.notificationEmbedView = notificationEmbedView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(Function2 function2, String str, long j, View view) {
        function2.invoke(MessageId.m1156boximpl(str), ChannelId.m1130boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(Function2 function2, String str, long j, View view) {
        function2.invoke(MessageId.m1156boximpl(str), ChannelId.m1130boximpl(j));
    }

    public final void bind(@NotNull AutoModerationNotificationEmbedAccessory notificationEmbedAccessory, @NotNull Function2<? super MessageId, ? super ChannelId, Unit> onTapAutoModerationActions, @NotNull Function2<? super MessageId, ? super ChannelId, Unit> onTapAutoModerationFeedback) {
        Intrinsics.checkNotNullParameter(notificationEmbedAccessory, "notificationEmbedAccessory");
        Intrinsics.checkNotNullParameter(onTapAutoModerationActions, "onTapAutoModerationActions");
        Intrinsics.checkNotNullParameter(onTapAutoModerationFeedback, "onTapAutoModerationFeedback");
        long jM264getChannelIdo4g7jtM = notificationEmbedAccessory.getMessage().m264getChannelIdo4g7jtM();
        String strM267getId3Eiw7ao = notificationEmbedAccessory.getMessage().m267getId3Eiw7ao();
        this.notificationEmbedView.configure(notificationEmbedAccessory.getModerationContext(), new a(onTapAutoModerationActions, strM267getId3Eiw7ao, jM264getChannelIdo4g7jtM, 0), new a(onTapAutoModerationFeedback, strM267getId3Eiw7ao, jM264getChannelIdo4g7jtM, 1));
    }
}
