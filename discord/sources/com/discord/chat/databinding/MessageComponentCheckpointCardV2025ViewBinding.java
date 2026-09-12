package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.CheckpointCardV2025ComponentView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class MessageComponentCheckpointCardV2025ViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView applicationImage;

    @NonNull
    public final TextView applicationName;

    @NonNull
    public final FrameLayout applicationStroke;

    @NonNull
    public final LinearLayout checkpoint;

    @NonNull
    public final TextView cta;

    @NonNull
    public final TextView emojiCount;

    @NonNull
    public final SimpleDraweeView emojiImage;

    @NonNull
    public final TextView emojiName;

    @NonNull
    public final FrameLayout emojiStroke;

    @NonNull
    public final ConstraintLayout footer;

    @NonNull
    public final SimpleDraweeView guildImage;

    @NonNull
    public final TextView guildName;

    @NonNull
    public final FrameLayout guildStroke;

    @NonNull
    public final LinearLayout image;

    @NonNull
    public final SimpleDraweeView imageResource;

    @NonNull
    public final ImageView logo;

    @NonNull
    public final TextView messageCount;

    @NonNull
    public final LinearLayout powerBar;

    @NonNull
    public final LinearLayout powerContainer;

    @NonNull
    public final TextView powerLevelLvl;

    @NonNull
    public final TextView powerLevelNumber;

    @NonNull
    private final CheckpointCardV2025ComponentView rootView;

    @NonNull
    public final LinearLayout stats;

    @NonNull
    public final TextView title;

    @NonNull
    public final TextView unicodeEmojiImage;

    @NonNull
    public final TextView voiceMinutes;

    private MessageComponentCheckpointCardV2025ViewBinding(@NonNull CheckpointCardV2025ComponentView checkpointCardV2025ComponentView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView4, @NonNull FrameLayout frameLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView5, @NonNull FrameLayout frameLayout3, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull ImageView imageView, @NonNull TextView textView6, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull LinearLayout linearLayout5, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11) {
        this.rootView = checkpointCardV2025ComponentView;
        this.applicationImage = simpleDraweeView;
        this.applicationName = textView;
        this.applicationStroke = frameLayout;
        this.checkpoint = linearLayout;
        this.cta = textView2;
        this.emojiCount = textView3;
        this.emojiImage = simpleDraweeView2;
        this.emojiName = textView4;
        this.emojiStroke = frameLayout2;
        this.footer = constraintLayout;
        this.guildImage = simpleDraweeView3;
        this.guildName = textView5;
        this.guildStroke = frameLayout3;
        this.image = linearLayout2;
        this.imageResource = simpleDraweeView4;
        this.logo = imageView;
        this.messageCount = textView6;
        this.powerBar = linearLayout3;
        this.powerContainer = linearLayout4;
        this.powerLevelLvl = textView7;
        this.powerLevelNumber = textView8;
        this.stats = linearLayout5;
        this.title = textView9;
        this.unicodeEmojiImage = textView10;
        this.voiceMinutes = textView11;
    }

    @NonNull
    public static MessageComponentCheckpointCardV2025ViewBinding bind(@NonNull View view) {
        int i7 = R.id.application_image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.application_name;
            TextView textView = (TextView) a.k(i7, view);
            if (textView != null) {
                i7 = R.id.application_stroke;
                FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
                if (frameLayout != null) {
                    i7 = R.id.checkpoint;
                    LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
                    if (linearLayout != null) {
                        i7 = R.id.cta;
                        TextView textView2 = (TextView) a.k(i7, view);
                        if (textView2 != null) {
                            i7 = R.id.emoji_count;
                            TextView textView3 = (TextView) a.k(i7, view);
                            if (textView3 != null) {
                                i7 = R.id.emoji_image;
                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                                if (simpleDraweeView2 != null) {
                                    i7 = R.id.emoji_name;
                                    TextView textView4 = (TextView) a.k(i7, view);
                                    if (textView4 != null) {
                                        i7 = R.id.emoji_stroke;
                                        FrameLayout frameLayout2 = (FrameLayout) a.k(i7, view);
                                        if (frameLayout2 != null) {
                                            i7 = R.id.footer;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                                            if (constraintLayout != null) {
                                                i7 = R.id.guild_image;
                                                SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                                                if (simpleDraweeView3 != null) {
                                                    i7 = R.id.guild_name;
                                                    TextView textView5 = (TextView) a.k(i7, view);
                                                    if (textView5 != null) {
                                                        i7 = R.id.guild_stroke;
                                                        FrameLayout frameLayout3 = (FrameLayout) a.k(i7, view);
                                                        if (frameLayout3 != null) {
                                                            i7 = R.id.image;
                                                            LinearLayout linearLayout2 = (LinearLayout) a.k(i7, view);
                                                            if (linearLayout2 != null) {
                                                                i7 = R.id.image_resource;
                                                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.k(i7, view);
                                                                if (simpleDraweeView4 != null) {
                                                                    i7 = R.id.logo;
                                                                    ImageView imageView = (ImageView) a.k(i7, view);
                                                                    if (imageView != null) {
                                                                        i7 = R.id.message_count;
                                                                        TextView textView6 = (TextView) a.k(i7, view);
                                                                        if (textView6 != null) {
                                                                            i7 = R.id.power_bar;
                                                                            LinearLayout linearLayout3 = (LinearLayout) a.k(i7, view);
                                                                            if (linearLayout3 != null) {
                                                                                i7 = R.id.power_container;
                                                                                LinearLayout linearLayout4 = (LinearLayout) a.k(i7, view);
                                                                                if (linearLayout4 != null) {
                                                                                    i7 = R.id.power_level_lvl;
                                                                                    TextView textView7 = (TextView) a.k(i7, view);
                                                                                    if (textView7 != null) {
                                                                                        i7 = R.id.power_level_number;
                                                                                        TextView textView8 = (TextView) a.k(i7, view);
                                                                                        if (textView8 != null) {
                                                                                            i7 = R.id.stats;
                                                                                            LinearLayout linearLayout5 = (LinearLayout) a.k(i7, view);
                                                                                            if (linearLayout5 != null) {
                                                                                                i7 = R.id.title;
                                                                                                TextView textView9 = (TextView) a.k(i7, view);
                                                                                                if (textView9 != null) {
                                                                                                    i7 = R.id.unicode_emoji_image;
                                                                                                    TextView textView10 = (TextView) a.k(i7, view);
                                                                                                    if (textView10 != null) {
                                                                                                        i7 = R.id.voice_minutes;
                                                                                                        TextView textView11 = (TextView) a.k(i7, view);
                                                                                                        if (textView11 != null) {
                                                                                                            return new MessageComponentCheckpointCardV2025ViewBinding((CheckpointCardV2025ComponentView) view, simpleDraweeView, textView, frameLayout, linearLayout, textView2, textView3, simpleDraweeView2, textView4, frameLayout2, constraintLayout, simpleDraweeView3, textView5, frameLayout3, linearLayout2, simpleDraweeView4, imageView, textView6, linearLayout3, linearLayout4, textView7, textView8, linearLayout5, textView9, textView10, textView11);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static MessageComponentCheckpointCardV2025ViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MessageComponentCheckpointCardV2025ViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View viewInflate = layoutInflater.inflate(R.layout.message_component_checkpoint_card_v2025_view, viewGroup, false);
        if (z5) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CheckpointCardV2025ComponentView getRoot() {
        return this.rootView;
    }
}
