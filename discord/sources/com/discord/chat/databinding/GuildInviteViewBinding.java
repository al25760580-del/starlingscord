package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.GuildView;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class GuildInviteViewBinding implements ViewBinding {

    @NonNull
    public final Barrier barrierButton;

    @NonNull
    public final Barrier barrierHeader;

    @NonNull
    public final ConstraintLayout itemBottomContainer;

    @NonNull
    public final SimpleDraweeView itemGuildBadge;

    @NonNull
    public final TextView itemInviteHeader;

    @NonNull
    public final FrameLayout itemInviteHubLayout;

    @NonNull
    public final TextView itemInviteHubLink;

    @NonNull
    public final GuildView itemInviteImage;

    @NonNull
    public final DCDButton itemInviteJoinedButton;

    @NonNull
    public final LinearLayout itemInviteMemberContainer;

    @NonNull
    public final ImageView itemInviteOnlineDot;

    @NonNull
    public final TextView itemInviteOnlineText;

    @NonNull
    public final SimpleDraweeView itemInviteSplash;

    @NonNull
    public final TextView itemInviteSubtitle;

    @NonNull
    public final SimpleDraweeView itemInviteSubtitleIcon;

    @NonNull
    public final TextView itemInviteTitle;

    @NonNull
    public final ImageView itemInviteTotalMemberDot;

    @NonNull
    public final TextView itemInviteTotalMemberText;

    @NonNull
    private final View rootView;

    private GuildInviteViewBinding(@NonNull View view, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull TextView textView2, @NonNull GuildView guildView, @NonNull DCDButton dCDButton, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView5, @NonNull ImageView imageView2, @NonNull TextView textView6) {
        this.rootView = view;
        this.barrierButton = barrier;
        this.barrierHeader = barrier2;
        this.itemBottomContainer = constraintLayout;
        this.itemGuildBadge = simpleDraweeView;
        this.itemInviteHeader = textView;
        this.itemInviteHubLayout = frameLayout;
        this.itemInviteHubLink = textView2;
        this.itemInviteImage = guildView;
        this.itemInviteJoinedButton = dCDButton;
        this.itemInviteMemberContainer = linearLayout;
        this.itemInviteOnlineDot = imageView;
        this.itemInviteOnlineText = textView3;
        this.itemInviteSplash = simpleDraweeView2;
        this.itemInviteSubtitle = textView4;
        this.itemInviteSubtitleIcon = simpleDraweeView3;
        this.itemInviteTitle = textView5;
        this.itemInviteTotalMemberDot = imageView2;
        this.itemInviteTotalMemberText = textView6;
    }

    @NonNull
    public static GuildInviteViewBinding bind(@NonNull View view) {
        int i7 = R.id.barrier_button;
        Barrier barrier = (Barrier) a.k(i7, view);
        if (barrier != null) {
            i7 = R.id.barrier_header;
            Barrier barrier2 = (Barrier) a.k(i7, view);
            if (barrier2 != null) {
                i7 = R.id.item_bottom_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                if (constraintLayout != null) {
                    i7 = R.id.item_guild_badge;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                    if (simpleDraweeView != null) {
                        i7 = R.id.item_invite_header;
                        TextView textView = (TextView) a.k(i7, view);
                        if (textView != null) {
                            i7 = R.id.item_invite_hub_layout;
                            FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
                            if (frameLayout != null) {
                                i7 = R.id.item_invite_hub_link;
                                TextView textView2 = (TextView) a.k(i7, view);
                                if (textView2 != null) {
                                    i7 = R.id.item_invite_image;
                                    GuildView guildView = (GuildView) a.k(i7, view);
                                    if (guildView != null) {
                                        i7 = R.id.item_invite_joined_button;
                                        DCDButton dCDButton = (DCDButton) a.k(i7, view);
                                        if (dCDButton != null) {
                                            i7 = R.id.item_invite_member_container;
                                            LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
                                            if (linearLayout != null) {
                                                i7 = R.id.item_invite_online_dot;
                                                ImageView imageView = (ImageView) a.k(i7, view);
                                                if (imageView != null) {
                                                    i7 = R.id.item_invite_online_text;
                                                    TextView textView3 = (TextView) a.k(i7, view);
                                                    if (textView3 != null) {
                                                        i7 = R.id.item_invite_splash;
                                                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                                                        if (simpleDraweeView2 != null) {
                                                            i7 = R.id.item_invite_subtitle;
                                                            TextView textView4 = (TextView) a.k(i7, view);
                                                            if (textView4 != null) {
                                                                i7 = R.id.item_invite_subtitle_icon;
                                                                SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                                                                if (simpleDraweeView3 != null) {
                                                                    i7 = R.id.item_invite_title;
                                                                    TextView textView5 = (TextView) a.k(i7, view);
                                                                    if (textView5 != null) {
                                                                        i7 = R.id.item_invite_total_member_dot;
                                                                        ImageView imageView2 = (ImageView) a.k(i7, view);
                                                                        if (imageView2 != null) {
                                                                            i7 = R.id.item_invite_total_member_text;
                                                                            TextView textView6 = (TextView) a.k(i7, view);
                                                                            if (textView6 != null) {
                                                                                return new GuildInviteViewBinding(view, barrier, barrier2, constraintLayout, simpleDraweeView, textView, frameLayout, textView2, guildView, dCDButton, linearLayout, imageView, textView3, simpleDraweeView2, textView4, simpleDraweeView3, textView5, imageView2, textView6);
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
    public static GuildInviteViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.guild_invite_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
