package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f17695e;

    public /* synthetic */ l(ByteBuffer byteBuffer, int i7) {
        this.f17694d = i7;
        this.f17695e = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17694d) {
            case 0:
                JniCommon.nativeFreeByteBuffer(this.f17695e);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(this.f17695e);
                break;
        }
    }
}
