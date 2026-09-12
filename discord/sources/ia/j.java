package ia;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.core.DefaultExecutorSupplier;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.c1;
import com.facebook.imagepipeline.producers.f1;
import com.facebook.imagepipeline.producers.g1;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.j1;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.l1;
import com.facebook.imagepipeline.producers.m0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.q;
import com.facebook.imagepipeline.producers.q0;
import com.facebook.imagepipeline.producers.w;
import com.facebook.imagepipeline.producers.w0;
import com.facebook.imagepipeline.producers.x;
import com.facebook.imagepipeline.producers.x0;
import com.facebook.imagepipeline.producers.z;
import com.facebook.imagepipeline.producers.z0;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rn.l;
import rn.u;

/* JADX INFO: loaded from: classes3.dex */
public final class j {
    public final u A;
    public final u B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f11446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f11447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NetworkFetcher f11448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1 f11450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DownsampleMode f11451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ta.b f11453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f11454i;
    public final LinkedHashMap j;
    public final u k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f11455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u f11456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f11457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u f11458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f11459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f11460q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f11461r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u f11462s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f11463t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final u f11464u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u f11465v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u f11466w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u f11467x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u f11468y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final u f11469z;

    public j(ContentResolver contentResolver, g producerFactory, NetworkFetcher networkFetcher, boolean z5, g1 threadHandoffProducerQueue, DownsampleMode downsampleMode, boolean z6, ta.d imageTranscoderFactory, Set set) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(producerFactory, "producerFactory");
        Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(imageTranscoderFactory, "imageTranscoderFactory");
        this.f11446a = contentResolver;
        this.f11447b = producerFactory;
        this.f11448c = networkFetcher;
        this.f11449d = z5;
        this.f11450e = threadHandoffProducerQueue;
        this.f11451f = downsampleMode;
        this.f11452g = z6;
        this.f11453h = imageTranscoderFactory;
        this.f11454i = set;
        this.j = new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        final int i7 = 0;
        this.k = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i7) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i10 = 17;
        this.f11455l = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i10) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i11 = 1;
        this.f11456m = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i11) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i12 = 2;
        this.f11457n = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i12) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i13 = 3;
        this.f11458o = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i13) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i14 = 4;
        this.f11459p = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i14) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i15 = 5;
        this.f11460q = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i15) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i16 = 6;
        this.f11461r = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i16) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i17 = 7;
        this.f11462s = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i17) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i18 = 8;
        this.f11463t = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i18) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i19 = 9;
        this.f11464u = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i19) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i20 = 10;
        this.f11465v = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i20) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i21 = 11;
        this.f11466w = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i21) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i22 = 12;
        this.f11467x = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i22) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i23 = 13;
        this.f11468y = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i23) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i24 = 14;
        this.f11469z = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i24) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i25 = 15;
        this.A = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i25) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
        final int i26 = 16;
        this.B = l.b(new Function0(this) { // from class: ia.h

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f11445e;

            {
                this.f11445e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                c1 c1VarA;
                boolean z7 = true;
                switch (i26) {
                    case 0:
                        j this$0 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sa.a.w();
                        Object value = this$0.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value);
                    case 1:
                        j this$1 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        sa.a.w();
                        Object value2 = this$1.f11463t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value2);
                    case 2:
                        j this$2 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        sa.a.w();
                        return this$2.f((z0) this$2.f11460q.getValue());
                    case 3:
                        j this$3 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        sa.a.w();
                        g gVar = this$3.f11447b;
                        z0 z0Var = (z0) this$3.f11460q.getValue();
                        g1 g1Var = this$3.f11450e;
                        gVar.getClass();
                        return new f1(z0Var, g1Var);
                    case 4:
                        j this$4 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        sa.a.w();
                        g gVar2 = this$4.f11447b;
                        Object value3 = this$4.f11458o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        gVar2.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value3, 2);
                    case 5:
                        j this$5 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        sa.a.w();
                        NetworkFetcher networkFetcher2 = this$5.f11448c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                sa.a.w();
                                g gVar3 = this$5.f11447b;
                                w0 w0Var = new w0(gVar3.j, gVar3.f11432d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(w0Var, "newNetworkFetchProducer(...)");
                                com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(this$5.h(w0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
                                g gVar4 = this$5.f11447b;
                                if (!this$5.f11449d || this$5.f11451f == DownsampleMode.f4830i) {
                                    z7 = false;
                                }
                                c1VarA = gVar4.a(bVar, z7, this$5.f11453h);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c1VarA;
                    case 6:
                        j this$6 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        sa.a.w();
                        g gVar5 = this$6.f11447b;
                        Object value4 = this$6.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        gVar5.getClass();
                        return new com.facebook.imagepipeline.producers.b((z0) value4, 2);
                    case 7:
                        j this$7 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        sa.a.w();
                        g gVar6 = this$7.f11447b;
                        ExecutorService executor = ((DefaultExecutorSupplier) gVar6.f11437i).f4824a;
                        e4.e pooledByteBufferFactory = gVar6.j;
                        Intrinsics.checkNotNullParameter(executor, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar = new com.facebook.imagepipeline.producers.l(executor, pooledByteBufferFactory, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar, "newLocalFileFetchProducer(...)");
                        x xVarH = this$7.h(lVar);
                        g1 g1Var2 = this$7.f11450e;
                        gVar6.getClass();
                        return new f1(xVarH, g1Var2);
                    case 8:
                        j this$8 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        sa.a.w();
                        g gVar7 = this$8.f11447b;
                        j0 j0Var = new j0(((DefaultExecutorSupplier) gVar7.f11437i).f4824a, gVar7.j, gVar7.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var, "newLocalContentUriFetchProducer(...)");
                        x xVarH2 = this$8.h(j0Var);
                        g1 g1Var3 = this$8.f11450e;
                        gVar7.getClass();
                        return new f1(xVarH2, g1Var3);
                    case 9:
                        j this$9 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        g gVar8 = this$9.f11447b;
                        ExecutorService executor2 = ((DefaultExecutorSupplier) gVar8.f11437i).f4824a;
                        e4.e pooledByteBufferFactory2 = gVar8.j;
                        Intrinsics.checkNotNullParameter(executor2, "executor");
                        Intrinsics.checkNotNullParameter(pooledByteBufferFactory2, "pooledByteBufferFactory");
                        com.facebook.imagepipeline.producers.l lVar2 = new com.facebook.imagepipeline.producers.l(executor2, pooledByteBufferFactory2, 1);
                        Intrinsics.checkNotNullExpressionValue(lVar2, "newLocalFileFetchProducer(...)");
                        return this$9.g(lVar2, new l1[]{new m0(((DefaultExecutorSupplier) gVar8.f11437i).f4824a, gVar8.j, gVar8.f11429a)});
                    case 10:
                        j this$10 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        g gVar9 = this$10.f11447b;
                        q0 q0Var = new q0(((DefaultExecutorSupplier) gVar9.f11437i).f4824a, gVar9.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(q0Var, "newLocalVideoThumbnailProducer(...)");
                        return this$10.e(q0Var);
                    case 11:
                        j this$11 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        g gVar10 = this$11.f11447b;
                        j0 j0Var2 = new j0(((DefaultExecutorSupplier) gVar10.f11437i).f4824a, gVar10.j, gVar10.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(j0Var2, "newLocalContentUriFetchProducer(...)");
                        gVar10.getClass();
                        e eVar = gVar10.f11437i;
                        ExecutorService executorService = ((DefaultExecutorSupplier) eVar).f4824a;
                        e4.e eVar2 = gVar10.j;
                        ContentResolver contentResolver2 = gVar10.f11429a;
                        return this$11.g(j0Var2, new l1[]{new k0(executorService, eVar2, contentResolver2), new m0(((DefaultExecutorSupplier) eVar).f4824a, eVar2, contentResolver2)});
                    case 12:
                        j this$12 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        g gVar11 = this$12.f11447b;
                        q0 q0Var2 = new q0(((DefaultExecutorSupplier) gVar11.f11437i).f4826c, gVar11.f11429a, 0);
                        Intrinsics.checkNotNullExpressionValue(q0Var2, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.e(q0Var2);
                    case 13:
                        j this$13 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        g gVar12 = this$13.f11447b;
                        j0 j0Var3 = new j0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a, 1);
                        Intrinsics.checkNotNullExpressionValue(j0Var3, "newQualifiedResourceFetchProducer(...)");
                        return this$13.g(j0Var3, new l1[]{new m0(((DefaultExecutorSupplier) gVar12.f11437i).f4824a, gVar12.j, gVar12.f11429a)});
                    case 14:
                        j this$14 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        g gVar13 = this$14.f11447b;
                        i0 i0Var = new i0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11430b);
                        Intrinsics.checkNotNullExpressionValue(i0Var, "newLocalResourceFetchProducer(...)");
                        return this$14.g(i0Var, new l1[]{new m0(((DefaultExecutorSupplier) gVar13.f11437i).f4824a, gVar13.j, gVar13.f11429a)});
                    case 15:
                        j this$15 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        g gVar14 = this$15.f11447b;
                        i0 i0Var2 = new i0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11431c);
                        Intrinsics.checkNotNullExpressionValue(i0Var2, "newLocalAssetFetchProducer(...)");
                        return this$15.g(i0Var2, new l1[]{new m0(((DefaultExecutorSupplier) gVar14.f11437i).f4824a, gVar14.j, gVar14.f11429a)});
                    case 16:
                        j this$16 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        g gVar15 = this$16.f11447b;
                        com.facebook.imagepipeline.producers.l lVar3 = new com.facebook.imagepipeline.producers.l(l8.a.f14971d, gVar15.j, 0);
                        Intrinsics.checkNotNullExpressionValue(lVar3, "newDataFetchProducer(...)");
                        return this$16.f(gVar15.a(new com.facebook.imagepipeline.producers.b(lVar3, 0), true, this$16.f11453h));
                    default:
                        j this$17 = this.f11445e;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        sa.a.w();
                        Object value5 = this$17.f11462s.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        return new com.facebook.imagepipeline.producers.b((z0) value5);
                }
            }
        });
    }

    public final z0 a(ImageRequest imageRequest) {
        sa.a.w();
        Uri sourceUri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        if (sourceUri == null) {
            throw new IllegalStateException("Uri is null.");
        }
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            return (z0) this.f11457n.getValue();
        }
        u uVar = this.f11465v;
        u uVar2 = this.f11467x;
        switch (sourceUriType) {
            case 2:
                return imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? (z0) uVar2.getValue() : (z0) uVar.getValue();
            case 3:
                return imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? (z0) uVar2.getValue() : (z0) this.f11464u.getValue();
            case 4:
                if (imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                    return (z0) uVar2.getValue();
                }
                String type = this.f11446a.getType(sourceUri);
                Object obj = p8.a.f17788a;
                return type != null ? kotlin.text.x.o(type, "video/", false) : false ? (z0) uVar.getValue() : (z0) this.f11466w.getValue();
            case 5:
                return (z0) this.A.getValue();
            case 6:
                return (z0) this.f11469z.getValue();
            case 7:
                return (z0) this.B.getValue();
            case 8:
                return (z0) this.f11468y.getValue();
            default:
                Set set = this.f11454i;
                if (set != null) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        throw s0.g.a(it);
                    }
                }
                throw new IllegalArgumentException(a3.e.l("Unsupported uri scheme! Uri is: ", i.a(sourceUri)));
        }
    }

    public final z0 b(ImageRequest imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (imageRequest.getLowestPermittedRequestLevel().f5124d > 3) {
            throw new IllegalArgumentException();
        }
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            Object value = this.f11459p.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (z0) value;
        }
        if (sourceUriType == 2 || sourceUriType == 3) {
            Object value2 = this.f11461r.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            return (z0) value2;
        }
        Uri sourceUri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        throw new IllegalArgumentException(a3.e.l("Unsupported uri scheme for encoded image fetch! Uri is: ", i.a(sourceUri)));
    }

    public final z0 c(ImageRequest imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        sa.a.w();
        if (imageRequest.getLowestPermittedRequestLevel().f5124d > 3) {
            throw new IllegalArgumentException();
        }
        Uri sourceUri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            return (z0) this.k.getValue();
        }
        if (sourceUriType == 2 || sourceUriType == 3) {
            return (z0) this.f11455l.getValue();
        }
        if (sourceUriType == 4) {
            return (z0) this.f11456m.getValue();
        }
        Set set = this.f11454i;
        if (set != null) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                throw s0.g.a(it);
            }
        }
        throw new IllegalArgumentException(a3.e.l("Unsupported uri scheme for encoded image fetch! Uri is: ", i.a(sourceUri)));
    }

    public final synchronized z0 d(z0 z0Var) {
        z0 z0Var2;
        z0Var2 = (z0) this.j.get(z0Var);
        if (z0Var2 == null) {
            g gVar = this.f11447b;
            x0 x0Var = new x0(z0Var, gVar.f11441o, ((DefaultExecutorSupplier) gVar.f11437i).f4826c);
            Intrinsics.checkNotNullExpressionValue(x0Var, "newPostprocessorProducer(...)");
            g gVar2 = this.f11447b;
            x0 x0Var2 = new x0(gVar2.f11439m, gVar2.f11440n, x0Var);
            this.j.put(z0Var, x0Var2);
            z0Var2 = x0Var2;
        }
        return z0Var2;
    }

    public final z0 e(z0 z0Var) {
        g gVar = this.f11447b;
        ga.i iVar = gVar.f11439m;
        DefaultCacheKeyFactory cacheKeyFactory = gVar.f11440n;
        com.facebook.imagepipeline.producers.j jVar = new com.facebook.imagepipeline.producers.j(iVar, cacheKeyFactory, z0Var);
        Intrinsics.checkNotNullExpressionValue(jVar, "newBitmapMemoryCacheProducer(...)");
        com.facebook.imagepipeline.producers.h hVar = new com.facebook.imagepipeline.producers.h(cacheKeyFactory, jVar);
        Intrinsics.checkNotNullExpressionValue(hVar, "newBitmapMemoryCacheKeyMultiplexProducer(...)");
        f1 inputProducer = new f1(hVar, this.f11450e);
        Intrinsics.checkNotNullExpressionValue(inputProducer, "newBackgroundThreadHandoffProducer(...)");
        ga.i memoryCache = gVar.f11439m;
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        com.facebook.imagepipeline.producers.g gVar2 = new com.facebook.imagepipeline.producers.g(memoryCache, cacheKeyFactory, inputProducer);
        Intrinsics.checkNotNullExpressionValue(gVar2, "newBitmapMemoryCacheGetProducer(...)");
        return gVar2;
    }

    public final z0 f(z0 inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        sa.a.w();
        g gVar = this.f11447b;
        q qVar = new q(gVar.f11432d, ((DefaultExecutorSupplier) gVar.f11437i).f4825b, gVar.f11433e, gVar.f11434f, gVar.f11435g, gVar.f11436h, inputProducer, gVar.f11443q, gVar.f11442p);
        Intrinsics.checkNotNullExpressionValue(qVar, "newDecodeProducer(...)");
        return e(qVar);
    }

    public final z0 g(o0 o0Var, l1[] l1VarArr) {
        com.facebook.imagepipeline.producers.b bVar = new com.facebook.imagepipeline.producers.b(h(o0Var), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "newAddImageTransformMetaDataProducer(...)");
        g gVar = this.f11447b;
        ta.b bVar2 = this.f11453h;
        j1 j1Var = new j1(((DefaultExecutorSupplier) gVar.f11437i).f4827d, gVar.a(bVar, true, bVar2));
        Intrinsics.checkNotNullExpressionValue(j1Var, "newThrottlingProducer(...)");
        com.facebook.imagepipeline.producers.b bVar3 = new com.facebook.imagepipeline.producers.b(l1VarArr);
        Intrinsics.checkNotNullExpressionValue(bVar3, "newThumbnailBranchProducer(...)");
        c1 c1VarA = gVar.a(bVar3, true, bVar2);
        Intrinsics.checkNotNullExpressionValue(c1VarA, "newResizeAndRotateProducer(...)");
        f1 f1Var = new f1(c1VarA, j1Var);
        Intrinsics.checkNotNullExpressionValue(f1Var, "newBranchOnSeparateImagesProducer(...)");
        return f(f1Var);
    }

    public final x h(z0 z0Var) {
        boolean z5 = this.f11452g;
        g gVar = this.f11447b;
        if (z5) {
            sa.a.w();
            w wVar = new w(gVar.k, gVar.f11440n, z0Var);
            Intrinsics.checkNotNull(wVar);
            z0Var = new com.facebook.imagepipeline.producers.u(gVar.k, gVar.f11440n, wVar);
            Intrinsics.checkNotNullExpressionValue(z0Var, "newDiskCacheReadProducer(...)");
        }
        ga.i iVar = gVar.f11438l;
        DefaultCacheKeyFactory defaultCacheKeyFactory = gVar.f11440n;
        z zVar = new z(iVar, defaultCacheKeyFactory, z0Var);
        Intrinsics.checkNotNullExpressionValue(zVar, "newEncodedMemoryCacheProducer(...)");
        x xVar = new x(defaultCacheKeyFactory, zVar);
        Intrinsics.checkNotNullExpressionValue(xVar, "newEncodedCacheKeyMultiplexProducer(...)");
        return xVar;
    }
}
