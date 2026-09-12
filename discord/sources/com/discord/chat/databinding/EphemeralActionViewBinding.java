package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class EphemeralActionViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView chatListAdapterItemIconHelp;

    @NonNull
    public final SimpleDraweeSpanTextView chatListAdapterItemTextDismiss;

    @NonNull
    public final SimpleDraweeView chatListAdapterItemVisibilityIcon;

    @NonNull
    private final View rootView;

    private EphemeralActionViewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, @NonNull SimpleDraweeView simpleDraweeView2) {
        this.rootView = view;
        this.chatListAdapterItemIconHelp = simpleDraweeView;
        this.chatListAdapterItemTextDismiss = simpleDraweeSpanTextView;
        this.chatListAdapterItemVisibilityIcon = simpleDraweeView2;
    }

    @NonNull
    public static EphemeralActionViewBinding bind(@NonNull View view) {
        int i7 = R.id.chat_list_adapter_item_icon_help;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.chat_list_adapter_item_text_dismiss;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
            if (simpleDraweeSpanTextView != null) {
                i7 = R.id.chat_list_adapter_item_visibility_icon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                if (simpleDraweeView2 != null) {
                    return new EphemeralActionViewBinding(view, simpleDraweeView, simpleDraweeSpanTextView, simpleDraweeView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static EphemeralActionViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.ephemeral_action_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
