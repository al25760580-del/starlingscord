package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f12636b;

    public e0(String str) {
        Pattern patternCompile;
        this.f12635a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            c4.f().l().getLogger().q(SentryLevel.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.f12636b = patternCompile;
    }

    public final boolean equals(Object obj) {
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f12635a, ((e0) obj).f12635a);
    }

    public final int hashCode() {
        return Objects.hash(this.f12635a);
    }
}
