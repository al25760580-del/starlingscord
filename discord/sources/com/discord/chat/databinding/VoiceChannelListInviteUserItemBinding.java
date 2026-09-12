package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class VoiceChannelListInviteUserItemBinding implements ViewBinding {

    @NonNull
    public final TextView liveBadge;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SimpleDraweeView userAvatar;

    @NonNull
    public final TextView userName;

    private VoiceChannelListInviteUserItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.liveBadge = textView;
        this.userAvatar = simpleDraweeView;
        this.userName = textView2;
    }

    @NonNull
    public static VoiceChannelListInviteUserItemBinding bind(@NonNull View view) {
        int i7 = R.id.live_badge;
        TextView textView = (TextView) a.k(i7, view);
        if (textView != null) {
            i7 = R.id.user_avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView != null) {
                i7 = R.id.user_name;
                TextView textView2 = (TextView) a.k(i7, view);
                if (textView2 != null) {
                    return new VoiceChannelListInviteUserItemBinding((LinearLayout) view, textView, simpleDraweeView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static VoiceChannelListInviteUserItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static VoiceChannelListInviteUserItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.voice_channel_list_invite_user_item, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
