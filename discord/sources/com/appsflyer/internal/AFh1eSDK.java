package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1eSDK extends AFh1jSDK {
    @Override // com.appsflyer.internal.AFh1jSDK
    public final boolean component3() {
        return true;
    }

    @Override // com.appsflyer.internal.AFh1jSDK
    public final AFe1mSDK getCurrencyIso4217Code() {
        return this.component1 == 1 ? AFe1mSDK.CONVERSION : AFe1mSDK.LAUNCH;
    }
}
