package a3;

import a5.h0;
import a5.w;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.OverScroller;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.t1;
import androidx.core.view.u0;
import androidx.customview.widget.ViewDragHelper;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingResult;
import com.discord.zoom_layout.ZoomLayoutFixed;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.producers.y0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomEngine;
import i.e0;
import io.sentry.SentryLevel;
import io.sentry.w5;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import je.u;
import kotlin.Unit;
import kotlin.collections.d1;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f71d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f72e;

    public /* synthetic */ h(int i7, Object obj) {
        this.f71d = i7;
        this.f72e = obj;
    }

    private final void b() {
        ArrayList arrayList;
        synchronized (((e9.b) this.f72e).f8109d) {
            e9.b bVar = (e9.b) this.f72e;
            ArrayList arrayList2 = (ArrayList) bVar.f8112v;
            arrayList = (ArrayList) bVar.f8111i;
            bVar.f8112v = arrayList;
            bVar.f8111i = arrayList2;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((f9.c) ((e9.a) ((ArrayList) ((e9.b) this.f72e).f8112v).get(i7))).m();
        }
        ((ArrayList) ((e9.b) this.f72e).f8112v).clear();
    }

    private final void c() {
        fs.a aVarC;
        long jNanoTime;
        while (true) {
            fs.c cVar = (fs.c) this.f72e;
            synchronized (cVar) {
                aVarC = cVar.c();
            }
            if (aVarC == null) {
                return;
            }
            fs.b bVar = aVarC.f9412c;
            Intrinsics.checkNotNull(bVar);
            fs.c cVar2 = (fs.c) this.f72e;
            boolean zIsLoggable = fs.c.f9421i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                u4.c cVar3 = bVar.f9414a.f9422a;
                jNanoTime = System.nanoTime();
                io.sentry.config.a.b(aVarC, bVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                fs.c.a(cVar2, aVarC);
                try {
                    Unit unit = Unit.f14616a;
                    if (zIsLoggable) {
                        u4.c cVar4 = bVar.f9414a.f9422a;
                        io.sentry.config.a.b(aVarC, bVar, Intrinsics.stringPlus("finished run in ", io.sentry.config.a.u(System.nanoTime() - jNanoTime)));
                    }
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        u4.c cVar5 = bVar.f9414a.f9422a;
                        io.sentry.config.a.b(aVarC, bVar, Intrinsics.stringPlus("failed a run in ", io.sentry.config.a.u(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                u4.c cVar6 = cVar2.f9422a;
                Intrinsics.checkNotNullParameter(this, "runnable");
                ((ThreadPoolExecutor) cVar6.f20946d).execute(this);
                throw th3;
            }
        }
    }

    private final void d() {
        hg.a aVar = (hg.a) this.f72e;
        synchronized (aVar.f10732a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.d();
                    if (aVar.b()) {
                        aVar.f10734c = 1;
                        aVar.e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e() {
        synchronized (((ig.j) this.f72e).f11772i) {
            ((ig.b) ((ig.j) this.f72e).f11773v).J();
        }
    }

    private final void f() {
        synchronized (((l9.a) this.f72e)) {
            try {
                l9.a aVar = (l9.a) this.f72e;
                aVar.f14985d = false;
                if (aVar.f14983b.now() - aVar.f14986e > 2000) {
                    m9.a aVar2 = ((l9.a) this.f72e).f14987f;
                    if (aVar2.f15474e) {
                        o9.a aVar3 = aVar2.f15475f;
                        if (aVar3 != null) {
                            aVar3.d();
                        }
                    } else {
                        aVar2.a();
                    }
                } else {
                    ((l9.a) this.f72e).d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public sn.n a() throws IOException {
        i iVar = (i) this.f72e;
        sn.n nVar = new sn.n();
        Cursor cursorM = iVar.f74a.m(new g3.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 0));
        while (cursorM.moveToNext()) {
            try {
                nVar.add(Integer.valueOf(cursorM.getInt(0)));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ls.d.k(cursorM, th2);
                    throw th3;
                }
            }
        }
        Unit unit = Unit.f14616a;
        cursorM.close();
        sn.n nVarA = d1.a(nVar);
        if (nVarA.f20326d.isEmpty()) {
            return nVarA;
        }
        if (((i) this.f72e).f80g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        h3.j jVar = ((i) this.f72e).f80g;
        if (jVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        jVar.c();
        return nVarA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set setA;
        Object obj;
        CloseableReference closeableReference;
        int i7;
        boolean zP;
        boolean zIsEmpty;
        int i10 = 2;
        switch (this.f71d) {
            case 0:
                ReentrantReadWriteLock.ReadLock lock = ((i) this.f72e).f74a.f2825h.readLock();
                Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
                lock.lock();
                try {
                    try {
                        if (((i) this.f72e).a() && ((i) this.f72e).f78e.compareAndSet(true, false) && !((i) this.f72e).f74a.h().C().q()) {
                            h3.c cVarC = ((i) this.f72e).f74a.h().C();
                            cVarC.f();
                            try {
                                setA = a();
                                cVarC.B();
                                cVarC.i();
                                lock.unlock();
                                if (setA.isEmpty()) {
                                    return;
                                }
                                i iVar = (i) this.f72e;
                                synchronized (iVar.f82i) {
                                    try {
                                        Iterator it = iVar.f82i.iterator();
                                        while (true) {
                                            p.b bVar = (p.b) it;
                                            if (bVar.hasNext()) {
                                                ((g) ((Map.Entry) bVar.next()).getValue()).a(setA);
                                            } else {
                                                Unit unit = Unit.f14616a;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                return;
                            } catch (Throwable th3) {
                                cVarC.i();
                                throw th3;
                            }
                        }
                        lock.unlock();
                        return;
                    } catch (Throwable th4) {
                        lock.unlock();
                        throw th4;
                    }
                } catch (SQLiteException e10) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                    setA = p0.f14661d;
                } catch (IllegalStateException e11) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                    setA = p0.f14661d;
                }
                break;
            case 1:
                w wVar = (w) this.f72e;
                a5.b bVar2 = wVar.f272v;
                bVar2.E(0);
                BillingResult billingResult = h0.f198i;
                bVar2.D(24, billingResult);
                wVar.d(billingResult);
                return;
            case 2:
                t1 t1Var = (t1) this.f72e;
                t1Var.I = null;
                t1Var.drawableStateChanged();
                return;
            case 3:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f72e;
                if (searchView$SearchAutoComplete.f861y) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f861y = false;
                    return;
                }
                return;
            case 4:
                ((Toolbar) this.f72e).u();
                return;
            case 5:
                androidx.core.widget.d dVar = (androidx.core.widget.d) this.f72e;
                t1 t1Var2 = dVar.f1774i;
                androidx.core.widget.a aVar = dVar.f1772d;
                if (dVar.L) {
                    if (dVar.J) {
                        dVar.J = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f1767e = jCurrentAnimationTimeMillis;
                        aVar.f1769g = -1L;
                        aVar.f1768f = jCurrentAnimationTimeMillis;
                        aVar.f1770h = 0.5f;
                    }
                    if ((aVar.f1769g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f1769g + ((long) aVar.f1771i)) || !dVar.e()) {
                        dVar.L = false;
                        return;
                    }
                    if (dVar.K) {
                        dVar.K = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        t1Var2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f1768f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - aVar.f1768f;
                    aVar.f1768f = jCurrentAnimationTimeMillis2;
                    dVar.N.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f1766d));
                    WeakHashMap weakHashMap = u0.f1729a;
                    t1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 6:
                ((ViewDragHelper) this.f72e).p(0);
                return;
            case 7:
                synchronized (((LiveData) this.f72e).f2309a) {
                    obj = ((LiveData) this.f72e).f2314f;
                    ((LiveData) this.f72e).f2314f = LiveData.k;
                    break;
                }
                ((LiveData) this.f72e).h(obj);
                return;
            case 8:
                synchronized (((y0) this.f72e)) {
                    y0 y0Var = (y0) this.f72e;
                    closeableReference = y0Var.f5110g;
                    i7 = y0Var.f5111h;
                    y0Var.f5110g = null;
                    y0Var.f5112i = false;
                    break;
                }
                if (CloseableReference.z(closeableReference)) {
                    try {
                        y0.l((y0) this.f72e, closeableReference, i7);
                        closeableReference.close();
                    } catch (Throwable th5) {
                        CloseableReference.l(closeableReference);
                        throw th5;
                    }
                }
                y0 y0Var2 = (y0) this.f72e;
                synchronized (y0Var2) {
                    y0Var2.j = false;
                    zP = y0Var2.p();
                    break;
                }
                if (zP) {
                    ((Executor) y0Var2.k.f5101d).execute(new h(8, y0Var2));
                    return;
                }
                return;
            case 9:
                com.rnfs.c cVar = (com.rnfs.c) this.f72e;
                try {
                    com.rnfs.c.a(cVar, cVar.f7080a, cVar.f7082c);
                    cVar.f7080a.f7075h.e(cVar.f7082c);
                    return;
                } catch (Exception e12) {
                    com.rnfs.b bVar3 = cVar.f7082c;
                    bVar3.f7079c = e12;
                    cVar.f7080a.f7075h.e(bVar3);
                    return;
                }
            case 10:
                com.rnfs.k kVar = (com.rnfs.k) this.f72e;
                try {
                    com.rnfs.k.a(kVar, kVar.f7104a);
                    kVar.f7104a.f7101g.c(kVar.f7105b);
                    return;
                } catch (Exception e13) {
                    u uVar = kVar.f7105b;
                    uVar.f13850c = e13;
                    kVar.f7104a.f7101g.c(uVar);
                    return;
                }
            case 11:
                e5.d dVar2 = (e5.d) this.f72e;
                dVar2.measure(View.MeasureSpec.makeMeasureSpec(dVar2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(dVar2.getHeight(), 1073741824));
                dVar2.layout(dVar2.getLeft(), dVar2.getTop(), dVar2.getRight(), dVar2.getBottom());
                return;
            case 12:
                b();
                return;
            case 13:
                fk.n nVar = (fk.n) this.f72e;
                nVar.measure(View.MeasureSpec.makeMeasureSpec(nVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(nVar.getHeight(), 1073741824));
                nVar.layout(nVar.getLeft(), nVar.getTop(), nVar.getRight(), nVar.getBottom());
                return;
            case 14:
                fl.d dVar3 = (fl.d) this.f72e;
                gl.a aVar2 = dVar3.f9306i;
                OverScroller overScroller = dVar3.f9308w;
                if (overScroller.isFinished()) {
                    dVar3.f9305e.b(0);
                    dVar3.f9307v.setIsLongpressEnabled(true);
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    aVar2.c(new dl.c(new ScaledPoint(overScroller.getCurrX(), overScroller.getCurrY()), i10));
                    Intrinsics.checkNotNullParameter(this, "action");
                    i0 i0Var = aVar2.f10099d;
                    Intrinsics.checkNotNullParameter(this, "action");
                    ZoomLayoutFixed zoomLayoutFixed = ((ZoomEngine) i0Var.f1004e).f7021c;
                    if (zoomLayoutFixed != null) {
                        zoomLayoutFixed.postOnAnimation(this);
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("container");
                        throw null;
                    }
                }
                return;
            case 15:
                c();
                return;
            case 16:
                ((gk.i) this.f72e).performLongClick();
                return;
            case 17:
                ((he.i0) this.f72e).d();
                return;
            case 18:
                d();
                return;
            case 19:
                androidx.appcompat.app.a aVar3 = (androidx.appcompat.app.a) this.f72e;
                if ((aVar3.f759w0 & 1) != 0) {
                    aVar3.M(0);
                }
                if ((aVar3.f759w0 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    aVar3.M(108);
                }
                aVar3.f758v0 = false;
                aVar3.f759w0 = 0;
                return;
            case 20:
                e0 e0Var = (e0) this.f72e;
                Window.Callback callback = e0Var.f11201b;
                Menu menuT = e0Var.t();
                n.j jVar = menuT instanceof n.j ? (n.j) menuT : null;
                if (jVar != null) {
                    jVar.w();
                }
                try {
                    menuT.clear();
                    if (!callback.onCreatePanelMenu(0, menuT) || !callback.onPreparePanel(0, null, menuT)) {
                        menuT.clear();
                    }
                    if (jVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (jVar != null) {
                        jVar.v();
                    }
                }
                break;
            case 21:
                e();
                return;
            case 22:
                w5 w5Var = (w5) this.f72e;
                String cacheDirPath = w5Var.getCacheDirPath();
                if (cacheDirPath == null) {
                    w5Var.getLogger().q(SentryLevel.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
                    return;
                }
                if (!w5Var.isEnableAutoSessionTracking()) {
                    w5Var.getLogger().q(SentryLevel.DEBUG, "Session tracking is disabled, bailing from previous session mover.", new Object[0]);
                    return;
                }
                io.sentry.cache.d envelopeDiskCache = w5Var.getEnvelopeDiskCache();
                if (envelopeDiskCache instanceof io.sentry.cache.c) {
                    int i11 = io.sentry.cache.c.G;
                    io.sentry.cache.c cVar2 = (io.sentry.cache.c) envelopeDiskCache;
                    cVar2.d(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
                    cVar2.f12534w.countDown();
                    return;
                }
                return;
            case 23:
                io.sentry.logger.c cVar3 = (io.sentry.logger.c) this.f72e;
                do {
                    cVar3.e();
                } while (cVar3.f12806v.size() >= 100);
                io.sentry.r rVarA = cVar3.f12809y.a();
                try {
                    if (!cVar3.f12806v.isEmpty()) {
                        cVar3.h(false);
                        break;
                    }
                    rVarA.close();
                    return;
                } catch (Throwable th6) {
                    try {
                        rVarA.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            case 24:
                io.sentry.logger.c cVar4 = (io.sentry.logger.c) this.f72e;
                do {
                    cVar4.d();
                } while (cVar4.f12806v.size() >= 1000);
                io.sentry.r rVarA2 = cVar4.f12809y.a();
                try {
                    if (!cVar4.f12806v.isEmpty()) {
                        cVar4.g(false);
                        break;
                    }
                    rVarA2.close();
                    return;
                } catch (Throwable th8) {
                    try {
                        rVarA2.close();
                        throw th8;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                        throw th8;
                    }
                }
            case 25:
                kl.a aVar4 = (kl.a) this.f72e;
                if (aVar4.f14571f) {
                    aVar4.f14567b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                    aVar4.f14570e.postDelayed(aVar4.f14569d, 10000L);
                    return;
                }
                return;
            case 26:
                l8.b bVar4 = (l8.b) this.f72e;
                AtomicInteger atomicInteger = bVar4.f14977x;
                String str = bVar4.f14972d;
                LinkedBlockingQueue linkedBlockingQueue = bVar4.f14975v;
                try {
                    Runnable runnable = (Runnable) linkedBlockingQueue.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        int i12 = l8.b.E;
                        o8.a.q("%s: Worker has nothing to run", str, l8.b.class);
                    }
                    if (zIsEmpty) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    if (linkedBlockingQueue.isEmpty()) {
                        int i13 = l8.b.E;
                        o8.a.o(l8.b.class, "%s: worker finished; %d workers left", str, Integer.valueOf(iDecrementAndGet));
                    } else {
                        bVar4.f();
                    }
                }
            case 27:
                f();
                return;
            case 28:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f72e).f6451i.f16868y;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                lh.d dVar4 = (lh.d) this.f72e;
                dVar4.f15090c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) dVar4.f15092e;
                ViewDragHelper viewDragHelper = bottomSheetBehavior.O;
                if (viewDragHelper != null && viewDragHelper.g()) {
                    dVar4.g(dVar4.f15089b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.H(dVar4.f15089b);
                        return;
                    }
                    return;
                }
        }
    }
}
