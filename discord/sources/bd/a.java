package bd;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ke.h f3129b;

    public /* synthetic */ a(l lVar, ke.h hVar, int i7) {
        this.f3128a = i7;
        this.f3129b = hVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j5) {
        switch (this.f3128a) {
            case 0:
                ke.h hVar = this.f3129b;
                Handler handler = hVar.f14352d;
                if (e0.f13788a >= 30) {
                    hVar.a(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                ke.h hVar2 = this.f3129b;
                Handler handler2 = hVar2.f14352d;
                if (e0.f13788a >= 30) {
                    hVar2.a(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
