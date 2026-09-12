package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ErrorMessageView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MessageComponentUnknownViewBinding implements ViewBinding {

    @NonNull
    public final ErrorMessageView errorMessageView;

    @NonNull
    private final View rootView;

    private MessageComponentUnknownViewBinding(@NonNull View view, @NonNull ErrorMessageView errorMessageView) {
        this.rootView = view;
        this.errorMessageView = errorMessageView;
    }

    @NonNull
    public static MessageComponentUnknownViewBinding bind(@NonNull View view) {
        int i7 = R.id.error_message_view;
        ErrorMessageView errorMessageView = (ErrorMessageView) a.k(i7, view);
        if (errorMessageView != null) {
            return new MessageComponentUnknownViewBinding(view, errorMessageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static MessageComponentUnknownViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.message_component_unknown_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
