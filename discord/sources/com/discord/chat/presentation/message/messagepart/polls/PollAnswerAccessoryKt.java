package com.discord.chat.presentation.message.messagepart.polls;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.attachment.AttachmentType;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"getFirstImage", "Lcom/discord/chat/bridge/attachment/Attachment;", "", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPollAnswerAccessory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollAnswerAccessory.kt\ncom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessoryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n295#2,2:40\n*S KotlinDebug\n*F\n+ 1 PollAnswerAccessory.kt\ncom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessoryKt\n*L\n36#1:40,2\n*E\n"})
public final class PollAnswerAccessoryKt {
    public static final Attachment getFirstImage(@NotNull List<Attachment> list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((Attachment) next).type() == AttachmentType.Image) {
                return (Attachment) next;
            }
        }
        next = null;
        return (Attachment) next;
    }
}
