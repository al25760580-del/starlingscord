package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag;
import com.discord.chat.databinding.ConnectionsRoleTagViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\b\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/presentation/message/ConnectionsRoleTagView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ConnectionsRoleTagViewBinding;", "configureConnectionsRoleTag", "", "userId", "Lcom/discord/primitives/UserId;", "guildId", "Lcom/discord/primitives/GuildId;", "channelId", "Lcom/discord/primitives/ChannelId;", "connectionsRoleTag", "Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "configureConnectionsRoleTag-uESh2Cg", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectionsRoleTagView extends FrameLayout {

    @NotNull
    private final ConnectionsRoleTagViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsRoleTagView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ConnectionsRoleTagViewBinding connectionsRoleTagViewBindingInflate = ConnectionsRoleTagViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(connectionsRoleTagViewBindingInflate, "inflate(...)");
        this.binding = connectionsRoleTagViewBindingInflate;
        connectionsRoleTagViewBindingInflate.connectionsRoleTagContainer.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModNormal());
        connectionsRoleTagViewBindingInflate.roleName.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        TextView roleName = connectionsRoleTagViewBindingInflate.roleName;
        Intrinsics.checkNotNullExpressionValue(roleName, "roleName");
        SetTextSizeSpKt.setTextSizeSp(roleName, 12.0f);
        TextView roleName2 = connectionsRoleTagViewBindingInflate.roleName;
        Intrinsics.checkNotNullExpressionValue(roleName2, "roleName");
        DiscordFontUtilsKt.setDiscordFont(roleName2, DiscordFont.PrimaryBold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureConnectionsRoleTag_uESh2Cg$lambda$0(ChatEventHandler chatEventHandler, UserId userId, GuildId guildId, ChannelId channelId, ConnectionsRoleTag connectionsRoleTag, View view) {
        chatEventHandler.onTapConnectionsRoleTag(UserId.m1215toStringimpl(userId.m1217unboximpl()), GuildId.m1150toStringimpl(guildId.m1152unboximpl()), ChannelId.m1137toStringimpl(channelId.m1139unboximpl()), connectionsRoleTag.getId());
    }

    /* JADX INFO: renamed from: configureConnectionsRoleTag-uESh2Cg, reason: not valid java name */
    public final void m537configureConnectionsRoleTaguESh2Cg(UserId userId, GuildId guildId, ChannelId channelId, @NotNull ConnectionsRoleTag connectionsRoleTag, @NotNull ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(connectionsRoleTag, "connectionsRoleTag");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        ImageView verifiedCheckIconBackground = this.binding.verifiedCheckIconBackground;
        Intrinsics.checkNotNullExpressionValue(verifiedCheckIconBackground, "verifiedCheckIconBackground");
        ColorUtilsKt.setTintColor(verifiedCheckIconBackground, Integer.valueOf(connectionsRoleTag.getBackgroundColor()));
        ImageView verifiedCheckIcon = this.binding.verifiedCheckIcon;
        Intrinsics.checkNotNullExpressionValue(verifiedCheckIcon, "verifiedCheckIcon");
        ColorUtilsKt.setTintColor(verifiedCheckIcon, Integer.valueOf(connectionsRoleTag.getIconColor()));
        this.binding.roleName.setText(connectionsRoleTag.getName());
        if (userId == null || guildId == null || channelId == null) {
            return;
        }
        CardView connectionsRoleTagContainer = this.binding.connectionsRoleTagContainer;
        Intrinsics.checkNotNullExpressionValue(connectionsRoleTagContainer, "connectionsRoleTagContainer");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(connectionsRoleTagContainer, false, new b(eventHandler, userId, guildId, channelId, connectionsRoleTag, 0), 1, null);
    }
}
