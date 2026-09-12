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
public final class ErrorMessageViewBinding implements ViewBinding {

    @NonNull
    public final TextView errorLabel;

    @NonNull
    public final TextView header;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView seeMoreButton;

    private ErrorMessageViewBinding(@NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = view;
        this.errorLabel = textView;
        this.header = textView2;
        this.seeMoreButton = textView3;
    }

    @NonNull
    public static ErrorMessageViewBinding bind(@NonNull View view) {
        int i7 = R.id.error_label;
        TextView textView = (TextView) a.k(i7, view);
        if (textView != null) {
            i7 = R.id.header;
            TextView textView2 = (TextView) a.k(i7, view);
            if (textView2 != null) {
                i7 = R.id.see_more_button;
                TextView textView3 = (TextView) a.k(i7, view);
                if (textView3 != null) {
                    return new ErrorMessageViewBinding(view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static ErrorMessageViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.error_message_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
