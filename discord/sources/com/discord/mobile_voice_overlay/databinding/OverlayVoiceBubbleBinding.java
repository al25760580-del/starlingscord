package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: classes.dex */
public final class OverlayVoiceBubbleBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView overlayBubbleIv;

    @NonNull
    private final SimpleDraweeView rootView;

    private OverlayVoiceBubbleBinding(@NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2) {
        this.rootView = simpleDraweeView;
        this.overlayBubbleIv = simpleDraweeView2;
    }

    @NonNull
    public static OverlayVoiceBubbleBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
        return new OverlayVoiceBubbleBinding(simpleDraweeView, simpleDraweeView);
    }

    @NonNull
    public static OverlayVoiceBubbleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OverlayVoiceBubbleBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.overlay_voice_bubble, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SimpleDraweeView getRoot() {
        return this.rootView;
    }
}
