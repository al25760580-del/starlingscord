package nc;

import a5.i0;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends UrlRequest.StatusListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f16542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f16543b;

    public b(int[] iArr, i0 i0Var) {
        this.f16542a = iArr;
        this.f16543b = i0Var;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i7) {
        this.f16542a[0] = i7;
        this.f16543b.p();
    }
}
