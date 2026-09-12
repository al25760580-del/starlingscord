package okhttp3;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes.dex */
public final class d extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaType f17398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f17400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17401d;

    public d(MediaType mediaType, byte[] bArr, int i7, int i10) {
        this.f17398a = mediaType;
        this.f17399b = i7;
        this.f17400c = bArr;
        this.f17401d = i10;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f17399b;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f17398a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.write(this.f17400c, this.f17401d, this.f17399b);
    }
}
