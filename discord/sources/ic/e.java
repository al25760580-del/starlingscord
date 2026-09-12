package ic;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import ei.e1;
import ei.v0;
import ei.w0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f11490a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static ei.e0 a() {
        ei.c0 c0Var = ei.e0.f8303e;
        ei.b0 b0Var = new ei.b0();
        w0 w0Var = f.f11502e;
        ei.u0 u0Var = w0Var.f8378e;
        if (u0Var == null) {
            ei.u0 u0Var2 = new ei.u0(w0Var, new v0(w0Var.f8381w, 0, w0Var.f8382x));
            w0Var.f8378e = u0Var2;
            u0Var = u0Var2;
        }
        e1 it = u0Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (je.e0.f13788a >= 34 || iIntValue != 30) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f11490a)) {
                    b0Var.a(num);
                }
            }
        }
        b0Var.a(2);
        return b0Var.f();
    }

    public static int b(int i7, int i10) {
        for (int i11 = 10; i11 > 0; i11--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i10).setChannelMask(je.e0.o(i11)).build(), f11490a)) {
                return i11;
            }
        }
        return 0;
    }
}
