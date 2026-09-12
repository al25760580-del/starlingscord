package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.discord.core.DCDButton;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class PostPreviewEmbedViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView backgroundImage;

    @NonNull
    public final SimpleDraweeView coverImage;

    @NonNull
    public final DCDButton coverImageOverlayButton;

    @NonNull
    public final DCDButton cta;

    @NonNull
    public final SimpleDraweeSpanTextView footer;

    @NonNull
    public final View headerDivider;

    @NonNull
    public final FrameLayout imageBlurBg;

    @NonNull
    private final View rootView;

    @NonNull
    public final SpoilerView spoiler;

    @NonNull
    public final TextView subtitle;

    @NonNull
    public final TextView title;

    private PostPreviewEmbedViewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull DCDButton dCDButton, @NonNull DCDButton dCDButton2, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, @NonNull View view2, @NonNull FrameLayout frameLayout, @NonNull SpoilerView spoilerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.backgroundImage = simpleDraweeView;
        this.coverImage = simpleDraweeView2;
        this.coverImageOverlayButton = dCDButton;
        this.cta = dCDButton2;
        this.footer = simpleDraweeSpanTextView;
        this.headerDivider = view2;
        this.imageBlurBg = frameLayout;
        this.spoiler = spoilerView;
        this.subtitle = textView;
        this.title = textView2;
    }

    @NonNull
    public static PostPreviewEmbedViewBinding bind(@NonNull View view) {
        View viewK;
        int i7 = R.id.background_image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.cover_image;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView2 != null) {
                i7 = R.id.cover_image_overlay_button;
                DCDButton dCDButton = (DCDButton) a.k(i7, view);
                if (dCDButton != null) {
                    i7 = R.id.cta;
                    DCDButton dCDButton2 = (DCDButton) a.k(i7, view);
                    if (dCDButton2 != null) {
                        i7 = R.id.footer;
                        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
                        if (simpleDraweeSpanTextView != null && (viewK = a.k((i7 = R.id.header_divider), view)) != null) {
                            i7 = R.id.image_blur_bg;
                            FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
                            if (frameLayout != null) {
                                i7 = R.id.spoiler;
                                SpoilerView spoilerView = (SpoilerView) a.k(i7, view);
                                if (spoilerView != null) {
                                    i7 = R.id.subtitle;
                                    TextView textView = (TextView) a.k(i7, view);
                                    if (textView != null) {
                                        i7 = R.id.title;
                                        TextView textView2 = (TextView) a.k(i7, view);
                                        if (textView2 != null) {
                                            return new PostPreviewEmbedViewBinding(view, simpleDraweeView, simpleDraweeView2, dCDButton, dCDButton2, simpleDraweeSpanTextView, viewK, frameLayout, spoilerView, textView, textView2);
                                        }
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
    public static PostPreviewEmbedViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.post_preview_embed_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
