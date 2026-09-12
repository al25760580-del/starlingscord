package com.discord.telecom.service;

import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import com.discord.logging.Log;
import com.discord.telecom.TelecomModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"Lcom/discord/telecom/service/TelecomConnectionService;", "Landroid/telecom/ConnectionService;", "<init>", "()V", "onCreateIncomingConnection", "Landroid/telecom/Connection;", "connectionManagerPhoneAccount", "Landroid/telecom/PhoneAccountHandle;", "request", "Landroid/telecom/ConnectionRequest;", "onCreateIncomingConnectionFailed", "", "Companion", "telecom_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TelecomConnectionService extends ConnectionService {

    @NotNull
    private static final String TAG = "TelecomAndroid";

    @Override // android.telecom.ConnectionService
    @NotNull
    public Connection onCreateIncomingConnection(PhoneAccountHandle connectionManagerPhoneAccount, @NotNull ConnectionRequest request) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle extras = request.getExtras();
        String string = (extras == null || (bundle = extras.getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS")) == null) ? null : bundle.getString(TelecomModule.EXTRA_CALL_ID);
        if (string == null) {
            Log.e$default(Log.INSTANCE, TAG, "Missing callId in incoming connection request", (Throwable) null, 4, (Object) null);
            Connection connectionCreateFailedConnection = Connection.createFailedConnection(new DisconnectCause(1));
            Intrinsics.checkNotNullExpressionValue(connectionCreateFailedConnection, "createFailedConnection(...)");
            return connectionCreateFailedConnection;
        }
        TelecomModule companion = TelecomModule.INSTANCE.getInstance();
        if (companion == null) {
            Log.e$default(Log.INSTANCE, TAG, "TelecomModule not initialized, cannot create incoming connection: callId=".concat(string), (Throwable) null, 4, (Object) null);
            Connection connectionCreateFailedConnection2 = Connection.createFailedConnection(new DisconnectCause(1));
            Intrinsics.checkNotNullExpressionValue(connectionCreateFailedConnection2, "createFailedConnection(...)");
            return connectionCreateFailedConnection2;
        }
        Log.i$default(Log.INSTANCE, TAG, "Creating incoming connection: callId=".concat(string), (Throwable) null, 4, (Object) null);
        TelecomConnection telecomConnection = new TelecomConnection(string);
        companion.onConnectionCreated$telecom_androidRelease(string, telecomConnection);
        return telecomConnection;
    }

    @Override // android.telecom.ConnectionService
    public void onCreateIncomingConnectionFailed(PhoneAccountHandle connectionManagerPhoneAccount, @NotNull ConnectionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Log.e$default(Log.INSTANCE, TAG, "onCreateIncomingConnectionFailed", (Throwable) null, 4, (Object) null);
    }
}
