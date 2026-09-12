package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import he.s;
import he.t;
import he.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements DataSource.Factory {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f5835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0 f5836e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final oc.b f5837i;

    public a(ReactContext reactContext, s sVar, oc.b bVar) {
        this.f5835d = reactContext.getApplicationContext();
        this.f5836e = sVar;
        this.f5837i = bVar;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public final DataSource createDataSource() {
        t tVar = new t(this.f5835d, this.f5837i.createDataSource());
        u0 u0Var = this.f5836e;
        if (u0Var != null) {
            tVar.B(u0Var);
        }
        return tVar;
    }
}
