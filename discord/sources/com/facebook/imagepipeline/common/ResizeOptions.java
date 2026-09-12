package com.facebook.imagepipeline.common;

import a3.e;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ResizeOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4818b;

    public ResizeOptions(int i7, int i10) {
        this.f4817a = i7;
        this.f4818b = i10;
        if (i7 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResizeOptions)) {
            return false;
        }
        ResizeOptions resizeOptions = (ResizeOptions) obj;
        return this.f4817a == resizeOptions.f4817a && this.f4818b == resizeOptions.f4818b;
    }

    public final int hashCode() {
        return ((this.f4817a + 31) * 31) + this.f4818b;
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return e.q(new Object[]{Integer.valueOf(this.f4817a), Integer.valueOf(this.f4818b)}, 2, null, "%dx%d", "format(...)");
    }
}
