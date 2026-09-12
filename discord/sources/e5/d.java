package e5;

import android.R;
import android.content.Context;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.SubtitleView;

/* JADX INFO: loaded from: classes.dex */
public final class d extends FrameLayout {
    public final ViewGroup.LayoutParams E;
    public boolean F;
    public final a3.h G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f8042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f8043e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SubtitleView f8044i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f8045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f8046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SimpleExoPlayer f8047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Context f8048y;

    public d(Context context) {
        super(context, null, 0);
        this.F = true;
        this.G = new a3.h(11, this);
        this.f8048y = context;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.E = layoutParams;
        this.f8046w = new c(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        a aVar = new a(context, null);
        aVar.f8037e = 0;
        this.f8045v = aVar;
        aVar.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        this.f8043e = view;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(context.getColor(R.color.black));
        SubtitleView subtitleView = new SubtitleView(context, null);
        this.f8044i = subtitleView;
        subtitleView.setLayoutParams(layoutParams);
        subtitleView.a();
        subtitleView.b();
        b();
        aVar.addView(view, 1, layoutParams);
        aVar.addView(subtitleView, 2, layoutParams);
        addViewInLayout(aVar, 0, layoutParams2);
    }

    public final void a() {
        SimpleExoPlayer simpleExoPlayer = this.f8047x;
        if (simpleExoPlayer == null) {
            return;
        }
        View view = this.f8042d;
        if (view instanceof TextureView) {
            simpleExoPlayer.P((TextureView) view);
        } else if (view instanceof SurfaceView) {
            simpleExoPlayer.p((SurfaceView) view);
        }
    }

    public final void b() {
        boolean z5 = this.F;
        Context context = this.f8048y;
        View textureView = z5 ? new TextureView(context) : new SurfaceView(context);
        ViewGroup.LayoutParams layoutParams = this.E;
        textureView.setLayoutParams(layoutParams);
        this.f8042d = textureView;
        a aVar = this.f8045v;
        if (aVar.getChildAt(0) != null) {
            aVar.removeViewAt(0);
        }
        aVar.addView(this.f8042d, 0, layoutParams);
        if (this.f8047x != null) {
            a();
        }
    }

    public View getVideoSurfaceView() {
        return this.f8042d;
    }

    public void setHideShutterView(boolean z5) {
        this.f8043e.setVisibility(z5 ? 4 : 0);
    }

    public void setPlayer(SimpleExoPlayer simpleExoPlayer) {
        SimpleExoPlayer simpleExoPlayer2 = this.f8047x;
        if (simpleExoPlayer2 == simpleExoPlayer) {
            return;
        }
        c cVar = this.f8046w;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.m(cVar);
            SimpleExoPlayer simpleExoPlayer3 = this.f8047x;
            if (simpleExoPlayer3 != null) {
                View view = this.f8042d;
                if (view instanceof TextureView) {
                    simpleExoPlayer3.k((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    simpleExoPlayer3.G((SurfaceView) view);
                }
            }
        }
        this.f8047x = simpleExoPlayer;
        this.f8043e.setVisibility(0);
        if (simpleExoPlayer != null) {
            a();
            simpleExoPlayer.u(cVar);
        }
    }

    public void setResizeMode(int i7) {
        a aVar = this.f8045v;
        if (aVar.getResizeMode() != i7) {
            aVar.setResizeMode(i7);
            post(this.G);
        }
    }

    public void setUseTextureView(boolean z5) {
        if (z5 != this.F) {
            this.F = z5;
            b();
        }
    }
}
