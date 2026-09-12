package pe;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        builder.build();
    }
}
