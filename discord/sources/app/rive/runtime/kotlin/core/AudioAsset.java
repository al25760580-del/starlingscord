package app.rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0082 R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lapp/rive/runtime/kotlin/core/AudioAsset;", "Lapp/rive/runtime/kotlin/core/FileAsset;", "address", "", "rendererTypeIdx", "", "(JI)V", "value", "Lapp/rive/runtime/kotlin/core/RiveAudio;", MediaStreamTrack.AUDIO_TRACK_KIND, "getAudio", "()Lapp/rive/runtime/kotlin/core/RiveAudio;", "setAudio", "(Lapp/rive/runtime/kotlin/core/RiveAudio;)V", "cppGetAudio", "cppAsset", "cppSetAudio", "", "cppAudio", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AudioAsset extends FileAsset {
    public static final int $stable = 0;

    public AudioAsset(long j, int i7) {
        super(j, i7, null);
    }

    private final native long cppGetAudio(long cppAsset);

    private final native void cppSetAudio(long cppAsset, long cppAudio);

    @NotNull
    public final RiveAudio getAudio() {
        return new RiveAudio(cppGetAudio(getCppPointer()));
    }

    public final void setAudio(@NotNull RiveAudio value) {
        Intrinsics.checkNotNullParameter(value, "value");
        cppSetAudio(getCppPointer(), value.getCppPointer());
    }
}
