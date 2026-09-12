package com.discord.chat.input.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.input.R;
import com.discord.chat.input.views.DCDChatInput;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class ChatInputRootViewBinding implements ViewBinding {

    @NonNull
    public final DCDChatInput chatInputEditText;

    @NonNull
    private final View rootView;

    private ChatInputRootViewBinding(@NonNull View view, @NonNull DCDChatInput dCDChatInput) {
        this.rootView = view;
        this.chatInputEditText = dCDChatInput;
    }

    @NonNull
    public static ChatInputRootViewBinding bind(@NonNull View view) {
        int i7 = R.id.chat_input_edit_text;
        DCDChatInput dCDChatInput = (DCDChatInput) a.k(i7, view);
        if (dCDChatInput != null) {
            return new ChatInputRootViewBinding(view, dCDChatInput);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static ChatInputRootViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.chat_input_root_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
