package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Process;
import ci.b0;
import java.util.Objects;
import wh.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f6509i;
    public final /* synthetic */ c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ig.g gVar) {
        super(cVar, gVar);
        Objects.requireNonNull(cVar);
        this.j = cVar;
        this.f6509i = new b0("OnRequestIntegrityTokenCallback");
    }

    @Override // wh.m, ci.x
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.f6509i.b("onRequestExpressIntegrityToken", new Object[0]);
        ye.e eVarJ = this.j.f6513d.j(bundle);
        ig.g gVar = this.f22296g;
        if (eVarJ != null) {
            gVar.c(eVarJ);
            return;
        }
        bundle.getLong("request.token.sid");
        s0.g.c(Process.myUid(), "UID: [", Process.myPid(), "]  PID: [", "] ").concat("IntegrityDialogWrapper");
        String string = bundle.getString("token");
        if (string == null) {
            throw new NullPointerException("Null token");
        }
        gVar.d(new d(string));
    }
}
