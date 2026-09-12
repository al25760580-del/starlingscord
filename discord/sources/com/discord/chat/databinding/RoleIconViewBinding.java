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
public final class RoleIconViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeSpanTextView roleIconViewUnicodeEmoji;

    @NonNull
    private final View rootView;

    private RoleIconViewBinding(@NonNull View view, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView) {
        this.rootView = view;
        this.roleIconViewUnicodeEmoji = simpleDraweeSpanTextView;
    }

    @NonNull
    public static RoleIconViewBinding bind(@NonNull View view) {
        int i7 = R.id.role_icon_view_unicode_emoji;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
        if (simpleDraweeSpanTextView != null) {
            return new RoleIconViewBinding(view, simpleDraweeSpanTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static RoleIconViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.role_icon_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
