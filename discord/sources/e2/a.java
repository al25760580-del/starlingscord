package e2;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message, int i7) {
        super(message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
