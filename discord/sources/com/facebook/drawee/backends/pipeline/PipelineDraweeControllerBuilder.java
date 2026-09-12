package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.widget.b4;
import c9.b;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import f0.e;
import ga.i;
import j8.c;
import sh.t1;
import x8.a;

/* JADX INFO: loaded from: classes3.dex */
public final class PipelineDraweeControllerBuilder extends AbstractDraweeControllerBuilder {
    public final ImagePipeline k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b4 f4629l;

    public PipelineDraweeControllerBuilder(Context context, b4 b4Var, ImagePipeline imagePipeline) {
        c();
        this.k = imagePipeline;
        this.f4629l = b4Var;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    public final a b(b bVar, String str, Object obj, Object obj2, int i7) {
        ImageRequest.RequestLevel requestLevel;
        String str2;
        ImageRequest imageRequest = (ImageRequest) obj;
        ImagePipeline imagePipeline = this.k;
        int iB = e.b(i7);
        if (iB == 0) {
            requestLevel = ImageRequest.RequestLevel.FULL_FETCH;
        } else if (iB == 1) {
            requestLevel = ImageRequest.RequestLevel.DISK_CACHE;
        } else {
            if (iB != 2) {
                StringBuilder sb2 = new StringBuilder("Cache level");
                if (i7 == 1) {
                    str2 = "FULL_FETCH";
                } else if (i7 != 2) {
                    str2 = i7 != 3 ? "null" : "BITMAP_MEMORY_CACHE";
                } else {
                    str2 = "DISK_CACHE";
                }
                sb2.append(str2);
                sb2.append("is not supported. ");
                throw new RuntimeException(sb2.toString());
            }
            requestLevel = ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        ImageRequest.RequestLevel requestLevel2 = requestLevel;
        synchronized (bVar) {
        }
        return imagePipeline.a(imageRequest, obj2, requestLevel2, null, str);
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    public final b d() {
        b bVar;
        CacheKey postprocessedBitmapCacheKey;
        sa.a.w();
        try {
            DraweeController draweeController = this.f4638g;
            String strValueOf = String.valueOf(AbstractDraweeControllerBuilder.j.getAndIncrement());
            if (draweeController instanceof b) {
                bVar = (b) draweeController;
            } else {
                b4 b4Var = this.f4629l;
                bVar = new b((Resources) b4Var.f909d, (e9.b) b4Var.f910e, (t1) b4Var.f911i, (k8.a) b4Var.f912v, (l8.e) b4Var.f913w, (i) b4Var.f914x);
                c cVar = (c) b4Var.f915y;
                if (cVar != null) {
                    bVar.f3542y = ((Boolean) cVar.f13678b).booleanValue();
                }
            }
            Supplier supplierE = e(bVar, strValueOf);
            ImageRequest imageRequest = this.f4633b;
            DefaultCacheKeyFactory defaultCacheKeyFactory = this.k.f4840h;
            if (defaultCacheKeyFactory == null || imageRequest == null) {
                postprocessedBitmapCacheKey = null;
            } else {
                postprocessedBitmapCacheKey = imageRequest.getPostprocessor() != null ? defaultCacheKeyFactory.getPostprocessedBitmapCacheKey(imageRequest, this.f4632a) : defaultCacheKeyFactory.getBitmapCacheKey(imageRequest, this.f4632a);
            }
            Object obj = this.f4632a;
            sa.a.w();
            bVar.f(obj, strValueOf);
            bVar.f9040p = false;
            bVar.f3541x = supplierE;
            bVar.q(null);
            bVar.f3540w = postprocessedBitmapCacheKey;
            bVar.q(null);
            sa.a.w();
            synchronized (bVar) {
                bVar.f3543z = this.f4633b;
                bVar.A = this.f4634c;
            }
            sa.a.w();
            return bVar;
        } catch (Throwable th2) {
            sa.a.w();
            throw th2;
        }
    }
}
