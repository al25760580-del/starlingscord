package qs;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19069e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Buffer f19070i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f19071v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Closeable f19072w;

    public a(boolean z5, int i7) {
        this.f19068d = i7;
        switch (i7) {
            case 1:
                this.f19069e = z5;
                Buffer source = new Buffer();
                this.f19070i = source;
                Inflater inflater = new Inflater(true);
                this.f19071v = inflater;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(inflater, "inflater");
                this.f19072w = new rs.k(v.d(source), inflater);
                break;
            default:
                this.f19069e = z5;
                Buffer buffer = new Buffer();
                this.f19070i = buffer;
                Deflater deflater = new Deflater(-1, true);
                this.f19071v = deflater;
                this.f19072w = new is.e(buffer, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f19068d) {
            case 0:
                ((is.e) this.f19072w).close();
                break;
            default:
                ((rs.k) this.f19072w).close();
                break;
        }
    }
}
