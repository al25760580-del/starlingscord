package ic;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f11511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f11512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f11513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f11513c = jVar;
        this.f11511a = contentResolver;
        this.f11512b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        j jVar = this.f11513c;
        j.a(jVar, f.a((Context) jVar.f11518b));
    }
}
