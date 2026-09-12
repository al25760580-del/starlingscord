package com.discord.socialrpc;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4586d;

    public /* synthetic */ b(int i7) {
        this.f4586d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4586d) {
            case 0:
                return SocialRpcHttp.json$lambda$2((JsonBuilder) obj);
            case 1:
                return SocialRpcNetworkConfig.json$lambda$0((JsonBuilder) obj);
            case 2:
                return SocialRpcSessionManager.json$lambda$0((JsonBuilder) obj);
            default:
                return SocialRpcSessionManager.sendReady$lambda$16$lambda$15$lambda$14((JsonObjectBuilder) obj);
        }
    }
}
