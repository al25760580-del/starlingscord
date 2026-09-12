package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.list.MaskedShadowView;
import com.discord.chat.presentation.message.ClanTagChipletView;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.GameIconView;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.RoleIconView;
import com.discord.chat.presentation.message.VoiceChannelBadgeView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MessageViewBinding implements ViewBinding {

    @NonNull
    public final MessageAccessoriesView accessoriesView;

    @NonNull
    public final SimpleDraweeView authorAvatar;

    @NonNull
    public final SimpleDraweeView authorAvatarDecoration;

    @NonNull
    public final TextView authorName;

    @NonNull
    public final ClanTagChipletView clanTagChiplet;

    @NonNull
    public final ConnectionsRoleTagView connectionsRoleTag;

    @NonNull
    public final GameIconView gameIcon;

    @NonNull
    public final SimpleDraweeView guildCommunicationDisabledIcon;

    @NonNull
    public final LinearLayout header;

    @NonNull
    public final ClanTagChipletView lobbyTagChiplet;

    @NonNull
    public final Barrier messageHeaderBarrier;

    @NonNull
    public final View messageHeaderDivider;

    @NonNull
    public final MessageTagView messageTagView;

    @NonNull
    public final ViewStub replyPreviewView;

    @NonNull
    public final RoleDotView roleDot;

    @NonNull
    public final RoleIconView roleIcon;

    @NonNull
    private final View rootView;

    @NonNull
    public final MaskedShadowView shadowView;

    @NonNull
    public final SimpleDraweeView suppressNotificationsIcon;

    @NonNull
    public final TextView timestamp;

    @NonNull
    public final VoiceChannelBadgeView voiceChannelBadge;

    private MessageViewBinding(@NonNull View view, @NonNull MessageAccessoriesView messageAccessoriesView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView, @NonNull ClanTagChipletView clanTagChipletView, @NonNull ConnectionsRoleTagView connectionsRoleTagView, @NonNull GameIconView gameIconView, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull LinearLayout linearLayout, @NonNull ClanTagChipletView clanTagChipletView2, @NonNull Barrier barrier, @NonNull View view2, @NonNull MessageTagView messageTagView, @NonNull ViewStub viewStub, @NonNull RoleDotView roleDotView, @NonNull RoleIconView roleIconView, @NonNull MaskedShadowView maskedShadowView, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull TextView textView2, @NonNull VoiceChannelBadgeView voiceChannelBadgeView) {
        this.rootView = view;
        this.accessoriesView = messageAccessoriesView;
        this.authorAvatar = simpleDraweeView;
        this.authorAvatarDecoration = simpleDraweeView2;
        this.authorName = textView;
        this.clanTagChiplet = clanTagChipletView;
        this.connectionsRoleTag = connectionsRoleTagView;
        this.gameIcon = gameIconView;
        this.guildCommunicationDisabledIcon = simpleDraweeView3;
        this.header = linearLayout;
        this.lobbyTagChiplet = clanTagChipletView2;
        this.messageHeaderBarrier = barrier;
        this.messageHeaderDivider = view2;
        this.messageTagView = messageTagView;
        this.replyPreviewView = viewStub;
        this.roleDot = roleDotView;
        this.roleIcon = roleIconView;
        this.shadowView = maskedShadowView;
        this.suppressNotificationsIcon = simpleDraweeView4;
        this.timestamp = textView2;
        this.voiceChannelBadge = voiceChannelBadgeView;
    }

    @NonNull
    public static MessageViewBinding bind(@NonNull View view) {
        View viewK;
        int i7 = R.id.accessories_view;
        MessageAccessoriesView messageAccessoriesView = (MessageAccessoriesView) a.k(i7, view);
        if (messageAccessoriesView != null) {
            i7 = R.id.author_avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView != null) {
                i7 = R.id.author_avatar_decoration;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                if (simpleDraweeView2 != null) {
                    i7 = R.id.author_name;
                    TextView textView = (TextView) a.k(i7, view);
                    if (textView != null) {
                        i7 = R.id.clan_tag_chiplet;
                        ClanTagChipletView clanTagChipletView = (ClanTagChipletView) a.k(i7, view);
                        if (clanTagChipletView != null) {
                            i7 = R.id.connections_role_tag;
                            ConnectionsRoleTagView connectionsRoleTagView = (ConnectionsRoleTagView) a.k(i7, view);
                            if (connectionsRoleTagView != null) {
                                i7 = R.id.game_icon;
                                GameIconView gameIconView = (GameIconView) a.k(i7, view);
                                if (gameIconView != null) {
                                    i7 = R.id.guild_communication_disabled_icon;
                                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                                    if (simpleDraweeView3 != null) {
                                        i7 = R.id.header;
                                        LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
                                        if (linearLayout != null) {
                                            i7 = R.id.lobby_tag_chiplet;
                                            ClanTagChipletView clanTagChipletView2 = (ClanTagChipletView) a.k(i7, view);
                                            if (clanTagChipletView2 != null) {
                                                i7 = R.id.message_header_barrier;
                                                Barrier barrier = (Barrier) a.k(i7, view);
                                                if (barrier != null && (viewK = a.k((i7 = R.id.message_header_divider), view)) != null) {
                                                    i7 = R.id.message_tag_view;
                                                    MessageTagView messageTagView = (MessageTagView) a.k(i7, view);
                                                    if (messageTagView != null) {
                                                        i7 = R.id.reply_preview_view;
                                                        ViewStub viewStub = (ViewStub) a.k(i7, view);
                                                        if (viewStub != null) {
                                                            i7 = R.id.role_dot;
                                                            RoleDotView roleDotView = (RoleDotView) a.k(i7, view);
                                                            if (roleDotView != null) {
                                                                i7 = R.id.role_icon;
                                                                RoleIconView roleIconView = (RoleIconView) a.k(i7, view);
                                                                if (roleIconView != null) {
                                                                    i7 = R.id.shadow_view;
                                                                    MaskedShadowView maskedShadowView = (MaskedShadowView) a.k(i7, view);
                                                                    if (maskedShadowView != null) {
                                                                        i7 = R.id.suppress_notifications_icon;
                                                                        SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.k(i7, view);
                                                                        if (simpleDraweeView4 != null) {
                                                                            i7 = R.id.timestamp;
                                                                            TextView textView2 = (TextView) a.k(i7, view);
                                                                            if (textView2 != null) {
                                                                                i7 = R.id.voice_channel_badge;
                                                                                VoiceChannelBadgeView voiceChannelBadgeView = (VoiceChannelBadgeView) a.k(i7, view);
                                                                                if (voiceChannelBadgeView != null) {
                                                                                    return new MessageViewBinding(view, messageAccessoriesView, simpleDraweeView, simpleDraweeView2, textView, clanTagChipletView, connectionsRoleTagView, gameIconView, simpleDraweeView3, linearLayout, clanTagChipletView2, barrier, viewK, messageTagView, viewStub, roleDotView, roleIconView, maskedShadowView, simpleDraweeView4, textView2, voiceChannelBadgeView);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static MessageViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.message_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
