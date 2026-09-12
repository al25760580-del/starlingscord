package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends Binder {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u4.b f6569f;

    public c0(u4.b bVar) {
        this.f6569f = bVar;
    }

    public final void a(d0 d0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        EnhancedIntentService.access$000((EnhancedIntentService) this.f6569f.f20945e, d0Var.f6573a).b(new com.discord.misc.utilities.threading.a(1), new app.rive.runtime.kotlin.core.a(19, d0Var));
    }
}
