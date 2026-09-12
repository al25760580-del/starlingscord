package com.discord.emoji;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import f9.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aW\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001aO\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0011\u0010\u0012\u001aa\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "builder", "Lcom/discord/emoji/RenderableEmoji;", "emoji", "Landroid/content/Context;", "context", "", "sizePx", "", "allowAnimation", "verticalAlignment", "Lkotlin/Function1;", "Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;", "", "additionalBuilderActions", "renderEmojiInto", "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Lcom/discord/emoji/RenderableEmoji;Landroid/content/Context;IZILkotlin/jvm/functions/Function1;)V", "renderEmoji", "(Lcom/discord/emoji/RenderableEmoji;Landroid/content/Context;IZILkotlin/jvm/functions/Function1;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "", "src", "contentDescription", "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;IZILkotlin/jvm/functions/Function1;)V", "emoji_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRenderableEmoji.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderableEmoji.kt\ncom/discord/emoji/RenderableEmojiKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
public final class RenderableEmojiKt {
    @NotNull
    public static final DraweeSpanStringBuilder renderEmoji(@NotNull RenderableEmoji emoji, @NotNull Context context, int i7, boolean z5, int i10, @NotNull Function1<? super GenericDraweeHierarchyBuilder, Unit> additionalBuilderActions) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalBuilderActions, "additionalBuilderActions");
        DraweeSpanStringBuilder draweeSpanStringBuilder = new DraweeSpanStringBuilder();
        renderEmojiInto(draweeSpanStringBuilder, emoji, context, i7, z5, i10, additionalBuilderActions);
        return draweeSpanStringBuilder;
    }

    public static /* synthetic */ DraweeSpanStringBuilder renderEmoji$default(RenderableEmoji renderableEmoji, Context context, int i7, boolean z5, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            i10 = 2;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            function1 = new com.discord.chat.presentation.list.delegate.a(28);
        }
        return renderEmoji(renderableEmoji, context, i7, z5, i12, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderEmoji$lambda$2(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        Intrinsics.checkNotNullParameter(genericDraweeHierarchyBuilder, "<this>");
        return Unit.f14616a;
    }

    public static final void renderEmojiInto(@NotNull DraweeSpanStringBuilder builder, @NotNull RenderableEmoji emoji, @NotNull Context context, int i7, boolean z5, int i10, @NotNull Function1<? super GenericDraweeHierarchyBuilder, Unit> additionalBuilderActions) {
        String exception;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalBuilderActions, "additionalBuilderActions");
        RenderableEmoji.Unicode unicode = emoji instanceof RenderableEmoji.Unicode ? (RenderableEmoji.Unicode) emoji : null;
        if (unicode == null || (exception = unicode.getException()) == null || builder.append((CharSequence) exception) == null) {
            renderEmojiInto(builder, emoji.getUrl(z5, i7), emoji.getContentDescription(), context, i7, z5, i10, additionalBuilderActions);
            Unit unit = Unit.f14616a;
        }
    }

    public static /* synthetic */ void renderEmojiInto$default(DraweeSpanStringBuilder draweeSpanStringBuilder, RenderableEmoji renderableEmoji, Context context, int i7, boolean z5, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            i10 = 2;
        }
        int i12 = i10;
        if ((i11 & 64) != 0) {
            function1 = new com.discord.chat.presentation.list.delegate.a(29);
        }
        renderEmojiInto(draweeSpanStringBuilder, renderableEmoji, context, i7, z5, i12, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderEmojiInto$lambda$0(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        Intrinsics.checkNotNullParameter(genericDraweeHierarchyBuilder, "<this>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderEmojiInto$lambda$4(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        Intrinsics.checkNotNullParameter(genericDraweeHierarchyBuilder, "<this>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderEmojiInto(DraweeSpanStringBuilder draweeSpanStringBuilder, String str, String str2, Context context, int i7, boolean z5, int i10, Function1<? super GenericDraweeHierarchyBuilder, Unit> function1) {
        int length = draweeSpanStringBuilder.length();
        draweeSpanStringBuilder.append((char) 8203);
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(Uri.parse(str));
        imageRequestBuilderD.f5129d = new ResizeOptions(i7, i7);
        imageRequestBuilderD.f5127b = ImageRequest.RequestLevel.FULL_FETCH;
        PipelineDraweeControllerBuilder pipelineDraweeControllerBuilderA = c9.a.f3531a.get();
        pipelineDraweeControllerBuilderA.f4636e = z5;
        pipelineDraweeControllerBuilderA.f4633b = imageRequestBuilderD.a();
        pipelineDraweeControllerBuilderA.f4637f = str2;
        c cVarA = pipelineDraweeControllerBuilderA.a();
        GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(context.getResources());
        genericDraweeHierarchyBuilder.f4714l = o.f4692f;
        function1.invoke(genericDraweeHierarchyBuilder);
        draweeSpanStringBuilder.c(genericDraweeHierarchyBuilder.a(), cVarA, length, i7, i7, i10);
    }
}
