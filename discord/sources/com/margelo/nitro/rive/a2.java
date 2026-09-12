package com.margelo.nitro.rive;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 {
    @xa.a
    @NotNull
    public final Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName create(@NotNull HybridViewModelInstanceSpec value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName.First(value);
    }

    @xa.a
    @NotNull
    public final Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName create(@NotNull DataBindMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName.Second(value);
    }

    @xa.a
    @NotNull
    public final Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName create(@NotNull DataBindByName value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName.Third(value);
    }
}
