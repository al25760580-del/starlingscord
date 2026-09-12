package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MessageComponentButtonViewBinding implements ViewBinding {

    @NonNull
    public final MaterialButton button;

    @NonNull
    public final SimpleDraweeSpanTextView emoji;

    @NonNull
    public final MaterialTextView label;

    @NonNull
    public final LinearLayout labelContainer;

    @NonNull
    public final SimpleDraweeView linkIcon;

    @NonNull
    public final ViewStub loadingDots;

    @NonNull
    private final View rootView;

    private MessageComponentButtonViewBinding(@NonNull View view, @NonNull MaterialButton materialButton, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, @NonNull MaterialTextView materialTextView, @NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ViewStub viewStub) {
        this.rootView = view;
        this.button = materialButton;
        this.emoji = simpleDraweeSpanTextView;
        this.label = materialTextView;
        this.labelContainer = linearLayout;
        this.linkIcon = simpleDraweeView;
        this.loadingDots = viewStub;
    }

    @NonNull
    public static MessageComponentButtonViewBinding bind(@NonNull View view) {
        int i7 = R.id.button;
        MaterialButton materialButton = (MaterialButton) a.k(i7, view);
        if (materialButton != null) {
            i7 = R.id.emoji;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
            if (simpleDraweeSpanTextView != null) {
                i7 = R.id.label;
                MaterialTextView materialTextView = (MaterialTextView) a.k(i7, view);
                if (materialTextView != null) {
                    i7 = R.id.label_container;
                    LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
                    if (linearLayout != null) {
                        i7 = R.id.link_icon;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
                        if (simpleDraweeView != null) {
                            i7 = R.id.loading_dots;
                            ViewStub viewStub = (ViewStub) a.k(i7, view);
                            if (viewStub != null) {
                                return new MessageComponentButtonViewBinding(view, materialButton, simpleDraweeSpanTextView, materialTextView, linearLayout, simpleDraweeView, viewStub);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static MessageComponentButtonViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.message_component_button_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
