package com.margelo.nitro.rive;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CharSequence charSequence, String type) {
        super(charSequence != null ? charSequence.toString() : null);
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
