package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class ViewOverlayMenuBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView disconnectBtn;

    @NonNull
    public final CardView menuBottom;

    @NonNull
    public final CardView menuTop;

    @NonNull
    public final ConstraintLayout menuTopStatusContainer;

    @NonNull
    public final SimpleDraweeView muteToggle;

    @NonNull
    public final TextView overlayChannelName;

    @NonNull
    public final TextView overlayGuildName;

    @NonNull
    public final TextView overlayInviteLink;

    @NonNull
    public final SimpleDraweeView overlayNetworkIcon;

    @NonNull
    public final TextView overlayOpenApp;

    @NonNull
    public final TextView overlaySwitchChannels;

    @NonNull
    private final View rootView;

    private ViewOverlayMenuBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull CardView cardView, @NonNull CardView cardView2, @NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = view;
        this.disconnectBtn = simpleDraweeView;
        this.menuBottom = cardView;
        this.menuTop = cardView2;
        this.menuTopStatusContainer = constraintLayout;
        this.muteToggle = simpleDraweeView2;
        this.overlayChannelName = textView;
        this.overlayGuildName = textView2;
        this.overlayInviteLink = textView3;
        this.overlayNetworkIcon = simpleDraweeView3;
        this.overlayOpenApp = textView4;
        this.overlaySwitchChannels = textView5;
    }

    @NonNull
    public static ViewOverlayMenuBinding bind(@NonNull View view) {
        int i7 = R.id.disconnect_btn;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.menu_bottom;
            CardView cardView = (CardView) a.k(i7, view);
            if (cardView != null) {
                i7 = R.id.menu_top;
                CardView cardView2 = (CardView) a.k(i7, view);
                if (cardView2 != null) {
                    i7 = R.id.menu_top_status_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                    if (constraintLayout != null) {
                        i7 = R.id.mute_toggle;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                        if (simpleDraweeView2 != null) {
                            i7 = R.id.overlay_channel_name;
                            TextView textView = (TextView) a.k(i7, view);
                            if (textView != null) {
                                i7 = R.id.overlay_guild_name;
                                TextView textView2 = (TextView) a.k(i7, view);
                                if (textView2 != null) {
                                    i7 = R.id.overlay_invite_link;
                                    TextView textView3 = (TextView) a.k(i7, view);
                                    if (textView3 != null) {
                                        i7 = R.id.overlay_network_icon;
                                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                                        if (simpleDraweeView3 != null) {
                                            i7 = R.id.overlay_open_app;
                                            TextView textView4 = (TextView) a.k(i7, view);
                                            if (textView4 != null) {
                                                i7 = R.id.overlay_switch_channels;
                                                TextView textView5 = (TextView) a.k(i7, view);
                                                if (textView5 != null) {
                                                    return new ViewOverlayMenuBinding(view, simpleDraweeView, cardView, cardView2, constraintLayout, simpleDraweeView2, textView, textView2, textView3, simpleDraweeView3, textView4, textView5);
                                                }
                                            }
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
    public static ViewOverlayMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_overlay_menu, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
