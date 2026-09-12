package yh;

import a5.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends bg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f23344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ig.g f23345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f23346i;

    public e(f fVar, ig.g gVar) {
        n nVar = new n("OnRequestInstallCallback");
        this.f23346i = fVar;
        super(9);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f23344g = nVar;
        this.f23345h = gVar;
    }
}
