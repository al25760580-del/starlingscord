package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class m4 extends z1 {
    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean B(v4 v4Var, u4 u4Var, u4 u4Var2) {
        synchronized (v4Var) {
            try {
                if (v4Var.f6168i != u4Var) {
                    return false;
                }
                v4Var.f6168i = u4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void i(u4 u4Var, u4 u4Var2) {
        u4Var.f6149b = u4Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void r(u4 u4Var, Thread thread) {
        u4Var.f6148a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean t(v4 v4Var, k2 k2Var, k2 k2Var2) {
        synchronized (v4Var) {
            try {
                if (v4Var.f6167e != k2Var) {
                    return false;
                }
                v4Var.f6167e = k2Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean w(v4 v4Var, Object obj, Object obj2) {
        synchronized (v4Var) {
            try {
                if (v4Var.f6166d != obj) {
                    return false;
                }
                v4Var.f6166d = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
