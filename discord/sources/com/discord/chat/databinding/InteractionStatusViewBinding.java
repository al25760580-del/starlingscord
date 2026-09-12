package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.progress_dots.ProgressDots;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class InteractionStatusViewBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    @NonNull
    public final SimpleDraweeView viewInteractionStatusDangerIcon;

    @NonNull
    public final LinearLayout viewInteractionStatusLabelIcon;

    @NonNull
    public final TextView viewInteractionStatusLabelMessage;

    @NonNull
    public final ProgressDots viewInteractionStatusLoadingDots;

    private InteractionStatusViewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ProgressDots progressDots) {
        this.rootView = view;
        this.viewInteractionStatusDangerIcon = simpleDraweeView;
        this.viewInteractionStatusLabelIcon = linearLayout;
        this.viewInteractionStatusLabelMessage = textView;
        this.viewInteractionStatusLoadingDots = progressDots;
    }

    @NonNull
    public static InteractionStatusViewBinding bind(@NonNull View view) {
        int i7 = R.id.view_interaction_status_danger_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.view_interaction_status_label_icon;
            LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
            if (linearLayout != null) {
                i7 = R.id.view_interaction_status_label_message;
                TextView textView = (TextView) a.k(i7, view);
                if (textView != null) {
                    i7 = R.id.view_interaction_status_loading_dots;
                    ProgressDots progressDots = (ProgressDots) a.k(i7, view);
                    if (progressDots != null) {
                        return new InteractionStatusViewBinding(view, simpleDraweeView, linearLayout, textView, progressDots);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static InteractionStatusViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.interaction_status_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
