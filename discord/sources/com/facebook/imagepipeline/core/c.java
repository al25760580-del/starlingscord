package com.facebook.imagepipeline.core;

import android.os.Build;
import com.facebook.common.internal.Supplier;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.producers.g1;
import e4.e;
import ga.h;
import ga.k;
import ia.d;
import ia.f;
import ia.g;
import ia.j;
import kotlin.jvm.internal.Intrinsics;
import pa.u;
import xr.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static c f4894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static ImagePipeline f4895q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f4896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f4897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.c f4898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f4899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f4900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f4901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f4902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f4903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o9.c f4904i;
    public ta.d j;
    public g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f4905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fa.a f4906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public qa.b f4907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AnimatedFactoryV2Impl f4908o;

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    public c(f fVar) {
        sa.a.w();
        fVar.getClass();
        this.f4897b = fVar;
        ImagePipelineConfig imagePipelineConfig = (ImagePipelineConfig) fVar;
        b bVar = imagePipelineConfig.f4860u;
        bVar.getClass();
        this.f4896a = new g1(imagePipelineConfig.f4849h.f4827d);
        q8.c cVar = imagePipelineConfig.f4862w;
        u4.c cVar2 = new u4.c();
        cVar2.f20946d = new u4.b(14, cVar);
        this.f4898c = cVar2;
        sa.a.w();
        this.f4899d = imagePipelineConfig.f4847f;
        if (bVar.j) {
            ((z9.d) z9.d.f23634d.getValue()).f23637c = true;
        }
    }

    public static synchronized void h(ImagePipelineConfig imagePipelineConfig) {
        try {
            if (f4894p != null) {
                o8.a.r(c.class, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f4894p = new c(imagePipelineConfig);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final AnimatedFactoryV2Impl a() {
        if (this.f4908o == null) {
            PlatformBitmapFactory platformBitmapFactoryF = f();
            f fVar = this.f4897b;
            ImagePipelineConfig imagePipelineConfig = (ImagePipelineConfig) fVar;
            DefaultExecutorSupplier defaultExecutorSupplier = imagePipelineConfig.f4849h;
            ga.e eVarB = b();
            b bVar = imagePipelineConfig.f4860u;
            boolean z5 = bVar.f4887c;
            bVar.getClass();
            b bVar2 = imagePipelineConfig.f4860u;
            int i7 = bVar2.f4892h;
            bVar2.getClass();
            fVar.getClass();
            if (!io.sentry.config.a.f12578f) {
                try {
                    Class cls = Boolean.TYPE;
                    Class cls2 = Integer.TYPE;
                    Object objNewInstance = AnimatedFactoryV2Impl.class.getConstructor(PlatformBitmapFactory.class, ia.e.class, ga.e.class, cls, cls, cls2, cls2, l8.d.class).newInstance(platformBitmapFactoryF, defaultExecutorSupplier, eVarB, Boolean.valueOf(z5), Boolean.FALSE, Integer.valueOf(i7), 1000, null);
                    Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                    io.sentry.config.a.f12579g = (AnimatedFactoryV2Impl) objNewInstance;
                } catch (Throwable unused) {
                }
                if (io.sentry.config.a.f12579g != null) {
                    io.sentry.config.a.f12578f = true;
                }
            }
            this.f4908o = io.sentry.config.a.f12579g;
        }
        return this.f4908o;
    }

    public final ga.e b() {
        if (this.f4900e == null) {
            f fVar = this.f4897b;
            ImagePipelineConfig imagePipelineConfig = (ImagePipelineConfig) fVar;
            i8.b bVar = imagePipelineConfig.f4863x;
            Supplier supplier = imagePipelineConfig.f4842a;
            q8.c cVar = imagePipelineConfig.f4851l;
            q8.c cVar2 = imagePipelineConfig.f4843b;
            imagePipelineConfig.f4860u.getClass();
            imagePipelineConfig.f4860u.getClass();
            fVar.getClass();
            bVar.getClass();
            h hVar = new h(new k(), supplier);
            cVar.getClass();
            this.f4900e = hVar;
        }
        return this.f4900e;
    }

    public final e c() {
        if (this.f4901f == null) {
            ga.e eVarB = b();
            k kVar = ((ImagePipelineConfig) this.f4897b).f4850i;
            kVar.getClass();
            this.f4901f = new e(7, eVarB, new u4.c(kVar));
        }
        return this.f4901f;
    }

    public final e d() {
        if (this.f4903h == null) {
            f fVar = this.f4897b;
            fVar.getClass();
            if (this.f4902g == null) {
                ImagePipelineConfig imagePipelineConfig = (ImagePipelineConfig) fVar;
                Supplier supplier = imagePipelineConfig.f4848g;
                q8.c cVar = imagePipelineConfig.f4851l;
                h hVar = new h(new i8.c(7), supplier);
                cVar.getClass();
                this.f4902g = hVar;
            }
            h hVar2 = this.f4902g;
            k kVar = ((ImagePipelineConfig) fVar).f4850i;
            kVar.getClass();
            this.f4903h = new e(7, hVar2, new u4.b(9, kVar));
        }
        return this.f4903h;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.facebook.imagepipeline.core.ImagePipeline, still in use, count: 2, list:
          (r2v0 com.facebook.imagepipeline.core.ImagePipeline) from 0x016f: MOVE (r29v0 com.facebook.imagepipeline.core.ImagePipeline) = (r2v0 com.facebook.imagepipeline.core.ImagePipeline) (LINE:368)
          (r2v0 com.facebook.imagepipeline.core.ImagePipeline) from 0x0174: PHI (r29v1 com.facebook.imagepipeline.core.ImagePipeline) = (r29v0 com.facebook.imagepipeline.core.ImagePipeline), (r2v0 com.facebook.imagepipeline.core.ImagePipeline) binds: [B:29:0x016d, B:28:0x015d] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final com.facebook.imagepipeline.core.ImagePipeline e() {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.core.c.e():com.facebook.imagepipeline.core.ImagePipeline");
    }

    public final PlatformBitmapFactory f() {
        if (this.f4906m == null) {
            u poolFactory = ((ImagePipelineConfig) this.f4897b).f4853n;
            qa.d platformDecoder = g();
            Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
            Intrinsics.checkNotNullParameter(platformDecoder, "platformDecoder");
            u4.c closeableReferenceFactory = this.f4898c;
            Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
            pa.e eVarB = poolFactory.b();
            Intrinsics.checkNotNullExpressionValue(eVarB, "getBitmapPool(...)");
            this.f4906m = new fa.a(eVarB, closeableReferenceFactory);
        }
        return this.f4906m;
    }

    public final qa.d g() {
        qa.b aVar;
        if (this.f4907n == null) {
            ImagePipelineConfig imagePipelineConfig = (ImagePipelineConfig) this.f4897b;
            u poolFactory = imagePipelineConfig.f4853n;
            imagePipelineConfig.f4860u.getClass();
            imagePipelineConfig.f4860u.getClass();
            q8.c platformDecoderOptions = imagePipelineConfig.f4860u.f4893i;
            Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
            Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
            if (Build.VERSION.SDK_INT >= 26) {
                pa.e bitmapPool = poolFactory.b();
                Intrinsics.checkNotNullExpressionValue(bitmapPool, "getBitmapPool(...)");
                k1.b decodeBuffers = m.k(poolFactory);
                Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
                Intrinsics.checkNotNullParameter(decodeBuffers, "decodeBuffers");
                Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
                aVar = new qa.c(bitmapPool, decodeBuffers, platformDecoderOptions);
            } else {
                pa.e bitmapPool2 = poolFactory.b();
                Intrinsics.checkNotNullExpressionValue(bitmapPool2, "getBitmapPool(...)");
                k1.b decodeBuffers2 = m.k(poolFactory);
                Intrinsics.checkNotNullParameter(bitmapPool2, "bitmapPool");
                Intrinsics.checkNotNullParameter(decodeBuffers2, "decodeBuffers");
                Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
                aVar = new qa.a(bitmapPool2, decodeBuffers2, platformDecoderOptions);
            }
            this.f4907n = aVar;
        }
        return this.f4907n;
    }
}
