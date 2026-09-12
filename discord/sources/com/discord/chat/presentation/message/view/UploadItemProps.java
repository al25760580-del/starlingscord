package com.discord.chat.presentation.message.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/view/UploadItemProps;", "", "uploadProgress", "", "uploadContext", "Lcom/discord/chat/presentation/message/view/UploadContext;", "uploadOpacity", "", "onCancelUploadItem", "Lkotlin/Function0;", "", "<init>", "(ILcom/discord/chat/presentation/message/view/UploadContext;FLkotlin/jvm/functions/Function0;)V", "getUploadProgress", "()I", "getUploadContext", "()Lcom/discord/chat/presentation/message/view/UploadContext;", "getUploadOpacity", "()F", "getOnCancelUploadItem", "()Lkotlin/jvm/functions/Function0;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadItemProps {

    @NotNull
    private final Function0<Unit> onCancelUploadItem;

    @NotNull
    private final UploadContext uploadContext;
    private final float uploadOpacity;
    private final int uploadProgress;

    public UploadItemProps(int i7, @NotNull UploadContext uploadContext, float f2, @NotNull Function0<Unit> onCancelUploadItem) {
        Intrinsics.checkNotNullParameter(uploadContext, "uploadContext");
        Intrinsics.checkNotNullParameter(onCancelUploadItem, "onCancelUploadItem");
        this.uploadProgress = i7;
        this.uploadContext = uploadContext;
        this.uploadOpacity = f2;
        this.onCancelUploadItem = onCancelUploadItem;
    }

    @NotNull
    public final Function0<Unit> getOnCancelUploadItem() {
        return this.onCancelUploadItem;
    }

    @NotNull
    public final UploadContext getUploadContext() {
        return this.uploadContext;
    }

    public final float getUploadOpacity() {
        return this.uploadOpacity;
    }

    public final int getUploadProgress() {
        return this.uploadProgress;
    }
}
