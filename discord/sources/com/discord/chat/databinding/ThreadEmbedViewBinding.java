package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ClanTagChipletView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class ThreadEmbedViewBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    @NonNull
    public final ClanTagChipletView tagChiplet;

    @NonNull
    public final SimpleDraweeView threadEmbedIcon;

    @NonNull
    public final TextView threadEmbedMessagesCount;

    @NonNull
    public final SimpleDraweeView threadEmbedMostRecentMessageAvatar;

    @NonNull
    public final SimpleDraweeSpanTextView threadEmbedMostRecentMessageContent;

    @NonNull
    public final LinearLayout threadEmbedMostRecentMessageHeader;

    @NonNull
    public final TextView threadEmbedMostRecentMessageName;

    @NonNull
    public final TextView threadEmbedName;

    private ThreadEmbedViewBinding(@NonNull View view, @NonNull ClanTagChipletView clanTagChipletView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = view;
        this.tagChiplet = clanTagChipletView;
        this.threadEmbedIcon = simpleDraweeView;
        this.threadEmbedMessagesCount = textView;
        this.threadEmbedMostRecentMessageAvatar = simpleDraweeView2;
        this.threadEmbedMostRecentMessageContent = simpleDraweeSpanTextView;
        this.threadEmbedMostRecentMessageHeader = linearLayout;
        this.threadEmbedMostRecentMessageName = textView2;
        this.threadEmbedName = textView3;
    }

    @NonNull
    public static ThreadEmbedViewBinding bind(@NonNull View view) {
        int i7 = R.id.tag_chiplet;
        ClanTagChipletView clanTagChipletView = (ClanTagChipletView) a.k(i7, view);
        if (clanTagChipletView != null) {
            i7 = R.id.thread_embed_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView != null) {
                i7 = R.id.thread_embed_messages_count;
                TextView textView = (TextView) a.k(i7, view);
                if (textView != null) {
                    i7 = R.id.thread_embed_most_recent_message_avatar;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                    if (simpleDraweeView2 != null) {
                        i7 = R.id.thread_embed_most_recent_message_content;
                        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
                        if (simpleDraweeSpanTextView != null) {
                            i7 = R.id.thread_embed_most_recent_message_header;
                            LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
                            if (linearLayout != null) {
                                i7 = R.id.thread_embed_most_recent_message_name;
                                TextView textView2 = (TextView) a.k(i7, view);
                                if (textView2 != null) {
                                    i7 = R.id.thread_embed_name;
                                    TextView textView3 = (TextView) a.k(i7, view);
                                    if (textView3 != null) {
                                        return new ThreadEmbedViewBinding(view, clanTagChipletView, simpleDraweeView, textView, simpleDraweeView2, simpleDraweeSpanTextView, linearLayout, textView2, textView3);
                                    }
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
    public static ThreadEmbedViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.thread_embed_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
