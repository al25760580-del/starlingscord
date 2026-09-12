package com.discord.blur;

import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006J\u0014\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/blur/BlurViewTargetRegistry;", "", "<init>", "()V", "registryBlurViewTargets", "Ljava/util/WeakHashMap;", "", "Lcom/discord/blur/BlurViewAPI$Target;", "registryChangeListeners", "Ljava/util/HashSet;", "Lkotlin/Function0;", "", "Lkotlin/collections/HashSet;", "add", "nativeId", "blurViewTarget", "addChangeListener", "onChange", "remove", "removeChangeListener", "get", "blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlurViewTargetRegistry {

    @NotNull
    public static final BlurViewTargetRegistry INSTANCE = new BlurViewTargetRegistry();

    @NotNull
    private static final WeakHashMap<String, BlurViewAPI.Target> registryBlurViewTargets = new WeakHashMap<>();

    @NotNull
    private static final HashSet<Function0<Unit>> registryChangeListeners = new HashSet<>();

    private BlurViewTargetRegistry() {
    }

    public final void add(@NotNull String nativeId, @NotNull BlurViewAPI.Target blurViewTarget) {
        Intrinsics.checkNotNullParameter(nativeId, "nativeId");
        Intrinsics.checkNotNullParameter(blurViewTarget, "blurViewTarget");
        registryBlurViewTargets.put(nativeId, blurViewTarget);
    }

    public final void addChangeListener(@NotNull Function0<Unit> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        registryChangeListeners.add(onChange);
    }

    public final BlurViewAPI.Target get(@NotNull String nativeId) {
        Intrinsics.checkNotNullParameter(nativeId, "nativeId");
        return registryBlurViewTargets.get(nativeId);
    }

    public final void remove(@NotNull String nativeId) {
        Intrinsics.checkNotNullParameter(nativeId, "nativeId");
        registryBlurViewTargets.remove(nativeId);
    }

    public final void removeChangeListener(@NotNull Function0<Unit> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        registryChangeListeners.remove(onChange);
    }
}
