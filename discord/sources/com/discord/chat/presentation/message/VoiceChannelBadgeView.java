package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.discord.chat.bridge.voicechannelbadges.VoiceChannelBadge;
import com.discord.chat.databinding.VoiceChannelBadgeViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/VoiceChannelBadgeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/VoiceChannelBadgeViewBinding;", "configureVoiceChannelBadge", "", "voiceChannelBadge", "Lcom/discord/chat/bridge/voicechannelbadges/VoiceChannelBadge;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VoiceChannelBadgeView extends FrameLayout {

    @NotNull
    private final VoiceChannelBadgeViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChannelBadgeView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        VoiceChannelBadgeViewBinding voiceChannelBadgeViewBindingInflate = VoiceChannelBadgeViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(voiceChannelBadgeViewBindingInflate, "inflate(...)");
        this.binding = voiceChannelBadgeViewBindingInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureVoiceChannelBadge$lambda$1$lambda$0(ChatEventHandler chatEventHandler, VoiceChannelBadge voiceChannelBadge, View view) {
        chatEventHandler.onTapVoiceChannelBadge(voiceChannelBadge.getChannelId());
    }

    public final void configureVoiceChannelBadge(@NotNull VoiceChannelBadge voiceChannelBadge, @NotNull ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(voiceChannelBadge, "voiceChannelBadge");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        SimpleDraweeView simpleDraweeView = this.binding.voiceChannelBadgeIcon;
        if (StringsKt.K(voiceChannelBadge.getChannelIconUrl())) {
            Intrinsics.checkNotNull(simpleDraweeView);
            ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.VoiceNormalIcon);
        } else {
            Context context = simpleDraweeView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            simpleDraweeView.setImageURI(ReactAssetUtilsKt.inflateUrl(context, voiceChannelBadge.getChannelIconUrl()));
        }
        Intrinsics.checkNotNull(simpleDraweeView);
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getStatusPositive()));
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, new t(1, eventHandler, voiceChannelBadge), 1, null);
    }
}
