package app.rive;

import app.rive.core.AudioHandle;
import app.rive.core.CommandQueue;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lapp/rive/AudioAsset;", "Lapp/rive/Asset;", "Lapp/rive/core/AudioHandle;", "handle", "worker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "(JLapp/rive/core/CommandQueue;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AudioAsset extends Asset<AudioHandle> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String tag = "Rive/Audio";

    @NotNull
    private static final String label = MediaStreamTrack.AUDIO_TRACK_KIND;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J&\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0017\u001a\u00020\u00182\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\n\u0010\u001d\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0016J.\u0010\u001e\u001a\u00020\u00182\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u00020\u00182\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u001f\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lapp/rive/AudioAsset$Companion;", "Lapp/rive/AssetOps;", "Lapp/rive/core/AudioHandle;", "Lapp/rive/AudioAsset;", "()V", "label", "", "getLabel", "()Ljava/lang/String;", "tag", "getTag", "construct", "handle", "worker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "construct-QxJutAs", "(JLapp/rive/core/CommandQueue;)Lapp/rive/AudioAsset;", "decode", "bytes", "", "decode-Z6pBmcA", "(Lapp/rive/core/CommandQueue;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "delete-4kKS7jM", "(Lapp/rive/core/CommandQueue;J)V", "fromBytes", "Lapp/rive/Result;", "riveWorker", "register", "key", "register-d3xxSlE", "(Lapp/rive/core/CommandQueue;Ljava/lang/String;J)V", "unregister", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements AssetOps<AudioHandle, AudioAsset> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ Asset construct(AudioHandle audioHandle, CommandQueue commandQueue) {
            return m10constructQxJutAs(audioHandle.m116unboximpl(), commandQueue);
        }

        @NotNull
        /* JADX INFO: renamed from: construct-QxJutAs, reason: not valid java name */
        public AudioAsset m10constructQxJutAs(long handle, @NotNull CommandQueue worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            return new AudioAsset(handle, worker, null);
        }

        @Override // app.rive.AssetOps
        /* JADX INFO: renamed from: decode-Z6pBmcA, reason: not valid java name and merged with bridge method [inline-methods] */
        public Object decode(@NotNull CommandQueue commandQueue, @NotNull byte[] bArr, @NotNull Continuation continuation) {
            return commandQueue.m131decodeAudioWLIIakE(bArr, continuation);
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ void delete(CommandQueue commandQueue, AudioHandle audioHandle) {
            m12delete4kKS7jM(commandQueue, audioHandle.m116unboximpl());
        }

        /* JADX INFO: renamed from: delete-4kKS7jM, reason: not valid java name */
        public void m12delete4kKS7jM(@NotNull CommandQueue worker, long handle) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            worker.m135deleteAudioQAnvCWo(handle);
        }

        public final Object fromBytes(@NotNull CommandQueue commandQueue, @NotNull byte[] bArr, @NotNull Continuation continuation) {
            return Asset.INSTANCE.fromBytes$kotlin_release(this, commandQueue, bArr, continuation);
        }

        @Override // app.rive.AssetOps
        @NotNull
        public String getLabel() {
            return AudioAsset.label;
        }

        @Override // app.rive.AssetOps
        @NotNull
        public String getTag() {
            return AudioAsset.tag;
        }

        @Override // app.rive.AssetOps
        public /* bridge */ /* synthetic */ void register(CommandQueue commandQueue, String str, AudioHandle audioHandle) {
            m13registerd3xxSlE(commandQueue, str, audioHandle.m116unboximpl());
        }

        /* JADX INFO: renamed from: register-d3xxSlE, reason: not valid java name */
        public void m13registerd3xxSlE(@NotNull CommandQueue worker, @NotNull String key, long handle) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            Intrinsics.checkNotNullParameter(key, "key");
            worker.m163registerAudio4kKS7jM(key, handle);
        }

        @Override // app.rive.AssetOps
        public void unregister(@NotNull CommandQueue worker, @NotNull String key) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            Intrinsics.checkNotNullParameter(key, "key");
            worker.unregisterAudio(key);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AudioAsset(long j, CommandQueue commandQueue, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, commandQueue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AudioAsset(long j, CommandQueue worker) {
        super(AudioHandle.m110boximpl(j), worker, INSTANCE, null);
        Intrinsics.checkNotNullParameter(worker, "worker");
    }
}
