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
public final class SafetyPolicyNoticeBinding implements ViewBinding {

    @NonNull
    public final TextView description;

    @NonNull
    public final LinearLayout footer;

    @NonNull
    public final SimpleDraweeView icon;

    @NonNull
    public final TextView learnMore;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView subtitleText;

    @NonNull
    public final TextView title;

    private SafetyPolicyNoticeBinding(@NonNull View view, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = view;
        this.description = textView;
        this.footer = linearLayout;
        this.icon = simpleDraweeView;
        this.learnMore = textView2;
        this.subtitleText = textView3;
        this.title = textView4;
    }

    @NonNull
    public static SafetyPolicyNoticeBinding bind(@NonNull View view) {
        int i7 = R.id.description;
        TextView textView = (TextView) a.k(i7, view);
        if (textView != null) {
            i7 = R.id.footer;
            LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
            if (linearLayout != null) {
                i7 = R.id.icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                if (simpleDraweeView != null) {
                    i7 = R.id.learn_more;
                    TextView textView2 = (TextView) a.k(i7, view);
                    if (textView2 != null) {
                        i7 = R.id.subtitle_text;
                        TextView textView3 = (TextView) a.k(i7, view);
                        if (textView3 != null) {
                            i7 = R.id.title;
                            TextView textView4 = (TextView) a.k(i7, view);
                            if (textView4 != null) {
                                return new SafetyPolicyNoticeBinding(view, textView, linearLayout, simpleDraweeView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static SafetyPolicyNoticeBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.safety_policy_notice, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
