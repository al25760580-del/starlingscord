package com.discord.chat.presentation.message.view.botuikit.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.discord.chat.R;
import com.discord.chat.bridge.botuikit.ThumbnailDisplayComponent;
import com.discord.chat.bridge.media.UnfurledMediaItem;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.d;
import com.discord.chat.presentation.message.s;
import com.discord.chat.presentation.message.view.MediaImageView;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.ComponentView;
import com.discord.chat.presentation.message.viewholder.MediaImageViewHolder;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ThumbnailDisplayComponentView;", "Lcom/discord/chat/presentation/message/view/MediaImageView;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageViewHolder", "Lcom/discord/chat/presentation/message/viewholder/MediaImageViewHolder;", "getComponentType", "Lkotlin/reflect/KClass;", "configure", "", "component", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentContext", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThumbnailDisplayComponentView extends MediaImageView implements ComponentView<ThumbnailDisplayComponent> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final MediaImageViewHolder imageViewHolder;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ThumbnailDisplayComponentView$Companion;", "", "<init>", "()V", "inflateComponent", "Lcom/discord/chat/presentation/message/view/botuikit/components/ThumbnailDisplayComponentView;", "context", "Landroid/content/Context;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final ThumbnailDisplayComponentView inflateComponent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new ThumbnailDisplayComponentView(context, null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThumbnailDisplayComponentView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$0(ComponentContext componentContext, ThumbnailDisplayComponentView thumbnailDisplayComponentView, ThumbnailDisplayComponent thumbnailDisplayComponent, View view) {
        componentContext.getMediaItemEventHandlers().getOnMediaItemClicked().invoke(thumbnailDisplayComponentView, thumbnailDisplayComponent.getId(), 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean configure$lambda$1(ComponentContext componentContext, ThumbnailDisplayComponent thumbnailDisplayComponent, View view) {
        Function2<String, Integer, Unit> onMediaItemLongClicked = componentContext.getMediaItemEventHandlers().getOnMediaItemLongClicked();
        if (onMediaItemLongClicked != null) {
            onMediaItemLongClicked.invoke(thumbnailDisplayComponent.getId(), 0);
        }
        return false;
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    @NotNull
    public KClass getComponentType() {
        return Reflection.getOrCreateKotlinClass(ThumbnailDisplayComponent.class);
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void onRecycle(@NotNull ComponentProvider componentProvider) {
        ComponentView.DefaultImpls.onRecycle(this, componentProvider);
    }

    public /* synthetic */ ThumbnailDisplayComponentView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void configure(@NotNull ThumbnailDisplayComponent component, @NotNull ComponentProvider componentProvider, @NotNull ComponentContext componentContext) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        SpoilerAttributes spoilerAttributesForGenericMedia = SpoilerAttributes.INSTANCE.forGenericMedia(component, componentContext.getContainerId(), g.e("ThumbnailDisplayComponent(", component.getId(), ")"), component.getMedia().getProxyUrl(), component.getVerifyAge());
        UnfurledMediaItem media = component.getMedia();
        MediaImageViewHolder mediaImageViewHolder = this.imageViewHolder;
        boolean zIsSpoiler = component.isSpoiler();
        SpoilerConfig spoilerConfigConfigure$default = spoilerAttributesForGenericMedia != null ? SpoilerAttributes.configure$default(spoilerAttributesForGenericMedia, componentContext.getMediaItemEventHandlers().getOnMediaItemSpoilerClicked(), null, 2, null) : null;
        boolean zIsObscure = component.isObscure();
        boolean zIsObscureAwaitingScan = component.isObscureAwaitingScan();
        boolean obscureHideControls = component.getObscureHideControls();
        boolean obscureIsOpaque = component.getObscureIsOpaque();
        String proxyUrl = media.getProxyUrl();
        Integer width = media.getWidth();
        int iIntValue = width != null ? width.intValue() : 0;
        Integer height = media.getHeight();
        mediaImageViewHolder.bind(proxyUrl, iIntValue, height != null ? height.intValue() : 0, media.getPlaceholder(), media.getPlaceholderVersion(), zIsSpoiler, spoilerConfigConfigure$default, zIsObscure, zIsObscureAwaitingScan, obscureHideControls, obscureIsOpaque, false, component.getDescription(), component.getDescriptionHint(), false, null, getContext().getResources().getDimensionPixelSize(R.dimen.message_media_non_mosaic_radius), MediaContainingViewResizer.ResizeMode.Cover, false, new d(componentContext, this, component, 5), new s(3, componentContext, component), null, component.getAccessibilityRole(), componentContext.getShouldAutoPlayGif(), null, component.getMedia().getSrcIsAnimated());
        int thumbnail_big_mode_size = componentContext.getWidthInfo().isLargeWidthRenderingMode() ? ThumbnailDisplayComponentViewKt.getTHUMBNAIL_BIG_MODE_SIZE() : ThumbnailDisplayComponentViewKt.getTHUMBNAIL_NORMAL_SIZE();
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(thumbnail_big_mode_size, thumbnail_big_mode_size);
        layoutParams.f5878i = 0.0f;
        getBinding().getRoot().setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbnailDisplayComponentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.imageViewHolder = new MediaImageViewHolder(this);
    }
}
