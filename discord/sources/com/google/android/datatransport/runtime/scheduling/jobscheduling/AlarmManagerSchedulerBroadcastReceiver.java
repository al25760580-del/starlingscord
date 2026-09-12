package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import bc.e;
import bc.k;
import fc.a;
import java.util.concurrent.Executor;
import n8.f;
import vb.i;
import vb.p;

/* JADX INFO: loaded from: classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5496a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i7 = intent.getExtras().getInt("attemptNumber");
        p.b(context);
        f fVarA = i.a();
        fVarA.h0(queryParameter);
        fVarA.f16511i = a.b(iIntValue);
        if (queryParameter2 != null) {
            fVarA.f16512v = Base64.decode(queryParameter2, 0);
        }
        k kVar = p.a().f21550d;
        ((Executor) kVar.f3126x).execute(new e(i7, 0, kVar, fVarA.J(), new bc.a(0)));
    }
}
