package cs;

import java.io.IOException;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class c extends rs.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Source f7407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f7408e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Source source, d dVar) {
        super(source);
        this.f7407d = source;
        this.f7408e = dVar;
    }

    @Override // rs.g, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7408e.f7409d.close();
        super.close();
    }
}
