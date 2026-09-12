package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.GuildView;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class GuildProfileInviteViewBinding implements ViewBinding {

    @NonNull
    public final DCDButton acceptButton;

    @NonNull
    public final GuildView avatar;

    @NonNull
    public final FrameLayout avatarContainer;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final TextView bodyText;

    @NonNull
    public final TextView establishedText;

    @NonNull
    public final SimpleDraweeView guildBadge;

    @NonNull
    public final TextView headerText;

    @NonNull
    public final ImageView itemInviteOnlineDot;

    @NonNull
    public final TextView itemInviteOnlineText;

    @NonNull
    public final SimpleDraweeView itemInviteSplash;

    @NonNull
    public final ImageView itemInviteTotalMemberDot;

    @NonNull
    public final TextView itemInviteTotalMemberText;

    @NonNull
    public final View overlayGradient;

    @NonNull
    public final RecyclerView rolesContainer;

    @NonNull
    public final TextView rolesHeadingText;

    @NonNull
    private final View rootView;

    @NonNull
    public final Barrier serverNameBarrier;

    @NonNull
    public final View spacer;

    @NonNull
    public final TextView titleText;

    private GuildProfileInviteViewBinding(@NonNull View view, @NonNull DCDButton dCDButton, @NonNull GuildView guildView, @NonNull FrameLayout frameLayout, @NonNull Barrier barrier, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull ImageView imageView2, @NonNull TextView textView5, @NonNull View view2, @NonNull RecyclerView recyclerView, @NonNull TextView textView6, @NonNull Barrier barrier2, @NonNull View view3, @NonNull TextView textView7) {
        this.rootView = view;
        this.acceptButton = dCDButton;
        this.avatar = guildView;
        this.avatarContainer = frameLayout;
        this.barrier = barrier;
        this.bodyText = textView;
        this.establishedText = textView2;
        this.guildBadge = simpleDraweeView;
        this.headerText = textView3;
        this.itemInviteOnlineDot = imageView;
        this.itemInviteOnlineText = textView4;
        this.itemInviteSplash = simpleDraweeView2;
        this.itemInviteTotalMemberDot = imageView2;
        this.itemInviteTotalMemberText = textView5;
        this.overlayGradient = view2;
        this.rolesContainer = recyclerView;
        this.rolesHeadingText = textView6;
        this.serverNameBarrier = barrier2;
        this.spacer = view3;
        this.titleText = textView7;
    }

    @NonNull
    public static GuildProfileInviteViewBinding bind(@NonNull View view) {
        View viewK;
        View viewK2;
        int i7 = R.id.accept_button;
        DCDButton dCDButton = (DCDButton) a.k(i7, view);
        if (dCDButton != null) {
            i7 = R.id.avatar;
            GuildView guildView = (GuildView) a.k(i7, view);
            if (guildView != null) {
                i7 = R.id.avatar_container;
                FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
                if (frameLayout != null) {
                    i7 = R.id.barrier;
                    Barrier barrier = (Barrier) a.k(i7, view);
                    if (barrier != null) {
                        i7 = R.id.body_text;
                        TextView textView = (TextView) a.k(i7, view);
                        if (textView != null) {
                            i7 = R.id.established_text;
                            TextView textView2 = (TextView) a.k(i7, view);
                            if (textView2 != null) {
                                i7 = R.id.guild_badge;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                                if (simpleDraweeView != null) {
                                    i7 = R.id.header_text;
                                    TextView textView3 = (TextView) a.k(i7, view);
                                    if (textView3 != null) {
                                        i7 = R.id.item_invite_online_dot;
                                        ImageView imageView = (ImageView) a.k(i7, view);
                                        if (imageView != null) {
                                            i7 = R.id.item_invite_online_text;
                                            TextView textView4 = (TextView) a.k(i7, view);
                                            if (textView4 != null) {
                                                i7 = R.id.item_invite_splash;
                                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                                                if (simpleDraweeView2 != null) {
                                                    i7 = R.id.item_invite_total_member_dot;
                                                    ImageView imageView2 = (ImageView) a.k(i7, view);
                                                    if (imageView2 != null) {
                                                        i7 = R.id.item_invite_total_member_text;
                                                        TextView textView5 = (TextView) a.k(i7, view);
                                                        if (textView5 != null && (viewK = a.k((i7 = R.id.overlay_gradient), view)) != null) {
                                                            i7 = R.id.roles_container;
                                                            RecyclerView recyclerView = (RecyclerView) a.k(i7, view);
                                                            if (recyclerView != null) {
                                                                i7 = R.id.roles_heading_text;
                                                                TextView textView6 = (TextView) a.k(i7, view);
                                                                if (textView6 != null) {
                                                                    i7 = R.id.server_name_barrier;
                                                                    Barrier barrier2 = (Barrier) a.k(i7, view);
                                                                    if (barrier2 != null && (viewK2 = a.k((i7 = R.id.spacer), view)) != null) {
                                                                        i7 = R.id.title_text;
                                                                        TextView textView7 = (TextView) a.k(i7, view);
                                                                        if (textView7 != null) {
                                                                            return new GuildProfileInviteViewBinding(view, dCDButton, guildView, frameLayout, barrier, textView, textView2, simpleDraweeView, textView3, imageView, textView4, simpleDraweeView2, imageView2, textView5, viewK, recyclerView, textView6, barrier2, viewK2, textView7);
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
    public static GuildProfileInviteViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.guild_profile_invite_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
