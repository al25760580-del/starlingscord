package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory;
import com.discord.chat.presentation.message.view.SurveyIndicationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/SurveyIndicationViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "surveyIndicationView", "Lcom/discord/chat/presentation/message/view/SurveyIndicationView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "<init>", "(Lcom/discord/chat/presentation/message/view/SurveyIndicationView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "bind", "", "surveyAccessory", "Lcom/discord/chat/presentation/message/messagepart/SurveyIndicationMessageAccessory;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SurveyIndicationViewHolder extends MessagePartViewHolder {

    @NotNull
    private final ChatEventHandler eventHandler;

    @NotNull
    private final SurveyIndicationView surveyIndicationView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyIndicationViewHolder(@NotNull SurveyIndicationView surveyIndicationView, @NotNull ChatEventHandler eventHandler) {
        super(surveyIndicationView, null);
        Intrinsics.checkNotNullParameter(surveyIndicationView, "surveyIndicationView");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.surveyIndicationView = surveyIndicationView;
        this.eventHandler = eventHandler;
    }

    public final void bind(@NotNull SurveyIndicationMessageAccessory surveyAccessory) {
        Intrinsics.checkNotNullParameter(surveyAccessory, "surveyAccessory");
        this.surveyIndicationView.m755setSurveyIndicationu7_MRrM(surveyAccessory.getMessageId(), surveyAccessory.getSurveyIndication(), new SurveyIndicationViewHolder$bind$1$1(this.eventHandler));
    }
}
