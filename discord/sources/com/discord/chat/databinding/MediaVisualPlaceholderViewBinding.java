package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MediaVisualPlaceholderViewBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final SimpleDraweeView imageInvalid;

    @NonNull
    private final View rootView;

    private MediaVisualPlaceholderViewBinding(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.container = constraintLayout;
        this.imageInvalid = simpleDraweeView;
    }

    @NonNull
    public static MediaVisualPlaceholderViewBinding bind(@NonNull View view) {
        int i7 = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
        if (constraintLayout != null) {
            i7 = R.id.image_invalid;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView != null) {
                return new MediaVisualPlaceholderViewBinding(view, constraintLayout, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static MediaVisualPlaceholderViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.media_visual_placeholder_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
