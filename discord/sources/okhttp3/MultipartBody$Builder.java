package okhttp3;

import cs.s;
import io.sentry.hints.j;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class MultipartBody$Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteString f17334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaType f17335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17336c;

    public MultipartBody$Builder() {
        String boundary = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(boundary, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        ByteString byteString = ByteString.f17414v;
        this.f17334a = j.z(boundary);
        this.f17335b = a.f17386e;
        this.f17336c = new ArrayList();
    }

    public final void a(Headers headers, RequestBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(body, "body");
        if (headers.a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (headers.a("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        s part = new s(headers, body);
        Intrinsics.checkNotNullParameter(part, "part");
        this.f17336c.add(part);
    }
}
