package gl;

import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbsolutePoint f10121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScaledPoint f10122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f10125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Float f10126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10127i;
    public final boolean j;

    static {
        String tag = c.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(tag, "TAG");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    public c(float f2, boolean z5, AbsolutePoint absolutePoint, ScaledPoint scaledPoint, boolean z6, boolean z7, Float f7, Float f10, boolean z10) {
        this.f10119a = f2;
        this.f10120b = z5;
        this.f10121c = absolutePoint;
        this.f10122d = scaledPoint;
        this.f10123e = z6;
        this.f10124f = z7;
        this.f10125g = f7;
        this.f10126h = f10;
        this.f10127i = z10;
        if (absolutePoint != null && scaledPoint != null) {
            throw new IllegalStateException("Can only use either pan or scaledPan");
        }
        this.j = (absolutePoint == null && scaledPoint == null) ? false : true;
    }
}
