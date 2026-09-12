package app.rive.runtime.kotlin.controllers;

import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ControllerStateManagement
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bk\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\b0\nj\b\u0012\u0004\u0012\u00020\b`\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\r0\nj\b\u0012\u0004\u0012\u00020\r`\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010\u001d\u001a\u00020\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0018R!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\b0\nj\b\u0012\u0004\u0012\u00020\b`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\r0\nj\b\u0012\u0004\u0012\u00020\r`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015¨\u0006\u001f"}, d2 = {"Lapp/rive/runtime/kotlin/controllers/ControllerState;", "", "file", "Lapp/rive/runtime/kotlin/core/File;", "activeArtboard", "Lapp/rive/runtime/kotlin/core/Artboard;", "animations", "", "Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "playingAnimations", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "stateMachines", "Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "playingStateMachines", "isActive", "", "(Lapp/rive/runtime/kotlin/core/File;Lapp/rive/runtime/kotlin/core/Artboard;Ljava/util/List;Ljava/util/HashSet;Ljava/util/List;Ljava/util/HashSet;Z)V", "getActiveArtboard", "()Lapp/rive/runtime/kotlin/core/Artboard;", "getAnimations", "()Ljava/util/List;", "getFile", "()Lapp/rive/runtime/kotlin/core/File;", "()Z", "getPlayingAnimations", "()Ljava/util/HashSet;", "getPlayingStateMachines", "getStateMachines", "dispose", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ControllerState {
    public static final int $stable = 8;

    @NotNull
    private final Artboard activeArtboard;

    @NotNull
    private final List<LinearAnimationInstance> animations;

    @NotNull
    private final File file;
    private final boolean isActive;

    @NotNull
    private final HashSet<LinearAnimationInstance> playingAnimations;

    @NotNull
    private final HashSet<StateMachineInstance> playingStateMachines;

    @NotNull
    private final List<StateMachineInstance> stateMachines;

    public ControllerState(@NotNull File file, @NotNull Artboard activeArtboard, @NotNull List<LinearAnimationInstance> animations, @NotNull HashSet<LinearAnimationInstance> playingAnimations, @NotNull List<StateMachineInstance> stateMachines, @NotNull HashSet<StateMachineInstance> playingStateMachines, boolean z5) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(activeArtboard, "activeArtboard");
        Intrinsics.checkNotNullParameter(animations, "animations");
        Intrinsics.checkNotNullParameter(playingAnimations, "playingAnimations");
        Intrinsics.checkNotNullParameter(stateMachines, "stateMachines");
        Intrinsics.checkNotNullParameter(playingStateMachines, "playingStateMachines");
        this.file = file;
        this.activeArtboard = activeArtboard;
        this.animations = animations;
        this.playingAnimations = playingAnimations;
        this.stateMachines = stateMachines;
        this.playingStateMachines = playingStateMachines;
        this.isActive = z5;
    }

    public final void dispose() {
        this.file.release();
        this.activeArtboard.release();
    }

    @NotNull
    public final Artboard getActiveArtboard() {
        return this.activeArtboard;
    }

    @NotNull
    public final List<LinearAnimationInstance> getAnimations() {
        return this.animations;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final HashSet<LinearAnimationInstance> getPlayingAnimations() {
        return this.playingAnimations;
    }

    @NotNull
    public final HashSet<StateMachineInstance> getPlayingStateMachines() {
        return this.playingStateMachines;
    }

    @NotNull
    public final List<StateMachineInstance> getStateMachines() {
        return this.stateMachines;
    }

    /* JADX INFO: renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }
}
