package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class EmbedFieldViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeSpanTextView name;

    @NonNull
    private final View rootView;

    @NonNull
    public final SimpleDraweeSpanTextView value;

    private EmbedFieldViewBinding(@NonNull View view, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView2) {
        this.rootView = view;
        this.name = simpleDraweeSpanTextView;
        this.value = simpleDraweeSpanTextView2;
    }

    @NonNull
    public static EmbedFieldViewBinding bind(@NonNull View view) {
        int i7 = R.id.name;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
        if (simpleDraweeSpanTextView != null) {
            i7 = R.id.value;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = (SimpleDraweeSpanTextView) a.k(i7, view);
            if (simpleDraweeSpanTextView2 != null) {
                return new EmbedFieldViewBinding(view, simpleDraweeSpanTextView, simpleDraweeSpanTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static EmbedFieldViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.embed_field_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
