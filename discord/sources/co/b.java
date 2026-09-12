package co;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ByteArrayOutputStream {
    public byte[] c() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public byte[] f() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
