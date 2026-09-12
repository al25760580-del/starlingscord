package com.discord.authentication;

import com.discord.codegen.NativeAuthenticationModuleSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/discord/authentication/AuthenticationModule;", "Lcom/discord/codegen/NativeAuthenticationModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "sendAuthUrl", "", "authUrl", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "authentication_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthenticationModule extends NativeAuthenticationModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeAuthenticationModuleSpec
    public void sendAuthUrl(@NotNull String authUrl, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(null);
    }
}
