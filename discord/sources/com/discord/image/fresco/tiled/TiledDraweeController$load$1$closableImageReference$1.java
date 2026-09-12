package com.discord.image.fresco.tiled;

import com.facebook.datasource.DataSource;
import f4.n;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import l1.c;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0002\b\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/facebook/common/references/CloseableReference;", "Lna/c;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/facebook/common/references/CloseableReference;"}, k = 3, mv = {2, 1, 0})
@d(c = "com.discord.image.fresco.tiled.TiledDraweeController$load$1$closableImageReference$1", f = "TiledDraweeController.kt", l = {}, m = "invokeSuspend")
public final class TiledDraweeController$load$1$closableImageReference$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ DataSource $dataSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TiledDraweeController$load$1$closableImageReference$1(DataSource dataSource, Continuation continuation) {
        super(2, continuation);
        this.$dataSource = dataSource;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new TiledDraweeController$load$1$closableImageReference$1(this.$dataSource, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f22354d;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ib.a.L(obj);
        DataSource dataSource = this.$dataSource;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c cVar = new c(3);
        c cVar2 = new c(3);
        dataSource.d(new x8.c(cVar, countDownLatch, cVar2), new n(4));
        countDownLatch.await();
        Object obj2 = cVar2.f14815a;
        if (obj2 == null) {
            return cVar.f14815a;
        }
        throw ((Throwable) obj2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TiledDraweeController$load$1$closableImageReference$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
