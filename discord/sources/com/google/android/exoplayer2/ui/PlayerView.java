package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.discord.R;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.video.VideoSize;
import ga.l;
import ge.a;
import ge.i;
import ge.j;
import ge.k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import je.b;
import je.e0;
import je.f;
import ke.m;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int W = 0;
    public final View E;
    public final TextView F;
    public final PlayerControlView G;
    public final FrameLayout H;
    public final FrameLayout I;
    public Player J;
    public boolean K;
    public i L;
    public boolean M;
    public Drawable N;
    public int O;
    public boolean P;
    public CharSequence Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f5814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AspectRatioFrameLayout f5815e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f5816i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f5817v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f5818w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f5819x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SubtitleView f5820y;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet) {
        boolean z5;
        int i7;
        int color;
        boolean z6;
        int i10;
        int i11;
        boolean z7;
        boolean zHasValue;
        boolean z10;
        int resourceId;
        boolean z11;
        int i12;
        boolean z12;
        super(context, attributeSet, 0);
        j jVar = new j(this);
        this.f5814d = jVar;
        if (isInEditMode()) {
            this.f5815e = null;
            this.f5816i = null;
            this.f5817v = null;
            this.f5818w = false;
            this.f5819x = null;
            this.f5820y = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            ImageView imageView = new ImageView(context);
            if (e0.f13788a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(e0.r(context, resources, 2131231353));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(e0.r(context, resources2, 2131231353));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int resourceId2 = R.layout.exo_player_view;
        int i13 = 5000;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k.f9988d, 0, 0);
            try {
                zHasValue = typedArrayObtainStyledAttributes.hasValue(23);
                color = typedArrayObtainStyledAttributes.getColor(23, 0);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(12, R.layout.exo_player_view);
                z10 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(6, 0);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                i7 = typedArrayObtainStyledAttributes.getInt(24, 1);
                i10 = typedArrayObtainStyledAttributes.getInt(14, 0);
                i13 = typedArrayObtainStyledAttributes.getInt(22, 5000);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(8, true);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(20, 0);
                this.P = typedArrayObtainStyledAttributes.getBoolean(9, this.P);
                z5 = typedArrayObtainStyledAttributes.getBoolean(7, true);
                typedArrayObtainStyledAttributes.recycle();
                z7 = z14;
                i11 = integer;
                z11 = z13;
                z6 = z15;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z5 = true;
            i7 = 1;
            color = 0;
            z6 = true;
            i10 = 0;
            i11 = 0;
            z7 = true;
            zHasValue = false;
            z10 = true;
            resourceId = 0;
            z11 = true;
        }
        int i14 = i13;
        LayoutInflater.from(context).inflate(resourceId2, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f5815e = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i10);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.f5816i = viewFindViewById;
        if (viewFindViewById != null && zHasValue) {
            viewFindViewById.setBackgroundColor(color);
        }
        if (aspectRatioFrameLayout == null || i7 == 0) {
            i12 = 0;
            this.f5817v = null;
            z12 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 != 2) {
                if (i7 == 3) {
                    try {
                        int i15 = le.k.I;
                        this.f5817v = (View) le.k.class.getConstructor(Context.class).newInstance(context);
                        z12 = true;
                    } catch (Exception e10) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                    }
                } else if (i7 != 4) {
                    this.f5817v = new SurfaceView(context);
                } else {
                    try {
                        int i16 = m.f14394e;
                        this.f5817v = (View) m.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e11) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
                this.f5817v.setLayoutParams(layoutParams);
                this.f5817v.setOnClickListener(jVar);
                i12 = 0;
                this.f5817v.setClickable(false);
                aspectRatioFrameLayout.addView(this.f5817v, 0);
            } else {
                this.f5817v = new TextureView(context);
            }
            z12 = false;
            this.f5817v.setLayoutParams(layoutParams);
            this.f5817v.setOnClickListener(jVar);
            i12 = 0;
            this.f5817v.setClickable(false);
            aspectRatioFrameLayout.addView(this.f5817v, 0);
        }
        this.f5818w = z12;
        this.H = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.I = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f5819x = imageView2;
        this.M = (!z10 || imageView2 == null) ? i12 : 1;
        if (resourceId != 0) {
            this.N = getContext().getDrawable(resourceId);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f5820y = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.E = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.O = i11;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.F = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.G = playerControlView;
        } else if (viewFindViewById3 != null) {
            PlayerControlView playerControlView2 = new PlayerControlView(context, attributeSet);
            this.G = playerControlView2;
            playerControlView2.setId(R.id.exo_controller);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            this.G = null;
        }
        PlayerControlView playerControlView3 = this.G;
        this.R = playerControlView3 != null ? i14 : i12;
        this.U = z7;
        this.S = z6;
        this.T = z5;
        this.K = (!z11 || playerControlView3 == null) ? i12 : 1;
        if (playerControlView3 != null) {
            playerControlView3.b();
            this.G.f5787e.add(jVar);
        }
        if (z11) {
            setClickable(true);
        }
        i();
    }

    public static void a(TextureView textureView, int i7) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i7 != 0) {
            float f2 = width / 2.0f;
            float f7 = height / 2.0f;
            matrix.postRotate(i7, f2, f7);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f2, f7);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        Player player = this.J;
        return player != null && player.c() && this.J.g();
    }

    public final void c(boolean z5) {
        if (!(b() && this.T) && l()) {
            PlayerControlView playerControlView = this.G;
            boolean z6 = playerControlView.d() && playerControlView.getShowTimeoutMs() <= 0;
            boolean zE = e();
            if ((z5 || z6 || zE) && l()) {
                playerControlView.setShowTimeoutMs(zE ? 0 : this.R);
                playerControlView.e();
            }
        }
    }

    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f2 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f5815e;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f2);
                }
                ImageView imageView = this.f5819x;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.J;
        if (player != null && player.c()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z5 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.G;
        if (z5 && l() && !playerControlView.d()) {
            c(true);
            return true;
        }
        if ((l() && playerControlView.a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            c(true);
            return true;
        }
        if (z5 && l()) {
            c(true);
        }
        return false;
    }

    public final boolean e() {
        Player player = this.J;
        if (player == null) {
            return true;
        }
        int iW = player.w();
        if (this.S) {
            return iW == 1 || iW == 4 || !this.J.g();
        }
        return false;
    }

    public final void f() {
        if (!l() || this.J == null) {
            return;
        }
        PlayerControlView playerControlView = this.G;
        if (!playerControlView.d()) {
            c(true);
        } else if (this.U) {
            playerControlView.b();
        }
    }

    public final void g() {
        Player player = this.J;
        VideoSize videoSizeL = player != null ? player.l() : VideoSize.f5848w;
        int i7 = videoSizeL.f5849d;
        int i10 = videoSizeL.f5850e;
        int i11 = videoSizeL.f5851i;
        float f2 = (i10 == 0 || i7 == 0) ? 0.0f : (i7 * videoSizeL.f5852v) / i10;
        View view = this.f5817v;
        if (view instanceof TextureView) {
            if (f2 > 0.0f && (i11 == 90 || i11 == 270)) {
                f2 = 1.0f / f2;
            }
            int i12 = this.V;
            j jVar = this.f5814d;
            if (i12 != 0) {
                view.removeOnLayoutChangeListener(jVar);
            }
            this.V = i11;
            if (i11 != 0) {
                view.addOnLayoutChangeListener(jVar);
            }
            a((TextureView) view, this.V);
        }
        float f7 = this.f5818w ? 0.0f : f2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f5815e;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f7);
        }
    }

    public List<l> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.I;
        if (frameLayout != null) {
            arrayList.add(new l(9, frameLayout));
        }
        PlayerControlView playerControlView = this.G;
        if (playerControlView != null) {
            arrayList.add(new l(9, playerControlView));
        }
        return ei.e0.k(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.H;
        b.m(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.S;
    }

    public boolean getControllerHideOnTouch() {
        return this.U;
    }

    public int getControllerShowTimeoutMs() {
        return this.R;
    }

    public Drawable getDefaultArtwork() {
        return this.N;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.I;
    }

    public Player getPlayer() {
        return this.J;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f5815e;
        b.l(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f5820y;
    }

    public boolean getUseArtwork() {
        return this.M;
    }

    public boolean getUseController() {
        return this.K;
    }

    public View getVideoSurfaceView() {
        return this.f5817v;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public final void h() {
        boolean z5;
        View view = this.E;
        if (view != null) {
            Player player = this.J;
            if (player == null || player.w() != 2) {
                z5 = false;
            } else {
                int i7 = this.O;
                z5 = true;
                if (i7 != 2 && (i7 != 1 || !this.J.g())) {
                    z5 = false;
                }
            }
            view.setVisibility(z5 ? 0 : 8);
        }
    }

    public final void i() {
        PlayerControlView playerControlView = this.G;
        if (playerControlView == null || !this.K) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            setContentDescription(this.U ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void j() {
        TextView textView = this.F;
        if (textView != null) {
            CharSequence charSequence = this.Q;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                Player player = this.J;
                if (player != null) {
                    player.A();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void k(boolean z5) {
        Player player = this.J;
        View view = this.f5816i;
        ImageView imageView = this.f5819x;
        boolean zD = false;
        if (player == null || !player.E(30) || player.x().f5590d.isEmpty()) {
            if (this.P) {
                return;
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        if (z5 && !this.P && view != null) {
            view.setVisibility(0);
        }
        if (player.x().a(2)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
                return;
            }
            return;
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if (this.M) {
            b.l(imageView);
            byte[] bArr = player.R().G;
            if (bArr != null) {
                zD = d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
            }
            if (zD || d(this.N)) {
                return;
            }
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            imageView.setVisibility(4);
        }
    }

    public final boolean l() {
        if (!this.K) {
            return false;
        }
        b.l(this.G);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!l() || this.J == null) {
            return false;
        }
        c(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        f();
        return super.performClick();
    }

    public void setAspectRatioListener(a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f5815e;
        b.l(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAutoShow(boolean z5) {
        this.S = z5;
    }

    public void setControllerHideDuringAds(boolean z5) {
        this.T = z5;
    }

    public void setControllerHideOnTouch(boolean z5) {
        b.l(this.G);
        this.U = z5;
        i();
    }

    public void setControllerShowTimeoutMs(int i7) {
        PlayerControlView playerControlView = this.G;
        b.l(playerControlView);
        this.R = i7;
        if (playerControlView.d()) {
            boolean zE = e();
            if (l()) {
                playerControlView.setShowTimeoutMs(zE ? 0 : this.R);
                playerControlView.e();
            }
        }
    }

    public void setControllerVisibilityListener(i iVar) {
        PlayerControlView playerControlView = this.G;
        b.l(playerControlView);
        CopyOnWriteArrayList copyOnWriteArrayList = playerControlView.f5787e;
        i iVar2 = this.L;
        if (iVar2 == iVar) {
            return;
        }
        if (iVar2 != null) {
            copyOnWriteArrayList.remove(iVar2);
        }
        this.L = iVar;
        if (iVar != null) {
            copyOnWriteArrayList.add(iVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        b.k(this.F != null);
        this.Q = charSequence;
        j();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.N != drawable) {
            this.N = drawable;
            k(false);
        }
    }

    public void setErrorMessageProvider(f fVar) {
        if (fVar != null) {
            j();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z5) {
        if (this.P != z5) {
            this.P = z5;
            k(false);
        }
    }

    public void setPlayer(Player player) {
        b.k(Looper.myLooper() == Looper.getMainLooper());
        b.g(player == null || player.K() == Looper.getMainLooper());
        Player player2 = this.J;
        if (player2 == player) {
            return;
        }
        View view = this.f5817v;
        j jVar = this.f5814d;
        if (player2 != null) {
            player2.m(jVar);
            if (player2.E(27)) {
                if (view instanceof TextureView) {
                    player2.k((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    player2.G((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f5820y;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.J = player;
        boolean zL = l();
        PlayerControlView playerControlView = this.G;
        if (zL) {
            playerControlView.setPlayer(player);
        }
        h();
        j();
        k(true);
        if (player == null) {
            if (playerControlView != null) {
                playerControlView.b();
                return;
            }
            return;
        }
        if (player.E(27)) {
            if (view instanceof TextureView) {
                player.P((TextureView) view);
            } else if (view instanceof SurfaceView) {
                player.p((SurfaceView) view);
            }
            g();
        }
        if (subtitleView != null && player.E(28)) {
            subtitleView.setCues(player.z().f5726d);
        }
        player.u(jVar);
        c(false);
    }

    public void setRepeatToggleModes(int i7) {
        PlayerControlView playerControlView = this.G;
        b.l(playerControlView);
        playerControlView.setRepeatToggleModes(i7);
    }

    public void setResizeMode(int i7) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f5815e;
        b.l(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i7);
    }

    public void setShowBuffering(int i7) {
        if (this.O != i7) {
            this.O = i7;
            h();
        }
    }

    public void setShowFastForwardButton(boolean z5) {
        PlayerControlView playerControlView = this.G;
        b.l(playerControlView);
        playerControlView.setShowFastForwardButton(z5);
    }

    public void setShowMultiWindowTimeBar(boolean z5) {
        PlayerControlView playerControlView = this.G;
        b.l(playerControlView);
        playerControlView.setShowMultiWindowTimeBar(z5);
    }

    public void setShowNextButton(boolean z5) {
        PlayerControlView playerControlView = this.G;
        b.l(playerControlView);
        playerControlView.setShowNextButton(z5);
    }

    public void setShowPreviousButton(boolean z5) {
        PlayerControlView playerControlView = this.G;
        b.l(playerControlView);
        playerControlView.setShowPreviousButton(z5);
    }

    public void setShowRewindButton(boolean z5) {
        PlayerControlView playerControlView = this.G;
        b.l(playerControlView);
        playerControlView.setShowRewindButton(z5);
    }

    public void setShowShuffleButton(boolean z5) {
        PlayerControlView playerControlView = this.G;
        b.l(playerControlView);
        playerControlView.setShowShuffleButton(z5);
    }

    public void setShutterBackgroundColor(int i7) {
        View view = this.f5816i;
        if (view != null) {
            view.setBackgroundColor(i7);
        }
    }

    public void setUseArtwork(boolean z5) {
        b.k((z5 && this.f5819x == null) ? false : true);
        if (this.M != z5) {
            this.M = z5;
            k(false);
        }
    }

    public void setUseController(boolean z5) {
        boolean z6 = true;
        PlayerControlView playerControlView = this.G;
        b.k((z5 && playerControlView == null) ? false : true);
        if (!z5 && !hasOnClickListeners()) {
            z6 = false;
        }
        setClickable(z6);
        if (this.K == z5) {
            return;
        }
        this.K = z5;
        if (l()) {
            playerControlView.setPlayer(this.J);
        } else if (playerControlView != null) {
            playerControlView.b();
            playerControlView.setPlayer(null);
        }
        i();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        View view = this.f5817v;
        if (view instanceof SurfaceView) {
            view.setVisibility(i7);
        }
    }
}
