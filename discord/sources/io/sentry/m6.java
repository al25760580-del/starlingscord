package io.sentry;

import com.facebook.react.common.assets.ReactFontManager;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum m6 implements y1 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(ReactFontManager.TypefaceStyle.NORMAL),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(ReactFontManager.TypefaceStyle.NORMAL),
    ABORTED(409),
    OUT_OF_RANGE(ReactFontManager.TypefaceStyle.NORMAL),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    m6(int i7) {
        this.minHttpStatusCode = i7;
        this.maxHttpStatusCode = i7;
    }

    public static m6 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static m6 fromHttpStatusCode(int i7) {
        for (m6 m6Var : values()) {
            if (m6Var.matches(i7)) {
                return m6Var;
            }
        }
        return null;
    }

    private boolean matches(int i7) {
        return i7 >= this.minHttpStatusCode && i7 <= this.maxHttpStatusCode;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.y1
    public void serialize(@NotNull y2 y2Var, @NotNull ILogger iLogger) {
        y2Var.f(apiName());
    }

    @NotNull
    public static m6 fromHttpStatusCode(Integer num, @NotNull m6 m6Var) {
        m6 m6VarFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : m6Var;
        return m6VarFromHttpStatusCode != null ? m6VarFromHttpStatusCode : m6Var;
    }

    m6(int i7, int i10) {
        this.minHttpStatusCode = i7;
        this.maxHttpStatusCode = i10;
    }
}
