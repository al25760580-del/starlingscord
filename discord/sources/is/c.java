package is;

import gs.l;
import gs.o;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HttpUrl f13441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f13442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f13444y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o this$0, HttpUrl url) {
        super(this$0);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f13444y = this$0;
        this.f13441v = url;
        this.f13442w = -1L;
        this.f13443x = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.f13436e) {
            return;
        }
        if (this.f13443x) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = ds.b.f7815a;
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            try {
                zT = ds.b.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                ((l) this.f13444y.f10248d).k();
                c();
            }
        }
        this.f13436e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r11.f13443x == false) goto L34;
     */
    @Override // is.a, okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(okio.Buffer r12, long r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: is.c.read(okio.Buffer, long):long");
    }
}
