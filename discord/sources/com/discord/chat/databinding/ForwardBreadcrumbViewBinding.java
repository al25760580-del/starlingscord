package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class ForwardBreadcrumbViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView arrow;

    @NonNull
    public final SimpleDraweeView icon;

    @NonNull
    public final TextView label;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView separator;

    @NonNull
    public final TextView timestamp;

    private ForwardBreadcrumbViewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = view;
        this.arrow = simpleDraweeView;
        this.icon = simpleDraweeView2;
        this.label = textView;
        this.separator = textView2;
        this.timestamp = textView3;
    }

    @NonNull
    public static ForwardBreadcrumbViewBinding bind(@NonNull View view) {
        int i7 = R.id.arrow;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.icon;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView2 != null) {
                i7 = R.id.label;
                TextView textView = (TextView) a.k(i7, view);
                if (textView != null) {
                    i7 = R.id.separator;
                    TextView textView2 = (TextView) a.k(i7, view);
                    if (textView2 != null) {
                        i7 = R.id.timestamp;
                        TextView textView3 = (TextView) a.k(i7, view);
                        if (textView3 != null) {
                            return new ForwardBreadcrumbViewBinding(view, simpleDraweeView, simpleDraweeView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static ForwardBreadcrumbViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.forward_breadcrumb_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
