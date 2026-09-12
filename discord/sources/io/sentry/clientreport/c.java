package io.sentry.clientreport;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12569b;

    public c(String str, String str2) {
        this.f12568a = str;
        this.f12569b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return com.facebook.imagepipeline.nativecode.c.r(this.f12568a, cVar.f12568a) && com.facebook.imagepipeline.nativecode.c.r(this.f12569b, cVar.f12569b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12568a, this.f12569b});
    }
}
