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
public final class GuildViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView guildAvatar;

    @NonNull
    public final TextView guildText;

    @NonNull
    private final View rootView;

    private GuildViewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView) {
        this.rootView = view;
        this.guildAvatar = simpleDraweeView;
        this.guildText = textView;
    }

    @NonNull
    public static GuildViewBinding bind(@NonNull View view) {
        int i7 = R.id.guild_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.guild_text;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                return new GuildViewBinding(view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static GuildViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.guild_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
