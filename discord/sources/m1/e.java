package m1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputContentInfo f15352d;

    public e(Object obj) {
        this.f15352d = (InputContentInfo) obj;
    }

    @Override // m1.f
    public final Uri c() {
        return this.f15352d.getContentUri();
    }

    @Override // m1.f
    public final Uri e() {
        return this.f15352d.getLinkUri();
    }

    @Override // m1.f
    public final void g() {
        this.f15352d.requestPermission();
    }

    @Override // m1.f
    public final ClipDescription getDescription() {
        return this.f15352d.getDescription();
    }

    @Override // m1.f
    public final Object q() {
        return this.f15352d;
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f15352d = new InputContentInfo(uri, clipDescription, uri2);
    }
}
