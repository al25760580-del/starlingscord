package e9;

import a3.h;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.b4;
import e4.m;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import np.l;
import sh.e1;
import sh.g0;
import sh.o;
import sh.s;
import sh.s1;
import sh.u1;
import th.g;
import up.e;
import zp.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements xb.b, l, g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static b f8108x;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8110e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f8111i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f8112v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f8113w;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f8109d = obj;
        this.f8110e = obj2;
        this.f8111i = obj3;
        this.f8112v = obj4;
        this.f8113w = obj5;
    }

    @Override // np.l
    public l F(up.b classId, e eVar) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return ((b4) this.f8109d).F(classId, eVar);
    }

    @Override // np.l
    public void G(e eVar, up.b enumClassId, e enumEntryName) {
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        ((b4) this.f8109d).G(eVar, enumClassId, enumEntryName);
    }

    @Override // np.l
    public void K(e eVar, f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((b4) this.f8109d).K(eVar, value);
    }

    @Override // np.l
    public void M(e eVar, Object obj) {
        ((b4) this.f8109d).M(eVar, obj);
    }

    @Override // th.g
    public Object a() {
        return new o(((u1) ((pf.b) this.f8109d).f18027e).f20202a, (s) ((th.f) this.f8110e).a(), (s1) ((th.f) this.f8111i).a(), (g0) ((th.f) this.f8112v).a(), (e1) ((th.f) this.f8113w).a());
    }

    public void b(f9.c cVar) {
        synchronized (this.f8109d) {
            ((ArrayList) this.f8111i).remove(cVar);
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ac.c((Executor) ((Provider) this.f8109d).get(), (wb.d) ((Provider) this.f8110e).get(), (m) ((m) this.f8111i).get(), (cc.d) ((Provider) this.f8112v).get(), (dc.c) ((Provider) this.f8113w).get());
    }

    @Override // np.l
    public void i() {
        ((b4) this.f8110e).i();
        ((b4) this.f8112v).f((e) this.f8113w, new zp.a((wo.b) CollectionsKt.Z((ArrayList) this.f8111i)));
    }

    @Override // np.l
    public np.m m(e eVar) {
        return ((b4) this.f8109d).m(eVar);
    }

    public b(Boolean bool, Double d6) {
        this(bool, d6, (Double) null, Boolean.FALSE, (Double) null);
    }

    public b() {
        this.f8109d = new Object();
        this.f8113w = new h(12, this);
        this.f8111i = new ArrayList();
        this.f8112v = new ArrayList();
        this.f8110e = new Handler(Looper.getMainLooper());
    }

    public b(Boolean bool, Double d6, Double d7, Boolean bool2, Double d8) {
        this.f8109d = bool;
        this.f8110e = d6;
        this.f8111i = d7;
        this.f8112v = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f8113w = d8;
    }

    public b(b4 b4Var, b4 b4Var2, e eVar, ArrayList arrayList) {
        this.f8110e = b4Var;
        this.f8112v = b4Var2;
        this.f8113w = eVar;
        this.f8111i = arrayList;
        this.f8109d = b4Var;
    }
}
