package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class RoleDotViewBinding implements ViewBinding {

    @NonNull
    public final FrameLayout roleDotViewBackground;

    @NonNull
    public final ImageView roleDotViewDot;

    @NonNull
    private final View rootView;

    private RoleDotViewBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView) {
        this.rootView = view;
        this.roleDotViewBackground = frameLayout;
        this.roleDotViewDot = imageView;
    }

    @NonNull
    public static RoleDotViewBinding bind(@NonNull View view) {
        int i7 = R.id.role_dot_view_background;
        FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
        if (frameLayout != null) {
            i7 = R.id.role_dot_view_dot;
            ImageView imageView = (ImageView) a.k(i7, view);
            if (imageView != null) {
                return new RoleDotViewBinding(view, frameLayout, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static RoleDotViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.role_dot_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
