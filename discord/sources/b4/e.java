package b4;

import e4.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4.f f3067a;

    public e(c4.f tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f3067a = tracker;
    }

    public abstract int a();

    public abstract boolean b(o oVar);

    public abstract boolean c(Object obj);
}
