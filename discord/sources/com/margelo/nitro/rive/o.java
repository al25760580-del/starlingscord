package com.margelo.nitro.rive;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6964a;

    public o(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f6964a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.areEqual(this.f6964a, ((o) obj).f6964a);
    }

    public final int hashCode() {
        return this.f6964a.hashCode();
    }

    public final String toString() {
        return s0.g.e("Resource(name=", this.f6964a, ")");
    }
}
