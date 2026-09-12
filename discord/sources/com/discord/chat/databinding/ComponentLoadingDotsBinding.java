package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.progress_dots.ProgressDots;

/* JADX INFO: loaded from: classes.dex */
public final class ComponentLoadingDotsBinding implements ViewBinding {

    @NonNull
    private final ProgressDots rootView;

    private ComponentLoadingDotsBinding(@NonNull ProgressDots progressDots) {
        this.rootView = progressDots;
    }

    @NonNull
    public static ComponentLoadingDotsBinding bind(@NonNull View view) {
        if (view != null) {
            return new ComponentLoadingDotsBinding((ProgressDots) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ComponentLoadingDotsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ComponentLoadingDotsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.component_loading_dots, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ProgressDots getRoot() {
        return this.rootView;
    }
}
