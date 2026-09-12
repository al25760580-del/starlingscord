package okhttp3;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class c extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaType f17396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ByteString f17397b;

    public c(MediaType mediaType, ByteString byteString) {
        this.f17396a = mediaType;
        this.f17397b = byteString;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f17397b.c();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f17396a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.X(this.f17397b);
    }
}
