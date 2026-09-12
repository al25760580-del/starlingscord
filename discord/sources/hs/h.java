package hs;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import rs.p;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ResponseBody {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11140e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f11141i;

    public h(String str, long j, p source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f11139d = str;
        this.f11140e = j;
        this.f11141i = source;
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f11140e;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        String str = this.f11139d;
        if (str == null) {
            return null;
        }
        Pattern pattern = MediaType.f17329d;
        return a.a.u(str);
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource source() {
        return this.f11141i;
    }
}
