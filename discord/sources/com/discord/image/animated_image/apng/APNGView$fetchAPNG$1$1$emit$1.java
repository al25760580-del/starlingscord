package com.discord.image.animated_image.apng;

import com.discord.file_downloader.DownloadState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import xn.c;
import xn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@d(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1", f = "APNGView.kt", l = {96, 107, 113}, m = "emit")
public final class APNGView$fetchAPNG$1$1$emit$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ APNGView.AnonymousClass1.C00321<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public APNGView$fetchAPNG$1$1$emit$1(APNGView.AnonymousClass1.C00321<? super T> c00321, Continuation continuation) {
        super(continuation);
        this.this$0 = c00321;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((DownloadState) null, (Continuation) this);
    }
}
