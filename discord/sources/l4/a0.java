package l4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f14820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f14821b;

    public a0(i iVar) {
        this.f14820a = iVar;
        this.f14821b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        i iVar = this.f14820a;
        if (iVar != null && iVar.equals(a0Var.f14820a)) {
            return true;
        }
        Throwable th2 = this.f14821b;
        if (th2 == null || a0Var.f14821b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14820a, this.f14821b});
    }

    public a0(Throwable th2) {
        this.f14821b = th2;
        this.f14820a = null;
    }
}
