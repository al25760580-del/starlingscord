package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class DeserializationErrorViewBinding implements ViewBinding {

    @NonNull
    public final TextView causeHeader;

    @NonNull
    public final Button copyButton;

    @NonNull
    public final TextView exception;

    @NonNull
    public final TextView header;

    @NonNull
    public final TextView json;

    @NonNull
    public final TextView jsonHeader;

    @NonNull
    private final View rootView;

    private DeserializationErrorViewBinding(@NonNull View view, @NonNull TextView textView, @NonNull Button button, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = view;
        this.causeHeader = textView;
        this.copyButton = button;
        this.exception = textView2;
        this.header = textView3;
        this.json = textView4;
        this.jsonHeader = textView5;
    }

    @NonNull
    public static DeserializationErrorViewBinding bind(@NonNull View view) {
        int i7 = R.id.cause_header;
        TextView textView = (TextView) a.k(i7, view);
        if (textView != null) {
            i7 = R.id.copy_button;
            Button button = (Button) a.k(i7, view);
            if (button != null) {
                i7 = R.id.exception;
                TextView textView2 = (TextView) a.k(i7, view);
                if (textView2 != null) {
                    i7 = R.id.header;
                    TextView textView3 = (TextView) a.k(i7, view);
                    if (textView3 != null) {
                        i7 = R.id.json;
                        TextView textView4 = (TextView) a.k(i7, view);
                        if (textView4 != null) {
                            i7 = R.id.json_header;
                            TextView textView5 = (TextView) a.k(i7, view);
                            if (textView5 != null) {
                                return new DeserializationErrorViewBinding(view, textView, button, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static DeserializationErrorViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.deserialization_error_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
