package s9;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.recyclerview.widget.h;
import com.facebook.drawee.drawable.DrawableProperties;
import kh.f;
import kotlin.jvm.internal.Intrinsics;
import o9.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Drawable implements Animatable, a9.a {
    public static final f M = new f(15);
    public long E;
    public long F;
    public int G;
    public int I;
    public DrawableProperties K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l9.a f19806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f19807e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f19808i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f19809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f19810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f19811x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19812y;
    public final long H = 8;
    public volatile f J = M;
    public final a L = new a(0, this);

    public b(l9.a aVar) {
        this.f19806d = aVar;
        this.f19807e = new h(aVar);
    }

    @Override // a9.a
    public final void a() {
        l9.a aVar = this.f19806d;
        if (aVar != null) {
            aVar.f14982a.a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) throws Throwable {
        long j;
        c cVar;
        o9.a aVar;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f19806d == null || this.f19807e == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jMax = this.f19808i ? jUptimeMillis - this.f19809v : (long) Math.max(this.f19810w, 0.0d);
        h hVar = this.f19807e;
        Intrinsics.checkNotNull(hVar);
        l9.a aVar2 = (l9.a) hVar.f2615i;
        long jI = hVar.I();
        int iA = 0;
        if (jI == 0) {
            long jB = 0;
            while (true) {
                jB += (long) aVar2.b(iA);
                int i7 = iA + 1;
                if (0 < jB) {
                    break;
                } else {
                    iA = i7;
                }
            }
        } else if (aVar2.c() != 0 && jMax / jI >= aVar2.c()) {
            iA = -1;
        } else {
            long j5 = jMax % jI;
            long jB2 = 0;
            while (true) {
                jB2 += (long) aVar2.b(iA);
                int i10 = iA + 1;
                if (j5 < jB2) {
                    break;
                } else {
                    iA = i10;
                }
            }
        }
        if (iA == -1) {
            l9.a aVar3 = this.f19806d;
            Intrinsics.checkNotNull(aVar3);
            iA = aVar3.a() - 1;
            this.J.getClass();
            Intrinsics.checkNotNullParameter(this, "drawable");
            this.f19808i = false;
        } else if (iA == 0 && this.f19812y != -1 && jUptimeMillis >= this.f19811x) {
            this.J.getClass();
            Intrinsics.checkNotNullParameter(this, "drawable");
        }
        l9.a aVar4 = this.f19806d;
        Intrinsics.checkNotNull(aVar4);
        aVar4.f14986e = aVar4.f14983b.now();
        Intrinsics.checkNotNullParameter(this, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        m9.a aVar5 = aVar4.f14982a;
        aVar5.getClass();
        Intrinsics.checkNotNullParameter(this, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean zC = aVar5.c(canvas, iA, 0);
        if (!aVar5.f15474e && (cVar = aVar5.f15476g) != null && (aVar = aVar5.f15475f) != null) {
            aVar.a(cVar, aVar5.f15471b, aVar5, iA);
        }
        boolean z5 = zC;
        aVar4.d();
        if (z5) {
            this.J.getClass();
            Intrinsics.checkNotNullParameter(this, "drawable");
            this.f19812y = iA;
        }
        if (!z5) {
            this.I++;
            if (o8.a.f17171a.isLoggable(2)) {
                o8.a.q("Dropped a frame. Count: %s", Integer.valueOf(this.I), b.class);
            }
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (this.f19808i) {
            h hVar2 = this.f19807e;
            Intrinsics.checkNotNull(hVar2);
            long j7 = jUptimeMillis2 - this.f19809v;
            l9.a aVar6 = (l9.a) hVar2.f2615i;
            long jI2 = hVar2.I();
            if (jI2 != 0 && (aVar6.c() == 0 || j7 / jI2 < aVar6.c())) {
                long j10 = j7 % jI2;
                int iA2 = aVar6.a();
                long jB3 = 0;
                for (int i11 = 0; i11 < iA2 && jB3 <= j10; i11++) {
                    jB3 += (long) aVar6.b(i11);
                }
                j = j7 + (jB3 - j10);
            } else {
                j = -1;
            }
            if (j != -1) {
                long j11 = this.f19809v + j + this.H;
                this.f19811x = j11;
                scheduleSelf(this.L, j11);
            } else {
                this.J.getClass();
                Intrinsics.checkNotNullParameter(this, "drawable");
                this.f19808i = false;
            }
        }
        this.f19810w = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        l9.a aVar = this.f19806d;
        if (aVar == null) {
            return super.getIntrinsicHeight();
        }
        m9.a aVar2 = aVar.f14982a;
        Intrinsics.checkNotNull(aVar2);
        return aVar2.f15479l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        l9.a aVar = this.f19806d;
        if (aVar == null) {
            return super.getIntrinsicWidth();
        }
        m9.a aVar2 = aVar.f14982a;
        Intrinsics.checkNotNull(aVar2);
        return aVar2.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f19808i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        l9.a aVar = this.f19806d;
        if (aVar != null) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            m9.a aVar2 = aVar.f14982a;
            aVar2.j = bounds;
            r9.a aVar3 = aVar2.f15473d;
            ca.a aVar4 = (ca.a) aVar3.f19216c;
            if (!ca.a.a(aVar4.f3549c, bounds).equals(aVar4.f3550d)) {
                aVar4 = new ca.a(aVar4.f3547a, aVar4.f3548b, bounds, aVar4.j);
            }
            Intrinsics.checkNotNullExpressionValue(aVar4, "forNewBounds(...)");
            if (aVar4 != ((ca.a) aVar3.f19216c)) {
                aVar3.f19216c = aVar4;
                aVar3.f19217d = new a3.f(aVar4, aVar3.f19214a, (op.c) aVar3.f19218e);
            }
            aVar2.e();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        if (this.f19808i) {
            return false;
        }
        long j = i7;
        if (this.f19810w == j) {
            return false;
        }
        this.f19810w = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.K == null) {
            this.K = new DrawableProperties();
        }
        DrawableProperties drawableProperties = this.K;
        Intrinsics.checkNotNull(drawableProperties);
        drawableProperties.f4639a = i7;
        l9.a aVar = this.f19806d;
        if (aVar != null) {
            aVar.f14982a.f15478i.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.K == null) {
            this.K = new DrawableProperties();
        }
        DrawableProperties drawableProperties = this.K;
        Intrinsics.checkNotNull(drawableProperties);
        drawableProperties.f4641c = colorFilter;
        drawableProperties.f4640b = colorFilter != null;
        l9.a aVar = this.f19806d;
        if (aVar != null) {
            aVar.f14982a.f15478i.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        l9.a aVar;
        if (this.f19808i || (aVar = this.f19806d) == null) {
            return;
        }
        Intrinsics.checkNotNull(aVar);
        if (aVar.a() <= 1) {
            return;
        }
        this.f19808i = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.E;
        this.f19809v = j;
        this.f19811x = j;
        this.f19810w = jUptimeMillis - this.F;
        this.f19812y = this.G;
        invalidateSelf();
        this.J.getClass();
        Intrinsics.checkNotNullParameter(this, "drawable");
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f19808i) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.E = jUptimeMillis - this.f19809v;
            this.F = jUptimeMillis - this.f19810w;
            this.G = this.f19812y;
            this.f19808i = false;
            this.f19809v = 0L;
            this.f19811x = 0L;
            this.f19810w = -1L;
            this.f19812y = -1;
            unscheduleSelf(this.L);
            this.J.getClass();
            Intrinsics.checkNotNullParameter(this, "drawable");
        }
    }
}
