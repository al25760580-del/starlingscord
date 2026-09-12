package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionsRoleTagViewBinding implements ViewBinding {

    @NonNull
    public final CardView connectionsRoleTagContainer;

    @NonNull
    public final TextView roleName;

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView verifiedCheckIcon;

    @NonNull
    public final ImageView verifiedCheckIconBackground;

    @NonNull
    public final FrameLayout verifiedCheckIconContainer;

    private ConnectionsRoleTagViewBinding(@NonNull View view, @NonNull CardView cardView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout) {
        this.rootView = view;
        this.connectionsRoleTagContainer = cardView;
        this.roleName = textView;
        this.verifiedCheckIcon = imageView;
        this.verifiedCheckIconBackground = imageView2;
        this.verifiedCheckIconContainer = frameLayout;
    }

    @NonNull
    public static ConnectionsRoleTagViewBinding bind(@NonNull View view) {
        int i7 = R.id.connections_role_tag_container;
        CardView cardView = (CardView) a.k(i7, view);
        if (cardView != null) {
            i7 = R.id.role_name;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                i7 = R.id.verified_check_icon;
                ImageView imageView = (ImageView) a.k(i7, view);
                if (imageView != null) {
                    i7 = R.id.verified_check_icon_background;
                    ImageView imageView2 = (ImageView) a.k(i7, view);
                    if (imageView2 != null) {
                        i7 = R.id.verified_check_icon_container;
                        FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
                        if (frameLayout != null) {
                            return new ConnectionsRoleTagViewBinding(view, cardView, textView, imageView, imageView2, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static ConnectionsRoleTagViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.connections_role_tag_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
