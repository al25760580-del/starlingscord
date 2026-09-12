package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f6021a;

    static {
        byte[] bArr = new byte[0];
        f6021a = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(int i7, int i10, int i11, byte[] bArr) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i7 = (i7 * 31) + bArr[i12];
        }
        return i7;
    }
}
