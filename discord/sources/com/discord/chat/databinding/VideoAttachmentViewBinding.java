package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.discord.chat.presentation.message.view.MediaView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class VideoAttachmentViewBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final MediaView mediaView;

    @NonNull
    public final TextView mediaViewAltText;

    @NonNull
    public final AltTextButtonView mediaViewAltTextButton;

    @NonNull
    private final View rootView;

    private VideoAttachmentViewBinding(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull MediaView mediaView, @NonNull TextView textView, @NonNull AltTextButtonView altTextButtonView) {
        this.rootView = view;
        this.container = constraintLayout;
        this.mediaView = mediaView;
        this.mediaViewAltText = textView;
        this.mediaViewAltTextButton = altTextButtonView;
    }

    @NonNull
    public static VideoAttachmentViewBinding bind(@NonNull View view) {
        int i7 = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
        if (constraintLayout != null) {
            i7 = R.id.media_view;
            MediaView mediaView = (MediaView) a.k(i7, view);
            if (mediaView != null) {
                i7 = R.id.media_view_alt_text;
                TextView textView = (TextView) a.k(i7, view);
                if (textView != null) {
                    i7 = R.id.media_view_alt_text_button;
                    AltTextButtonView altTextButtonView = (AltTextButtonView) a.k(i7, view);
                    if (altTextButtonView != null) {
                        return new VideoAttachmentViewBinding(view, constraintLayout, mediaView, textView, altTextButtonView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static VideoAttachmentViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.video_attachment_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
