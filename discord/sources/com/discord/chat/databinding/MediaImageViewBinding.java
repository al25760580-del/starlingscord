package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MediaImageViewBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final SimpleDraweeView gifIndicator;

    @NonNull
    public final SimpleDraweeView image;

    @NonNull
    public final TextView imageAltText;

    @NonNull
    public final FrameLayout imageBlurBg;

    @NonNull
    public final AltTextButtonView mediaViewAltTextButton;

    @NonNull
    private final View rootView;

    private MediaImageViewBinding(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull AltTextButtonView altTextButtonView) {
        this.rootView = view;
        this.container = constraintLayout;
        this.gifIndicator = simpleDraweeView;
        this.image = simpleDraweeView2;
        this.imageAltText = textView;
        this.imageBlurBg = frameLayout;
        this.mediaViewAltTextButton = altTextButtonView;
    }

    @NonNull
    public static MediaImageViewBinding bind(@NonNull View view) {
        int i7 = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
        if (constraintLayout != null) {
            i7 = R.id.gif_indicator;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView != null) {
                i7 = R.id.image;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                if (simpleDraweeView2 != null) {
                    i7 = R.id.image_alt_text;
                    TextView textView = (TextView) a.k(i7, view);
                    if (textView != null) {
                        i7 = R.id.image_blur_bg;
                        FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
                        if (frameLayout != null) {
                            i7 = R.id.media_view_alt_text_button;
                            AltTextButtonView altTextButtonView = (AltTextButtonView) a.k(i7, view);
                            if (altTextButtonView != null) {
                                return new MediaImageViewBinding(view, constraintLayout, simpleDraweeView, simpleDraweeView2, textView, frameLayout, altTextButtonView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static MediaImageViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.media_image_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
