package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.RoleIconView;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedFooterView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class FlaggedMessageEmbedViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView authorAvatar;

    @NonNull
    public final TextView authorName;

    @NonNull
    public final ConnectionsRoleTagView connectionsRoleTag;

    @NonNull
    public final FlaggedMessageEmbedFooterView contentFooterView;

    @NonNull
    public final MessageContentView contentView;

    @NonNull
    public final SimpleDraweeView guildCommunicationDisabledIcon;

    @NonNull
    public final Guideline messageEndGuideline;

    @NonNull
    public final Guideline messageStartGuideline;

    @NonNull
    public final RoleIconView roleIcon;

    @NonNull
    private final View rootView;

    private FlaggedMessageEmbedViewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull ConnectionsRoleTagView connectionsRoleTagView, @NonNull FlaggedMessageEmbedFooterView flaggedMessageEmbedFooterView, @NonNull MessageContentView messageContentView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull RoleIconView roleIconView) {
        this.rootView = view;
        this.authorAvatar = simpleDraweeView;
        this.authorName = textView;
        this.connectionsRoleTag = connectionsRoleTagView;
        this.contentFooterView = flaggedMessageEmbedFooterView;
        this.contentView = messageContentView;
        this.guildCommunicationDisabledIcon = simpleDraweeView2;
        this.messageEndGuideline = guideline;
        this.messageStartGuideline = guideline2;
        this.roleIcon = roleIconView;
    }

    @NonNull
    public static FlaggedMessageEmbedViewBinding bind(@NonNull View view) {
        int i7 = R.id.author_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.author_name;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                i7 = R.id.connections_role_tag;
                ConnectionsRoleTagView connectionsRoleTagView = (ConnectionsRoleTagView) a.k(i7, view);
                if (connectionsRoleTagView != null) {
                    i7 = R.id.content_footer_view;
                    FlaggedMessageEmbedFooterView flaggedMessageEmbedFooterView = (FlaggedMessageEmbedFooterView) a.k(i7, view);
                    if (flaggedMessageEmbedFooterView != null) {
                        i7 = R.id.content_view;
                        MessageContentView messageContentView = (MessageContentView) a.k(i7, view);
                        if (messageContentView != null) {
                            i7 = R.id.guild_communication_disabled_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                            if (simpleDraweeView2 != null) {
                                i7 = R.id.message_end_guideline;
                                Guideline guideline = (Guideline) a.k(i7, view);
                                if (guideline != null) {
                                    i7 = R.id.message_start_guideline;
                                    Guideline guideline2 = (Guideline) a.k(i7, view);
                                    if (guideline2 != null) {
                                        i7 = R.id.role_icon;
                                        RoleIconView roleIconView = (RoleIconView) a.k(i7, view);
                                        if (roleIconView != null) {
                                            return new FlaggedMessageEmbedViewBinding(view, simpleDraweeView, textView, connectionsRoleTagView, flaggedMessageEmbedFooterView, messageContentView, simpleDraweeView2, guideline, guideline2, roleIconView);
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
    public static FlaggedMessageEmbedViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.flagged_message_embed_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
