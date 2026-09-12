package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class AutoModerationNotificationEmbedViewBinding implements ViewBinding {

    @NonNull
    public final LinearLayout actions;

    @NonNull
    public final DCDButton actionsButton;

    @NonNull
    public final TextView body;

    @NonNull
    public final DCDButton feedbackButton;

    @NonNull
    public final TextView header;

    @NonNull
    public final SimpleDraweeView headerIcon;

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView separatorDot;

    @NonNull
    public final ImageView subtitleDivider;

    @NonNull
    public final TextView subtitleLeft;

    @NonNull
    public final TextView subtitleLeftAuthor;

    @NonNull
    public final SimpleDraweeView subtitleLeftAvatar;

    @NonNull
    public final LinearLayout subtitleLeftWrapper;

    @NonNull
    public final TextView subtitleRight;

    @NonNull
    public final LinearLayout subtitlesWrapper;

    private AutoModerationNotificationEmbedViewBinding(@NonNull View view, @NonNull LinearLayout linearLayout, @NonNull DCDButton dCDButton, @NonNull TextView textView, @NonNull DCDButton dCDButton2, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView5, @NonNull LinearLayout linearLayout3) {
        this.rootView = view;
        this.actions = linearLayout;
        this.actionsButton = dCDButton;
        this.body = textView;
        this.feedbackButton = dCDButton2;
        this.header = textView2;
        this.headerIcon = simpleDraweeView;
        this.separatorDot = imageView;
        this.subtitleDivider = imageView2;
        this.subtitleLeft = textView3;
        this.subtitleLeftAuthor = textView4;
        this.subtitleLeftAvatar = simpleDraweeView2;
        this.subtitleLeftWrapper = linearLayout2;
        this.subtitleRight = textView5;
        this.subtitlesWrapper = linearLayout3;
    }

    @NonNull
    public static AutoModerationNotificationEmbedViewBinding bind(@NonNull View view) {
        int i7 = R.id.actions;
        LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
        if (linearLayout != null) {
            i7 = R.id.actions_button;
            DCDButton dCDButton = (DCDButton) a.k(i7, view);
            if (dCDButton != null) {
                i7 = R.id.body;
                TextView textView = (TextView) a.k(i7, view);
                if (textView != null) {
                    i7 = R.id.feedback_button;
                    DCDButton dCDButton2 = (DCDButton) a.k(i7, view);
                    if (dCDButton2 != null) {
                        i7 = R.id.header;
                        TextView textView2 = (TextView) a.k(i7, view);
                        if (textView2 != null) {
                            i7 = R.id.header_icon;
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                            if (simpleDraweeView != null) {
                                i7 = R.id.separator_dot;
                                ImageView imageView = (ImageView) a.k(i7, view);
                                if (imageView != null) {
                                    i7 = R.id.subtitle_divider;
                                    ImageView imageView2 = (ImageView) a.k(i7, view);
                                    if (imageView2 != null) {
                                        i7 = R.id.subtitle_left;
                                        TextView textView3 = (TextView) a.k(i7, view);
                                        if (textView3 != null) {
                                            i7 = R.id.subtitle_left_author;
                                            TextView textView4 = (TextView) a.k(i7, view);
                                            if (textView4 != null) {
                                                i7 = R.id.subtitle_left_avatar;
                                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                                                if (simpleDraweeView2 != null) {
                                                    i7 = R.id.subtitle_left_wrapper;
                                                    LinearLayout linearLayout2 = (LinearLayout) a.k(i7, view);
                                                    if (linearLayout2 != null) {
                                                        i7 = R.id.subtitle_right;
                                                        TextView textView5 = (TextView) a.k(i7, view);
                                                        if (textView5 != null) {
                                                            i7 = R.id.subtitles_wrapper;
                                                            LinearLayout linearLayout3 = (LinearLayout) a.k(i7, view);
                                                            if (linearLayout3 != null) {
                                                                return new AutoModerationNotificationEmbedViewBinding(view, linearLayout, dCDButton, textView, dCDButton2, textView2, simpleDraweeView, imageView, imageView2, textView3, textView4, simpleDraweeView2, linearLayout2, textView5, linearLayout3);
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
    public static AutoModerationNotificationEmbedViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.auto_moderation_notification_embed_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
