package com.discord.chat.presentation.textutils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.SizeF;
import android.view.View;
import c9.a;
import com.discord.chat.bridge.contentnode.AttachmentLinkContentNode;
import com.discord.chat.bridge.contentnode.BlockQuoteContentNode;
import com.discord.chat.bridge.contentnode.BulletListContentNode;
import com.discord.chat.bridge.contentnode.ChannelMentionContentNode;
import com.discord.chat.bridge.contentnode.ChannelNameContentNode;
import com.discord.chat.bridge.contentnode.CodeBlockContentNode;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.ContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.EmphasisContentNode;
import com.discord.chat.bridge.contentnode.ErrorContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.GuildNameContentNode;
import com.discord.chat.bridge.contentnode.HeadingContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LHeadingContentNode;
import com.discord.chat.bridge.contentnode.LineBreakContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.MentionContentNode;
import com.discord.chat.bridge.contentnode.NewLineContentNode;
import com.discord.chat.bridge.contentnode.ParagraphContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNodeKt;
import com.discord.chat.bridge.contentnode.SpoilerContentNode;
import com.discord.chat.bridge.contentnode.StaticChannelMentionContentNode;
import com.discord.chat.bridge.contentnode.StaticChannelMentionType;
import com.discord.chat.bridge.contentnode.StrikethroughContentNode;
import com.discord.chat.bridge.contentnode.StrongContentNode;
import com.discord.chat.bridge.contentnode.SubtextContentNode;
import com.discord.chat.bridge.contentnode.TextContentNode;
import com.discord.chat.bridge.contentnode.TimestampContentNode;
import com.discord.chat.bridge.contentnode.UnderlineContentNode;
import com.discord.chat.bridge.contentnode.UserOrRoleMentionContentNode;
import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.rolecolors.RoleColorsKt;
import com.discord.chat.bridge.spoiler.SpoilerIdentifier;
import com.discord.chat.bridge.spoiler.SpoilerManager;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.PrimitiveStructurableText;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.presentation.message.EnhancedRoleColorsSpan;
import com.discord.chat.presentation.message.RoleDotSpan;
import com.discord.chat.presentation.message.j;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.crash_reporting.CrashReporting;
import com.discord.emoji.RenderableEmoji;
import com.discord.emoji.RenderableEmojiKt;
import com.discord.fonts.DiscordFont;
import com.discord.image.fresco.DiskCachePolicyKt;
import com.discord.misc.utilities.kotlin.ForceExhaustiveKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.GuildId;
import com.discord.primitives.RoleId;
import com.discord.primitives.UserId;
import com.discord.react.FontManager;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetExtensionsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedClickableSpan;
import com.discord.span.utilities.GGSansBoldSpan;
import com.discord.span.utilities.GGSansItalicSpan;
import com.discord.span.utilities.SpannableStringBuilderExtensionsKt;
import com.discord.span.utilities.common.BackgroundStyle;
import com.discord.span.utilities.common.BorderStyle;
import com.discord.span.utilities.common.ShadowStyle;
import com.discord.span.utilities.spannable.BackgroundSpan;
import com.discord.span.utilities.spannable.BulletSpan;
import com.discord.span.utilities.spannable.ClickableSpan;
import com.discord.span.utilities.spannable.HorizontalSpacerSpan;
import com.discord.span.utilities.spannable.OrderedListBulletSpan;
import com.discord.span.utilities.spannable.QuoteSpan;
import com.discord.span.utilities.spannable.SpoilerSpan;
import com.discord.span.utilities.spannable.VerticalPaddingSpan;
import com.discord.span.utilities.spannable.VerticalSpacerSpan;
import com.discord.theme.DiscordThemeObject;
import com.discord.theme.R;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.runtime.p;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import f9.c;
import i9.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import n6.d;
import n8.i;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u000b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u00ad\u0004\u0010:\u001a\u000209*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152$\b\u0002\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00170\u001a2,\b\u0002\u0010\u001d\u001a&\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00170\u001c2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00170\u00152\u001a\b\u0002\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00170\u001f2<\b\u0002\u0010\"\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00170!2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\u00152\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\u00152\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00170\u00152\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00170\u00152\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00170\u00152\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00170\u00152\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020-0\u00152\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170/2\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00170\u00152\b\b\u0002\u00103\u001a\u00020\u00102\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00106\u001a\u00020\u00022\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00108\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;\u001a)\u0010A\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u000209H\u0002¢\u0006\u0004\bA\u0010B\u001a5\u0010:\u001a\u000209*\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010?\u001a\u00020>2\b\b\u0002\u0010C\u001a\u0002092\b\b\u0002\u0010D\u001a\u00020\u0010H\u0002¢\u0006\u0004\b:\u0010E\u001a]\u0010L\u001a\u00020\u0017*\u0002092\u0006\u0010\r\u001a\u00020\f2\u0006\u0010?\u001a\u00020>2\u0006\u0010F\u001a\u00020\u000e2\b\b\u0001\u0010G\u001a\u00020\u00072\b\b\u0001\u0010H\u001a\u00020\u00072\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010J\u001a\u00020\u00022\b\b\u0002\u0010K\u001a\u00020\u0002¢\u0006\u0004\bL\u0010M\u001a1\u0010P\u001a\u00020\u0017*\u0002092\f\u0010N\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010?\u001a\u00020>2\u0006\u0010O\u001a\u00020\u0010H\u0002¢\u0006\u0004\bP\u0010Q\u001a\u0019\u0010T\u001a\u00020S2\b\u0010R\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\bT\u0010U\u001a\u001f\u0010W\u001a\u00020\u00072\b\u0010R\u001a\u0004\u0018\u00010\u000e2\u0006\u0010V\u001a\u00020\u0002¢\u0006\u0004\bW\u0010X\u001a\u0019\u0010Z\u001a\u00020\u00022\b\b\u0001\u0010Y\u001a\u00020\u0007H\u0002¢\u0006\u0004\bZ\u0010[\u001a\u0017\u0010\\\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\\\u0010]\u001a\u001f\u0010`\u001a\u00020_2\u0006\u0010?\u001a\u00020>2\u0006\u0010^\u001a\u00020\u0007H\u0002¢\u0006\u0004\b`\u0010a\u001aE\u0010e\u001a\u00020\u0017*\u0002092\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010^\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u00072\b\u0010d\u001a\u0004\u0018\u00010cH\u0002¢\u0006\u0004\be\u0010f\u001a\u0013\u0010g\u001a\u00020\u0017*\u000209H\u0002¢\u0006\u0004\bg\u0010h\u001a\u001b\u0010k\u001a\u00020\u0017*\u00020i2\u0006\u0010j\u001a\u00020\u0007H\u0002¢\u0006\u0004\bk\u0010l\u001a\u001b\u0010n\u001a\u00020\u0017*\u00020i2\u0006\u0010N\u001a\u00020mH\u0002¢\u0006\u0004\bn\u0010o\u001a=\u0010s\u001a\u00020\u0017*\u0002092\u0006\u0010p\u001a\u00020\u00072\u0006\u0010q\u001a\u00020>2\u0018\u0010r\u001a\u0014\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00170\u001fH\u0002¢\u0006\u0004\bs\u0010t\u001a\u001b\u0010v\u001a\u00020\u0017*\u0002092\u0006\u0010u\u001a\u00020\u0007H\u0002¢\u0006\u0004\bv\u0010w\u001a\u0013\u0010x\u001a\u00020\u0017*\u000209H\u0002¢\u0006\u0004\bx\u0010h\"\u0014\u0010z\u001a\u00020y8\u0002X\u0082T¢\u0006\u0006\n\u0004\bz\u0010{\"\u0014\u0010|\u001a\u00020y8\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010{\"\u0014\u0010}\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b}\u0010~\"\u0014\u0010\u007f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u007f\u0010~\"\u0017\u0010\u0080\u0001\u001a\u00020\u00028\u0002X\u0082T¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0017\u0010\u0082\u0001\u001a\u00020\u00078\u0002X\u0082T¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0084\u0001"}, d2 = {"Landroid/graphics/Paint$FontMetrics;", "fontMetrics", "", "getBaselineHeightPx", "(Landroid/graphics/Paint$FontMetrics;)F", "Landroid/graphics/Paint;", "paint", "", "fontSizePx", "getBaselineHeightForFontSizePx", "(Landroid/graphics/Paint;I)F", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "Landroid/content/Context;", "context", "", "containerId", "", "animateEmoji", "showLinkDecorations", "shouldShowRoleDot", "shouldShowRoleOnName", "Lkotlin/Function1;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onLinkClicked", "onLongTapLink", "Lkotlin/Function3;", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapAttachmentLink", "Lkotlin/Function2;", "onLongPressAttachmentLink", "Lkotlin/Function6;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;", "onTapGameMention", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapInlineCode", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "linkStyle", "Lkotlin/Function0;", "onTapSpoiler", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapSoundmoji", "singleLine", "Lcom/discord/theme/DiscordThemeObject;", "theme", "baselineHeightPx", "emojiBaselineHeightOverridePx", "shouldOmitTopAndBottomHeadingSpacerNewLine", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "toSpannable", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Landroid/content/Context;Ljava/lang/String;ZZZZLandroid/graphics/Paint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLcom/discord/theme/DiscordThemeObject;FLjava/lang/Float;Z)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "Lcom/discord/chat/presentation/textutils/RenderContext;", "rc", "existingBuilder", "appendToExistingBuilder", "(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V", "builder", "isRootNode", "(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Z)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "imageUrl", "width", "height", ViewProps.FOREGROUND_COLOR, "cornerRadius", "iconPadding", "appendImage", "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FF)V", "content", "isOrderedList", "appendBulletPoint", "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Z)V", "iconType", "", "getIconSizeMultiplier", "(Ljava/lang/String;)D", "baselineHeight", "getIconSize", "(Ljava/lang/String;F)I", "iconSizePx", "getGameMentionIconCornerRadius", "(I)F", "getIconPaddingMultiplier", "(Ljava/lang/String;)F", ViewProps.BACKGROUND_COLOR, "Lcom/discord/span/utilities/spannable/BackgroundSpan;", "makeMentionBackgroundSpan", "(Lcom/discord/chat/presentation/textutils/RenderContext;I)Lcom/discord/span/utilities/spannable/BackgroundSpan;", "roleColor", "Lcom/discord/chat/bridge/rolecolors/RoleColors;", "roleColors", "maybeAddRoleDot", "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;ZZLandroid/content/Context;IILcom/discord/chat/bridge/rolecolors/RoleColors;)V", "simulateInlineNewline", "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V", "Landroid/text/SpannableStringBuilder;", "spacingDp", "appendHorizontalSpacing", "(Landroid/text/SpannableStringBuilder;I)V", "", "appendInlineCodeWithPadding", "(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;)V", "textSizeSp", "renderContext", "action", "changeTextSizeSp", "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;ILcom/discord/chat/presentation/textutils/RenderContext;Lkotlin/jvm/functions/Function2;)V", "size", "ensureTrailingSpacerNewLineOfSize", "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;I)V", "fixTrailingAbsoluteSizeSpanIfPresent", "", "FIRST_STRONG_ISOLATE", "C", "POP_DIRECTIONAL_ISOLATE", "CHANNEL_PREFIX", "Ljava/lang/String;", "COMMAND_PREFIX", "GAME_MENTION_ICON_CORNER_RADIUS_RATIO", "F", "INLINE_CODE_HORIZONTAL_PADDING_DP", "I", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUtils.kt\ncom/discord/chat/presentation/textutils/TextUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SpannableStringBuilderExtensions.kt\ncom/discord/span/utilities/SpannableStringBuilderExtensionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Uri.kt\nandroidx/core/net/UriKt\n+ 7 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n*L\n1#1,1501:1\n1878#2,2:1502\n1878#2,2:1687\n1878#2,3:1689\n1880#2:1692\n1880#2:1736\n57#3,5:1504\n62#3:1512\n43#3,4:1513\n47#3:1520\n78#3:1521\n43#3,4:1522\n47#3:1529\n43#3,4:1530\n47#3:1537\n57#3,5:1538\n62#3:1546\n43#3,4:1547\n47#3:1554\n43#3,4:1555\n47#3:1562\n43#3,4:1563\n47#3:1570\n43#3,4:1571\n47#3:1578\n70#3:1579\n43#3,3:1580\n43#3,4:1583\n47#3:1590\n46#3:1591\n47#3:1595\n43#3,4:1596\n47#3:1603\n43#3,4:1604\n47#3:1611\n92#3:1612\n43#3,4:1613\n47#3:1620\n70#3:1621\n43#3,4:1622\n47#3:1629\n70#3:1630\n43#3,4:1631\n47#3:1638\n43#3,4:1639\n47#3:1646\n43#3,3:1647\n43#3,4:1650\n47#3:1657\n43#3,4:1658\n47#3:1665\n43#3,4:1666\n47#3:1673\n43#3,4:1674\n47#3:1681\n46#3:1682\n47#3:1686\n70#3:1693\n43#3,4:1694\n47#3:1701\n43#3,4:1703\n47#3:1710\n85#3:1711\n43#3,4:1712\n47#3:1719\n43#3,4:1720\n47#3:1727\n43#3,4:1728\n47#3:1735\n43#3,4:1738\n47#3:1745\n43#3,4:1746\n47#3:1753\n43#3,4:1754\n47#3:1761\n43#3,4:1762\n47#3:1769\n43#3,4:1771\n47#3:1778\n43#3,4:1780\n47#3:1787\n57#3,5:1788\n62#3:1796\n13472#4:1509\n13473#4:1511\n13472#4:1517\n13473#4:1519\n13472#4:1526\n13473#4:1528\n13472#4:1534\n13473#4:1536\n13472#4:1543\n13473#4:1545\n13472#4:1551\n13473#4:1553\n13472#4:1559\n13473#4:1561\n13472#4:1567\n13473#4:1569\n13472#4:1575\n13473#4:1577\n13472#4:1587\n13473#4:1589\n13472#4:1592\n13473#4:1594\n13472#4:1600\n13473#4:1602\n13472#4:1608\n13473#4:1610\n13472#4:1617\n13473#4:1619\n13472#4:1626\n13473#4:1628\n13472#4:1635\n13473#4:1637\n13472#4:1643\n13473#4:1645\n13472#4:1654\n13473#4:1656\n13472#4:1662\n13473#4:1664\n13472#4:1670\n13473#4:1672\n13472#4:1678\n13473#4:1680\n13472#4:1683\n13473#4:1685\n13472#4:1698\n13473#4:1700\n13472#4:1707\n13473#4:1709\n13472#4:1716\n13473#4:1718\n13472#4:1724\n13473#4:1726\n13472#4:1732\n13473#4:1734\n13472#4:1742\n13473#4:1744\n13472#4:1750\n13473#4:1752\n13472#4:1758\n13473#4:1760\n13472#4:1766\n13473#4:1768\n13472#4:1775\n13473#4:1777\n13472#4:1784\n13473#4:1786\n13472#4:1793\n13473#4:1795\n1#5:1510\n1#5:1518\n1#5:1527\n1#5:1535\n1#5:1544\n1#5:1552\n1#5:1560\n1#5:1568\n1#5:1576\n1#5:1588\n1#5:1593\n1#5:1601\n1#5:1609\n1#5:1618\n1#5:1627\n1#5:1636\n1#5:1644\n1#5:1655\n1#5:1663\n1#5:1671\n1#5:1679\n1#5:1684\n1#5:1699\n1#5:1702\n1#5:1708\n1#5:1717\n1#5:1725\n1#5:1733\n1#5:1743\n1#5:1751\n1#5:1759\n1#5:1767\n1#5:1776\n1#5:1785\n1#5:1794\n29#6:1737\n34#7:1770\n34#7:1779\n*S KotlinDebug\n*F\n+ 1 TextUtils.kt\ncom/discord/chat/presentation/textutils/TextUtilsKt\n*L\n309#1:1502,2\n981#1:1687,2\n986#1:1689,3\n981#1:1692\n309#1:1736\n377#1:1504,5\n377#1:1512\n391#1:1513,4\n391#1:1520\n401#1:1521\n401#1:1522,4\n401#1:1529\n421#1:1530,4\n421#1:1537\n467#1:1538,5\n467#1:1546\n562#1:1547,4\n562#1:1554\n600#1:1555,4\n600#1:1562\n638#1:1563,4\n638#1:1570\n672#1:1571,4\n672#1:1578\n737#1:1579\n737#1:1580,3\n738#1:1583,4\n738#1:1590\n737#1:1591\n737#1:1595\n757#1:1596,4\n757#1:1603\n820#1:1604,4\n820#1:1611\n828#1:1612\n828#1:1613,4\n828#1:1620\n874#1:1621\n874#1:1622,4\n874#1:1629\n893#1:1630\n893#1:1631,4\n893#1:1638\n909#1:1639,4\n909#1:1646\n938#1:1647,3\n939#1:1650,4\n939#1:1657\n940#1:1658,4\n940#1:1665\n950#1:1666,4\n950#1:1673\n952#1:1674,4\n952#1:1681\n938#1:1682\n938#1:1686\n1036#1:1693\n1036#1:1694,4\n1036#1:1701\n1066#1:1703,4\n1066#1:1710\n1071#1:1711\n1071#1:1712,4\n1071#1:1719\n1164#1:1720,4\n1164#1:1727\n1166#1:1728,4\n1166#1:1735\n1273#1:1738,4\n1273#1:1745\n1301#1:1746,4\n1301#1:1753\n1393#1:1754,4\n1393#1:1761\n1435#1:1762,4\n1435#1:1769\n1481#1:1771,4\n1481#1:1778\n1499#1:1780,4\n1499#1:1787\n854#1:1788,5\n854#1:1796\n377#1:1509\n377#1:1511\n391#1:1517\n391#1:1519\n401#1:1526\n401#1:1528\n421#1:1534\n421#1:1536\n467#1:1543\n467#1:1545\n562#1:1551\n562#1:1553\n600#1:1559\n600#1:1561\n638#1:1567\n638#1:1569\n672#1:1575\n672#1:1577\n738#1:1587\n738#1:1589\n737#1:1592\n737#1:1594\n757#1:1600\n757#1:1602\n820#1:1608\n820#1:1610\n828#1:1617\n828#1:1619\n874#1:1626\n874#1:1628\n893#1:1635\n893#1:1637\n909#1:1643\n909#1:1645\n939#1:1654\n939#1:1656\n940#1:1662\n940#1:1664\n950#1:1670\n950#1:1672\n952#1:1678\n952#1:1680\n938#1:1683\n938#1:1685\n1036#1:1698\n1036#1:1700\n1066#1:1707\n1066#1:1709\n1071#1:1716\n1071#1:1718\n1164#1:1724\n1164#1:1726\n1166#1:1732\n1166#1:1734\n1273#1:1742\n1273#1:1744\n1301#1:1750\n1301#1:1752\n1393#1:1758\n1393#1:1760\n1435#1:1766\n1435#1:1768\n1481#1:1775\n1481#1:1777\n1499#1:1784\n1499#1:1786\n854#1:1793\n854#1:1795\n377#1:1510\n391#1:1518\n401#1:1527\n421#1:1535\n467#1:1544\n562#1:1552\n600#1:1560\n638#1:1568\n672#1:1576\n738#1:1588\n737#1:1593\n757#1:1601\n820#1:1609\n828#1:1618\n874#1:1627\n893#1:1636\n909#1:1644\n939#1:1655\n940#1:1663\n950#1:1671\n952#1:1679\n938#1:1684\n1036#1:1699\n1066#1:1708\n1071#1:1717\n1164#1:1725\n1166#1:1733\n1273#1:1743\n1301#1:1751\n1393#1:1759\n1435#1:1767\n1481#1:1776\n1499#1:1785\n854#1:1794\n1205#1:1737\n1470#1:1770\n1498#1:1779\n*E\n"})
public final class TextUtilsKt {

    @NotNull
    private static final String CHANNEL_PREFIX = "#";

    @NotNull
    private static final String COMMAND_PREFIX = "/";
    private static final char FIRST_STRONG_ISOLATE = 8296;
    private static final float GAME_MENTION_ICON_CORNER_RADIUS_RATIO = 0.25f;
    private static final int INLINE_CODE_HORIZONTAL_PADDING_DP = 2;
    private static final char POP_DIRECTIONAL_ISOLATE = 8297;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StaticChannelMentionType.values().length];
            try {
                iArr[StaticChannelMentionType.Home.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StaticChannelMentionType.Guide.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StaticChannelMentionType.Browse.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StaticChannelMentionType.Customize.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StaticChannelMentionType.LinkedRoles.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void appendBulletPoint(DraweeSpanStringBuilder draweeSpanStringBuilder, List<? extends ContentNode> list, RenderContext renderContext, boolean z5) throws IOException {
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        int listNestedLevel = renderContext.getListNestedLevel();
        LeadingMarginSpan.Standard standard = new LeadingMarginSpan.Standard(SizeUtilsKt.getDpToPx(listNestedLevel * 16));
        VerticalPaddingSpan verticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(2));
        if (!z5) {
            if (renderContext.getSingleLine()) {
                appendToExistingBuilder(c0.c(new TextContentNode(renderContext.getListNestedLevel() == 0 ? "•  " : "◦  ")), renderContext, draweeSpanStringBuilder);
                appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
                return;
            }
            BulletSpan bulletSpan = new BulletSpan(renderContext.spoilerIsHidden() ? renderContext.getTheme().getSpoilerHiddenBackground() : ColorUtilsKt.getThemeColor(renderContext.getContext(), R.color.primary_360, R.color.primary_400, renderContext.getTheme()), dpToPx, false, SizeUtilsKt.getDpToPx(2), 0.0f, listNestedLevel > 0 ? Paint.Style.STROKE : Paint.Style.FILL, 20, null);
            SpannableStringBuilderExtensionsKt.ensureNewline$default(draweeSpanStringBuilder, null, 1, null);
            Object[] objArr = {standard, bulletSpan, verticalPaddingSpan};
            int length = draweeSpanStringBuilder.length();
            appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
            for (int i7 = 0; i7 < 3; i7++) {
                Object obj = objArr[i7];
                if (obj != null) {
                    draweeSpanStringBuilder.setSpan(obj, length, draweeSpanStringBuilder.length(), 33);
                }
            }
            return;
        }
        Long listOrderedIndex = renderContext.getListOrderedIndex();
        long jLongValue = listOrderedIndex != null ? listOrderedIndex.longValue() : 1L;
        Long listLargestOrderedIndex = renderContext.getListLargestOrderedIndex();
        long jLongValue2 = listLargestOrderedIndex != null ? listLargestOrderedIndex.longValue() : 1L;
        if (renderContext.getSingleLine()) {
            appendToExistingBuilder(c0.c(new TextContentNode(jLongValue + ".  ")), renderContext, draweeSpanStringBuilder);
            appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
            return;
        }
        long j = jLongValue;
        Integer numValueOf = null;
        Paint paint = renderContext.getPaint();
        if (renderContext.spoilerIsHidden()) {
            numValueOf = Integer.valueOf(renderContext.getTheme().getSpoilerHiddenBackground());
        }
        OrderedListBulletSpan orderedListBulletSpan = new OrderedListBulletSpan(j, dpToPx, jLongValue2, paint, numValueOf);
        SpannableStringBuilderExtensionsKt.ensureNewline$default(draweeSpanStringBuilder, 0, 1, numValueOf);
        Object[] objArr2 = {standard, orderedListBulletSpan, verticalPaddingSpan};
        int length2 = draweeSpanStringBuilder.length();
        appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
        for (int i10 = 0; i10 < 3; i10++) {
            Object obj2 = objArr2[i10];
            if (obj2 != null) {
                draweeSpanStringBuilder.setSpan(obj2, length2, draweeSpanStringBuilder.length(), 33);
            }
        }
    }

    private static final void appendHorizontalSpacing(SpannableStringBuilder spannableStringBuilder, int i7) {
        Object[] objArr = {new HorizontalSpacerSpan(SizeUtilsKt.getDpToPx(i7))};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 8203);
        Object obj = objArr[0];
        if (obj != null) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
    }

    public static final void appendImage(@NotNull DraweeSpanStringBuilder draweeSpanStringBuilder, @NotNull Context context, @NotNull RenderContext rc2, @NotNull String imageUrl, int i7, int i10, Integer num, float f2, float f7) {
        Intrinsics.checkNotNullParameter(draweeSpanStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc2, "rc");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        int length = draweeSpanStringBuilder.length();
        draweeSpanStringBuilder.append((char) 8203);
        Uri uri = Uri.parse(ReactAssetUtilsKt.getReactImageUrl(context, imageUrl));
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(uri);
        Intrinsics.checkNotNullExpressionValue(imageRequestBuilderD, "newBuilderWithSource(...)");
        ImageRequestBuilder imageRequestBuilderApplyDiscordDiskCachePolicy = DiskCachePolicyKt.applyDiscordDiskCachePolicy(imageRequestBuilderD, uri);
        PipelineDraweeControllerBuilder pipelineDraweeControllerBuilderA = a.f3531a.get();
        pipelineDraweeControllerBuilderA.f4633b = imageRequestBuilderApplyDiscordDiskCachePolicy.a();
        c cVarA = pipelineDraweeControllerBuilderA.a();
        Intrinsics.checkNotNullExpressionValue(cVarA, "build(...)");
        GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(context.getResources());
        genericDraweeHierarchyBuilder.f4714l = o.f4692f;
        b bVar = new b();
        float[] fArr = new float[8];
        bVar.f11404c = fArr;
        Arrays.fill(fArr, f2);
        i.b("the padding cannot be < 0", f7 >= 0.0f);
        bVar.f11408g = f7;
        bVar.f11402a = 2;
        genericDraweeHierarchyBuilder.f4719q = bVar;
        if (rc2.spoilerIsHidden()) {
            genericDraweeHierarchyBuilder.f4715m = new PorterDuffColorFilter(rc2.getTheme().getSpoilerHiddenBackground(), PorterDuff.Mode.SRC_IN);
        } else if (num != null) {
            genericDraweeHierarchyBuilder.f4715m = new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
        Intrinsics.checkNotNullExpressionValue(genericDraweeHierarchyBuilder, "apply(...)");
        draweeSpanStringBuilder.c(genericDraweeHierarchyBuilder.a(), cVarA, length, i7, i10, 2);
    }

    public static /* synthetic */ void appendImage$default(DraweeSpanStringBuilder draweeSpanStringBuilder, Context context, RenderContext renderContext, String str, int i7, int i10, Integer num, float f2, float f7, int i11, Object obj) {
        appendImage(draweeSpanStringBuilder, context, renderContext, str, i7, i10, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? 0.0f : f2, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 0.0f : f7);
    }

    private static final void appendInlineCodeWithPadding(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return;
        }
        appendHorizontalSpacing(spannableStringBuilder, 2);
        spannableStringBuilder.append((char) 8288);
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((char) 8288);
        appendHorizontalSpacing(spannableStringBuilder, 2);
    }

    private static final void appendToExistingBuilder(List<? extends ContentNode> list, RenderContext renderContext, DraweeSpanStringBuilder draweeSpanStringBuilder) throws IOException {
        toSpannable(list, renderContext, draweeSpanStringBuilder, false);
    }

    private static final void changeTextSizeSp(DraweeSpanStringBuilder draweeSpanStringBuilder, int i7, RenderContext renderContext, Function2<? super DraweeSpanStringBuilder, ? super RenderContext, Unit> function2) {
        int scaledSpToPx = FontManager.INSTANCE.getScaledSpToPx(i7, renderContext.getContext());
        RenderContext renderContextCopy$default = RenderContext.copy$default(renderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, getBaselineHeightForFontSizePx(renderContext.getPaint(), scaledSpToPx), null, false, Integer.MAX_VALUE, 2, null);
        Object[] objArr = {new AbsoluteSizeSpan(scaledSpToPx)};
        int length = draweeSpanStringBuilder.length();
        function2.invoke(draweeSpanStringBuilder, renderContextCopy$default);
        Object obj = objArr[0];
        if (obj != null) {
            draweeSpanStringBuilder.setSpan(obj, length, draweeSpanStringBuilder.length(), 33);
        }
    }

    private static final void ensureTrailingSpacerNewLineOfSize(DraweeSpanStringBuilder draweeSpanStringBuilder, int i7) throws IOException {
        if (draweeSpanStringBuilder.length() > 0) {
            SpannableStringBuilderExtensionsKt.ensureNewline$default(draweeSpanStringBuilder, null, 1, null);
            VerticalSpacerSpan verticalSpacerSpan = (VerticalSpacerSpan) y.t(draweeSpanStringBuilder.getSpans(draweeSpanStringBuilder.length() - 1, draweeSpanStringBuilder.length(), VerticalSpacerSpan.class));
            if (verticalSpacerSpan != null) {
                if (verticalSpacerSpan.getSize() < i7) {
                    SpannableStringBuilderExtensionsKt.replaceSpan(draweeSpanStringBuilder, verticalSpacerSpan, new VerticalSpacerSpan(i7));
                    return;
                }
                return;
            }
        }
        Object[] objArr = {new VerticalSpacerSpan(i7)};
        int length = draweeSpanStringBuilder.length();
        draweeSpanStringBuilder.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        Object obj = objArr[0];
        if (obj != null) {
            draweeSpanStringBuilder.setSpan(obj, length, draweeSpanStringBuilder.length(), 33);
        }
    }

    private static final void fixTrailingAbsoluteSizeSpanIfPresent(DraweeSpanStringBuilder draweeSpanStringBuilder) {
        AbsoluteSizeSpan absoluteSizeSpan;
        if (StringsKt.F(draweeSpanStringBuilder, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE) && (absoluteSizeSpan = (AbsoluteSizeSpan) y.t(draweeSpanStringBuilder.getSpans(draweeSpanStringBuilder.length() - 1, draweeSpanStringBuilder.length(), AbsoluteSizeSpan.class))) != null) {
            Object[] objArr = {new AbsoluteSizeSpan(absoluteSizeSpan.getSize())};
            int length = draweeSpanStringBuilder.length();
            draweeSpanStringBuilder.append("\u200b");
            Object obj = objArr[0];
            if (obj != null) {
                draweeSpanStringBuilder.setSpan(obj, length, draweeSpanStringBuilder.length(), 33);
            }
        }
    }

    public static final float getBaselineHeightForFontSizePx(@NotNull Paint paint, int i7) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        float textSize = paint.getTextSize();
        paint.setTextSize(i7);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        Intrinsics.checkNotNullExpressionValue(fontMetrics, "getFontMetrics(...)");
        float baselineHeightPx = getBaselineHeightPx(fontMetrics);
        paint.setTextSize(textSize);
        return baselineHeightPx;
    }

    public static final float getBaselineHeightPx(@NotNull Paint.FontMetrics fontMetrics) {
        Intrinsics.checkNotNullParameter(fontMetrics, "fontMetrics");
        return fontMetrics.descent - fontMetrics.ascent;
    }

    private static final float getGameMentionIconCornerRadius(int i7) {
        return i7 * GAME_MENTION_ICON_CORNER_RADIUS_RATIO;
    }

    private static final float getIconPaddingMultiplier(String str) {
        return (Intrinsics.areEqual(str, "post") || Intrinsics.areEqual(str, "forum")) ? 0.2f : 0.0f;
    }

    public static final int getIconSize(String str, float f2) {
        return f2 >= 0.0f ? (int) (((double) f2) * getIconSizeMultiplier(str)) : SizeUtilsKt.getDpToPx(20);
    }

    private static final double getIconSizeMultiplier(String str) {
        if (str == null) {
            return 0.75d;
        }
        switch (str.hashCode()) {
            case -1480766844:
                return !str.equals("_caret") ? 0.75d : 0.55d;
            case -1478565049:
                return !str.equals("_emoji") ? 0.75d : 0.963d;
            case -1476485388:
                return !str.equals("_guild") ? 0.75d : 0.85d;
            case 3446944:
                return !str.equals("post") ? 0.75d : 0.65d;
            case 97619233:
                return !str.equals("forum") ? 0.75d : 0.65d;
            default:
                return 0.75d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final BackgroundSpan makeMentionBackgroundSpan(RenderContext renderContext, int i7) {
        if (renderContext.spoilerExists()) {
            i7 = renderContext.getTheme().getSpoilerHiddenBackground();
        }
        return new BackgroundSpan(new BackgroundStyle(i7, renderContext.spoilerExists() ? 0 : 3, 0, 4, (DefaultConstructorMarker) null), 0 == true ? 1 : 0, null, 6, null);
    }

    private static final void maybeAddRoleDot(DraweeSpanStringBuilder draweeSpanStringBuilder, boolean z5, boolean z6, Context context, int i7, int i10, RoleColors roleColors) {
        if (z5) {
            RoleDotSpan roleDotSpan = new RoleDotSpan(context, i7, z6 ? 16 : 20);
            if (roleColors == null) {
                roleColors = new RoleColors(i10, null, null);
            }
            roleDotSpan.setColors(roleColors);
            draweeSpanStringBuilder.append(CHANNEL_PREFIX);
            draweeSpanStringBuilder.setSpan(roleDotSpan, draweeSpanStringBuilder.length() - 1, draweeSpanStringBuilder.length(), 33);
            draweeSpanStringBuilder.append(" ");
        }
    }

    private static final void simulateInlineNewline(DraweeSpanStringBuilder draweeSpanStringBuilder) {
        draweeSpanStringBuilder.append("    ");
    }

    @NotNull
    public static final DraweeSpanStringBuilder toSpannable(@NotNull StructurableText structurableText, @NotNull Context context, @NotNull String containerId, boolean z5, boolean z6, boolean z7, boolean z10, @NotNull Paint paint, @NotNull Function1<? super LinkContentNode, Unit> onLinkClicked, @NotNull Function1<? super LinkContentNode, Unit> onLongTapLink, @NotNull Function3 onTapChannel, @NotNull Function4 onLongPressChannel, @NotNull Function1<? super String, Unit> onTapAttachmentLink, @NotNull Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, @NotNull Function1<? super GameMentionContentNode, Unit> onTapGameMention, @NotNull Function1<? super String, Unit> onTapTimestamp, @NotNull Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function1<? super LinkContentNode, LinkStyle> linkStyle, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji, boolean z11, @NotNull DiscordThemeObject theme, float f2, Float f7, boolean z12) {
        Intrinsics.checkNotNullParameter(structurableText, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(onLinkClicked, "onLinkClicked");
        Intrinsics.checkNotNullParameter(onLongTapLink, "onLongTapLink");
        Intrinsics.checkNotNullParameter(onTapChannel, "onTapChannel");
        Intrinsics.checkNotNullParameter(onLongPressChannel, "onLongPressChannel");
        Intrinsics.checkNotNullParameter(onTapAttachmentLink, "onTapAttachmentLink");
        Intrinsics.checkNotNullParameter(onLongPressAttachmentLink, "onLongPressAttachmentLink");
        Intrinsics.checkNotNullParameter(onTapMention, "onTapMention");
        Intrinsics.checkNotNullParameter(onTapCommand, "onTapCommand");
        Intrinsics.checkNotNullParameter(onLongPressCommand, "onLongPressCommand");
        Intrinsics.checkNotNullParameter(onTapGameMention, "onTapGameMention");
        Intrinsics.checkNotNullParameter(onTapTimestamp, "onTapTimestamp");
        Intrinsics.checkNotNullParameter(onTapInlineCode, "onTapInlineCode");
        Intrinsics.checkNotNullParameter(onTapEmoji, "onTapEmoji");
        Intrinsics.checkNotNullParameter(linkStyle, "linkStyle");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapSoundmoji, "onTapSoundmoji");
        Intrinsics.checkNotNullParameter(theme, "theme");
        if (!(structurableText instanceof AnnotatedStructurableText)) {
            if (structurableText instanceof PrimitiveStructurableText) {
                return new DraweeSpanStringBuilder(((PrimitiveStructurableText) structurableText).getContent());
            }
            throw new n();
        }
        return toSpannable$default(((AnnotatedStructurableText) structurableText).getContent(), new RenderContext(context, containerId, onLinkClicked, onLongTapLink, linkStyle, onTapChannel, onLongPressChannel, onTapAttachmentLink, onLongPressAttachmentLink, onTapMention, onTapCommand, onLongPressCommand, onTapGameMention, onTapSpoiler, onTapTimestamp, onTapInlineCode, onTapEmoji, onTapSoundmoji, z5, z6, z7, z10, z11, paint, null, 0, null, null, false, null, theme, f2, f7, z12, 1056964608, 0, null), null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$0(LinkContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$1(LinkContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$10(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$11(InlineCodeContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$12(EmojiContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkStyle toSpannable$lambda$13(LinkContentNode linkContentNode) {
        Intrinsics.checkNotNullParameter(linkContentNode, "<unused var>");
        return new LinkStyle(null, 0, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$15(SoundmojiContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$2(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$3(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$4(String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$5(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$6(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$7(CommandMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RenderContext.Insets toSpannable$lambda$71$lambda$17$lambda$16(QuoteSpan quoteSpan, RenderContext.Insets updateInsets) {
        Intrinsics.checkNotNullParameter(updateInsets, "$this$updateInsets");
        return RenderContext.Insets.copy$default(updateInsets, 0, 0, quoteSpan.getInsetStart() + updateInsets.getStart(), 0, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$20(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getOnTapInlineCode().invoke(contentNode);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toSpannable$lambda$71$lambda$22(ContentNode contentNode, RenderContext renderContext, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!((LinkContentNode) contentNode).getIsUrl()) {
            return false;
        }
        renderContext.getOnLongTapLink().invoke(contentNode);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$23(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getOnTapLink().invoke(contentNode);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$27(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function6 onTapMention = renderContext.getOnTapMention();
        UserOrRoleMentionContentNode userOrRoleMentionContentNode = (UserOrRoleMentionContentNode) contentNode;
        UserId userIdM419getUserIdwUX8bhU = userOrRoleMentionContentNode.m419getUserIdwUX8bhU();
        String strM1215toStringimpl = userIdM419getUserIdwUX8bhU != null ? UserId.m1215toStringimpl(userIdM419getUserIdwUX8bhU.m1217unboximpl()) : null;
        String strValueOf = String.valueOf(userOrRoleMentionContentNode.m416getChannelIdqMVnFVQ());
        String roleName = userOrRoleMentionContentNode.getRoleName();
        String string = roleName != null ? roleName.toString() : null;
        String parsedUserId = userOrRoleMentionContentNode.getParsedUserId();
        String string2 = parsedUserId != null ? parsedUserId.toString() : null;
        RoleId roleIdM418getRoleIdfYaclRY = userOrRoleMentionContentNode.m418getRoleIdfYaclRY();
        String strM1189toStringimpl = roleIdM418getRoleIdfYaclRY != null ? RoleId.m1189toStringimpl(roleIdM418getRoleIdfYaclRY.m1191unboximpl()) : null;
        GuildId guildIdM417getGuildIdqOKuAAo = userOrRoleMentionContentNode.m417getGuildIdqOKuAAo();
        onTapMention.invoke(strM1215toStringimpl, strValueOf, string, string2, strM1189toStringimpl, guildIdM417getGuildIdqOKuAAo != null ? GuildId.m1150toStringimpl(guildIdM417getGuildIdqOKuAAo.m1152unboximpl()) : null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toSpannable$lambda$71$lambda$29(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ChannelMentionContentNode channelMentionContentNode = (ChannelMentionContentNode) contentNode;
        renderContext.getOnLongPressChannel().invoke(channelMentionContentNode.getChannelId(), channelMentionContentNode.getGuildId(), channelMentionContentNode.getMessageId(), channelMentionContentNode.getOriginalLink());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$30(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ChannelMentionContentNode channelMentionContentNode = (ChannelMentionContentNode) contentNode;
        renderContext.getOnTapChannel().invoke(channelMentionContentNode.getChannelId(), channelMentionContentNode.getGuildId(), channelMentionContentNode.getMessageId());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toSpannable$lambda$71$lambda$33(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AttachmentLinkContentNode attachmentLinkContentNode = (AttachmentLinkContentNode) contentNode;
        renderContext.getOnLongPressAttachmentLink().invoke(attachmentLinkContentNode.getAttachmentUrl(), attachmentLinkContentNode.getAttachmentName());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$34(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getOnTapAttachmentLink().invoke(((AttachmentLinkContentNode) contentNode).getAttachmentUrl());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$36(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        StaticChannelMentionContentNode staticChannelMentionContentNode = (StaticChannelMentionContentNode) contentNode;
        renderContext.getOnTapChannel().invoke(staticChannelMentionContentNode.getId().getId(), String.valueOf(staticChannelMentionContentNode.m409getGuildIdqOKuAAo()), String.valueOf(staticChannelMentionContentNode.getItemId()));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toSpannable$lambda$71$lambda$38(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getOnLongPressCommand().invoke(contentNode);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$39(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getOnTapCommand().invoke(contentNode);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$42(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getOnTapGameMention().invoke(contentNode);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$44(String str, RenderContext renderContext) {
        SpoilerManager.INSTANCE.m453markRevealedV2PEE7g(str);
        renderContext.getOnTapSpoiler().invoke();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$46$lambda$45(Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        function0.invoke();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$50(DraweeSpanStringBuilder draweeSpanStringBuilder, ForegroundColorSpan foregroundColorSpan, ContentNode contentNode, DraweeSpanStringBuilder changeTextSizeSp, RenderContext updatedRC) throws IOException {
        Intrinsics.checkNotNullParameter(changeTextSizeSp, "$this$changeTextSizeSp");
        Intrinsics.checkNotNullParameter(updatedRC, "updatedRC");
        int length = draweeSpanStringBuilder.length();
        appendToExistingBuilder(((SubtextContentNode) contentNode).getContent(), updatedRC, draweeSpanStringBuilder);
        Object obj = new Object[]{foregroundColorSpan}[0];
        if (obj != null) {
            draweeSpanStringBuilder.setSpan(obj, length, draweeSpanStringBuilder.length(), 13107233);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$53$lambda$52(ContentNode contentNode, DraweeSpanStringBuilder draweeSpanStringBuilder, DraweeSpanStringBuilder changeTextSizeSp, RenderContext updatedRc) throws IOException {
        Intrinsics.checkNotNullParameter(changeTextSizeSp, "$this$changeTextSizeSp");
        Intrinsics.checkNotNullParameter(updatedRc, "updatedRc");
        appendToExistingBuilder(((HeadingContentNode) contentNode).getContent(), updatedRc, draweeSpanStringBuilder);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$64(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getOnTapTimestamp().invoke(((TimestampContentNode) contentNode).getFull());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$67(RenderContext renderContext, ContentNode contentNode, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getOnTapSoundmoji().invoke(contentNode);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$70(DraweeSpanStringBuilder draweeSpanStringBuilder, ContentNode contentNode, Context context, RenderContext renderContext, SpannableStringBuilder spannableStringBuilder) {
        DraweeSpanStringBuilder draweeSpanStringBuilder2;
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        draweeSpanStringBuilder.append("  ");
        SoundmojiContentNode soundmojiContentNode = (SoundmojiContentNode) contentNode;
        RenderableEmoji renderableEmoji = SoundmojiContentNodeKt.toRenderableEmoji(soundmojiContentNode);
        if (renderableEmoji != null) {
            Float emojiBaselineHeightOverridePx = renderContext.getEmojiBaselineHeightOverridePx();
            draweeSpanStringBuilder2 = draweeSpanStringBuilder;
            RenderableEmojiKt.renderEmojiInto$default(draweeSpanStringBuilder2, renderableEmoji, context, getIconSize("_emoji", (emojiBaselineHeightOverridePx != null ? emojiBaselineHeightOverridePx.floatValue() : renderContext.getBaselineHeightPx()) * 0.8f), false, 0, new n6.b(renderContext, 1), 32, null);
            draweeSpanStringBuilder2.append(" ");
        } else {
            draweeSpanStringBuilder2 = draweeSpanStringBuilder;
        }
        String content = soundmojiContentNode.getContent();
        draweeSpanStringBuilder2.append((CharSequence) (content != null ? x.l(content, " ", " ", false) : null));
        draweeSpanStringBuilder2.append("  ");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$71$lambda$70$lambda$69$lambda$68(RenderContext renderContext, GenericDraweeHierarchyBuilder renderEmojiInto) {
        Intrinsics.checkNotNullParameter(renderEmojiInto, "$this$renderEmojiInto");
        EmojiRendererKt.handleEmojiSpoiler(renderEmojiInto, renderContext, true);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$8(CommandMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toSpannable$lambda$9(GameMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x04f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:178:0x04fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:180:0x0505  */
    private static final DraweeSpanStringBuilder toSpannable(List<? extends ContentNode> list, RenderContext renderContext, DraweeSpanStringBuilder draweeSpanStringBuilder, boolean z5) throws IOException {
        int backgroundCode;
        Integer num;
        DraweeSpanStringBuilder draweeSpanStringBuilder2;
        boolean z6;
        DraweeSpanStringBuilder draweeSpanStringBuilder3;
        int spoilerRevealedBackground;
        long jLongValue;
        long jLongValue2;
        int mobileTextHeadingPrimary;
        int i7;
        int dpToPx;
        int i10;
        int i11;
        int spoilerHiddenBackground;
        int i12;
        DraweeSpanStringBuilder draweeSpanStringBuilder4;
        RenderContext renderContext2;
        DraweeSpanStringBuilder draweeSpanStringBuilder5;
        int iE;
        int iE2;
        Object foregroundColorSpan;
        boolean z7;
        BackgroundSpan backgroundSpan;
        int i13;
        ContentNode contentNode;
        BackgroundSpan backgroundSpan2;
        RelativeSizeSpan relativeSizeSpan;
        DiscordFontSpan discordFontSpan;
        ClickableSpan clickableSpan;
        RenderContext renderContext3 = renderContext;
        DraweeSpanStringBuilder draweeSpanStringBuilder6 = draweeSpanStringBuilder;
        Integer num2 = -1;
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 >= 0) {
                ContentNode contentNode2 = (ContentNode) obj;
                boolean z10 = i14 == d0.f(list);
                Context context = renderContext3.getContext();
                if (renderContext3.spoilerIsHidden()) {
                    backgroundCode = renderContext3.getTheme().getSpoilerHiddenBackground();
                } else {
                    backgroundCode = renderContext3.getTheme().getBackgroundCode();
                }
                BackgroundSpan backgroundSpan3 = new BackgroundSpan(new BackgroundStyle(backgroundCode, 4, 0, 4, (DefaultConstructorMarker) null), renderContext3.spoilerIsHidden() ? null : new BorderStyle(renderContext3.getTheme().getBorderNormal(), SizeUtilsKt.getDpToPx(1)), null, 4, null);
                RelativeSizeSpan relativeSizeSpan2 = new RelativeSizeSpan(0.85f);
                DiscordFontSpan discordFontSpan2 = new DiscordFontSpan(context, DiscordFont.CodeNormal);
                int themeColor = ColorUtilsKt.getThemeColor(context, com.discord.chat.R.color.chat_mentions_background_light, com.discord.chat.R.color.chat_mentions_background_dark, renderContext3.getTheme());
                int themeColor2 = ColorUtilsKt.getThemeColor(context, com.discord.chat.R.color.chat_mentions_foreground_light, com.discord.chat.R.color.chat_mentions_foreground_dark, renderContext3.getTheme());
                int i16 = R.color.green_330;
                int iE3 = b1.c.e(ColorUtilsKt.getThemeColor(context, i16, i16, renderContext3.getTheme()), 25);
                int i17 = R.color.green_330;
                int themeColor3 = ColorUtilsKt.getThemeColor(context, i17, i17, renderContext3.getTheme());
                int i18 = 7;
                int i19 = 0;
                final int i20 = 8;
                if (contentNode2 instanceof BlockQuoteContentNode) {
                    if (renderContext3.getSingleLine()) {
                        draweeSpanStringBuilder6.append("> ");
                        appendToExistingBuilder(((BlockQuoteContentNode) contentNode2).getContent(), renderContext3, draweeSpanStringBuilder6);
                    } else {
                        QuoteSpan quoteSpan = new QuoteSpan(renderContext3.spoilerIsHidden() ? renderContext3.getTheme().getSpoilerHiddenBackground() : renderContext3.getTheme().getSpineDefault(), SizeUtilsKt.getDpToPx(4), SizeUtilsKt.getDpToPx(8));
                        ensureTrailingSpacerNewLineOfSize(draweeSpanStringBuilder6, SizeUtilsKt.getDpToPx(2));
                        int length = draweeSpanStringBuilder6.length();
                        appendToExistingBuilder(((BlockQuoteContentNode) contentNode2).getContent(), renderContext3.updateInsets(new kotlin.collections.a(i18, quoteSpan)), draweeSpanStringBuilder6);
                        Object obj2 = new Object[]{quoteSpan}[0];
                        if (obj2 != null) {
                            draweeSpanStringBuilder6.setSpan(obj2, length, draweeSpanStringBuilder6.length(), 13107233);
                        }
                        ensureTrailingSpacerNewLineOfSize(draweeSpanStringBuilder6, SizeUtilsKt.getDpToPx(2));
                    }
                    Unit unit = Unit.f14616a;
                } else if (contentNode2 instanceof CodeBlockContentNode) {
                    if (renderContext3.getSingleLine()) {
                        Object[] objArr = {backgroundSpan3, relativeSizeSpan2, discordFontSpan2};
                        int length2 = draweeSpanStringBuilder6.length();
                        appendInlineCodeWithPadding(draweeSpanStringBuilder6, x.m(((CodeBlockContentNode) contentNode2).getContent(), '\n', ' '));
                        for (int i21 = 0; i21 < 3; i21++) {
                            Object obj3 = objArr[i21];
                            if (obj3 != null) {
                                draweeSpanStringBuilder6.setSpan(obj3, length2, draweeSpanStringBuilder6.length(), 33);
                            }
                        }
                    } else {
                        CodeStyle.INSTANCE.renderCodeBlock(draweeSpanStringBuilder6, (CodeBlockContentNode) contentNode2, renderContext3);
                        Unit unit2 = Unit.f14616a;
                    }
                } else if (contentNode2 instanceof EmojiContentNode) {
                    EmojiRendererKt.renderEmoji(draweeSpanStringBuilder6, (EmojiContentNode) contentNode2, renderContext3);
                    Unit unit3 = Unit.f14616a;
                } else {
                    if (contentNode2 instanceof EmphasisContentNode) {
                        Object[] objArr2 = {new GGSansItalicSpan(renderContext3.getContext())};
                        int length3 = draweeSpanStringBuilder6.length();
                        appendToExistingBuilder(((EmphasisContentNode) contentNode2).getContent(), renderContext3, draweeSpanStringBuilder6);
                        Object obj4 = objArr2[0];
                        if (obj4 != null) {
                            draweeSpanStringBuilder6.setSpan(obj4, length3, draweeSpanStringBuilder6.length(), 33);
                        }
                    } else if (contentNode2 instanceof InlineCodeContentNode) {
                        if (renderContext3.getInLink()) {
                            contentNode = contentNode2;
                            num = num2;
                            backgroundSpan2 = backgroundSpan3;
                            relativeSizeSpan = relativeSizeSpan2;
                            discordFontSpan = discordFontSpan2;
                            clickableSpan = null;
                        } else {
                            Integer num3 = num2;
                            contentNode = contentNode2;
                            discordFontSpan = discordFontSpan2;
                            backgroundSpan2 = backgroundSpan3;
                            relativeSizeSpan = relativeSizeSpan2;
                            clickableSpan = new ClickableSpan(null, num3, null, null, 0.0f, null, null, new p(i20, renderContext3, (InlineCodeContentNode) contentNode2), 125, null);
                            num = num3;
                        }
                        Object[] objArr3 = {clickableSpan, backgroundSpan2, relativeSizeSpan, discordFontSpan, !renderContext3.getInLink() ? new ForegroundColorSpan(renderContext3.getTheme().getTextDefault()) : null};
                        int length4 = draweeSpanStringBuilder6.length();
                        appendInlineCodeWithPadding(draweeSpanStringBuilder6, ((InlineCodeContentNode) contentNode).getContent());
                        for (int i22 = 0; i22 < 5; i22++) {
                            Object obj5 = objArr3[i22];
                            if (obj5 != null) {
                                draweeSpanStringBuilder6.setSpan(obj5, length4, draweeSpanStringBuilder6.length(), 33);
                            }
                        }
                    } else {
                        num = num2;
                        if (!(contentNode2 instanceof LineBreakContentNode) && !(contentNode2 instanceof NewLineContentNode)) {
                            if (contentNode2 instanceof LinkContentNode) {
                                LinkStyle linkStyle = (LinkStyle) renderContext3.getLinkStyle().invoke(contentNode2);
                                LinkContentNode linkContentNode = (LinkContentNode) contentNode2;
                                Integer linkColor = linkContentNode.getLinkColor();
                                int iIntValue = linkColor != null ? linkColor.intValue() : linkStyle.getLinkColor();
                                Boolean shouldShowRoleDot = linkContentNode.getShouldShowRoleDot();
                                Boolean bool = Boolean.TRUE;
                                boolean zAreEqual = Intrinsics.areEqual(shouldShowRoleDot, bool);
                                RoleColors androidColors = RoleColorsKt.toAndroidColors(linkContentNode.getRoleColors());
                                RoleColors roleColors = zAreEqual ? null : androidColors;
                                ClickableSpan clickableSpan2 = new ClickableSpan(null, Integer.valueOf(roleColors != null ? roleColors.getPrimaryColor() : iIntValue), roleColors != null ? roleColors.getSecondaryColor() : null, roleColors != null ? roleColors.getTertiaryColor() : null, 150.0f, Boolean.valueOf(renderContext3.getShowLinkDecorations()), new d(linkContentNode, renderContext3), new d(renderContext3, linkContentNode), 1, null);
                                LinkBackgroundStyle backgroundStyle = linkStyle.getBackgroundStyle();
                                if (backgroundStyle != null) {
                                    Integer color = backgroundStyle.getColor();
                                    int iIntValue2 = color != null ? color.intValue() : 0;
                                    Integer borderRadius = backgroundStyle.getBorderRadius();
                                    backgroundSpan = new BackgroundSpan(new BackgroundStyle(iIntValue2, borderRadius != null ? borderRadius.intValue() : 0, 0, 4, (DefaultConstructorMarker) null), null, null, 6, null);
                                    Boolean spaceAround = backgroundStyle.getSpaceAround();
                                    boolean zBooleanValue = spaceAround != null ? spaceAround.booleanValue() : false;
                                    Unit unit4 = Unit.f14616a;
                                    z7 = zBooleanValue;
                                } else {
                                    z7 = false;
                                    backgroundSpan = null;
                                }
                                Object[] objArr4 = {clickableSpan2, new DiscordFontSpan(renderContext3.getContext(), Intrinsics.areEqual(linkContentNode.getMedium(), bool) ? DiscordFont.PrimaryMedium : linkStyle.getFont()), backgroundSpan};
                                int length5 = draweeSpanStringBuilder6.length();
                                Integer bindUserMenuRoleColor = linkContentNode.getBindUserMenuRoleColor();
                                if (bindUserMenuRoleColor != null) {
                                    iIntValue = bindUserMenuRoleColor.intValue();
                                }
                                maybeAddRoleDot(draweeSpanStringBuilder6, zAreEqual, renderContext3.getSingleLine(), context, themeColor, iIntValue, androidColors);
                                if (z7) {
                                    draweeSpanStringBuilder6.append(' ');
                                }
                                int iconSize = getIconSize(null, renderContext3.getBaselineHeightPx());
                                ReactAsset icon = linkStyle.getIcon();
                                if (icon != null) {
                                    appendImage$default(draweeSpanStringBuilder6, context, renderContext3, ReactAssetExtensionsKt.getUri(icon, context), iconSize, iconSize, Integer.valueOf(linkStyle.getLinkColor()), 0.0f, 0.0f, JfifUtil.MARKER_SOFn, null);
                                    draweeSpanStringBuilder6.append(' ');
                                }
                                int i23 = length5;
                                appendToExistingBuilder(linkContentNode.getContent(), RenderContext.copy$default(renderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, 0, null, null, true, null, null, 0.0f, null, false, -268435457, 3, null), draweeSpanStringBuilder6);
                                if (z7) {
                                    draweeSpanStringBuilder6.append(' ');
                                }
                                int i24 = 0;
                                while (i24 < 3) {
                                    Object obj6 = objArr4[i24];
                                    if (obj6 != null) {
                                        i13 = i23;
                                        draweeSpanStringBuilder6.setSpan(obj6, i13, draweeSpanStringBuilder6.length(), 9830433);
                                    } else {
                                        i13 = i23;
                                    }
                                    i24++;
                                    i23 = i13;
                                }
                                renderContext3 = renderContext;
                            } else {
                                final RenderContext renderContext4 = renderContext3;
                                final int i25 = 3;
                                final int i26 = 6;
                                if (contentNode2 instanceof MentionContentNode) {
                                    draweeSpanStringBuilder6.append(FIRST_STRONG_ISOLATE);
                                    DiscordFontSpan discordFontSpan3 = new DiscordFontSpan(renderContext4.getContext(), DiscordFont.PrimarySemibold);
                                    final MentionContentNode mentionContentNode = (MentionContentNode) contentNode2;
                                    if (mentionContentNode instanceof UserOrRoleMentionContentNode) {
                                        ClickableSpan clickableSpan3 = new ClickableSpan(null, num, null, null, 0.0f, null, null, new Function1() { // from class: n6.c
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj7) {
                                                switch (i25) {
                                                    case 0:
                                                        return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$38(renderContext4, mentionContentNode, (View) obj7));
                                                    case 1:
                                                        return TextUtilsKt.toSpannable$lambda$71$lambda$39(renderContext4, mentionContentNode, (View) obj7);
                                                    case 2:
                                                        return TextUtilsKt.toSpannable$lambda$71$lambda$42(renderContext4, mentionContentNode, (View) obj7);
                                                    case 3:
                                                        return TextUtilsKt.toSpannable$lambda$71$lambda$27(renderContext4, mentionContentNode, (View) obj7);
                                                    case 4:
                                                        return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$29(renderContext4, mentionContentNode, (View) obj7));
                                                    case 5:
                                                        return TextUtilsKt.toSpannable$lambda$71$lambda$30(renderContext4, mentionContentNode, (View) obj7);
                                                    case 6:
                                                        return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$33(renderContext4, mentionContentNode, (View) obj7));
                                                    case 7:
                                                        return TextUtilsKt.toSpannable$lambda$71$lambda$34(renderContext4, mentionContentNode, (View) obj7);
                                                    default:
                                                        return TextUtilsKt.toSpannable$lambda$71$lambda$36(renderContext4, mentionContentNode, (View) obj7);
                                                }
                                            }
                                        }, 125, null);
                                        UserOrRoleMentionContentNode userOrRoleMentionContentNode = (UserOrRoleMentionContentNode) contentNode2;
                                        int roleColor = userOrRoleMentionContentNode.getRoleColor();
                                        RoleColors androidColors2 = RoleColorsKt.toAndroidColors(userOrRoleMentionContentNode.getRoleColors());
                                        boolean z11 = renderContext.getShouldShowRoleDot() && roleColor > 0;
                                        boolean z12 = renderContext.getShouldShowRoleOnName() && roleColor > 0;
                                        UserId userIdM419getUserIdwUX8bhU = userOrRoleMentionContentNode.m419getUserIdwUX8bhU();
                                        boolean zM1212equalsimpl0 = userIdM419getUserIdwUX8bhU == null ? false : UserId.m1212equalsimpl0(userIdM419getUserIdwUX8bhU.m1217unboximpl(), UserId.m1209constructorimpl(ConstantsKt.CLYDE_AI_USER_ID));
                                        if (zM1212equalsimpl0) {
                                            iE = iE3;
                                        } else if (z12) {
                                            iE = b1.c.e(androidColors2 != null ? androidColors2.getPrimaryColor() : roleColor, 25);
                                        } else {
                                            iE = themeColor;
                                        }
                                        BackgroundSpan backgroundSpanMakeMentionBackgroundSpan = makeMentionBackgroundSpan(renderContext, iE);
                                        if (z12 && !zM1212equalsimpl0) {
                                            if ((androidColors2 != null ? androidColors2.getSecondaryColor() : null) != null) {
                                                ArrayList arrayListI = d0.i(Integer.valueOf(androidColors2.getPrimaryColor()), androidColors2.getSecondaryColor());
                                                if (androidColors2.getTertiaryColor() != null) {
                                                    arrayListI.add(androidColors2.getTertiaryColor());
                                                }
                                                foregroundColorSpan = new EnhancedRoleColorsSpan(CollectionsKt.h0(arrayListI));
                                            } else {
                                                if (zM1212equalsimpl0) {
                                                    iE2 = themeColor3;
                                                } else if (z12) {
                                                    iE2 = b1.c.e(roleColor, 255);
                                                } else {
                                                    iE2 = themeColor2;
                                                }
                                                foregroundColorSpan = new ForegroundColorSpan(iE2);
                                            }
                                        } else {
                                            if (zM1212equalsimpl0) {
                                                iE2 = themeColor3;
                                            } else if (z12) {
                                                iE2 = b1.c.e(roleColor, 255);
                                            } else {
                                                iE2 = themeColor2;
                                            }
                                            foregroundColorSpan = new ForegroundColorSpan(iE2);
                                        }
                                        Object[] objArr5 = {discordFontSpan3, clickableSpan3, backgroundSpanMakeMentionBackgroundSpan, foregroundColorSpan};
                                        int length6 = draweeSpanStringBuilder.length();
                                        maybeAddRoleDot(draweeSpanStringBuilder, z11, renderContext.getSingleLine(), context, iE, roleColor, androidColors2);
                                        draweeSpanStringBuilder.append((CharSequence) toSpannable$default(userOrRoleMentionContentNode.getContent(), renderContext, null, false, 6, null));
                                        for (int i27 = 0; i27 < 4; i27++) {
                                            Object obj7 = objArr5[i27];
                                            if (obj7 != null) {
                                                draweeSpanStringBuilder.setSpan(obj7, length6, draweeSpanStringBuilder.length(), 33);
                                            }
                                        }
                                        draweeSpanStringBuilder2 = draweeSpanStringBuilder;
                                        renderContext3 = renderContext;
                                    } else {
                                        DraweeSpanStringBuilder draweeSpanStringBuilder7 = draweeSpanStringBuilder6;
                                        if (mentionContentNode instanceof ChannelMentionContentNode) {
                                            final int i28 = 4;
                                            Function1 function1 = new Function1() { // from class: n6.c
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj8) {
                                                    switch (i28) {
                                                        case 0:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$38(renderContext4, mentionContentNode, (View) obj8));
                                                        case 1:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$39(renderContext4, mentionContentNode, (View) obj8);
                                                        case 2:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$42(renderContext4, mentionContentNode, (View) obj8);
                                                        case 3:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$27(renderContext4, mentionContentNode, (View) obj8);
                                                        case 4:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$29(renderContext4, mentionContentNode, (View) obj8));
                                                        case 5:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$30(renderContext4, mentionContentNode, (View) obj8);
                                                        case 6:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$33(renderContext4, mentionContentNode, (View) obj8));
                                                        case 7:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$34(renderContext4, mentionContentNode, (View) obj8);
                                                        default:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$36(renderContext4, mentionContentNode, (View) obj8);
                                                    }
                                                }
                                            };
                                            final int i29 = 5;
                                            draweeSpanStringBuilder5 = draweeSpanStringBuilder;
                                            ClickableSpan clickableSpan4 = new ClickableSpan(null, num, null, null, 0.0f, null, function1, new Function1() { // from class: n6.c
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj8) {
                                                    switch (i29) {
                                                        case 0:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$38(renderContext4, mentionContentNode, (View) obj8));
                                                        case 1:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$39(renderContext4, mentionContentNode, (View) obj8);
                                                        case 2:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$42(renderContext4, mentionContentNode, (View) obj8);
                                                        case 3:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$27(renderContext4, mentionContentNode, (View) obj8);
                                                        case 4:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$29(renderContext4, mentionContentNode, (View) obj8));
                                                        case 5:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$30(renderContext4, mentionContentNode, (View) obj8);
                                                        case 6:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$33(renderContext4, mentionContentNode, (View) obj8));
                                                        case 7:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$34(renderContext4, mentionContentNode, (View) obj8);
                                                        default:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$36(renderContext4, mentionContentNode, (View) obj8);
                                                    }
                                                }
                                            }, 61, null);
                                            BackgroundSpan backgroundSpanMakeMentionBackgroundSpan2 = makeMentionBackgroundSpan(renderContext4, themeColor);
                                            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(themeColor2);
                                            Object[] objArr6 = {discordFontSpan3, clickableSpan4, backgroundSpanMakeMentionBackgroundSpan2, foregroundColorSpan2};
                                            int length7 = draweeSpanStringBuilder5.length();
                                            ChannelMentionContentNode channelMentionContentNode = (ChannelMentionContentNode) contentNode2;
                                            List<ContentNode> inContent = channelMentionContentNode.getInContent();
                                            if (inContent != null) {
                                                appendToExistingBuilder(inContent, renderContext4, draweeSpanStringBuilder5);
                                                int iconSize2 = getIconSize("_caret", renderContext4.getBaselineHeightPx());
                                                appendImage$default(draweeSpanStringBuilder5, context, renderContext4, ReactAssetExtensionsKt.getUri(ReactAsset.ChevronSmallRightIcon, context), iconSize2, iconSize2, Integer.valueOf(foregroundColorSpan2.getForegroundColor()), 0.0f, 0.0f, JfifUtil.MARKER_SOFn, null);
                                                Unit unit5 = Unit.f14616a;
                                            }
                                            List<ContentNode> content = channelMentionContentNode.getContent();
                                            if (content != null) {
                                                appendToExistingBuilder(content, renderContext4, draweeSpanStringBuilder5);
                                                Unit unit6 = Unit.f14616a;
                                            }
                                            for (int i30 = 0; i30 < 4; i30++) {
                                                Object obj8 = objArr6[i30];
                                                if (obj8 != null) {
                                                    draweeSpanStringBuilder5.setSpan(obj8, length7, draweeSpanStringBuilder5.length(), 33);
                                                }
                                            }
                                        } else if (mentionContentNode instanceof AttachmentLinkContentNode) {
                                            final int i31 = 7;
                                            ClickableSpan clickableSpan5 = new ClickableSpan(null, num, null, null, 0.0f, null, new Function1() { // from class: n6.c
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    switch (i26) {
                                                        case 0:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$38(renderContext4, mentionContentNode, (View) obj9));
                                                        case 1:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$39(renderContext4, mentionContentNode, (View) obj9);
                                                        case 2:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$42(renderContext4, mentionContentNode, (View) obj9);
                                                        case 3:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$27(renderContext4, mentionContentNode, (View) obj9);
                                                        case 4:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$29(renderContext4, mentionContentNode, (View) obj9));
                                                        case 5:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$30(renderContext4, mentionContentNode, (View) obj9);
                                                        case 6:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$33(renderContext4, mentionContentNode, (View) obj9));
                                                        case 7:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$34(renderContext4, mentionContentNode, (View) obj9);
                                                        default:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$36(renderContext4, mentionContentNode, (View) obj9);
                                                    }
                                                }
                                            }, new Function1() { // from class: n6.c
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    switch (i31) {
                                                        case 0:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$38(renderContext4, mentionContentNode, (View) obj9));
                                                        case 1:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$39(renderContext4, mentionContentNode, (View) obj9);
                                                        case 2:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$42(renderContext4, mentionContentNode, (View) obj9);
                                                        case 3:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$27(renderContext4, mentionContentNode, (View) obj9);
                                                        case 4:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$29(renderContext4, mentionContentNode, (View) obj9));
                                                        case 5:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$30(renderContext4, mentionContentNode, (View) obj9);
                                                        case 6:
                                                            return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$33(renderContext4, mentionContentNode, (View) obj9));
                                                        case 7:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$34(renderContext4, mentionContentNode, (View) obj9);
                                                        default:
                                                            return TextUtilsKt.toSpannable$lambda$71$lambda$36(renderContext4, mentionContentNode, (View) obj9);
                                                    }
                                                }
                                            }, 61, null);
                                            BackgroundSpan backgroundSpanMakeMentionBackgroundSpan3 = makeMentionBackgroundSpan(renderContext4, themeColor);
                                            ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(themeColor2);
                                            Object[] objArr7 = {discordFontSpan3, clickableSpan5, backgroundSpanMakeMentionBackgroundSpan3, foregroundColorSpan3};
                                            int length8 = draweeSpanStringBuilder.length();
                                            int iconSize3 = getIconSize(null, renderContext4.getBaselineHeightPx());
                                            appendImage$default(draweeSpanStringBuilder, context, renderContext4, ReactAssetExtensionsKt.getUri(ReactAsset.AttachmentIcon, context), iconSize3, iconSize3, Integer.valueOf(foregroundColorSpan3.getForegroundColor()), 0.0f, 0.0f, JfifUtil.MARKER_SOFn, null);
                                            draweeSpanStringBuilder5 = draweeSpanStringBuilder;
                                            draweeSpanStringBuilder5.append(' ');
                                            List<ContentNode> content2 = ((AttachmentLinkContentNode) contentNode2).getContent();
                                            if (content2 != null) {
                                                appendToExistingBuilder(content2, renderContext4, draweeSpanStringBuilder5);
                                                Unit unit7 = Unit.f14616a;
                                            }
                                            for (int i32 = 0; i32 < 4; i32++) {
                                                Object obj9 = objArr7[i32];
                                                if (obj9 != null) {
                                                    draweeSpanStringBuilder5.setSpan(obj9, length8, draweeSpanStringBuilder5.length(), 33);
                                                }
                                            }
                                        } else {
                                            if (mentionContentNode instanceof StaticChannelMentionContentNode) {
                                                ClickableSpan clickableSpan6 = new ClickableSpan(null, num, null, null, 0.0f, null, null, new Function1() { // from class: n6.c
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj10) {
                                                        switch (i20) {
                                                            case 0:
                                                                return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$38(renderContext4, mentionContentNode, (View) obj10));
                                                            case 1:
                                                                return TextUtilsKt.toSpannable$lambda$71$lambda$39(renderContext4, mentionContentNode, (View) obj10);
                                                            case 2:
                                                                return TextUtilsKt.toSpannable$lambda$71$lambda$42(renderContext4, mentionContentNode, (View) obj10);
                                                            case 3:
                                                                return TextUtilsKt.toSpannable$lambda$71$lambda$27(renderContext4, mentionContentNode, (View) obj10);
                                                            case 4:
                                                                return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$29(renderContext4, mentionContentNode, (View) obj10));
                                                            case 5:
                                                                return TextUtilsKt.toSpannable$lambda$71$lambda$30(renderContext4, mentionContentNode, (View) obj10);
                                                            case 6:
                                                                return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$33(renderContext4, mentionContentNode, (View) obj10));
                                                            case 7:
                                                                return TextUtilsKt.toSpannable$lambda$71$lambda$34(renderContext4, mentionContentNode, (View) obj10);
                                                            default:
                                                                return TextUtilsKt.toSpannable$lambda$71$lambda$36(renderContext4, mentionContentNode, (View) obj10);
                                                        }
                                                    }
                                                }, 125, null);
                                                BackgroundSpan backgroundSpanMakeMentionBackgroundSpan4 = makeMentionBackgroundSpan(renderContext4, themeColor);
                                                ForegroundColorSpan foregroundColorSpan4 = new ForegroundColorSpan(themeColor2);
                                                int iconSize4 = getIconSize(null, renderContext4.getBaselineHeightPx());
                                                Object[] objArr8 = {discordFontSpan3, clickableSpan6, backgroundSpanMakeMentionBackgroundSpan4, foregroundColorSpan4};
                                                int length9 = draweeSpanStringBuilder.length();
                                                StaticChannelMentionContentNode staticChannelMentionContentNode = (StaticChannelMentionContentNode) contentNode2;
                                                int i33 = WhenMappings.$EnumSwitchMapping$0[staticChannelMentionContentNode.getId().ordinal()];
                                                if (i33 == 1 || i33 == 2) {
                                                    appendImage$default(draweeSpanStringBuilder, context, renderContext, ReactAssetExtensionsKt.getUri(ReactAsset.SignPostIcon, context), iconSize4, iconSize4, Integer.valueOf(foregroundColorSpan4.getForegroundColor()), 0.0f, 0.0f, JfifUtil.MARKER_SOFn, null);
                                                    draweeSpanStringBuilder4 = draweeSpanStringBuilder;
                                                    Unit unit8 = Unit.f14616a;
                                                } else {
                                                    if (i33 == 3 || i33 == 4) {
                                                        appendImage$default(draweeSpanStringBuilder, context, renderContext, ReactAssetExtensionsKt.getUri(ReactAsset.ChannelListMagnifyingGlassIcon, context), iconSize4, iconSize4, Integer.valueOf(foregroundColorSpan4.getForegroundColor()), 0.0f, 0.0f, JfifUtil.MARKER_SOFn, null);
                                                        Unit unit9 = Unit.f14616a;
                                                    } else if (i33 != 5) {
                                                        draweeSpanStringBuilder.append(CHANNEL_PREFIX);
                                                        draweeSpanStringBuilder4 = draweeSpanStringBuilder;
                                                    } else {
                                                        appendImage$default(draweeSpanStringBuilder, context, renderContext4, ReactAssetExtensionsKt.getUri(ReactAsset.LinkIcon, context), iconSize4, iconSize4, Integer.valueOf(foregroundColorSpan4.getForegroundColor()), 0.0f, 0.0f, JfifUtil.MARKER_SOFn, null);
                                                        Unit unit10 = Unit.f14616a;
                                                    }
                                                    draweeSpanStringBuilder4 = draweeSpanStringBuilder;
                                                }
                                                renderContext2 = renderContext;
                                                draweeSpanStringBuilder4.append((CharSequence) toSpannable$default(staticChannelMentionContentNode.getContent(), renderContext, null, false, 6, null));
                                                for (int i34 = 0; i34 < 4; i34++) {
                                                    Object obj10 = objArr8[i34];
                                                    if (obj10 != null) {
                                                        draweeSpanStringBuilder4.setSpan(obj10, length9, draweeSpanStringBuilder4.length(), 33);
                                                    }
                                                }
                                            } else {
                                                draweeSpanStringBuilder4 = draweeSpanStringBuilder7;
                                                if (mentionContentNode instanceof CommandMentionContentNode) {
                                                    BackgroundSpan backgroundSpanMakeMentionBackgroundSpan5 = makeMentionBackgroundSpan(renderContext4, themeColor);
                                                    ForegroundColorSpan foregroundColorSpan5 = new ForegroundColorSpan(themeColor2);
                                                    final int i35 = 0;
                                                    final int i36 = 1;
                                                    ClickableSpan clickableSpan7 = new ClickableSpan(null, num, null, null, 0.0f, null, new Function1() { // from class: n6.c
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj11) {
                                                            switch (i35) {
                                                                case 0:
                                                                    return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$38(renderContext4, mentionContentNode, (View) obj11));
                                                                case 1:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$39(renderContext4, mentionContentNode, (View) obj11);
                                                                case 2:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$42(renderContext4, mentionContentNode, (View) obj11);
                                                                case 3:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$27(renderContext4, mentionContentNode, (View) obj11);
                                                                case 4:
                                                                    return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$29(renderContext4, mentionContentNode, (View) obj11));
                                                                case 5:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$30(renderContext4, mentionContentNode, (View) obj11);
                                                                case 6:
                                                                    return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$33(renderContext4, mentionContentNode, (View) obj11));
                                                                case 7:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$34(renderContext4, mentionContentNode, (View) obj11);
                                                                default:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$36(renderContext4, mentionContentNode, (View) obj11);
                                                            }
                                                        }
                                                    }, new Function1() { // from class: n6.c
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj11) {
                                                            switch (i36) {
                                                                case 0:
                                                                    return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$38(renderContext4, mentionContentNode, (View) obj11));
                                                                case 1:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$39(renderContext4, mentionContentNode, (View) obj11);
                                                                case 2:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$42(renderContext4, mentionContentNode, (View) obj11);
                                                                case 3:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$27(renderContext4, mentionContentNode, (View) obj11);
                                                                case 4:
                                                                    return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$29(renderContext4, mentionContentNode, (View) obj11));
                                                                case 5:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$30(renderContext4, mentionContentNode, (View) obj11);
                                                                case 6:
                                                                    return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$33(renderContext4, mentionContentNode, (View) obj11));
                                                                case 7:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$34(renderContext4, mentionContentNode, (View) obj11);
                                                                default:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$36(renderContext4, mentionContentNode, (View) obj11);
                                                            }
                                                        }
                                                    }, 61, null);
                                                    Object[] objArr9 = {new GGSansBoldSpan(renderContext.getContext())};
                                                    int length10 = draweeSpanStringBuilder4.length();
                                                    Object[] objArr10 = {clickableSpan7, backgroundSpanMakeMentionBackgroundSpan5, foregroundColorSpan5};
                                                    int length11 = draweeSpanStringBuilder4.length();
                                                    draweeSpanStringBuilder4.append(COMMAND_PREFIX);
                                                    DraweeSpanStringBuilder spannable$default = toSpannable$default(((CommandMentionContentNode) contentNode2).getContent(), renderContext, null, false, 6, null);
                                                    renderContext2 = renderContext;
                                                    draweeSpanStringBuilder4.append((CharSequence) spannable$default);
                                                    for (int i37 = 0; i37 < 3; i37++) {
                                                        Object obj11 = objArr10[i37];
                                                        if (obj11 != null) {
                                                            draweeSpanStringBuilder4.setSpan(obj11, length11, draweeSpanStringBuilder4.length(), 33);
                                                        }
                                                    }
                                                    Object obj12 = objArr9[0];
                                                    if (obj12 != null) {
                                                        draweeSpanStringBuilder4.setSpan(obj12, length10, draweeSpanStringBuilder4.length(), 33);
                                                    }
                                                } else if (mentionContentNode instanceof GameMentionContentNode) {
                                                    final int i38 = 2;
                                                    Object[] objArr11 = {discordFontSpan3, new ClickableSpan(null, num, null, null, 0.0f, null, null, new Function1() { // from class: n6.c
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj13) {
                                                            switch (i38) {
                                                                case 0:
                                                                    return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$38(renderContext4, mentionContentNode, (View) obj13));
                                                                case 1:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$39(renderContext4, mentionContentNode, (View) obj13);
                                                                case 2:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$42(renderContext4, mentionContentNode, (View) obj13);
                                                                case 3:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$27(renderContext4, mentionContentNode, (View) obj13);
                                                                case 4:
                                                                    return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$29(renderContext4, mentionContentNode, (View) obj13));
                                                                case 5:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$30(renderContext4, mentionContentNode, (View) obj13);
                                                                case 6:
                                                                    return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$33(renderContext4, mentionContentNode, (View) obj13));
                                                                case 7:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$34(renderContext4, mentionContentNode, (View) obj13);
                                                                default:
                                                                    return TextUtilsKt.toSpannable$lambda$71$lambda$36(renderContext4, mentionContentNode, (View) obj13);
                                                            }
                                                        }
                                                    }, 125, null), makeMentionBackgroundSpan(renderContext4, themeColor), new ForegroundColorSpan(themeColor2)};
                                                    int length12 = draweeSpanStringBuilder4.length();
                                                    int iconSize5 = getIconSize(null, renderContext.getBaselineHeightPx());
                                                    GameMentionContentNode gameMentionContentNode = (GameMentionContentNode) contentNode2;
                                                    if (gameMentionContentNode.getIcon() != null) {
                                                        draweeSpanStringBuilder4.append(' ');
                                                        renderContext3 = renderContext;
                                                        appendImage$default(draweeSpanStringBuilder4, context, renderContext3, gameMentionContentNode.getIcon(), iconSize5, iconSize5, null, getGameMentionIconCornerRadius(iconSize5), 0.0f, 160, null);
                                                        draweeSpanStringBuilder2 = draweeSpanStringBuilder4;
                                                        draweeSpanStringBuilder2.append(' ');
                                                    } else {
                                                        renderContext3 = renderContext;
                                                        draweeSpanStringBuilder2 = draweeSpanStringBuilder4;
                                                    }
                                                    String displayName = gameMentionContentNode.getDisplayName();
                                                    if (displayName == null) {
                                                        displayName = "";
                                                    }
                                                    draweeSpanStringBuilder2.append((CharSequence) displayName);
                                                    for (int i39 = 0; i39 < 4; i39++) {
                                                        Object obj13 = objArr11[i39];
                                                        if (obj13 != null) {
                                                            draweeSpanStringBuilder2.setSpan(obj13, length12, draweeSpanStringBuilder2.length(), 33);
                                                        }
                                                    }
                                                } else {
                                                    throw new n();
                                                }
                                            }
                                            renderContext3 = renderContext2;
                                            draweeSpanStringBuilder2 = draweeSpanStringBuilder4;
                                        }
                                        renderContext3 = renderContext4;
                                        draweeSpanStringBuilder2 = draweeSpanStringBuilder5;
                                    }
                                    ForceExhaustiveKt.forceExhaustive(draweeSpanStringBuilder2);
                                    draweeSpanStringBuilder2.append(POP_DIRECTIONAL_ISOLATE);
                                } else {
                                    renderContext3 = renderContext4;
                                    draweeSpanStringBuilder2 = draweeSpanStringBuilder6;
                                    if (contentNode2 instanceof ParagraphContentNode) {
                                        appendToExistingBuilder(((ParagraphContentNode) contentNode2).getContent(), renderContext3, draweeSpanStringBuilder2);
                                        if (!z10) {
                                            draweeSpanStringBuilder2.append("\n\n");
                                        }
                                        Unit unit11 = Unit.f14616a;
                                    } else if (contentNode2 instanceof SpoilerContentNode) {
                                        SpoilerContentNode spoilerContentNode = (SpoilerContentNode) contentNode2;
                                        String strM449forNode2sfwrmE = SpoilerIdentifier.INSTANCE.m449forNode2sfwrmE(spoilerContentNode, renderContext3.getContainerId(), i14);
                                        boolean zM451isRevealedV2PEE7g = SpoilerManager.INSTANCE.m451isRevealedV2PEE7g(strM449forNode2sfwrmE);
                                        RenderContext.SpoilerState spoilerState = zM451isRevealedV2PEE7g ? RenderContext.SpoilerState.Revealed : RenderContext.SpoilerState.Hidden;
                                        m7.a aVar = !zM451isRevealedV2PEE7g ? new m7.a(1, strM449forNode2sfwrmE, renderContext3) : null;
                                        ClickableSpan clickableSpan8 = aVar != null ? new ClickableSpan(NestedClickableSpan.TouchPriority.HIGH, null, null, null, 0.0f, null, null, new kotlin.collections.a(i20, aVar), 126, null) : null;
                                        if (zM451isRevealedV2PEE7g) {
                                            spoilerHiddenBackground = renderContext3.getTheme().getSpoilerRevealedBackground();
                                        } else {
                                            spoilerHiddenBackground = renderContext3.getTheme().getSpoilerHiddenBackground();
                                        }
                                        Object[] objArr12 = {clickableSpan8, new BackgroundSpan(new BackgroundStyle(spoilerHiddenBackground, 0, 0, 6, (DefaultConstructorMarker) null), null, null, 6, null), new SpoilerSpan(zM451isRevealedV2PEE7g, aVar)};
                                        int length13 = draweeSpanStringBuilder2.length();
                                        draweeSpanStringBuilder6 = draweeSpanStringBuilder;
                                        appendToExistingBuilder(spoilerContentNode.getContent(), RenderContext.copy$default(renderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, spoilerState, 0, null, null, false, null, null, 0.0f, null, false, -16777217, 3, null), draweeSpanStringBuilder6);
                                        int i40 = 0;
                                        while (i40 < 3) {
                                            Object obj14 = objArr12[i40];
                                            if (obj14 != null) {
                                                i12 = length13;
                                                draweeSpanStringBuilder6.setSpan(obj14, i12, draweeSpanStringBuilder6.length(), 33);
                                            } else {
                                                i12 = length13;
                                            }
                                            i40++;
                                            length13 = i12;
                                        }
                                        renderContext3 = renderContext;
                                    } else {
                                        draweeSpanStringBuilder6 = draweeSpanStringBuilder2;
                                        if (contentNode2 instanceof StrikethroughContentNode) {
                                            Object[] objArr13 = {new StrikethroughSpan()};
                                            int length14 = draweeSpanStringBuilder6.length();
                                            appendToExistingBuilder(((StrikethroughContentNode) contentNode2).getContent(), renderContext3, draweeSpanStringBuilder6);
                                            z6 = false;
                                            Object obj15 = objArr13[0];
                                            if (obj15 != null) {
                                                draweeSpanStringBuilder6.setSpan(obj15, length14, draweeSpanStringBuilder6.length(), 33);
                                            }
                                        } else {
                                            z6 = false;
                                            if (contentNode2 instanceof SubtextContentNode) {
                                                if (renderContext3.getSingleLine()) {
                                                    appendToExistingBuilder(((SubtextContentNode) contentNode2).getContent(), renderContext3, draweeSpanStringBuilder6);
                                                    if (!z10) {
                                                        simulateInlineNewline(draweeSpanStringBuilder6);
                                                    }
                                                } else {
                                                    changeTextSizeSp(draweeSpanStringBuilder6, FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(context) ? 13 : 14, renderContext3, new j(draweeSpanStringBuilder6, new ForegroundColorSpan(renderContext3.getTheme().getTextMuted()), (SubtextContentNode) contentNode2, 2));
                                                    if (!z10) {
                                                        SpannableStringBuilderExtensionsKt.ensureNewline$default(draweeSpanStringBuilder6, null, 1, null);
                                                    } else {
                                                        ensureTrailingSpacerNewLineOfSize(draweeSpanStringBuilder6, 0);
                                                    }
                                                }
                                                Unit unit12 = Unit.f14616a;
                                            } else {
                                                int i41 = 16;
                                                if (contentNode2 instanceof HeadingContentNode) {
                                                    if (renderContext3.getSingleLine()) {
                                                        Object[] objArr14 = {new GGSansBoldSpan(renderContext3.getContext())};
                                                        int length15 = draweeSpanStringBuilder6.length();
                                                        appendToExistingBuilder(((HeadingContentNode) contentNode2).getContent(), renderContext3, draweeSpanStringBuilder6);
                                                        simulateInlineNewline(draweeSpanStringBuilder6);
                                                        Object obj16 = objArr14[0];
                                                        if (obj16 != null) {
                                                            draweeSpanStringBuilder6.setSpan(obj16, length15, draweeSpanStringBuilder6.length(), 33);
                                                        }
                                                    } else {
                                                        HeadingContentNode headingContentNode = (HeadingContentNode) contentNode2;
                                                        int level = headingContentNode.getLevel();
                                                        if (level == 1) {
                                                            i41 = 24;
                                                        } else if (level == 2) {
                                                            i41 = 20;
                                                        }
                                                        if (draweeSpanStringBuilder6.length() > 0) {
                                                            ensureTrailingSpacerNewLineOfSize(draweeSpanStringBuilder6, SizeUtilsKt.getDpToPx(8));
                                                        } else if (!renderContext3.getShouldOmitTopAndBottomHeadingSpacerNewLine()) {
                                                            ensureTrailingSpacerNewLineOfSize(draweeSpanStringBuilder6, SizeUtilsKt.getDpToPx(4));
                                                        }
                                                        Object[] objArr15 = {new GGSansBoldSpan(renderContext3.getContext())};
                                                        int length16 = draweeSpanStringBuilder6.length();
                                                        changeTextSizeSp(draweeSpanStringBuilder6, i41, renderContext3, new com.discord.chat.presentation.message.i(i26, headingContentNode, draweeSpanStringBuilder6));
                                                        Object obj17 = objArr15[0];
                                                        if (obj17 != null) {
                                                            draweeSpanStringBuilder6.setSpan(obj17, length16, draweeSpanStringBuilder6.length(), 33);
                                                        }
                                                        if (!z10 || !renderContext3.getShouldOmitTopAndBottomHeadingSpacerNewLine()) {
                                                            ensureTrailingSpacerNewLineOfSize(draweeSpanStringBuilder6, SizeUtilsKt.getDpToPx(4));
                                                        }
                                                        Unit unit13 = Unit.f14616a;
                                                    }
                                                } else if (contentNode2 instanceof LHeadingContentNode) {
                                                    DiscordFontSpan discordFontSpan4 = new DiscordFontSpan(renderContext3.getContext(), DiscordFont.PrimaryExtraBold);
                                                    if (renderContext3.getSingleLine()) {
                                                        int length17 = draweeSpanStringBuilder6.length();
                                                        appendToExistingBuilder(((LHeadingContentNode) contentNode2).getContent(), renderContext3, draweeSpanStringBuilder6);
                                                        simulateInlineNewline(draweeSpanStringBuilder6);
                                                        Object obj18 = new Object[]{discordFontSpan4}[0];
                                                        if (obj18 != null) {
                                                            draweeSpanStringBuilder6.setSpan(obj18, length17, draweeSpanStringBuilder6.length(), 33);
                                                        }
                                                    } else {
                                                        int scaledSpToPx = FontManager.INSTANCE.getScaledSpToPx(16, renderContext3.getContext());
                                                        float baselineHeightForFontSizePx = getBaselineHeightForFontSizePx(renderContext3.getPaint(), scaledSpToPx);
                                                        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(scaledSpToPx);
                                                        LHeadingContentNode lHeadingContentNode = (LHeadingContentNode) contentNode2;
                                                        if (!x.o(lHeadingContentNode.getClassName(), "added", false)) {
                                                            if (!x.o(lHeadingContentNode.getClassName(), "fixed", false)) {
                                                                if (!x.o(lHeadingContentNode.getClassName(), ReactProgressBarViewManager.PROP_PROGRESS, false)) {
                                                                    if (x.o(lHeadingContentNode.getClassName(), "improved", false)) {
                                                                        mobileTextHeadingPrimary = renderContext3.getTheme().getTextBrand();
                                                                    } else {
                                                                        mobileTextHeadingPrimary = renderContext3.getTheme().getMobileTextHeadingPrimary();
                                                                    }
                                                                } else {
                                                                    mobileTextHeadingPrimary = renderContext3.getTheme().getTextFeedbackWarning();
                                                                }
                                                            } else {
                                                                mobileTextHeadingPrimary = renderContext3.getTheme().getTextFeedbackCritical();
                                                            }
                                                        } else {
                                                            mobileTextHeadingPrimary = renderContext3.getTheme().getTextFeedbackPositive();
                                                        }
                                                        ForegroundColorSpan foregroundColorSpan6 = new ForegroundColorSpan(mobileTextHeadingPrimary);
                                                        if (draweeSpanStringBuilder6.length() > 0) {
                                                            dpToPx = SizeUtilsKt.getDpToPx(8);
                                                            i7 = 4;
                                                        } else {
                                                            i7 = 4;
                                                            dpToPx = SizeUtilsKt.getDpToPx(4);
                                                        }
                                                        Object[] objArr16 = {discordFontSpan4, foregroundColorSpan6, new UnderlineSpan()};
                                                        int length18 = draweeSpanStringBuilder6.length();
                                                        Object[] objArr17 = {new AbsoluteSizeSpan(dpToPx)};
                                                        int length19 = draweeSpanStringBuilder6.length();
                                                        draweeSpanStringBuilder6.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                                                        Object obj19 = objArr17[0];
                                                        if (obj19 != null) {
                                                            draweeSpanStringBuilder6.setSpan(obj19, length19, draweeSpanStringBuilder6.length(), 33);
                                                        }
                                                        int length20 = draweeSpanStringBuilder6.length();
                                                        int i42 = i7;
                                                        int i43 = length18;
                                                        appendToExistingBuilder(lHeadingContentNode.getContent(), RenderContext.copy$default(renderContext3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, baselineHeightForFontSizePx, null, false, Integer.MAX_VALUE, 2, null), draweeSpanStringBuilder6);
                                                        Object obj20 = new Object[]{absoluteSizeSpan}[0];
                                                        if (obj20 != null) {
                                                            i10 = 33;
                                                            draweeSpanStringBuilder6.setSpan(obj20, length20, draweeSpanStringBuilder6.length(), 33);
                                                        } else {
                                                            i10 = 33;
                                                        }
                                                        if (!z10) {
                                                            Object[] objArr18 = {new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(i42))};
                                                            int length21 = draweeSpanStringBuilder6.length();
                                                            draweeSpanStringBuilder6.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                                                            Object obj21 = objArr18[0];
                                                            if (obj21 != null) {
                                                                draweeSpanStringBuilder6.setSpan(obj21, length21, draweeSpanStringBuilder6.length(), i10);
                                                            }
                                                        } else {
                                                            Object[] objArr19 = {new AbsoluteSizeSpan(0)};
                                                            int length22 = draweeSpanStringBuilder6.length();
                                                            draweeSpanStringBuilder6.append("\n\u200b");
                                                            Object obj22 = objArr19[0];
                                                            if (obj22 != null) {
                                                                draweeSpanStringBuilder6.setSpan(obj22, length22, draweeSpanStringBuilder6.length(), i10);
                                                            }
                                                        }
                                                        int i44 = 0;
                                                        while (i44 < 3) {
                                                            Object obj23 = objArr16[i44];
                                                            if (obj23 != null) {
                                                                i11 = i43;
                                                                draweeSpanStringBuilder6.setSpan(obj23, i11, draweeSpanStringBuilder6.length(), i10);
                                                            } else {
                                                                i11 = i43;
                                                            }
                                                            i44++;
                                                            i43 = i11;
                                                        }
                                                        renderContext3 = renderContext;
                                                    }
                                                } else {
                                                    if (contentNode2 instanceof BulletListContentNode) {
                                                        int i45 = 0;
                                                        RenderContext renderContextCopy$default = RenderContext.copy$default(renderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, 0.0f, null, false, -1, 3, null);
                                                        renderContext3 = renderContext;
                                                        BulletListContentNode bulletListContentNode = (BulletListContentNode) contentNode2;
                                                        boolean ordered = bulletListContentNode.getOrdered();
                                                        if (ordered) {
                                                            Long start = bulletListContentNode.getStart();
                                                            jLongValue = start != null ? start.longValue() : 1L;
                                                            renderContextCopy$default = RenderContext.copy$default(renderContextCopy$default, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, 0, null, Long.valueOf(((long) (bulletListContentNode.getItems().size() - 1)) + jLongValue), false, null, null, 0.0f, null, false, -134217729, 3, null);
                                                        } else {
                                                            jLongValue = 0;
                                                        }
                                                        if (renderContext3.getSingleLine()) {
                                                            draweeSpanStringBuilder3 = draweeSpanStringBuilder;
                                                        } else {
                                                            draweeSpanStringBuilder3 = draweeSpanStringBuilder;
                                                            ensureTrailingSpacerNewLineOfSize(draweeSpanStringBuilder3, SizeUtilsKt.getDpToPx(2));
                                                        }
                                                        int i46 = 0;
                                                        for (Object obj24 : bulletListContentNode.getItems()) {
                                                            int i47 = i46 + 1;
                                                            if (i46 >= 0) {
                                                                List list2 = (List) obj24;
                                                                ArrayList arrayList = new ArrayList();
                                                                int size = list2.size();
                                                                int i48 = i45;
                                                                int i49 = i46 == bulletListContentNode.getItems().size() + (-1) ? 1 : i48;
                                                                int i50 = i48;
                                                                for (Object obj25 : list2) {
                                                                    int i51 = i50 + 1;
                                                                    if (i50 >= 0) {
                                                                        ContentNode contentNode3 = (ContentNode) obj25;
                                                                        boolean z13 = contentNode3 instanceof BulletListContentNode;
                                                                        int i52 = i50 == size + (-1) ? 1 : i48;
                                                                        if (!z13) {
                                                                            arrayList.add(contentNode3);
                                                                        }
                                                                        if (z13 || i52 != 0) {
                                                                            if (ordered) {
                                                                                if (renderContextCopy$default.getListOrderedIndex() != null) {
                                                                                    Long listOrderedIndex = renderContextCopy$default.getListOrderedIndex();
                                                                                    jLongValue2 = (listOrderedIndex != null ? listOrderedIndex.longValue() : 0L) + 1;
                                                                                } else {
                                                                                    jLongValue2 = jLongValue;
                                                                                }
                                                                                renderContextCopy$default = RenderContext.copy$default(renderContextCopy$default, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, 0, Long.valueOf(jLongValue2), null, false, null, null, 0.0f, null, false, -67108865, 3, null);
                                                                            }
                                                                            RenderContext renderContext5 = renderContextCopy$default;
                                                                            appendBulletPoint(draweeSpanStringBuilder3, arrayList, renderContext5, ordered);
                                                                            if (renderContext3.getSingleLine()) {
                                                                                simulateInlineNewline(draweeSpanStringBuilder3);
                                                                            }
                                                                            arrayList.clear();
                                                                            renderContextCopy$default = renderContext5;
                                                                        }
                                                                        if (z13) {
                                                                            appendToExistingBuilder(c0.c(contentNode3), RenderContext.copy$default(renderContextCopy$default, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, renderContextCopy$default.getListNestedLevel() + 1, null, null, false, null, null, 0.0f, null, false, -234881025, 3, null), draweeSpanStringBuilder3);
                                                                        }
                                                                        i50 = i51;
                                                                    } else {
                                                                        d0.k();
                                                                        throw null;
                                                                    }
                                                                }
                                                                if (!renderContext3.getSingleLine() && z5 && i49 != 0) {
                                                                    ensureTrailingSpacerNewLineOfSize(draweeSpanStringBuilder3, SizeUtilsKt.getDpToPx(2));
                                                                }
                                                                i46 = i47;
                                                                i45 = i48;
                                                            } else {
                                                                d0.k();
                                                                throw null;
                                                            }
                                                        }
                                                        i19 = i45;
                                                        Unit unit14 = Unit.f14616a;
                                                    } else {
                                                        renderContext3 = renderContext;
                                                        draweeSpanStringBuilder3 = draweeSpanStringBuilder6;
                                                        i19 = 0;
                                                        if (contentNode2 instanceof StrongContentNode) {
                                                            Object[] objArr20 = {new GGSansBoldSpan(renderContext3.getContext())};
                                                            int length23 = draweeSpanStringBuilder3.length();
                                                            appendToExistingBuilder(((StrongContentNode) contentNode2).getContent(), renderContext3, draweeSpanStringBuilder3);
                                                            Object obj26 = objArr20[0];
                                                            if (obj26 != null) {
                                                                draweeSpanStringBuilder3.setSpan(obj26, length23, draweeSpanStringBuilder3.length(), 33);
                                                            }
                                                        } else if (contentNode2 instanceof TextContentNode) {
                                                            String content3 = ((TextContentNode) contentNode2).getContent();
                                                            if (content3 != null) {
                                                                draweeSpanStringBuilder3.append((CharSequence) content3);
                                                                Unit unit15 = Unit.f14616a;
                                                            }
                                                        } else if (contentNode2 instanceof TimestampContentNode) {
                                                            TimestampContentNode timestampContentNode = (TimestampContentNode) contentNode2;
                                                            ClickableSpan clickableSpan9 = new ClickableSpan(null, Integer.valueOf(ColorUtilsKt.getThemeColor(context, R.color.primary_600, R.color.primary_200, renderContext3.getTheme())), null, null, 0.0f, null, null, new p(i26, renderContext3, timestampContentNode), 125, null);
                                                            if (renderContext3.spoilerIsHidden()) {
                                                                spoilerRevealedBackground = renderContext3.getTheme().getSpoilerHiddenBackground();
                                                            } else {
                                                                spoilerRevealedBackground = renderContext3.spoilerIsRevealed() ? renderContext3.getTheme().getSpoilerRevealedBackground() : ColorUtilsKt.getThemeColor(context, R.color.border_subtle_light, R.color.border_subtle_dark, renderContext3.getTheme());
                                                            }
                                                            Object[] objArr21 = {clickableSpan9, new BackgroundSpan(new BackgroundStyle(spoilerRevealedBackground, 0, 0, 6, (DefaultConstructorMarker) null), null, null, 6, null)};
                                                            int length24 = draweeSpanStringBuilder3.length();
                                                            draweeSpanStringBuilder3.append((CharSequence) timestampContentNode.getFormatted());
                                                            for (int i53 = 0; i53 < 2; i53++) {
                                                                Object obj27 = objArr21[i53];
                                                                if (obj27 != null) {
                                                                    draweeSpanStringBuilder3.setSpan(obj27, length24, draweeSpanStringBuilder3.length(), 33);
                                                                }
                                                            }
                                                        } else if (contentNode2 instanceof UnderlineContentNode) {
                                                            Object[] objArr22 = {new UnderlineSpan()};
                                                            int length25 = draweeSpanStringBuilder3.length();
                                                            appendToExistingBuilder(((UnderlineContentNode) contentNode2).getContent(), renderContext3, draweeSpanStringBuilder3);
                                                            Object obj28 = objArr22[0];
                                                            if (obj28 != null) {
                                                                draweeSpanStringBuilder3.setSpan(obj28, length25, draweeSpanStringBuilder3.length(), 33);
                                                            }
                                                        } else if (contentNode2 instanceof ChannelNameContentNode) {
                                                            draweeSpanStringBuilder3.append(FIRST_STRONG_ISOLATE);
                                                            ChannelNameContentNode channelNameContentNode = (ChannelNameContentNode) contentNode2;
                                                            if (channelNameContentNode.getIcon() != null) {
                                                                int iconSize6 = getIconSize(channelNameContentNode.getIconType(), renderContext3.getBaselineHeightPx());
                                                                draweeSpanStringBuilder6 = draweeSpanStringBuilder3;
                                                                appendImage$default(draweeSpanStringBuilder6, context, renderContext3, channelNameContentNode.getIcon(), iconSize6, iconSize6, Integer.valueOf(themeColor2), 0.0f, iconSize6 * getIconPaddingMultiplier(channelNameContentNode.getIconType()), 64, null);
                                                            } else {
                                                                draweeSpanStringBuilder6 = draweeSpanStringBuilder3;
                                                            }
                                                            appendToExistingBuilder(channelNameContentNode.getContent(), renderContext3, draweeSpanStringBuilder6);
                                                            draweeSpanStringBuilder6.append(POP_DIRECTIONAL_ISOLATE);
                                                        } else {
                                                            draweeSpanStringBuilder6 = draweeSpanStringBuilder3;
                                                            if (contentNode2 instanceof GuildNameContentNode) {
                                                                draweeSpanStringBuilder6.append(FIRST_STRONG_ISOLATE);
                                                                int iconSize7 = getIconSize("_guild", renderContext3.getBaselineHeightPx());
                                                                GuildNameContentNode guildNameContentNode = (GuildNameContentNode) contentNode2;
                                                                if (guildNameContentNode.getIcon() != null) {
                                                                    float f2 = iconSize7;
                                                                    appendImage$default(draweeSpanStringBuilder6, context, renderContext3, guildNameContentNode.getIcon(), iconSize7, iconSize7, null, f2 * 0.2f, f2 * 0.1f, 32, null);
                                                                }
                                                                draweeSpanStringBuilder6.append((CharSequence) guildNameContentNode.getContent());
                                                                draweeSpanStringBuilder6.append(POP_DIRECTIONAL_ISOLATE);
                                                            } else if (contentNode2 instanceof SoundmojiContentNode) {
                                                                VerticalPaddingSpan verticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
                                                                DiscordFontSpan discordFontSpan5 = new DiscordFontSpan(renderContext3.getContext(), DiscordFont.PrimarySemibold);
                                                                SoundmojiContentNode soundmojiContentNode = (SoundmojiContentNode) contentNode2;
                                                                ClickableSpan clickableSpan10 = new ClickableSpan(null, null, null, null, 0.0f, null, null, new p(7, renderContext3, soundmojiContentNode), 127, null);
                                                                ForegroundColorSpan foregroundColorSpan7 = new ForegroundColorSpan(renderContext3.getTheme().getTextDefault());
                                                                i19 = 0;
                                                                BackgroundSpan backgroundSpan4 = new BackgroundSpan(new BackgroundStyle(renderContext3.getTheme().getCardBackgroundDefault(), 4, 2), new BorderStyle(renderContext3.getTheme().getBorderStrong(), SizeUtilsKt.getDpToPx(1)), new ShadowStyle(Color.argb(63, 0, 0, 0), SizeUtilsKt.getDpToPx(4), new SizeF(0.0f, 4.0f)));
                                                                draweeSpanStringBuilder6.append(" ");
                                                                if (renderContext3.spoilerExists() && !renderContext3.spoilerIsRevealed()) {
                                                                    int length26 = draweeSpanStringBuilder6.length();
                                                                    toSpannable$lambda$71$lambda$70(draweeSpanStringBuilder6, soundmojiContentNode, context, renderContext3, draweeSpanStringBuilder6);
                                                                    Object obj29 = new Object[]{verticalPaddingSpan}[0];
                                                                    if (obj29 != null) {
                                                                        draweeSpanStringBuilder6.setSpan(obj29, length26, draweeSpanStringBuilder6.length(), 33);
                                                                    }
                                                                } else {
                                                                    Object[] objArr23 = {verticalPaddingSpan, discordFontSpan5, clickableSpan10, foregroundColorSpan7, backgroundSpan4};
                                                                    int length27 = draweeSpanStringBuilder6.length();
                                                                    toSpannable$lambda$71$lambda$70(draweeSpanStringBuilder6, soundmojiContentNode, context, renderContext3, draweeSpanStringBuilder6);
                                                                    for (int i54 = 0; i54 < 5; i54++) {
                                                                        Object obj30 = objArr23[i54];
                                                                        if (obj30 != null) {
                                                                            draweeSpanStringBuilder6.setSpan(obj30, length27, draweeSpanStringBuilder6.length(), 33);
                                                                        }
                                                                    }
                                                                }
                                                                draweeSpanStringBuilder6.append(" ");
                                                            } else if (contentNode2 instanceof ErrorContentNode) {
                                                                CrashReporting.captureException$default(CrashReporting.INSTANCE, ((ErrorContentNode) contentNode2).getThrowable(), false, 2, null);
                                                                draweeSpanStringBuilder6.append("���");
                                                            } else {
                                                                throw new n();
                                                            }
                                                        }
                                                    }
                                                    draweeSpanStringBuilder6 = draweeSpanStringBuilder3;
                                                }
                                            }
                                        }
                                        renderContext3 = renderContext3;
                                    }
                                }
                                draweeSpanStringBuilder6 = draweeSpanStringBuilder2;
                            }
                        } else {
                            draweeSpanStringBuilder6.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        }
                    }
                    i14 = i15;
                    num2 = num;
                }
                num = num2;
                i14 = i15;
                num2 = num;
            } else {
                d0.k();
                throw null;
            }
        }
        if (z5) {
            fixTrailingAbsoluteSizeSpanIfPresent(draweeSpanStringBuilder6);
        }
        return draweeSpanStringBuilder6;
    }

    public static /* synthetic */ DraweeSpanStringBuilder toSpannable$default(List list, RenderContext renderContext, DraweeSpanStringBuilder draweeSpanStringBuilder, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            draweeSpanStringBuilder = new DraweeSpanStringBuilder();
        }
        if ((i7 & 4) != 0) {
            z5 = true;
        }
        return toSpannable(list, renderContext, draweeSpanStringBuilder, z5);
    }
}
