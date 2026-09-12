package io.ktor.network.tls.cipher;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Cipher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0006\u0010\t\"\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "", "offset", "", "data", "", "set", "([BIJ)V", "", "([BIS)V", "Ljava/nio/ByteBuffer;", "EmptyByteBuffer", "Ljava/nio/ByteBuffer;", "getEmptyByteBuffer", "()Ljava/nio/ByteBuffer;", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CipherKt {
    private static final ByteBuffer EmptyByteBuffer;

    public static final void set(byte[] bArr, int i, long j) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) (j >>> ((7 - i2) * 8));
        }
    }

    public static final void set(byte[] bArr, int i, short s) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        for (int i2 = 0; i2 < 2; i2++) {
            bArr[i2 + i] = (byte) (s >>> ((1 - i2) * 8));
        }
    }

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        EmptyByteBuffer = byteBufferAllocate;
    }

    public static final ByteBuffer getEmptyByteBuffer() {
        return EmptyByteBuffer;
    }
}
