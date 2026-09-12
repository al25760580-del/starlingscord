package com.discord.chat.presentation.message;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.botuikit.ContentInventoryEntry;
import com.discord.chat.bridge.botuikit.ThumbnailDisplayComponent;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.bridge.roleicons.RoleIcon;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.EmbedView;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.components.ContentInventoryComponentViewKt;
import com.discord.chat.presentation.message.view.botuikit.components.ThumbnailDisplayComponentView;
import com.discord.chat.presentation.message.view.mosaic_recycler.AttachmentMediaMosaicAdapter;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder;
import com.discord.chat.presentation.stickers.WelcomeStickerView;
import com.discord.emoji.RenderableEmoji;
import com.facebook.react.devsupport.ChangeBundleLocationDialog;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4122e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4123i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4124v;

    public /* synthetic */ d(ComponentContext componentContext, ContentInventoryEntry contentInventoryEntry, String str) {
        this.f4121d = 4;
        this.f4122e = componentContext;
        this.f4124v = contentInventoryEntry;
        this.f4123i = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4121d) {
            case 0:
                ((ChatEventHandler) this.f4122e).onTapGameIcon((String) this.f4123i, (String) this.f4124v);
                break;
            case 1:
                MessageViewReplyPreview.configureExecutedCommand_dB0_bEw$lambda$12((ChatEventHandler) this.f4122e, (String) this.f4123i, (ExecutedCommand) this.f4124v, view);
                break;
            case 2:
                RoleIconView.configureRoleIcon$lambda$3$lambda$2((ChatEventHandler) this.f4122e, (RoleIcon) this.f4123i, (RenderableEmoji) this.f4124v, view);
                break;
            case 3:
                EmbedView.setEmbed_fDtLluY$lambda$8$lambda$7((Function3) this.f4122e, (String) this.f4123i, (Embed) this.f4124v, view);
                break;
            case 4:
                ContentInventoryComponentViewKt.applyClickable$lambda$0((ComponentContext) this.f4122e, (ContentInventoryEntry) this.f4124v, (String) this.f4123i, view);
                break;
            case 5:
                ThumbnailDisplayComponentView.configure$lambda$0((ComponentContext) this.f4122e, (ThumbnailDisplayComponentView) this.f4123i, (ThumbnailDisplayComponent) this.f4124v, view);
                break;
            case 6:
                ChangeBundleLocationDialog.show$lambda$2((ChangeBundleLocationDialog.ChangeBundleLocationDialogListener) this.f4122e, (EditText) this.f4123i, (AlertDialog) this.f4124v, view);
                break;
            case 7:
                AttachmentMediaMosaicAdapter.onBindViewHolder$lambda$0((AttachmentMediaMosaicAdapter) this.f4122e, (ImageAttachmentMessageAccessory) this.f4123i, (MosaicItemMessageAttachmentImageViewHolder) this.f4124v, view);
                break;
            case 8:
                AttachmentMediaMosaicAdapter.onBindViewHolder$lambda$4((AttachmentMediaMosaicAdapter) this.f4122e, (VideoAttachmentMessageAccessory) this.f4123i, (MosaicItemMessageAttachmentVideoViewHolder) this.f4124v, view);
                break;
            default:
                WelcomeStickerView.setSticker$lambda$1((Function2) this.f4122e, (Sticker) this.f4123i, (Message) this.f4124v, view);
                break;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i7) {
        this.f4121d = i7;
        this.f4122e = obj;
        this.f4123i = obj2;
        this.f4124v = obj3;
    }
}
