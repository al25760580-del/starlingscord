package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.ActivityRichPresenceInviteCompactDeadView;
import com.discord.chat.presentation.message.view.BlockedApplicationEmbedView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityRichPresenceInviteEmbedViewBinding implements ViewBinding {

    @NonNull
    public final LinearLayout actionWrapper;

    @NonNull
    public final SimpleDraweeView activityIcon;

    @NonNull
    public final BlockedApplicationEmbedView blockedView;

    @NonNull
    public final DCDButton button;

    @NonNull
    public final ActivityRichPresenceInviteCompactDeadView compactDeadView;

    @NonNull
    public final ConstraintLayout contentContainer;

    @NonNull
    public final SimpleDraweeView coverImage;

    @NonNull
    public final SimpleDraweeView desktopIcon;

    @NonNull
    public final TextView detailsText;

    @NonNull
    public final ConstraintLayout footerContainer;

    @NonNull
    public final LinearLayout footerContent;

    @NonNull
    public final TextView footerLabel;

    @NonNull
    public final View gradientBackground;

    @NonNull
    public final TextView headerText;

    @NonNull
    public final MessageContentView hiddenContent;

    @NonNull
    public final ConstraintLayout normalContainer;

    @NonNull
    public final OverlappingCirclesView partyAvatars;

    @NonNull
    public final ConstraintLayout partyContainer;

    @NonNull
    public final TextView partySizeText;

    @NonNull
    public final SimpleDraweeView playstationIcon;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView subtitle;

    @NonNull
    public final ConstraintLayout subtitleContainer;

    @NonNull
    public final SimpleDraweeView subtitleIcon;

    @NonNull
    public final LinearLayout textContentWrapper;

    @NonNull
    public final TextView title;

    @NonNull
    public final SimpleDraweeView xboxIcon;

    private ActivityRichPresenceInviteEmbedViewBinding(@NonNull View view, @NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull BlockedApplicationEmbedView blockedApplicationEmbedView, @NonNull DCDButton dCDButton, @NonNull ActivityRichPresenceInviteCompactDeadView activityRichPresenceInviteCompactDeadView, @NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull View view2, @NonNull TextView textView3, @NonNull MessageContentView messageContentView, @NonNull ConstraintLayout constraintLayout3, @NonNull OverlappingCirclesView overlappingCirclesView, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull TextView textView5, @NonNull ConstraintLayout constraintLayout5, @NonNull SimpleDraweeView simpleDraweeView5, @NonNull LinearLayout linearLayout3, @NonNull TextView textView6, @NonNull SimpleDraweeView simpleDraweeView6) {
        this.rootView = view;
        this.actionWrapper = linearLayout;
        this.activityIcon = simpleDraweeView;
        this.blockedView = blockedApplicationEmbedView;
        this.button = dCDButton;
        this.compactDeadView = activityRichPresenceInviteCompactDeadView;
        this.contentContainer = constraintLayout;
        this.coverImage = simpleDraweeView2;
        this.desktopIcon = simpleDraweeView3;
        this.detailsText = textView;
        this.footerContainer = constraintLayout2;
        this.footerContent = linearLayout2;
        this.footerLabel = textView2;
        this.gradientBackground = view2;
        this.headerText = textView3;
        this.hiddenContent = messageContentView;
        this.normalContainer = constraintLayout3;
        this.partyAvatars = overlappingCirclesView;
        this.partyContainer = constraintLayout4;
        this.partySizeText = textView4;
        this.playstationIcon = simpleDraweeView4;
        this.subtitle = textView5;
        this.subtitleContainer = constraintLayout5;
        this.subtitleIcon = simpleDraweeView5;
        this.textContentWrapper = linearLayout3;
        this.title = textView6;
        this.xboxIcon = simpleDraweeView6;
    }

    @NonNull
    public static ActivityRichPresenceInviteEmbedViewBinding bind(@NonNull View view) {
        View viewK;
        int i7 = R.id.action_wrapper;
        LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
        if (linearLayout != null) {
            i7 = R.id.activity_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView != null) {
                i7 = R.id.blocked_view;
                BlockedApplicationEmbedView blockedApplicationEmbedView = (BlockedApplicationEmbedView) a.k(i7, view);
                if (blockedApplicationEmbedView != null) {
                    i7 = R.id.button;
                    DCDButton dCDButton = (DCDButton) a.k(i7, view);
                    if (dCDButton != null) {
                        i7 = R.id.compact_dead_view;
                        ActivityRichPresenceInviteCompactDeadView activityRichPresenceInviteCompactDeadView = (ActivityRichPresenceInviteCompactDeadView) a.k(i7, view);
                        if (activityRichPresenceInviteCompactDeadView != null) {
                            i7 = R.id.content_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                            if (constraintLayout != null) {
                                i7 = R.id.cover_image;
                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                                if (simpleDraweeView2 != null) {
                                    i7 = R.id.desktop_icon;
                                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                                    if (simpleDraweeView3 != null) {
                                        i7 = R.id.details_text;
                                        TextView textView = (TextView) a.k(i7, view);
                                        if (textView != null) {
                                            i7 = R.id.footer_container;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) a.k(i7, view);
                                            if (constraintLayout2 != null) {
                                                i7 = R.id.footer_content;
                                                LinearLayout linearLayout2 = (LinearLayout) a.k(i7, view);
                                                if (linearLayout2 != null) {
                                                    i7 = R.id.footer_label;
                                                    TextView textView2 = (TextView) a.k(i7, view);
                                                    if (textView2 != null && (viewK = a.k((i7 = R.id.gradient_background), view)) != null) {
                                                        i7 = R.id.header_text;
                                                        TextView textView3 = (TextView) a.k(i7, view);
                                                        if (textView3 != null) {
                                                            i7 = R.id.hidden_content;
                                                            MessageContentView messageContentView = (MessageContentView) a.k(i7, view);
                                                            if (messageContentView != null) {
                                                                i7 = R.id.normal_container;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) a.k(i7, view);
                                                                if (constraintLayout3 != null) {
                                                                    i7 = R.id.party_avatars;
                                                                    OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) a.k(i7, view);
                                                                    if (overlappingCirclesView != null) {
                                                                        i7 = R.id.party_container;
                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) a.k(i7, view);
                                                                        if (constraintLayout4 != null) {
                                                                            i7 = R.id.party_size_text;
                                                                            TextView textView4 = (TextView) a.k(i7, view);
                                                                            if (textView4 != null) {
                                                                                i7 = R.id.playstation_icon;
                                                                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.k(i7, view);
                                                                                if (simpleDraweeView4 != null) {
                                                                                    i7 = R.id.subtitle;
                                                                                    TextView textView5 = (TextView) a.k(i7, view);
                                                                                    if (textView5 != null) {
                                                                                        i7 = R.id.subtitle_container;
                                                                                        ConstraintLayout constraintLayout5 = (ConstraintLayout) a.k(i7, view);
                                                                                        if (constraintLayout5 != null) {
                                                                                            i7 = R.id.subtitle_icon;
                                                                                            SimpleDraweeView simpleDraweeView5 = (SimpleDraweeView) a.k(i7, view);
                                                                                            if (simpleDraweeView5 != null) {
                                                                                                i7 = R.id.text_content_wrapper;
                                                                                                LinearLayout linearLayout3 = (LinearLayout) a.k(i7, view);
                                                                                                if (linearLayout3 != null) {
                                                                                                    i7 = R.id.title;
                                                                                                    TextView textView6 = (TextView) a.k(i7, view);
                                                                                                    if (textView6 != null) {
                                                                                                        i7 = R.id.xbox_icon;
                                                                                                        SimpleDraweeView simpleDraweeView6 = (SimpleDraweeView) a.k(i7, view);
                                                                                                        if (simpleDraweeView6 != null) {
                                                                                                            return new ActivityRichPresenceInviteEmbedViewBinding(view, linearLayout, simpleDraweeView, blockedApplicationEmbedView, dCDButton, activityRichPresenceInviteCompactDeadView, constraintLayout, simpleDraweeView2, simpleDraweeView3, textView, constraintLayout2, linearLayout2, textView2, viewK, textView3, messageContentView, constraintLayout3, overlappingCirclesView, constraintLayout4, textView4, simpleDraweeView4, textView5, constraintLayout5, simpleDraweeView5, linearLayout3, textView6, simpleDraweeView6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static ActivityRichPresenceInviteEmbedViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.activity_rich_presence_invite_embed_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
