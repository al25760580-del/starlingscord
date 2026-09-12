package app.rive;

import app.rive.Asset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import xn.c;
import xn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@d(c = "app.rive.Asset$Companion", f = "Assets.kt", l = {77}, m = "fromBytes$kotlin_release")
public final class Asset$Companion$fromBytes$1<H, A extends Asset<H>> extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Asset.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Asset$Companion$fromBytes$1(Asset.Companion companion, Continuation continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // xn.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fromBytes$kotlin_release(null, null, null, this);
    }
}
