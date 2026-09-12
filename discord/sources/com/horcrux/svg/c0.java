package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.imagehelper.ImageSource;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends RenderableView {
    public String E;
    public int F;
    public final AtomicBoolean G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f6672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f6673e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r0 f6674i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0 f6675v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f6676w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6677x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6678y;

    public c0(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.G = new AtomicBoolean(false);
    }

    public final void c(Canvas canvas, Paint paint, Bitmap bitmap, float f2) {
        if (this.f6677x == 0 || this.f6678y == 0) {
            this.f6677x = bitmap.getWidth();
            this.f6678y = bitmap.getHeight();
        }
        RectF rectFD = d();
        RectF rectF = new RectF(0.0f, 0.0f, this.f6677x, this.f6678y);
        a5.l0.C(rectF, rectFD, this.E, this.F).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f2 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    public final RectF d() {
        double dRelativeOnWidth = relativeOnWidth(this.f6672d);
        double dRelativeOnHeight = relativeOnHeight(this.f6673e);
        double dRelativeOnWidth2 = relativeOnWidth(this.f6674i);
        double dRelativeOnHeight2 = relativeOnHeight(this.f6675v);
        if (dRelativeOnWidth2 == 0.0d) {
            dRelativeOnWidth2 = this.f6677x * this.mScale;
        }
        if (dRelativeOnHeight2 == 0.0d) {
            dRelativeOnHeight2 = this.f6678y * this.mScale;
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f2) {
        boolean z5;
        if (this.G.get()) {
            return;
        }
        ImagePipeline imagePipelineS = c9.a.s();
        ImageRequest imageRequest = ImageRequest.fromUri(new ImageSource(this.mContext, this.f6676w).getUri());
        if (imageRequest == null) {
            imagePipelineS.getClass();
            z5 = false;
        } else {
            CacheKey bitmapCacheKey = imagePipelineS.f4840h.getBitmapCacheKey(imageRequest, null);
            ga.i iVar = imagePipelineS.f4838f;
            Intrinsics.checkNotNull(bitmapCacheKey);
            CloseableReference closeableReference = iVar.get(bitmapCacheKey);
            try {
                z5 = CloseableReference.z(closeableReference);
                CloseableReference.l(closeableReference);
            } catch (Throwable th2) {
                CloseableReference.l(closeableReference);
                throw th2;
            }
        }
        if (!z5) {
            this.G.set(true);
            imagePipelineS.a(imageRequest, this.mContext, null, null, null).d(new b0(this), l8.e.f());
            return;
        }
        float f7 = f2 * this.mOpacity;
        ReactContext reactContext = this.mContext;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit = ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        Intrinsics.checkNotNullParameter(lowestPermittedRequestLevelOnSubmit, "lowestPermittedRequestLevelOnSubmit");
        CancellationException cancellationException = ImagePipeline.k;
        x8.a aVarA = imagePipelineS.a(imageRequest, reactContext, lowestPermittedRequestLevelOnSubmit, null, null);
        try {
            try {
                CloseableReference closeableReference2 = (CloseableReference) aVarA.getResult();
                try {
                    if (closeableReference2 == null) {
                        aVarA.close();
                        return;
                    }
                    try {
                        na.c cVar = (na.c) closeableReference2.q();
                        if (!(cVar instanceof na.d)) {
                            closeableReference2.close();
                            aVarA.close();
                            return;
                        }
                        Bitmap bitmap = ((na.g) ((na.d) cVar)).f16528w;
                        if (bitmap == null) {
                            closeableReference2.close();
                            aVarA.close();
                        } else {
                            c(canvas, paint, bitmap, f7);
                            closeableReference2.close();
                            aVarA.close();
                        }
                    } catch (Exception e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (Throwable th3) {
                    closeableReference2.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                aVarA.close();
                throw th4;
            }
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        this.mPath = path;
        path.addRect(d(), Path.Direction.CW);
        return this.mPath;
    }
}
