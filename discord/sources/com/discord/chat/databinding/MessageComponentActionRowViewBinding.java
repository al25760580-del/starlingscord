package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.google.android.flexbox.FlexboxLayout;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MessageComponentActionRowViewBinding implements ViewBinding {

    @NonNull
    public final FlexboxLayout actionRowComponentViewGroup;

    @NonNull
    public final ComponentFailedLabelViewBinding actionRowComponentViewGroupErrorRow;

    @NonNull
    private final View rootView;

    private MessageComponentActionRowViewBinding(@NonNull View view, @NonNull FlexboxLayout flexboxLayout, @NonNull ComponentFailedLabelViewBinding componentFailedLabelViewBinding) {
        this.rootView = view;
        this.actionRowComponentViewGroup = flexboxLayout;
        this.actionRowComponentViewGroupErrorRow = componentFailedLabelViewBinding;
    }

    @NonNull
    public static MessageComponentActionRowViewBinding bind(@NonNull View view) {
        View viewK;
        int i7 = R.id.action_row_component_view_group;
        FlexboxLayout flexboxLayout = (FlexboxLayout) a.k(i7, view);
        if (flexboxLayout == null || (viewK = a.k((i7 = R.id.action_row_component_view_group_error_row), view)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
        }
        return new MessageComponentActionRowViewBinding(view, flexboxLayout, ComponentFailedLabelViewBinding.bind(viewK));
    }

    @NonNull
    public static MessageComponentActionRowViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.message_component_action_row_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
