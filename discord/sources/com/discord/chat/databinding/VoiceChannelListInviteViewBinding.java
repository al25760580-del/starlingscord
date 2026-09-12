package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class VoiceChannelListInviteViewBinding implements ViewBinding {

    @NonNull
    public final DCDButton acceptButton;

    @NonNull
    public final TextView callTimestamp;

    @NonNull
    public final ConstraintLayout card;

    @NonNull
    public final TextView channelName;

    @NonNull
    public final Barrier contentBarrier;

    @NonNull
    public final TextView emptyStateText;

    @NonNull
    public final Barrier headerBottomBarrier;

    @NonNull
    public final View headerSection;

    @NonNull
    public final SimpleDraweeView privacyHintIcon;

    @NonNull
    public final TextView privacyHintText;

    @NonNull
    private final View rootView;

    @NonNull
    public final SimpleDraweeView voiceIcon;

    @NonNull
    public final View voiceListScrollGradient;

    @NonNull
    public final RecyclerView voiceUsersList;

    private VoiceChannelListInviteViewBinding(@NonNull View view, @NonNull DCDButton dCDButton, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView2, @NonNull Barrier barrier, @NonNull TextView textView3, @NonNull Barrier barrier2, @NonNull View view2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull View view3, @NonNull RecyclerView recyclerView) {
        this.rootView = view;
        this.acceptButton = dCDButton;
        this.callTimestamp = textView;
        this.card = constraintLayout;
        this.channelName = textView2;
        this.contentBarrier = barrier;
        this.emptyStateText = textView3;
        this.headerBottomBarrier = barrier2;
        this.headerSection = view2;
        this.privacyHintIcon = simpleDraweeView;
        this.privacyHintText = textView4;
        this.voiceIcon = simpleDraweeView2;
        this.voiceListScrollGradient = view3;
        this.voiceUsersList = recyclerView;
    }

    @NonNull
    public static VoiceChannelListInviteViewBinding bind(@NonNull View view) {
        View viewK;
        View viewK2;
        int i7 = R.id.accept_button;
        DCDButton dCDButton = (DCDButton) a.k(i7, view);
        if (dCDButton != null) {
            i7 = R.id.call_timestamp;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                i7 = R.id.card;
                ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                if (constraintLayout != null) {
                    i7 = R.id.channel_name;
                    TextView textView2 = (TextView) a.k(i7, view);
                    if (textView2 != null) {
                        i7 = R.id.content_barrier;
                        Barrier barrier = (Barrier) a.k(i7, view);
                        if (barrier != null) {
                            i7 = R.id.empty_state_text;
                            TextView textView3 = (TextView) a.k(i7, view);
                            if (textView3 != null) {
                                i7 = R.id.header_bottom_barrier;
                                Barrier barrier2 = (Barrier) a.k(i7, view);
                                if (barrier2 != null && (viewK = a.k((i7 = R.id.header_section), view)) != null) {
                                    i7 = R.id.privacy_hint_icon;
                                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                                    if (simpleDraweeView != null) {
                                        i7 = R.id.privacy_hint_text;
                                        TextView textView4 = (TextView) a.k(i7, view);
                                        if (textView4 != null) {
                                            i7 = R.id.voice_icon;
                                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                                            if (simpleDraweeView2 != null && (viewK2 = a.k((i7 = R.id.voice_list_scroll_gradient), view)) != null) {
                                                i7 = R.id.voice_users_list;
                                                RecyclerView recyclerView = (RecyclerView) a.k(i7, view);
                                                if (recyclerView != null) {
                                                    return new VoiceChannelListInviteViewBinding(view, dCDButton, textView, constraintLayout, textView2, barrier, textView3, barrier2, viewK, simpleDraweeView, textView4, simpleDraweeView2, viewK2, recyclerView);
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
    public static VoiceChannelListInviteViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.voice_channel_list_invite_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
