package jh;

import android.graphics.Paint;
import android.graphics.Path;
import b1.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f13870i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f13871l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f13872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f13873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f13874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f13878g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f13879h;

    public a() {
        Paint paint = new Paint();
        this.f13879h = paint;
        this.f13872a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f13873b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f13874c = new Paint(paint2);
    }

    public final void a(int i7) {
        this.f13875d = c.e(i7, 68);
        this.f13876e = c.e(i7, 20);
        this.f13877f = c.e(i7, 0);
        this.f13872a.setColor(this.f13875d);
    }
}
