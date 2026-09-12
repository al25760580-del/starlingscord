package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Bundle;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import e4.c;
import sh.a;
import sh.e1;
import sh.j0;
import sh.l0;
import sh.m0;
import sh.v0;
import th.f;
import v3.g;
import v3.h;
import v3.l;
import v3.n;
import v3.o;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtractionWorker extends Worker {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j0 f6504x;

    public ExtractionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f6504x = (j0) ((f) m0.b(context).f6612i).a();
    }

    @Override // androidx.work.Worker
    public final o f() {
        g gVar = this.f21414e.f2814b;
        j0 j0Var = this.f6504x;
        j0Var.getClass();
        n8.f fVar = new n8.f("session_bundle:", gVar);
        a.d(fVar);
        Bundle bundle = (Bundle) fVar.f16511i;
        try {
            v0 v0Var = j0Var.f20070a;
            v0Var.getClass();
            if (((Boolean) v0Var.b(new c(19, v0Var, bundle))).booleanValue()) {
                j0Var.f20071b.a();
            }
            return new n(g.f21404c);
        } catch (l0 e10) {
            j0.f20069d.b("Error while updating ExtractorSessionStoreView: %s", e10.getMessage());
            return new l();
        }
    }

    @Override // androidx.work.Worker
    public final h g() {
        g gVar = this.f21414e.f2814b;
        e1 e1Var = this.f6504x.f20072c;
        n8.f fVar = new n8.f("notification_bundle:", gVar);
        a.c(fVar);
        Bundle bundle = (Bundle) fVar.f16511i;
        e1Var.b(bundle);
        return new h(-1883842196, e1Var.a(bundle), 0);
    }
}
