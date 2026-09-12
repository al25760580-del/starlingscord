package com.discord.avatar.react;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@d(c = "com.discord.avatar.react.APNGPreloadModule$getOrStartDownload$1$1", f = "APNGPreloadModule.kt", l = {50}, m = "invokeSuspend")
public final class APNGPreloadModule$getOrStartDownload$1$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ APNGPreloadModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APNGPreloadModule$getOrStartDownload$1$1(APNGPreloadModule aPNGPreloadModule, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aPNGPreloadModule;
        this.$url = str;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new APNGPreloadModule$getOrStartDownload$1$1(this.this$0, this.$url, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ib.a.L(obj);
                APNGPreloadModule aPNGPreloadModule = this.this$0;
                String str = this.$url;
                this.label = 1;
                if (aPNGPreloadModule.downloadAPNG(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            this.this$0.inFlightDownloads.remove(this.$url);
            return Unit.f14616a;
        } catch (Throwable th2) {
            this.this$0.inFlightDownloads.remove(this.$url);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((APNGPreloadModule$getOrStartDownload$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
