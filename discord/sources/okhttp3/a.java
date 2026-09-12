package okhttp3;

import cs.s;
import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RequestBody {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final MediaType f17386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f17387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f17388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f17389h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteString f17390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaType f17392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17393d;

    static {
        Pattern pattern = MediaType.f17329d;
        f17386e = a.a.i("multipart/mixed");
        a.a.i("multipart/alternative");
        a.a.i("multipart/digest");
        a.a.i("multipart/parallel");
        a.a.i("multipart/form-data");
        f17387f = new byte[]{58, 32};
        f17388g = new byte[]{13, 10};
        f17389h = new byte[]{45, 45};
    }

    public a(ByteString boundaryByteString, MediaType type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f17390a = boundaryByteString;
        this.f17391b = parts;
        Pattern pattern = MediaType.f17329d;
        this.f17392c = a.a.i(type + "; boundary=" + boundaryByteString.k());
        this.f17393d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(BufferedSink bufferedSink, boolean z5) throws EOFException {
        Buffer buffer;
        BufferedSink buffer2;
        if (z5) {
            buffer2 = new Buffer();
            buffer = buffer2;
        } else {
            buffer = 0;
            buffer2 = bufferedSink;
        }
        List list = this.f17391b;
        int size = list.size();
        long j = 0;
        int i7 = 0;
        while (true) {
            ByteString byteString = this.f17390a;
            byte[] bArr = f17389h;
            byte[] bArr2 = f17388g;
            if (i7 >= size) {
                Intrinsics.checkNotNull(buffer2);
                buffer2.write(bArr);
                buffer2.X(byteString);
                buffer2.write(bArr);
                buffer2.write(bArr2);
                if (!z5) {
                    return j;
                }
                Intrinsics.checkNotNull(buffer);
                long j5 = j + buffer.f17413e;
                buffer.c();
                return j5;
            }
            int i10 = i7 + 1;
            s sVar = (s) list.get(i7);
            Headers headers = sVar.f7474a;
            RequestBody requestBody = sVar.f7475b;
            Intrinsics.checkNotNull(buffer2);
            buffer2.write(bArr);
            buffer2.X(byteString);
            buffer2.write(bArr2);
            int size2 = headers.size();
            for (int i11 = 0; i11 < size2; i11++) {
                buffer2.A(headers.b(i11)).write(f17387f).A(headers.h(i11)).write(bArr2);
            }
            MediaType mediaTypeContentType = requestBody.contentType();
            if (mediaTypeContentType != null) {
                buffer2.A("Content-Type: ").A(mediaTypeContentType.f17331a).write(bArr2);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                buffer2.A("Content-Length: ").f0(jContentLength).write(bArr2);
            } else if (z5) {
                Intrinsics.checkNotNull(buffer);
                buffer.c();
                return -1L;
            }
            buffer2.write(bArr2);
            if (z5) {
                j += jContentLength;
            } else {
                requestBody.writeTo(buffer2);
            }
            buffer2.write(bArr2);
            i7 = i10;
        }
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws EOFException {
        long j = this.f17393d;
        if (j != -1) {
            return j;
        }
        long jA = a(null, true);
        this.f17393d = jA;
        return jA;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f17392c;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
