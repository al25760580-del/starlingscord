package com.facebook.imagepipeline.common;

import a3.e;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class RotationOptions {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RotationOptions f4819c = new RotationOptions(-1, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final RotationOptions f4820d = new RotationOptions(-2, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RotationOptions f4821e = new RotationOptions(-1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4823b;

    public RotationOptions(int i7, boolean z5) {
        this.f4822a = i7;
        this.f4823b = z5;
    }

    public final boolean a() {
        return this.f4822a == -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RotationOptions)) {
            return false;
        }
        RotationOptions rotationOptions = (RotationOptions) obj;
        return this.f4822a == rotationOptions.f4822a && this.f4823b == rotationOptions.f4823b;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f4822a);
        Boolean boolValueOf = Boolean.valueOf(this.f4823b);
        return ((numValueOf.hashCode() + 31) * 31) + boolValueOf.hashCode();
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return e.q(new Object[]{Integer.valueOf(this.f4822a), Boolean.valueOf(this.f4823b)}, 2, null, "%d defer:%b", "format(...)");
    }
}
