package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import sh.m0;
import sh.o;
import th.f;

/* JADX INFO: loaded from: classes3.dex */
public class AssetPackExtractionService extends Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f6502d;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f6502d;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f6502d = (o) ((f) m0.b(getApplicationContext()).f6611e).a();
    }
}
