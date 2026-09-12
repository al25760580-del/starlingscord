package sh;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20056i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(m mVar, ig.g gVar, int i7) {
        super(mVar, gVar);
        this.f20056i = i7;
    }

    @Override // sh.h, th.l
    public void o(Bundle bundle, Bundle bundle2) {
        switch (this.f20056i) {
            case 1:
                super.o(bundle, bundle2);
                this.f20049g.d((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
                break;
            default:
                super.o(bundle, bundle2);
                break;
        }
    }
}
