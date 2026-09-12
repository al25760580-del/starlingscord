package com.google.android.exoplayer2;

import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.video.VideoSize;
import gc.g;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public interface Player {

    public static final class Commands implements g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final je.g f5577d;

        static {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            je.b.k(!false);
            new je.g(sparseBooleanArray);
            int i7 = e0.f13788a;
            Integer.toString(0, 36);
        }

        public Commands(je.g gVar) {
            this.f5577d = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Commands) {
                return this.f5577d.equals(((Commands) obj).f5577d);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5577d.hashCode();
        }
    }

    public static final class Events {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final je.g f5578a;

        public Events(je.g gVar) {
            this.f5578a = gVar;
        }

        public final boolean a(int... iArr) {
            for (int i7 : iArr) {
                if (this.f5578a.f13801a.get(i7)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Events) {
                return this.f5578a.equals(((Events) obj).f5578a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5578a.hashCode();
        }
    }

    public static final class PositionInfo implements g {
        public final int E;
        public final int F;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f5579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5580e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final MediaItem f5581i;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Object f5582v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f5583w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final long f5584x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final long f5585y;

        static {
            int i7 = e0.f13788a;
            Integer.toString(0, 36);
            Integer.toString(1, 36);
            Integer.toString(2, 36);
            Integer.toString(3, 36);
            Integer.toString(4, 36);
            Integer.toString(5, 36);
            Integer.toString(6, 36);
        }

        public PositionInfo(Object obj, int i7, MediaItem mediaItem, Object obj2, int i10, long j, long j5, int i11, int i12) {
            this.f5579d = obj;
            this.f5580e = i7;
            this.f5581i = mediaItem;
            this.f5582v = obj2;
            this.f5583w = i10;
            this.f5584x = j;
            this.f5585y = j5;
            this.E = i11;
            this.F = i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PositionInfo.class == obj.getClass()) {
                PositionInfo positionInfo = (PositionInfo) obj;
                if (this.f5580e == positionInfo.f5580e && this.f5583w == positionInfo.f5583w && this.f5584x == positionInfo.f5584x && this.f5585y == positionInfo.f5585y && this.E == positionInfo.E && this.F == positionInfo.F && ls.d.n(this.f5579d, positionInfo.f5579d) && ls.d.n(this.f5582v, positionInfo.f5582v) && ls.d.n(this.f5581i, positionInfo.f5581i)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f5579d, Integer.valueOf(this.f5580e), this.f5581i, this.f5582v, Integer.valueOf(this.f5583w), Long.valueOf(this.f5584x), Long.valueOf(this.f5585y), Integer.valueOf(this.E), Integer.valueOf(this.F)});
        }
    }

    b A();

    void B();

    int C();

    int D();

    boolean E(int i7);

    void F(int i7);

    void G(SurfaceView surfaceView);

    int H();

    int I();

    Timeline J();

    Looper K();

    boolean L();

    long M();

    void N();

    void O();

    void P(TextureView textureView);

    void Q();

    MediaMetadata R();

    long S();

    long T();

    void a();

    PlaybackParameters b();

    boolean c();

    long d();

    void e(int i7, long j);

    Commands f();

    boolean g();

    long getDuration();

    void h(boolean z5);

    void i();

    int j();

    void k(TextureView textureView);

    VideoSize l();

    void m(e eVar);

    void n();

    int o();

    void p(SurfaceView surfaceView);

    void pause();

    void q();

    void r(boolean z5);

    long s();

    long t();

    void u(e eVar);

    long v();

    int w();

    Tracks x();

    boolean y();

    CueGroup z();
}
