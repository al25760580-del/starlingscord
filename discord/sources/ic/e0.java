package ic;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Format f11491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f11499i;
    public final boolean j;

    public e0(Format format, int i7, int i10, int i11, int i12, int i13, int i14, int i15, k kVar, boolean z5) {
        this.f11491a = format;
        this.f11492b = i7;
        this.f11493c = i10;
        this.f11494d = i11;
        this.f11495e = i12;
        this.f11496f = i13;
        this.f11497g = i14;
        this.f11498h = i15;
        this.f11499i = kVar;
        this.j = z5;
    }

    public static AudioAttributes c(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, boolean z5) {
        return z5 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) audioAttributes.a().f21117d;
    }

    public final AudioTrack a(boolean z5, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, int i7) {
        int i10 = this.f11493c;
        try {
            AudioTrack audioTrackB = b(z5, audioAttributes, i7);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new s(state, this.f11495e, this.f11496f, this.f11498h, this.f11491a, i10 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new s(0, this.f11495e, this.f11496f, this.f11498h, this.f11491a, i10 == 1, e10);
        }
    }

    public final AudioTrack b(boolean z5, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, int i7) {
        int i10;
        int i11 = je.e0.f13788a;
        int i12 = 0;
        int i13 = this.f11497g;
        int i14 = this.f11496f;
        int i15 = this.f11495e;
        if (i11 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(c(audioAttributes, z5)).setAudioFormat(j0.f(i15, i14, i13)).setTransferMode(1).setBufferSizeInBytes(this.f11498h).setSessionId(i7).setOffloadedPlayback(this.f11493c == 1).build();
        }
        if (i11 >= 21) {
            return new AudioTrack(c(audioAttributes, z5), j0.f(i15, i14, i13), this.f11498h, 1, i7);
        }
        int i16 = audioAttributes.f5630i;
        if (i16 != 13) {
            switch (i16) {
                case 2:
                    break;
                case 3:
                    i12 = 8;
                    break;
                case 4:
                    i12 = 4;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    i12 = 5;
                    break;
                case 6:
                    i12 = 2;
                    break;
                default:
                    i12 = 3;
                    break;
            }
            i10 = i12;
        } else {
            i10 = 1;
        }
        if (i7 == 0) {
            return new AudioTrack(i10, this.f11495e, this.f11496f, this.f11497g, this.f11498h, 1);
        }
        return new AudioTrack(i10, this.f11495e, this.f11496f, this.f11497g, this.f11498h, 1, i7);
    }
}
