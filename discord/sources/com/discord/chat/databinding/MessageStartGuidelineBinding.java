package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;

/* JADX INFO: loaded from: classes.dex */
public final class MessageStartGuidelineBinding implements ViewBinding {

    @NonNull
    public final Guideline messageStartGuideline;

    @NonNull
    private final Guideline rootView;

    private MessageStartGuidelineBinding(@NonNull Guideline guideline, @NonNull Guideline guideline2) {
        this.rootView = guideline;
        this.messageStartGuideline = guideline2;
    }

    @NonNull
    public static MessageStartGuidelineBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Guideline guideline = (Guideline) view;
        return new MessageStartGuidelineBinding(guideline, guideline);
    }

    @NonNull
    public static MessageStartGuidelineBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MessageStartGuidelineBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.message_start_guideline, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public Guideline getRoot() {
        return this.rootView;
    }
}
