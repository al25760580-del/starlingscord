package com.discord.billing;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"IN_SESSION_RETRY_INITIAL_DELAY_MS", "", "IN_SESSION_RETRY_MAX_DELAY_MS", "IN_SESSION_RETRY_MAX_ATTEMPTS", "", "BACKGROUND_RETRY_INITIAL_DELAY_MS", "BACKGROUND_RETRY_MAX_DELAY_MS", "BACKGROUND_RETRY_MAX_ATTEMPTS", "billing_androidRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BillingManagerKt {
    private static final long BACKGROUND_RETRY_INITIAL_DELAY_MS = 1000;
    private static final int BACKGROUND_RETRY_MAX_ATTEMPTS = 10;
    private static final long BACKGROUND_RETRY_MAX_DELAY_MS = 300000;
    private static final long IN_SESSION_RETRY_INITIAL_DELAY_MS = 1000;
    private static final int IN_SESSION_RETRY_MAX_ATTEMPTS = 3;
    private static final long IN_SESSION_RETRY_MAX_DELAY_MS = 4000;
}
