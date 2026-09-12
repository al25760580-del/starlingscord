package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.view.MediaVisualPlaceholderView;
import com.discord.chat.presentation.message.view.VisualPlaceholderState;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/MediaVisualPlaceholderViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "view", "Lcom/discord/chat/presentation/message/view/MediaVisualPlaceholderView;", "<init>", "(Lcom/discord/chat/presentation/message/view/MediaVisualPlaceholderView;)V", "bind", "", "state", "Lcom/discord/chat/presentation/message/view/VisualPlaceholderState;", "width", "", "height", "radiusPx", ViewProps.RESIZE_MODE, "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MediaVisualPlaceholderViewHolder extends MessagePartViewHolder {

    @NotNull
    private final MediaVisualPlaceholderView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaVisualPlaceholderViewHolder(@NotNull MediaVisualPlaceholderView view) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull VisualPlaceholderState state, int width, int height, int radiusPx, @NotNull MediaContainingViewResizer.ResizeMode resizeMode) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
        this.view.setContent(state, width, height, resizeMode, radiusPx);
    }
}
