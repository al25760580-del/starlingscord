package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import rs.o;
import rs.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u0001J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/modules/network/ProgressRequestBody;", "Lokhttp3/RequestBody;", "requestBody", "progressListener", "Lcom/facebook/react/modules/network/ProgressListener;", "<init>", "(Lokhttp3/RequestBody;Lcom/facebook/react/modules/network/ProgressListener;)V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "writeTo", "", "sink", "Lokio/BufferedSink;", "innerBody", "outputStreamSink", "Lokio/Sink;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProgressRequestBody extends RequestBody {
    private long contentLength;

    @NotNull
    private final ProgressListener progressListener;

    @NotNull
    private final RequestBody requestBody;

    public ProgressRequestBody(@NotNull RequestBody requestBody, @NotNull ProgressListener progressListener) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    private final Sink outputStreamSink(BufferedSink sink) {
        FilterOutputStream outputStream = new FilterOutputStream(sink.g0()) { // from class: com.facebook.react.modules.network.ProgressRequestBody.outputStreamSink.1
            private long count;

            public final void sendProgressUpdate() {
                long j = this.count;
                long jContentLength = ProgressRequestBody.this.contentLength();
                ProgressRequestBody.this.progressListener.onProgress(j, jContentLength, j == jContentLength);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) throws IOException {
                Intrinsics.checkNotNullParameter(data, "data");
                super.write(data, offset, byteCount);
                this.count += (long) byteCount;
                sendProgressUpdate();
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int data) throws IOException {
                super.write(data);
                this.count++;
                sendProgressUpdate();
            }
        };
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        return v.i(outputStream);
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.contentLength == 0) {
            this.contentLength = this.requestBody.contentLength();
        }
        return this.contentLength;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.requestBody.contentType();
    }

    @NotNull
    /* JADX INFO: renamed from: innerBody, reason: from getter */
    public final RequestBody getRequestBody() {
        return this.requestBody;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Sink sink2 = outputStreamSink(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        o oVarC = v.c(sink2);
        contentLength();
        this.requestBody.writeTo(oVarC);
        oVarC.flush();
    }
}
