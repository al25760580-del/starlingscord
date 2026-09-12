package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f5106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProducerContext f5107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Postprocessor f5108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CloseableReference f5110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5112i;
    public boolean j;
    public final /* synthetic */ x0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(x0 x0Var, Consumer consumer, a1 a1Var, Postprocessor postprocessor, ProducerContext producerContext) {
        super(consumer);
        this.k = x0Var;
        this.f5110g = null;
        this.f5111h = 0;
        this.f5112i = false;
        this.j = false;
        this.f5106c = a1Var;
        this.f5108e = postprocessor;
        this.f5107d = producerContext;
        producerContext.i(new o(6, this));
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
    public static void l(y0 y0Var, CloseableReference closeableReference, int i7) throws Throwable {
        Postprocessor postprocessor = y0Var.f5108e;
        ProducerContext producerContext = y0Var.f5107d;
        a1 a1Var = y0Var.f5106c;
        if (!CloseableReference.z(closeableReference)) {
            throw new IllegalArgumentException();
        }
        if (!(((na.c) closeableReference.q()) instanceof na.d)) {
            y0Var.n(i7, closeableReference);
            return;
        }
        a1Var.c(producerContext, "PostprocessorProducer");
        r8.b bVar = null;
        Map mapA = null;
        try {
            try {
                r8.b bVarO = y0Var.o((na.c) closeableReference.q());
                try {
                    if (a1Var.f(producerContext, "PostprocessorProducer")) {
                        mapA = n8.e.a("Postprocessor", postprocessor.getName());
                    }
                    a1Var.i(producerContext, "PostprocessorProducer", mapA);
                    y0Var.n(i7, bVarO);
                    CloseableReference.l(bVarO);
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVarO;
                    CloseableReference.l(bVar);
                    throw th;
                }
            } catch (Exception e10) {
                a1Var.k(producerContext, "PostprocessorProducer", e10, !a1Var.f(producerContext, "PostprocessorProducer") ? null : n8.e.a("Postprocessor", postprocessor.getName()));
                if (y0Var.m()) {
                    y0Var.f5061b.onFailure(e10);
                    return;
                }
                return;
                CloseableReference.l(bVar);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.c
    public final void f() {
        if (m()) {
            this.f5061b.a();
        }
    }

    @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.c
    public final void g(Throwable th2) {
        if (m()) {
            this.f5061b.onFailure(th2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.c
    public final void h(int i7, Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        if (!CloseableReference.z(closeableReference)) {
            if (c.d(i7)) {
                n(i7, null);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (this.f5109f) {
                    return;
                }
                CloseableReference closeableReference2 = this.f5110g;
                this.f5110g = CloseableReference.g(closeableReference);
                this.f5111h = i7;
                this.f5112i = true;
                boolean zP = p();
                CloseableReference.l(closeableReference2);
                if (zP) {
                    ((Executor) this.k.f5101d).execute(new a3.h(8, this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean m() {
        synchronized (this) {
            try {
                if (this.f5109f) {
                    return false;
                }
                CloseableReference closeableReference = this.f5110g;
                this.f5110g = null;
                this.f5109f = true;
                CloseableReference.l(closeableReference);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    public final void n(int i7, CloseableReference closeableReference) {
        boolean z5;
        boolean zD = c.d(i7);
        if (zD) {
            if (zD) {
                return;
            } else {
                return;
            }
        }
        synchronized (this) {
            z5 = this.f5109f;
        }
        if (z5) {
            if (zD || !m()) {
                return;
            }
        }
        this.f5061b.b(i7, closeableReference);
    }

    public final r8.b o(na.c cVar) {
        v9.a aVar = (na.d) cVar;
        na.g gVar = (na.g) aVar;
        CloseableReference closeableReferenceProcess = this.f5108e.process(gVar.f16528w, (PlatformBitmapFactory) this.k.f5100c);
        int i7 = gVar.f16530y;
        int i10 = gVar.E;
        try {
            na.k kVarG = cVar.G();
            int i11 = na.g.F;
            na.g gVar2 = new na.g(closeableReferenceProcess, kVarG, i7, i10);
            gVar2.q(((na.a) aVar).f16523d);
            r8.b bVarB = CloseableReference.B(gVar2);
            closeableReferenceProcess.close();
            return bVarB;
        } catch (Throwable th2) {
            CloseableReference.l(closeableReferenceProcess);
            throw th2;
        }
    }

    public final synchronized boolean p() {
        if (this.f5109f || !this.f5112i || this.j || !CloseableReference.z(this.f5110g)) {
            return false;
        }
        this.j = true;
        return true;
    }
}
