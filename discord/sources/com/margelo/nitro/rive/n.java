package com.margelo.nitro.rive;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6960a;

    public n(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f6960a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.areEqual(this.f6960a, ((n) obj).f6960a);
    }

    public final int hashCode() {
        return this.f6960a.hashCode();
    }

    public final String toString() {
        return s0.g.e("Http(url=", this.f6960a, ")");
    }
}
