package io.sentry.ndk;

/* JADX INFO: loaded from: classes3.dex */
public enum a {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    a(int i7) {
        this.value = i7;
    }

    public int getValue() {
        return this.value;
    }
}
