package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class SystemMessageViewBinding implements ViewBinding {

    @NonNull
    public final MessageAccessoriesView accessoriesView;

    @NonNull
    public final SimpleDraweeView giftingPromptIcon;

    @NonNull
    public final FrameLayout giftingPromptIconContainer;

    @NonNull
    public final View leftBorder;

    @NonNull
    public final SimpleDraweeView premiumIcon;

    @NonNull
    private final View rootView;

    @NonNull
    public final SimpleDraweeView systemIcon;

    private SystemMessageViewBinding(@NonNull View view, @NonNull MessageAccessoriesView messageAccessoriesView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull FrameLayout frameLayout, @NonNull View view2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3) {
        this.rootView = view;
        this.accessoriesView = messageAccessoriesView;
        this.giftingPromptIcon = simpleDraweeView;
        this.giftingPromptIconContainer = frameLayout;
        this.leftBorder = view2;
        this.premiumIcon = simpleDraweeView2;
        this.systemIcon = simpleDraweeView3;
    }

    @NonNull
    public static SystemMessageViewBinding bind(@NonNull View view) {
        View viewK;
        int i7 = R.id.accessories_view;
        MessageAccessoriesView messageAccessoriesView = (MessageAccessoriesView) a.k(i7, view);
        if (messageAccessoriesView != null) {
            i7 = R.id.gifting_prompt_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView != null) {
                i7 = R.id.gifting_prompt_icon_container;
                FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
                if (frameLayout != null && (viewK = a.k((i7 = R.id.left_border), view)) != null) {
                    i7 = R.id.premium_icon;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                    if (simpleDraweeView2 != null) {
                        i7 = R.id.system_icon;
                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                        if (simpleDraweeView3 != null) {
                            return new SystemMessageViewBinding(view, messageAccessoriesView, simpleDraweeView, frameLayout, viewK, simpleDraweeView2, simpleDraweeView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static SystemMessageViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.system_message_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
