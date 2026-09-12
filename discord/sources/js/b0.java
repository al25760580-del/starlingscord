package js;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends IOException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f14097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(b errorCode) {
        super(Intrinsics.stringPlus("stream was reset: ", errorCode));
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f14097d = errorCode;
    }
}
