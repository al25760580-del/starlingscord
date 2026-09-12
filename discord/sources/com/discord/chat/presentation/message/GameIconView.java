package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.discord.chat.databinding.GameIconViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/GameIconView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/GameIconViewBinding;", "configureGameIcon", "", "gameApplicationId", "", "timestamp", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GameIconView extends FrameLayout {

    @NotNull
    private final GameIconViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameIconView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        GameIconViewBinding gameIconViewBindingInflate = GameIconViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(gameIconViewBindingInflate, "inflate(...)");
        this.binding = gameIconViewBindingInflate;
        SimpleDraweeView gameControllerIcon = gameIconViewBindingInflate.gameControllerIcon;
        Intrinsics.checkNotNullExpressionValue(gameControllerIcon, "gameControllerIcon");
        ReactAssetUtilsKt.setReactAsset(gameControllerIcon, ReactAsset.GameControllerIcon);
        SimpleDraweeView gameControllerIcon2 = gameIconViewBindingInflate.gameControllerIcon;
        Intrinsics.checkNotNullExpressionValue(gameControllerIcon2, "gameControllerIcon");
        ColorUtilsKt.setTintColor(gameControllerIcon2, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
    }

    public final void configureGameIcon(@NotNull String gameApplicationId, @NotNull String timestamp, @NotNull ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(gameApplicationId, "gameApplicationId");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        SimpleDraweeView gameControllerIcon = this.binding.gameControllerIcon;
        Intrinsics.checkNotNullExpressionValue(gameControllerIcon, "gameControllerIcon");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(gameControllerIcon, false, new d(eventHandler, gameApplicationId, timestamp, 0), 1, null);
    }
}
