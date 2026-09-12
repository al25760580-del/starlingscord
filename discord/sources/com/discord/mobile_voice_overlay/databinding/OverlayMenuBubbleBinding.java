package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.device.views.DiscordRecyclerView;
import com.discord.mobile_voice_overlay.R;
import com.discord.mobile_voice_overlay.views.OverlayMenuView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class OverlayMenuBubbleBinding implements ViewBinding {

    @NonNull
    public final LinearLayout overlayHeader;

    @NonNull
    public final View overlayLinkedAnchorView;

    @NonNull
    public final TextView overlayMembersOverflowText;

    @NonNull
    public final DiscordRecyclerView overlayMembersRecycler;

    @NonNull
    public final OverlayMenuView overlayMenu;

    @NonNull
    private final LinearLayout rootView;

    private OverlayMenuBubbleBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull TextView textView, @NonNull DiscordRecyclerView discordRecyclerView, @NonNull OverlayMenuView overlayMenuView) {
        this.rootView = linearLayout;
        this.overlayHeader = linearLayout2;
        this.overlayLinkedAnchorView = view;
        this.overlayMembersOverflowText = textView;
        this.overlayMembersRecycler = discordRecyclerView;
        this.overlayMenu = overlayMenuView;
    }

    @NonNull
    public static OverlayMenuBubbleBinding bind(@NonNull View view) {
        View viewK;
        int i7 = R.id.overlay_header;
        LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
        if (linearLayout != null && (viewK = a.k((i7 = R.id.overlay_linked_anchor_view), view)) != null) {
            i7 = R.id.overlay_members_overflow_text;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                i7 = R.id.overlay_members_recycler;
                DiscordRecyclerView discordRecyclerView = (DiscordRecyclerView) a.k(i7, view);
                if (discordRecyclerView != null) {
                    i7 = R.id.overlay_menu;
                    OverlayMenuView overlayMenuView = (OverlayMenuView) a.k(i7, view);
                    if (overlayMenuView != null) {
                        return new OverlayMenuBubbleBinding((LinearLayout) view, linearLayout, viewK, textView, discordRecyclerView, overlayMenuView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static OverlayMenuBubbleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OverlayMenuBubbleBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.overlay_menu_bubble, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
