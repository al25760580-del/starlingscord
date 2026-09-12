package com.google.android.gms.internal.play_billing;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.util.Consumer;
import androidx.customview.widget.ViewDragHelper;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.budiyev.android.codescanner.CodeScanner;
import com.discord.billing.BillingManager;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6142e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f6143i;

    public /* synthetic */ u0(int i7, Object obj, Object obj2) {
        this.f6141d = i7;
        this.f6142e = obj;
        this.f6143i = obj2;
    }

    private final void a() {
        sh.r rVar = (sh.r) this.f6142e;
        sh.w wVar = (sh.w) this.f6143i;
        synchronized (rVar) {
            Iterator it = new HashSet(rVar.f20159a).iterator();
            while (it.hasNext()) {
                ((AssetPackStateUpdateListener) it.next()).a(wVar);
            }
        }
    }

    private final void b() {
        we.i iVar = (we.i) this.f6142e;
        int i7 = ((we.j) this.f6143i).f22212a;
        synchronized (iVar) {
            we.j jVar = (we.j) iVar.f22210w.get(i7);
            if (jVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i7);
                iVar.f22210w.remove(i7);
                jVar.b(new ag.b(8, "Timed out waiting for response", null));
                iVar.c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, ze.f] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, ze.f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thC;
        Exception exc;
        af.g gVar;
        boolean z5 = false;
        e4.o oVar = null;
        FileOutputStream fileOutputStream = null;
        switch (this.f6141d) {
            case 0:
                we.k kVar = (we.k) this.f6143i;
                x0 x0Var = (x0) this.f6142e;
                if ((x0Var instanceof b1) && (thC = ((b1) x0Var).c()) != null) {
                    kVar.d(thC);
                    return;
                }
                try {
                    boolean zIsDone = x0Var.isDone();
                    x0 x0Var2 = x0Var;
                    if (!zIsDone) {
                        throw new IllegalStateException(z1.p("Future was expected to be done: %s", x0Var));
                    }
                    while (true) {
                        try {
                            Object obj = x0Var2.get();
                            if (z5) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj;
                            int iIntValue = num.intValue();
                            a5.e0 e0Var = (a5.e0) kVar.f22222e;
                            if (iIntValue <= 0) {
                                ((Runnable) kVar.f22221d).run();
                                return;
                            }
                            int i7 = kVar.f22219b;
                            int iIntValue2 = num.intValue();
                            e0Var.getClass();
                            BillingResult billingResultA = a5.h0.a(iIntValue2, "Billing override value was set by a license tester.");
                            e0Var.O(93, i7, billingResultA);
                            ((Consumer) kVar.f22220c).accept(billingResultA);
                            return;
                        } catch (InterruptedException unused) {
                            z5 = true;
                            x0Var2 = x0Var2;
                        } catch (Throwable th2) {
                            if (z5) {
                                Thread.currentThread().interrupt();
                            }
                            throw th2;
                        }
                    }
                } catch (ExecutionException e10) {
                    kVar.d(e10.getCause());
                    return;
                } catch (Throwable th3) {
                    kVar.d(th3);
                    return;
                }
                break;
            case 1:
                a5.b bVar = (a5.b) this.f6142e;
                com.discord.billing.b bVar2 = (com.discord.billing.b) this.f6143i;
                BillingResult billingResult = a5.h0.f198i;
                bVar.u(24, 9, billingResult);
                p pVar = s.f6118e;
                bVar2.b(billingResult, w.f6169w);
                return;
            case 2:
                a5.b bVar3 = (a5.b) this.f6142e;
                BillingManager.C01061.C00181.C00191 c00191 = (BillingManager.C01061.C00181.C00191) this.f6143i;
                BillingResult billingResult2 = a5.h0.f198i;
                bVar3.u(24, 13, billingResult2);
                c00191.onBillingConfigResponse(billingResult2, null);
                return;
            case 3:
                a5.b bVar4 = (a5.b) this.f6142e;
                a5.k kVar2 = (a5.k) this.f6143i;
                BillingResult billingResult3 = a5.h0.f198i;
                bVar4.u(24, 7, billingResult3);
                p pVar2 = s.f6118e;
                w wVar = w.f6169w;
                kVar2.a(billingResult3, new QueryProductDetailsResult(wVar, wVar));
                return;
            case 4:
                try {
                    ((c5.c) this.f6143i).f3479e.put((c5.n) this.f6142e);
                    return;
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 5:
                w3.e eVar = ((d4.b) this.f6143i).f7583d.f22051f;
                String str = (String) this.f6142e;
                synchronized (eVar.k) {
                    try {
                        w3.r rVarC = eVar.c(str);
                        if (rVarC != null) {
                            oVar = rVarC.f22058i;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (oVar == null || !oVar.b()) {
                    return;
                }
                synchronized (((d4.b) this.f6143i).f7585i) {
                    ((d4.b) this.f6143i).f7588x.put(a.a.h(oVar), oVar);
                    d4.b bVar5 = (d4.b) this.f6143i;
                    ((d4.b) this.f6143i).f7589y.put(a.a.h(oVar), a4.l.a(bVar5.E, oVar, bVar5.f7584e.f10328b, bVar5));
                    break;
                }
                return;
            case 6:
                f3.f fVar = (f3.f) this.f6143i;
                ArrayList arrayList = (ArrayList) this.f6142e;
                fVar.e(arrayList);
                File file = fVar.f8811f;
                e4.m mVar = new e4.m(file);
                File file2 = (File) mVar.f7994i;
                try {
                    FileOutputStream fileOutputStreamK = mVar.K();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStreamK);
                        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                        xmlSerializerNewSerializer.setOutput(bufferedOutputStream, "UTF_8");
                        xmlSerializerNewSerializer.startDocument(null, Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "share_targets");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            f3.d.h(xmlSerializerNewSerializer, (f3.g) it.next());
                        }
                        xmlSerializerNewSerializer.endTag(null, "share_targets");
                        xmlSerializerNewSerializer.endDocument();
                        bufferedOutputStream.flush();
                        fileOutputStreamK.flush();
                        try {
                            fileOutputStreamK.getFD().sync();
                            z5 = true;
                        } catch (IOException unused3) {
                        }
                        if (!z5) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStreamK.close();
                            break;
                        } catch (IOException e11) {
                            Log.e("AtomicFile", "Failed to close file output stream", e11);
                        }
                        e4.m.I(file2, file);
                        return;
                    } catch (Exception e12) {
                        exc = e12;
                        fileOutputStream = fileOutputStreamK;
                        Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.getFD().sync();
                            } catch (IOException unused4) {
                                Log.e("AtomicFile", "Failed to sync file output stream");
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e13) {
                                Log.e("AtomicFile", "Failed to close file output stream", e13);
                            }
                            if (!file2.delete()) {
                                Log.e("AtomicFile", "Failed to delete new file " + file2);
                            }
                            break;
                        }
                        throw new RuntimeException("Failed to write to file " + file, exc);
                    }
                } catch (Exception e14) {
                    exc = e14;
                }
                break;
            case 7:
                f3.f fVar2 = (f3.f) this.f6143i;
                s.e eVar2 = fVar2.f8807b;
                try {
                    f3.f.f((File) this.f6142e);
                    f3.f.f(fVar2.f8812g);
                    eVar2.putAll(f3.d.c(fVar2.f8806a, fVar2.f8811f));
                    fVar2.e(new ArrayList(eVar2.values()));
                    return;
                } catch (Exception e15) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e15);
                    return;
                }
            case 8:
                if (((o0.h) this.f6142e).f17096d instanceof o0.a) {
                    return;
                }
                try {
                    ((Runnable) this.f6143i).run();
                    ((o0.h) this.f6142e).j(null);
                    return;
                } catch (Exception e16) {
                    ((o0.h) this.f6142e).k(e16);
                    return;
                }
            case 9:
                if (((f4.q) this.f6143i).f8851d.f9490d instanceof g4.a) {
                    return;
                }
                try {
                    v3.h hVar = (v3.h) ((g4.j) this.f6142e).get();
                    if (hVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((f4.q) this.f6143i).f8853i.f8000c + ") but did not provide ForegroundInfo");
                    }
                    v3.q.d().a(f4.q.f8850y, "Updating notification for " + ((f4.q) this.f6143i).f8853i.f8000c);
                    f4.q qVar = (f4.q) this.f6143i;
                    g4.j jVar = qVar.f8851d;
                    f4.s sVar = qVar.f8855w;
                    Context context = qVar.f8852e;
                    UUID uuid = qVar.f8854v.f21414e.f2813a;
                    sVar.getClass();
                    g4.j jVar2 = new g4.j();
                    sVar.f8862a.a(new f4.r(sVar, jVar2, uuid, hVar, context));
                    jVar.l(jVar2);
                    return;
                } catch (Throwable th5) {
                    ((f4.q) this.f6143i).f8851d.k(th5);
                    return;
                }
            case 10:
                if (((CodeScanner) this.f6143i).f3907s) {
                    ((CodeScanner) this.f6143i).f3894d.setPreviewSize((h5.q) this.f6142e);
                    CodeScanner codeScanner = (CodeScanner) this.f6143i;
                    codeScanner.f3894d.setAutoFocusEnabled(codeScanner.f3909u);
                    CodeScanner codeScanner2 = (CodeScanner) this.f6143i;
                    codeScanner2.f3894d.setFlashEnabled(codeScanner2.f3910v);
                    ((CodeScanner) this.f6143i).h();
                    return;
                }
                return;
            case 11:
                ((a5.z) this.f6142e).accept(this.f6143i);
                return;
            case 12:
                ig.i iVar = (ig.i) this.f6143i;
                ig.l lVar = iVar.f11769v;
                try {
                    Task task = (Task) iVar.f11768i.f((Task) this.f6142e);
                    if (task == null) {
                        iVar.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    f4.n nVar = ig.h.f11765b;
                    task.e(nVar, iVar);
                    task.c(nVar, iVar);
                    task.a(nVar, iVar);
                    return;
                } catch (ig.e e17) {
                    if (e17.getCause() instanceof Exception) {
                        lVar.p((Exception) e17.getCause());
                        return;
                    } else {
                        lVar.p(e17);
                        return;
                    }
                } catch (Exception e18) {
                    lVar.p(e18);
                    return;
                }
            case 13:
                synchronized (((ig.j) this.f6143i).f11772i) {
                    ig.c cVar = (ig.c) ((ig.j) this.f6143i).f11773v;
                    Exception excH = ((Task) this.f6142e).h();
                    af.w.g(excH);
                    cVar.onFailure(excH);
                    break;
                }
                return;
            case 14:
                ig.j jVar3 = (ig.j) this.f6143i;
                try {
                    ig.l lVarI = ((ig.f) jVar3.f11772i).i(((Task) this.f6142e).i());
                    f4.n nVar2 = ig.h.f11765b;
                    lVarI.e(nVar2, jVar3);
                    lVarI.c(nVar2, jVar3);
                    lVarI.a(nVar2, jVar3);
                    return;
                } catch (ig.e e19) {
                    if (e19.getCause() instanceof Exception) {
                        jVar3.onFailure((Exception) e19.getCause());
                        return;
                    } else {
                        jVar3.onFailure(e19);
                        return;
                    }
                } catch (CancellationException unused5) {
                    jVar3.J();
                    return;
                } catch (Exception e20) {
                    jVar3.onFailure(e20);
                    return;
                }
            case 15:
                ue.i iVar2 = (ue.i) this.f6142e;
                j4.e eVar3 = (j4.e) iVar2.f21117d;
                try {
                    if (eVar3.g(((Callable) this.f6143i).call())) {
                        return;
                    } else {
                        throw new IllegalStateException("Cannot set the result of a completed task.");
                    }
                } catch (CancellationException unused6) {
                    if (!eVar3.f()) {
                        throw new IllegalStateException("Cannot cancel a completed task.");
                    }
                    return;
                } catch (Exception e21) {
                    iVar2.s(e21);
                    return;
                }
            case 16:
                ViewDragHelper viewDragHelper = ((SwipeDismissBehavior) this.f6143i).f6264a;
                if (viewDragHelper == null || !viewDragHelper.g()) {
                    return;
                }
                ((View) this.f6142e).postOnAnimation(this);
                return;
            case 17:
                sh.p pVar3 = (sh.p) this.f6142e;
                sh.w wVar2 = (sh.w) this.f6143i;
                synchronized (pVar3) {
                    Iterator it2 = new HashSet(pVar3.f20781d).iterator();
                    while (it2.hasNext()) {
                        ((AssetPackStateUpdateListener) it2.next()).a(wVar2);
                    }
                }
                return;
            case 18:
                a();
                return;
            case 19:
                ((sh.x0) this.f6142e).f20232b.b((Intent) this.f6143i);
                return;
            case 20:
                sh.m1 m1Var = (sh.m1) this.f6142e;
                sh.l1 l1Var = (sh.l1) this.f6143i;
                m1Var.f20105a.a(l1Var.f20092d, l1Var.f20093e, (String) l1Var.f10850b);
                return;
            case 21:
                w2.a aVar = (w2.a) this.f6143i;
                Object obj2 = this.f6142e;
                if (aVar.f22001i.get()) {
                    ue.d dVar = aVar.f22003w;
                    if (dVar.f21110h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar.f21110h = null;
                        dVar.b();
                    }
                } else {
                    ue.d dVar2 = aVar.f22003w;
                    if (dVar2.f21109g != aVar) {
                        if (dVar2.f21110h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar2.f21110h = null;
                            dVar2.b();
                        }
                    } else if (!dVar2.f21105c) {
                        SystemClock.uptimeMillis();
                        dVar2.f21109g = null;
                        v2.a aVar2 = dVar2.f21103a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.h(obj2);
                            } else {
                                aVar2.i(obj2);
                            }
                        }
                    }
                }
                aVar.f22000e = 3;
                return;
            case 22:
                String str2 = (String) this.f6142e;
                w3.r rVar = (w3.r) this.f6143i;
                e4.o oVar2 = rVar.f22058i;
                try {
                    try {
                        v3.o oVar3 = (v3.o) rVar.M.get();
                        if (oVar3 == null) {
                            v3.q.d().b(w3.r.O, oVar2.f8000c + " returned a null result. Treating it as a failure.");
                        } else {
                            v3.q.d().a(w3.r.O, oVar2.f8000c + " returned a " + oVar3 + ".");
                            rVar.f22061x = oVar3;
                        }
                    } catch (Throwable th6) {
                        rVar.b();
                        throw th6;
                    }
                    break;
                } catch (InterruptedException e22) {
                    e = e22;
                    v3.q.d().c(w3.r.O, str2 + " failed because it threw an exception/error", e);
                } catch (CancellationException e23) {
                    v3.q qVarD = v3.q.d();
                    String str3 = w3.r.O;
                    String str4 = str2 + " was cancelled";
                    if (qVarD.f21419a <= 4) {
                        Log.i(str3, str4, e23);
                    }
                } catch (ExecutionException e24) {
                    e = e24;
                    v3.q.d().c(w3.r.O, str2 + " failed because it threw an exception/error", e);
                }
                rVar.b();
                return;
            case 23:
                b();
                return;
            case 24:
                ((Application) this.f6142e).unregisterActivityLifecycleCallbacks((x0.d) this.f6143i);
                return;
            case 25:
                v3.q qVarD2 = v3.q.d();
                String str5 = x3.a.f22607e;
                StringBuilder sb2 = new StringBuilder("Scheduling work ");
                e4.o oVar4 = (e4.o) this.f6142e;
                sb2.append(oVar4.f7998a);
                qVarD2.a(str5, sb2.toString());
                ((x3.a) this.f6143i).f22608a.d(oVar4);
                return;
            case 26:
                xe.b bVar6 = (xe.b) this.f6142e;
                io.sentry.h4 h4Var = (io.sentry.h4) this.f6143i;
                ye.c cVar2 = (ye.c) h4Var.f12711b;
                ze.m mVar2 = (ze.m) ((ze.e) h4Var.f12715f).G.get((ze.a) h4Var.f12712c);
                if (mVar2 == null) {
                    return;
                }
                if (bVar6.f22910e != 0) {
                    mVar2.n(bVar6, null);
                    return;
                }
                h4Var.f12710a = true;
                if (cVar2.k()) {
                    if (!h4Var.f12710a || (gVar = (af.g) h4Var.f12713d) == null) {
                        return;
                    }
                    cVar2.f(gVar, (Set) h4Var.f12714e);
                    return;
                }
                try {
                    cVar2.f(null, cVar2.a());
                    return;
                } catch (SecurityException e25) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e25);
                    cVar2.b("Failed to get service from broker.");
                    mVar2.n(new xe.b(10, null, null), null);
                    return;
                }
            default:
                if (((ze.k) this.f6143i).f23938e) {
                    xe.b bVar7 = ((ze.a0) this.f6142e).f23918b;
                    if (bVar7.f22910e != 0 && bVar7.f22911i != null) {
                        ze.k kVar3 = (ze.k) this.f6143i;
                        ?? r5 = kVar3.f23937d;
                        Activity activityA = kVar3.a();
                        PendingIntent pendingIntent = bVar7.f22911i;
                        af.w.g(pendingIntent);
                        int i10 = ((ze.a0) this.f6142e).f23917a;
                        int i11 = GoogleApiActivity.f5929e;
                        Intent intent = new Intent(activityA, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i10);
                        intent.putExtra("notify_manager", false);
                        r5.startActivityForResult(intent, 1);
                        return;
                    }
                    ze.k kVar4 = (ze.k) this.f6143i;
                    if (kVar4.f23941w.a(kVar4.a(), null, bVar7.f22910e) != null) {
                        ze.k kVar5 = (ze.k) this.f6143i;
                        kVar5.f23941w.h(kVar5.a(), kVar5.f23937d, bVar7.f22910e, (ze.k) this.f6143i);
                        return;
                    }
                    if (bVar7.f22910e != 18) {
                        ze.k kVar6 = (ze.k) this.f6143i;
                        int i12 = ((ze.a0) this.f6142e).f23917a;
                        kVar6.f23939i.set(null);
                        kVar6.f23943y.h(bVar7, i12);
                        return;
                    }
                    ze.k kVar7 = (ze.k) this.f6143i;
                    xe.e eVar4 = kVar7.f23941w;
                    Activity activityA2 = kVar7.a();
                    eVar4.getClass();
                    ProgressBar progressBar = new ProgressBar(activityA2, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activityA2);
                    builder.setView(progressBar);
                    builder.setMessage(af.n.b(activityA2, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    xe.e.f(activityA2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", kVar7);
                    ze.k kVar8 = (ze.k) this.f6143i;
                    Context applicationContext = kVar8.a().getApplicationContext();
                    ze.b0 b0Var = new ze.b0(this, alertDialogCreate);
                    kVar8.f23941w.getClass();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    ze.q qVar2 = new ze.q(b0Var);
                    wf.c.g(applicationContext, qVar2, intentFilter);
                    qVar2.a(applicationContext);
                    if (xe.i.a(applicationContext)) {
                        return;
                    }
                    b0Var.a();
                    qVar2.b();
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f6141d) {
            case 0:
                e4.m mVar = new e4.m(u0.class.getSimpleName(), 12);
                we.k kVar = (we.k) this.f6143i;
                e4.e eVar = new e4.e((char) 0, 5);
                ((e4.e) mVar.f7995v).f7972i = eVar;
                mVar.f7995v = eVar;
                eVar.f7971e = kVar;
                return mVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u0(Object obj, Object obj2, int i7, boolean z5) {
        this.f6141d = i7;
        this.f6143i = obj;
        this.f6142e = obj2;
    }

    public u0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z5) {
        this.f6141d = 16;
        this.f6143i = swipeDismissBehavior;
        this.f6142e = view;
    }
}
