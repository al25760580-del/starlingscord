package com.discord.chat.presentation.message.view.mosaic_recycler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.u;
import c6.a;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.d;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.s;
import com.discord.chat.presentation.message.view.MediaImageView;
import com.discord.chat.presentation.message.view.MediaVideoView;
import com.discord.chat.presentation.message.view.mosaic_recycler.AttachmentMediaMosaicAdapter;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder;
import com.discord.recycler_view.utils.ItemDiffer;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010-R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010.R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u0006008\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/discord/chat/presentation/message/view/mosaic_recycler/AttachmentMediaMosaicAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "", "onItemClicked", "Lkotlin/Function1;", "onItemLongClicked", "onItemSpoilerClicked", "", "onItemObscureToggle", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", AlertFragment.ARG_ITEMS, "shouldAutoPlayGifs", "setMediaItems", "(Ljava/util/List;Z)V", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "setChatEventHandler", "(Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "", "constrainedWidth", "setConstrainedWidth", "(I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "holder", ViewProps.POSITION, "onBindViewHolder", "(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Z", "I", "", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AttachmentMediaMosaicAdapter extends RecyclerView.Adapter {
    private int constrainedWidth;

    @NotNull
    private final Context context;
    private ChatEventHandler eventHandler;

    @NotNull
    private final List<MessageAttachmentAccessory> items;

    @NotNull
    private final Function2<MessageAttachmentAccessory, MessagePartViewHolder, Unit> onItemClicked;
    private final Function1<MessageAttachmentAccessory, Unit> onItemLongClicked;

    @NotNull
    private final Function1<Boolean, Unit> onItemObscureToggle;

    @NotNull
    private final Function1<MessageAttachmentAccessory, Unit> onItemSpoilerClicked;
    private boolean shouldAutoPlayGifs;

    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentMediaMosaicAdapter(@NotNull Context context, @NotNull Function2<? super MessageAttachmentAccessory, ? super MessagePartViewHolder, Unit> onItemClicked, Function1<? super MessageAttachmentAccessory, Unit> function1, @NotNull Function1<? super MessageAttachmentAccessory, Unit> onItemSpoilerClicked, @NotNull Function1<? super Boolean, Unit> onItemObscureToggle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Intrinsics.checkNotNullParameter(onItemSpoilerClicked, "onItemSpoilerClicked");
        Intrinsics.checkNotNullParameter(onItemObscureToggle, "onItemObscureToggle");
        this.context = context;
        this.onItemClicked = onItemClicked;
        this.onItemLongClicked = function1;
        this.onItemSpoilerClicked = onItemSpoilerClicked;
        this.onItemObscureToggle = onItemObscureToggle;
        this.items = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AttachmentMediaMosaicAdapter attachmentMediaMosaicAdapter, ImageAttachmentMessageAccessory imageAttachmentMessageAccessory, MessagePartViewHolder messagePartViewHolder, View view) {
        attachmentMediaMosaicAdapter.onItemClicked.invoke(imageAttachmentMessageAccessory, messagePartViewHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$1(AttachmentMediaMosaicAdapter attachmentMediaMosaicAdapter, ImageAttachmentMessageAccessory imageAttachmentMessageAccessory, View view) {
        Function1<MessageAttachmentAccessory, Unit> function1 = attachmentMediaMosaicAdapter.onItemLongClicked;
        if (function1 == null) {
            return false;
        }
        function1.invoke(imageAttachmentMessageAccessory);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2(AttachmentMediaMosaicAdapter attachmentMediaMosaicAdapter, ImageAttachmentMessageAccessory imageAttachmentMessageAccessory) {
        attachmentMediaMosaicAdapter.onItemSpoilerClicked.invoke(imageAttachmentMessageAccessory);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$3(AttachmentMediaMosaicAdapter attachmentMediaMosaicAdapter, boolean z5) {
        attachmentMediaMosaicAdapter.onItemObscureToggle.invoke(Boolean.valueOf(z5));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(AttachmentMediaMosaicAdapter attachmentMediaMosaicAdapter, VideoAttachmentMessageAccessory videoAttachmentMessageAccessory, MessagePartViewHolder messagePartViewHolder, View view) {
        attachmentMediaMosaicAdapter.onItemClicked.invoke(videoAttachmentMessageAccessory, messagePartViewHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$5(AttachmentMediaMosaicAdapter attachmentMediaMosaicAdapter, VideoAttachmentMessageAccessory videoAttachmentMessageAccessory, View view) {
        Function1<MessageAttachmentAccessory, Unit> function1 = attachmentMediaMosaicAdapter.onItemLongClicked;
        if (function1 == null) {
            return false;
        }
        function1.invoke(videoAttachmentMessageAccessory);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6(AttachmentMediaMosaicAdapter attachmentMediaMosaicAdapter, VideoAttachmentMessageAccessory videoAttachmentMessageAccessory) {
        attachmentMediaMosaicAdapter.onItemSpoilerClicked.invoke(videoAttachmentMessageAccessory);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$7(AttachmentMediaMosaicAdapter attachmentMediaMosaicAdapter, boolean z5) {
        attachmentMediaMosaicAdapter.onItemObscureToggle.invoke(Boolean.valueOf(z5));
        return Unit.f14616a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        MessageAttachmentAccessory messageAttachmentAccessory = this.items.get(position);
        if (messageAttachmentAccessory instanceof ImageAttachmentMessageAccessory) {
            return 49;
        }
        if (messageAttachmentAccessory instanceof VideoAttachmentMessageAccessory) {
            return 50;
        }
        throw new IllegalStateException(("Invalid accessory type: " + position).toString());
    }

    @NotNull
    public final List<MessageAttachmentAccessory> getItems() {
        return this.items;
    }

    public final void setChatEventHandler(@NotNull ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.eventHandler = eventHandler;
    }

    public final void setConstrainedWidth(int constrainedWidth) {
        this.constrainedWidth = constrainedWidth;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setMediaItems(@NotNull List<? extends MessageAttachmentAccessory> items, boolean shouldAutoPlayGifs) {
        Intrinsics.checkNotNullParameter(items, "items");
        u uVarA = c.a(new ItemDiffer(this.items, items), false);
        Intrinsics.checkNotNullExpressionValue(uVarA, "calculateDiff(...)");
        this.items.clear();
        this.items.addAll(items);
        if (this.shouldAutoPlayGifs == shouldAutoPlayGifs) {
            uVarA.a(new b(this));
        } else {
            this.shouldAutoPlayGifs = shouldAutoPlayGifs;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MessagePartViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ChatEventHandler chatEventHandler = this.eventHandler;
        if (chatEventHandler == null) {
            return;
        }
        if (holder instanceof MosaicItemMessageAttachmentImageViewHolder) {
            MessageAttachmentAccessory messageAttachmentAccessory = this.items.get(position);
            Intrinsics.checkNotNull(messageAttachmentAccessory, "null cannot be cast to non-null type com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory");
            ImageAttachmentMessageAccessory imageAttachmentMessageAccessory = (ImageAttachmentMessageAccessory) messageAttachmentAccessory;
            MosaicItemMessageAttachmentImageViewHolder mosaicItemMessageAttachmentImageViewHolder = (MosaicItemMessageAttachmentImageViewHolder) holder;
            final int i7 = 0;
            mosaicItemMessageAttachmentImageViewHolder.bindAttachment(chatEventHandler, imageAttachmentMessageAccessory, getItemCount() == 1, new d(this, imageAttachmentMessageAccessory, mosaicItemMessageAttachmentImageViewHolder, 7), new s(8, this, imageAttachmentMessageAccessory), new a(26, this, imageAttachmentMessageAccessory), new Function1(this) { // from class: k6.a

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ AttachmentMediaMosaicAdapter f14309e;

                {
                    this.f14309e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i10 = i7;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    switch (i10) {
                        case 0:
                            return AttachmentMediaMosaicAdapter.onBindViewHolder$lambda$3(this.f14309e, zBooleanValue);
                        default:
                            return AttachmentMediaMosaicAdapter.onBindViewHolder$lambda$7(this.f14309e, zBooleanValue);
                    }
                }
            }, this.shouldAutoPlayGifs);
            return;
        }
        if (!(holder instanceof MosaicItemMessageAttachmentVideoViewHolder)) {
            throw new IllegalStateException(("Invalid view holder type " + holder.getClass()).toString());
        }
        MessageAttachmentAccessory messageAttachmentAccessory2 = this.items.get(position);
        Intrinsics.checkNotNull(messageAttachmentAccessory2, "null cannot be cast to non-null type com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory");
        VideoAttachmentMessageAccessory videoAttachmentMessageAccessory = (VideoAttachmentMessageAccessory) messageAttachmentAccessory2;
        MosaicItemMessageAttachmentVideoViewHolder mosaicItemMessageAttachmentVideoViewHolder = (MosaicItemMessageAttachmentVideoViewHolder) holder;
        final int i10 = 1;
        mosaicItemMessageAttachmentVideoViewHolder.bindAttachment(chatEventHandler, videoAttachmentMessageAccessory, getItemCount() == 1, new d(this, videoAttachmentMessageAccessory, mosaicItemMessageAttachmentVideoViewHolder, 8), new s(9, this, videoAttachmentMessageAccessory), new a(27, this, videoAttachmentMessageAccessory), new Function1(this) { // from class: k6.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AttachmentMediaMosaicAdapter f14309e;

            {
                this.f14309e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i11 = i10;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i11) {
                    case 0:
                        return AttachmentMediaMosaicAdapter.onBindViewHolder$lambda$3(this.f14309e, zBooleanValue);
                    default:
                        return AttachmentMediaMosaicAdapter.onBindViewHolder$lambda$7(this.f14309e, zBooleanValue);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MessagePartViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i7 = 2;
        AttributeSet attributeSet = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (viewType == 49) {
            return new MosaicItemMessageAttachmentImageViewHolder(new MediaImageView(this.context, objArr2 == true ? 1 : 0, i7, objArr == true ? 1 : 0));
        }
        if (viewType == 50) {
            return new MosaicItemMessageAttachmentVideoViewHolder(new MediaVideoView(this.context, attributeSet, i7, objArr3 == true ? 1 : 0));
        }
        throw new IllegalStateException(("Invalid accessory type: " + viewType).toString());
    }
}
