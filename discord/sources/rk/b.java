package rk;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19432e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f19433i;

    public b(Uri uri, IOException iOException) {
        super(iOException);
        this.f19432e = 1;
        this.f19433i = uri;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        if (this.f19432e != 0) {
            return "Failed to create media source due to a data source error";
        }
        throw null;
    }

    @Override // rk.d, java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("\nFailed to create media source due to a data source error\nUri: ");
        if (this.f19432e == 0) {
            throw null;
        }
        sb2.append(this.f19433i);
        return sb2.toString();
    }
}
