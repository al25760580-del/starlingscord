package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory;
import com.discord.chat.presentation.message.view.ChannelPromptActionsView;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ChannelPromptActionsViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "channelPromptActionsView", "Lcom/discord/chat/presentation/message/view/ChannelPromptActionsView;", "<init>", "(Lcom/discord/chat/presentation/message/view/ChannelPromptActionsView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/ChannelPromptActionsAccessory;", "onTapChannelPromptButton", "Lkotlin/Function3;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/primitives/ChannelId;", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChannelPromptActionsViewHolder extends MessagePartViewHolder {

    @NotNull
    private final ChannelPromptActionsView channelPromptActionsView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelPromptActionsViewHolder(@NotNull ChannelPromptActionsView channelPromptActionsView) {
        super(channelPromptActionsView, null);
        Intrinsics.checkNotNullParameter(channelPromptActionsView, "channelPromptActionsView");
        this.channelPromptActionsView = channelPromptActionsView;
        channelPromptActionsView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(Function3 function3, ChannelPromptActionsAccessory channelPromptActionsAccessory, View view) {
        function3.invoke(MessageId.m1156boximpl(channelPromptActionsAccessory.getMessageId()), ChannelId.m1130boximpl(channelPromptActionsAccessory.getMessage().m264getChannelIdo4g7jtM()), "camera");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(Function3 function3, ChannelPromptActionsAccessory channelPromptActionsAccessory, View view) {
        function3.invoke(MessageId.m1156boximpl(channelPromptActionsAccessory.getMessageId()), ChannelId.m1130boximpl(channelPromptActionsAccessory.getMessage().m264getChannelIdo4g7jtM()), "emoji");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(Function3 function3, ChannelPromptActionsAccessory channelPromptActionsAccessory, View view) {
        function3.invoke(MessageId.m1156boximpl(channelPromptActionsAccessory.getMessageId()), ChannelId.m1130boximpl(channelPromptActionsAccessory.getMessage().m264getChannelIdo4g7jtM()), "gaming-stats");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3(Function3 function3, ChannelPromptActionsAccessory channelPromptActionsAccessory, View view) {
        function3.invoke(MessageId.m1156boximpl(channelPromptActionsAccessory.getMessageId()), ChannelId.m1130boximpl(channelPromptActionsAccessory.getMessage().m264getChannelIdo4g7jtM()), "gif");
    }

    public final void bind(@NotNull final ChannelPromptActionsAccessory accessory, @NotNull final Function3 onTapChannelPromptButton) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapChannelPromptButton, "onTapChannelPromptButton");
        ChannelPromptActionsView channelPromptActionsView = this.channelPromptActionsView;
        Message message = accessory.getMessage();
        final int i7 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        ChannelPromptActionsViewHolder.bind$lambda$0(onTapChannelPromptButton, accessory, view);
                        break;
                    case 1:
                        ChannelPromptActionsViewHolder.bind$lambda$1(onTapChannelPromptButton, accessory, view);
                        break;
                    case 2:
                        ChannelPromptActionsViewHolder.bind$lambda$2(onTapChannelPromptButton, accessory, view);
                        break;
                    default:
                        ChannelPromptActionsViewHolder.bind$lambda$3(onTapChannelPromptButton, accessory, view);
                        break;
                }
            }
        };
        final int i10 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ChannelPromptActionsViewHolder.bind$lambda$0(onTapChannelPromptButton, accessory, view);
                        break;
                    case 1:
                        ChannelPromptActionsViewHolder.bind$lambda$1(onTapChannelPromptButton, accessory, view);
                        break;
                    case 2:
                        ChannelPromptActionsViewHolder.bind$lambda$2(onTapChannelPromptButton, accessory, view);
                        break;
                    default:
                        ChannelPromptActionsViewHolder.bind$lambda$3(onTapChannelPromptButton, accessory, view);
                        break;
                }
            }
        };
        final int i11 = 2;
        View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ChannelPromptActionsViewHolder.bind$lambda$0(onTapChannelPromptButton, accessory, view);
                        break;
                    case 1:
                        ChannelPromptActionsViewHolder.bind$lambda$1(onTapChannelPromptButton, accessory, view);
                        break;
                    case 2:
                        ChannelPromptActionsViewHolder.bind$lambda$2(onTapChannelPromptButton, accessory, view);
                        break;
                    default:
                        ChannelPromptActionsViewHolder.bind$lambda$3(onTapChannelPromptButton, accessory, view);
                        break;
                }
            }
        };
        final int i12 = 3;
        channelPromptActionsView.configure(message, onClickListener, onClickListener2, onClickListener3, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ChannelPromptActionsViewHolder.bind$lambda$0(onTapChannelPromptButton, accessory, view);
                        break;
                    case 1:
                        ChannelPromptActionsViewHolder.bind$lambda$1(onTapChannelPromptButton, accessory, view);
                        break;
                    case 2:
                        ChannelPromptActionsViewHolder.bind$lambda$2(onTapChannelPromptButton, accessory, view);
                        break;
                    default:
                        ChannelPromptActionsViewHolder.bind$lambda$3(onTapChannelPromptButton, accessory, view);
                        break;
                }
            }
        });
    }
}
