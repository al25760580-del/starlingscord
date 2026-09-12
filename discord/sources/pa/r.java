package pa;

import androidx.datastore.preferences.protobuf.d1;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends OutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f17826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r8.b f17827e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17828i;

    public r(p pool, int i7) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (i7 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        this.f17826d = pool;
        this.f17828i = 0;
        this.f17827e = CloseableReference.O(pool.get(i7), pool, CloseableReference.f4623x);
    }

    public final void c() throws Throwable {
        try {
            super.close();
        } catch (IOException e10) {
            n8.i.h(e10);
            throw null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CloseableReference.l(this.f17827e);
        this.f17827e = null;
        this.f17828i = -1;
        c();
    }

    public final q f() {
        if (!CloseableReference.z(this.f17827e)) {
            throw new d1("OutputStream no longer valid");
        }
        r8.b bVar = this.f17827e;
        if (bVar != null) {
            return new q(bVar, this.f17828i);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        write(new byte[]{(byte) i7});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int i7, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (i7 >= 0 && i10 >= 0 && i7 + i10 <= buffer.length) {
            if (CloseableReference.z(this.f17827e)) {
                int i11 = this.f17828i + i10;
                if (CloseableReference.z(this.f17827e)) {
                    r8.b bVar = this.f17827e;
                    if (bVar != null) {
                        Intrinsics.checkNotNull(bVar);
                        if (i11 > ((o) bVar.q()).u()) {
                            p pVar = this.f17826d;
                            Object obj = pVar.get(i11);
                            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            o oVar = (o) obj;
                            r8.b bVar2 = this.f17827e;
                            if (bVar2 != null) {
                                Intrinsics.checkNotNull(bVar2);
                                ((o) bVar2.q()).n(oVar, this.f17828i);
                                r8.b bVar3 = this.f17827e;
                                Intrinsics.checkNotNull(bVar3);
                                bVar3.close();
                                this.f17827e = CloseableReference.O(oVar, pVar, CloseableReference.f4623x);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        r8.b bVar4 = this.f17827e;
                        if (bVar4 != null) {
                            ((o) bVar4.q()).l(this.f17828i, i7, i10, buffer);
                            this.f17828i += i10;
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new d1("OutputStream no longer valid");
            }
            throw new d1("OutputStream no longer valid");
        }
        StringBuilder sbR = a3.e.r(buffer.length, "length=", i7, "; regionStart=", "; regionLength=");
        sbR.append(i10);
        throw new ArrayIndexOutOfBoundsException(sbR.toString());
    }
}
