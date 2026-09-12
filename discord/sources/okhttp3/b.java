package okhttp3;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaType f17394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f17395b;

    public b(MediaType mediaType, File file) {
        this.f17394a = mediaType;
        this.f17395b = file;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f17395b.length();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f17394a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        rs.b bVarL = v.l(this.f17395b);
        try {
            sink.J(bVarL);
            bVarL.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(bVarL, th2);
                throw th3;
            }
        }
    }
}
