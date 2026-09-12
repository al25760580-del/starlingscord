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
public final class InviteToSpeakViewBinding implements ViewBinding {

    @NonNull
    public final TextView inviteToSpeakText;

    @NonNull
    public final SimpleDraweeView moveToSpeakerIcon;

    @NonNull
    private final View rootView;

    private InviteToSpeakViewBinding(@NonNull View view, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.inviteToSpeakText = textView;
        this.moveToSpeakerIcon = simpleDraweeView;
    }

    @NonNull
    public static InviteToSpeakViewBinding bind(@NonNull View view) {
        int i7 = R.id.invite_to_speak_text;
        TextView textView = (TextView) a.k(i7, view);
        if (textView != null) {
            i7 = R.id.move_to_speaker_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView != null) {
                return new InviteToSpeakViewBinding(view, textView, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static InviteToSpeakViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.invite_to_speak_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
