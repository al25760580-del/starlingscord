package com.budiyev.android.codescanner;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.discord.qr.scanner.QRScanner;
import h5.d;
import h5.e;
import h5.f;
import h5.g;
import h5.n;
import h5.o;
import h5.q;
import h5.s;
import ij.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import u4.b;
import u4.c;

/* JADX INFO: loaded from: classes.dex */
public final class CodeScanner {
    public static final List H;
    public static final List I;
    public static final List J;
    public static final List K;
    public static final int L;
    public static final int M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3892b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CodeScannerView f3894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SurfaceHolder f3895e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3891a = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile List f3902n = K;
    public volatile int F = L;
    public volatile int G = M;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile QRScanner f3903o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile QRScanner f3904p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile o f3905q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f3906r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f3907s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f3908t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f3909u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f3910v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile int f3911w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3912x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3913y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3914z = false;
    public boolean A = false;
    public boolean B = false;
    public int C = 0;
    public int D = 0;
    public int E = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f3893c = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f3896f = new g(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f3897g = new d(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f3898h = new e(this, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f3899i = new e(this, 0);
    public final f j = new f(this, 0);
    public final f k = new f(this, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f3900l = new b(11, this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h5.b f3901m = new h5.b(this);

    static {
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(a.values()));
        H = listUnmodifiableList;
        I = Collections.unmodifiableList(Arrays.asList(a.f11787e, a.f11788i, a.f11789v, a.f11790w, a.f11792y, a.E, a.F, a.J, a.K, a.L, a.M, a.N));
        J = Collections.unmodifiableList(Arrays.asList(a.f11786d, a.f11791x, a.G, a.H, a.I));
        K = listUnmodifiableList;
        L = 1;
        M = 1;
    }

    public CodeScanner(Context context, CodeScannerView codeScannerView) {
        this.f3892b = context;
        this.f3894d = codeScannerView;
        this.f3895e = codeScannerView.getPreviewView().getHolder();
        codeScannerView.setCodeScanner(this);
        codeScannerView.setSizeListener(new c(this));
    }

    public final void a(int i7, int i10) {
        this.D = i7;
        this.E = i10;
        if (i7 <= 0 || i10 <= 0) {
            this.B = true;
            return;
        }
        this.f3906r = true;
        this.B = false;
        h5.c cVar = new h5.c(this, i7, i10);
        cVar.setUncaughtExceptionHandler(this.f3901m);
        cVar.start();
    }

    public final void b() {
        if (this.f3907s) {
            if (this.f3913y && this.f3907s && this.f3913y) {
                this.f3895e.removeCallback(this.f3896f);
                j(false);
            }
            c();
        }
    }

    public final void c() {
        this.f3907s = false;
        this.f3906r = false;
        this.f3908t = false;
        this.f3913y = false;
        this.f3914z = false;
        o oVar = this.f3905q;
        if (oVar != null) {
            this.f3905q = null;
            oVar.f10365a.release();
            n nVar = oVar.f10366b;
            nVar.f10358b.interrupt();
            nVar.f10363g = null;
        }
    }

    public final void d() {
        if (this.A) {
            return;
        }
        this.A = true;
        this.f3893c.postDelayed(this.j, 2000L);
    }

    public final void e(boolean z5) {
        synchronized (this.f3891a) {
            try {
                boolean z6 = this.f3909u != z5;
                this.f3909u = z5;
                this.f3894d.setAutoFocusEnabled(z5);
                o oVar = this.f3905q;
                if (this.f3907s && this.f3913y && z6 && oVar != null && oVar.f10372h) {
                    f(z5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(boolean z5) {
        s frameRect;
        try {
            o oVar = this.f3905q;
            if (oVar != null) {
                Camera camera = oVar.f10365a;
                camera.cancelAutoFocus();
                this.f3912x = false;
                Camera.Parameters parameters = camera.getParameters();
                int i7 = this.G;
                if (z5) {
                    android.support.v4.media.session.b.u(parameters, i7);
                } else {
                    List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                    if (supportedFocusModes != null && !supportedFocusModes.isEmpty()) {
                        String focusMode = parameters.getFocusMode();
                        if (supportedFocusModes.contains("fixed")) {
                            if (!"fixed".equals(focusMode)) {
                                parameters.setFocusMode("fixed");
                            }
                        } else if (supportedFocusModes.contains("auto") && !"auto".equals(focusMode)) {
                            parameters.setFocusMode("auto");
                        }
                    }
                }
                if (z5 && (frameRect = this.f3894d.getFrameRect()) != null) {
                    q qVar = oVar.f10367c;
                    q qVar2 = oVar.f10368d;
                    q qVar3 = oVar.f10369e;
                    int i10 = qVar.f10374a;
                    int i11 = qVar.f10375b;
                    int i12 = oVar.f10370f;
                    boolean z6 = i12 == 90 || i12 == 270;
                    int i13 = z6 ? i11 : i10;
                    if (!z6) {
                        i10 = i11;
                    }
                    android.support.v4.media.session.b.e(parameters, android.support.v4.media.session.b.l(i13, i10, frameRect, qVar2, qVar3), i13, i10, i12);
                }
                camera.setParameters(parameters);
                if (z5) {
                    this.C = 0;
                    this.f3914z = false;
                    if (i7 == 1) {
                        d();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void g(boolean z5) {
        Camera camera;
        Camera.Parameters parameters;
        try {
            o oVar = this.f3905q;
            if (oVar != null && (parameters = (camera = oVar.f10365a).getParameters()) != null) {
                if (z5) {
                    android.support.v4.media.session.b.v(parameters, "torch");
                } else {
                    android.support.v4.media.session.b.v(parameters, "off");
                }
                camera.setParameters(parameters);
            }
        } catch (Exception unused) {
        }
    }

    public final void h() {
        synchronized (this.f3891a) {
            try {
                if (!this.f3907s && !this.f3906r) {
                    CodeScannerView codeScannerView = this.f3894d;
                    a(codeScannerView.getWidth(), codeScannerView.getHeight());
                } else {
                    if (this.f3913y) {
                        return;
                    }
                    this.f3895e.addCallback(this.f3896f);
                    i(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(boolean z5) {
        try {
            o oVar = this.f3905q;
            if (oVar != null) {
                Camera camera = oVar.f10365a;
                camera.setPreviewCallback(this.f3897g);
                camera.setPreviewDisplay(this.f3895e);
                if (!z5 && oVar.f10373i && this.f3910v) {
                    g(true);
                }
                camera.startPreview();
                this.f3908t = false;
                this.f3913y = true;
                this.f3914z = false;
                this.C = 0;
                if (oVar.f10372h && this.f3909u) {
                    s frameRect = this.f3894d.getFrameRect();
                    if (frameRect != null) {
                        Camera.Parameters parameters = camera.getParameters();
                        q qVar = oVar.f10367c;
                        q qVar2 = oVar.f10368d;
                        q qVar3 = oVar.f10369e;
                        int i7 = qVar.f10374a;
                        int i10 = qVar.f10375b;
                        int i11 = oVar.f10370f;
                        boolean z6 = i11 == 90 || i11 == 270;
                        int i12 = z6 ? i10 : i7;
                        if (!z6) {
                            i7 = i10;
                        }
                        android.support.v4.media.session.b.e(parameters, android.support.v4.media.session.b.l(i12, i7, frameRect, qVar2, qVar3), i12, i7, i11);
                        camera.setParameters(parameters);
                    }
                    if (this.G == 1) {
                        d();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void j(boolean z5) {
        try {
            o oVar = this.f3905q;
            if (oVar != null) {
                Camera camera = oVar.f10365a;
                camera.cancelAutoFocus();
                Camera.Parameters parameters = camera.getParameters();
                if (!z5 && oVar.f10373i && this.f3910v) {
                    android.support.v4.media.session.b.v(parameters, "off");
                }
                camera.setParameters(parameters);
                camera.setPreviewCallback(null);
                camera.stopPreview();
            }
        } catch (Exception unused) {
        }
        this.f3908t = false;
        this.f3913y = false;
        this.f3914z = false;
        this.C = 0;
    }
}
