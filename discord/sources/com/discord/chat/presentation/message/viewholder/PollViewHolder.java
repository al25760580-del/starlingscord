package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.chat.presentation.message.view.polls.PollPresenter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0096\u0001\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\b2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\b2<\u0010\u0012\u001a8\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/PollViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/polls/PollPresenter;", "pollView", "<init>", "(Lcom/discord/chat/presentation/message/view/polls/PollPresenter;)V", "Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "accessory", "Lkotlin/Function3;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/MessageId;", "", "", "onTapAnswer", "onTapPollAction", "Lkotlin/Function8;", "", "Lcom/discord/chat/reactevents/ViewResizeMode;", "onLongPressImage", "bind", "(Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function8;)V", "Lcom/discord/chat/presentation/message/view/polls/PollPresenter;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PollViewHolder extends MessagePartViewHolder implements PollPresenter {

    @NotNull
    private final PollPresenter pollView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PollViewHolder(@NotNull PollPresenter pollView) {
        super((View) pollView, null);
        Intrinsics.checkNotNullParameter(pollView, "pollView");
        this.pollView = pollView;
    }

    @Override // com.discord.chat.presentation.message.view.polls.PollPresenter
    public void bind(@NotNull PollMessageAccessory accessory, @NotNull Function3 onTapAnswer, @NotNull Function3 onTapPollAction, @NotNull Function8 onLongPressImage) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapAnswer, "onTapAnswer");
        Intrinsics.checkNotNullParameter(onTapPollAction, "onTapPollAction");
        Intrinsics.checkNotNullParameter(onLongPressImage, "onLongPressImage");
        this.pollView.bind(accessory, onTapAnswer, onTapPollAction, onLongPressImage);
    }
}
