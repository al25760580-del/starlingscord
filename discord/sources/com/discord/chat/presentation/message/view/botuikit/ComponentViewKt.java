package com.discord.chat.presentation.message.view.botuikit;

import android.content.Context;
import com.discord.chat.bridge.botuikit.ComponentEmoji;
import com.discord.emoji.RenderableEmoji;
import com.discord.emoji.RenderableEmojiKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0004¨\u0006\u0007"}, d2 = {"setEmojiOrHide", "", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "componentEmoji", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "renderable", "Lcom/discord/emoji/RenderableEmoji;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/ComponentViewKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n257#2,2:180\n257#2,2:182\n1#3:184\n*S KotlinDebug\n*F\n+ 1 ComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/ComponentViewKt\n*L\n159#1:180,2\n162#1:182,2\n*E\n"})
public final class ComponentViewKt {
    @NotNull
    public static final RenderableEmoji renderable(@NotNull ComponentEmoji componentEmoji) {
        Long lA0;
        Intrinsics.checkNotNullParameter(componentEmoji, "<this>");
        String id2 = componentEmoji.getId();
        if (id2 != null && (lA0 = StringsKt.a0(id2)) != null) {
            RenderableEmoji.CustomWithEmojiId customWithEmojiId = RenderableEmoji.INSTANCE.customWithEmojiId(lA0.longValue(), componentEmoji.getAnimated(), componentEmoji.getName());
            if (customWithEmojiId != null) {
                return customWithEmojiId;
            }
        }
        RenderableEmoji.Companion companion = RenderableEmoji.INSTANCE;
        String surrogates = componentEmoji.getSurrogates();
        if (surrogates == null) {
            surrogates = componentEmoji.getName();
        }
        return companion.unicode(surrogates);
    }

    public static final void setEmojiOrHide(@NotNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, ComponentEmoji componentEmoji) {
        Intrinsics.checkNotNullParameter(simpleDraweeSpanTextView, "<this>");
        if (componentEmoji == null) {
            simpleDraweeSpanTextView.setVisibility(8);
            return;
        }
        simpleDraweeSpanTextView.setVisibility(0);
        RenderableEmoji renderableEmojiRenderable = renderable(componentEmoji);
        Context context = simpleDraweeSpanTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        simpleDraweeSpanTextView.setDraweeSpanStringBuilder(RenderableEmojiKt.renderEmoji$default(renderableEmojiRenderable, context, SizeUtilsKt.getDpToPx(20), componentEmoji.getAnimated(), 1, null, 32, null));
    }
}
