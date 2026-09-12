package com.discord.security_key;

import android.app.Activity;
import android.app.PendingIntent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f4579e;

    public /* synthetic */ a(Activity activity, int i7) {
        this.f4578d = i7;
        this.f4579e = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4578d) {
            case 0:
                return WebAuthn.authenticateSecurityKey$lambda$3(this.f4579e, (PendingIntent) obj);
            default:
                return WebAuthn.registerSecurityKey$lambda$0(this.f4579e, (PendingIntent) obj);
        }
    }
}
