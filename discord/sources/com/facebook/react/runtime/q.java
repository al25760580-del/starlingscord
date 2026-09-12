package com.facebook.react.runtime;

import androidx.work.impl.WorkDatabase;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5326e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5327i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5328v;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i7) {
        this.f5325d = i7;
        this.f5326e = obj;
        this.f5327i = obj2;
        this.f5328v = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5325d) {
            case 0:
                return ReactHostImpl.destroy$lambda$12((ReactHostImpl) this.f5326e, (String) this.f5327i, (Exception) this.f5328v);
            case 1:
                AtomicBoolean isCancelled = (AtomicBoolean) this.f5326e;
                ga.b this$0 = (ga.b) this.f5327i;
                CacheKey key = (CacheKey) this.f5328v;
                Intrinsics.checkNotNullParameter(isCancelled, "$isCancelled");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(key, "$key");
                try {
                    if (isCancelled.get()) {
                        throw new CancellationException();
                    }
                    ga.l lVar = this$0.f9530g;
                    ga.k kVar = this$0.f9529f;
                    EncodedImage encodedImageK = lVar.k(key);
                    if (encodedImageK != null) {
                        o8.a.q("Found image for %s in staging area", key.c(), ga.b.class);
                        kVar.getClass();
                    } else {
                        o8.a.q("Did not find image for %s in staging area", key.c(), ga.b.class);
                        kVar.getClass();
                        try {
                            pa.q qVarC = this$0.c(key);
                            if (qVarC == null) {
                                return null;
                            }
                            r8.b bVarB = CloseableReference.B(qVarC);
                            Intrinsics.checkNotNullExpressionValue(bVarB, "of(...)");
                            try {
                                EncodedImage encodedImage = new EncodedImage(bVarB);
                                CloseableReference.l(bVarB);
                                encodedImageK = encodedImage;
                            } catch (Throwable th2) {
                                CloseableReference.l(bVarB);
                                throw th2;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (!Thread.interrupted()) {
                        return encodedImageK;
                    }
                    if (o8.a.f17171a.isLoggable(2)) {
                        o8.a.f17171a.v(ga.b.class.getSimpleName(), "Host thread was interrupted, decreasing reference count");
                    }
                    encodedImageK.close();
                    throw new InterruptedException();
                } catch (Throwable th3) {
                    Intrinsics.checkNotNullParameter(th3, "th");
                    throw th3;
                }
            case 2:
                return ((ni.e) this.f5326e).f16943d.submit(new io.sentry.react.d(12, (Callable) this.f5327i, (u4.b) this.f5328v));
            default:
                w3.e eVar = (w3.e) this.f5326e;
                ArrayList arrayList = (ArrayList) this.f5328v;
                String str = (String) this.f5327i;
                WorkDatabase workDatabase = eVar.f22020e;
                arrayList.addAll(workDatabase.u().I(str));
                return workDatabase.t().n(str);
        }
    }

    public /* synthetic */ q(w3.e eVar, ArrayList arrayList, String str) {
        this.f5325d = 3;
        this.f5326e = eVar;
        this.f5328v = arrayList;
        this.f5327i = str;
    }
}
