package ar;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w f2981i = new w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2982e;

    public y() {
        super(f2981i);
        this.f2982e = "MediaEngine";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.areEqual(this.f2982e, ((y) obj).f2982e);
    }

    public final int hashCode() {
        return this.f2982e.hashCode();
    }

    public final String toString() {
        return s0.g.g(new StringBuilder("CoroutineName("), this.f2982e, ')');
    }
}
