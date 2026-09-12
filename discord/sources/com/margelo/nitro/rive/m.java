package com.margelo.nitro.rive;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6956a;

    public m(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f6956a = path;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.areEqual(this.f6956a, ((m) obj).f6956a);
    }

    public final int hashCode() {
        return this.f6956a.hashCode();
    }

    public final String toString() {
        return s0.g.e("File(path=", this.f6956a, ")");
    }
}
