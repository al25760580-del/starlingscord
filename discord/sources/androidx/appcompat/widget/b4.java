package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b4 implements xb.b, np.l, th.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f910e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f911i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f915y;

    public /* synthetic */ b4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f909d = obj;
        this.f910e = obj2;
        this.f911i = obj3;
        this.f912v = obj4;
        this.f913w = obj5;
        this.f914x = obj6;
        this.f915y = obj7;
    }

    @Override // np.l
    public np.l F(up.b classId, up.e eVar) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        ArrayList arrayList = new ArrayList();
        af.c cVar = (af.c) this.f909d;
        vo.o0 NO_SOURCE = vo.n0.C;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        b4 b4VarG = cVar.G(classId, NO_SOURCE, arrayList);
        Intrinsics.checkNotNull(b4VarG);
        return new e9.b(b4VarG, this, eVar, arrayList);
    }

    @Override // np.l
    public void G(up.e eVar, up.b enumClassId, up.e enumEntryName) {
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        f(eVar, new zp.i(enumClassId, enumEntryName));
    }

    @Override // np.l
    public void K(up.e eVar, zp.f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        f(eVar, new zp.t(value));
    }

    @Override // np.l
    public void M(up.e eVar, Object obj) {
        f(eVar, af.c.g((af.c) this.f909d, eVar, obj));
    }

    @Override // th.g
    public Object a() {
        String str = (String) ((th.f) this.f909d).a();
        Object objA = ((th.f) this.f910e).a();
        Object objA2 = ((th.f) this.f911i).a();
        Context context = ((sh.u1) ((pf.b) this.f912v).f18027e).f20202a;
        Object objA3 = ((th.f) this.f913w).a();
        return new sh.x0(str != null ? new File(context.getExternalFilesDir(null), str) : context.getExternalFilesDir(null), (sh.p) objA, (sh.p0) objA2, context, (sh.h1) objA3, new th.f(new pf.b(8, (th.f) this.f914x)), (sh.g1) ((th.f) this.f915y).a());
    }

    public void b(Activity activity) {
        io.sentry.r rVarA = ((io.sentry.util.a) this.f914x).a();
        try {
            if (!d()) {
                rVarA.close();
                return;
            }
            e("FrameMetricsAggregator.add", new io.sentry.android.core.b(this, activity, 0));
            io.sentry.android.core.c cVarC = c();
            if (cVarC != null) {
                ((WeakHashMap) this.f912v).put(activity, cVarC);
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public io.sentry.android.core.c c() {
        int i7;
        int i10;
        SparseIntArray sparseIntArray;
        if (!d() || !((Boolean) ((io.sentry.util.e) this.f915y).a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) ((FrameMetricsAggregator) ((io.sentry.util.e) this.f909d).a()).f1460a.f13849b;
        int i11 = 0;
        if (sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i7 = 0;
            i10 = 0;
        } else {
            int i12 = 0;
            i7 = 0;
            i10 = 0;
            while (i11 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i11);
                int iValueAt = sparseIntArray.valueAt(i11);
                i12 += iValueAt;
                if (iKeyAt > 700) {
                    i10 += iValueAt;
                } else if (iKeyAt > 16) {
                    i7 += iValueAt;
                }
                i11++;
            }
            i11 = i12;
        }
        return new io.sentry.android.core.c(i11, i7, i10);
    }

    public boolean d() {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f910e;
        return ((Boolean) ((io.sentry.util.e) this.f915y).a()).booleanValue() && sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
    }

    public void e(String str, Runnable runnable) {
        try {
            if (io.sentry.android.core.internal.util.e.f12290a.c()) {
                runnable.run();
                return;
            }
            io.sentry.android.core.m0 m0Var = (io.sentry.android.core.m0) this.f913w;
            ((Handler) m0Var.f12350d).post(new io.sentry.android.core.c1(this, runnable, str, 1));
        } catch (Throwable unused) {
            if (str != null) {
                ((SentryAndroidOptions) this.f910e).getLogger().q(SentryLevel.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    public void f(up.e eVar, zp.g value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((HashMap) this.f910e).put(eVar, value);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new bc.k((Context) ((Provider) this.f909d).get(), (wb.d) ((Provider) this.f910e).get(), (cc.d) ((Provider) this.f911i).get(), (e4.m) ((e4.m) this.f912v).get(), (Executor) ((Provider) this.f913w).get(), (dc.c) ((Provider) this.f914x).get(), new q8.c(), new pa.s(), (cc.c) ((Provider) this.f915y).get(), 0);
    }

    @Override // np.l
    public void i() {
        af.c cVar = (af.c) this.f911i;
        up.b annotationClassId = (up.b) this.f913w;
        HashMap arguments = (HashMap) this.f910e;
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        boolean zE = false;
        if (Intrinsics.areEqual(annotationClassId, ro.b.f19505b)) {
            Object obj = arguments.get(up.e.e("value"));
            zp.t tVar = obj instanceof zp.t ? (zp.t) obj : null;
            if (tVar != null) {
                Object obj2 = tVar.f24066a;
                zp.r rVar = obj2 instanceof zp.r ? (zp.r) obj2 : null;
                if (rVar != null) {
                    zE = cVar.E(rVar.f24075a.f24064a);
                }
            }
        }
        if (zE || cVar.E(annotationClassId)) {
            return;
        }
        ((List) this.f914x).add(new wo.c(((vo.f) this.f912v).j(), arguments, (vo.n0) this.f915y));
    }

    @Override // np.l
    public np.m m(up.e eVar) {
        return new e4.i((af.c) this.f909d, eVar, this);
    }
}
