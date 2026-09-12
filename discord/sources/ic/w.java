package ic;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f11661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11666f;

    public w(AudioTrack audioTrack) {
        if (je.e0.f13788a >= 19) {
            this.f11661a = new v(audioTrack);
            a();
        } else {
            this.f11661a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f11661a != null) {
            b(0);
        }
    }

    public final void b(int i7) {
        this.f11662b = i7;
        if (i7 == 0) {
            this.f11665e = 0L;
            this.f11666f = -1L;
            this.f11663c = System.nanoTime() / 1000;
            this.f11664d = 10000L;
            return;
        }
        if (i7 == 1) {
            this.f11664d = 10000L;
            return;
        }
        if (i7 == 2 || i7 == 3) {
            this.f11664d = 10000000L;
        } else {
            if (i7 != 4) {
                throw new IllegalStateException();
            }
            this.f11664d = 500000L;
        }
    }
}
