package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class BlockedMessageGroupViewBinding implements ViewBinding {

    @NonNull
    public final TextView blockedMessageGroupButton;

    @NonNull
    public final RecyclerView blockedMessages;

    @NonNull
    public final SimpleDraweeView closeIcon;

    @NonNull
    private final View rootView;

    private BlockedMessageGroupViewBinding(@NonNull View view, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.blockedMessageGroupButton = textView;
        this.blockedMessages = recyclerView;
        this.closeIcon = simpleDraweeView;
    }

    @NonNull
    public static BlockedMessageGroupViewBinding bind(@NonNull View view) {
        int i7 = R.id.blocked_message_group_button;
        TextView textView = (TextView) a.k(i7, view);
        if (textView != null) {
            i7 = R.id.blocked_messages;
            RecyclerView recyclerView = (RecyclerView) a.k(i7, view);
            if (recyclerView != null) {
                i7 = R.id.close_icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                if (simpleDraweeView != null) {
                    return new BlockedMessageGroupViewBinding(view, textView, recyclerView, simpleDraweeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static BlockedMessageGroupViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.blocked_message_group_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
