package com.discord.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.core.R;
import com.discord.progress_dots.ProgressDots;
import com.google.android.material.button.MaterialButton;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class DcdButtonBinding implements ViewBinding {

    @NonNull
    public final MaterialButton button;

    @NonNull
    public final ProgressDots loadingDots;

    @NonNull
    public final ProgressBar progress;

    @NonNull
    private final View rootView;

    private DcdButtonBinding(@NonNull View view, @NonNull MaterialButton materialButton, @NonNull ProgressDots progressDots, @NonNull ProgressBar progressBar) {
        this.rootView = view;
        this.button = materialButton;
        this.loadingDots = progressDots;
        this.progress = progressBar;
    }

    @NonNull
    public static DcdButtonBinding bind(@NonNull View view) {
        int i7 = R.id.button;
        MaterialButton materialButton = (MaterialButton) a.k(i7, view);
        if (materialButton != null) {
            i7 = R.id.loading_dots;
            ProgressDots progressDots = (ProgressDots) a.k(i7, view);
            if (progressDots != null) {
                i7 = R.id.progress;
                ProgressBar progressBar = (ProgressBar) a.k(i7, view);
                if (progressBar != null) {
                    return new DcdButtonBinding(view, materialButton, progressDots, progressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static DcdButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.dcd_button, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
