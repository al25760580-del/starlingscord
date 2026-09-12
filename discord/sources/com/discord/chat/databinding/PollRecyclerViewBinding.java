package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.polls.PollActionButton;
import com.discord.device.views.DiscordRecyclerView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class PollRecyclerViewBinding implements ViewBinding {

    @NonNull
    public final DiscordRecyclerView answers;

    @NonNull
    public final PollActionButton primaryAction;

    @NonNull
    public final TextView promptText;

    @NonNull
    public final TextView questionText;

    @NonNull
    private final View rootView;

    @NonNull
    public final PollActionButton secondaryActionButton;

    @NonNull
    public final PollActionButton tertiaryActionButton;

    private PollRecyclerViewBinding(@NonNull View view, @NonNull DiscordRecyclerView discordRecyclerView, @NonNull PollActionButton pollActionButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull PollActionButton pollActionButton2, @NonNull PollActionButton pollActionButton3) {
        this.rootView = view;
        this.answers = discordRecyclerView;
        this.primaryAction = pollActionButton;
        this.promptText = textView;
        this.questionText = textView2;
        this.secondaryActionButton = pollActionButton2;
        this.tertiaryActionButton = pollActionButton3;
    }

    @NonNull
    public static PollRecyclerViewBinding bind(@NonNull View view) {
        int i7 = R.id.answers;
        DiscordRecyclerView discordRecyclerView = (DiscordRecyclerView) a.k(i7, view);
        if (discordRecyclerView != null) {
            i7 = R.id.primary_action;
            PollActionButton pollActionButton = (PollActionButton) a.k(i7, view);
            if (pollActionButton != null) {
                i7 = R.id.prompt_text;
                TextView textView = (TextView) a.k(i7, view);
                if (textView != null) {
                    i7 = R.id.question_text;
                    TextView textView2 = (TextView) a.k(i7, view);
                    if (textView2 != null) {
                        i7 = R.id.secondary_action_button;
                        PollActionButton pollActionButton2 = (PollActionButton) a.k(i7, view);
                        if (pollActionButton2 != null) {
                            i7 = R.id.tertiary_action_button;
                            PollActionButton pollActionButton3 = (PollActionButton) a.k(i7, view);
                            if (pollActionButton3 != null) {
                                return new PollRecyclerViewBinding(view, discordRecyclerView, pollActionButton, textView, textView2, pollActionButton2, pollActionButton3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static PollRecyclerViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.poll_recycler_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
