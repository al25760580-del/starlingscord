package com.discord.chat.presentation.textutils;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.discord.chat.bridge.contentnode.CustomEmojiContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.UnicodeEmojiContentNode;
import com.discord.emoji.RenderableEmoji;
import com.discord.emoji.RenderableEmojiKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.span.utilities.spannable.ClickableSpan;
import com.discord.span.utilities.spannable.EmojiAccessibilitySpan;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.react.runtime.p;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import n6.b;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\n\u0010\f\u001a\u00020\r*\u00020\u0005¨\u0006\u000e"}, d2 = {"renderEmoji", "", "builder", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "emoji", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "rc", "Lcom/discord/chat/presentation/textutils/RenderContext;", "handleEmojiSpoiler", "Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;", "revealTransparent", "", "renderable", "Lcom/discord/emoji/RenderableEmoji;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmojiRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiRenderer.kt\ncom/discord/chat/presentation/textutils/EmojiRendererKt\n+ 2 SpannableStringBuilderExtensions.kt\ncom/discord/span/utilities/SpannableStringBuilderExtensionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,71:1\n43#2,4:72\n47#2:79\n13472#3:76\n13473#3:78\n1#4:77\n27#5:80\n27#5:81\n27#5:82\n*S KotlinDebug\n*F\n+ 1 EmojiRenderer.kt\ncom/discord/chat/presentation/textutils/EmojiRendererKt\n*L\n37#1:72,4\n37#1:79\n37#1:76\n37#1:78\n37#1:77\n50#1:80\n62#1:81\n63#1:82\n*E\n"})
public final class EmojiRendererKt {
    public static final void handleEmojiSpoiler(@NotNull GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder, @NotNull RenderContext rc2, boolean z5) {
        int spoilerRevealedBackground;
        Intrinsics.checkNotNullParameter(genericDraweeHierarchyBuilder, "<this>");
        Intrinsics.checkNotNullParameter(rc2, "rc");
        genericDraweeHierarchyBuilder.f4708d = new ColorDrawable(0);
        genericDraweeHierarchyBuilder.f4706b = 0;
        if (rc2.spoilerExists()) {
            boolean zSpoilerIsRevealed = rc2.spoilerIsRevealed();
            if (zSpoilerIsRevealed && z5) {
                spoilerRevealedBackground = 0;
            } else {
                spoilerRevealedBackground = zSpoilerIsRevealed ? rc2.getTheme().getSpoilerRevealedBackground() : rc2.getTheme().getSpoilerHiddenBackground();
            }
            int spoilerHiddenBackground = zSpoilerIsRevealed ? 0 : rc2.getTheme().getSpoilerHiddenBackground();
            genericDraweeHierarchyBuilder.f4716n = new ColorDrawable(spoilerRevealedBackground);
            genericDraweeHierarchyBuilder.f4717o = Arrays.asList(new ColorDrawable(spoilerHiddenBackground));
        }
    }

    public static /* synthetic */ void handleEmojiSpoiler$default(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder, RenderContext renderContext, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        handleEmojiSpoiler(genericDraweeHierarchyBuilder, renderContext, z5);
    }

    public static final void renderEmoji(@NotNull DraweeSpanStringBuilder builder, @NotNull EmojiContentNode emoji, @NotNull RenderContext rc2) {
        int iconSize;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(rc2, "rc");
        boolean jumboable = emoji.getJumboable();
        if (jumboable) {
            iconSize = SizeUtilsKt.getDpToPx(48);
        } else {
            Float emojiBaselineHeightOverridePx = rc2.getEmojiBaselineHeightOverridePx();
            iconSize = TextUtilsKt.getIconSize("_emoji", emojiBaselineHeightOverridePx != null ? emojiBaselineHeightOverridePx.floatValue() : rc2.getBaselineHeightPx());
        }
        int i7 = jumboable ? 1 : 2;
        RenderableEmoji renderableEmojiRenderable = renderable(emoji);
        Object[] objArr = {new EmojiAccessibilitySpan(renderableEmojiRenderable.getContentDescription()), new ClickableSpan(null, null, null, null, 0.0f, null, null, new p(5, rc2, emoji), 127, null)};
        int length = builder.length();
        RenderableEmojiKt.renderEmojiInto(builder, renderableEmojiRenderable, rc2.getContext(), iconSize, rc2.getAnimateEmoji(), i7, new b(rc2, 0));
        for (int i10 = 0; i10 < 2; i10++) {
            Object obj = objArr[i10];
            if (obj != null) {
                builder.setSpan(obj, length, builder.length(), 33);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderEmoji$lambda$0(RenderContext renderContext, EmojiContentNode emojiContentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getOnTapEmoji().invoke(emojiContentNode);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderEmoji$lambda$2$lambda$1(RenderContext renderContext, GenericDraweeHierarchyBuilder renderEmojiInto) {
        Intrinsics.checkNotNullParameter(renderEmojiInto, "$this$renderEmojiInto");
        handleEmojiSpoiler$default(renderEmojiInto, renderContext, false, 2, null);
        return Unit.f14616a;
    }

    @NotNull
    public static final RenderableEmoji renderable(@NotNull EmojiContentNode emojiContentNode) {
        Intrinsics.checkNotNullParameter(emojiContentNode, "<this>");
        if (emojiContentNode instanceof CustomEmojiContentNode) {
            CustomEmojiContentNode customEmojiContentNode = (CustomEmojiContentNode) emojiContentNode;
            return RenderableEmoji.INSTANCE.customWithEmojiId(customEmojiContentNode.getId(), (StringsKt.K(customEmojiContentNode.getSrc()) || Intrinsics.areEqual(customEmojiContentNode.getSrc(), customEmojiContentNode.getFrozenSrc())) ? false : true, customEmojiContentNode.getAlt());
        }
        if (emojiContentNode instanceof UnicodeEmojiContentNode) {
            return RenderableEmoji.INSTANCE.unicode(((UnicodeEmojiContentNode) emojiContentNode).getSurrogate());
        }
        throw new n();
    }
}
