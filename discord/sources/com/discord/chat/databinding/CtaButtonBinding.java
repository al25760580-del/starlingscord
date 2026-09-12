package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class CtaButtonBinding implements ViewBinding {

    @NonNull
    public final DCDButton ctaButton;

    @NonNull
    private final View rootView;

    @NonNull
    public final DCDButton secondaryCtaButton;

    private CtaButtonBinding(@NonNull View view, @NonNull DCDButton dCDButton, @NonNull DCDButton dCDButton2) {
        this.rootView = view;
        this.ctaButton = dCDButton;
        this.secondaryCtaButton = dCDButton2;
    }

    @NonNull
    public static CtaButtonBinding bind(@NonNull View view) {
        int i7 = R.id.ctaButton;
        DCDButton dCDButton = (DCDButton) a.k(i7, view);
        if (dCDButton != null) {
            i7 = R.id.secondaryCtaButton;
            DCDButton dCDButton2 = (DCDButton) a.k(i7, view);
            if (dCDButton2 != null) {
                return new CtaButtonBinding(view, dCDButton, dCDButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static CtaButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.cta_button, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
