package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o1 {
    protected transient int zza;

    public abstract void a(v1 v1Var);

    public final byte[] b() {
        try {
            int iD = d();
            byte[] bArr = new byte[iD];
            v1 v1Var = new v1(bArr, iD);
            a(v1Var);
            v1Var.D();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(s0.g.e("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public abstract int c(x2 x2Var);

    public abstract int d();
}
