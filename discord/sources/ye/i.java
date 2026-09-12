package ye;

import af.w;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import ze.c0;
import ze.d0;
import ze.s;
import ze.u;
import ze.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4.l f23303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f23304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ze.a f23305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f23306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ze.o f23308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kh.f f23309i;
    public final ze.e j;

    public i(Context context, Activity activity, e4.l lVar, b bVar, h hVar) {
        c0 c0Var;
        ze.f fVar;
        d0 d0Var;
        d0 d0Var2;
        w.h(context, "Null context is not permitted.");
        w.h(lVar, "Api must not be null.");
        w.h(hVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        w.h(applicationContext, "The provided context did not have an application context.");
        this.f23301a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f23302b = attributionTag;
        this.f23303c = lVar;
        this.f23304d = bVar;
        this.f23306f = hVar.f23300b;
        ze.a aVar = new ze.a(lVar, bVar, attributionTag);
        this.f23305e = aVar;
        this.f23308h = new ze.o(this);
        ze.e eVarG = ze.e.g(applicationContext);
        this.j = eVarG;
        this.f23307g = eVarG.E.getAndIncrement();
        this.f23309i = hVar.f23299a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            if (activity instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                WeakHashMap weakHashMap = d0.f23928e;
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                WeakHashMap weakHashMap2 = d0.f23928e;
                WeakReference weakReference = (WeakReference) weakHashMap2.get(fragmentActivity);
                if (weakReference == null || (d0Var2 = (d0) weakReference.get()) == null) {
                    try {
                        fVar = d0Var2;
                        d0 d0Var3 = (d0) supportFragmentManager.E("SLifecycleFragmentImpl");
                        if (d0Var3 == null || d0Var3.isRemoving()) {
                            d0Var = d0Var3;
                            d0 d0Var4 = new d0();
                            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                            aVar2.e(0, d0Var4, "SLifecycleFragmentImpl", 1);
                            aVar2.l(true, true);
                            d0Var = d0Var4;
                        }
                        d0Var = d0Var3;
                        weakHashMap2.put(fragmentActivity, new WeakReference(d0Var));
                        fVar = d0Var;
                    } catch (ClassCastException e10) {
                        throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
                    }
                }
            } else {
                WeakHashMap weakHashMap3 = c0.f23926e;
                WeakReference weakReference2 = (WeakReference) weakHashMap3.get(activity);
                if (weakReference2 == null || (c0Var = (c0) weakReference2.get()) == null) {
                    try {
                        fVar = c0Var;
                        c0 c0Var2 = (c0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                        if (c0Var2 == null || c0Var2.isRemoving()) {
                            c0Var2 = new c0();
                            activity.getFragmentManager().beginTransaction().add(c0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                        }
                        c0 c0Var3 = c0Var2;
                        weakHashMap3.put(activity, new WeakReference(c0Var3));
                        fVar = c0Var3;
                    } catch (ClassCastException e11) {
                        throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e11);
                    }
                }
            }
            fVar = c0Var;
            fVar = d0Var2;
            ze.k kVarF = fVar.f();
            if (kVarF == null) {
                Object obj = xe.e.f22921c;
                kVarF = new ze.k(fVar, eVarG);
            }
            kVarF.f23942x.add(aVar);
            eVarG.b(kVarF);
        }
        eg.a aVar3 = eVarG.K;
        aVar3.sendMessage(aVar3.obtainMessage(7, this));
    }

    public final e4.m a() {
        e4.m mVar = new e4.m(3);
        Set set = Collections.EMPTY_SET;
        if (((s.f) mVar.f7993e) == null) {
            mVar.f7993e = new s.f(0);
        }
        ((s.f) mVar.f7993e).addAll(set);
        Context context = this.f23301a;
        mVar.f7995v = context.getClass().getName();
        mVar.f7994i = context.getPackageName();
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    public final ig.l b(int i7, lh.d dVar) {
        s sVar;
        ig.g gVar = new ig.g();
        ig.l lVar = gVar.f11763a;
        kh.f fVar = this.f23309i;
        ze.e eVar = this.j;
        eg.a aVar = eVar.K;
        int i10 = dVar.f15089b;
        if (i10 != 0) {
            ze.a aVar2 = this.f23305e;
            if (eVar.c()) {
                af.j jVar = (af.j) af.i.a().f446a;
                boolean z5 = true;
                if (jVar != null) {
                    if (jVar.f457e) {
                        boolean z6 = jVar.f458i;
                        ze.m mVar = (ze.m) eVar.G.get(aVar2);
                        if (mVar != null) {
                            c cVar = mVar.f23946g;
                            if (cVar instanceof af.f) {
                                af.f fVar2 = (af.f) cVar;
                                if (fVar2.R == null || fVar2.d()) {
                                    z5 = z6;
                                } else {
                                    af.d dVarA = s.a(mVar, fVar2, i10);
                                    if (dVarA != null) {
                                        mVar.f23954q++;
                                        z5 = dVarA.f403i;
                                    }
                                }
                            }
                        } else {
                            z5 = z6;
                        }
                    }
                    sVar = null;
                }
                sVar = new s(eVar, i10, aVar2, z5 ? System.currentTimeMillis() : 0L, z5 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                sVar = null;
            }
            if (sVar != null) {
                aVar.getClass();
                lVar.b(new c5.f(aVar, 2), sVar);
            }
        }
        aVar.sendMessage(aVar.obtainMessage(4, new u(new x(i7, dVar, gVar, fVar), eVar.F.get(), this)));
        return lVar;
    }
}
