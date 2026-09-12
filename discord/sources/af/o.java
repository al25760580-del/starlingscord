package af;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Intent f468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f469e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f470i;

    public o(Activity activity, Intent intent, int i7) {
        this.f468d = intent;
        this.f469e = activity;
        this.f470i = i7;
    }

    @Override // af.q
    public final void a() {
        Intent intent = this.f468d;
        if (intent != null) {
            this.f469e.startActivityForResult(intent, this.f470i);
        }
    }
}
