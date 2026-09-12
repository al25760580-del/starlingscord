package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class FlaggedMessageEmbedFooterViewBinding implements ViewBinding {

    @NonNull
    public final TextView flaggedMessageKeyword;

    @NonNull
    public final TextView flaggedMessageRuleName;

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView separatorDot;

    private FlaggedMessageEmbedFooterViewBinding(@NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView) {
        this.rootView = view;
        this.flaggedMessageKeyword = textView;
        this.flaggedMessageRuleName = textView2;
        this.separatorDot = imageView;
    }

    @NonNull
    public static FlaggedMessageEmbedFooterViewBinding bind(@NonNull View view) {
        int i7 = R.id.flagged_message_keyword;
        TextView textView = (TextView) a.k(i7, view);
        if (textView != null) {
            i7 = R.id.flagged_message_rule_name;
            TextView textView2 = (TextView) a.k(i7, view);
            if (textView2 != null) {
                i7 = R.id.separator_dot;
                ImageView imageView = (ImageView) a.k(i7, view);
                if (imageView != null) {
                    return new FlaggedMessageEmbedFooterViewBinding(view, textView, textView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static FlaggedMessageEmbedFooterViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.flagged_message_embed_footer_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
