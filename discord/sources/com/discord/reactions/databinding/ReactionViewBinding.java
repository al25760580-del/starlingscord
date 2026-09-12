package com.discord.reactions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.reactions.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class ReactionViewBinding implements ViewBinding {

    @NonNull
    public final TextView reactionCount1;

    @NonNull
    public final TextView reactionCount2;

    @NonNull
    public final TextSwitcher reactionCountSwitcher;

    @NonNull
    public final SimpleDraweeSpanTextView reactionEmoji;

    @NonNull
    public final TextView reactionLabelLeft;

    @NonNull
    public final TextView reactionLabelRight;

    @NonNull
    private final View rootView;

    private ReactionViewBinding(@NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextSwitcher textSwitcher, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = view;
        this.reactionCount1 = textView;
        this.reactionCount2 = textView2;
        this.reactionCountSwitcher = textSwitcher;
        this.reactionEmoji = simpleDraweeSpanTextView;
        this.reactionLabelLeft = textView3;
        this.reactionLabelRight = textView4;
    }

    @NonNull
    public static ReactionViewBinding bind(@NonNull View view) {
        int i7 = R.id.reaction_count_1;
        TextView textView = (TextView) a.k(i7, view);
        if (textView != null) {
            i7 = R.id.reaction_count_2;
            TextView textView2 = (TextView) a.k(i7, view);
            if (textView2 != null) {
                i7 = R.id.reaction_count_switcher;
                TextSwitcher textSwitcher = (TextSwitcher) a.k(i7, view);
                if (textSwitcher != null) {
                    i7 = R.id.reaction_emoji;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
                    if (simpleDraweeSpanTextView != null) {
                        i7 = R.id.reaction_label_left;
                        TextView textView3 = (TextView) a.k(i7, view);
                        if (textView3 != null) {
                            i7 = R.id.reaction_label_right;
                            TextView textView4 = (TextView) a.k(i7, view);
                            if (textView4 != null) {
                                return new ReactionViewBinding(view, textView, textView2, textSwitcher, simpleDraweeSpanTextView, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static ReactionViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.reaction_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
