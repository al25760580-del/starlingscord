package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFd1aSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFd1aSDK getMediationNetwork;

    public HttpException(@NonNull Throwable th2, @NonNull AFd1aSDK aFd1aSDK) {
        super(th2.getMessage(), th2);
        this.getMediationNetwork = aFd1aSDK;
    }

    @NonNull
    public AFd1aSDK getMetrics() {
        return this.getMediationNetwork;
    }
}
