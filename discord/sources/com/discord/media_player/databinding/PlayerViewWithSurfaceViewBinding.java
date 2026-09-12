package com.discord.media_player.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.media_player.R;
import com.google.android.exoplayer2.ui.PlayerView;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerViewWithSurfaceViewBinding implements ViewBinding {

    @NonNull
    private final PlayerView rootView;

    private PlayerViewWithSurfaceViewBinding(@NonNull PlayerView playerView) {
        this.rootView = playerView;
    }

    @NonNull
    public static PlayerViewWithSurfaceViewBinding bind(@NonNull View view) {
        if (view != null) {
            return new PlayerViewWithSurfaceViewBinding((PlayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static PlayerViewWithSurfaceViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PlayerViewWithSurfaceViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.player_view_with_surface_view, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public PlayerView getRoot() {
        return this.rootView;
    }
}
