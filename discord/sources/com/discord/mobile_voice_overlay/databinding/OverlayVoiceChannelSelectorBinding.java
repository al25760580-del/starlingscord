package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.device.views.DiscordRecyclerView;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class OverlayVoiceChannelSelectorBinding implements ViewBinding {

    @NonNull
    public final TextView channelSelect;

    @NonNull
    public final SimpleDraweeView close;

    @NonNull
    public final CardView dialogCard;

    @NonNull
    public final TextView emptyResults;

    @NonNull
    public final LinearLayout menuContainer;

    @NonNull
    public final EditText overlayChannelSearch;

    @NonNull
    public final DiscordRecyclerView resultsRv;

    @NonNull
    private final CardView rootView;

    private OverlayVoiceChannelSelectorBinding(@NonNull CardView cardView, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull CardView cardView2, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull DiscordRecyclerView discordRecyclerView) {
        this.rootView = cardView;
        this.channelSelect = textView;
        this.close = simpleDraweeView;
        this.dialogCard = cardView2;
        this.emptyResults = textView2;
        this.menuContainer = linearLayout;
        this.overlayChannelSearch = editText;
        this.resultsRv = discordRecyclerView;
    }

    @NonNull
    public static OverlayVoiceChannelSelectorBinding bind(@NonNull View view) {
        int i7 = R.id.channel_select;
        TextView textView = (TextView) a.k(i7, view);
        if (textView != null) {
            i7 = R.id.close;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView != null) {
                CardView cardView = (CardView) view;
                i7 = R.id.empty_results;
                TextView textView2 = (TextView) a.k(i7, view);
                if (textView2 != null) {
                    i7 = R.id.menu_container;
                    LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
                    if (linearLayout != null) {
                        i7 = R.id.overlay_channel_search;
                        EditText editText = (EditText) a.k(i7, view);
                        if (editText != null) {
                            i7 = R.id.results_rv;
                            DiscordRecyclerView discordRecyclerView = (DiscordRecyclerView) a.k(i7, view);
                            if (discordRecyclerView != null) {
                                return new OverlayVoiceChannelSelectorBinding(cardView, textView, simpleDraweeView, cardView, textView2, linearLayout, editText, discordRecyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static OverlayVoiceChannelSelectorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OverlayVoiceChannelSelectorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.overlay_voice_channel_selector, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
