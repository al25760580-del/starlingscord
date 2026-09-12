package hl;

import com.otaliastudios.zoom.OverPanRangeProvider;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import dl.g;
import kotlin.jvm.internal.Intrinsics;
import lo.j;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends fq.a {
    public static final ZoomLogger H;
    public int E;
    public OverPanRangeProvider F;
    public final ScaledPoint G;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ZoomEngine f10937i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10938v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10940x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10941y;

    static {
        String tag = b.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(tag, "TAG");
        Intrinsics.checkNotNullParameter(tag, "tag");
        H = new ZoomLogger(tag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ZoomEngine engine, g provider) {
        super(provider);
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f10937i = engine;
        this.f10938v = true;
        this.f10939w = true;
        this.f10940x = true;
        this.f10941y = true;
        this.E = 51;
        this.F = OverPanRangeProvider.f7014b;
        this.G = new ScaledPoint();
    }

    public static float z0(int i7, float f2, boolean z5) {
        int i10 = z5 ? i7 & 7 : i7 & 112;
        if (i10 != 1) {
            if (i10 == 3) {
                return 0.0f;
            }
            if (i10 != 5) {
                if (i10 != 16) {
                    if (i10 == 48 || i10 != 80) {
                        return 0.0f;
                    }
                }
            }
            return f2;
        }
        return f2 * 0.5f;
    }

    public final float A0(boolean z5, boolean z6) {
        float fD0;
        float f2;
        gl.a aVarX0 = x0();
        float f7 = z5 ? aVarX0.f10100e.left : aVarX0.f10100e.top;
        gl.a aVarX1 = x0();
        float f10 = z5 ? aVarX1.j : aVarX1.k;
        gl.a aVarX2 = x0();
        float fWidth = z5 ? aVarX2.f10100e.width() : aVarX2.f10100e.height();
        float fZ0 = 0.0f;
        if ((z5 ? this.f10938v : this.f10939w) && z6) {
            fD0 = z5 ? D0() : E0();
        } else {
            fD0 = 0.0f;
        }
        int i7 = 3;
        int i10 = 48;
        if (z5) {
            int i11 = this.E & 240;
            if (i11 != 16) {
                if (i11 != 32) {
                    i7 = i11 != 48 ? 0 : 1;
                } else {
                    i7 = 5;
                }
            }
        } else {
            int i12 = this.E & (-241);
            if (i12 != 1) {
                if (i12 != 2) {
                    i10 = i12 != 3 ? 0 : 16;
                } else {
                    i10 = 80;
                }
            }
            i7 = i10;
        }
        if (fWidth <= f10) {
            f2 = f10 - fWidth;
            if (i7 != 0) {
                fZ0 = z0(i7, f2, z5);
                f2 = fZ0;
            }
        } else {
            fZ0 = f10 - fWidth;
            f2 = 0.0f;
        }
        return j.c(f7, fZ0 - fD0, f2 + fD0) - f7;
    }

    public final void B0(boolean z5, a output) {
        Intrinsics.checkNotNullParameter(output, "output");
        gl.a aVarX0 = x0();
        int i7 = (int) (z5 ? aVarX0.f10100e.left : aVarX0.f10100e.top);
        gl.a aVarX1 = x0();
        int i10 = (int) (z5 ? aVarX1.j : aVarX1.k);
        gl.a aVarX2 = x0();
        int iWidth = (int) (z5 ? aVarX2.f10100e.width() : aVarX2.f10100e.height());
        int iA0 = (int) A0(z5, false);
        int i11 = z5 ? this.E & 240 : this.E & (-241);
        if (iWidth > i10) {
            output.f10933a = -(iWidth - i10);
            output.f10935c = 0;
        } else if (i11 == 68 || i11 == 0 || i11 == 64 || i11 == 4) {
            output.f10933a = 0;
            output.f10935c = i10 - iWidth;
        } else {
            int i12 = i7 + iA0;
            output.f10933a = i12;
            output.f10935c = i12;
        }
        output.f10934b = i7;
        output.f10936d = iA0 != 0;
    }

    public final ScaledPoint C0() {
        Float fValueOf = Float.valueOf(A0(true, false));
        Float fValueOf2 = Float.valueOf(A0(false, false));
        ScaledPoint scaledPoint = this.G;
        scaledPoint.a(fValueOf, fValueOf2);
        return scaledPoint;
    }

    public final float D0() {
        float f2 = this.F.f(this.f10937i, true);
        if (f2 < 0.0f) {
            H.getClass();
            Intrinsics.checkNotNullParameter("Received negative maxHorizontalOverPan value, coercing to 0", "message");
            if (f2 < 0.0f) {
                return 0.0f;
            }
        }
        return f2;
    }

    public final float E0() {
        float f2 = this.F.f(this.f10937i, false);
        if (f2 < 0.0f) {
            H.getClass();
            Intrinsics.checkNotNullParameter("Received negative maxVerticalOverPan value, coercing to 0", "message");
            if (f2 < 0.0f) {
                return 0.0f;
            }
        }
        return f2;
    }
}
