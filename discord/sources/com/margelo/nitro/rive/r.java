package com.margelo.nitro.rive;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    @xa.a
    @NotNull
    public final EventPropertiesOutput create(boolean z5) {
        return new EventPropertiesOutput.First(z5);
    }

    @xa.a
    @NotNull
    public final EventPropertiesOutput create(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new EventPropertiesOutput.Second(value);
    }

    @xa.a
    @NotNull
    public final EventPropertiesOutput create(double d6) {
        return new EventPropertiesOutput.Third(d6);
    }
}
