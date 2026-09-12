package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public enum y0 {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    y0(int i7) {
        this.value = i7;
    }

    public int getValue() {
        return this.value;
    }
}
