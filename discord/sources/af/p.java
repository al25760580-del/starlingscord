package af;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Intent f471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ze.f f472e;

    public p(Intent intent, ze.f fVar) {
        this.f471d = intent;
        this.f472e = fVar;
    }

    @Override // af.q
    public final void a() {
        Intent intent = this.f471d;
        if (intent != null) {
            this.f472e.startActivityForResult(intent, 2);
        }
    }
}
