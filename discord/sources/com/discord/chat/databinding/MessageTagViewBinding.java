package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MessageTagViewBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout layout;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView tag;

    @NonNull
    public final SimpleDraweeView verifiedBotIcon;

    private MessageTagViewBinding(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.layout = constraintLayout;
        this.tag = textView;
        this.verifiedBotIcon = simpleDraweeView;
    }

    @NonNull
    public static MessageTagViewBinding bind(@NonNull View view) {
        int i7 = R.id.layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
        if (constraintLayout != null) {
            i7 = R.id.tag;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                i7 = R.id.verified_bot_icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                if (simpleDraweeView != null) {
                    return new MessageTagViewBinding(view, constraintLayout, textView, simpleDraweeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static MessageTagViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.message_tag_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
