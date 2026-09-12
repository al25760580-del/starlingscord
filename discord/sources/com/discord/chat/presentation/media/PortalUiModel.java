package com.discord.chat.presentation.media;

import com.discord.misc.utilities.ids.IdUtilsKt;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/media/PortalUiModel;", "", "messageId", "Lcom/discord/primitives/MessageId;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "index", "", "getIndex", "()I", "portal", "", "getPortal", "()D", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PortalUiModel {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static double getPortal(@NotNull PortalUiModel portalUiModel) {
            return IdUtilsKt.convertToId(MessageId.m1163toStringimpl(portalUiModel.m534getMessageId3Eiw7ao()) + "_" + portalUiModel.getClass().getSimpleName() + "_" + portalUiModel.getIndex());
        }
    }

    int getIndex();

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
    String m534getMessageId3Eiw7ao();

    double getPortal();
}
