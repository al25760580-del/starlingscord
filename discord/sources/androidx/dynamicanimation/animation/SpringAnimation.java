package androidx.dynamicanimation.animation;

import android.os.CancellationSignal;
import android.util.AndroidRuntimeException;
import androidx.core.view.q1;
import androidx.transition.Transition;
import com.discord.mobile_voice_overlay.views.OverlayBubbleWrap;
import io.sentry.h4;
import j2.c;
import j2.d;
import j2.e;
import j2.h;
import j2.i;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import m3.q;
import m3.r;
import m3.t;
import m3.z;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class SpringAnimation {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f1991p = new d(2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f1992q = new d(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f1993r = new d(4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f1994s = new d(5);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f1995t = new d(6);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f1996u = new d(7);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f1997v = new d(0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f1998w = new d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f2003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2007i;
    public float j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f2008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f2009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2010n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2011o;

    public SpringAnimation(h hVar) {
        this(hVar, 0);
        this.f2009m = null;
        this.f2010n = Float.MAX_VALUE;
        this.f2011o = false;
    }

    public static c d() {
        ThreadLocal threadLocal = c.f13615i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new io.sentry.internal.debugmeta.c(11)));
        }
        return (c) threadLocal.get();
    }

    public final void a(float f2) {
        if (this.f2004f) {
            this.f2010n = f2;
            return;
        }
        if (this.f2009m == null) {
            this.f2009m = new i(f2);
        }
        this.f2009m.f13639i = f2;
        g();
    }

    public final void b() {
        if (!d().b()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.f2004f) {
            c(true);
        }
        float f2 = this.f2010n;
        if (f2 != Float.MAX_VALUE) {
            i iVar = this.f2009m;
            if (iVar == null) {
                this.f2009m = new i(f2);
            } else {
                iVar.f13639i = f2;
            }
            this.f2010n = Float.MAX_VALUE;
        }
    }

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
    public final void c(boolean z5) {
        int i7 = 0;
        this.f2004f = false;
        c cVarD = d();
        cVarD.f13616a.remove(this);
        ArrayList arrayList = cVarD.f13617b;
        int iIndexOf = arrayList.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            cVarD.f13621f = true;
        }
        this.f2007i = 0L;
        this.f2001c = false;
        while (true) {
            ArrayList arrayList2 = this.k;
            if (i7 >= arrayList2.size()) {
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    if (arrayList2.get(size) == null) {
                        arrayList2.remove(size);
                    }
                }
                return;
            }
            if (arrayList2.get(i7) != null) {
                q qVar = (q) arrayList2.get(i7);
                float f2 = this.f2000b;
                int i10 = qVar.f15437a;
                Object obj = qVar.f15438b;
                switch (i10) {
                    case 0:
                        r rVar = (r) obj;
                        z zVar = rVar.f15446h;
                        if (!z5) {
                            t tVar = t.f15448n;
                            if (f2 < 1.0f) {
                                long j = zVar.W;
                                Transition transitionR = zVar.R(0);
                                Transition transition = transitionR.Q;
                                transitionR.Q = null;
                                zVar.H(-1L, rVar.f15439a);
                                zVar.H(j, -1L);
                                rVar.f15439a = j;
                                Runnable runnable = rVar.f15445g;
                                if (runnable != null) {
                                    runnable.run();
                                }
                                zVar.S.clear();
                                if (transition != null) {
                                    transition.A(transition, tVar, true);
                                }
                            } else {
                                zVar.A(zVar, tVar, false);
                            }
                        }
                        break;
                    default:
                        h4 h4Var = (h4) obj;
                        if (Intrinsics.areEqual(this, (SpringAnimation) h4Var.f12715f)) {
                            h4Var.f12715f = null;
                        }
                        fj.c cVar = (fj.c) h4Var.f12711b;
                        if (cVar == null) {
                            CancellationSignal cancellationSignal = (CancellationSignal) h4Var.f12712c;
                            if (cancellationSignal != null) {
                                cancellationSignal.cancel();
                            }
                        } else {
                            q1 q1Var = (q1) cVar.f9267e;
                            int i11 = q1Var.F().f1559d;
                            int i12 = q1Var.H().f1559d;
                            int i13 = q1Var.G().f1559d;
                            if (i11 == i12) {
                                cVar.s(true);
                            } else if (i11 == i13) {
                                cVar.s(false);
                            } else if (q1Var.E() >= 0.15f) {
                                cVar.s(!h4Var.f12710a);
                            } else {
                                cVar.s(h4Var.f12710a);
                            }
                        }
                        break;
                }
            }
            i7++;
        }
    }

    public final void e(float f2) {
        ArrayList arrayList;
        this.f2003e.I(this.f2002d, f2);
        int i7 = 0;
        while (true) {
            arrayList = this.f2008l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                r rVar = (r) arrayList.get(i7);
                float f7 = this.f2000b;
                z zVar = rVar.f15446h;
                long jMax = Math.max(-1L, Math.min(zVar.W + 1, Math.round(f7)));
                zVar.H(jMax, rVar.f15439a);
                rVar.f15439a = jMax;
            }
            i7++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void f() {
        if (this.f2009m.f13632b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!d().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f2004f) {
            this.f2011o = true;
        }
    }

    public final void g() {
        i iVar = this.f2009m;
        if (iVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d6 = (float) iVar.f13639i;
        if (d6 > this.f2005g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d6 < this.f2006h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.j * 0.75f);
        iVar.f13634d = dAbs;
        iVar.f13635e = dAbs * 62.5d;
        if (!d().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z5 = this.f2004f;
        if (z5 || z5) {
            return;
        }
        this.f2004f = true;
        if (!this.f2001c) {
            this.f2000b = this.f2003e.q(this.f2002d);
        }
        float f2 = this.f2000b;
        if (f2 > this.f2005g || f2 < this.f2006h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        d().a(this);
    }

    public SpringAnimation(Object obj, a aVar) {
        this(obj, aVar, 0);
        this.f2009m = null;
        this.f2010n = Float.MAX_VALUE;
        this.f2011o = false;
    }

    public SpringAnimation(OverlayBubbleWrap overlayBubbleWrap, d dVar) {
        this(overlayBubbleWrap, dVar, 0);
        this.f2009m = null;
        this.f2010n = Float.MAX_VALUE;
        this.f2011o = false;
        this.f2009m = new i(0.0f);
    }

    public SpringAnimation(h hVar, int i7) {
        this.f1999a = 0.0f;
        this.f2000b = Float.MAX_VALUE;
        this.f2001c = false;
        this.f2004f = false;
        this.f2005g = Float.MAX_VALUE;
        this.f2006h = -3.4028235E38f;
        this.f2007i = 0L;
        this.k = new ArrayList();
        this.f2008l = new ArrayList();
        this.f2002d = null;
        this.f2003e = new e(hVar);
        this.j = 1.0f;
    }

    public SpringAnimation(Object obj, a aVar, int i7) {
        this.f1999a = 0.0f;
        this.f2000b = Float.MAX_VALUE;
        this.f2001c = false;
        this.f2004f = false;
        this.f2005g = Float.MAX_VALUE;
        this.f2006h = -3.4028235E38f;
        this.f2007i = 0L;
        this.k = new ArrayList();
        this.f2008l = new ArrayList();
        this.f2002d = obj;
        this.f2003e = aVar;
        if (aVar != f1993r && aVar != f1994s && aVar != f1995t) {
            if (aVar == f1998w) {
                this.j = 0.00390625f;
                return;
            } else if (aVar != f1991p && aVar != f1992q) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.002f;
                return;
            }
        }
        this.j = 0.1f;
    }
}
