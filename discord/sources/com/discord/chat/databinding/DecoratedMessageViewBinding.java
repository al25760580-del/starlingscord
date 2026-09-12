package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.MessageView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class DecoratedMessageViewBinding implements ViewBinding {

    @NonNull
    public final MessageView messageView;

    @NonNull
    private final View rootView;

    private DecoratedMessageViewBinding(@NonNull View view, @NonNull MessageView messageView) {
        this.rootView = view;
        this.messageView = messageView;
    }

    @NonNull
    public static DecoratedMessageViewBinding bind(@NonNull View view) {
        int i7 = R.id.message_view;
        MessageView messageView = (MessageView) a.k(i7, view);
        if (messageView != null) {
            return new DecoratedMessageViewBinding(view, messageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static DecoratedMessageViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.decorated_message_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
