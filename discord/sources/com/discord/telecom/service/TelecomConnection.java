package com.discord.telecom.service;

import a3.e;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import com.discord.logging.Log;
import com.discord.telecom.TelecomModule;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/telecom/service/TelecomConnection;", "Landroid/telecom/Connection;", "callId", "", "<init>", "(Ljava/lang/String;)V", "onAnswer", "", "onReject", "onDisconnect", "Companion", "telecom_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TelecomConnection extends Connection {

    @NotNull
    private static final String TAG = "TelecomAndroid";

    @NotNull
    private final String callId;

    public TelecomConnection(@NotNull String callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        this.callId = callId;
        setConnectionProperties(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        setRinging();
    }

    @Override // android.telecom.Connection
    public void onAnswer() {
        Log.i$default(Log.INSTANCE, TAG, e.l("onAnswer: callId=", this.callId), (Throwable) null, 4, (Object) null);
        setActive();
        TelecomModule companion = TelecomModule.INSTANCE.getInstance();
        if (companion != null) {
            companion.emitCallAnswered$telecom_androidRelease(this.callId);
        }
    }

    @Override // android.telecom.Connection
    public void onDisconnect() {
        Log.i$default(Log.INSTANCE, TAG, e.l("onDisconnect: callId=", this.callId), (Throwable) null, 4, (Object) null);
        TelecomModule companion = TelecomModule.INSTANCE.getInstance();
        if (companion != null) {
            companion.onConnectionDisconnected$telecom_androidRelease(this.callId);
        }
        setDisconnected(new DisconnectCause(2));
        destroy();
    }

    @Override // android.telecom.Connection
    public void onReject() {
        Log.i$default(Log.INSTANCE, TAG, e.l("onReject: callId=", this.callId), (Throwable) null, 4, (Object) null);
        TelecomModule companion = TelecomModule.INSTANCE.getInstance();
        if (companion != null) {
            companion.emitCallRejected$telecom_androidRelease(this.callId);
        }
        setDisconnected(new DisconnectCause(6));
        destroy();
    }
}
