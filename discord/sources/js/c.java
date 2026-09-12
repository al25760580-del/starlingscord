package js;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteString f14098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteString f14099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ByteString f14100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ByteString f14101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ByteString f14102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ByteString f14103i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteString f14104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f14105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14106c;

    static {
        ByteString byteString = ByteString.f17414v;
        f14098d = io.sentry.hints.j.z(":");
        f14099e = io.sentry.hints.j.z(":status");
        f14100f = io.sentry.hints.j.z(":method");
        f14101g = io.sentry.hints.j.z(":path");
        f14102h = io.sentry.hints.j.z(":scheme");
        f14103i = io.sentry.hints.j.z(":authority");
    }

    public c(ByteString name, ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f14104a = name;
        this.f14105b = value;
        this.f14106c = value.c() + name.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f14104a, cVar.f14104a) && Intrinsics.areEqual(this.f14105b, cVar.f14105b);
    }

    public final int hashCode() {
        return this.f14105b.hashCode() + (this.f14104a.hashCode() * 31);
    }

    public final String toString() {
        return this.f14104a.k() + ": " + this.f14105b.k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String name, String value) {
        this(io.sentry.hints.j.z(name), io.sentry.hints.j.z(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString byteString = ByteString.f17414v;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(ByteString name, String value) {
        this(name, io.sentry.hints.j.z(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString byteString = ByteString.f17414v;
    }
}
