package com.discord.socialrpc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004*\u0001\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/discord/socialrpc/DiscordRpcService;", "Landroid/app/Service;", "<init>", "()V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "binder", "com/discord/socialrpc/DiscordRpcService$binder$1", "Lcom/discord/socialrpc/DiscordRpcService$binder$1;", "Companion", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiscordRpcService extends Service {

    @NotNull
    public static final String ACTION = "com.discord.socialsdk.rpc.IDiscordRpcService";

    @NotNull
    private final DiscordRpcService$binder$1 binder = new DiscordRpcService$binder$1();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "com.discord.socialsdk.rpc.IDiscordRpcService")) {
            return this.binder;
        }
        return null;
    }
}
