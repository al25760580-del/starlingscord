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
public final class MessageComponentSectionViewBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    @NonNull
    public final ComponentFailedLabelViewBinding sectionComponentViewGroupErrorRow;

    @NonNull
    public final FlexboxLayout sectionLayoutBox;

    private MessageComponentSectionViewBinding(@NonNull View view, @NonNull ComponentFailedLabelViewBinding componentFailedLabelViewBinding, @NonNull FlexboxLayout flexboxLayout) {
        this.rootView = view;
        this.sectionComponentViewGroupErrorRow = componentFailedLabelViewBinding;
        this.sectionLayoutBox = flexboxLayout;
    }

    @NonNull
    public static MessageComponentSectionViewBinding bind(@NonNull View view) {
        int i7 = R.id.section_component_view_group_error_row;
        View viewK = a.k(i7, view);
        if (viewK != null) {
            ComponentFailedLabelViewBinding componentFailedLabelViewBindingBind = ComponentFailedLabelViewBinding.bind(viewK);
            int i10 = R.id.section_layout_box;
            FlexboxLayout flexboxLayout = (FlexboxLayout) a.k(i10, view);
            if (flexboxLayout != null) {
                return new MessageComponentSectionViewBinding(view, componentFailedLabelViewBindingBind, flexboxLayout);
            }
            i7 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static MessageComponentSectionViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.message_component_section_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
