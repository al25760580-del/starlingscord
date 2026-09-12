package e5;

import android.app.Activity;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import bd.w;
import com.discord.R;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.upstream.DataSource;
import e4.l;
import ei.c0;
import ei.e0;
import ei.r0;
import ei.w0;
import gc.j0;
import gc.l0;
import gc.m0;
import gc.n0;
import gc.o0;
import gc.p0;
import gc.q0;
import gc.s0;
import gc.t0;
import hd.n;
import he.s;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import mc.o;
import mc.q;
import md.b0;
import md.i0;
import md.x0;
import md.y0;
import org.webrtc.MediaStreamTrack;
import pc.r;
import sd.p;

/* JADX INFO: loaded from: classes.dex */
public final class i extends FrameLayout implements LifecycleEventListener, com.google.android.exoplayer2.e, he.f, g5.b, AudioManager.OnAudioFocusChangeListener, o {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final CookieManager f8054z0;
    public DataSource.Factory E;
    public SimpleExoPlayer F;
    public DefaultTrackSelector G;
    public boolean H;
    public int I;
    public long J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Handler f8055b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Uri f8056c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f8057d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f8058d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f8059e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f8060e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public String f8061f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Dynamic f8062g0;
    public String h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f8063i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Dynamic f8064i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f8065j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Dynamic f8066k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ReadableArray f8067l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f8068m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f8069n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f8070o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f8071p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Map f8072q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f8073r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f8074s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public UUID f8075t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f8076u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PlayerControlView f8077v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final ThemedReactContext f8078v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f8079w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final AudioManager f8080w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g f8081x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final g5.a f8082x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f8083y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final bd.d f8084y0;

