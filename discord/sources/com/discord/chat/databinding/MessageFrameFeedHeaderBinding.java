package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MessageFrameFeedHeaderBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView feedChannelIcon;

    @NonNull
    public final TextView feedChannelText;

    @NonNull
    public final TextView feedReplyCount;

    @NonNull
    public final SimpleDraweeView feedReplyIcon;

    @NonNull
    public final OverlappingCirclesView feedReplyParticipants;

    @NonNull
    private final View rootView;

    private MessageFrameFeedHeaderBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull OverlappingCirclesView overlappingCirclesView) {
        this.rootView = view;
        this.feedChannelIcon = simpleDraweeView;
        this.feedChannelText = textView;
        this.feedReplyCount = textView2;
        this.feedReplyIcon = simpleDraweeView2;
        this.feedReplyParticipants = overlappingCirclesView;
    }

    @NonNull
    public static MessageFrameFeedHeaderBinding bind(@NonNull View view) {
        int i7 = R.id.feed_channel_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.feed_channel_text;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                i7 = R.id.feed_reply_count;
                TextView textView2 = (TextView) a.k(i7, view);
                if (textView2 != null) {
                    i7 = R.id.feed_reply_icon;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                    if (simpleDraweeView2 != null) {
                        i7 = R.id.feed_reply_participants;
                        OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) a.k(i7, view);
                        if (overlappingCirclesView != null) {
                            return new MessageFrameFeedHeaderBinding(view, simpleDraweeView, textView, textView2, simpleDraweeView2, overlappingCirclesView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static MessageFrameFeedHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.message_frame_feed_header, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
