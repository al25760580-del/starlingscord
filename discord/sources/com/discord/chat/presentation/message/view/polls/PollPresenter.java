package com.discord.chat.presentation.message.view.polls;

import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0095\u0001\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00042\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00042<\u0010\u000e\u001a8\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollPresenter;", "", "Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "accessory", "Lkotlin/Function3;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/MessageId;", "", "", "onTapAnswer", "onTapPollAction", "Lkotlin/Function8;", "", "Lcom/discord/chat/reactevents/ViewResizeMode;", "onLongPressImage", "bind", "(Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function8;)V", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PollPresenter {
    void bind(@NotNull PollMessageAccessory accessory, @NotNull Function3 onTapAnswer, @NotNull Function3 onTapPollAction, @NotNull Function8 onLongPressImage);
}
