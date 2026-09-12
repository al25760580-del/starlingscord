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
public final class SpoilerOverlayViewBinding implements ViewBinding {

    @NonNull
    public final TextView label;

    @NonNull
    public final FrameLayout overlayContainer;

    @NonNull
    private final View rootView;

    private SpoilerOverlayViewBinding(@NonNull View view, @NonNull TextView textView, @NonNull FrameLayout frameLayout) {
        this.rootView = view;
        this.label = textView;
        this.overlayContainer = frameLayout;
    }

    @NonNull
    public static SpoilerOverlayViewBinding bind(@NonNull View view) {
        int i7 = R.id.label;
        TextView textView = (TextView) a.k(i7, view);
        if (textView != null) {
            i7 = R.id.overlay_container;
            FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
            if (frameLayout != null) {
                return new SpoilerOverlayViewBinding(view, textView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static SpoilerOverlayViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.spoiler_overlay_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
