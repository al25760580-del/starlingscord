package com.discord.socialrpc;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4587d;

    public /* synthetic */ c(int i7) {
        this.f4587d = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4587d) {
            case 0:
                return SocialRpcHttp.SessionUpdate._childSerializers$_anonymous_();
            default:
                return SocialRpcNetworkConfig.Blob._childSerializers$_anonymous_();
        }
    }
}
