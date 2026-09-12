package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.MessageViewReplyPreview;

/* JADX INFO: loaded from: classes.dex */
public final class MessageViewReplyPreviewStubBinding implements ViewBinding {

    @NonNull
    private final MessageViewReplyPreview rootView;

    private MessageViewReplyPreviewStubBinding(@NonNull MessageViewReplyPreview messageViewReplyPreview) {
        this.rootView = messageViewReplyPreview;
    }

    @NonNull
    public static MessageViewReplyPreviewStubBinding bind(@NonNull View view) {
        if (view != null) {
            return new MessageViewReplyPreviewStubBinding((MessageViewReplyPreview) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static MessageViewReplyPreviewStubBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MessageViewReplyPreviewStubBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.message_view_reply_preview_stub, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public MessageViewReplyPreview getRoot() {
        return this.rootView;
    }
}
