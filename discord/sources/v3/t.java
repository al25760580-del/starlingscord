package v3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f21428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.o f21429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f21430c;

    public t(UUID id2, e4.o workSpec, LinkedHashSet tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f21428a = id2;
        this.f21429b = workSpec;
        this.f21430c = tags;
    }
}
