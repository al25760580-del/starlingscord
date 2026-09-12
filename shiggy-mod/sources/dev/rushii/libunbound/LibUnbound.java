package dev.rushii.libunbound;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class LibUnbound {
    private static int cachedBytecodeVersion = -1;

    private static native long getHermesRuntimeBytecodeVersion0();

    private static native boolean isHermesBytecode0(byte[] bArr);

    static {
        System.loadLibrary("unbound");
    }

    public static int getHermesRuntimeBytecodeVersion() {
        int i = cachedBytecodeVersion;
        if (i > 0) {
            return i;
        }
        int hermesRuntimeBytecodeVersion0 = (int) getHermesRuntimeBytecodeVersion0();
        cachedBytecodeVersion = hermesRuntimeBytecodeVersion0;
        return hermesRuntimeBytecodeVersion0;
    }

    public static boolean isHermesBytecode(byte[] bArr) {
        return isHermesBytecode0((byte[]) Objects.requireNonNull(bArr));
    }
}
