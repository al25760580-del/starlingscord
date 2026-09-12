package y0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f23128b;

    public e(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f23127a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f23128b = b.b(str);
        } else {
            this.f23128b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        String str = ((e) obj).f23127a;
        String str2 = this.f23127a;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f23127a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        sb2.append(this.f23127a.length() + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
