package app.rive;

import a3.e;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0015B7\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0001J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lapp/rive/Asset;", "H", "Ljava/lang/AutoCloseable;", "handle", "riveWorker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "ops", "Lapp/rive/AssetOps;", "(Ljava/lang/Object;Lapp/rive/core/CommandQueue;Lapp/rive/AssetOps;)V", "getHandle", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getRiveWorker", "()Lapp/rive/core/CommandQueue;", "close", "", "register", "key", "", "unregister", "Companion", "Lapp/rive/AudioAsset;", "Lapp/rive/FontAsset;", "Lapp/rive/ImageAsset;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAssets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Assets.kt\napp/rive/Asset\n+ 2 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,432:1\n57#2:433\n57#2:434\n*S KotlinDebug\n*F\n+ 1 Assets.kt\napp/rive/Asset\n*L\n101#1:433\n112#1:434\n*E\n"})
public abstract class Asset<H> implements AutoCloseable {
    private final /* synthetic */ CloseOnce $$delegate_0;
    private final H handle;

    @NotNull
    private final AssetOps<H, ? extends Asset<H>> ops;

    @NotNull
    private final CommandQueue riveWorker;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0006\"\u000e\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00060\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00050\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lapp/rive/Asset$Companion;", "", "()V", "fromBytes", "Lapp/rive/Result;", "A", "H", "Lapp/rive/Asset;", "ops", "Lapp/rive/AssetOps;", "riveWorker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "bytes", "", "fromBytes$kotlin_release", "(Lapp/rive/AssetOps;Lapp/rive/core/CommandQueue;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAssets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Assets.kt\napp/rive/Asset$Companion\n+ 2 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,432:1\n57#2:433\n57#2:434\n70#2:435\n*S KotlinDebug\n*F\n+ 1 Assets.kt\napp/rive/Asset$Companion\n*L\n74#1:433\n80#1:434\n84#1:435\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [app.rive.AssetOps, app.rive.AssetOps<H, A extends app.rive.Asset<H>>, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v1, types: [app.rive.AssetOps] */
        /* JADX WARN: Type inference failed for: r6v11, types: [app.rive.AssetOps] */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v4, types: [app.rive.AssetOps] */
        /* JADX WARN: Type inference failed for: r6v6, types: [app.rive.AssetOps] */
        public final <H, A extends Asset<H>> Object fromBytes$kotlin_release(@NotNull final AssetOps<H, A> assetOps, @NotNull CommandQueue commandQueue, @NotNull byte[] bArr, @NotNull Continuation continuation) {
            Asset$Companion$fromBytes$1 asset$Companion$fromBytes$1;
            if (continuation instanceof Asset$Companion$fromBytes$1) {
                asset$Companion$fromBytes$1 = (Asset$Companion$fromBytes$1) continuation;
                int i7 = asset$Companion$fromBytes$1.label;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    asset$Companion$fromBytes$1.label = i7 - Integer.MIN_VALUE;
                } else {
                    asset$Companion$fromBytes$1 = new Asset$Companion$fromBytes$1(this, continuation);
                }
            } else {
                asset$Companion$fromBytes$1 = new Asset$Companion$fromBytes$1(this, continuation);
            }
            Object objDecode = asset$Companion$fromBytes$1.result;
            wn.a aVar = wn.a.f22354d;
            int i10 = asset$Companion$fromBytes$1.label;
            try {
                if (i10 == 0) {
                    ib.a.L(objDecode);
                    RiveLog.INSTANCE.getLogger().d(assetOps.getTag(), new Function0<String>() { // from class: app.rive.Asset$Companion$fromBytes$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return e.l("Decoding ", assetOps.getLabel());
                        }
                    });
                    commandQueue.acquire(assetOps.getTag());
                    asset$Companion$fromBytes$1.L$0 = assetOps;
                    asset$Companion$fromBytes$1.L$1 = commandQueue;
                    asset$Companion$fromBytes$1.label = 1;
                    objDecode = assetOps.decode(commandQueue, bArr, asset$Companion$fromBytes$1);
                    assetOps = assetOps;
                    if (objDecode == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    commandQueue = (CommandQueue) asset$Companion$fromBytes$1.L$1;
                    boolean z5 = (AssetOps<H, A>) ((AssetOps) asset$Companion$fromBytes$1.L$0);
                    ib.a.L(objDecode);
                    assetOps = z5;
                }
                return new Result.Success(((AssetOps) assetOps).construct(objDecode, commandQueue));
            } catch (CancellationException e10) {
                RiveLog.INSTANCE.getLogger().d(assetOps.getTag(), new Function0<String>() { // from class: app.rive.Asset$Companion$fromBytes$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return g.e("Decoding ", assetOps.getLabel(), " was cancelled.");
                    }
                });
                commandQueue.release(assetOps.getTag(), "Cancellation");
                throw e10;
            } catch (Exception e11) {
                RiveLog.INSTANCE.getLogger().e(assetOps.getTag(), e11, new Function0<String>() { // from class: app.rive.Asset$Companion$fromBytes$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return g.e("Failed to decode ", assetOps.getLabel(), ".");
                    }
                });
                commandQueue.release(assetOps.getTag(), "Decode error");
                return new Result.Error(e11);
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ Asset(Object obj, CommandQueue commandQueue, AssetOps assetOps, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, commandQueue, assetOps);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.$$delegate_0.close();
    }

    public final H getHandle() {
        return this.handle;
    }

    @NotNull
    public final CommandQueue getRiveWorker() {
        return this.riveWorker;
    }

    public final void register(@NotNull final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        RiveLog.INSTANCE.getLogger().d(this.ops.getTag(), new Function0<String>(this) { // from class: app.rive.Asset.register.1
            final /* synthetic */ Asset<H> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                String label = ((Asset) this.this$0).ops.getLabel();
                String str = key;
                H handle = this.this$0.getHandle();
                StringBuilder sbU = e.u("Registering ", label, " with key: ", str, " and handle: ");
                sbU.append(handle);
                return sbU.toString();
            }
        });
        this.ops.register(this.riveWorker, key, this.handle);
    }

    public final void unregister(@NotNull final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        RiveLog.INSTANCE.getLogger().d(this.ops.getTag(), new Function0<String>(this) { // from class: app.rive.Asset.unregister.1
            final /* synthetic */ Asset<H> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return e.m("Unregistering ", ((Asset) this.this$0).ops.getLabel(), " with key: ", key);
            }
        });
        this.ops.unregister(this.riveWorker, key);
    }

    private Asset(final H h6, final CommandQueue commandQueue, final AssetOps<H, ? extends Asset<H>> assetOps) {
        this.handle = h6;
        this.riveWorker = commandQueue;
        this.ops = assetOps;
        this.$$delegate_0 = new CloseOnce(String.valueOf(h6), new Function0<Unit>() { // from class: app.rive.Asset.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m8invoke();
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m8invoke() {
                String tag = assetOps.getTag();
                final AssetOps<H, ? extends Asset<H>> assetOps2 = assetOps;
                final H h7 = h6;
                RiveLog.INSTANCE.getLogger().d(tag, new Function0<String>() { // from class: app.rive.Asset.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Deleting " + assetOps2.getLabel() + " with handle: " + h7;
                    }
                });
                assetOps.delete(commandQueue, h6);
                commandQueue.release(assetOps.getTag(), "Asset closed");
            }
        });
    }
}
