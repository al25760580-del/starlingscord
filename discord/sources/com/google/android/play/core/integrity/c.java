package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import ci.b0;
import ci.t;
import java.util.ArrayList;
import pa.s;
import wh.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f6510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ig.g f6512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f6513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ci.d f6514e;

    public c(Context context, b0 b0Var, s sVar) {
        ig.g gVar = new ig.g();
        this.f6512c = gVar;
        this.f6511b = context.getPackageName();
        this.f6510a = b0Var;
        this.f6513d = sVar;
        ci.d dVar = new ci.d(context, b0Var, "ExpressIntegrityService", p.f22300a, new k8.a());
        this.f6514e = dVar;
        dVar.a().post(new ci.b(this, gVar, context));
    }

    public static Bundle a(c cVar, wh.s sVar, long j, long j5) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", cVar.f6511b);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", sVar.f22304a);
        bundle.putLong("warm.up.sid", j5);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(sVar.f22305b));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(io.sentry.config.a.a(arrayList)));
        return bundle;
    }

    public static Bundle b(c cVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", cVar.f6511b);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(io.sentry.config.a.a(arrayList)));
        return bundle;
    }

    public static boolean c(c cVar) {
        ig.g gVar = cVar.f6512c;
        return gVar.f11763a.m() && ((Integer) gVar.f11763a.i()).intValue() < 83420000;
    }

    public static boolean d(c cVar) {
        ig.g gVar = cVar.f6512c;
        return gVar.f11763a.m() && ((Integer) gVar.f11763a.i()).intValue() == 0;
    }
}
