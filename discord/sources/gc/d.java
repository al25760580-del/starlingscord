package gc;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f9586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f9587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f9588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9590e = 1.0f;

    public d(Context context, Handler handler, w wVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.f9586a = audioManager;
        this.f9588c = wVar;
        this.f9587b = new c(this, handler);
        this.f9589d = 0;
    }

    public final void a() {
        if (this.f9589d == 0) {
            return;
        }
        if (je.e0.f13788a < 26) {
            this.f9586a.abandonAudioFocus(this.f9587b);
        }
        b(0);
    }

    public final void b(int i7) {
        if (this.f9589d == i7) {
            return;
        }
        this.f9589d = i7;
        float f2 = i7 == 3 ? 0.2f : 1.0f;
        if (this.f9590e == f2) {
            return;
        }
        this.f9590e = f2;
        w wVar = this.f9588c;
        if (wVar != null) {
            com.google.android.exoplayer2.c cVar = wVar.f9916d;
            cVar.o0(1, 2, Float.valueOf(cVar.Z * cVar.f5668z.f9590e));
        }
    }

    public final int c(int i7, boolean z5) {
        a();
        return z5 ? 1 : -1;
    }
}
