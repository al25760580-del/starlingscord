package is;

import gs.l;
import gs.o;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;
import rs.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Source {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f13435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13436e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f13437i;

    public a(o this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f13437i = this$0;
        this.f13435d = new h(((BufferedSource) this$0.f10249e).timeout());
    }

    public final void c() {
        o oVar = this.f13437i;
        int i7 = oVar.f10246b;
        if (i7 == 6) {
            return;
        }
        if (i7 != 5) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(oVar.f10246b)));
        }
        o.i(oVar, this.f13435d);
        oVar.f10246b = 6;
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) throws IOException {
        o oVar = this.f13437i;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return ((BufferedSource) oVar.f10249e).read(sink, j);
        } catch (IOException e10) {
            ((l) oVar.f10248d).k();
            c();
            throw e10;
        }
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.f13435d;
    }
}
