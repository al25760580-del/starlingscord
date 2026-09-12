package com.discord.core;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@d(c = "com.discord.core.ThumbnailLoader$loadThumbnail$2$1$1", f = "ThumbnailLoader.kt", l = {118, 118}, m = "invokeSuspend")
@SourceDebugExtension({"SMAP\nThumbnailLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbnailLoader.kt\ncom/discord/core/ThumbnailLoader$loadThumbnail$2$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,112:1\n116#2,11:113\n*S KotlinDebug\n*F\n+ 1 ThumbnailLoader.kt\ncom/discord/core/ThumbnailLoader$loadThumbnail$2$1$1\n*L\n92#1:113,11\n*E\n"})
public final class ThumbnailLoader$loadThumbnail$2$1$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $requestKey;
    final /* synthetic */ Size $size;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ String $uriString;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbnailLoader$loadThumbnail$2$1$1(String str, Size size, Context context, Uri uri, String str2, Continuation continuation) {
        super(2, continuation);
        this.$uriString = str;
        this.$size = size;
        this.$context = context;
        this.$uri = uri;
        this.$requestKey = str2;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThumbnailLoader$loadThumbnail$2$1$1(this.$uriString, this.$size, this.$context, this.$uri, this.$requestKey, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0151, code lost:
    
        if (r2.a(r25) == r4) goto L38;
     */
    @Override // xn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.core.ThumbnailLoader$loadThumbnail$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ThumbnailLoader$loadThumbnail$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
