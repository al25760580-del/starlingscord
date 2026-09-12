package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ClanTagChipletView;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MessageViewReplyPreviewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView replyAuthorAvatar;

    @NonNull
    public final TextView replyAuthorName;

    @NonNull
    public final SimpleDraweeView replyIcon;

    @NonNull
    public final SimpleDraweeView replyLeadingIcon;

    @NonNull
    public final LinearLayout replyLeadingViews;

    @NonNull
    public final MessageTagView replyMessageTagView;

    @NonNull
    public final RoleDotView replyRoleDot;

    @NonNull
    public final ChannelSpineView replySpline;

    @NonNull
    public final MessageContentView replyText;

    @NonNull
    public final SimpleDraweeView replyTrailingIcon;

    @NonNull
    private final View rootView;

    @NonNull
    public final ClanTagChipletView tagChiplet;

    private MessageViewReplyPreviewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull LinearLayout linearLayout, @NonNull MessageTagView messageTagView, @NonNull RoleDotView roleDotView, @NonNull ChannelSpineView channelSpineView, @NonNull MessageContentView messageContentView, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull ClanTagChipletView clanTagChipletView) {
        this.rootView = view;
        this.replyAuthorAvatar = simpleDraweeView;
        this.replyAuthorName = textView;
        this.replyIcon = simpleDraweeView2;
        this.replyLeadingIcon = simpleDraweeView3;
        this.replyLeadingViews = linearLayout;
        this.replyMessageTagView = messageTagView;
        this.replyRoleDot = roleDotView;
        this.replySpline = channelSpineView;
        this.replyText = messageContentView;
        this.replyTrailingIcon = simpleDraweeView4;
        this.tagChiplet = clanTagChipletView;
    }

    @NonNull
    public static MessageViewReplyPreviewBinding bind(@NonNull View view) {
        int i7 = R.id.reply_author_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.reply_author_name;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                i7 = R.id.reply_icon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                if (simpleDraweeView2 != null) {
                    i7 = R.id.reply_leading_icon;
                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                    if (simpleDraweeView3 != null) {
                        i7 = R.id.reply_leading_views;
                        LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
                        if (linearLayout != null) {
                            i7 = R.id.reply_message_tag_view;
                            MessageTagView messageTagView = (MessageTagView) a.k(i7, view);
                            if (messageTagView != null) {
                                i7 = R.id.reply_role_dot;
                                RoleDotView roleDotView = (RoleDotView) a.k(i7, view);
                                if (roleDotView != null) {
                                    i7 = R.id.reply_spline;
                                    ChannelSpineView channelSpineView = (ChannelSpineView) a.k(i7, view);
                                    if (channelSpineView != null) {
                                        i7 = R.id.reply_text;
                                        MessageContentView messageContentView = (MessageContentView) a.k(i7, view);
                                        if (messageContentView != null) {
                                            i7 = R.id.reply_trailing_icon;
                                            SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.k(i7, view);
                                            if (simpleDraweeView4 != null) {
                                                i7 = R.id.tag_chiplet;
                                                ClanTagChipletView clanTagChipletView = (ClanTagChipletView) a.k(i7, view);
                                                if (clanTagChipletView != null) {
                                                    return new MessageViewReplyPreviewBinding(view, simpleDraweeView, textView, simpleDraweeView2, simpleDraweeView3, linearLayout, messageTagView, roleDotView, channelSpineView, messageContentView, simpleDraweeView4, clanTagChipletView);
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
    public static MessageViewReplyPreviewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.message_view_reply_preview, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
