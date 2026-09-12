package fe;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import je.e0;
import md.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends t {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final SparseArray O;
    public final SparseBooleanArray P;

    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    public g(Context context) {
        Point point;
        Point point2;
        DisplayManager displayManager;
        CaptioningManager captioningManager;
        int i7 = e0.f13788a;
        if (i7 >= 19 && ((i7 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f9138t = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f9137s = ei.e0.r(i7 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Display display = (i7 < 17 || (displayManager = (DisplayManager) context.getSystemService(ViewProps.DISPLAY)) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && e0.H(context)) {
            String strA = i7 < 28 ? e0.A("sys.display-size") : e0.A("vendor.display-size");
            if (!TextUtils.isEmpty(strA)) {
                try {
                    String[] strArrSplit = strA.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i10 = Integer.parseInt(strArrSplit[0]);
                        int i11 = Integer.parseInt(strArrSplit[1]);
                        if (i10 > 0 && i11 > 0) {
                            point2 = new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                je.b.r("Util", "Invalid display size: " + strA);
            }
            if ("Sony".equals(e0.f13790c) && e0.f13791d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
            } else {
                point = new Point();
                if (i7 >= 23) {
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                } else if (i7 >= 17) {
                    display.getRealSize(point);
                } else {
                    display.getSize(point);
                }
            }
            point2 = point;
        } else {
            point = new Point();
            if (i7 >= 23) {
                Display.Mode mode2 = display.getMode();
                point.x = mode2.getPhysicalWidth();
                point.y = mode2.getPhysicalHeight();
            } else if (i7 >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
            point2 = point;
        }
        b(point2.x, point2.y);
        this.O = new SparseArray();
        this.P = new SparseBooleanArray();
        c();
    }

    @Override // fe.t
    public final t b(int i7, int i10) {
        super.b(i7, i10);
        return this;
    }

    public final void c() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
        this.N = false;
    }

    public final void d(int i7, boolean z5) {
        SparseBooleanArray sparseBooleanArray = this.P;
        if (sparseBooleanArray.get(i7) == z5) {
            return;
        }
        if (z5) {
            sparseBooleanArray.put(i7, true);
        } else {
            sparseBooleanArray.delete(i7);
        }
    }

    public final void e(int i7, y0 y0Var, h hVar) {
        SparseArray sparseArray = this.O;
        Map map = (Map) sparseArray.get(i7);
        if (map == null) {
            map = new HashMap();
            sparseArray.put(i7, map);
        }
        if (map.containsKey(y0Var) && e0.a(map.get(y0Var), hVar)) {
            return;
        }
        map.put(y0Var, hVar);
    }

    public g(com.google.android.exoplayer2.trackselection.a aVar) {
        a(aVar);
        this.A = aVar.X;
        this.B = aVar.Y;
        this.C = aVar.Z;
        this.D = aVar.a0;
        this.E = aVar.f5749b0;
        this.F = aVar.f5750c0;
        this.G = aVar.f5751d0;
        this.H = aVar.f5752e0;
        this.I = aVar.f5753f0;
        this.J = aVar.f5754g0;
        this.K = aVar.h0;
        this.L = aVar.f5755i0;
        this.M = aVar.f5756j0;
        this.N = aVar.f5757k0;
        SparseArray sparseArray = aVar.f5758l0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            sparseArray2.put(sparseArray.keyAt(i7), new HashMap((Map) sparseArray.valueAt(i7)));
        }
        this.O = sparseArray2;
        this.P = aVar.f5759m0.clone();
    }

    public g() {
        this.O = new SparseArray();
        this.P = new SparseBooleanArray();
        c();
    }
}
