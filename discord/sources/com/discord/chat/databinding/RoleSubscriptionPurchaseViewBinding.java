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
public final class RoleSubscriptionPurchaseViewBinding implements ViewBinding {

    @NonNull
    public final View roleSubscriptionBadgeDummyView;

    @NonNull
    public final SimpleDraweeView roleSubscriptionPurchaseBadge;

    @NonNull
    public final SimpleDraweeView roleSubscriptionPurchaseCardBg;

    @NonNull
    public final SimpleDraweeView roleSubscriptionPurchaseLanyard;

    @NonNull
    public final SimpleDraweeView roleSubscriptionPurchaserAvatar;

    @NonNull
    public final TextView roleSubscriptionPurchaserUsername;

    @NonNull
    public final TextView roleSubscriptionWelcome;

    @NonNull
    private final View rootView;

    private RoleSubscriptionPurchaseViewBinding(@NonNull View view, @NonNull View view2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.roleSubscriptionBadgeDummyView = view2;
        this.roleSubscriptionPurchaseBadge = simpleDraweeView;
        this.roleSubscriptionPurchaseCardBg = simpleDraweeView2;
        this.roleSubscriptionPurchaseLanyard = simpleDraweeView3;
        this.roleSubscriptionPurchaserAvatar = simpleDraweeView4;
        this.roleSubscriptionPurchaserUsername = textView;
        this.roleSubscriptionWelcome = textView2;
    }

    @NonNull
    public static RoleSubscriptionPurchaseViewBinding bind(@NonNull View view) {
        int i7 = R.id.role_subscription_badge_dummy_view;
        View viewK = a.k(i7, view);
        if (viewK != null) {
            i7 = R.id.role_subscription_purchase_badge;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView != null) {
                i7 = R.id.role_subscription_purchase_card_bg;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                if (simpleDraweeView2 != null) {
                    i7 = R.id.role_subscription_purchase_lanyard;
                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                    if (simpleDraweeView3 != null) {
                        i7 = R.id.role_subscription_purchaser_avatar;
                        SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.k(i7, view);
                        if (simpleDraweeView4 != null) {
                            i7 = R.id.role_subscription_purchaser_username;
                            TextView textView = (TextView) a.k(i7, view);
                            if (textView != null) {
                                i7 = R.id.role_subscription_welcome;
                                TextView textView2 = (TextView) a.k(i7, view);
                                if (textView2 != null) {
                                    return new RoleSubscriptionPurchaseViewBinding(view, viewK, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, simpleDraweeView4, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static RoleSubscriptionPurchaseViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.role_subscription_purchase_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
