package fs;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f9412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9413d;

    public a(String name, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f9410a = name;
        this.f9411b = z5;
        this.f9413d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f9410a;
    }
}
