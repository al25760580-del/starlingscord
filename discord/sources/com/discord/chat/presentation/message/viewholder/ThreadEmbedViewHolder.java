package com.discord.chat.presentation.message.viewholder;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ar.s;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.threads.ThreadEmbed;
import com.discord.chat.bridge.threads.ThreadEmbedMessage;
import com.discord.chat.presentation.message.MessageUtilsKt;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.t;
import com.discord.chat.presentation.message.view.ThreadEmbedView;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "threadEmbedView", "Lcom/discord/chat/presentation/message/view/ThreadEmbedView;", "<init>", "(Lcom/discord/chat/presentation/message/view/ThreadEmbedView;)V", "bind", "", "threadItem", "Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;", "onTapThreadEmbed", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThreadEmbedViewHolder extends MessagePartViewHolder {

    @NotNull
    private final ThreadEmbedView threadEmbedView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedViewHolder(@NotNull ThreadEmbedView threadEmbedView) {
        super(threadEmbedView, null);
        Intrinsics.checkNotNullParameter(threadEmbedView, "threadEmbedView");
        this.threadEmbedView = threadEmbedView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$0(Function1 function1, ThreadEmbedMessageAccessory threadEmbedMessageAccessory, View view) {
        function1.invoke(MessageId.m1156boximpl(threadEmbedMessageAccessory.getMessageId()));
    }

    public final void bind(@NotNull ThreadEmbedMessageAccessory threadItem, @NotNull Function1<? super MessageId, Unit> onTapThreadEmbed) {
        DraweeSpanStringBuilder draweeSpanStringBuilder;
        String strAvatarUrl;
        Intrinsics.checkNotNullParameter(threadItem, "threadItem");
        Intrinsics.checkNotNullParameter(onTapThreadEmbed, "onTapThreadEmbed");
        ThreadEmbed threadEmbed = threadItem.getThreadEmbed();
        ThreadEmbedView threadEmbedView = this.threadEmbedView;
        threadEmbedView.setThread(threadEmbed.getTitle(), threadEmbed.getMessageCountLabel());
        Boolean archived = threadEmbed.getArchived();
        Boolean bool = Boolean.TRUE;
        threadEmbedView.setArchived(Intrinsics.areEqual(archived, bool), threadEmbed.getArchivedIconUrl());
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(threadEmbedView, false, new t(12, onTapThreadEmbed, threadItem), 1, null);
        StringBuilder sb2 = new StringBuilder();
        if (threadEmbed.getTitle().length() > 0) {
            sb2.append(threadEmbed.getTitle());
            if (threadEmbed.getMessageCountLabel().length() > 0) {
                sb2.append(", ");
            }
        }
        if (threadEmbed.getMessageCountLabel().length() > 0) {
            sb2.append(threadEmbed.getMessageCountLabel());
        }
        threadEmbedView.setAccessibilityLabel(sb2.toString());
        ThreadEmbedMessage referencedMessage = threadEmbed.getReferencedMessage();
        Message message = referencedMessage != null ? referencedMessage.getMessage() : null;
        if (message == null) {
            String messagePreviewString = threadEmbed.getMessagePreviewString();
            draweeSpanStringBuilder = new DraweeSpanStringBuilder(messagePreviewString != null ? messagePreviewString : "");
        } else if (message.getContent() != null) {
            StructurableText content = message.getContent();
            Context context = threadEmbedView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String strM267getId3Eiw7ao = message.m267getId3Eiw7ao();
            boolean zShouldAnimateEmoji = MessageKt.shouldAnimateEmoji(message);
            boolean zShouldShowLinkDecorations = MessageKt.shouldShowLinkDecorations(message);
            boolean shouldShowRoleDot = message.getShouldShowRoleDot();
            boolean shouldShowRoleOnName = message.getShouldShowRoleOnName();
            Paint.FontMetrics fontMetrics = threadEmbedView.getBinding().threadEmbedMostRecentMessageContent.getPaint().getFontMetrics();
            Intrinsics.checkNotNullExpressionValue(fontMetrics, "getFontMetrics(...)");
            float baselineHeightPx = TextUtilsKt.getBaselineHeightPx(fontMetrics);
            TextPaint paint = threadEmbedView.getBinding().threadEmbedMostRecentMessageContent.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
            draweeSpanStringBuilder = TextUtilsKt.toSpannable(content, context, strM267getId3Eiw7ao, zShouldAnimateEmoji, zShouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, paint, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new com.discord.chat.presentation.message.view.b(5) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new com.discord.chat.presentation.message.view.c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new s(27) : null, (8388608 & 8192) != 0 ? new com.discord.chat.presentation.message.view.d(4) : null, (8388608 & 16384) != 0 ? new f6.a(22) : null, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : null, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : null, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : null, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : true, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : baselineHeightPx, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false);
        } else {
            Context context2 = threadEmbedView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            CharSequence contentlessPreviewText = ThreadEmbedViewHolderKt.getContentlessPreviewText(context2, message);
            draweeSpanStringBuilder = new DraweeSpanStringBuilder(contentlessPreviewText != null ? contentlessPreviewText : "");
        }
        if (message != null) {
            Context context3 = threadEmbedView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            strAvatarUrl = MessageKt.avatarUrl(message, context3);
        } else {
            strAvatarUrl = null;
        }
        threadEmbedView.m756setMessageCKTq3AQ(strAvatarUrl, message != null ? message.getUsername() : null, message != null ? Integer.valueOf(MessageKt.usernameColor$default(message, 0, 1, null)) : null, draweeSpanStringBuilder, Intrinsics.areEqual(threadEmbed.getArchived(), bool) || message == null || message.getContent() == null, message != null ? message.getClanTag() : null, message != null ? message.getClanBadgeUrl() : null, message != null ? message.m265getClanTagGuildIdqOKuAAo() : null);
        if (message != null) {
            TextView threadEmbedMostRecentMessageName = threadEmbedView.getBinding().threadEmbedMostRecentMessageName;
            Intrinsics.checkNotNullExpressionValue(threadEmbedMostRecentMessageName, "threadEmbedMostRecentMessageName");
            MessageUtilsKt.clearOrSetRoleColors(threadEmbedMostRecentMessageName, message);
        }
    }
}
