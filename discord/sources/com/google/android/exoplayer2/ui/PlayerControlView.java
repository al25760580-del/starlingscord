package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.h0;
import com.discord.R;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.ui.PlayerControlView;
import gc.f0;
import gc.u1;
import gc.v1;
import ge.e;
import ge.f;
import ge.g;
import ge.h;
import ge.i;
import ge.j;
import ge.k;
import ge.r;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import je.b;
import je.e0;
import nd.a;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerControlView extends FrameLayout {
    public static final /* synthetic */ int A0 = 0;
    public final View E;
    public final ImageView F;
    public final ImageView G;
    public final View H;
    public final TextView I;
    public final TextView J;
    public final r K;
    public final StringBuilder L;
    public final Formatter M;
    public final u1 N;
    public final v1 O;
    public final e P;
    public final e Q;
    public final Drawable R;
    public final Drawable S;
    public final Drawable T;
    public final String U;
    public final String V;
    public final String W;
    public final Drawable a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Drawable f5783b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final float f5784c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f5785d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final float f5786d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f5787e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f5788e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final String f5789f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Player f5790g0;
    public boolean h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f5791i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f5792i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f5793j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f5794k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f5795l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f5796m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f5797n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f5798o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f5799p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f5800q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f5801r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f5802s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f5803t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long[] f5804u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f5805v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean[] f5806v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f5807w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final long[] f5808w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f5809x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean[] f5810x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f5811y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public long f5812y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public long f5813z0;

    static {
        f0.a("goog.exo.ui");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [ge.e] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ge.e] */
    public PlayerControlView(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.f5795l0 = 5000;
        this.f5797n0 = 0;
        this.f5796m0 = h0.DEFAULT_DRAG_ANIMATION_DURATION;
        this.f5803t0 = -9223372036854775807L;
        this.f5798o0 = true;
        this.f5799p0 = true;
        this.f5800q0 = true;
        this.f5801r0 = true;
        this.f5802s0 = false;
        int resourceId = R.layout.exo_player_control_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k.f9987c, 0, 0);
            try {
                this.f5795l0 = typedArrayObtainStyledAttributes.getInt(19, this.f5795l0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.layout.exo_player_control_view);
                this.f5797n0 = typedArrayObtainStyledAttributes.getInt(8, this.f5797n0);
                this.f5798o0 = typedArrayObtainStyledAttributes.getBoolean(17, this.f5798o0);
                this.f5799p0 = typedArrayObtainStyledAttributes.getBoolean(14, this.f5799p0);
                this.f5800q0 = typedArrayObtainStyledAttributes.getBoolean(16, this.f5800q0);
                this.f5801r0 = typedArrayObtainStyledAttributes.getBoolean(15, this.f5801r0);
                this.f5802s0 = typedArrayObtainStyledAttributes.getBoolean(18, this.f5802s0);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(20, this.f5796m0));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f5787e = new CopyOnWriteArrayList();
        this.N = new u1();
        this.O = new v1();
        StringBuilder sb2 = new StringBuilder();
        this.L = sb2;
        this.M = new Formatter(sb2, Locale.getDefault());
        this.f5804u0 = new long[0];
        this.f5806v0 = new boolean[0];
        this.f5808w0 = new long[0];
        this.f5810x0 = new boolean[0];
        g gVar = new g(this);
        this.f5785d = gVar;
        final int i7 = 0;
        this.P = new Runnable(this) { // from class: ge.e

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ PlayerControlView f9980e;

            {
                this.f9980e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i10 = i7;
                PlayerControlView playerControlView = this.f9980e;
                switch (i10) {
                    case 0:
                        int i11 = PlayerControlView.A0;
                        playerControlView.i();
                        break;
                    default:
                        playerControlView.b();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.Q = new Runnable(this) { // from class: ge.e

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ PlayerControlView f9980e;

            {
                this.f9980e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                PlayerControlView playerControlView = this.f9980e;
                switch (i11) {
                    case 0:
                        int i12 = PlayerControlView.A0;
                        playerControlView.i();
                        break;
                    default:
                        playerControlView.b();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        r rVar = (r) findViewById(R.id.exo_progress);
        View viewFindViewById = findViewById(R.id.exo_progress_placeholder);
        if (rVar != null) {
            this.K = rVar;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, attributeSet);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.K = defaultTimeBar;
        } else {
            this.K = null;
        }
        this.I = (TextView) findViewById(R.id.exo_duration);
        this.J = (TextView) findViewById(R.id.exo_position);
        r rVar2 = this.K;
        if (rVar2 != null) {
            ((DefaultTimeBar) rVar2).U.add(gVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_play);
        this.f5807w = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(gVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_pause);
        this.f5809x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(gVar);
        }
        View viewFindViewById4 = findViewById(R.id.exo_prev);
        this.f5791i = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(gVar);
        }
        View viewFindViewById5 = findViewById(R.id.exo_next);
        this.f5805v = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(gVar);
        }
        View viewFindViewById6 = findViewById(R.id.exo_rew);
        this.E = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(gVar);
        }
        View viewFindViewById7 = findViewById(R.id.exo_ffwd);
        this.f5811y = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(gVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.F = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(gVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.G = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(gVar);
        }
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.H = viewFindViewById8;
        setShowVrButton(false);
        f(viewFindViewById8, false, false);
        Resources resources = context.getResources();
        this.f5784c0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f5786d0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.R = e0.r(context, resources, R.drawable.exo_controls_repeat_off);
        this.S = e0.r(context, resources, R.drawable.exo_controls_repeat_one);
        this.T = e0.r(context, resources, R.drawable.exo_controls_repeat_all);
        this.a0 = e0.r(context, resources, R.drawable.exo_controls_shuffle_on);
        this.f5783b0 = e0.r(context, resources, R.drawable.exo_controls_shuffle_off);
        this.U = resources.getString(R.string.exo_controls_repeat_off_description);
        this.V = resources.getString(R.string.exo_controls_repeat_one_description);
        this.W = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f5788e0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f5789f0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.f5813z0 = -9223372036854775807L;
    }

    public final boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f5790g0;
        if (player == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (player.w() != 4) {
                    player.O();
                }
            } else if (keyCode == 89) {
                player.Q();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (e0.R(player)) {
                        e0.C(player);
                    } else if (player.E(1)) {
                        player.pause();
                    }
                } else if (keyCode == 87) {
                    player.N();
                } else if (keyCode == 88) {
                    player.q();
                } else if (keyCode == 126) {
                    e0.C(player);
                } else if (keyCode == 127) {
                    int i7 = e0.f13788a;
                    if (player.E(1)) {
                        player.pause();
                    }
                }
            }
        }
        return true;
    }

    public final void b() {
        if (d()) {
            setVisibility(8);
            for (i iVar : this.f5787e) {
                getVisibility();
                ((j) iVar).f9984i.i();
            }
            removeCallbacks(this.P);
            removeCallbacks(this.Q);
            this.f5803t0 = -9223372036854775807L;
        }
    }

    public final void c() {
        e eVar = this.Q;
        removeCallbacks(eVar);
        if (this.f5795l0 <= 0) {
            this.f5803t0 = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.f5795l0;
        this.f5803t0 = jUptimeMillis + j;
        if (this.h0) {
            postDelayed(eVar, j);
        }
    }

    public final boolean d() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.Q);
        } else if (motionEvent.getAction() == 1) {
            c();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        if (!d()) {
            setVisibility(0);
            for (i iVar : this.f5787e) {
                getVisibility();
                ((j) iVar).f9984i.i();
            }
            h();
            g();
            j();
            k();
            l();
            boolean zR = e0.R(this.f5790g0);
            View view = this.f5809x;
            View view2 = this.f5807w;
            if (zR && view2 != null) {
                view2.requestFocus();
            } else if (!zR && view != null) {
                view.requestFocus();
            }
            boolean zR2 = e0.R(this.f5790g0);
            if (zR2 && view2 != null) {
                view2.sendAccessibilityEvent(8);
            } else if (!zR2 && view != null) {
                view.sendAccessibilityEvent(8);
            }
        }
        c();
    }

    public final void f(View view, boolean z5, boolean z6) {
        if (view == null) {
            return;
        }
        view.setEnabled(z6);
        view.setAlpha(z6 ? this.f5784c0 : this.f5786d0);
        view.setVisibility(z5 ? 0 : 8);
    }

    public final void g() {
        boolean zE;
        boolean zE2;
        boolean zE3;
        boolean zE4;
        boolean zE5;
        if (d() && this.h0) {
            Player player = this.f5790g0;
            if (player != null) {
                zE = player.E(5);
                zE3 = player.E(7);
                zE4 = player.E(11);
                zE5 = player.E(12);
                zE2 = player.E(9);
            } else {
                zE = false;
                zE2 = false;
                zE3 = false;
                zE4 = false;
                zE5 = false;
            }
            f(this.f5791i, this.f5800q0, zE3);
            f(this.E, this.f5798o0, zE4);
            f(this.f5811y, this.f5799p0, zE5);
            f(this.f5805v, this.f5801r0, zE2);
            r rVar = this.K;
            if (rVar != null) {
                rVar.setEnabled(zE);
            }
        }
    }

    public Player getPlayer() {
        return this.f5790g0;
    }

    public int getRepeatToggleModes() {
        return this.f5797n0;
    }

    public boolean getShowShuffleButton() {
        return this.f5802s0;
    }

    public int getShowTimeoutMs() {
        return this.f5795l0;
    }

    public boolean getShowVrButton() {
        View view = this.H;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        boolean z5;
        boolean z6;
        if (d() && this.h0) {
            boolean zR = e0.R(this.f5790g0);
            View view = this.f5807w;
            boolean z7 = true;
            if (view != null) {
                z5 = !zR && view.isFocused();
                if (e0.f13788a < 21) {
                    z6 = z5;
                } else {
                    z6 = !zR && f.a(view);
                }
                view.setVisibility(zR ? 0 : 8);
            } else {
                z5 = false;
                z6 = false;
            }
            View view2 = this.f5809x;
            if (view2 != null) {
                z5 |= zR && view2.isFocused();
                if (e0.f13788a < 21) {
                    z7 = z5;
                } else if (!zR || !f.a(view2)) {
                    z7 = false;
                }
                z6 |= z7;
                view2.setVisibility(zR ? 8 : 0);
            }
            if (z5) {
                boolean zR2 = e0.R(this.f5790g0);
                if (zR2 && view != null) {
                    view.requestFocus();
                } else if (!zR2 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z6) {
                boolean zR3 = e0.R(this.f5790g0);
                if (zR3 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else {
                    if (zR3 || view2 == null) {
                        return;
                    }
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void i() {
        long jT;
        long jM;
        if (d() && this.h0) {
            Player player = this.f5790g0;
            if (player != null) {
                jT = player.t() + this.f5812y0;
                jM = player.M() + this.f5812y0;
            } else {
                jT = 0;
                jM = 0;
            }
            boolean z5 = jT != this.f5813z0;
            this.f5813z0 = jT;
            TextView textView = this.J;
            if (textView != null && !this.f5794k0 && z5) {
                textView.setText(e0.z(this.L, this.M, jT));
            }
            r rVar = this.K;
            if (rVar != null) {
                rVar.setPosition(jT);
                rVar.setBufferedPosition(jM);
            }
            e eVar = this.P;
            removeCallbacks(eVar);
            int iW = player == null ? 1 : player.w();
            if (player != null && player.y()) {
                long jMin = Math.min(rVar != null ? rVar.getPreferredUpdateDelay() : 1000L, 1000 - (jT % 1000));
                float f2 = player.b().f5574d;
                postDelayed(eVar, e0.j(f2 > 0.0f ? (long) (jMin / f2) : 1000L, this.f5796m0, 1000L));
            } else {
                if (iW == 4 || iW == 1) {
                    return;
                }
                postDelayed(eVar, 1000L);
            }
        }
    }

    public final void j() {
        ImageView imageView;
        if (d() && this.h0 && (imageView = this.F) != null) {
            if (this.f5797n0 == 0) {
                f(imageView, false, false);
                return;
            }
            Player player = this.f5790g0;
            String str = this.U;
            Drawable drawable = this.R;
            if (player == null) {
                f(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            f(imageView, true, true);
            int I = player.I();
            if (I == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (I == 1) {
                imageView.setImageDrawable(this.S);
                imageView.setContentDescription(this.V);
            } else if (I == 2) {
                imageView.setImageDrawable(this.T);
                imageView.setContentDescription(this.W);
            }
            imageView.setVisibility(0);
        }
    }

    public final void k() {
        ImageView imageView;
        if (d() && this.h0 && (imageView = this.G) != null) {
            Player player = this.f5790g0;
            if (!this.f5802s0) {
                f(imageView, false, false);
                return;
            }
            String str = this.f5789f0;
            Drawable drawable = this.f5783b0;
            if (player == null) {
                f(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            f(imageView, true, true);
            if (player.L()) {
                drawable = this.a0;
            }
            imageView.setImageDrawable(drawable);
            if (player.L()) {
                str = this.f5788e0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x003a A[EDGE_INSN: B:17:0x003a->B:18:0x003b BREAK  A[LOOP:0: B:11:0x0028->B:15:0x0035]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    public final void l() {
        boolean z5;
        boolean z6;
        int i7;
        long j;
        long[] jArr;
        a aVarA;
        int i10;
        int i11;
        Timeline timeline;
        boolean z7;
        boolean z10;
        int i12;
        int i13;
        int length;
        Player player = this.f5790g0;
        if (player == null) {
            return;
        }
        boolean z11 = this.f5792i0;
        long j5 = -9223372036854775807L;
        long j7 = 0;
        v1 v1Var = this.O;
        boolean z12 = false;
        boolean z13 = true;
        if (!z11) {
            z5 = false;
            break;
        }
        Timeline timelineJ = player.J();
        if (timelineJ.o() <= 100) {
            int iO = timelineJ.o();
            int i14 = 0;
            while (true) {
                if (i14 >= iO) {
                    z5 = true;
                    break;
                } else {
                    if (timelineJ.m(i14, v1Var, 0L).K == -9223372036854775807L) {
                        z5 = false;
                        break;
                    }
                    i14++;
                }
            }
        } else {
            z5 = false;
            break;
        }
        this.f5793j0 = z5;
        this.f5812y0 = 0L;
        Timeline timelineJ2 = player.J();
        if (timelineJ2.p()) {
            z6 = true;
            i7 = 0;
        } else {
            int iD = player.D();
            boolean z14 = this.f5793j0;
            int i15 = z14 ? 0 : iD;
            int iO2 = z14 ? timelineJ2.o() - 1 : iD;
            long j10 = 0;
            i7 = 0;
            while (i15 <= iO2) {
                long j11 = j5;
                if (i15 == iD) {
                    this.f5812y0 = e0.U(j10);
                }
                timelineJ2.n(i15, v1Var);
                if (v1Var.K == j11) {
                    b.k(this.f5793j0 ^ z13);
                    break;
                }
                int i16 = v1Var.L;
                while (i16 <= v1Var.M) {
                    u1 u1Var = this.N;
                    timelineJ2.f(i16, u1Var, z12);
                    long j12 = j7;
                    nd.b bVar = u1Var.f9892y;
                    int i17 = bVar.f16560v;
                    int i18 = bVar.f16557d;
                    while (i17 < i18) {
                        long jD = u1Var.d(i17);
                        if (jD == Long.MIN_VALUE) {
                            long j13 = u1Var.f9889v;
                            if (j13 == j11) {
                                timeline = timelineJ2;
                                z7 = true;
                            } else {
                                jD = j13;
                                j = jD + u1Var.f9890w;
                                if (j >= j12) {
                                    jArr = this.f5804u0;
                                    if (i7 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.f5804u0 = Arrays.copyOf(jArr, length);
                                        this.f5806v0 = Arrays.copyOf(this.f5806v0, length);
                                    }
                                    this.f5804u0[i7] = e0.U(j10 + j);
                                    boolean[] zArr = this.f5806v0;
                                    aVarA = u1Var.f9892y.a(i17);
                                    i10 = aVarA.f16549e;
                                    if (i10 != -1) {
                                        i11 = 0;
                                        while (true) {
                                            if (i11 < i10) {
                                                timeline = timelineJ2;
                                                z7 = true;
                                                z10 = false;
                                                break;
                                            }
                                            i12 = i11;
                                            i13 = aVarA.f16552w[i12];
                                            timeline = timelineJ2;
                                            z7 = true;
                                            if (i13 != 0 || i13 == 1) {
                                                z10 = true;
                                                break;
                                            } else {
                                                i11 = i12 + 1;
                                                timelineJ2 = timeline;
                                            }
                                        }
                                    } else {
                                        timeline = timelineJ2;
                                        z7 = true;
                                        z10 = true;
                                    }
                                    zArr[i7] = !z10;
                                    i7++;
                                } else {
                                    timeline = timelineJ2;
                                    z7 = true;
                                }
                            }
                        } else {
                            j = jD + u1Var.f9890w;
                            if (j >= j12) {
                                jArr = this.f5804u0;
                                if (i7 == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = 1;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.f5804u0 = Arrays.copyOf(jArr, length);
                                    this.f5806v0 = Arrays.copyOf(this.f5806v0, length);
                                }
                                this.f5804u0[i7] = e0.U(j10 + j);
                                boolean[] zArr2 = this.f5806v0;
                                aVarA = u1Var.f9892y.a(i17);
                                i10 = aVarA.f16549e;
                                if (i10 != -1) {
                                    timeline = timelineJ2;
                                    z7 = true;
                                    z10 = true;
                                } else {
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < i10) {
                                            timeline = timelineJ2;
                                            z7 = true;
                                            z10 = false;
                                            break;
                                        } else {
                                            i12 = i11;
                                            i13 = aVarA.f16552w[i12];
                                            timeline = timelineJ2;
                                            z7 = true;
                                            if (i13 != 0) {
                                            }
                                            z10 = true;
                                            break;
                                        }
                                        i11 = i12 + 1;
                                        timelineJ2 = timeline;
                                    }
                                }
                                zArr2[i7] = !z10;
                                i7++;
                            } else {
                                timeline = timelineJ2;
                                z7 = true;
                            }
                        }
                        i17++;
                        z13 = z7;
                        iD = iD;
                        timelineJ2 = timeline;
                        j11 = -9223372036854775807L;
                    }
                    i16++;
                    j7 = j12;
                    timelineJ2 = timelineJ2;
                    z12 = false;
                    j11 = -9223372036854775807L;
                }
                j10 += v1Var.K;
                i15++;
                timelineJ2 = timelineJ2;
                j5 = -9223372036854775807L;
                z12 = false;
            }
            z6 = z13;
            j7 = j10;
        }
        long jU = e0.U(j7);
        TextView textView = this.I;
        if (textView != null) {
            textView.setText(e0.z(this.L, this.M, jU));
        }
        r rVar = this.K;
        if (rVar != null) {
            rVar.setDuration(jU);
            long[] jArr2 = this.f5808w0;
            int length2 = jArr2.length;
            int i19 = i7 + length2;
            long[] jArr3 = this.f5804u0;
            if (i19 > jArr3.length) {
                this.f5804u0 = Arrays.copyOf(jArr3, i19);
                this.f5806v0 = Arrays.copyOf(this.f5806v0, i19);
            }
            System.arraycopy(jArr2, 0, this.f5804u0, i7, length2);
            System.arraycopy(this.f5810x0, 0, this.f5806v0, i7, length2);
            long[] jArr4 = this.f5804u0;
            boolean[] zArr3 = this.f5806v0;
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) rVar;
            b.g((i19 == 0 || !(jArr4 == null || zArr3 == null)) ? z6 : false);
            defaultTimeBar.f5776k0 = i19;
            defaultTimeBar.f5777l0 = jArr4;
            defaultTimeBar.f5778m0 = zArr3;
            defaultTimeBar.e();
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h0 = true;
        long j = this.f5803t0;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                b();
            } else {
                postDelayed(this.Q, jUptimeMillis);
            }
        } else if (d()) {
            c();
        }
        h();
        g();
        j();
        k();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h0 = false;
        removeCallbacks(this.P);
        removeCallbacks(this.Q);
    }

    public void setPlayer(Player player) {
        b.k(Looper.myLooper() == Looper.getMainLooper());
        b.g(player == null || player.K() == Looper.getMainLooper());
        Player player2 = this.f5790g0;
        if (player2 == player) {
            return;
        }
        g gVar = this.f5785d;
        if (player2 != null) {
            player2.m(gVar);
        }
        this.f5790g0 = player;
        if (player != null) {
            player.u(gVar);
        }
        h();
        g();
        j();
        k();
        l();
    }

    public void setRepeatToggleModes(int i7) {
        this.f5797n0 = i7;
        Player player = this.f5790g0;
        if (player != null) {
            int I = player.I();
            if (i7 == 0 && I != 0) {
                this.f5790g0.F(0);
            } else if (i7 == 1 && I == 2) {
                this.f5790g0.F(1);
            } else if (i7 == 2 && I == 1) {
                this.f5790g0.F(2);
            }
        }
        j();
    }

    public void setShowFastForwardButton(boolean z5) {
        this.f5799p0 = z5;
        g();
    }

    public void setShowMultiWindowTimeBar(boolean z5) {
        this.f5792i0 = z5;
        l();
    }

    public void setShowNextButton(boolean z5) {
        this.f5801r0 = z5;
        g();
    }

    public void setShowPreviousButton(boolean z5) {
        this.f5800q0 = z5;
        g();
    }

    public void setShowRewindButton(boolean z5) {
        this.f5798o0 = z5;
        g();
    }

    public void setShowShuffleButton(boolean z5) {
        this.f5802s0 = z5;
        k();
    }

    public void setShowTimeoutMs(int i7) {
        this.f5795l0 = i7;
        if (d()) {
            c();
        }
    }

    public void setShowVrButton(boolean z5) {
        View view = this.H;
        if (view != null) {
            view.setVisibility(z5 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i7) {
        this.f5796m0 = e0.i(i7, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.H;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            f(view, getShowVrButton(), onClickListener != null);
        }
    }

    public void setProgressUpdateListener(h hVar) {
    }
}