    static {
        CookieManager cookieManager = new CookieManager();
        f8054z0 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public i(ThemedReactContext themedReactContext, e eVar) {
        super(themedReactContext);
        this.O = false;
        this.P = false;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.S = 3;
        this.T = 0;
        this.U = 50000;
        this.V = 50000;
        this.W = 2500;
        this.a0 = 5000;
        this.f8069n0 = true;
        this.f8070o0 = 250.0f;
        this.f8071p0 = false;
        this.f8074s0 = false;
        this.f8075t0 = null;
        this.f8084y0 = new bd.d(this);
        this.f8078v0 = themedReactContext;
        this.f8057d = new j(themedReactContext);
        this.f8059e = eVar;
        this.f8063i = (s) ((fj.c) eVar).f9267e;
        this.I = -1;
        this.J = -9223372036854775807L;
        this.E = c(true);
        CookieHandler cookieHandler = CookieHandler.getDefault();
        CookieManager cookieManager = f8054z0;
        if (cookieHandler != cookieManager) {
            CookieHandler.setDefault(cookieManager);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        d dVar = new d(getContext());
        this.f8083y = dVar;
        dVar.setLayoutParams(layoutParams);
        addView(this.f8083y, 0, layoutParams);
        this.f8055b0 = new Handler();
        this.f8080w0 = (AudioManager) themedReactContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        themedReactContext.addLifecycleEventListener(this);
        this.f8082x0 = new g5.a(themedReactContext);
    }

    public static int g(y0 y0Var) {
        if (y0Var.f15737d == 0) {
            return -1;
        }
        String language = Locale.getDefault().getLanguage();
        String iSO3Language = Locale.getDefault().getISO3Language();
        for (int i7 = 0; i7 < y0Var.f15737d; i7++) {
            String str = y0Var.a(i7).f15730v[0].f5528i;
            if (str != null && (str.equals(language) || str.equals(iSO3Language))) {
                return i7;
            }
        }
        return 0;
    }

    @Override // he.f
    public final void a(int i7, long j, long j5) {
        if (this.f8074s0) {
            SimpleExoPlayer simpleExoPlayer = this.F;
            if (simpleExoPlayer == null) {
                this.f8057d.a(j5, 0, 0, "-1");
                return;
            }
            simpleExoPlayer.c0();
            com.google.android.exoplayer2.c cVar = simpleExoPlayer.f5586b;
            cVar.x0();
            Format format = cVar.N;
            this.f8057d.a(j5, format != null ? format.O : 0, format != null ? format.N : 0, format != null ? format.f5524d : "-1");
        }
    }

    @Override // mc.o
    public final void b(int i7, md.s sVar) {
        Log.d("DRM Info", "onDrmKeysLoaded");
    }

    public final DataSource.Factory c(boolean z5) {
        return b.a(this.f8078v0, z5 ? this.f8063i : null, this.f8072q0, this.f8073r0);
    }

    public final md.a d(Uri uri, String str) {
        p0 p0Var;
        mc.s sVarA;
        e eVar = this.f8059e;
        j0 j0Var = new j0();
        m0 m0Var = new m0();
        m0Var.f9775c = w0.f8376y;
        c0 c0Var = e0.f8303e;
        r0 r0Var = r0.f8352w;
        m0Var.f9779g = r0Var;
        List list = Collections.EMPTY_LIST;
        q0 q0Var = q0.f9821i;
        je.b.k(m0Var.f9774b == null || m0Var.f9773a != null);
        if (uri != null) {
            p0Var = new p0(uri, null, m0Var.f9773a != null ? new n0(m0Var) : null, null, list, null, r0Var);
        } else {
            p0Var = null;
        }
        MediaItem mediaItem = new MediaItem("", new l0(j0Var), p0Var, new o0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), MediaMetadata.f5540f0, q0Var);
        p0 p0Var2 = p0Var;
        String strL = !TextUtils.isEmpty(str) ? a3.e.l(".", str) : uri.getLastPathSegment();
        int i7 = je.e0.f13788a;
        int iD = je.e0.D(Uri.parse("file:///" + strL));
        int i10 = 12;
        if (iD == 0) {
            pd.i iVar = new pd.i(this.E);
            DataSource.Factory factoryC = c(false);
            DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(iVar, factoryC);
            int i11 = this.S;
            ((fj.c) eVar).getClass();
            dashMediaSource$Factory.f5708d = new o9.d(i11, 3);
            p0Var2.getClass();
            qd.e eVar2 = new qd.e();
            List list2 = p0Var2.f9815w;
            return new pd.g(mediaItem, factoryC, !list2.isEmpty() ? new l(i10, eVar2, list2) : eVar2, iVar, dashMediaSource$Factory.f5707c, dashMediaSource$Factory.f5706b.b(mediaItem), dashMediaSource$Factory.f5708d, dashMediaSource$Factory.f5709e, dashMediaSource$Factory.f5710f);
        }
        if (iD == 1) {
            td.a aVar = new td.a(this.E);
            DataSource.Factory factoryC2 = c(false);
            SsMediaSource$Factory ssMediaSource$Factory = new SsMediaSource$Factory(aVar, factoryC2);
            int i12 = this.S;
            ((fj.c) eVar).getClass();
            ssMediaSource$Factory.f5723d = new o9.d(i12, 3);
            p0Var2.getClass();
            r rVar = new r(9);
            List list3 = p0Var2.f9815w;
            return new td.e(mediaItem, factoryC2, !list3.isEmpty() ? new l(i10, rVar, list3) : rVar, aVar, ssMediaSource$Factory.f5721b, ssMediaSource$Factory.f5722c.b(mediaItem), ssMediaSource$Factory.f5723d, ssMediaSource$Factory.f5724e);
        }
        if (iD == 2) {
            HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(this.E);
            int i13 = this.S;
            ((fj.c) eVar).getClass();
            hlsMediaSource$Factory.f5717g = new o9.d(i13, 3);
            p0Var2.getClass();
            p eVar3 = hlsMediaSource$Factory.f5713c;
            List list4 = p0Var2.f9815w;
            if (!list4.isEmpty()) {
                eVar3 = new e4.e(20, eVar3, list4);
            }
            rd.c cVar = hlsMediaSource$Factory.f5711a;
            rd.d dVar = hlsMediaSource$Factory.f5712b;
            i8.c cVar2 = hlsMediaSource$Factory.f5715e;
            mc.s sVarB = hlsMediaSource$Factory.f5716f.b(mediaItem);
            o9.d dVar2 = hlsMediaSource$Factory.f5717g;
            q qVar = hlsMediaSource$Factory.f5714d;
            rd.c cVar3 = hlsMediaSource$Factory.f5711a;
            qVar.getClass();
            return new rd.o(mediaItem, cVar, dVar, cVar2, sVarB, dVar2, new sd.c(cVar3, dVar2, eVar3), hlsMediaSource$Factory.j, hlsMediaSource$Factory.f5718h, hlsMediaSource$Factory.f5719i);
        }
        if (iD != 4) {
            throw new IllegalStateException(kk.b.h(iD, "Unsupported type: "));
        }
        DataSource.Factory factory = this.E;
        gc.o oVar = new gc.o(29, new pc.i());
        Object obj = new Object();
        int i14 = this.S;
        ((fj.c) eVar).getClass();
        o9.d dVar3 = new o9.d(i14, 3);
        p0Var2.getClass();
        mediaItem.f5534e.getClass();
        n0 n0Var = mediaItem.f5534e.f9813i;
        if (n0Var == null || je.e0.f13788a < 18) {
            sVarA = mc.s.f15573a;
        } else {
            synchronized (obj) {
                try {
                    sVarA = n0Var.equals(null) ? null : mc.g.a(n0Var);
                    sVarA.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return new i0(mediaItem, factory, oVar, sVarA, dVar3);
    }

    @Override // g5.b
    public final void e() {
        this.f8057d.c("onVideoAudioBecomingNoisy", null);
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        if (this.f8067l0 != null) {
            for (int i7 = 0; i7 < this.f8067l0.size(); i7++) {
                ReadableMap map = this.f8067l0.getMap(i7);
                String string = map.getString("language");
                String string2 = map.hasKey(AlertFragment.ARG_TITLE) ? map.getString(AlertFragment.ARG_TITLE) : string + " " + i7;
                Uri uri = Uri.parse(map.getString("uri"));
                String string3 = map.getString("type");
                s0 s0Var = new s0(uri);
                s0Var.f9839a = string3;
                s0Var.f9843e = string;
                s0Var.f9840b = -1;
                s0Var.f9841c = -1;
                s0Var.f9844f = string2;
                t0 t0Var = new t0(s0Var);
                DataSource.Factory factory = this.E;
                factory.getClass();
                arrayList.add(new md.w0(t0Var, factory, new o9.d(-1, 3)));
            }
        }
        return arrayList;
    }

    public final int h(int i7) {
        SimpleExoPlayer simpleExoPlayer = this.F;
        if (simpleExoPlayer == null) {
            return -1;
        }
        simpleExoPlayer.c0();
        com.google.android.exoplayer2.c cVar = simpleExoPlayer.f5586b;
        cVar.x0();
        int length = cVar.f5649g.length;
        for (int i10 = 0; i10 < length; i10++) {
            SimpleExoPlayer simpleExoPlayer2 = this.F;
            simpleExoPlayer2.c0();
            com.google.android.exoplayer2.c cVar2 = simpleExoPlayer2.f5586b;
            cVar2.x0();
            if (cVar2.f5649g[i10].f9602e == i7) {
                return i10;
            }
        }
        return -1;
    }

    public final void i() {
        new Handler().postDelayed(new hi.o(this, this, 5, false), 1L);
    }

    public final void j(View view) {
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void k() {
        if (this.F != null) {
            w();
            try {
                this.F.g0();
                this.F.d0();
            } catch (Exception unused) {
            }
            this.F.m(this);
            this.G = null;
            d dVar = this.f8083y;
            if (dVar != null) {
                dVar.setPlayer(null);
            }
            this.F = null;
        }
        this.f8084y0.removeMessages(1);
        this.f8078v0.removeLifecycleEventListener(this);
        pa.s sVar = g5.b.j;
        g5.a aVar = this.f8082x0;
        aVar.f9496b = sVar;
        try {
            aVar.f9495a.unregisterReceiver(aVar);
        } catch (Exception unused2) {
        }
        CopyOnWriteArrayList<he.e> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f8063i.f10688b.f21117d;
        for (he.e eVar : copyOnWriteArrayList) {
            if (eVar.f10600b == this) {
                eVar.f10601c = true;
                copyOnWriteArrayList.remove(eVar);
            }
        }
    }

    public final boolean l() {
        return this.f8068m0 || this.O || this.f8056c0 == null || this.P || this.f8080w0.requestAudioFocus(this, 3, 1) == 1;
    }

    public final void m(boolean z5) {
        this.f8076u0 = z5;
        SimpleExoPlayer simpleExoPlayer = this.F;
        if (simpleExoPlayer == null || this.f8083y == null) {
            return;
        }
        if (!z5) {
            int iIndexOfChild = indexOfChild(this.f8077v);
            if (iIndexOfChild != -1) {
                removeViewAt(iIndexOfChild);
                return;
            }
            return;
        }
        if (simpleExoPlayer == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f8077v.setLayoutParams(layoutParams);
        int iIndexOfChild2 = indexOfChild(this.f8077v);
        if (iIndexOfChild2 != -1) {
            removeViewAt(iIndexOfChild2);
        }
        addView(this.f8077v, 1, layoutParams);
    }

    public final void n(boolean z5) {
        if (z5 == this.L) {
            return;
        }
        this.L = z5;
        Activity currentActivity = this.f8078v0.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        boolean z6 = this.L;
        j jVar = this.f8057d;
        if (!z6) {
            jVar.c("onVideoFullscreenPlayerWillDismiss", null);
            decorView.setSystemUiVisibility(0);
            jVar.c("onVideoFullscreenPlayerDidDismiss", null);
        } else {
            int i7 = je.e0.f13788a >= 19 ? 4102 : 6;
            jVar.c("onVideoFullscreenPlayerWillPresent", null);
            decorView.setSystemUiVisibility(i7);
            jVar.c("onVideoFullscreenPlayerDidPresent", null);
        }
    }

    public final void o(boolean z5) {
        boolean z6 = this.O;
        this.O = z5;
        float f2 = z5 ? 0.0f : 1.0f;
        this.R = f2;
        SimpleExoPlayer simpleExoPlayer = this.F;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.f0(f2);
        if (z6 == z5 || !this.F.g() || this.f8068m0) {
            return;
        }
        if (z5 && this.P) {
            this.f8080w0.abandonAudioFocus(this);
            this.P = false;
        } else {
            if (z5 || this.P) {
                return;
            }
            this.P = l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        j jVar = this.f8057d;
        if (i7 == -2) {
            jVar.getClass();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("hasAudioFocus", false);
            jVar.c("onAudioFocusChanged", writableMapCreateMap);
        } else if (i7 == -1) {
            this.P = false;
            jVar.getClass();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putBoolean("hasAudioFocus", false);
            jVar.c("onAudioFocusChanged", writableMapCreateMap2);
            this.f8055b0.post(new h(this, 0));
            this.f8080w0.abandonAudioFocus(this);
        } else if (i7 == 1) {
            this.P = true;
            jVar.getClass();
            WritableMap writableMapCreateMap3 = Arguments.createMap();
            writableMapCreateMap3.putBoolean("hasAudioFocus", true);
            jVar.c("onAudioFocusChanged", writableMapCreateMap3);
        }
        if (this.F != null) {
            if (i7 == -3) {
                if (this.O) {
                    return;
                }
                this.f8055b0.post(new h(this, 1));
                return;
            }
            if (i7 != 1 || this.O) {
                return;
            }
            this.f8055b0.post(new h(this, 2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        if (this.L) {
            n(false);
        }
        this.f8080w0.abandonAudioFocus(this);
        k();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        SimpleExoPlayer simpleExoPlayer;
        if (this.f8071p0) {
            return;
        }
        s(false);
        if (this.F != null) {
            try {
                w();
                this.F.g0();
                this.H = true;
            } catch (Exception unused) {
            }
        }
        d dVar = this.f8083y;
        if (dVar == null || (simpleExoPlayer = dVar.f8047x) == null) {
            return;
        }
        View view = dVar.f8042d;
        if (view instanceof TextureView) {
            simpleExoPlayer.k((TextureView) view);
        } else if (view instanceof SurfaceView) {
            simpleExoPlayer.G((SurfaceView) view);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        d dVar;
        if (this.f8071p0 || this.F == null || (dVar = this.f8083y) == null) {
            return;
        }
        dVar.a();
        if (this.F.w() == 1 && this.F != null && this.f8056c0 != null && this.H) {
            this.f8083y.f8045v.f8036d = 0.0f;
            ArrayList arrayListF = f();
            md.a aVarD = d(this.f8056c0, this.f8058d0);
            if (arrayListF.size() != 0) {
                arrayListF.add(0, aVarD);
                aVarD = new b0((md.a[]) arrayListF.toArray(new md.a[arrayListF.size()]));
            }
            int i7 = this.I;
            boolean z5 = i7 != -1;
            if (z5) {
                this.F.e(i7, this.J);
            }
            SimpleExoPlayer simpleExoPlayer = this.F;
            simpleExoPlayer.c0();
            com.google.android.exoplayer2.c cVar = simpleExoPlayer.f5586b;
            cVar.x0();
            cVar.x0();
            cVar.p0(Collections.singletonList(aVarD), !z5);
            cVar.a();
            this.H = false;
            j(this.f8083y);
        }
        s(!this.M);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.e
    public final void onMetadata(Metadata metadata) {
        j jVar = this.f8057d;
        jVar.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int i7 = 0;
        while (true) {
            cd.b[] bVarArr = metadata.f5693d;
            if (i7 >= bVarArr.length) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putArray("metadata", writableArrayCreateArray);
                jVar.c("onTimedMetadata", writableMapCreateMap);
                return;
            }
            cd.b bVar = bVarArr[i7];
            if (bVar instanceof hd.j) {
                hd.j jVar2 = (hd.j) bVar;
                String str = jVar2 instanceof n ? ((n) jVar2).f10582i : "";
                String str2 = jVar2.f10570d;
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("identifier", str2);
                writableMapCreateMap2.putString("value", str);
                writableArrayCreateArray.pushMap(writableMapCreateMap2);
            } else if (bVar instanceof ed.a) {
                ed.a aVar = (ed.a) bVar;
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putString("identifier", aVar.f8131d);
                writableMapCreateMap3.putString("value", aVar.f8132e);
                writableArrayCreateArray.pushMap(writableMapCreateMap3);
            }
            i7++;
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        float f2 = playbackParameters.f5574d;
        j jVar = this.f8057d;
        jVar.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("playbackRate", f2);
        jVar.c("onPlaybackRateChange", writableMapCreateMap);
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPlayerError(PlaybackException playbackException) {
        boolean z5 = playbackException instanceof com.google.android.exoplayer2.b;
        j jVar = this.f8057d;
        if (!z5) {
            Log.e("PlaybackException with unrecognized class type", playbackException.toString());
            jVar.b("PlaybackException with unrecognized class type", playbackException);
            return;
        }
        com.google.android.exoplayer2.b bVar = (com.google.android.exoplayer2.b) playbackException;
        int i7 = bVar.f5634i;
        String strH = kk.b.h(i7, "PlaybackException type : ");
        if (i7 == 1) {
            je.b.k(i7 == 1);
            Throwable cause = bVar.getCause();
            cause.getClass();
            Exception exc = (Exception) cause;
            if (exc.getMessage() != null && exc.getMessage().contains("MediaCodecVideoRenderer")) {
                k();
                i();
                return;
            } else if (exc instanceof bd.q) {
                bd.q qVar = (bd.q) exc;
                String str = qVar.f3180d;
                bd.o oVar = qVar.f3182i;
                if (oVar.f3172a != null) {
                    strH = getResources().getString(R.string.error_instantiating_decoder, oVar.f3172a);
                } else if (qVar.getCause() instanceof w) {
                    strH = getResources().getString(R.string.error_querying_decoders);
                } else {
                    strH = qVar.f3181e ? getResources().getString(R.string.error_no_secure_decoder, str) : getResources().getString(R.string.error_no_decoder, str);
                }
            }
        } else if (i7 == 0) {
            strH = getResources().getString(R.string.unrecognized_media_format);
        }
        jVar.b(strH, playbackException);
        this.H = true;
        Log.e("ExoPlayer Exception", bVar.toString());
        if (i7 == 0) {
            je.b.k(i7 == 0);
            Throwable cause2 = bVar.getCause();
            cause2.getClass();
            for (Throwable cause3 = (IOException) cause2; cause3 != null; cause3 = cause3.getCause()) {
                if ((cause3 instanceof md.b) || (cause3 instanceof he.b0)) {
                    this.I = -1;
                    this.J = -9223372036854775807L;
                    i();
                    return;
                }
            }
        }
        w();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.e
    public final void onPlayerStateChanged(boolean z5, int i7) {
        String strJ;
        String strJ2;
        String str = "onStateChanged: playWhenReady=" + z5 + ", playbackState=";
        bd.d dVar = this.f8084y0;
        j jVar = this.f8057d;
        if (i7 != 1) {
            if (i7 == 2) {
                strJ = kk.b.j(str, "buffering");
                if (!this.N) {
                    this.N = true;
                    jVar.getClass();
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("isBuffering", true);
                    jVar.c("onVideoBuffer", writableMapCreateMap);
                }
                dVar.removeMessages(1);
                setKeepScreenOn(this.f8069n0);
            } else if (i7 == 3) {
                String str2 = str + "ready";
                jVar.c("onReadyForDisplay", null);
                if (this.N) {
                    this.N = false;
                    jVar.getClass();
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putBoolean("isBuffering", false);
                    jVar.c("onVideoBuffer", writableMapCreateMap2);
                }
                dVar.sendEmptyMessage(1);
                if (this.K) {
                    this.K = false;
                    String str3 = this.f8061f0;
                    Dynamic dynamic = this.f8062g0;
                    this.f8061f0 = str3;
                    this.f8062g0 = dynamic;
                    v(1, str3, dynamic);
                    String str4 = this.h0;
                    Dynamic dynamic2 = this.f8064i0;
                    this.h0 = str4;
                    this.f8064i0 = dynamic2;
                    v(2, str4, dynamic2);
                    String str5 = this.f8065j0;
                    Dynamic dynamic3 = this.f8066k0;
                    this.f8065j0 = str5;
                    this.f8066k0 = dynamic3;
                    v(3, str5, dynamic3);
                    SimpleExoPlayer simpleExoPlayer = this.F;
                    simpleExoPlayer.c0();
                    com.google.android.exoplayer2.c cVar = simpleExoPlayer.f5586b;
                    cVar.x0();
                    Format format = cVar.N;
                    int i10 = format != null ? format.N : 0;
                    int i11 = format != null ? format.O : 0;
                    String str6 = format != null ? format.f5524d : "-1";
                    double duration = this.F.getDuration();
                    double dS = this.F.S();
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo = this.G.f9116c;
                    int iH = h(1);
                    if (mappingTrackSelector$MappedTrackInfo != null && iH != -1) {
                        y0 y0Var = mappingTrackSelector$MappedTrackInfo.f5736c[iH];
                        int i12 = 0;
                        while (i12 < y0Var.f15737d) {
                            Format format2 = y0Var.a(i12).f15730v[0];
                            y0 y0Var2 = y0Var;
                            WritableMap writableMapCreateMap3 = Arguments.createMap();
                            writableMapCreateMap3.putInt("index", i12);
                            int i13 = i12;
                            String str7 = format2.f5524d;
                            if (str7 == null) {
                                str7 = "";
                            }
                            writableMapCreateMap3.putString(AlertFragment.ARG_TITLE, str7);
                            writableMapCreateMap3.putString("type", format2.I);
                            String str8 = format2.f5528i;
                            if (str8 == null) {
                                str8 = "";
                            }
                            writableMapCreateMap3.putString("language", str8);
                            int i14 = format2.E;
                            writableMapCreateMap3.putString("bitrate", i14 == -1 ? "" : String.format(Locale.US, "%.2fMbps", Float.valueOf(i14 / 1000000.0f)));
                            writableArrayCreateArray.pushMap(writableMapCreateMap3);
                            i12 = i13 + 1;
                            y0Var = y0Var2;
                            dS = dS;
                        }
                    }
                    double d6 = dS;
                    WritableArray writableArrayCreateArray2 = Arguments.createArray();
                    MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo2 = this.G.f9116c;
                    int iH2 = h(3);
                    if (mappingTrackSelector$MappedTrackInfo2 != null && iH2 != -1) {
                        y0 y0Var3 = mappingTrackSelector$MappedTrackInfo2.f5736c[iH2];
                        int i15 = 0;
                        while (i15 < y0Var3.f15737d) {
                            Format format3 = y0Var3.a(i15).f15730v[0];
                            WritableMap writableMapCreateMap4 = Arguments.createMap();
                            writableMapCreateMap4.putInt("index", i15);
                            y0 y0Var4 = y0Var3;
                            String str9 = format3.f5524d;
                            if (str9 == null) {
                                str9 = "";
                            }
                            writableMapCreateMap4.putString(AlertFragment.ARG_TITLE, str9);
                            writableMapCreateMap4.putString("type", format3.I);
                            String str10 = format3.f5528i;
                            if (str10 == null) {
                                str10 = "";
                            }
                            writableMapCreateMap4.putString("language", str10);
                            writableArrayCreateArray2.pushMap(writableMapCreateMap4);
                            i15++;
                            y0Var3 = y0Var4;
                        }
                    }
                    WritableArray writableArrayCreateArray3 = Arguments.createArray();
                    MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo3 = this.G.f9116c;
                    int iH3 = h(2);
                    if (mappingTrackSelector$MappedTrackInfo3 != null && iH3 != -1) {
                        y0 y0Var5 = mappingTrackSelector$MappedTrackInfo3.f5736c[iH3];
                        int i16 = 0;
                        while (i16 < y0Var5.f15737d) {
                            x0 x0VarA = y0Var5.a(i16);
                            y0 y0Var6 = y0Var5;
                            int i17 = 0;
                            while (i17 < x0VarA.f15727d) {
                                Format format4 = x0VarA.f15730v[i17];
                                int i18 = i16;
                                WritableMap writableMapCreateMap5 = Arguments.createMap();
                                x0 x0Var = x0VarA;
                                int i19 = format4.N;
                                int i20 = i17;
                                if (i19 == -1) {
                                    i19 = 0;
                                }
                                writableMapCreateMap5.putInt("width", i19);
                                int i21 = format4.O;
                                if (i21 == -1) {
                                    i21 = 0;
                                }
                                writableMapCreateMap5.putInt("height", i21);
                                int i22 = format4.E;
                                if (i22 == -1) {
                                    i22 = 0;
                                }
                                writableMapCreateMap5.putInt("bitrate", i22);
                                String str11 = format4.F;
                                if (str11 == null) {
                                    str11 = "";
                                }
                                writableMapCreateMap5.putString("codecs", str11);
                                String strValueOf = format4.f5524d;
                                if (strValueOf == null) {
                                    strValueOf = String.valueOf(i20);
                                }
                                writableMapCreateMap5.putString("trackId", strValueOf);
                                writableArrayCreateArray3.pushMap(writableMapCreateMap5);
                                i17 = i20 + 1;
                                i16 = i18;
                                x0VarA = x0Var;
                            }
                            i16++;
                            y0Var5 = y0Var6;
                        }
                    }
                    WritableMap writableMapCreateMap6 = Arguments.createMap();
                    writableMapCreateMap6.putDouble("duration", duration / 1000.0d);
                    writableMapCreateMap6.putDouble("currentTime", d6 / 1000.0d);
                    WritableMap writableMapCreateMap7 = Arguments.createMap();
                    writableMapCreateMap7.putInt("width", i10);
                    writableMapCreateMap7.putInt("height", i11);
                    if (i10 > i11) {
                        writableMapCreateMap7.putString("orientation", "landscape");
                    } else {
                        writableMapCreateMap7.putString("orientation", "portrait");
                    }
                    writableMapCreateMap6.putMap("naturalSize", writableMapCreateMap7);
                    writableMapCreateMap6.putString("trackId", str6);
                    writableMapCreateMap6.putArray("videoTracks", writableArrayCreateArray3);
                    writableMapCreateMap6.putArray("audioTracks", writableArrayCreateArray);
                    writableMapCreateMap6.putArray("textTracks", writableArrayCreateArray2);
                    writableMapCreateMap6.putBoolean("canPlayFastForward", true);
                    writableMapCreateMap6.putBoolean("canPlaySlowForward", true);
                    writableMapCreateMap6.putBoolean("canPlaySlowReverse", true);
                    writableMapCreateMap6.putBoolean("canPlayReverse", true);
                    writableMapCreateMap6.putBoolean("canPlayFastForward", true);
                    writableMapCreateMap6.putBoolean("canStepBackward", true);
                    writableMapCreateMap6.putBoolean("canStepForward", true);
                    jVar.c("onVideoLoad", writableMapCreateMap6);
                }
                PlayerControlView playerControlView = this.f8077v;
                if (playerControlView != null) {
                    playerControlView.e();
                }
                setKeepScreenOn(this.f8069n0);
                strJ2 = str2;
            } else if (i7 != 4) {
                strJ2 = kk.b.j(str, "unknown");
            } else {
                strJ2 = str + "ended";
                jVar.c("onVideoEnd", null);
                if (this.L) {
                    n(false);
                }
                this.f8080w0.abandonAudioFocus(this);
                setKeepScreenOn(false);
            }
            Log.d("ReactExoplayerView", strJ2);
        }
        strJ = str + "idle";
        jVar.c("onVideoIdle", null);
        dVar.removeMessages(1);
        if (!z5) {
            setKeepScreenOn(false);
        }
        strJ2 = strJ;
        Log.d("ReactExoplayerView", strJ2);
    }

    @Override // com.google.android.exoplayer2.e
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i7) {
        j jVar = this.f8057d;
        if (i7 == 1) {
            long jS = this.F.S();
            long j = positionInfo2.f5584x % 1000;
            jVar.getClass();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("currentTime", jS / 1000.0d);
            writableMapCreateMap.putDouble("seekTime", j / 1000.0d);
            jVar.c("onVideoSeek", writableMapCreateMap);
        }
        if (this.H) {
            w();
        }
        if (i7 == 0 && this.F.I() == 1) {
            jVar.c("onVideoEnd", null);
        }
    }

    @Override // mc.o
    public final void p(int i7, md.s sVar, Exception exc) {
        Log.d("DRM Info", "onDrmSessionManagerError");
        this.f8057d.b("onDrmSessionManagerError", exc);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    public final void q(boolean z5) {
        this.M = z5;
        SimpleExoPlayer simpleExoPlayer = this.F;
        if (simpleExoPlayer != null) {
            if (z5) {
                if (simpleExoPlayer != null && simpleExoPlayer.g()) {
                    s(false);
                }
                setKeepScreenOn(false);
                return;
            }
            int iW = simpleExoPlayer.w();
            if (iW == 1) {
                i();
            } else if (iW == 2 || iW == 3) {
                if (!this.F.g()) {
                    s(true);
                }
            } else if (iW == 4) {
                i();
            }
            if (this.f8068m0) {
                return;
            }
            setKeepScreenOn(this.f8069n0);
        }
    }

    public final void s(boolean z5) {
        SimpleExoPlayer simpleExoPlayer = this.F;
        if (simpleExoPlayer == null) {
            return;
        }
        if (!z5) {
            simpleExoPlayer.r(false);
            return;
        }
        boolean zL = l();
        this.P = zL;
        if (zL) {
            this.F.r(true);
        }
    }

    @Override // android.view.View
    public final void setId(int i7) {
        super.setId(i7);
        this.f8057d.f8087b = i7;
    }

    @Override // mc.o
    public final void t(int i7, md.s sVar) {
        Log.d("DRM Info", "onDrmKeysRestored");
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0106 A[EDGE_INSN: B:70:0x0106->B:71:0x0107 BREAK  A[LOOP:0: B:21:0x0053->B:28:0x006f]] */
    public final void v(int i7, String str, Dynamic dynamic) {
        int iH;
        MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo;
        int iG;
        if (this.F == null || (iH = h(i7)) == -1 || (mappingTrackSelector$MappedTrackInfo = this.G.f9116c) == null) {
            return;
        }
        y0 y0Var = mappingTrackSelector$MappedTrackInfo.f5736c[iH];
        int[] iArr = {0};
        if (TextUtils.isEmpty(str)) {
            str = "default";
        }
        com.google.android.exoplayer2.trackselection.a aVarC = this.G.c();
        aVarC.getClass();
        fe.g gVar = new fe.g(aVarC);
        gVar.d(iH, true);
        com.google.android.exoplayer2.trackselection.a aVar = new com.google.android.exoplayer2.trackselection.a(gVar);
        if (str.equals("disabled")) {
            this.G.h(aVar);
            return;
        }
        if (str.equals("language")) {
            iG = 0;
            while (true) {
                if (iG >= y0Var.f15737d) {
                    iG = -1;
                    break;
                }
                String str2 = y0Var.a(iG).f15730v[0].f5528i;
                if (str2 != null && str2.equals(dynamic.asString())) {
                    break;
                } else {
                    iG++;
                }
            }
        } else if (str.equals(AlertFragment.ARG_TITLE)) {
            iG = 0;
            while (true) {
                if (iG >= y0Var.f15737d) {
                    iG = -1;
                    break;
                }
                String str3 = y0Var.a(iG).f15730v[0].f5524d;
                if (str3 != null && str3.equals(dynamic.asString())) {
                    break;
                } else {
                    iG++;
                }
            }
        } else if (str.equals("index")) {
            if (dynamic.asInt() >= y0Var.f15737d) {
                iG = -1;
                break;
            }
            iG = dynamic.asInt();
        } else if (str.equals("resolution")) {
            int iAsInt = dynamic.asInt();
            int i10 = -1;
            for (int i11 = 0; i11 < y0Var.f15737d; i11++) {
                x0 x0VarA = y0Var.a(i11);
                for (int i12 = 0; i12 < x0VarA.f15727d; i12++) {
                    if (x0VarA.f15730v[i12].O == iAsInt) {
                        iArr[0] = i12;
                        i10 = i11;
                        break;
                    }
                }
            }
            iG = i10;
        } else if (iH == 3 && je.e0.f13788a > 18) {
            CaptioningManager captioningManager = (CaptioningManager) this.f8078v0.getSystemService("captioning");
            if (captioningManager == null || !captioningManager.isEnabled()) {
                iG = -1;
                break;
            }
            iG = g(y0Var);
        } else {
            if (iH != 1) {
                iG = -1;
                break;
            }
            iG = g(y0Var);
        }
        if (iG == -1 && i7 == 2 && y0Var.f15737d != 0) {
            int i13 = y0Var.a(0).f15727d;
            iArr = new int[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                iArr[i14] = i14;
            }
            iG = 0;
        }
        if (iG == -1) {
            this.G.h(aVar);
            return;
        }
        com.google.android.exoplayer2.trackselection.a aVarC2 = this.G.c();
        aVarC2.getClass();
        fe.g gVar2 = new fe.g(aVarC2);
        gVar2.d(iH, false);
        gVar2.e(iH, y0Var, new fe.h(iG, 0, iArr));
        this.G.h(new com.google.android.exoplayer2.trackselection.a(gVar2));
    }

    public final void w() {
        this.I = this.F.D();
        this.J = this.F.Z() ? Math.max(0L, this.F.S()) : -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.e
    public final void onLoadingChanged(boolean z5) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onRepeatModeChanged(int i7) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onShuffleModeEnabledChanged(boolean z5) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onTracksChanged(Tracks tracks) {
    }

    @Override // com.google.android.exoplayer2.e
    public final void onTimelineChanged(Timeline timeline, int i7) {
    }
}
