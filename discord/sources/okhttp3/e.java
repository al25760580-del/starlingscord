package okhttp3;

import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ResponseBody {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MediaType f17402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f17403e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BufferedSource f17404i;

    public e(MediaType mediaType, long j, BufferedSource bufferedSource) {
        this.f17402d = mediaType;
        this.f17403e = j;
        this.f17404i = bufferedSource;
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f17403e;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.f17402d;
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource source() {
        return this.f17404i;
    }
}
