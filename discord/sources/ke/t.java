package ke;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import com.facebook.react.uimanager.ViewProps;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f14404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f14405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f14407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f14408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f14409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14411i;
    public int j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f14412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f14413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f14414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f14415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f14416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f14417q;

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    public t(Context context) {
        q rVar;
        DisplayManager displayManager;
        d dVar = new d();
        dVar.f14340a = new c();
        dVar.f14341b = new c();
        dVar.f14343d = -9223372036854775807L;
        this.f14403a = dVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            rVar = (e0.f13788a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService(ViewProps.DISPLAY)) == null) ? null : new r(displayManager);
            if (rVar == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    rVar = new ga.l(19, windowManager);
                } else {
                    rVar = null;
                }
            }
        } else {
            rVar = null;
        }
        this.f14404b = rVar;
        this.f14405c = rVar != null ? s.f14398w : null;
        this.k = -9223372036854775807L;
        this.f14412l = -9223372036854775807L;
        this.f14408f = -1.0f;
        this.f14411i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (e0.f13788a < 30 || (surface = this.f14407e) == null || this.j == Integer.MIN_VALUE || this.f14410h == 0.0f) {
            return;
        }
        this.f14410h = 0.0f;
        p.a(surface, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void b() {
        float f2;
        float f7;
        if (e0.f13788a < 30 || this.f14407e == null) {
            return;
        }
        d dVar = this.f14403a;
        if (!dVar.f14340a.a()) {
            f2 = this.f14408f;
        } else if (dVar.f14340a.a()) {
            c cVar = dVar.f14340a;
            long j = cVar.f14336e;
            f2 = (float) (1.0E9d / (j != 0 ? cVar.f14337f / j : 0L));
        } else {
            f2 = -1.0f;
        }
        float f10 = this.f14409g;
        if (f2 == f10) {
            return;
        }
        if (f2 != -1.0f && f10 != -1.0f) {
            if (dVar.f14340a.a()) {
                if ((dVar.f14340a.a() ? dVar.f14340a.f14337f : -9223372036854775807L) >= 5000000000L) {
                    f7 = 0.02f;
                } else {
                    f7 = 1.0f;
                }
            } else {
                f7 = 1.0f;
            }
            if (Math.abs(f2 - this.f14409g) < f7) {
                return;
            }
        } else if (f2 == -1.0f && dVar.f14344e < 30) {
            return;
        }
        this.f14409g = f2;
        c(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public final void c(boolean z5) {
        Surface surface;
        float f2;
        if (e0.f13788a < 30 || (surface = this.f14407e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f14406d) {
            float f7 = this.f14409g;
            if (f7 != -1.0f) {
                f2 = f7 * this.f14411i;
            } else {
                f2 = 0.0f;
            }
        } else {
            f2 = 0.0f;
        }
        if (z5 || this.f14410h != f2) {
            this.f14410h = f2;
            p.a(surface, f2);
        }
    }
}
