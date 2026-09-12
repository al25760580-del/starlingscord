package ze;

import af.i0;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Handler.Callback {
    public static final Status M = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status N = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object O = new Object();
    public static e P;
    public final AtomicInteger E;
    public final AtomicInteger F;
    public final ConcurrentHashMap G;
    public k H;
    public final s.f I;
    public final s.f J;
    public final eg.a K;
    public volatile boolean L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23931e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public af.k f23932i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public cf.b f23933v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f23934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xe.e f23935x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4.r f23936y;

    public e(Context context, Looper looper) {
        xe.e eVar = xe.e.f22922d;
        this.f23930d = 10000L;
        this.f23931e = false;
        this.E = new AtomicInteger(1);
        this.F = new AtomicInteger(0);
        this.G = new ConcurrentHashMap(5, 0.75f, 1);
        this.H = null;
        this.I = new s.f(0);
        this.J = new s.f(0);
        this.L = true;
        this.f23934w = context;
        eg.a aVar = new eg.a(looper, this);
        Looper.getMainLooper();
        this.K = aVar;
        this.f23935x = eVar;
        this.f23936y = new e4.r(2);
        PackageManager packageManager = context.getPackageManager();
        if (ff.c.f9155e == null) {
            ff.c.f9155e = Boolean.valueOf(ff.c.c() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (ff.c.f9155e.booleanValue()) {
            this.L = false;
        }
        aVar.sendMessage(aVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (O) {
            try {
                e eVar = P;
                if (eVar != null) {
                    eVar.F.incrementAndGet();
                    eg.a aVar = eVar.K;
                    aVar.sendMessageAtFrontOfQueue(aVar.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status e(a aVar, xe.b bVar) {
        return new Status(17, a3.e.m("API: ", (String) aVar.f23914b.f7990i, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.f22911i, bVar);
    }

    public static e g(Context context) {
        e eVar;
        HandlerThread handlerThread;
        synchronized (O) {
            if (P == null) {
                synchronized (i0.f447g) {
                    try {
                        handlerThread = i0.f449i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            i0.f449i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = i0.f449i;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = xe.e.f22921c;
                P = new e(applicationContext, looper);
            }
            eVar = P;
        }
        return eVar;
    }

    public final void b(k kVar) {
        synchronized (O) {
            try {
                if (this.H != kVar) {
                    this.H = kVar;
                    this.I.clear();
                }
                this.I.addAll(kVar.f23942x);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        if (this.f23931e) {
            return false;
        }
        af.j jVar = (af.j) af.i.a().f446a;
        if (jVar != null && !jVar.f457e) {
            return false;
        }
        int i7 = ((SparseIntArray) this.f23936y.f8034e).get(203400000, -1);
        return i7 == -1 || i7 == 0;
    }

    public final boolean d(xe.b bVar, int i7) {
        xe.e eVar = this.f23935x;
        eVar.getClass();
        Context context = this.f23934w;
        if (!hf.a.h(context)) {
            int i10 = bVar.f22910e;
            PendingIntent activity = bVar.f22911i;
            if (!((i10 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = eVar.a(context, null, i10);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i11 = GoogleApiActivity.f5929e;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i7);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i10, PendingIntent.getActivity(context, 0, intent, wf.d.f22226a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final m f(ye.i iVar) {
        a aVar = iVar.f23305e;
        ConcurrentHashMap concurrentHashMap = this.G;
        m mVar = (m) concurrentHashMap.get(aVar);
        if (mVar == null) {
            mVar = new m(this, iVar);
            concurrentHashMap.put(aVar, mVar);
        }
        if (mVar.f23946g.k()) {
            this.J.add(aVar);
        }
        mVar.l();
        return mVar;
    }

    public final void h(xe.b bVar, int i7) {
        if (d(bVar, i7)) {
            return;
        }
        eg.a aVar = this.K;
        aVar.sendMessage(aVar.obtainMessage(5, i7, 0, bVar));
    }

    /* JADX WARN: Code duplicated, block: B:165:0x032d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0333  */
    /* JADX WARN: Code duplicated, block: B:169:0x0351  */
    /* JADX WARN: Code duplicated, block: B:171:0x035b  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v5 ze.m, still in use, count: 2, list:
          (r5v5 ze.m) from 0x0325: IGET (r5v5 ze.m) A[WRAPPED] (LINE:806) ze.m.l int
          (r5v5 ze.m) from 0x032b: PHI (r5 I:??) = (r5v2 ze.m), (r5v5 ze.m) binds: [B:163:0x032a, B:218:0x032b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r21) {
        /*
            Method dump skipped, instruction units count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.e.handleMessage(android.os.Message):boolean");
    }
}
