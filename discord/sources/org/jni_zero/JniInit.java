package org.jni_zero;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
@JNINamespace("jni_zero")
public class JniInit {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @CalledByNative
    private static void crashIfMultiplexingMisaligned(long j, long j5) {
        try {
            long j7 = Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j10 = Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j7 != j && j7 != j5 && j10 != j) {
                throw new RuntimeException("JNI Zero multiplexing hashes do not align. Native: " + j + " or " + j5 + " Java: " + j7 + " or " + j10);
            }
        } catch (ReflectiveOperationException unused) {
        }
    }

    @CalledByNative
    private static Object[] init() {
        return new Object[]{Collections.EMPTY_LIST, Collections.EMPTY_MAP};
    }
}
