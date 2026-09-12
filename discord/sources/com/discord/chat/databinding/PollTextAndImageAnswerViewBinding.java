package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.polls.PollCheckboxView;
import com.discord.chat.presentation.message.view.polls.PollMediaView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class PollTextAndImageAnswerViewBinding implements ViewBinding {

    @NonNull
    public final PollCheckboxView checkbox;

    @NonNull
    public final PollMediaView image;

    @NonNull
    public final SimpleDraweeSpanTextView label;

    @NonNull
    public final View percentageBarBackground;

    @NonNull
    public final FrameLayout percentageBarContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView voteCounts;

    @NonNull
    public final TextView votePercentage;

    private PollTextAndImageAnswerViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull PollCheckboxView pollCheckboxView, @NonNull PollMediaView pollMediaView, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.checkbox = pollCheckboxView;
        this.image = pollMediaView;
        this.label = simpleDraweeSpanTextView;
        this.percentageBarBackground = view;
        this.percentageBarContainer = frameLayout;
        this.voteCounts = textView;
        this.votePercentage = textView2;
    }

    @NonNull
    public static PollTextAndImageAnswerViewBinding bind(@NonNull View view) {
        View viewK;
        int i7 = R.id.checkbox;
        PollCheckboxView pollCheckboxView = (PollCheckboxView) a.k(i7, view);
        if (pollCheckboxView != null) {
            i7 = R.id.image;
            PollMediaView pollMediaView = (PollMediaView) a.k(i7, view);
            if (pollMediaView != null) {
                i7 = R.id.label;
                SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
                if (simpleDraweeSpanTextView != null && (viewK = a.k((i7 = R.id.percentage_bar_background), view)) != null) {
                    i7 = R.id.percentage_bar_container;
                    FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
                    if (frameLayout != null) {
                        i7 = R.id.vote_counts;
                        TextView textView = (TextView) a.k(i7, view);
                        if (textView != null) {
                            i7 = R.id.vote_percentage;
                            TextView textView2 = (TextView) a.k(i7, view);
                            if (textView2 != null) {
                                return new PollTextAndImageAnswerViewBinding((ConstraintLayout) view, pollCheckboxView, pollMediaView, simpleDraweeSpanTextView, viewK, frameLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static PollTextAndImageAnswerViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PollTextAndImageAnswerViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.poll_text_and_image_answer_view, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
