package com.discord.chat.presentation.message.view;

import android.view.View;
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent;
import com.discord.chat.bridge.botuikit.MediaGalleryItem;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.view.botuikit.components.media_gallery.MediaGalleryDisplayComponentAdapter;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4200e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4201i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4202v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4203w;

    public /* synthetic */ g(int i7, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f4199d = i7;
        this.f4201i = obj;
        this.f4202v = obj2;
        this.f4203w = obj3;
        this.f4200e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4199d) {
            case 0:
                ((AppMessageEmbedView) this.f4201i).handleTap((ChatEventHandler) this.f4202v, (AppMessageEmbedImpl) this.f4203w, (String) this.f4200e);
                break;
            case 1:
                EmbedView.setEmbed_fDtLluY$lambda$5$lambda$4((Function3) this.f4201i, (String) this.f4200e, (String) this.f4202v, (DraweeSpanStringBuilder) this.f4203w, view);
                break;
            case 2:
                MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$0((MediaGalleryDisplayComponentAdapter) this.f4201i, (MediaGalleryDisplayComponent) this.f4202v, (MediaGalleryItem) this.f4203w, (MosaicItemMessageAttachmentImageViewHolder) this.f4200e, view);
                break;
            default:
                MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$5((MediaGalleryDisplayComponentAdapter) this.f4201i, (MediaGalleryDisplayComponent) this.f4202v, (MediaGalleryItem) this.f4203w, (MosaicItemMessageAttachmentVideoViewHolder) this.f4200e, view);
                break;
        }
    }

    public /* synthetic */ g(Function3 function3, String str, String str2, DraweeSpanStringBuilder draweeSpanStringBuilder) {
        this.f4199d = 1;
        this.f4201i = function3;
        this.f4200e = str;
        this.f4202v = str2;
        this.f4203w = draweeSpanStringBuilder;
    }
}
