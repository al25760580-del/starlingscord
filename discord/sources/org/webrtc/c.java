package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Camera1Session.AnonymousClass2 f17666e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f17667i;

    public /* synthetic */ c(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f17665d = i7;
        this.f17666e = anonymousClass2;
        this.f17667i = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17665d) {
            case 0:
                this.f17666e.lambda$onPreviewFrame$1(this.f17667i);
                break;
            default:
                this.f17666e.lambda$onPreviewFrame$0(this.f17667i);
                break;
        }
    }
}
