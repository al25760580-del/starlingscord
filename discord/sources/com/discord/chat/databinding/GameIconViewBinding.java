package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class GameIconViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView gameControllerIcon;

    @NonNull
    private final View rootView;

    private GameIconViewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.gameControllerIcon = simpleDraweeView;
    }

    @NonNull
    public static GameIconViewBinding bind(@NonNull View view) {
        int i7 = R.id.game_controller_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            return new GameIconViewBinding(view, simpleDraweeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static GameIconViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.game_icon_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
