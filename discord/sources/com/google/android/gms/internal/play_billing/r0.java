package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, p0 p0Var, long j, Object obj, Object obj2) {
        while (!q0.a(unsafe, p0Var, j, obj, obj2)) {
            if (unsafe.getObject(p0Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
