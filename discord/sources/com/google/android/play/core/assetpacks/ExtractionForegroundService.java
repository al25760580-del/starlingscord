package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import sh.f0;

/* JADX INFO: loaded from: classes3.dex */
public class ExtractionForegroundService extends Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f6503d = new f0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f6503d;
    }
}
