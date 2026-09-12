package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.botuikit.ThumbnailDisplayComponent;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.EmbedView;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.components.ThumbnailDisplayComponentView;
import com.discord.chat.presentation.message.view.mosaic_recycler.AttachmentMediaMosaicAdapter;
import com.discord.chat.presentation.message.viewholder.AudioPlayerViewHolder;
import com.discord.emoji_picker.EmojiPickerRow;
import com.discord.emoji_picker.EmojiPickerRowView;
import com.discord.emoji_picker.EmojiPickerViewHolder;
import com.discord.sticker_picker.StickerPickerRow;
import com.discord.sticker_picker.StickerPickerRowView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements View.OnLongClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4169e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4170i;

    public /* synthetic */ s(int i7, Object obj, Object obj2) {
        this.f4168d = i7;
        this.f4169e = obj;
        this.f4170i = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f4168d) {
            case 0:
                return MessageView.setMessage$lambda$13$lambda$12((Function6) this.f4169e, (Message) this.f4170i, view);
            case 1:
                return EmbedView.setProvider$lambda$17$lambda$16$lambda$15((Function1) this.f4169e, (CharSequence) this.f4170i, view);
            case 2:
                return EmbedView.setAuthorOnClickListener$lambda$22$lambda$21((Function1) this.f4169e, (EmbedView) this.f4170i, view);
            case 3:
                return ThumbnailDisplayComponentView.configure$lambda$1((ComponentContext) this.f4169e, (ThumbnailDisplayComponent) this.f4170i, view);
            case 4:
                return AudioPlayerViewHolder.bind$lambda$4$lambda$3$lambda$2((Function2) this.f4169e, (AudioAttachmentMessageAccessory) this.f4170i, view);
            case 5:
                return EmojiPickerRowView.configureRowEmojiViews$lambda$4$lambda$3((EmojiPickerRowView) this.f4169e, (EmojiPickerRow.Emoji) this.f4170i, view);
            case 6:
                return EmojiPickerViewHolder.Emoji._init_$lambda$4((EmojiPickerViewHolder.Emoji) this.f4169e, (Function2) this.f4170i, view);
            case 7:
                return StickerPickerRowView.configureRowStickerViews$lambda$5$lambda$4((StickerPickerRowView) this.f4169e, (StickerPickerRow.Sticker) this.f4170i, view);
            case 8:
                return AttachmentMediaMosaicAdapter.onBindViewHolder$lambda$1((AttachmentMediaMosaicAdapter) this.f4169e, (ImageAttachmentMessageAccessory) this.f4170i, view);
            default:
                return AttachmentMediaMosaicAdapter.onBindViewHolder$lambda$5((AttachmentMediaMosaicAdapter) this.f4169e, (VideoAttachmentMessageAccessory) this.f4170i, view);
        }
    }
}
