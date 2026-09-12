package kr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class j extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public j(int i7) {
        super(kk.b.h(i7, "An unknown field for index "));
    }
}
