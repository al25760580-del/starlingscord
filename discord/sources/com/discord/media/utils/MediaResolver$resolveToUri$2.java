package com.discord.media.utils;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@d(c = "com.discord.media.utils.MediaResolver$resolveToUri$2", f = "MediaResolver.kt", l = {64, 67, 70, 71}, m = "invokeSuspend")
public final class MediaResolver$resolveToUri$2 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ boolean $allowOptimization;
    final /* synthetic */ EncodingConfig $encodingConfig;
    final /* synthetic */ int $imageCompressionQuality;
    final /* synthetic */ Uri $inputUri;
    final /* synthetic */ boolean $isLowQuality;
    final /* synthetic */ boolean $skipVideoTranscode;
    final /* synthetic */ boolean $useOriginalIfSmaller;
    int label;
    final /* synthetic */ MediaResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$resolveToUri$2(MediaResolver mediaResolver, Uri uri, boolean z5, EncodingConfig encodingConfig, int i7, boolean z6, boolean z7, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mediaResolver;
        this.$inputUri = uri;
        this.$skipVideoTranscode = z5;
        this.$encodingConfig = encodingConfig;
        this.$imageCompressionQuality = i7;
        this.$isLowQuality = z6;
        this.$useOriginalIfSmaller = z7;
        this.$allowOptimization = z10;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new MediaResolver$resolveToUri$2(this.this$0, this.$inputUri, this.$skipVideoTranscode, this.$encodingConfig, this.$imageCompressionQuality, this.$isLowQuality, this.$useOriginalIfSmaller, this.$allowOptimization, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r12 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r12 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (r12 == r0) goto L33;
     */
    @Override // xn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            wn.a r0 = wn.a.f22354d
            int r1 = r11.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            ib.a.L(r12)
            goto L98
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            ib.a.L(r12)
            r4 = r11
            goto L83
        L24:
            ib.a.L(r12)
            goto L5b
        L28:
            ib.a.L(r12)
            goto L3a
        L2c:
            ib.a.L(r12)
            com.discord.media.utils.MediaResolver r12 = r11.this$0
            r11.label = r5
            java.lang.Object r12 = com.discord.media.utils.MediaResolver.access$checkFreeSpace(r12, r11)
            if (r12 != r0) goto L3a
            goto L97
        L3a:
            com.discord.media.utils.ContentResolverUtils r12 = com.discord.media.utils.ContentResolverUtils.INSTANCE
            com.discord.media.utils.MediaResolver r1 = r11.this$0
            android.content.ContentResolver r1 = com.discord.media.utils.MediaResolver.access$getResolver(r1)
            android.net.Uri r5 = r11.$inputUri
            boolean r1 = r12.isVideo(r1, r5)
            if (r1 == 0) goto L5e
            com.discord.media.utils.MediaResolver r12 = r11.this$0
            android.net.Uri r1 = r11.$inputUri
            boolean r2 = r11.$skipVideoTranscode
            com.discord.media.utils.EncodingConfig r3 = r11.$encodingConfig
            r11.label = r4
            java.lang.Object r12 = com.discord.media.utils.MediaResolver.access$handleVideo(r12, r1, r2, r3, r11)
            if (r12 != r0) goto L5b
            goto L97
        L5b:
            android.net.Uri r12 = (android.net.Uri) r12
            return r12
        L5e:
            com.discord.media.utils.MediaResolver r1 = r11.this$0
            android.content.ContentResolver r1 = com.discord.media.utils.MediaResolver.access$getResolver(r1)
            android.net.Uri r4 = r11.$inputUri
            boolean r12 = r12.isImage(r1, r4)
            if (r12 == 0) goto L86
            com.discord.media.utils.MediaResolver r4 = r11.this$0
            android.net.Uri r5 = r11.$inputUri
            int r6 = r11.$imageCompressionQuality
            boolean r7 = r11.$isLowQuality
            boolean r8 = r11.$useOriginalIfSmaller
            boolean r9 = r11.$allowOptimization
            r11.label = r3
            r10 = r11
            java.lang.Object r12 = com.discord.media.utils.MediaResolver.access$handleImage(r4, r5, r6, r7, r8, r9, r10)
            r4 = r10
            if (r12 != r0) goto L83
            goto L97
        L83:
            android.net.Uri r12 = (android.net.Uri) r12
            return r12
        L86:
            r4 = r11
            com.discord.media.utils.MediaResolver r1 = r4.this$0
            r12 = r2
            android.net.Uri r2 = r4.$inputUri
            r4.label = r12
            r3 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r12 = com.discord.media.utils.MediaResolver.copyToFile$default(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L98
        L97:
            return r0
        L98:
            android.net.Uri r12 = (android.net.Uri) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media.utils.MediaResolver$resolveToUri$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MediaResolver$resolveToUri$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
