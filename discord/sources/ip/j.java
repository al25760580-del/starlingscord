package ip;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import lq.q0;
import or.y0;
import vo.c1;
import vo.m0;
import vo.o0;
import vo.s0;
import vo.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends yo.i implements gp.c {
    public final bp.o E;
    public final vo.f F;
    public final e4.i G;
    public final rn.u H;
    public final vo.g I;
    public final vo.y J;
    public final y0 K;
    public final boolean L;
    public final h M;
    public final p N;
    public final m0 O;
    public final eq.i P;
    public final e0 Q;
    public final hp.c R;
    public final kq.i S;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4.i f13356y;

    static {
        String[] elements = {"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        kotlin.collections.y.J(elements);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e4.i outerContext, vo.l containingDeclaration, bp.o jClass, vo.f fVar) throws IllegalAccessException, InvocationTargetException {
        vo.g gVar;
        vo.y yVar;
        y0 y0Var;
        super(((hp.a) outerContext.f7980e).f10957a, containingDeclaration, jClass.e(), ((hp.a) outerContext.f7980e).j.c(jClass));
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f13356y = outerContext;
        this.E = jClass;
        this.F = fVar;
        e4.i iVarI = ls.l.i(outerContext, this, jClass, 4);
        this.G = iVarI;
        hp.a aVar = (hp.a) iVarI.f7980e;
        kq.o storageManager = aVar.f10957a;
        aVar.f10963g.getClass();
        this.H = rn.l.b(new g(this, 0));
        Class cls = jClass.f3364a;
        if (cls.isAnnotation()) {
            gVar = vo.g.f21812w;
        } else if (cls.isInterface()) {
            gVar = vo.g.f21809e;
        } else {
            gVar = cls.isEnum() ? vo.g.f21810i : vo.g.f21808d;
        }
        this.I = gVar;
        if (cls.isAnnotation() || cls.isEnum()) {
            yVar = vo.y.f21852e;
        } else {
            o0 o0Var = vo.y.f21851d;
            boolean zH = jClass.h();
            boolean z5 = jClass.h() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            o0Var.getClass();
            if (zH) {
                yVar = vo.y.f21853i;
            } else if (z5) {
                yVar = vo.y.f21855w;
            } else {
                yVar = !zIsFinal ? vo.y.f21854v : vo.y.f21852e;
            }
        }
        this.J = yVar;
        int modifiers = cls.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            y0Var = c1.f21799d;
        } else if (Modifier.isPrivate(modifiers)) {
            y0Var = z0.f21858d;
        } else if (Modifier.isProtected(modifiers)) {
            y0Var = Modifier.isStatic(modifiers) ? zo.c.f24061d : zo.b.f24060d;
        } else {
            y0Var = zo.a.f24059d;
        }
        this.K = y0Var;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.L = ((declaringClass != null ? new bp.o(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.M = new h(this);
        p pVar = new p(iVarI, this, jClass, fVar != null, null);
        this.N = pVar;
        o0 o0Var2 = m0.f21816d;
        ((mq.l) aVar.f10975u).getClass();
        bp.i scopeFactory = new bp.i(9, this);
        o0Var2.getClass();
        Intrinsics.checkNotNullParameter(this, "classDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        mq.f kotlinTypeRefinerForOwnerModule = mq.f.f16018a;
        Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
        Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
        this.O = new m0(this, storageManager, scopeFactory);
        this.P = new eq.i(pVar);
        this.Q = new e0(iVarI, jClass, this);
        this.R = mf.f.F(iVarI, jClass);
        g gVar2 = new g(this, 1);
        kq.l lVar = (kq.l) storageManager;
        lVar.getClass();
        this.S = new kq.i(lVar, gVar2);
    }

    @Override // yo.y
    public final eq.o B(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (p) this.O.a(kotlinTypeRefiner);
    }

    @Override // vo.f
    public final yo.h E() {
        return null;
    }

    @Override // vo.f
    public final eq.o F() {
        return this.Q;
    }

    @Override // vo.f
    public final vo.f H() {
        return null;
    }

    @Override // vo.f
    public final vo.g c() {
        return this.I;
    }

    @Override // vo.f, vo.x
    public final vo.y e() {
        return this.J;
    }

    @Override // wo.a
    public final wo.h getAnnotations() {
        return this.R;
    }

    @Override // vo.f, vo.x, vo.o
    public final ep.p getVisibility() {
        ep.p pVar = vo.p.f21824a;
        y0 y0Var = this.K;
        if (Intrinsics.areEqual(y0Var, pVar)) {
            Class<?> declaringClass = this.E.f3364a.getDeclaringClass();
            if ((declaringClass != null ? new bp.o(declaringClass) : null) == null) {
                ep.p pVar2 = ep.q.f8582a;
                Intrinsics.checkNotNull(pVar2);
                return pVar2;
            }
        }
        return ls.l.B(y0Var);
    }

    @Override // yo.b, vo.f
    public final eq.o h0() {
        return this.P;
    }

    @Override // vo.f
    public final boolean isInline() {
        return false;
    }

    @Override // vo.f
    public final boolean isValue() {
        return false;
    }

    @Override // vo.f
    public final s0 j0() {
        return null;
    }

    @Override // vo.f, vo.j
    public final List l() {
        return (List) this.S.invoke();
    }

    @Override // yo.b, vo.f
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final p n0() {
        eq.o oVarN0 = super.n0();
        Intrinsics.checkNotNull(oVarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (p) oVarN0;
    }

    @Override // vo.i
    public final q0 n() {
        return this.M;
    }

    @Override // vo.f
    public final boolean o() {
        return false;
    }

    @Override // vo.x
    public final boolean o0() {
        return false;
    }

    @Override // vo.f
    public final Collection p() {
        return (List) this.N.f13377q.invoke();
    }

    @Override // vo.f
    public final boolean s() {
        return false;
    }

    @Override // vo.f
    public final boolean s0() {
        return false;
    }

    public final String toString() {
        return "Lazy Java class " + bq.e.h(this);
    }

    @Override // vo.f
    public final Collection w() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        Sequence sequenceC;
        if (this.J != vo.y.f21853i) {
            return n0.f14659d;
        }
        Object obj = null;
        jp.a aVarS = xr.m.S(lq.z0.f15271e, false, null, 7);
        Class clazz = this.E.f3364a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        com.google.firebase.messaging.r rVar = mo.c0.f15938a;
        if (rVar == null) {
            try {
                rVar = new com.google.firebase.messaging.r(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                rVar = new com.google.firebase.messaging.r(obj, obj, obj, obj);
            }
            mo.c0.f15938a = rVar;
        }
        Method method = (Method) rVar.f6611e;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(clazz, null);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr != null) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            for (Class cls : clsArr) {
                arrayList.add(new bp.q(cls));
            }
            sequenceC = CollectionsKt.C(arrayList);
        } else {
            sequenceC = xq.f.f23028a;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = sequenceC.iterator();
        while (it.hasNext()) {
            vo.i iVarG = ((e4.m) this.G.f7983w).M((bp.q) it.next(), aVarS).r0().g();
            vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
            if (fVar != null) {
                arrayList2.add(fVar);
            }
        }
        return CollectionsKt.e0(arrayList2, new i());
    }

    @Override // vo.x
    public final boolean y() {
        return false;
    }

    @Override // vo.j
    public final boolean z() {
        return this.L;
    }
}
