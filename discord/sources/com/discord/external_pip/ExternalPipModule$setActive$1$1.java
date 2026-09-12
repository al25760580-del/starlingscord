package com.discord.external_pip;

import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ExternalPipModule$setActive$1$1 implements Function1<Result, Unit> {
    final /* synthetic */ Promise $onResultPromise;
    final /* synthetic */ ExternalPipModule this$0;

    public ExternalPipModule$setActive$1$1(ExternalPipModule externalPipModule, Promise promise) {
        this.this$0 = externalPipModule;
        this.$onResultPromise = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Object invoke(Object obj) {
        m944invoke(((Result) obj).f14615d);
        return Unit.f14616a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m944invoke(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            this.$onResultPromise.reject(thA);
        } else {
            this.$onResultPromise.resolve(Boolean.TRUE);
        }
    }
}
