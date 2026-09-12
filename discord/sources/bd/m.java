package bd;

import android.media.MediaCodec;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public class m extends com.margelo.nitro.rive.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3171d;

    public m(IllegalStateException illegalStateException, o oVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb2.append(oVar == null ? null : oVar.f3172a);
        super(sb2.toString(), illegalStateException);
        if (e0.f13788a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f3171d = diagnosticInfo;
    }
}
