package cd;

import com.google.android.exoplayer2.Format;
import hd.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3589a = new c();

    public final com.facebook.imagepipeline.nativecode.b a(Format format) {
        String str = format.I;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new dd.b(0);
                case "application/x-icy":
                    return new gd.a();
                case "application/id3":
                    return new i(null);
                case "application/x-emsg":
                    return new dd.b(1);
                case "application/x-scte35":
                    return new jd.c();
            }
        }
        throw new IllegalArgumentException(a3.e.l("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(Format format) {
        String str = format.I;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
