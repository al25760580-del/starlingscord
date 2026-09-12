package com.discord.sounds.utils;

import com.discord.file_downloader.DownloadState;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import xn.c;
import xn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@d(c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1", f = "SoundExtensions.kt", l = {ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER, 61, 68}, m = "emit")
public final class SoundExtensionsKt$fetchSound$1$1$emit$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SoundExtensionsKt.AnonymousClass1.C00421<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SoundExtensionsKt$fetchSound$1$1$emit$1(SoundExtensionsKt.AnonymousClass1.C00421<? super T> c00421, Continuation continuation) {
        super(continuation);
        this.this$0 = c00421;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((DownloadState) null, (Continuation) this);
    }
}
