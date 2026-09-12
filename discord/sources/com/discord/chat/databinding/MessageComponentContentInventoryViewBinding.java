package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.ContentInventoryComponentView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MessageComponentContentInventoryViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView contentInventoryComponentAvatarImage;

    @NonNull
    public final SimpleDraweeView contentInventoryComponentBadgeIcon;

    @NonNull
    public final SimpleDraweeView contentInventoryComponentMediaImage;

    @NonNull
    public final SimpleDraweeView contentInventoryComponentPlatformIcon;

    @NonNull
    public final TextView contentInventoryComponentSubtitle;

    @NonNull
    public final TextView contentInventoryComponentTitle;

    @NonNull
    public final TextView contentInventoryComponentUsername;

    @NonNull
    private final ContentInventoryComponentView rootView;

    private MessageComponentContentInventoryViewBinding(@NonNull ContentInventoryComponentView contentInventoryComponentView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = contentInventoryComponentView;
        this.contentInventoryComponentAvatarImage = simpleDraweeView;
        this.contentInventoryComponentBadgeIcon = simpleDraweeView2;
        this.contentInventoryComponentMediaImage = simpleDraweeView3;
        this.contentInventoryComponentPlatformIcon = simpleDraweeView4;
        this.contentInventoryComponentSubtitle = textView;
        this.contentInventoryComponentTitle = textView2;
        this.contentInventoryComponentUsername = textView3;
    }

    @NonNull
    public static MessageComponentContentInventoryViewBinding bind(@NonNull View view) {
        int i7 = R.id.content_inventory_component_avatar_image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.content_inventory_component_badge_icon;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView2 != null) {
                i7 = R.id.content_inventory_component_media_image;
                SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                if (simpleDraweeView3 != null) {
                    i7 = R.id.content_inventory_component_platform_icon;
                    SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.k(i7, view);
                    if (simpleDraweeView4 != null) {
                        i7 = R.id.content_inventory_component_subtitle;
                        TextView textView = (TextView) a.k(i7, view);
                        if (textView != null) {
                            i7 = R.id.content_inventory_component_title;
                            TextView textView2 = (TextView) a.k(i7, view);
                            if (textView2 != null) {
                                i7 = R.id.content_inventory_component_username;
                                TextView textView3 = (TextView) a.k(i7, view);
                                if (textView3 != null) {
                                    return new MessageComponentContentInventoryViewBinding((ContentInventoryComponentView) view, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, simpleDraweeView4, textView, textView2, textView3);
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
    public static MessageComponentContentInventoryViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MessageComponentContentInventoryViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.message_component_content_inventory_view, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ContentInventoryComponentView getRoot() {
        return this.rootView;
    }
}
