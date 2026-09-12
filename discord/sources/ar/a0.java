package ar;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
