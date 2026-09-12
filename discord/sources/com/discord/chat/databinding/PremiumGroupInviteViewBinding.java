package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class PremiumGroupInviteViewBinding implements ViewBinding {

    @NonNull
    public final TextView betaPill;

    @NonNull
    public final TextView bodyText;

    @NonNull
    public final SimpleDraweeView headerImage;

    @NonNull
    public final TextView headerText;

    @NonNull
    public final TextView learnMoreLink;

    @NonNull
    private final LinearLayout rootView;

    private PremiumGroupInviteViewBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = linearLayout;
        this.betaPill = textView;
        this.bodyText = textView2;
        this.headerImage = simpleDraweeView;
        this.headerText = textView3;
        this.learnMoreLink = textView4;
    }

    @NonNull
    public static PremiumGroupInviteViewBinding bind(@NonNull View view) {
        int i7 = R.id.betaPill;
        TextView textView = (TextView) a.k(i7, view);
        if (textView != null) {
            i7 = R.id.bodyText;
            TextView textView2 = (TextView) a.k(i7, view);
            if (textView2 != null) {
                i7 = R.id.headerImage;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                if (simpleDraweeView != null) {
                    i7 = R.id.headerText;
                    TextView textView3 = (TextView) a.k(i7, view);
                    if (textView3 != null) {
                        i7 = R.id.learnMoreLink;
                        TextView textView4 = (TextView) a.k(i7, view);
                        if (textView4 != null) {
                            return new PremiumGroupInviteViewBinding((LinearLayout) view, textView, textView2, simpleDraweeView, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static PremiumGroupInviteViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PremiumGroupInviteViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.premium_group_invite_view, viewGroup, false);
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
