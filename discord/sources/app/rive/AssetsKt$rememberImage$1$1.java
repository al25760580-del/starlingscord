package app.rive;

import app.rive.core.CommandQueue;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class AssetsKt$rememberImage$1$1 extends FunctionReferenceImpl implements Function3 {
    public AssetsKt$rememberImage$1$1(Object obj) {
        super(3, obj, ImageAsset.Companion.class, "fromBytes", "fromBytes(Lapp/rive/core/CommandQueue;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(@NotNull CommandQueue commandQueue, @NotNull byte[] bArr, @NotNull Continuation continuation) {
        return ((ImageAsset.Companion) this.receiver).fromBytes(commandQueue, bArr, continuation);
    }
}
