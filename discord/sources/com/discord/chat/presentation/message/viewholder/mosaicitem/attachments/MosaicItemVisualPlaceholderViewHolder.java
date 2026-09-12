package com.discord.chat.presentation.message.viewholder.mosaicitem.attachments;

import androidx.recyclerview.widget.h0;
import com.discord.chat.R;
import com.discord.chat.bridge.botuikit.MediaGalleryItem;
import com.discord.chat.bridge.media.UnfurledMediaLoadingState;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.view.MediaVisualPlaceholderView;
import com.discord.chat.presentation.message.view.VisualPlaceholderState;
import com.discord.chat.presentation.message.viewholder.MediaVisualPlaceholderViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/mosaicitem/attachments/MosaicItemVisualPlaceholderViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MediaVisualPlaceholderViewHolder;", "view", "Lcom/discord/chat/presentation/message/view/MediaVisualPlaceholderView;", "<init>", "(Lcom/discord/chat/presentation/message/view/MediaVisualPlaceholderView;)V", "bindGalleryItem", "", "mediaGalleryItem", "Lcom/discord/chat/bridge/botuikit/MediaGalleryItem;", "isSingleItemMosaic", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MosaicItemVisualPlaceholderViewHolder extends MediaVisualPlaceholderViewHolder {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UnfurledMediaLoadingState.values().length];
            try {
                iArr[UnfurledMediaLoadingState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnfurledMediaLoadingState.LOADED_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MosaicItemVisualPlaceholderViewHolder(@NotNull MediaVisualPlaceholderView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void bindGalleryItem(@NotNull MediaGalleryItem mediaGalleryItem, boolean isSingleItemMosaic) {
        VisualPlaceholderState visualPlaceholderState;
        Intrinsics.checkNotNullParameter(mediaGalleryItem, "mediaGalleryItem");
        int i7 = WhenMappings.$EnumSwitchMapping$0[mediaGalleryItem.getMedia().getLoadingState().ordinal()];
        if (i7 != 1) {
            visualPlaceholderState = i7 != 2 ? VisualPlaceholderState.ERROR : VisualPlaceholderState.NOT_FOUND;
        } else {
            visualPlaceholderState = VisualPlaceholderState.LOADING;
        }
        bind(visualPlaceholderState, h0.DEFAULT_DRAG_ANIMATION_DURATION, h0.DEFAULT_DRAG_ANIMATION_DURATION, this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius), isSingleItemMosaic ? MediaContainingViewResizer.ResizeMode.Fill : MediaContainingViewResizer.ResizeMode.Cover);
    }
}
