package ah;

import android.content.Context;
import com.discord.R;
import com.facebook.imagepipeline.nativecode.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f604f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f609e;

    public a(Context context) {
        boolean zV = b.v(context, R.attr.elevationOverlayEnabled, false);
        int iX = io.sentry.config.a.x(context, R.attr.elevationOverlayColor, 0);
        int iX2 = io.sentry.config.a.x(context, R.attr.elevationOverlayAccentColor, 0);
        int iX3 = io.sentry.config.a.x(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f605a = zV;
        this.f606b = iX;
        this.f607c = iX2;
        this.f608d = iX3;
        this.f609e = f2;
    }
}
