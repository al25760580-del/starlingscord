package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f428c;

    public f0(String str, boolean z5) {
        w.d(str);
        this.f426a = str;
        w.d("com.google.android.gms");
        this.f427b = "com.google.android.gms";
        this.f428c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return w.j(this.f426a, f0Var.f426a) && w.j(this.f427b, f0Var.f427b) && w.j(null, null) && this.f428c == f0Var.f428c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f426a, this.f427b, null, 4225, Boolean.valueOf(this.f428c)});
    }

    public final String toString() {
        String str = this.f426a;
        if (str != null) {
            return str;
        }
        w.g(null);
        throw null;
    }
}
