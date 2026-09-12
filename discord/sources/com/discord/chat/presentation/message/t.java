package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.bridge.botuikit.ButtonComponent;
import com.discord.chat.bridge.botuikit.CheckpointDataV2025;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.voicechannelbadges.VoiceChannelBadge;
import com.discord.chat.presentation.deserializationerror.DeserializationErrorView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.invitetospeak.InviteToSpeakView;
import com.discord.chat.presentation.message.messagepart.ActivityRichPresenceInviteEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EmbeddedActivityInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory;
import com.discord.chat.presentation.message.system.AutomodSystemMessageView;
import com.discord.chat.presentation.message.view.EphemeralIndicationView;
import com.discord.chat.presentation.message.view.MediaView;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.components.ButtonComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.CheckpointCardV2025ComponentViewKt;
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView;
import com.discord.chat.presentation.message.view.polls.PollAnswerAdapter;
import com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.EmbeddedActivityInviteViewHolder;
import com.discord.chat.presentation.message.viewholder.PostPreviewEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.ThreadEmbedViewHolder;
import com.discord.emoji_picker.EmojiPickerRow;
import com.discord.emoji_picker.EmojiPickerRowView;
import com.discord.emoji_picker.EmojiPickerViewHolder;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import com.discord.sticker_picker.StickerPickerRow;
import com.discord.sticker_picker.StickerPickerRowView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4175e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4176i;

    public /* synthetic */ t(int i7, Object obj, Object obj2) {
        this.f4174d = i7;
        this.f4175e = obj;
        this.f4176i = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4174d) {
            case 0:
                ((ChatEventHandler) this.f4175e).onTapTimestamp((String) this.f4176i);
                break;
            case 1:
                VoiceChannelBadgeView.configureVoiceChannelBadge$lambda$1$lambda$0((ChatEventHandler) this.f4175e, (VoiceChannelBadge) this.f4176i, view);
                break;
            case 2:
                AutomodSystemMessageView.configureAuthor$lambda$8$lambda$7((ChatEventHandler) this.f4175e, (AutoModerationContext) this.f4176i, view);
                break;
            case 3:
                EphemeralIndicationView.setEphemeralIndication_AFFcxXc$lambda$4$lambda$3((Function1) this.f4175e, (EphemeralIndication) this.f4176i, view);
                break;
            case 4:
                MediaView.setOnMediaClickListeners$lambda$12((MediaView) this.f4175e, (View.OnClickListener) this.f4176i, view);
                break;
            case 5:
                ButtonComponentView.configure$lambda$3((ButtonComponent) this.f4175e, (ComponentContext) this.f4176i, view);
                break;
            case 6:
                CheckpointCardV2025ComponentViewKt.applyClickable$lambda$0((ComponentContext) this.f4175e, (CheckpointDataV2025) this.f4176i, view);
                break;
            case 7:
                SelectComponentView.configure$lambda$3((ComponentContext) this.f4175e, (SelectComponent) this.f4176i, view);
                break;
            case 8:
                PollAnswerAdapter.onBindViewHolder$lambda$3$lambda$2((PollAnswerAdapter) this.f4175e, (PollAnswerAccessory) this.f4176i, view);
                break;
            case 9:
                ActivityRichPresenceInviteEmbedViewHolder.bind$lambda$0((Function1) this.f4175e, (ActivityRichPresenceInviteEmbedMessageAccessory) this.f4176i, view);
                break;
            case 10:
                EmbeddedActivityInviteViewHolder.bind$lambda$2$lambda$1((EmbeddedActivityInviteViewHolder) this.f4175e, (EmbeddedActivityInviteMessageAccessory) this.f4176i, view);
                break;
            case 11:
                PostPreviewEmbedViewHolder.bind$lambda$0((Function4) this.f4175e, (PostPreviewEmbed) this.f4176i, view);
                break;
            case 12:
                ThreadEmbedViewHolder.bind$lambda$2$lambda$0((Function1) this.f4175e, (ThreadEmbedMessageAccessory) this.f4176i, view);
                break;
            case 13:
                EmojiPickerRowView.configureRowEmojiViews$lambda$4$lambda$2((EmojiPickerRowView) this.f4175e, (EmojiPickerRow.Emoji) this.f4176i, view);
                break;
            case 14:
                EmojiPickerViewHolder.Emoji._init_$lambda$2((EmojiPickerViewHolder.Emoji) this.f4175e, (Function2) this.f4176i, view);
                break;
            case 15:
                MobileVoiceOverlay.voiceBubbleProvider$lambda$9$lambda$4((OverlayVoiceBubble) this.f4175e, (MobileVoiceOverlay) this.f4176i, view);
                break;
            case 16:
                StickerPickerRowView.configureRowStickerViews$lambda$5$lambda$3((StickerPickerRowView) this.f4175e, (StickerPickerRow.Sticker) this.f4176i, view);
                break;
            case 17:
                DeserializationErrorView.configure$lambda$0((DeserializationErrorView) this.f4175e, (String) this.f4176i, view);
                break;
            default:
                InviteToSpeakView.setProps$lambda$1((Function1) this.f4175e, (Message) this.f4176i, view);
                break;
        }
    }
}
