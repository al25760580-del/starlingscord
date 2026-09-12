package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class TrashWrapBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    @NonNull
    public final SimpleDraweeView trashWrapIcon;

    @NonNull
    public final FrameLayout trashWrapTargetContainer;

    @NonNull
    public final FrameLayout trashWrapTargetZone;

    private TrashWrapBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = view;
        this.trashWrapIcon = simpleDraweeView;
        this.trashWrapTargetContainer = frameLayout;
        this.trashWrapTargetZone = frameLayout2;
    }

    @NonNull
    public static TrashWrapBinding bind(@NonNull View view) {
        int i7 = R.id.trash_wrap_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.trash_wrap_target_container;
            FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
            if (frameLayout != null) {
                i7 = R.id.trash_wrap_target_zone;
                FrameLayout frameLayout2 = (FrameLayout) a.k(i7, view);
                if (frameLayout2 != null) {
                    return new TrashWrapBinding(view, simpleDraweeView, frameLayout, frameLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static TrashWrapBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.trash_wrap, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
