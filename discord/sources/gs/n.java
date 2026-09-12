package gs;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n extends RuntimeException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IOException f10243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IOException f10244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f10243d = firstConnectException;
        this.f10244e = firstConnectException;
    }
}
