package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class ReferralViewRedesignBinding implements ViewBinding {

    @NonNull
    public final DCDButton acceptButton;

    @NonNull
    public final SimpleDraweeSpanTextView bodyText;

    @NonNull
    public final LinearLayout cardContent;

    @NonNull
    public final TextView footer;

    @NonNull
    public final SimpleDraweeView headerImage;

    @NonNull
    public final TextView headerText;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView subText;

    @NonNull
    public final SimpleDraweeSpanTextView titleText;

    private ReferralViewRedesignBinding(@NonNull LinearLayout linearLayout, @NonNull DCDButton dCDButton, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView2) {
        this.rootView = linearLayout;
        this.acceptButton = dCDButton;
        this.bodyText = simpleDraweeSpanTextView;
        this.cardContent = linearLayout2;
        this.footer = textView;
        this.headerImage = simpleDraweeView;
        this.headerText = textView2;
        this.subText = textView3;
        this.titleText = simpleDraweeSpanTextView2;
    }

    @NonNull
    public static ReferralViewRedesignBinding bind(@NonNull View view) {
        int i7 = R.id.acceptButton;
        DCDButton dCDButton = (DCDButton) a.k(i7, view);
        if (dCDButton != null) {
            i7 = R.id.bodyText;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
            if (simpleDraweeSpanTextView != null) {
                i7 = R.id.cardContent;
                LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
                if (linearLayout != null) {
                    i7 = R.id.footer;
                    TextView textView = (TextView) a.k(i7, view);
                    if (textView != null) {
                        i7 = R.id.headerImage;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                        if (simpleDraweeView != null) {
                            i7 = R.id.headerText;
                            TextView textView2 = (TextView) a.k(i7, view);
                            if (textView2 != null) {
                                i7 = R.id.subText;
                                TextView textView3 = (TextView) a.k(i7, view);
                                if (textView3 != null) {
                                    i7 = R.id.titleText;
                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = (SimpleDraweeSpanTextView) a.k(i7, view);
                                    if (simpleDraweeSpanTextView2 != null) {
                                        return new ReferralViewRedesignBinding((LinearLayout) view, dCDButton, simpleDraweeSpanTextView, linearLayout, textView, simpleDraweeView, textView2, textView3, simpleDraweeSpanTextView2);
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
    public static ReferralViewRedesignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ReferralViewRedesignBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.referral_view_redesign, viewGroup, false);
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
