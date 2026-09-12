package pa;

import a5.b0;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import com.google.android.gms.internal.play_billing.v1;
import java.lang.reflect.InvocationTargetException;
import sh.c0;
import sh.g1;
import sh.i0;
import sh.p0;
import sh.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements th.g {
    public Object E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f17840e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f17841i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f17842v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f17843w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f17844x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f17845y;

    public u(th.f fVar, th.f fVar2, th.f fVar3, th.f fVar4, th.f fVar5, po.d dVar, th.f fVar6, th.f fVar7) {
        this.f17839d = fVar;
        this.f17840e = fVar2;
        this.f17841i = fVar3;
        this.f17842v = fVar4;
        this.f17843w = fVar5;
        this.f17844x = dVar;
        this.f17845y = fVar6;
        this.E = fVar7;
    }

    @Override // th.g
    public Object a() {
        Object objA = ((th.f) this.f17839d).a();
        Object objA2 = ((th.f) this.f17840e).a();
        Object objA3 = ((th.f) this.f17841i).a();
        Object objA4 = ((th.f) this.f17842v).a();
        int i7 = 8;
        int i10 = 8;
        return new i0((v0) objA, (p0) objA2, (g1) objA3, (c0) objA4, new th.f(new pf.b(i7, (th.f) this.f17843w)), new th.f(new pf.b(i7, (po.d) this.f17844x)), (sh.r) ((th.f) this.f17845y).a(), new th.f(new pf.b(i10, (th.f) this.E)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    public e b() {
        t tVar = (t) this.f17839d;
        s sVar = tVar.f17831b;
        q8.c cVar = tVar.f17833d;
        if (((e) this.f17843w) == null) {
            String str = tVar.f17838i;
            switch (str.hashCode()) {
                case -1868884870:
                    if (!str.equals("legacy_default_params")) {
                        this.f17843w = new h(cVar, tVar.f17830a, sVar);
                    } else {
                        this.f17843w = new h(cVar, j.a(), sVar);
                    }
                    break;
                case -1106578487:
                    str.equals("legacy");
                    this.f17843w = new h(cVar, tVar.f17830a, sVar);
                    break;
                case -404562712:
                    if (!str.equals("experimental")) {
                        this.f17843w = new h(cVar, tVar.f17830a, sVar);
                    } else {
                        int i7 = tVar.j;
                        s sVarL = s.l();
                        v1 v1Var = new v1();
                        v1Var.f6156i = new e4.c(15);
                        v1Var.f6154d = i7;
                        v1Var.f6157v = sVarL;
                        this.f17843w = v1Var;
                    }
                    break;
                case -402149703:
                    if (!str.equals("dummy_with_tracking")) {
                        this.f17843w = new h(cVar, tVar.f17830a, sVar);
                    } else {
                        this.f17843w = new op.c(1);
                    }
                    break;
                case 95945896:
                    if (!str.equals("dummy")) {
                        this.f17843w = new h(cVar, tVar.f17830a, sVar);
                    } else {
                        this.f17843w = new l();
                    }
                    break;
                default:
                    this.f17843w = new h(cVar, tVar.f17830a, sVar);
                    break;
            }
        }
        return (e) this.f17843w;
    }

    public e4.e c(int i7) {
        p pVar;
        if (((e4.e) this.f17844x) == null) {
            t tVar = (t) this.f17839d;
            s sVar = tVar.f17835f;
            v vVar = tVar.f17834e;
            q8.c cVar = tVar.f17833d;
            if (i7 == 0) {
                if (((p) this.f17842v) == null) {
                    try {
                        this.f17842v = (p) NativeMemoryChunkPool.class.getConstructor(q8.b.class, v.class, w.class).newInstance(cVar, vVar, sVar);
                    } catch (ClassNotFoundException e10) {
                        o8.a.h("PoolFactory", "", e10);
                        this.f17842v = null;
                    } catch (IllegalAccessException e11) {
                        o8.a.h("PoolFactory", "", e11);
                        this.f17842v = null;
                    } catch (InstantiationException e12) {
                        o8.a.h("PoolFactory", "", e12);
                        this.f17842v = null;
                    } catch (NoSuchMethodException e13) {
                        o8.a.h("PoolFactory", "", e13);
                        this.f17842v = null;
                    } catch (InvocationTargetException e14) {
                        o8.a.h("PoolFactory", "", e14);
                        this.f17842v = null;
                    }
                }
                pVar = (p) this.f17842v;
            } else if (i7 == 1) {
                if (((p) this.f17841i) == null) {
                    try {
                        this.f17841i = (p) BufferMemoryChunkPool.class.getConstructor(q8.b.class, v.class, w.class).newInstance(cVar, vVar, sVar);
                    } catch (ClassNotFoundException unused) {
                        this.f17841i = null;
                    } catch (IllegalAccessException unused2) {
                        this.f17841i = null;
                    } catch (InstantiationException unused3) {
                        this.f17841i = null;
                    } catch (NoSuchMethodException unused4) {
                        this.f17841i = null;
                    } catch (InvocationTargetException unused5) {
                        this.f17841i = null;
                    }
                }
                pVar = (p) this.f17841i;
            } else {
                if (i7 != 2) {
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
                }
                if (((p) this.f17840e) == null) {
                    try {
                        this.f17840e = (p) AshmemMemoryChunkPool.class.getConstructor(q8.b.class, v.class, w.class).newInstance(cVar, vVar, sVar);
                    } catch (ClassNotFoundException unused6) {
                        this.f17840e = null;
                    } catch (IllegalAccessException unused7) {
                        this.f17840e = null;
                    } catch (InstantiationException unused8) {
                        this.f17840e = null;
                    } catch (NoSuchMethodException unused9) {
                        this.f17840e = null;
                    } catch (InvocationTargetException unused10) {
                        this.f17840e = null;
                    }
                }
                pVar = (p) this.f17840e;
            }
            n8.i.d(pVar, "failed to get pool for chunk type: " + i7);
            this.f17844x = new e4.e(pVar, d());
        }
        return (e4.e) this.f17844x;
    }

    public b0 d() {
        if (((b0) this.f17845y) == null) {
            if (((n) this.E) == null) {
                t tVar = (t) this.f17839d;
                this.E = new n(tVar.f17833d, tVar.f17836g, tVar.f17837h);
            }
            this.f17845y = new b0((n) this.E);
        }
        return (b0) this.f17845y;
    }

    public u(t tVar) {
        this.f17839d = tVar;
    }
}
