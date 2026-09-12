package fe;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import ic.g0;
import je.e0;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spatializer f9098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f9100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f9101d;

    public j(Spatializer spatializer) {
        this.f9098a = spatializer;
        this.f9099b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static j f(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            return null;
        }
        return new j(audioManager.getSpatializer());
    }

    public final boolean a(Format format, AudioAttributes audioAttributes) {
        String str = format.I;
        int i7 = format.V;
        if ("audio/eac3-joc".equals(str) && i7 == 16) {
            i7 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(e0.o(i7));
        int i10 = format.W;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        return this.f9098a.canBeSpatialized((android.media.AudioAttributes) audioAttributes.a().f21117d, channelMask.build());
    }

    public final void b(DefaultTrackSelector defaultTrackSelector, Looper looper) {
        if (this.f9101d == null && this.f9100c == null) {
            this.f9101d = new i(defaultTrackSelector);
            Handler handler = new Handler(looper);
            this.f9100c = handler;
            this.f9098a.addOnSpatializerStateChangedListener(new g0(handler), this.f9101d);
        }
    }

    public final boolean c() {
        return this.f9098a.isAvailable();
    }

    public final boolean d() {
        return this.f9098a.isEnabled();
    }

    public final void e() {
        i iVar = this.f9101d;
        if (iVar == null || this.f9100c == null) {
            return;
        }
        this.f9098a.removeOnSpatializerStateChangedListener(iVar);
        Handler handler = this.f9100c;
        int i7 = e0.f13788a;
        handler.removeCallbacksAndMessages(null);
        this.f9100c = null;
        this.f9101d = null;
    }
}
