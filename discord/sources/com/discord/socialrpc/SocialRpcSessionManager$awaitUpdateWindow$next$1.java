package com.discord.socialrpc;

import cr.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@d(c = "com.discord.socialrpc.SocialRpcSessionManager$awaitUpdateWindow$next$1", f = "SocialRpcSessionManager.kt", l = {185}, m = "invokeSuspend")
public final class SocialRpcSessionManager$awaitUpdateWindow$next$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ SocialRpcSessionManager.Connection $connection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialRpcSessionManager$awaitUpdateWindow$next$1(SocialRpcSessionManager.Connection connection, Continuation continuation) {
        super(2, continuation);
        this.$connection = connection;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new SocialRpcSessionManager$awaitUpdateWindow$next$1(this.$connection, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        Object objG;
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        if (i7 == 0) {
            ib.a.L(obj);
            Channel channel = this.$connection.getChannel();
            this.label = 1;
            objG = channel.g(this);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            objG = ((n) obj).f7386a;
        }
        return n.a(objG);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SocialRpcSessionManager$awaitUpdateWindow$next$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
