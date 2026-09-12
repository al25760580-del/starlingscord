package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MediaViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView inlineMediaGifIndicator;

    @NonNull
    public final SimpleDraweeView inlineMediaImagePreview;

    @NonNull
    public final ProgressBar inlineMediaLoadingIndicator;

    @NonNull
    public final SimpleDraweeView inlineMediaPlayButton;

    @NonNull
    public final SimpleDraweeView inlineMediaVolumeToggle;

    @NonNull
    public final ConstraintLayout overlayTag;

    @NonNull
    public final SimpleDraweeView overlayTagIcon;

    @NonNull
    public final TextView overlayTagText;

    @NonNull
    private final View rootView;

    private MediaViewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull ProgressBar progressBar, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView5, @NonNull TextView textView) {
        this.rootView = view;
        this.inlineMediaGifIndicator = simpleDraweeView;
        this.inlineMediaImagePreview = simpleDraweeView2;
        this.inlineMediaLoadingIndicator = progressBar;
        this.inlineMediaPlayButton = simpleDraweeView3;
        this.inlineMediaVolumeToggle = simpleDraweeView4;
        this.overlayTag = constraintLayout;
        this.overlayTagIcon = simpleDraweeView5;
        this.overlayTagText = textView;
    }

    @NonNull
    public static MediaViewBinding bind(@NonNull View view) {
        int i7 = R.id.inline_media_gif_indicator;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.inline_media_image_preview;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView2 != null) {
                i7 = R.id.inline_media_loading_indicator;
                ProgressBar progressBar = (ProgressBar) a.k(i7, view);
                if (progressBar != null) {
                    i7 = R.id.inline_media_play_button;
                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                    if (simpleDraweeView3 != null) {
                        i7 = R.id.inline_media_volume_toggle;
                        SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.k(i7, view);
                        if (simpleDraweeView4 != null) {
                            i7 = R.id.overlay_tag;
                            ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                            if (constraintLayout != null) {
                                i7 = R.id.overlay_tag_icon;
                                SimpleDraweeView simpleDraweeView5 = (SimpleDraweeView) a.k(i7, view);
                                if (simpleDraweeView5 != null) {
                                    i7 = R.id.overlay_tag_text;
                                    TextView textView = (TextView) a.k(i7, view);
                                    if (textView != null) {
                                        return new MediaViewBinding(view, simpleDraweeView, simpleDraweeView2, progressBar, simpleDraweeView3, simpleDraweeView4, constraintLayout, simpleDraweeView5, textView);
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
    public static MediaViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.media_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
