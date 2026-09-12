package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class SeparatorViewBinding implements ViewBinding {

    @NonNull
    public final View leftBar;

    @NonNull
    public final TextView middleText;

    @NonNull
    public final View rightBar;

    @NonNull
    private final View rootView;

    private SeparatorViewBinding(@NonNull View view, @NonNull View view2, @NonNull TextView textView, @NonNull View view3) {
        this.rootView = view;
        this.leftBar = view2;
        this.middleText = textView;
        this.rightBar = view3;
    }

    @NonNull
    public static SeparatorViewBinding bind(@NonNull View view) {
        View viewK;
        int i7 = R.id.left_bar;
        View viewK2 = a.k(i7, view);
        if (viewK2 != null) {
            i7 = R.id.middle_text;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null && (viewK = a.k((i7 = R.id.right_bar), view)) != null) {
                return new SeparatorViewBinding(view, viewK2, textView, viewK);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static SeparatorViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.separator_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
