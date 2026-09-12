package rk;

import android.media.MediaCodec;
import android.media.MediaFormat;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19438e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaFormat f19439i;

    public e(int i7, MediaFormat mediaFormat, Exception exc) {
        super(exc);
        this.f19438e = i7;
        this.f19439i = mediaFormat;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.f19438e) {
            case 1:
                return "Failed to create decoder codec.";
            case 2:
                return "Failed to configure decoder codec.";
            case 3:
                return "Failed to create encoder codec.";
            case 4:
                return "Failed to configure encoder codec.";
            case 5:
                return "No decoder found.";
            case 6:
                return "No encoder found.";
            case 7:
                return "Codecs are in released state.";
            case 8:
                return "Mime type not found for the source track.";
            case 9:
                return "No tracks found.";
            case 10:
                return "Internal codec error occurred.";
            case 11:
                return "No frame available for specified tag";
            case 12:
                return "Decoder is not provided";
            case 13:
                return "Encoder is not provided";
            case 14:
                return "Renderer is not provided";
            default:
                throw null;
        }
    }

    @Override // rk.d, java.lang.Throwable
    public final String toString() {
        String strG = g.g(new StringBuilder(), super.toString(), '\n');
        MediaFormat mediaFormat = this.f19439i;
        if (mediaFormat != null) {
            StringBuilder sbO = kk.b.o(strG, "Media format: ");
            sbO.append(mediaFormat.toString());
            sbO.append('\n');
            strG = sbO.toString();
        }
        if (getCause() == null) {
            return strG;
        }
        StringBuilder sbO2 = kk.b.o(strG, "Diagnostic info: ");
        Throwable cause = getCause();
        sbO2.append(!(cause instanceof MediaCodec.CodecException) ? null : ((MediaCodec.CodecException) cause).getDiagnosticInfo());
        return sbO2.toString();
    }
}
