package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class GiftViewBinding implements ViewBinding {

    @NonNull
    public final DCDButton acceptButton;

    @NonNull
    public final View acceptButtonGradient;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final TextView body;

    @NonNull
    public final ConstraintLayout content;

    @NonNull
    public final Group gradients;

    @NonNull
    public final TextView header;

    @NonNull
    public final View headerGradient;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final SimpleDraweeView splash;

    @NonNull
    public final TextView subtitle;

    @NonNull
    public final View subtitleGradient;

    @NonNull
    public final SimpleDraweeView thumbnail;

    @NonNull
    public final View thumbnailGradient;

    @NonNull
    public final TextView title;

    @NonNull
    public final View titleGradient;

    private GiftViewBinding(@NonNull FrameLayout frameLayout, @NonNull DCDButton dCDButton, @NonNull View view, @NonNull Barrier barrier, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull TextView textView2, @NonNull View view2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull View view3, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull View view4, @NonNull TextView textView4, @NonNull View view5) {
        this.rootView = frameLayout;
        this.acceptButton = dCDButton;
        this.acceptButtonGradient = view;
        this.barrier = barrier;
        this.body = textView;
        this.content = constraintLayout;
        this.gradients = group;
        this.header = textView2;
        this.headerGradient = view2;
        this.splash = simpleDraweeView;
        this.subtitle = textView3;
        this.subtitleGradient = view3;
        this.thumbnail = simpleDraweeView2;
        this.thumbnailGradient = view4;
        this.title = textView4;
        this.titleGradient = view5;
    }

    @NonNull
    public static GiftViewBinding bind(@NonNull View view) {
        View viewK;
        View viewK2;
        View viewK3;
        View viewK4;
        View viewK5;
        int i7 = R.id.acceptButton;
        DCDButton dCDButton = (DCDButton) a.k(i7, view);
        if (dCDButton != null && (viewK = a.k((i7 = R.id.acceptButtonGradient), view)) != null) {
            i7 = R.id.barrier;
            Barrier barrier = (Barrier) a.k(i7, view);
            if (barrier != null) {
                i7 = R.id.body;
                TextView textView = (TextView) a.k(i7, view);
                if (textView != null) {
                    i7 = R.id.content;
                    ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                    if (constraintLayout != null) {
                        i7 = R.id.gradients;
                        Group group = (Group) a.k(i7, view);
                        if (group != null) {
                            i7 = R.id.header;
                            TextView textView2 = (TextView) a.k(i7, view);
                            if (textView2 != null && (viewK2 = a.k((i7 = R.id.headerGradient), view)) != null) {
                                i7 = R.id.splash;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                                if (simpleDraweeView != null) {
                                    i7 = R.id.subtitle;
                                    TextView textView3 = (TextView) a.k(i7, view);
                                    if (textView3 != null && (viewK3 = a.k((i7 = R.id.subtitleGradient), view)) != null) {
                                        i7 = R.id.thumbnail;
                                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                                        if (simpleDraweeView2 != null && (viewK4 = a.k((i7 = R.id.thumbnailGradient), view)) != null) {
                                            i7 = R.id.title;
                                            TextView textView4 = (TextView) a.k(i7, view);
                                            if (textView4 != null && (viewK5 = a.k((i7 = R.id.titleGradient), view)) != null) {
                                                return new GiftViewBinding((FrameLayout) view, dCDButton, viewK, barrier, textView, constraintLayout, group, textView2, viewK2, simpleDraweeView, textView3, viewK3, simpleDraweeView2, viewK4, textView4, viewK5);
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
    public static GiftViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static GiftViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.gift_view, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
