package com.discord.client_info.react;

import com.discord.client_info.ClientInfo;
import com.discord.client_info.ClientInfoCache;
import com.discord.codegen.NativeClientInfoModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0014¨\u0006\n"}, d2 = {"Lcom/discord/client_info/react/ClientInfoModule;", "Lcom/discord/codegen/NativeClientInfoModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", "client_info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClientInfoModule extends NativeClientInfoModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientInfoModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeClientInfoModuleSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        Pair pair = new Pair("Identifier", clientInfo.getPackageName());
        Pair pair2 = new Pair("Version", clientInfo.getVersionName());
        Pair pair3 = new Pair("Build", clientInfo.getVersionCode());
        Pair pair4 = new Pair("Manifest", clientInfo.getOtaManifestETag());
        Pair pair5 = new Pair("OTABuild", clientInfo.getOtaVersion());
        ClientInfoCache clientInfoCache = ClientInfoCache.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return w0.h(pair, pair2, pair3, pair4, pair5, new Pair("DeviceVendorID", clientInfoCache.getDeviceVendorId(reactApplicationContext)), new Pair("ReleaseChannel", clientInfo.getReleaseChannel()), new Pair("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"), new Pair("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"), new Pair("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375"));
    }
}
