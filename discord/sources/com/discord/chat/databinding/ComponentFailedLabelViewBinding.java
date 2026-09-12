package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class ComponentFailedLabelViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SimpleDraweeView viewInteractionFailedLabelIcon;

    @NonNull
    public final TextView viewInteractionFailedLabelMessage;

    private ComponentFailedLabelViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.viewInteractionFailedLabelIcon = simpleDraweeView;
        this.viewInteractionFailedLabelMessage = textView;
    }

    @NonNull
    public static ComponentFailedLabelViewBinding bind(@NonNull View view) {
        int i7 = R.id.view_interaction_failed_label_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.view_interaction_failed_label_message;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                return new ComponentFailedLabelViewBinding((ConstraintLayout) view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static ComponentFailedLabelViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ComponentFailedLabelViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.component_failed_label_view, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
