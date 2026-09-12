package rs;

import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Source {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedSource f19584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Buffer f19585e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f19586i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f19587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f19589x;

    public n(BufferedSource upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f19584d = upstream;
        Buffer bufferH = upstream.h();
        this.f19585e = bufferH;
        q qVar = bufferH.f17412d;
        this.f19586i = qVar;
        this.f19587v = qVar != null ? qVar.f19597b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19588w = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r3 == r5.f19597b) goto L15;
     */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(okio.Buffer r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6f
            boolean r3 = r8.f19588w
            if (r3 != 0) goto L67
            rs.q r3 = r8.f19586i
            okio.Buffer r4 = r8.f19585e
            if (r3 == 0) goto L2c
            rs.q r5 = r4.f17412d
            if (r3 != r5) goto L24
            int r3 = r8.f19587v
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r5 = r5.f19597b
            if (r3 != r5) goto L24
            goto L2c
        L24:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2c:
            if (r2 != 0) goto L2f
            return r0
        L2f:
            long r0 = r8.f19589x
            r2 = 1
            long r0 = r0 + r2
            okio.BufferedSource r2 = r8.f19584d
            boolean r0 = r2.N(r0)
            if (r0 != 0) goto L3f
            r9 = -1
            return r9
        L3f:
            rs.q r0 = r8.f19586i
            if (r0 != 0) goto L50
            rs.q r0 = r4.f17412d
            if (r0 == 0) goto L50
            r8.f19586i = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.f19597b
            r8.f19587v = r0
        L50:
            long r0 = r4.f17413e
            long r2 = r8.f19589x
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.f19585e
            long r4 = r8.f19589x
            r3 = r9
            r2.g(r3, r4, r6)
            long r9 = r8.f19589x
            long r9 = r9 + r6
            r8.f19589x = r9
            return r6
        L67:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6f:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = kk.b.i(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rs.n.read(okio.Buffer, long):long");
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.f19584d.timeout();
    }
}
