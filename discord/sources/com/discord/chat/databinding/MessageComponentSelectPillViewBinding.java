package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes.dex */
public final class MessageComponentSelectPillViewBinding implements ViewBinding {

    @NonNull
    private final MaterialTextView rootView;

    private MessageComponentSelectPillViewBinding(@NonNull MaterialTextView materialTextView) {
        this.rootView = materialTextView;
    }

    @NonNull
    public static MessageComponentSelectPillViewBinding bind(@NonNull View view) {
        if (view != null) {
            return new MessageComponentSelectPillViewBinding((MaterialTextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static MessageComponentSelectPillViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MessageComponentSelectPillViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.message_component_select_pill_view, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public MaterialTextView getRoot() {
        return this.rootView;
    }
}
