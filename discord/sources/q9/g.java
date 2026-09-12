package q9;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f18669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f18670b;

    public g(d frameLoader, Date insertedTime) {
        Intrinsics.checkNotNullParameter(frameLoader, "frameLoader");
        Intrinsics.checkNotNullParameter(insertedTime, "insertedTime");
        this.f18669a = frameLoader;
        this.f18670b = insertedTime;
    }
}
