package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class ReferralViewBinding implements ViewBinding {

    @NonNull
    public final DCDButton acceptButton;

    @NonNull
    public final ConstraintLayout content;

    @NonNull
    public final TextView footer;

    @NonNull
    public final TextView imageCopy;

    @NonNull
    public final SimpleDraweeView nitroLogoBanner;

    @NonNull
    public final SimpleDraweeView nitroTicket;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SimpleDraweeSpanTextView subtitle;

    @NonNull
    public final TextView title;

    @NonNull
    public final TextView trialInfo;

    @NonNull
    public final Barrier trialInfoTop;

    private ReferralViewBinding(@NonNull LinearLayout linearLayout, @NonNull DCDButton dCDButton, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Barrier barrier) {
        this.rootView = linearLayout;
        this.acceptButton = dCDButton;
        this.content = constraintLayout;
        this.footer = textView;
        this.imageCopy = textView2;
        this.nitroLogoBanner = simpleDraweeView;
        this.nitroTicket = simpleDraweeView2;
        this.subtitle = simpleDraweeSpanTextView;
        this.title = textView3;
        this.trialInfo = textView4;
        this.trialInfoTop = barrier;
    }

    @NonNull
    public static ReferralViewBinding bind(@NonNull View view) {
        int i7 = R.id.acceptButton;
        DCDButton dCDButton = (DCDButton) a.k(i7, view);
        if (dCDButton != null) {
            i7 = R.id.content;
            ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
            if (constraintLayout != null) {
                i7 = R.id.footer;
                TextView textView = (TextView) a.k(i7, view);
                if (textView != null) {
                    i7 = R.id.imageCopy;
                    TextView textView2 = (TextView) a.k(i7, view);
                    if (textView2 != null) {
                        i7 = R.id.nitroLogoBanner;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                        if (simpleDraweeView != null) {
                            i7 = R.id.nitroTicket;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                            if (simpleDraweeView2 != null) {
                                i7 = R.id.subtitle;
                                SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
                                if (simpleDraweeSpanTextView != null) {
                                    i7 = R.id.title;
                                    TextView textView3 = (TextView) a.k(i7, view);
                                    if (textView3 != null) {
                                        i7 = R.id.trialInfo;
                                        TextView textView4 = (TextView) a.k(i7, view);
                                        if (textView4 != null) {
                                            i7 = R.id.trial_info_top;
                                            Barrier barrier = (Barrier) a.k(i7, view);
                                            if (barrier != null) {
                                                return new ReferralViewBinding((LinearLayout) view, dCDButton, constraintLayout, textView, textView2, simpleDraweeView, simpleDraweeView2, simpleDraweeSpanTextView, textView3, textView4, barrier);
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
    public static ReferralViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ReferralViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.referral_view, viewGroup, false);
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
