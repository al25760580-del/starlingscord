package app.rive;

import app.rive.Asset;
import app.rive.core.CommandQueue;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004J!\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH&¢\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u00028\u00002\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\u00162\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0017J)\u0010\u0018\u001a\u00020\u00162\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001b\u001a\u00020\u00162\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lapp/rive/AssetOps;", "H", "A", "Lapp/rive/Asset;", "", "label", "", "getLabel", "()Ljava/lang/String;", "tag", "getTag", "construct", "handle", "worker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "(Ljava/lang/Object;Lapp/rive/core/CommandQueue;)Lapp/rive/Asset;", "decode", "bytes", "", "(Lapp/rive/core/CommandQueue;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "(Lapp/rive/core/CommandQueue;Ljava/lang/Object;)V", "register", "key", "(Lapp/rive/core/CommandQueue;Ljava/lang/String;Ljava/lang/Object;)V", "unregister", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AssetOps<H, A extends Asset<H>> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <H, A extends Asset<H>> void register(@NotNull AssetOps<H, A> assetOps, @NotNull CommandQueue worker, @NotNull String key, H h6) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            Intrinsics.checkNotNullParameter(key, "key");
        }

        public static <H, A extends Asset<H>> void unregister(@NotNull AssetOps<H, A> assetOps, @NotNull CommandQueue worker, @NotNull String key) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            Intrinsics.checkNotNullParameter(key, "key");
        }
    }

    @NotNull
    A construct(H handle, @NotNull CommandQueue worker);

    Object decode(@NotNull CommandQueue commandQueue, @NotNull byte[] bArr, @NotNull Continuation continuation);

    void delete(@NotNull CommandQueue worker, H handle);

    @NotNull
    String getLabel();

    @NotNull
    String getTag();

    void register(@NotNull CommandQueue worker, @NotNull String key, H handle);

    void unregister(@NotNull CommandQueue worker, @NotNull String key);
}
