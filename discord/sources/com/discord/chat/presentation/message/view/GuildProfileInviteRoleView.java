package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.codedlinks.InviteRole;
import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.roleicons.RoleIcon;
import com.discord.chat.databinding.GuildProfileInviteRoleViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetImageUriWithCachePolicyKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/view/GuildProfileInviteRoleView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/GuildProfileInviteRoleViewBinding;", "setRole", "", ViewProps.ROLE, "Lcom/discord/chat/bridge/codedlinks/InviteRole;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuildProfileInviteRoleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuildProfileInviteRoleView.kt\ncom/discord/chat/presentation/message/view/GuildProfileInviteRoleView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,61:1\n257#2,2:62\n257#2,2:64\n257#2,2:66\n257#2,2:68\n257#2,2:70\n257#2,2:72\n*S KotlinDebug\n*F\n+ 1 GuildProfileInviteRoleView.kt\ncom/discord/chat/presentation/message/view/GuildProfileInviteRoleView\n*L\n48#1:62,2\n50#1:64,2\n52#1:66,2\n53#1:68,2\n56#1:70,2\n57#1:72,2\n*E\n"})
public final class GuildProfileInviteRoleView extends LinearLayout {

    @NotNull
    private final GuildProfileInviteRoleViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildProfileInviteRoleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setRole(@NotNull InviteRole role) {
        Intrinsics.checkNotNullParameter(role, "role");
        this.binding.roleDot.configure(new RoleColors(role.getColor(), (Integer) null, (Integer) null, 6, (DefaultConstructorMarker) null), 12);
        this.binding.roleName.setText(role.getName());
        RoleIcon roleIcon = role.getRoleIcon();
        if ((roleIcon != null ? roleIcon.getSource() : null) != null) {
            SimpleDraweeView roleIcon2 = this.binding.roleIcon;
            Intrinsics.checkNotNullExpressionValue(roleIcon2, "roleIcon");
            roleIcon2.setVisibility(0);
            SimpleDraweeView roleIcon3 = this.binding.roleIcon;
            Intrinsics.checkNotNullExpressionValue(roleIcon3, "roleIcon");
            SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(roleIcon3, roleIcon.getSource());
            TextView roleEmoji = this.binding.roleEmoji;
            Intrinsics.checkNotNullExpressionValue(roleEmoji, "roleEmoji");
            roleEmoji.setVisibility(8);
            return;
        }
        if ((roleIcon != null ? roleIcon.getUnicodeEmoji() : null) == null) {
            SimpleDraweeView roleIcon4 = this.binding.roleIcon;
            Intrinsics.checkNotNullExpressionValue(roleIcon4, "roleIcon");
            roleIcon4.setVisibility(8);
            TextView roleEmoji2 = this.binding.roleEmoji;
            Intrinsics.checkNotNullExpressionValue(roleEmoji2, "roleEmoji");
            roleEmoji2.setVisibility(8);
            return;
        }
        SimpleDraweeView roleIcon5 = this.binding.roleIcon;
        Intrinsics.checkNotNullExpressionValue(roleIcon5, "roleIcon");
        roleIcon5.setVisibility(8);
        TextView roleEmoji3 = this.binding.roleEmoji;
        Intrinsics.checkNotNullExpressionValue(roleEmoji3, "roleEmoji");
        roleEmoji3.setVisibility(0);
        this.binding.roleEmoji.setText(roleIcon.getUnicodeEmoji());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildProfileInviteRoleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GuildProfileInviteRoleView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildProfileInviteRoleView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        GuildProfileInviteRoleViewBinding guildProfileInviteRoleViewBindingInflate = GuildProfileInviteRoleViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(guildProfileInviteRoleViewBindingInflate, "inflate(...)");
        this.binding = guildProfileInviteRoleViewBindingInflate;
        setOrientation(0);
        setGravity(16);
        setPadding(SizeUtilsKt.getDpToPx(6), SizeUtilsKt.getDpToPx(6), SizeUtilsKt.getDpToPx(6), SizeUtilsKt.getDpToPx(6));
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundModNormal(), SizeUtilsKt.getDpToPx(8), null, 0, 12, null);
        TextView textView = guildProfileInviteRoleViewBindingInflate.roleName;
        textView.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryNormal);
    }
}
