package hl;

import com.otaliastudios.zoom.OverZoomRangeProvider;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import dl.g;
import kotlin.jvm.internal.Intrinsics;
import lo.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends fq.a {
    public static final ZoomLogger I;
    public int E;
    public OverZoomRangeProvider F;
    public boolean G;
    public boolean H;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ZoomEngine f10942i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f10943v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f10944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f10946y;

    static {
        String tag = c.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(tag, "TAG");
        Intrinsics.checkNotNullParameter(tag, "tag");
        I = new ZoomLogger(tag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ZoomEngine engine, g provider) {
        super(provider);
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f10942i = engine;
        this.f10944w = 0.8f;
        this.f10946y = 2.5f;
        this.F = OverZoomRangeProvider.f7015c;
        this.G = true;
        this.H = true;
    }

    public final float A0() {
        int i7 = this.E;
        if (i7 == 0) {
            return this.f10946y * this.f10943v;
        }
        if (i7 == 1) {
            return this.f10946y;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown ZoomType ", Integer.valueOf(this.E)));
    }

    public final float B0() {
        int i7 = this.f10945x;
        if (i7 == 0) {
            return this.f10944w * this.f10943v;
        }
        if (i7 == 1) {
            return this.f10944w;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown ZoomType ", Integer.valueOf(this.f10945x)));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    public final float z0(float f2, boolean z5) {
        float f7;
        float fB0 = B0();
        float fA0 = A0();
        if (z5 && this.H) {
            OverZoomRangeProvider overZoomRangeProvider = this.F;
            ZoomEngine zoomEngine = this.f10942i;
            float fO = overZoomRangeProvider.o(zoomEngine);
            ZoomLogger zoomLogger = I;
            if (fO < 0.0f) {
                zoomLogger.getClass();
                Intrinsics.checkNotNullParameter("Received negative maxOverZoomOut value, coercing to 0", "message");
                if (fO < 0.0f) {
                    fO = 0.0f;
                }
            }
            fB0 -= fO;
            float fO2 = this.F.o(zoomEngine);
            if (fO2 < 0.0f) {
                zoomLogger.getClass();
                Intrinsics.checkNotNullParameter("Received negative maxOverZoomIn value, coercing to 0", "message");
                f7 = fO2 >= 0.0f ? fO2 : 0.0f;
            }
            fA0 += f7;
        }
        if (fA0 < fB0) {
            int i7 = this.E;
            if (i7 == this.f10945x) {
                throw new IllegalStateException("maxZoom is less than minZoom: " + fA0 + " < " + fB0);
            }
            if (i7 == 0) {
                fB0 = fA0;
            } else {
                fA0 = fB0;
            }
        }
        return j.c(f2, fB0, fA0);
    }
}
