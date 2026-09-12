package cs;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ResponseBody {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final es.f f7409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7410e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f7411i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final rs.p f7412v;

    public d(es.f snapshot, String str, String str2) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f7409d = snapshot;
        this.f7410e = str;
        this.f7411i = str2;
        this.f7412v = rs.v.d(new c((Source) snapshot.f8746i.get(1), this));
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        String str = this.f7411i;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = ds.b.f7815a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        String str = this.f7410e;
        if (str == null) {
            return null;
        }
        Pattern pattern = MediaType.f17329d;
        return a.a.u(str);
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource source() {
        return this.f7412v;
    }
}
