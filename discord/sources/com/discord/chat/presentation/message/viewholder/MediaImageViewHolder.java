package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.view.MediaImageView;
import com.discord.chat.presentation.message.view.UploadItemProps;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0085\u0002\u0010+\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\r2\u001a\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`\u001b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u00062\u0006\u0010*\u001a\u00020\r¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-¨\u0006."}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/MediaImageViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/MediaImageView;", "view", "<init>", "(Lcom/discord/chat/presentation/message/view/MediaImageView;)V", "", "url", "", "width", "height", "placeholder", "placeholderVersion", "", "isSpoiler", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "isObscure", "isObscureAwaitingScan", "obscureHideControls", "obscureIsOpaque", "showDescription", "description", "descriptionHint", "useNewAltTextButton", "Lkotlin/Function1;", "", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", "onAltTextButtonClicked", "radiusPx", "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", ViewProps.RESIZE_MODE, "isPartOfMosaic", "Landroid/view/View$OnClickListener;", "onClicked", "Landroid/view/View$OnLongClickListener;", "onLongClicked", "Lcom/discord/chat/presentation/message/view/UploadItemProps;", "uploadItemProps", ViewProps.ACCESSIBILITY_ROLE, "shouldAutoPlayGif", "filename", "srcIsAnimated", "bind", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;ZZZZZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;ZLandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lcom/discord/chat/presentation/message/view/UploadItemProps;Ljava/lang/String;ZLjava/lang/String;Z)V", "Lcom/discord/chat/presentation/message/view/MediaImageView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MediaImageViewHolder extends MessagePartViewHolder {

    @NotNull
    private final MediaImageView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaImageViewHolder(@NotNull MediaImageView view) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull String url, int width, int height, String placeholder, Integer placeholderVersion, boolean isSpoiler, SpoilerConfig spoilerConfig, boolean isObscure, boolean isObscureAwaitingScan, boolean obscureHideControls, boolean obscureIsOpaque, boolean showDescription, String description, String descriptionHint, boolean useNewAltTextButton, Function1<? super String, Unit> onAltTextButtonClicked, int radiusPx, @NotNull MediaContainingViewResizer.ResizeMode resizeMode, boolean isPartOfMosaic, View.OnClickListener onClicked, View.OnLongClickListener onLongClicked, UploadItemProps uploadItemProps, String accessibilityRole, boolean shouldAutoPlayGif, String filename, boolean srcIsAnimated) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
        this.view.setContent(url, width, height, resizeMode, placeholder, placeholderVersion, isSpoiler, spoilerConfig, radiusPx, uploadItemProps, isObscure, isObscureAwaitingScan, obscureHideControls, obscureIsOpaque, isPartOfMosaic, shouldAutoPlayGif, filename, srcIsAnimated);
        if (onClicked != null) {
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.view, false, onClicked, 1, null);
        }
        if (onLongClicked != null) {
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this.view, false, onLongClicked, 1, null);
        }
        this.view.setAccessibility(description, descriptionHint, accessibilityRole);
        this.view.showAltTextButton(useNewAltTextButton && showDescription, description, onAltTextButtonClicked);
        this.view.showDescription(!useNewAltTextButton && showDescription, description);
    }
}
