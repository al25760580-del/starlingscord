package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class AltTextButtonViewBinding implements ViewBinding {

    @NonNull
    public final FrameLayout altTextContainer;

    @NonNull
    public final TextView altTextLabel;

    @NonNull
    private final FrameLayout rootView;

    private AltTextButtonViewBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.altTextContainer = frameLayout2;
        this.altTextLabel = textView;
    }

    @NonNull
    public static AltTextButtonViewBinding bind(@NonNull View view) {
        int i7 = R.id.alt_text_container;
        FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
        if (frameLayout != null) {
            i7 = R.id.alt_text_label;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                return new AltTextButtonViewBinding((FrameLayout) view, frameLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static AltTextButtonViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static AltTextButtonViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.alt_text_button_view, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
