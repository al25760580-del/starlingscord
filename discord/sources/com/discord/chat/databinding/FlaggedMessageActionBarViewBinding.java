package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class FlaggedMessageActionBarViewBinding implements ViewBinding {

    @NonNull
    public final DCDButton actionsButton;

    @NonNull
    public final DCDButton feedbackButton;

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView separatorDot;

    private FlaggedMessageActionBarViewBinding(@NonNull View view, @NonNull DCDButton dCDButton, @NonNull DCDButton dCDButton2, @NonNull ImageView imageView) {
        this.rootView = view;
        this.actionsButton = dCDButton;
        this.feedbackButton = dCDButton2;
        this.separatorDot = imageView;
    }

    @NonNull
    public static FlaggedMessageActionBarViewBinding bind(@NonNull View view) {
        int i7 = R.id.actions_button;
        DCDButton dCDButton = (DCDButton) a.k(i7, view);
        if (dCDButton != null) {
            i7 = R.id.feedback_button;
            DCDButton dCDButton2 = (DCDButton) a.k(i7, view);
            if (dCDButton2 != null) {
                i7 = R.id.separator_dot;
                ImageView imageView = (ImageView) a.k(i7, view);
                if (imageView != null) {
                    return new FlaggedMessageActionBarViewBinding(view, dCDButton, dCDButton2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static FlaggedMessageActionBarViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.flagged_message_action_bar_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
