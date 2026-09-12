package io.sentry.android.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f12227b;

    public i1(Integer num, Boolean bool) {
        this.f12226a = num;
        this.f12227b = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return com.facebook.imagepipeline.nativecode.c.r(this.f12226a, i1Var.f12226a) && com.facebook.imagepipeline.nativecode.c.r(this.f12227b, i1Var.f12227b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12226a, this.f12227b});
    }
}
