package bd;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3220c;

    public v(String str, boolean z5, boolean z6) {
        this.f3218a = str;
        this.f3219b = z5;
        this.f3220c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != v.class) {
            return false;
        }
        v vVar = (v) obj;
        return TextUtils.equals(this.f3218a, vVar.f3218a) && this.f3219b == vVar.f3219b && this.f3220c == vVar.f3220c;
    }

    public final int hashCode() {
        return ((a3.e.d(31, 31, this.f3218a) + (this.f3219b ? 1231 : 1237)) * 31) + (this.f3220c ? 1231 : 1237);
    }
}
