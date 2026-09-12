package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class IconButtonViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView iconButton;

    @NonNull
    public final FrameLayout iconContainer;

    @NonNull
    private final View rootView;

    private IconButtonViewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull FrameLayout frameLayout) {
        this.rootView = view;
        this.iconButton = simpleDraweeView;
        this.iconContainer = frameLayout;
    }

    @NonNull
    public static IconButtonViewBinding bind(@NonNull View view) {
        int i7 = R.id.icon_button;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.icon_container;
            FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
            if (frameLayout != null) {
                return new IconButtonViewBinding(view, simpleDraweeView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static IconButtonViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.icon_button_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
