package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.IconButtonView;
import com.facebook.drawee.view.SimpleDraweeView;
import eightbitlab.com.blurview.BlurView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class ObscureOverlayViewBinding implements ViewBinding {

    @NonNull
    public final BlurView blurView;

    @NonNull
    public final TextView descriptionLabel;

    @NonNull
    public final IconButtonView hideButton;

    @NonNull
    public final SimpleDraweeView mediaWarningIcon;

    @NonNull
    public final FrameLayout opaqueBackground;

    @NonNull
    public final LinearLayout overlayCenteredContainer;

    @NonNull
    public final ConstraintLayout overlayLayout;

    @NonNull
    public final IconButtonView revealButton;

    @NonNull
    private final View rootView;

    private ObscureOverlayViewBinding(@NonNull View view, @NonNull BlurView blurView, @NonNull TextView textView, @NonNull IconButtonView iconButtonView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull IconButtonView iconButtonView2) {
        this.rootView = view;
        this.blurView = blurView;
        this.descriptionLabel = textView;
        this.hideButton = iconButtonView;
        this.mediaWarningIcon = simpleDraweeView;
        this.opaqueBackground = frameLayout;
        this.overlayCenteredContainer = linearLayout;
        this.overlayLayout = constraintLayout;
        this.revealButton = iconButtonView2;
    }

    @NonNull
    public static ObscureOverlayViewBinding bind(@NonNull View view) {
        int i7 = R.id.blur_view;
        BlurView blurView = (BlurView) a.k(i7, view);
        if (blurView != null) {
            i7 = R.id.description_label;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                i7 = R.id.hide_button;
                IconButtonView iconButtonView = (IconButtonView) a.k(i7, view);
                if (iconButtonView != null) {
                    i7 = R.id.media_warning_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                    if (simpleDraweeView != null) {
                        i7 = R.id.opaque_background;
                        FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
                        if (frameLayout != null) {
                            i7 = R.id.overlay_centered_container;
                            LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
                            if (linearLayout != null) {
                                i7 = R.id.overlay_layout;
                                ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                                if (constraintLayout != null) {
                                    i7 = R.id.reveal_button;
                                    IconButtonView iconButtonView2 = (IconButtonView) a.k(i7, view);
                                    if (iconButtonView2 != null) {
                                        return new ObscureOverlayViewBinding(view, blurView, textView, iconButtonView, simpleDraweeView, frameLayout, linearLayout, constraintLayout, iconButtonView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static ObscureOverlayViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.obscure_overlay_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
