package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends z1 {
    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean A(a1 a1Var, j0 j0Var, j0 j0Var2) {
        synchronized (a1Var) {
            try {
                if (a1Var.f6089e != j0Var) {
                    return false;
                }
                a1Var.f6089e = j0Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean E(p0 p0Var, Object obj, Object obj2) {
        synchronized (p0Var) {
            try {
                if (p0Var.f6088d != obj) {
                    return false;
                }
                p0Var.f6088d = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean G(p0 p0Var, o0 o0Var, o0 o0Var2) {
        synchronized (p0Var) {
            try {
                if (p0Var.f6090i != o0Var) {
                    return false;
                }
                p0Var.f6090i = o0Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final j0 e(a1 a1Var) {
        j0 j0Var;
        j0 j0Var2 = j0.f6023d;
        synchronized (a1Var) {
            try {
                j0Var = a1Var.f6089e;
                if (j0Var != j0Var2) {
                    a1Var.f6089e = j0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final o0 o(a1 a1Var) {
        o0 o0Var;
        o0 o0Var2 = o0.f6078c;
        synchronized (a1Var) {
            try {
                o0Var = a1Var.f6090i;
                if (o0Var != o0Var2) {
                    a1Var.f6090i = o0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void s(o0 o0Var, o0 o0Var2) {
        o0Var.f6080b = o0Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void v(o0 o0Var, Thread thread) {
        o0Var.f6079a = thread;
    }
}
