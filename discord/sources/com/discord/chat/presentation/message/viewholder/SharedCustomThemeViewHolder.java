package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.messagepart.SharedCustomThemeMessageAccessory;
import com.discord.chat.presentation.message.view.customthemes.SharedCustomThemeView;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/SharedCustomThemeViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/customthemes/SharedCustomThemeView;", "sharedCustomThemeView", "<init>", "(Lcom/discord/chat/presentation/message/view/customthemes/SharedCustomThemeView;)V", "Lcom/discord/chat/presentation/message/messagepart/SharedCustomThemeMessageAccessory;", "accessory", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "", "onTapPreview", "onViewed", "bind", "(Lcom/discord/chat/presentation/message/messagepart/SharedCustomThemeMessageAccessory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/presentation/message/view/customthemes/SharedCustomThemeView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharedCustomThemeViewHolder extends MessagePartViewHolder {

    @NotNull
    private final SharedCustomThemeView sharedCustomThemeView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedCustomThemeViewHolder(@NotNull SharedCustomThemeView sharedCustomThemeView) {
        super(sharedCustomThemeView, null);
        Intrinsics.checkNotNullParameter(sharedCustomThemeView, "sharedCustomThemeView");
        this.sharedCustomThemeView = sharedCustomThemeView;
    }

    public final void bind(@NotNull SharedCustomThemeMessageAccessory accessory, @NotNull Function1<? super MessageId, Unit> onTapPreview, @NotNull Function1<? super MessageId, Unit> onViewed) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapPreview, "onTapPreview");
        Intrinsics.checkNotNullParameter(onViewed, "onViewed");
        this.sharedCustomThemeView.m757bindpPZZVto(accessory.getMessageId(), accessory.getData(), accessory.getAuthor(), onTapPreview, onViewed);
    }
}
