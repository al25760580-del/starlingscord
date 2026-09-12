package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.GuildView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class GuildInviteDisabledViewBinding implements ViewBinding {

    @NonNull
    public final Barrier barrierButton;

    @NonNull
    public final Barrier barrierHeader;

    @NonNull
    public final ConstraintLayout itemBottomContainer;

    @NonNull
    public final SimpleDraweeView itemInviteDisabledIcon;

    @NonNull
    public final TextView itemInviteHeader;

    @NonNull
    public final SimpleDraweeView itemInviteHelpIcon;

    @NonNull
    public final GuildView itemInviteImage;

    @NonNull
    public final SimpleDraweeSpanTextView itemInviteSubtitle;

    @NonNull
    public final TextView itemInviteTitle;

    @NonNull
    private final View rootView;

    private GuildInviteDisabledViewBinding(@NonNull View view, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull GuildView guildView, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, @NonNull TextView textView2) {
        this.rootView = view;
        this.barrierButton = barrier;
        this.barrierHeader = barrier2;
        this.itemBottomContainer = constraintLayout;
        this.itemInviteDisabledIcon = simpleDraweeView;
        this.itemInviteHeader = textView;
        this.itemInviteHelpIcon = simpleDraweeView2;
        this.itemInviteImage = guildView;
        this.itemInviteSubtitle = simpleDraweeSpanTextView;
        this.itemInviteTitle = textView2;
    }

    @NonNull
    public static GuildInviteDisabledViewBinding bind(@NonNull View view) {
        int i7 = R.id.barrier_button;
        Barrier barrier = (Barrier) a.k(i7, view);
        if (barrier != null) {
            i7 = R.id.barrier_header;
            Barrier barrier2 = (Barrier) a.k(i7, view);
            if (barrier2 != null) {
                i7 = R.id.item_bottom_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                if (constraintLayout != null) {
                    i7 = R.id.item_invite_disabled_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                    if (simpleDraweeView != null) {
                        i7 = R.id.item_invite_header;
                        TextView textView = (TextView) a.k(i7, view);
                        if (textView != null) {
                            i7 = R.id.item_invite_help_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                            if (simpleDraweeView2 != null) {
                                i7 = R.id.item_invite_image;
                                GuildView guildView = (GuildView) a.k(i7, view);
                                if (guildView != null) {
                                    i7 = R.id.item_invite_subtitle;
                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
                                    if (simpleDraweeSpanTextView != null) {
                                        i7 = R.id.item_invite_title;
                                        TextView textView2 = (TextView) a.k(i7, view);
                                        if (textView2 != null) {
                                            return new GuildInviteDisabledViewBinding(view, barrier, barrier2, constraintLayout, simpleDraweeView, textView, simpleDraweeView2, guildView, simpleDraweeSpanTextView, textView2);
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
    public static GuildInviteDisabledViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.guild_invite_disabled_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
