package com.discord.thumbhash;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@d(c = "com.discord.thumbhash.ThumbhashPlaceholderControllerListener$onSubmit$1$bitmap$1", f = "ThumbhashPlaceholderControllerListener.kt", l = {}, m = "invokeSuspend")
public final class ThumbhashPlaceholderControllerListener$onSubmit$1$bitmap$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    int label;
    final /* synthetic */ ThumbhashPlaceholderControllerListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbhashPlaceholderControllerListener$onSubmit$1$bitmap$1(ThumbhashPlaceholderControllerListener thumbhashPlaceholderControllerListener, Continuation continuation) {
        super(2, continuation);
        this.this$0 = thumbhashPlaceholderControllerListener;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThumbhashPlaceholderControllerListener$onSubmit$1$bitmap$1(this.this$0, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f22354d;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ib.a.L(obj);
        return ThumbhashUtils.thumbHashToRGBA(Base64.decode(this.this$0.placeholder, 0));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ThumbhashPlaceholderControllerListener$onSubmit$1$bitmap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
