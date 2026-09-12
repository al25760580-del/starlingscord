package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;

/* JADX INFO: loaded from: classes.dex */
public final class TimestampViewBinding implements ViewBinding {

    @NonNull
    private final TextView rootView;

    private TimestampViewBinding(@NonNull TextView textView) {
        this.rootView = textView;
    }

    @NonNull
    public static TimestampViewBinding bind(@NonNull View view) {
        if (view != null) {
            return new TimestampViewBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static TimestampViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static TimestampViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.timestamp_view, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
