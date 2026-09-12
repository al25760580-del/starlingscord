package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.GiftIntentView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class GiftIntentViewBinding implements ViewBinding {

    @NonNull
    public final FrameLayout avatarContainer;

    @NonNull
    public final LinearLayout ctaRow;

    @NonNull
    public final SimpleDraweeView currentUserAvatar;

    @NonNull
    public final TextView headerLabel;

    @NonNull
    public final LinearLayout headerRow;

    @NonNull
    public final ConstraintLayout primaryCtaButton;

    @NonNull
    public final SimpleDraweeView primaryCtaIcon;

    @NonNull
    public final TextView primaryCtaLabel;

    @NonNull
    public final SimpleDraweeView recipientAvatar;

    @NonNull
    public final View recipientAvatarCutout;

    @NonNull
    private final GiftIntentView rootView;

    @NonNull
    public final FrameLayout secondaryCtaButton;

    @NonNull
    public final SimpleDraweeView secondaryCtaIcon;

    @NonNull
    public final SimpleDraweeView subHeaderIcon;

    @NonNull
    public final TextView subHeaderLabel;

    @NonNull
    public final LinearLayout subHeaderRow;

    @NonNull
    public final LinearLayout textColumn;

    private GiftIntentViewBinding(@NonNull GiftIntentView giftIntentView, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull View view, @NonNull FrameLayout frameLayout2, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull SimpleDraweeView simpleDraweeView5, @NonNull TextView textView3, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4) {
        this.rootView = giftIntentView;
        this.avatarContainer = frameLayout;
        this.ctaRow = linearLayout;
        this.currentUserAvatar = simpleDraweeView;
        this.headerLabel = textView;
        this.headerRow = linearLayout2;
        this.primaryCtaButton = constraintLayout;
        this.primaryCtaIcon = simpleDraweeView2;
        this.primaryCtaLabel = textView2;
        this.recipientAvatar = simpleDraweeView3;
        this.recipientAvatarCutout = view;
        this.secondaryCtaButton = frameLayout2;
        this.secondaryCtaIcon = simpleDraweeView4;
        this.subHeaderIcon = simpleDraweeView5;
        this.subHeaderLabel = textView3;
        this.subHeaderRow = linearLayout3;
        this.textColumn = linearLayout4;
    }

    @NonNull
    public static GiftIntentViewBinding bind(@NonNull View view) {
        View viewK;
        int i7 = R.id.avatar_container;
        FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
        if (frameLayout != null) {
            i7 = R.id.cta_row;
            LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
            if (linearLayout != null) {
                i7 = R.id.current_user_avatar;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                if (simpleDraweeView != null) {
                    i7 = R.id.header_label;
                    TextView textView = (TextView) a.k(i7, view);
                    if (textView != null) {
                        i7 = R.id.header_row;
                        LinearLayout linearLayout2 = (LinearLayout) a.k(i7, view);
                        if (linearLayout2 != null) {
                            i7 = R.id.primary_cta_button;
                            ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                            if (constraintLayout != null) {
                                i7 = R.id.primary_cta_icon;
                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                                if (simpleDraweeView2 != null) {
                                    i7 = R.id.primary_cta_label;
                                    TextView textView2 = (TextView) a.k(i7, view);
                                    if (textView2 != null) {
                                        i7 = R.id.recipient_avatar;
                                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                                        if (simpleDraweeView3 != null && (viewK = a.k((i7 = R.id.recipient_avatar_cutout), view)) != null) {
                                            i7 = R.id.secondary_cta_button;
                                            FrameLayout frameLayout2 = (FrameLayout) a.k(i7, view);
                                            if (frameLayout2 != null) {
                                                i7 = R.id.secondary_cta_icon;
                                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.k(i7, view);
                                                if (simpleDraweeView4 != null) {
                                                    i7 = R.id.sub_header_icon;
                                                    SimpleDraweeView simpleDraweeView5 = (SimpleDraweeView) a.k(i7, view);
                                                    if (simpleDraweeView5 != null) {
                                                        i7 = R.id.sub_header_label;
                                                        TextView textView3 = (TextView) a.k(i7, view);
                                                        if (textView3 != null) {
                                                            i7 = R.id.sub_header_row;
                                                            LinearLayout linearLayout3 = (LinearLayout) a.k(i7, view);
                                                            if (linearLayout3 != null) {
                                                                i7 = R.id.text_column;
                                                                LinearLayout linearLayout4 = (LinearLayout) a.k(i7, view);
                                                                if (linearLayout4 != null) {
                                                                    return new GiftIntentViewBinding((GiftIntentView) view, frameLayout, linearLayout, simpleDraweeView, textView, linearLayout2, constraintLayout, simpleDraweeView2, textView2, simpleDraweeView3, viewK, frameLayout2, simpleDraweeView4, simpleDraweeView5, textView3, linearLayout3, linearLayout4);
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
    public static GiftIntentViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static GiftIntentViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.gift_intent_view, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public GiftIntentView getRoot() {
        return this.rootView;
    }
}
