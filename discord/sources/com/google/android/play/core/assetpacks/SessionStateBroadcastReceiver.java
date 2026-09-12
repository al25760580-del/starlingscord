package com.google.android.play.core.assetpacks;

import a5.o;
import a5.t;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import sh.a;
import sh.i0;
import sh.m0;
import sh.w;
import th.f;
import v3.a0;
import v3.g;
import v3.y;
import vi.d;
import w3.k;

/* JADX INFO: loaded from: classes3.dex */
public final class SessionStateBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f6505a = new o("SessionStateBroadcastReceiver", 2);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.FLAGS");
        o oVar = f6505a;
        if (bundleExtra == null) {
            oVar.b("Empty flags bundle received from broadcast.", new Object[0]);
            return;
        }
        if (bundleExtra.getBoolean("enableWorkManager")) {
            Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
            if (bundleExtra2 == null) {
                oVar.b("Empty bundle received from broadcast.", new Object[0]);
                return;
            }
            i0 i0Var = (i0) ((f) m0.b(context).f6613v).a();
            Bundle bundleExtra3 = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_NOTIFICATION_OPTIONS");
            f fVar = i0Var.f20063f;
            o oVar2 = i0.f20057i;
            ArrayList<String> stringArrayList = bundleExtra2.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                oVar2.b("Corrupt packStateBundle.", new Object[0]);
                return;
            }
            boolean z5 = bundleExtra.getBoolean("enableExpeditedWork");
            if (z5 && bundleExtra3 == null) {
                oVar2.b("Notification options must be present when expedited work is enabled.", new Object[0]);
                return;
            }
            w wVarD = AssetPackState.d(bundleExtra2, stringArrayList.get(0), i0Var.f20059b, i0Var.f20060c, new d(15, (byte) 0));
            oVar2.a("ExtractionWorkScheduler.scheduleExtraction: %s", wVarD);
            if (((PendingIntent) bundleExtra2.getParcelable("confirmation_intent")) != null) {
                i0Var.f20061d.getClass();
            }
            ((Executor) i0Var.f20065h.a()).execute(new t(i0Var, bundleExtra2, wVarD, 12));
            if (!z5) {
                n8.f fVar2 = new n8.f(ExtractionWorker.class);
                g inputData = a.b(bundleExtra2, new Bundle());
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                ((e4.o) fVar2.f16512v).f8002e = inputData;
                a0 a0Var = (a0) fVar.a();
                v3.t tVarI = fVar2.I();
                a0Var.getClass();
                new k((w3.o) a0Var, "extractAssetPacks", 3, Collections.singletonList(tVarI)).A0();
                return;
            }
            n8.f fVar3 = new n8.f(ExtractionWorker.class);
            y policy = y.f21432d;
            Intrinsics.checkNotNullParameter(policy, "policy");
            e4.o oVar3 = (e4.o) fVar3.f16512v;
            oVar3.f8012q = true;
            oVar3.f8013r = policy;
            g inputData2 = a.b(bundleExtra2, bundleExtra3);
            Intrinsics.checkNotNullParameter(inputData2, "inputData");
            ((e4.o) fVar3.f16512v).f8002e = inputData2;
            a0 a0Var2 = (a0) fVar.a();
            v3.t tVarI2 = fVar3.I();
            a0Var2.getClass();
            new k((w3.o) a0Var2, "extractAssetPacks", 3, Collections.singletonList(tVarI2)).A0();
        }
    }
}
