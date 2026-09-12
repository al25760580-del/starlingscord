package com.discord.minibsdiff;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a$\u0010\u0003\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¨\u0006\f"}, d2 = {"readOffset", "", "Ljava/io/InputStream;", "readNBytesCompat", "", "n", "", "b", "off", "len", "skipNBytesCompat", "", "minibsdiff_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class InputStreamUtilsKt {
    @NotNull
    public static final byte[] readNBytesCompat(@NotNull InputStream inputStream, int i7) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        byte[] bArr = new byte[i7];
        int i10 = 0;
        while (i10 < i7) {
            i10 += inputStream.read(bArr, i10, i7 - i10);
        }
        return bArr;
    }

    public static final long readOffset(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        long j = ByteBuffer.wrap(readNBytesCompat(inputStream, 8)).order(ByteOrder.LITTLE_ENDIAN).getLong();
        return 0 == (Long.MIN_VALUE & j) ? j : -(j & LongCompanionObject.MAX_VALUE);
    }

    public static final void skipNBytesCompat(@NotNull InputStream inputStream, long j) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        long jSkip = 0;
        while (jSkip < j) {
            jSkip += inputStream.skip(j - jSkip);
        }
    }

    public static final int readNBytesCompat(@NotNull InputStream inputStream, @NotNull byte[] b10, int i7, int i10) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        int i11 = 0;
        while (i11 < i10) {
            i11 += inputStream.read(b10, i7 + i11, i10 - i11);
        }
        return i11;
    }
}
