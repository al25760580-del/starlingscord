package com.discord.socialrpc;

import android.os.IBinder;
import com.discord.socialsdk.rpc.IDiscordRpcCallback;
import com.discord.socialsdk.rpc.IDiscordRpcConnection;
import com.discord.socialsdk.rpc.IDiscordRpcService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rn.q;
import rn.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/discord/socialrpc/DiscordRpcService$binder$1", "Lcom/discord/socialsdk/rpc/IDiscordRpcService$Stub;", "connect", "Lcom/discord/socialsdk/rpc/IDiscordRpcConnection;", "applicationId", "", "version", "", "callback", "Lcom/discord/socialsdk/rpc/IDiscordRpcCallback;", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDiscordRpcService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscordRpcService.kt\ncom/discord/socialrpc/DiscordRpcService$binder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class DiscordRpcService$binder$1 extends IDiscordRpcService.Stub {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$0(String str) {
        SocialRpcSessionManager.INSTANCE.onDisconnect(str);
    }

    @Override // com.discord.socialsdk.rpc.IDiscordRpcService
    public IDiscordRpcConnection connect(long applicationId, String version, final IDiscordRpcCallback callback) {
        Object objO;
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!SocialRpcSessionManager.INSTANCE.onConnect(string, applicationId, version, callback)) {
            return null;
        }
        final IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.discord.socialrpc.a
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                DiscordRpcService$binder$1.connect$lambda$0(string);
            }
        };
        try {
            q qVar = Result.f14614e;
            callback.asBinder().linkToDeath(deathRecipient, 0);
            objO = Unit.f14616a;
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (!(objO instanceof r)) {
            return new IDiscordRpcConnection.Stub() { // from class: com.discord.socialrpc.DiscordRpcService$binder$1$connect$1
                @Override // com.discord.socialsdk.rpc.IDiscordRpcConnection
                public void disconnect() {
                    IDiscordRpcCallback iDiscordRpcCallback = callback;
                    IBinder.DeathRecipient deathRecipient2 = deathRecipient;
                    try {
                        q qVar3 = Result.f14614e;
                        iDiscordRpcCallback.asBinder().unlinkToDeath(deathRecipient2, 0);
                    } catch (Throwable th3) {
                        q qVar4 = Result.f14614e;
                        ib.a.o(th3);
                    }
                    SocialRpcSessionManager.INSTANCE.onDisconnect(string);
                }

                @Override // com.discord.socialsdk.rpc.IDiscordRpcConnection
                public void sendFrame(String frame) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                    SocialRpcSessionManager.INSTANCE.onFrame(string, frame);
                }
            };
        }
        SocialRpcSessionManager.INSTANCE.onDisconnect(string);
        return null;
    }
}
