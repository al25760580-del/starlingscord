package com.facebook.imagepipeline.core;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.discord.image.fresco.config.FrescoBitmapSupplier;
import com.discord.image.fresco.config.FrescoConfigKt;
import com.discord.image.fresco.config.FrescoEncodedSupplier;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.d0;
import ga.g;
import ga.k;
import ga.l;
import ia.d;
import ia.f;
import io.sentry.hints.j;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import n8.h;
import n8.i;
import pa.t;
import pa.u;

/* JADX INFO: loaded from: classes3.dex */
public final class ImagePipelineConfig implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f4842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8.c f4843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DefaultCacheKeyFactory f4844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f4845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DownsampleMode f4846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f4847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Supplier f4848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DefaultExecutorSupplier f4849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f4850i;
    public final h j;
    public final DiskCacheConfig k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q8.c f4851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NetworkFetcher f4852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f4853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u4.c f4854o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f4855p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0 f4856q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p0 f4857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f4858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DiskCacheConfig f4859t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f4860u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f4861v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q8.c f4862w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i8.b f4863x;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FrescoBitmapSupplier f4864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FrescoConfigKt.AnonymousClass2 f4865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f4866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public DownsampleMode f4867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public FrescoEncodedSupplier f4868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public DiskCacheConfig f4869f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public NetworkFetcher f4870g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public u f4871h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public HashSet f4872i;
        public final boolean j;
        public DiskCacheConfig k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f4873l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final a f4874m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f4875n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final q8.c f4876o;

        public Builder(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f4867d = DownsampleMode.f4829e;
            this.j = true;
            this.f4873l = -1;
            Intrinsics.checkNotNullParameter(this, "configBuilder");
            a aVar = new a();
            j8.c cVar = new j8.c(1, Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(cVar, "of(...)");
            aVar.f4878b = cVar;
            aVar.f4879c = true;
            aVar.f4880d = true;
            aVar.f4881e = 20;
            aVar.f4882f = 30;
            aVar.f4883g = new q8.c();
            this.f4874m = aVar;
            this.f4875n = true;
            this.f4876o = new q8.c();
            this.f4866c = context;
        }
    }

    public ImagePipelineConfig(Builder builder) {
        k kVar;
        sa.a.w();
        a aVar = builder.f4874m;
        aVar.getClass();
        this.f4860u = new b(aVar);
        Supplier fVar = builder.f4864a;
        if (fVar == null) {
            Object systemService = builder.f4866c.getSystemService("activity");
            if (systemService == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            fVar = new ga.f((ActivityManager) systemService);
        }
        this.f4842a = fVar;
        this.f4843b = new q8.c();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        DefaultCacheKeyFactory defaultCacheKeyFactory = builder.f4865b;
        if (defaultCacheKeyFactory == null) {
            defaultCacheKeyFactory = DefaultCacheKeyFactory.getInstance();
            Intrinsics.checkNotNullExpressionValue(defaultCacheKeyFactory, "getInstance(...)");
        }
        this.f4844c = defaultCacheKeyFactory;
        Context context = builder.f4866c;
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f4845d = context;
        this.f4846e = builder.f4867d;
        Supplier supplier = builder.f4868e;
        this.f4848g = supplier == null ? new g() : supplier;
        synchronized (k.class) {
            try {
                if (k.f9545d == null) {
                    k.f9545d = new k();
                }
                kVar = k.f9545d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(kVar, "getInstance(...)");
        this.f4850i = kVar;
        h BOOLEAN_FALSE = i.f16515b;
        Intrinsics.checkNotNullExpressionValue(BOOLEAN_FALSE, "BOOLEAN_FALSE");
        h BOOLEAN_TRUE = i.f16514a;
        Intrinsics.checkNotNullExpressionValue(BOOLEAN_TRUE, "BOOLEAN_TRUE");
        this.j = BOOLEAN_TRUE;
        DiskCacheConfig diskCacheConfig = builder.f4869f;
        if (diskCacheConfig == null) {
            Context context2 = builder.f4866c;
            sa.a.w();
            diskCacheConfig = new DiskCacheConfig(new j8.d(context2));
            Intrinsics.checkNotNullExpressionValue(diskCacheConfig, "traceSection(...)");
        }
        this.k = diskCacheConfig;
        q8.c cVarI = q8.c.i();
        Intrinsics.checkNotNullExpressionValue(cVarI, "getInstance(...)");
        this.f4851l = cVarI;
        int i7 = builder.f4873l;
        i7 = i7 < 0 ? 30000 : i7;
        sa.a.w();
        NetworkFetcher networkFetcher = builder.f4870g;
        this.f4852m = networkFetcher == null ? new d0(i7) : networkFetcher;
        u uVar = builder.f4871h;
        uVar = uVar == null ? new u(new t(new l(28, false))) : uVar;
        this.f4853n = uVar;
        this.f4854o = new u4.c(22);
        Set set = builder.f4872i;
        this.f4855p = set == null ? p0.f14661d : set;
        p0 p0Var = p0.f14661d;
        this.f4856q = p0Var;
        this.f4857r = p0Var;
        this.f4858s = builder.j;
        DiskCacheConfig diskCacheConfig2 = builder.k;
        this.f4859t = diskCacheConfig2 != null ? diskCacheConfig2 : diskCacheConfig;
        this.f4849h = new DefaultExecutorSupplier(((t) uVar.f17839d).f17832c.f17849d);
        this.f4861v = builder.f4875n;
        this.f4862w = builder.f4876o;
        this.f4863x = new i8.b(7);
        this.f4847f = new d(new j(8), this);
        sa.a.w();
    }
}
