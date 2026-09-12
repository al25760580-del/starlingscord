package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1xSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFe1xSDK<String> getCurrencyIso4217Code;

    public ParsingException(String str, Throwable th2, @NonNull AFe1xSDK<String> aFe1xSDK) {
        super(str, th2);
        this.getCurrencyIso4217Code = aFe1xSDK;
    }

    @NonNull
    public AFe1xSDK<String> getRawResponse() {
        return this.getCurrencyIso4217Code;
    }
}
