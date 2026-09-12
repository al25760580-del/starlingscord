package androidx.work.impl;

import a3.b;
import android.content.Context;
import e4.c;
import e4.e;
import e4.f;
import e4.i;
import e4.l;
import e4.m;
import e4.p;
import e4.r;
import g3.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile p k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile c f2827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile r f2828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile i f2829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile l f2830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile m f2831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile e f2832q;

    @Override // androidx.work.impl.WorkDatabase
    public final a3.i d() {
        return new a3.i(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final d e(b bVar) {
        a1.d callback = new a1.d(bVar, new pc.r(this));
        Context context = bVar.f54a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = bVar.f55b;
        Intrinsics.checkNotNullParameter(callback, "callback");
        return bVar.f56c.d(new g3.b(context, str, callback, false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c f() {
        c cVar;
        if (this.f2827l != null) {
            return this.f2827l;
        }
        synchronized (this) {
            try {
                if (this.f2827l == null) {
                    this.f2827l = new c(this);
                }
                cVar = this.f2827l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final List g(Map map) {
        int i7 = 13;
        int i10 = 14;
        int i11 = 17;
        int i12 = 18;
        return Arrays.asList(new w3.d(i7, i10, 10), new w3.d(11), new w3.d(16, i11, 12), new w3.d(i11, i12, i7), new w3.d(i12, 19, i10), new w3.d(15));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Set i() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Map j() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(p.class, list);
        map.put(c.class, list);
        map.put(r.class, list);
        map.put(i.class, list);
        map.put(l.class, list);
        map.put(m.class, list);
        map.put(e.class, list);
        map.put(f.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e l() {
        e eVar;
        if (this.f2832q != null) {
            return this.f2832q;
        }
        synchronized (this) {
            try {
                if (this.f2832q == null) {
                    this.f2832q = new e((WorkDatabase) this);
                }
                eVar = this.f2832q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i p() {
        i iVar;
        if (this.f2829n != null) {
            return this.f2829n;
        }
        synchronized (this) {
            try {
                if (this.f2829n == null) {
                    this.f2829n = new i(this);
                }
                iVar = this.f2829n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l r() {
        l lVar;
        if (this.f2830o != null) {
            return this.f2830o;
        }
        synchronized (this) {
            try {
                if (this.f2830o == null) {
                    this.f2830o = new l(this);
                }
                lVar = this.f2830o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m s() {
        m mVar;
        if (this.f2831p != null) {
            return this.f2831p;
        }
        synchronized (this) {
            try {
                if (this.f2831p == null) {
                    this.f2831p = new m(this);
                }
                mVar = this.f2831p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final p t() {
        p pVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new p(this);
                }
                pVar = this.k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final r u() {
        r rVar;
        if (this.f2828m != null) {
            return this.f2828m;
        }
        synchronized (this) {
            try {
                if (this.f2828m == null) {
                    this.f2828m = new r(this);
                }
                rVar = this.f2828m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }
}
